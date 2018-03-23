package com.bosch.wrd.export.excel.milestone;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.util.ExcelUtil;

public class SubHeader1 extends CustomHeader {

	public SubHeader1(int rowIndex, CustomWorkbook workbook) {
		super(rowIndex, workbook);

		addCell("1", String.valueOf(rowIndex));
		addCell(ExcelUtil.FULL_PRO, ExcelUtil.FULL_PRO);
		addCell(ExcelUtil.PPDR, ExcelUtil.PPDR);
		addCell(ExcelUtil.DR, ExcelUtil.DR);

		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 4, 5);
		addCell(ExcelUtil.PRIO, ExcelUtil.PRIO,
				IndexedColors.LIME); /* merge cell 4,5 */

		addCell("", "", IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.SOP, ExcelUtil.SOP, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.SUB_TOTAL, ExcelUtil.SUB_TOTAL, IndexedColors.LIGHT_TURQUOISE);
		addCell("", "", IndexedColors.GREEN);
		addCell(ExcelUtil.DATE_K2, ExcelUtil.DATE_K2, IndexedColors.YELLOW1);
		addCell("", "", IndexedColors.LIGHT_GREEN);
		addCell("", "", IndexedColors.LIGHT_GREEN);
		addCell("", "", IndexedColors.LIGHT_GREEN);
		addCell("", "", IndexedColors.LIGHT_GREEN);
		addCell("", "", IndexedColors.LIGHT_GREEN);
		/* cell 18-44 */
		for (int i = 18; i < 45; i++) {
			addCell(String.valueOf(i), String.valueOf(i), IndexedColors.LIGHT_GREEN);
		}
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 45, 46);
		addCell(ExcelUtil.BOSCH_MAINTENANCE, ExcelUtil.BOSCH_MAINTENANCE, IndexedColors.LIGHT_GREEN);

		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 47, 59);
		addCell(ExcelUtil.DR_STATUS, ExcelUtil.DR_STATUS, IndexedColors.LIGHT_GREEN, IndexedColors.RED);

		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 60, 67);
		addCell("", "", IndexedColors.LIGHT_GREEN);

		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 68, 85);
		addCell(ExcelUtil.JATCO_MAINTENACE, ExcelUtil.JATCO_MAINTENACE, IndexedColors.LIGHT_GREEN);

		rowIndex++;

	}

}
