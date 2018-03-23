package com.bosch.wrd.export.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;

import com.bosch.wrd.dto.ReleasesDto;
import com.bosch.wrd.util.ExcelUtil;

public class SelectedReleasesXLSX extends BaseXLSX {

	private List<ReleasesDto> dtos;
	
	public SelectedReleasesXLSX(List<ReleasesDto> dtos) {
		this.dtos = dtos;
	}

	@Override
	public InputStream render() throws IOException {
		sheet = wb.createSheet(ExcelUtil.SELECTED_RELEASES_SHEET_NAME);
		font = (XSSFFont) wb.createFont();
		font.setBold(true);
		font.setColor(IndexedColors.WHITE.index);
		
		row = sheet.createRow(0);
		
		buildHeader();
		
		int rowIndex = 1;
		for (ReleasesDto dto : dtos) {
			row = sheet.createRow(rowIndex);
			
			Cell nr = row.createCell(0);
			nr.setCellValue(dto.getNr());
			
			Cell status = row.createCell(1);
			status.setCellValue(dto.getStatus());
			
			Cell belt = row.createCell(2);
			belt.setCellValue(dto.getBelt());
			
			Cell line = row.createCell(3);
			line.setCellValue(dto.getLine());
			
			Cell des = row.createCell(4);
			des.setCellValue(dto.getDescriptionChange());
			
			Cell aqcdt = row.createCell(5);
			aqcdt.setCellValue(dto.getAqcdt());
			
			Cell jatco = row.createCell(6);
			jatco.setCellValue(dto.getJatcoReleaseMeth());
			
			Cell npcs = row.createCell(7);
			npcs.setCellValue(dto.getNpcsActual());
			
			Cell mqs = row.createCell(8);
			mqs.setCellValue(dto.getMqs());
			
			Cell risk = row.createCell(9);
			risk.setCellValue(dto.getRiskReviewActual());
			
			Cell pdr01 = row.createCell(10);
			pdr01.setCellValue(dto.getPdr01Actual());
			
			Cell pdr2 = row.createCell(11);
			pdr2.setCellValue(dto.getPdr2Actual());
			
			Cell npcr = row.createCell(12);
			npcr.setCellValue(dto.getNpcrActual());
			
			Cell isr = row.createCell(13);
			isr.setCellValue(dto.getIsrActual());
			
			Cell sample = row.createCell(14);
			sample.setCellValue(dto.getSampleSubmission());
			
			Cell pswSubmit = row.createCell(15);
			pswSubmit.setCellValue(dto.getPswsActual());
			
			Cell pdr35 = row.createCell(16);
			pdr35.setCellValue(dto.getPdr35Actual());
			
			Cell master = row.createCell(17);
			master.setCellValue(dto.getMasterBeltActual());
			
			Cell pswApp = row.createCell(18);
			pswApp.setCellValue(dto.getPswaActual());
			
			Cell rbOrigSop = row.createCell(19);
			rbOrigSop.setCellValue(dto.getRbOrigSop());
			
			Cell rbSop = row.createCell(20);
			rbSop.setCellValue(dto.getRbSopActual());
			
			Cell ckDispatch = row.createCell(21);
			ckDispatch.setCellValue(dto.getCkdDispatchDate());
			
			Cell dispatch = row.createCell(22);
			dispatch.setCellValue(dto.getDispatchFromPlantActual());
			
			Cell arrival = row.createCell(23);
			arrival.setCellValue(dto.getArrivalAtCustomerActual());
			
			Cell frozen = row.createCell(24);
			frozen.setCellValue(dto.getFrozenPeriod() == null ? 0 : dto.getFrozenPeriod());
			
			Cell traffic = row.createCell(25);
			traffic.setCellValue(dto.getTrafficLight());
			
			Cell qg1 = row.createCell(26);
			qg1.setCellValue(dto.getQg1());
			
			Cell qg2 = row.createCell(27);
			qg2.setCellValue(dto.getQg2());
			
			Cell qg3 = row.createCell(28);
			qg3.setCellValue(dto.getQg3());
			
			Cell qg4 = row.createCell(29);
			qg4.setCellValue(dto.getQg4());
			
			Cell qg5 = row.createCell(30);
			qg5.setCellValue(dto.getQg5());
			
			Cell project = row.createCell(31);
			project.setCellValue(dto.getProjectNr());
			
			Cell ecrStatus = row.createCell(32);
			ecrStatus.setCellValue(dto.getEcrStatus() == null ? 0 : dto.getEcrStatus());
			
			Cell ecrNr = row.createCell(33);
			ecrNr.setCellValue(dto.getEcrNr());
			
			Cell cusInf = row.createCell(34);
			cusInf.setCellValue(dto.getCustomerInform());
			
			Cell notes = row.createCell(35);
			notes.setCellValue(dto.getNotes());
			
			Cell last = row.createCell(36);
			last.setCellValue(dto.getLastUpdate());
			
			Cell pic = row.createCell(37);
			pic.setCellValue(dto.getPic());
			
			Cell counter = row.createCell(38);
			counter.setCellValue(dto.getCounterPart());
			
			Cell unique = row.createCell(39);
			unique.setCellValue(dto.getUnique());
			
			rowIndex++;
		}
		
		autoSizeColumns();
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		wb.write(out);
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	private void buildHeader() {
		cellStyle = wb.createCellStyle();
		cellStyle.setFillForegroundColor(IndexedColors.BLUE.index);
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cellStyle.setFont(font);
		
		Cell nr = row.createCell(0);
		nr.setCellValue(ExcelUtil.NR);
		nr.setCellStyle(cellStyle);
		
		Cell status = row.createCell(1);
		status.setCellValue(ExcelUtil.STATUS);
		status.setCellStyle(cellStyle);
		
		Cell belt = row.createCell(2);
		belt.setCellValue(ExcelUtil.BELT);
		belt.setCellStyle(cellStyle);
		
		Cell line = row.createCell(3);
		line.setCellValue(ExcelUtil.LINE);
		line.setCellStyle(cellStyle);
		
		Cell des = row.createCell(4);
		des.setCellValue(ExcelUtil.DESCRIPTION_CHANGE);
		des.setCellStyle(cellStyle);
		
		Cell aqcdt = row.createCell(5);
		aqcdt.setCellValue(ExcelUtil.AQCDT);
		aqcdt.setCellStyle(cellStyle);
		
		Cell jatco = row.createCell(6);
		jatco.setCellValue(ExcelUtil.JATCO);
		jatco.setCellStyle(cellStyle);
		
		Cell npcs = row.createCell(7);
		npcs.setCellValue(ExcelUtil.NPCS);
		npcs.setCellStyle(cellStyle);
		
		Cell mqs = row.createCell(8);
		mqs.setCellValue(ExcelUtil.MQS);
		mqs.setCellStyle(cellStyle);
		
		Cell risk = row.createCell(9);
		risk.setCellValue(ExcelUtil.RISH_REVIEW);
		risk.setCellStyle(cellStyle);
		
		Cell pdr01 = row.createCell(10);
		pdr01.setCellValue(ExcelUtil.PDR01);
		pdr01.setCellStyle(cellStyle);
		
		Cell pdr2 = row.createCell(11);
		pdr2.setCellValue(ExcelUtil.PDR2);
		pdr2.setCellStyle(cellStyle);
		
		Cell npcr = row.createCell(12);
		npcr.setCellValue(ExcelUtil.NPCR);
		npcr.setCellStyle(cellStyle);
		
		Cell isr = row.createCell(13);
		isr.setCellValue(ExcelUtil.ISR);
		isr.setCellStyle(cellStyle);
		
		Cell sample = row.createCell(14);
		sample.setCellValue(ExcelUtil.SAMPLE_SUBMIT);
		sample.setCellStyle(cellStyle);
		
		Cell pswSubmit = row.createCell(15);
		pswSubmit.setCellValue(ExcelUtil.PSW_SUBMIT);
		pswSubmit.setCellStyle(cellStyle);
		
		Cell pdr35 = row.createCell(16);
		pdr35.setCellValue(ExcelUtil.PDR_35);
		pdr35.setCellStyle(cellStyle);
		
		Cell master = row.createCell(17);
		master.setCellValue(ExcelUtil.MASTER_BELT);
		master.setCellStyle(cellStyle);
		
		Cell pswApp = row.createCell(18);
		pswApp.setCellValue(ExcelUtil.PSW_APPROVAL);
		pswApp.setCellStyle(cellStyle);
		
		Cell rbOrigSop = row.createCell(19);
		rbOrigSop.setCellValue(ExcelUtil.RB_ORIG_SOP);
		rbOrigSop.setCellStyle(cellStyle);
		
		Cell rbSop = row.createCell(20);
		rbSop.setCellValue(ExcelUtil.RB_SOP);
		rbSop.setCellStyle(cellStyle);
		
		Cell ckDispatch = row.createCell(21);
		ckDispatch.setCellValue(ExcelUtil.CKD_DISPATCH_DATE);
		ckDispatch.setCellStyle(cellStyle);
		
		Cell dispatch = row.createCell(22);
		dispatch.setCellValue(ExcelUtil.DISPATCH_FROM_BOSCH);
		dispatch.setCellStyle(cellStyle);
		
		Cell arrival = row.createCell(23);
		arrival.setCellValue(ExcelUtil.ARRIVAL_AT_CUSTOMER);
		arrival.setCellStyle(cellStyle);
		
		Cell frozen = row.createCell(24);
		frozen.setCellValue(ExcelUtil.FROZEN_PERIOD);
		frozen.setCellStyle(cellStyle);
		
		Cell traffic = row.createCell(25);
		traffic.setCellValue(ExcelUtil.TRAFFIC_LIGHT);
		traffic.setCellStyle(cellStyle);
		
		Cell qg1 = row.createCell(26);
		qg1.setCellValue(ExcelUtil.QG1);
		qg1.setCellStyle(cellStyle);
		
		Cell qg2 = row.createCell(27);
		qg2.setCellValue(ExcelUtil.QG2);
		qg2.setCellStyle(cellStyle);
		
		Cell qg3 = row.createCell(28);
		qg3.setCellValue(ExcelUtil.QG3);
		qg3.setCellStyle(cellStyle);
		
		Cell qg4 = row.createCell(29);
		qg4.setCellValue(ExcelUtil.QG4);
		qg4.setCellStyle(cellStyle);
		
		Cell qg5 = row.createCell(30);
		qg5.setCellValue(ExcelUtil.QG5);
		qg5.setCellStyle(cellStyle);
		
		Cell project = row.createCell(31);
		project.setCellValue(ExcelUtil.PROJECT_NR);
		project.setCellStyle(cellStyle);
		
		Cell ecrStatus = row.createCell(32);
		ecrStatus.setCellValue(ExcelUtil.ECR_STATUS);
		ecrStatus.setCellStyle(cellStyle);
		
		Cell ecrNr = row.createCell(33);
		ecrNr.setCellValue(ExcelUtil.ECR_NR);
		ecrNr.setCellStyle(cellStyle);
		
		Cell cusInf = row.createCell(34);
		cusInf.setCellValue(ExcelUtil.CUSTOMER_INFR);
		cusInf.setCellStyle(cellStyle);
		
		Cell notes = row.createCell(35);
		notes.setCellValue(ExcelUtil.NOTES);
		notes.setCellStyle(cellStyle);
		
		Cell last = row.createCell(36);
		last.setCellValue(ExcelUtil.LAST_UPDATED);
		last.setCellStyle(cellStyle);
		
		Cell pic = row.createCell(37);
		pic.setCellValue(ExcelUtil.PIC);
		pic.setCellStyle(cellStyle);
		
		Cell counter = row.createCell(38);
		counter.setCellValue(ExcelUtil.COUNTER_PART);
		counter.setCellStyle(cellStyle);
		
		Cell unique = row.createCell(39);
		unique.setCellValue(ExcelUtil.UNIQUE);
		unique.setCellStyle(cellStyle);
	}
}
