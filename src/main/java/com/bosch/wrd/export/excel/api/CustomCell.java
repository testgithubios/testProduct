package com.bosch.wrd.export.excel.api;

import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class CustomCell {

	public static final int DEFAULT_SIZE = 6000;
	private String value;
    private String columnIndex;
    private int customIndex;
    private boolean hasColour;
    private int size;
	private CellStyle cellStyle;
	private CustomWorkbook workbook;
	
	public CustomCell(String value, int customIndex) {
    	this.value = value;
    	this.customIndex = customIndex;
    	this.size = DEFAULT_SIZE;
    }
	
	public CustomCell(String value, int customIndex, CustomWorkbook workbook) {
    	this.value = value;
    	this.customIndex = customIndex;
    	this.size = DEFAULT_SIZE;
    	this.workbook = workbook;
    	this.cellStyle = defaultCellStyle(IndexedColors.WHITE, null);
    }
	
	public CustomCell(String value, int customIndex, IndexedColors color, CustomWorkbook workbook) {
    	this.value = value;
    	this.customIndex = customIndex;
    	this.hasColour = true;
    	this.size = DEFAULT_SIZE;
    	this.workbook = workbook;
    	this.cellStyle = defaultCellStyle(color, null);
    }
	
	public CustomCell(String value, String columnIndex, CustomWorkbook workbook) {
		this.value = value;
		this.columnIndex = columnIndex;
		this.workbook = workbook;
		this.size = DEFAULT_SIZE;
		this.workbook = workbook;
		this.cellStyle = defaultCellStyle(IndexedColors.WHITE, null);
	}

	public CustomCell(String value, String columnIndex, IndexedColors color, CustomWorkbook workbook) {
		this.value = value;
		this.columnIndex = columnIndex;
		this.workbook = workbook;
		this.hasColour = true;
		this.size = DEFAULT_SIZE;
		this.cellStyle = defaultCellStyle(color, null);
	}
	
	public CustomCell(String value, String columnIndex, IndexedColors background, IndexedColors font, CustomWorkbook workbook) {
		this.value = value;
		this.columnIndex = columnIndex;
		this.workbook = workbook;
		this.hasColour = true;
		this.size = DEFAULT_SIZE;
    	this.cellStyle = defaultCellStyle(background, font);
	}
	
	public CustomCell(String value, String columnIndex, IndexedColors color) {
    	this.value = value;
    	this.columnIndex = columnIndex;
    	this.hasColour = true;
    	this.size = DEFAULT_SIZE;
    	this.cellStyle = defaultCellStyle(color, null);
    }
	
	private CellStyle defaultCellStyle(IndexedColors background, IndexedColors fontColor) {
		ExcelStyle style = new ExcelStyle(background.index, 
				FillPatternType.SOLID_FOREGROUND, true, "Arial", (short) 10);
		
		Map<ExcelStyle, CellStyle> mapStyle = workbook.getMapStyle();
		CellStyle cellStyle = mapStyle.entrySet().stream()
				.filter(m -> m.getKey().equals(style))
				.map(m -> m.getValue()).findAny().orElse(null);
		
		if (cellStyle == null) {
			Font font = workbook.getWb().createFont();
			font.setFontName(style.getFontName());
			font.setFontHeightInPoints(style.getFontHeight());
			
			if (fontColor != null) {
				font.setColor(fontColor.index);
				font.setBold(true);
			}
			
			cellStyle = workbook.getWb().createCellStyle();
			cellStyle.setFont(font);
			cellStyle.setFillForegroundColor(style.getColor());
			cellStyle.setFillPattern(style.getFillPattern());
			cellStyle.setWrapText(style.isWrapText());
			workbook.getMapStyle().put(style, cellStyle);
		}
		return cellStyle;
	}
	
	public void setBackground(short color) {
    	cellStyle.setFillForegroundColor(color);
    	cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }

	public boolean isHasColour() {
		return hasColour;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(String columnIndex) {
		this.columnIndex = columnIndex;
	}

	public int getCustomIndex() {
		return customIndex;
	}

	public void setCustomIndex(int customIndex) {
		this.customIndex = customIndex;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public CellStyle getCellStyle() {
		return cellStyle;
	}

	public void setCellStyle(CellStyle cellStyle) {
		this.cellStyle = cellStyle;
	}
}
