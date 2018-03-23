package com.bosch.wrd.export.excel.portfolio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.dto.PortfolioDto;
import com.bosch.wrd.export.excel.api.CustomCell;
import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomRow;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.util.ExcelUtil;

public class PortfolioRowsBuilder {
	
	private final CustomWorkbook workbook;
	private int rowIndex;
	private Map<CustomHeader, List<CustomRow>> mapHeader;

	public PortfolioRowsBuilder(CustomWorkbook workbook) {
		this.workbook = workbook;
		this.mapHeader = new HashMap<>(0);
		this.rowIndex = 0;
	}
	
	public CustomWorkbook build(Map<String, List<PortfolioDto>> map) {
		workbook.setHeader(new PortfolioHeader(rowIndex, workbook));
		rowIndex++;
		
		for (Map.Entry<String, List<PortfolioDto>> entry : map.entrySet()) {
			buildSubHeader(entry.getKey(), entry.getValue());
		}
		
		workbook.setMapHeader(mapHeader);
		return workbook;
	}
	
	private void buildSubHeader(String textHeader, List<PortfolioDto> lst) {
		CustomHeader header = new SubHeader(rowIndex, workbook, textHeader);
		rowIndex++;
		
		mapHeader.put(header, buildData(lst));
	}
	
	private List<CustomRow> buildData(List<PortfolioDto> lst) {
		List<CustomRow> rows = new ArrayList<>();
		int id = 0;
		for (PortfolioDto dto : lst) {
			List<CustomCell> cells = new ArrayList<>();
			cells.add(new CustomCell(String.valueOf(id), 0));
			cells.add(new CustomCell(dto.getVersion(), 1));
			cells.add(new CustomCell(dto.getProjectName(), 2));
			cells.add(new CustomCell(dto.getCustomer(), 3));
			cells.add(new CustomCell(dto.getPlannedSop(), 4));
			cells.add(new CustomCell(dto.getDispatchFromHcpSite(), 5));
			cells.add(new CustomCell(dto.getLastQualityGate(), 6));
			
			if (dto.getPgl() != null && dto.getPgl().equals(ExcelUtil.PGL))
				cells.add(new CustomCell(dto.getPgl(), 7, IndexedColors.BLUE, workbook));
			else
				cells.add(new CustomCell(dto.getPgl(), 7, workbook));

			cells.add(new CustomCell(dto.getPia(), 8));
			cells.add(new CustomCell(dto.getScopeShortDesc(), 9));
			cells.add(new CustomCell(dto.getRemarkForClosedProject(), 10));
			cells.add(new CustomCell(dto.getAlElLl(), 11));

			CustomRow row = new CustomRow();
			row.setCells(cells);
			rows.add(row);
			
			id++;
			rowIndex++;
		}
		return rows;
	}
}
