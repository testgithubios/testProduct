package com.bosch.wrd.export.excel.api;

import java.util.ArrayList;
import java.util.List;

public class CustomRow {

	List<CustomCell> cells;

	public CustomRow() {
		cells = new ArrayList<>();
	}
	
	public void addCell(CustomCell cell) {
		cells.add(cell);
	}

	public List<CustomCell> getCells() {
		return cells;
	}

	public void setCells(List<CustomCell> cells) {
		this.cells = cells;
	}
	
}
