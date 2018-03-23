package com.bosch.wrd.export.excel.milestone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.bosch.wrd.dto.ReleasesDto;
import com.bosch.wrd.export.excel.api.CustomCell;
import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomRow;
import com.bosch.wrd.export.excel.api.CustomWorkbook;

public class MilestoneRowsBuilder {

	private final CustomWorkbook custom_workbook;
	private int rowIndex;
	private Map<CustomHeader, List<CustomRow>> mapHeader;

	public MilestoneRowsBuilder(CustomWorkbook workbook) {
		this.custom_workbook = workbook;
		this.mapHeader = new HashMap<>(0);
		this.rowIndex = 0;
	}

	public CustomWorkbook build(Map<String, LinkedList<ReleasesDto>> map) {
		for (Entry<String, LinkedList<ReleasesDto>> entry : map.entrySet()) {
			buildSubHeader(entry.getKey(), entry.getValue());
		}

		custom_workbook.setMapHeader(mapHeader);
		return custom_workbook;
	}

	private void buildSubHeader(String textHeader, LinkedList<ReleasesDto> lst) {
		CustomHeader header = new SubHeader1(rowIndex, custom_workbook);
		rowIndex++;

		CustomHeader header2 = new SubHeader2(rowIndex, custom_workbook);
		mapHeader.put(header, (List<CustomRow>) header2);
		rowIndex++;
		//mapHeader.put(header2, buildData(lst));
	}

	private List<Row> buildData(LinkedList<ReleasesDto> lst) {
		List<Row> rows = new ArrayList<>();
		int id = 1;
		for (ReleasesDto dto : lst) {

			id++;
			rowIndex++;
		}
		return rows;
	}

	// Example to modify an existing excel file
	private void modifyExistingWorkbook() throws InvalidFormatException, IOException {

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("workbook.xlsm").getFile());
		InputStream inp = new FileInputStream(file);
		
		// Obtain a workbook from the excel file
		Workbook workbook = WorkbookFactory.create(inp);

		// Get Sheet at index 1
		Sheet sheet = workbook.getSheetAt(1);

		// Get Row at index 1
		Row row = sheet.getRow(4);

		row.forEach(cell -> {
			// Update the cell's value
			row.getCell(1).setCellValue("Updated Value");
		});

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("Rel_WDB_Jatco_template.xlsm");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
	}
}
