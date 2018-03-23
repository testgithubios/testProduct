package com.bosch.wrd.export.excel.portfolio;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.util.ExcelUtil;

public class SubHeader extends CustomHeader {
	
	public SubHeader(int rowIndex, CustomWorkbook workbook, String textHeader) {
		super(rowIndex, workbook);
		
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 1, 11);
		
		for (int i = 0; i < 11; i++) {
			if (i == 0)
				addCell(textHeader, ExcelUtil.BLANK, IndexedColors.AQUA, IndexedColors.WHITE);
			else
				addCell(ExcelUtil.BLANK, ExcelUtil.BLANK, IndexedColors.AQUA, IndexedColors.WHITE);
		}
	}

}
