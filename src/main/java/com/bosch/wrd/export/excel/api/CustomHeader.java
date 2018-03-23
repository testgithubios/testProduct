package com.bosch.wrd.export.excel.api;

import java.util.LinkedList;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFSheet;

public class CustomHeader {

	private LinkedList<CustomCell> headerRows;
	
	private int rowIndex;
	private CustomWorkbook workbook;
	
	public CustomHeader() {
		this.headerRows = new LinkedList<>();
		this.rowIndex = 0;
	}

	public CustomHeader(int rowIndex, CustomWorkbook workbook) {
		this.headerRows = new LinkedList<>();
		this.rowIndex = rowIndex;
		this.workbook = workbook;
	}

	public CustomHeader(LinkedList<CustomCell> headerRowss, int rowIndex, CustomWorkbook workbook) {
		this.headerRows = headerRowss;
		this.rowIndex = rowIndex;
		this.workbook = workbook;
	}
	
	public int getIndexOf(String name) {
        if(headerRows != null) {
            for(CustomCell cell : headerRows) {
                if(cell.getColumnIndex()
                        .equals(name)) {
                    return headerRows.indexOf(cell);
                }
            }
        }
        return 0;
    }
	
	public void addCell(String name, String label) {
		headerRows.add(new CustomCell(name, label, IndexedColors.WHITE, workbook));
	}
	
	public void addCell(String name, String label, IndexedColors color) {
		headerRows.add(new CustomCell(name, label, color, workbook));
	}
	
	public void addCell(String name, String label, IndexedColors background, IndexedColors font) {
		headerRows.add(new CustomCell(name, label, background, font, workbook));
	}

	public void addCell(String name, String label, int size, SXSSFSheet sheet) {
		setColumnSize(size, sheet, label);
		CustomCell cell = new CustomCell(name, label,IndexedColors.WHITE, workbook);
		headerRows.add(cell);
	}

	public void addCell(String name, String label, int size, IndexedColors color, SXSSFSheet sheet) {
		setColumnSize(size, sheet, label);
		CustomCell cell = new CustomCell(name, label, color, workbook);
		headerRows.add(cell);
	}
	
	public void addCellBefore(String name, String label, IndexedColors color, String beforeColumnName) {
		CustomCell cell = new CustomCell(name, label, color, workbook);
		
		// Find the cell to insert before
        int index = getIndexOf(beforeColumnName);
        headerRows.add(index, cell);
	}

	private void setColumnSize(int size, SXSSFSheet sheet, String label) {
		int index = getIndexOf(label);
		if (index > -1) {
			sheet.setColumnWidth(index, size);
		}
	}

	public LinkedList<CustomCell> getheaderRows() {
		return headerRows;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	
	public void mergeCells(SXSSFSheet sheet, int...params) {
		sheet.addMergedRegion(new CellRangeAddress(params[0], params[1], params[2], params[3]));
	}
}
