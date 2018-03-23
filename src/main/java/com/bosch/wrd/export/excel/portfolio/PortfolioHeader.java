package com.bosch.wrd.export.excel.portfolio;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomWorkbook;

public class PortfolioHeader extends CustomHeader {

	public static final String NO = "No.";
	public static final String VERSION = "Version\n (MM.YY)";
	public static final String PROJECT_NAME = "Project name";
	public static final String CUSTOMER = "Customer";
	public static final String PLANNED_SOP = "Planned SOP\n (MM.YYYY)";
	public static final String DISPATCH = "Dispatch from HcP site\n (DD.MM.YYYY)";
	public static final String LAST_QUALITY_GATE = "Last Quality Gate";
	public static final String PGL = "PGL";
	public static final String PIA = "PIA \n (MM.YYYY)";
	public static final String SCOPE = "Scope short description";
	public static final String REMARK = "Remark for Closed projects";
	public static final String ALELLL = "AlElLl";
	
	public PortfolioHeader(int rowIndex, CustomWorkbook workbook) {
		super(rowIndex, workbook);
		
		addCell(NO, NO, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(VERSION, VERSION, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(PROJECT_NAME, PROJECT_NAME, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(CUSTOMER, CUSTOMER, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(PLANNED_SOP, PLANNED_SOP, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(DISPATCH, DISPATCH, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(LAST_QUALITY_GATE, LAST_QUALITY_GATE, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(PGL, PGL, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(PIA, PIA, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(SCOPE, SCOPE, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(REMARK, REMARK, IndexedColors.BLUE, IndexedColors.WHITE);
		addCell(ALELLL, ALELLL, IndexedColors.BLUE, IndexedColors.WHITE);
	}
	
}
