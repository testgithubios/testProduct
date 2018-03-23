package com.bosch.wrd.export.excel.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class CustomWorkbook {

	private CustomHeader header;
	private List<CustomRow> rows;
	private List<CustomRow> rowsBeforeHeader;
	private SXSSFWorkbook wb;
	private SXSSFSheet sheet;
	private Map<ExcelStyle, CellStyle> mapStyle;
	private Map<CustomHeader, List<CustomRow>> mapHeader;
	
	public CustomWorkbook(SXSSFWorkbook wb, SXSSFSheet sheet) {
		this.wb = wb;
		this.sheet = sheet;
		
		mapStyle = new HashMap<>();
	}

	public CustomHeader getHeader() {
		return header;
	}

	public List<CustomRow> getRows() {
		return rows;
	}

	public List<CustomRow> getRowsBeforeHeader() {
		return rowsBeforeHeader;
	}

	public SXSSFWorkbook getWb() {
		return wb;
	}

	public SXSSFSheet getSheet() {
		return sheet;
	}

	public Map<ExcelStyle, CellStyle> getMapStyle() {
		return mapStyle;
	}
	
	public Map<CustomHeader, List<CustomRow>> getMapHeader() {
		return mapHeader;
	}

	public void setHeader(CustomHeader header) {
		this.header = header;
	}

	public void setRows(List<CustomRow> rows) {
		this.rows = rows;
	}

	public void setRowsBeforeHeader(List<CustomRow> rowsBeforeHeader) {
		this.rowsBeforeHeader = rowsBeforeHeader;
	}

	public void setWb(SXSSFWorkbook wb) {
		this.wb = wb;
	}

	public void setSheet(SXSSFSheet sheet) {
		this.sheet = sheet;
	}

	public void setMapStyle(Map<ExcelStyle, CellStyle> mapStyle) {
		this.mapStyle = mapStyle;
	}
	
	public void setMapHeader(Map<CustomHeader, List<CustomRow>> mapHeader2) {
		this.mapHeader = mapHeader2;
	}
}
