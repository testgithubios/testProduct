package com.bosch.wrd.export.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;

import com.bosch.wrd.dto.LessonsLearnedDto;
import com.bosch.wrd.util.ExcelUtil;

public class LessonsLearnedXLSX extends BaseXLSX {

	private List<LessonsLearnedDto> dtos;

	public LessonsLearnedXLSX(List<LessonsLearnedDto> dtos) {
		this.dtos = dtos;
	}

	public InputStream render() throws IOException {
		sheet = wb.createSheet(ExcelUtil.LESSON_LEARNED_SHEET_NAME);
		font = (XSSFFont) wb.createFont();
		font.setBold(true);
		
		row = sheet.createRow(0);

		buildHeader();

		int rowIndex = 1;
		for (LessonsLearnedDto dto : dtos) {
			row = sheet.createRow(rowIndex);
			
			Cell number = row.createCell(0);
			number.setCellValue(rowIndex);
			Cell category = row.createCell(1);
			category.setCellValue(dto.getCategory());
			Cell problem = row.createCell(2);
			problem.setCellValue(dto.getProblemDescription());
			Cell root = row.createCell(3);
			root.setCellValue(dto.getRootCause());
			Cell lesson = row.createCell(4);
			lesson.setCellValue(dto.getLessonLearned());
			Cell who = row.createCell(5);
			who.setCellValue(dto.getWhoShouldGetInform());
			Cell tranfer = row.createCell(6);
			tranfer.setCellValue(dto.getTransferable() == true ? ExcelUtil.YES : ExcelUtil.NO);
			
			CellStyle cellStyle2 = wb.createCellStyle();
			cellStyle2.setFillForegroundColor(IndexedColors.ORANGE.index);
			cellStyle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			tranfer.setCellStyle(dto.getTransferable() == true ? cellStyle : cellStyle2);
			Cell action = row.createCell(7);
			action.setCellValue(dto.getActionForEl7());

			rowIndex++;
		}

		autoSizeColumns();

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		wb.write(out);
		return new ByteArrayInputStream(out.toByteArray());
	}

	private void buildHeader() {
		cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(IndexedColors.GREEN.index);
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setFont(font);

		Cell number = row.createCell(0);
		number.setCellValue(ExcelUtil.NUMBER);
		number.setCellStyle(cellStyle);

		Cell category = row.createCell(1);
		category.setCellValue(ExcelUtil.CATEGORY);
		category.setCellStyle(cellStyle);

		Cell problem = row.createCell(2);
		problem.setCellValue(ExcelUtil.PROBLEM_DESC);
		problem.setCellStyle(cellStyle);

		Cell root = row.createCell(3);
		root.setCellValue(ExcelUtil.ROOT_CAUSES);
		root.setCellStyle(cellStyle);

		Cell lesson = row.createCell(4);
		lesson.setCellValue(ExcelUtil.LESSON_LEARNED);
		lesson.setCellStyle(cellStyle);

		Cell who = row.createCell(5);
		who.setCellValue(ExcelUtil.WHO_SHOULD_GET_INFR);
		who.setCellStyle(cellStyle);

		Cell tranfer = row.createCell(6);
		tranfer.setCellValue(ExcelUtil.TRANFERABLE);
		tranfer.setCellStyle(cellStyle);

		Cell action = row.createCell(7);
		action.setCellValue(ExcelUtil.ACTION_FOR_EL7);
		action.setCellStyle(cellStyle);

	}

}
