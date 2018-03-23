package com.bosch.wrd.export.excel.milestone;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.util.ExcelUtil;

public class MilestoneHeader extends CustomHeader {

	public MilestoneHeader(int rowIndex, CustomWorkbook workbook) {
		super(rowIndex, workbook);
		addCell(ExcelUtil.HEADER_J, ExcelUtil.HEADER_J);
		addCell(ExcelUtil.HEADER_J, ExcelUtil.HEADER_J);
		addCell(ExcelUtil.HEADER_J, ExcelUtil.HEADER_J);
		addCell(ExcelUtil.HEADER_B, ExcelUtil.HEADER_B, IndexedColors.GOLD );
		
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 4, 8);
		addCell(ExcelUtil.HEADER_LINK_MFC, ExcelUtil.HEADER_LINK_MFC, IndexedColors.LIGHT_TURQUOISE);
		
		addCell(ExcelUtil.HEADER_B, ExcelUtil.HEADER_B, IndexedColors.GOLD );
		
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 10, 15);
		addCell(ExcelUtil.HEADER_LINK_MFC, ExcelUtil.HEADER_LINK_MFC, IndexedColors.LIGHT_TURQUOISE);

		for (int i = 0 ; i<28; i++){
			addCell(ExcelUtil.HEADER_B, String.valueOf(i), IndexedColors.GOLD );
		}
		
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 45, 46);
		addCell(ExcelUtil.HEADER_LINK_MFC, ExcelUtil.HEADER_LINK_MFC, IndexedColors.LIGHT_TURQUOISE);
		
		for (int i = 0 ; i<14; i++){
			addCell(ExcelUtil.HEADER_B, String.valueOf(i), IndexedColors.GOLD );
		}
		
		addCell(ExcelUtil.HEADER_LINK_MFC, ExcelUtil.HEADER_LINK_MFC, IndexedColors.LIGHT_TURQUOISE);
		addCell(ExcelUtil.HEADER_B, ExcelUtil.HEADER_B, IndexedColors.GOLD );
		
		mergeCells(workbook.getSheet(), rowIndex, rowIndex, 62, 65);
		addCell(ExcelUtil.HEADER_LINK_MFC, ExcelUtil.HEADER_LINK_MFC, IndexedColors.LIGHT_TURQUOISE);
		
		for (int i = 0 ; i<21; i++){
			addCell(ExcelUtil.HEADER_J, String.valueOf(i));
		}
	}

}
