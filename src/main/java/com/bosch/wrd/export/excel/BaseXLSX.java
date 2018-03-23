package com.bosch.wrd.export.excel;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class BaseXLSX {

	protected Workbook wb = null;
	protected Row row = null;
	protected Sheet sheet = null;
	protected CellStyle cellStyle = null;
	protected XSSFFont font = null;

	public BaseXLSX() {
		wb = new XSSFWorkbook();
	}

	public abstract InputStream render() throws IOException;

	protected void autoSizeColumns() {
		for (short i = sheet.getRow(0).getFirstCellNum(), end = sheet.getRow(0).getLastCellNum(); i < end; i++) {
			sheet.autoSizeColumn(i);
		}
	}
}
