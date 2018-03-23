package com.bosch.wrd.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bosch.wrd.dao.ECRImportRepository;
import com.bosch.wrd.dao.ReleaseRepository;
import com.bosch.wrd.entity.entityImpl.Releases;

@RestController
@RequestMapping(value = "/api/ecr")
public class ECRImportService {

	@Autowired
	private ECRImportRepository ecrImportRepo;

	@Autowired
	private ReleaseRepository releaseRepository;

	@Autowired
	StorageService storageService;

	List<String> files = new ArrayList<String>();

	private static final Logger logger = LoggerFactory.getLogger(ECRImportService.class);

	private static String UPLOADED_FOLDER = "C://temp//";

	@CrossOrigin
	@PostMapping(value ="/uploadExcelFile", consumes = "multipart/form-data", produces = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile uploadfile) {

		logger.debug("Single file upload!");

		if (uploadfile.isEmpty()) {
			return new ResponseEntity("please select a file!", HttpStatus.OK);
		}

		try {

			saveUploadedFiles(Arrays.asList(uploadfile));
			fillECRData(uploadfile);

		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}

		return new ResponseEntity("Successfully uploaded - " + uploadfile.getOriginalFilename(), new HttpHeaders(),
				HttpStatus.OK);

	}

	// save file
	private void saveUploadedFiles(List<MultipartFile> files) throws IOException, InvalidFormatException {

		for (MultipartFile file : files) {

			if (file.isEmpty()) {
				continue; // next pls
			}

			byte[] bytes = file.getBytes();

			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		}
	}

	public void fillECRData(MultipartFile excelFile) throws IOException, InvalidFormatException {

		logger.debug("Start parsing the Excel File to DB");

		try {
			List<Releases> exportList = new ArrayList<Releases>();

			// FileInputStream file = new FileInputStream(new File(FILE_NAME));
			// Creating a Workbook from an Excel file (.xls or .xlsx)
			//Workbook workbook = WorkbookFactory.create(new File(excelFile));
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile.getInputStream());

			// Retrieving the number of sheets in the Workbook
			logger.debug("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

			/*
			 * Iterating over all the rows and columns in a Sheet
			 * ===================================================
			 */
			int numberOfSheets = workbook.getNumberOfSheets();
			// looping over each workbook sheet
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				// DataFormatter dataFormatter = new DataFormatter();
				Iterator<Row> rowIterator = sheet.rowIterator();
				List<Releases> releases = releaseRepository.getListReleases();
				for (Releases rel : releases){
					
					if(null == rel.getEcrNr()){
						continue;
					}
					for (Row row: sheet) {
						//Row row = rowIterator.next();
	
						// Now let's iterate over the columns of the current row
						// Iterator<Cell> cellIterator = row.cellIterator();
						// just skip the rows if row number is 0 or null
						if (row.getRowNum() == 0) {
							continue;
						}
						if (isRowBlank(row) == true) {
							workbook.close();
						}
	
						// get column 'Notification' in Excel file
						String noti = row.getCell(0).getStringCellValue();
	
						System.out.println(noti + " - rel "+ rel.getEcrNr());
						
						if (noti.equalsIgnoreCase(rel.getEcrNr())){
							
							rel.setEcrStatus(Integer.parseInt(getCellValueAsString(row.getCell(2))));
						}
						System.out.println("ffffff");
						
						exportList.add(rel);
						//break;
					};
				}
				ecrImportRepo.save(exportList);
				System.out.println("Successfully write down: " + sheet.getPhysicalNumberOfRows() + " rows");
				logger.debug("---DONE---");
			}
			// Closing the workbook
			workbook.close();
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	public static String getCellValueAsString(Cell cell) {
        String strCellValue = null;
        if (cell != null) {
            switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                strCellValue = cell.toString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "dd/MM/yyyy");
                    strCellValue = dateFormat.format(cell.getDateCellValue());
                } else {
                    Double value = cell.getNumericCellValue();
                    Long longValue = value.longValue();
                    strCellValue = new String(longValue.toString());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                strCellValue = new String(new Boolean(
                        cell.getBooleanCellValue()).toString());
                break;
            case Cell.CELL_TYPE_BLANK:
                strCellValue = "";
                break;
            }
        }
        return strCellValue;
    }
	
	private boolean isRowBlank(Row r) {
		boolean ret = true;

		/*
		 * If a row is null, it must be blank.
		 */
		if (r != null) {
			Iterator<Cell> cellIter = r.cellIterator();
			/*
			 * Iterate through all cells in a row.
			 */
			while (cellIter.hasNext()) {
				/*
				 * If one of the cells in given row contains data, the row is
				 * considered not blank.
				 */
				if (!this.isCellBlank(cellIter.next())) {
					ret = false;
					break;
				}
			}
		}

		return ret;
	}

	private boolean isCellBlank(Cell c) {
		return (c == null || c.getCellType() == Cell.CELL_TYPE_BLANK);
	}

	private static String renderColor(Color color) {
		if (color instanceof HSSFColor) {
			return ((HSSFColor) color).getHexString();
		} else if (color instanceof XSSFColor) {
			return ((XSSFColor) color).getARGBHex();
		} else {
			return "(none)";
		}
	}
}
