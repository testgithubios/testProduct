package com.bosch.wrd.export.excel.api;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

public class ExcelWriter {
	
	private SXSSFWorkbook book;
	private SXSSFSheet sheet;
	private CustomHeader header;
	private int rowNo;
	
	public ExcelWriter() {
		rowNo = 0;
	}

	public ByteArrayInputStream createExcelFile(CustomWorkbook workbook) throws IOException {
        book = workbook.getWb();
        sheet = workbook.getSheet();
        header = workbook.getHeader();

        // Rows start after the header
        rowNo = header.getRowIndex() + 1;

		// Write the rows
		List<CustomRow> rows = workbook.getRows();
		for (CustomRow row : rows) {
			List<CustomCell> cells = row.getCells();
			createCells(book, sheet, rowNo, cells, header);
			rowNo++;
		}
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
        book.write(bos);
        book.close();
        return new ByteArrayInputStream(bos.toByteArray());
    }
	
	public ByteArrayInputStream createExcelFile2(CustomWorkbook workbook) throws IOException {
		book = workbook.getWb();
        sheet = workbook.getSheet();
        header = workbook.getHeader();
        Map<CustomHeader, List<CustomRow>> mapHeader = workbook.getMapHeader();
        
        createHeader(book, sheet, header);
        // Rows start after the header
        rowNo = header.getRowIndex() + 1;
        
        mapHeader.forEach((subHeader, lstDatas) -> {
        	createHeader(book, sheet, subHeader);
        	rowNo++;
        	
        	lstDatas.forEach(r -> {
        		createCells(book, sheet, rowNo, r.getCells(), header);
        		rowNo++;
        	});
        });
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        book.write(bos);
        book.close();
        return new ByteArrayInputStream(bos.toByteArray());
	}

    protected void createCells(SXSSFWorkbook book, SXSSFSheet sheet, int rowNo, List<CustomCell> cells, CustomHeader header) {
        SXSSFRow row = sheet.createRow(rowNo);
        cells.forEach(cell -> {
        	int index = 0;
        	if (cell.getColumnIndex() != null)
        		index = header.getIndexOf(cell.getColumnIndex());
        	else
        		index = cell.getCustomIndex();
        		
            SXSSFCell newCell = row.createCell(index);
            newCell.setCellValue(new XSSFRichTextString(cell.getValue()));
            CellStyle cellStyle = cell.getCellStyle();
            if (cellStyle != null) {
	            cellStyle.setWrapText(false);
				newCell.setCellStyle(cellStyle);
            }
		});
	}

    protected void createHeader(SXSSFWorkbook book, SXSSFSheet sheet, CustomHeader header) {
        int rowIndex = header.getRowIndex();
        SXSSFRow row = sheet.createRow(rowIndex);
        List<CustomCell> headerRow = header.getheaderRows();
		for (CustomCell cell : headerRow) {
			int columnIndex = headerRow.indexOf(cell);
            SXSSFCell newCell = row.createCell(columnIndex);
            newCell.setCellValue(new XSSFRichTextString(cell.getValue()));
            CellStyle cellStyle = cell.getCellStyle();
            cellStyle.setWrapText(false); // Fix to disable cell wrap text
			newCell.setCellStyle(cellStyle);
			
			// Size the column
			sheet.setColumnWidth(columnIndex, cell.getSize());
		}
	}
	
}
