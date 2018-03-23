package com.bosch.wrd.export.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.bosch.wrd.dto.ReleasesDto;

public class MilestoneXLSX extends BaseXLSX {

	private List<ReleasesDto> dtos;

	public MilestoneXLSX(List<ReleasesDto> dtos) {
		this.dtos = dtos;
	}

	public InputStream render() throws IOException {
		/*
		 * sheet = wb.createSheet(ExcelUtil.MILESTONE_SHEET_NAME); font =
		 * (XSSFFont) wb.createFont(); font.setBold(true);
		 * 
		 * row = sheet.createRow(4);
		 */

		// buildHeader();

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("workbook1.xlsm").getFile());
		InputStream inp = new FileInputStream(file);

		// Obtain a workbook from the excel file
		try {
			wb = WorkbookFactory.create(inp);
			// Get Sheet at index 1
			Sheet sheet = wb.getSheetAt(1);

			// Get Row at index 3
			// Row row = sheet.getRow(3);

			int lastRowIndex = sheet.getLastRowNum();
			// row = sheet.createRow(rowIndex);
			for (ReleasesDto dto : dtos) {
				for (int i = 3; i <= sheet.getLastRowNum(); i++) {
					if (sheet.getRow(i) == null){
						continue;
					}else{
						if (sheet.getRow(i).getCell(6) != null) {
							// create new row
							row = sheet.createRow(lastRowIndex + 1);

							Cell number = row.createCell(0);
							number.setCellValue(lastRowIndex);
							Cell npcr = row.createCell(4);
							npcr.setCellValue(dto.getNpcrInitial());

							Cell pswa = row.createCell(5);
							pswa.setCellValue(dto.getPswaActual());

							Cell nr = row.createCell(6);
							nr.setCellValue(dto.getNr());

							Cell sop = row.createCell(7);
							sop.setCellValue(dto.getRbSopActual());

							Cell belt = row.createCell(8);
							belt.setCellValue(dto.getBelt());

							Cell change = row.createCell(10);
							change.setCellValue(dto.getDescriptionChange());

							Cell loc = row.createCell(11);
							// loc.setCellValue(dto.getLocations().toString());

							Cell line = row.createCell(12);
							line.setCellValue(dto.getLine());

							Cell cusPlant = row.createCell(13);
							// cusPlant.setCellValue(dto.getObjCustomerPlant().toString());

							Cell jatco = row.createCell(14);
							jatco.setCellValue(dto.getJatcoReleaseMeth());

							Cell mqs = row.createCell(15);
							mqs.setCellValue(dto.getMqs());

							Cell npcs = row.createCell(43);
							npcs.setCellValue(dto.getNpcsActual());

							Cell npcr2 = row.createCell(44);
							npcr2.setCellValue(dto.getNpcrActual());

							Cell risk = row.createCell(52);
							risk.setCellValue(dto.getRiskReviewActual());

							Cell pdr0 = row.createCell(53);
							pdr0.setCellValue(dto.getPdr0Actual());

							Cell pdr1 = row.createCell(54);
							pdr1.setCellValue(dto.getPdr01Actual());

							Cell pdr2 = row.createCell(55);
							pdr2.setCellValue(dto.getPdr2Actual());

							Cell pdr3 = row.createCell(56);
							pdr3.setCellValue(dto.getPdr3Actual());

							Cell pdr5 = row.createCell(57);
							pdr5.setCellValue(dto.getPdr5Actual());

							Cell isr = row.createCell(58);
							isr.setCellValue(dto.getIsrActual());

							Cell masterBelt = row.createCell(59);
							masterBelt.setCellValue(dto.getMasterBeltActual());

							Cell psws = row.createCell(60);
							psws.setCellValue(dto.getPswsActual());

							Cell pswa2 = row.createCell(61);
							pswa2.setCellValue(dto.getPswaActual());

							Cell sop2 = row.createCell(62);
							sop2.setCellValue(dto.getRbSopActual());
							++lastRowIndex;
						} else if (sheet.getRow(i).getCell(6) != null && sheet.getRow(i).getCell(6).equals(dto.getNr())) {
							//update
							Cell npcr = row.createCell(4);
							npcr.setCellValue(dto.getNpcrInitial());

							Cell pswa = row.createCell(5);
							pswa.setCellValue(dto.getPswaActual());

							Cell nr = row.createCell(6);
							nr.setCellValue(dto.getNr());

							Cell sop = row.createCell(7);
							sop.setCellValue(dto.getRbSopActual());

							Cell belt = row.createCell(8);
							belt.setCellValue(dto.getBelt());

							Cell change = row.createCell(10);
							change.setCellValue(dto.getDescriptionChange());

							Cell loc = row.createCell(11);
							// loc.setCellValue(dto.getLocations().toString());

							Cell line = row.createCell(12);
							line.setCellValue(dto.getLine());

							Cell cusPlant = row.createCell(13);
							// cusPlant.setCellValue(dto.getObjCustomerPlant().toString());

							Cell jatco = row.createCell(14);
							jatco.setCellValue(dto.getJatcoReleaseMeth());

							Cell mqs = row.createCell(15);
							mqs.setCellValue(dto.getMqs());

							Cell npcs = row.createCell(43);
							npcs.setCellValue(dto.getNpcsActual());

							Cell npcr2 = row.createCell(44);
							npcr2.setCellValue(dto.getNpcrActual());

							Cell risk = row.createCell(52);
							risk.setCellValue(dto.getRiskReviewActual());

							Cell pdr0 = row.createCell(53);
							pdr0.setCellValue(dto.getPdr0Actual());

							Cell pdr1 = row.createCell(54);
							pdr1.setCellValue(dto.getPdr01Actual());

							Cell pdr2 = row.createCell(55);
							pdr2.setCellValue(dto.getPdr2Actual());

							Cell pdr3 = row.createCell(56);
							pdr3.setCellValue(dto.getPdr3Actual());

							Cell pdr5 = row.createCell(57);
							pdr5.setCellValue(dto.getPdr5Actual());

							Cell isr = row.createCell(58);
							isr.setCellValue(dto.getIsrActual());

							Cell masterBelt = row.createCell(59);
							masterBelt.setCellValue(dto.getMasterBeltActual());

							Cell psws = row.createCell(60);
							psws.setCellValue(dto.getPswsActual());

							Cell pswa2 = row.createCell(61);
							pswa2.setCellValue(dto.getPswaActual());

							Cell sop2 = row.createCell(62);
							sop2.setCellValue(dto.getRbSopActual());

							/*
							 * CellStyle cellStyle2 = wb.createCellStyle();
							 * cellStyle2.setFillForegroundColor(IndexedColors.
							 * ORANGE.index) ;
							 * cellStyle2.setFillPattern(FillPatternType.
							 * SOLID_FOREGROUND); tranfer.setCellStyle(dto.() ==
							 * true ? cellStyle : cellStyle2); Cell action =
							 * row.createCell(7); action.setCellValue(dto.());
							 */

						}
					}

				}

			}

			// autoSizeColumns();
		} catch (EncryptedDocumentException | InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		wb.write(out);
		return new ByteArrayInputStream(out.toByteArray());
	}

}
