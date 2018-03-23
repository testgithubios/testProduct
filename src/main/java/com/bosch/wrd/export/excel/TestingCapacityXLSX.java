package com.bosch.wrd.export.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;

import com.bosch.wrd.dto.TestingCapacityDetailDto;
import com.bosch.wrd.dto.TestingCapacityDto;
import com.bosch.wrd.util.ExcelUtil;

public class TestingCapacityXLSX extends BaseXLSX {

	private List<TestingCapacityDto> dtos;
	
	public TestingCapacityXLSX(List<TestingCapacityDto> dtos) {
		this.dtos = dtos;
	}
	
	@Override
	public InputStream render() throws IOException {
		sheet = wb.createSheet(ExcelUtil.TESTING_CAPACITY_SHEET_NAME);
		font = (XSSFFont) wb.createFont();
		font.setBold(true);
		font.setColor(IndexedColors.WHITE.index);
		
		row = sheet.createRow(0);
		
		buildHeader();
		
		int rowIndex = 1;
		for(TestingCapacityDto dto : dtos) {
			row = sheet.createRow(rowIndex);
			
			Cell projectName = row.createCell(0);
			projectName.setCellValue(dto.getProjectName());
			Cell hcpPjm = row.createCell(1);
			hcpPjm.setCellValue(dto.getHcpPjm());
			Cell tbpPjm = row.createCell(2);
			tbpPjm.setCellValue(dto.getTbpPjm());
			Cell plannedStartTime = row.createCell(3);
			plannedStartTime.setCellValue(dto.getPlannedStartTime());
			Cell plannedSOP = row.createCell(4);
			plannedSOP.setCellValue(dto.getPlannedSop());
			Cell plannedISR = row.createCell(5);
			plannedISR.setCellValue(dto.getPlannedIsr());
			Cell testLocation = row.createCell(6);
			testLocation.setCellValue(dto.getTestLocation());
			Cell kickOff = row.createCell(7);
			kickOff.setCellValue(dto.getKickOff() == true ? ExcelUtil.YES : ExcelUtil.NO);
			
			Cell date = null;
			int columnIndex = 8;
			TestingCapacityDetailDto[] testingDates = dto.getTestingDates();
			for (TestingCapacityDetailDto detailDto : testingDates) {
				date = row.createCell(columnIndex);
				date.setCellValue(detailDto.getValue());
				columnIndex++;
			}
			rowIndex++;
		}
		
		autoSizeColumns();

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		wb.write(out);
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	private void buildHeader() {
		cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(IndexedColors.BLUE.index);
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setFont(font);
		
		Cell projectName = row.createCell(0);
		projectName.setCellValue(ExcelUtil.PROJECT_NAME);
		projectName.setCellStyle(cellStyle);
		
		Cell hcpPjm = row.createCell(1);
		hcpPjm.setCellValue(ExcelUtil.HcP_PjM);
		hcpPjm.setCellStyle(cellStyle);
		
		Cell tbpPjm = row.createCell(2);
		tbpPjm.setCellValue(ExcelUtil.TbP_PjM);
		tbpPjm.setCellStyle(cellStyle);
		
		Cell plannedStartTime = row.createCell(3);
		plannedStartTime.setCellValue(ExcelUtil.PLANNED_START_TIME);
		plannedStartTime.setCellStyle(cellStyle);
		
		Cell plannedSOP = row.createCell(4);
		plannedSOP.setCellValue(ExcelUtil.PLANNED_SOP);
		plannedSOP.setCellStyle(cellStyle);
		
		Cell plannedISR = row.createCell(5);
		plannedISR.setCellValue(ExcelUtil.PLANNED_ISR);
		plannedISR.setCellStyle(cellStyle);
		
		Cell testLocation = row.createCell(6);
		testLocation.setCellValue(ExcelUtil.TEST_LOCATION);
		testLocation.setCellStyle(cellStyle);
		
		Cell kickOff = row.createCell(7);
		kickOff.setCellValue(ExcelUtil.KICK_OFF);
		kickOff.setCellStyle(cellStyle);
		
		Cell date = null;
		int columnIndex = 8;
		TestingCapacityDto dto = dtos.get(0);
		TestingCapacityDetailDto[] testingDates = dto.getTestingDates();
		for (TestingCapacityDetailDto detailDto : testingDates) {
			date = row.createCell(columnIndex);
			date.setCellValue(detailDto.getKey());
			date.setCellStyle(cellStyle);
			columnIndex++;
		}
	}

}
