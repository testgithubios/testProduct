package com.bosch.wrd.export.excel.milestone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.IndexedColors;

import com.bosch.wrd.export.excel.api.CustomHeader;
import com.bosch.wrd.export.excel.api.CustomWorkbook;
import com.bosch.wrd.util.ExcelUtil;

public class SubHeader2 extends CustomHeader {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM");

	public SubHeader2(int rowIndex, CustomWorkbook workbook) {
		super(rowIndex, workbook);

		addCell("2", String.valueOf(rowIndex));
		addCell(ExcelUtil.FULL_PRO, ExcelUtil.FULL_PRO);
		addCell(ExcelUtil.PPDR, ExcelUtil.PPDR);
		addCell(ExcelUtil.DR, ExcelUtil.DR);
		addCell(ExcelUtil.NPCR, ExcelUtil.NPCR, IndexedColors.LIME);

		addCell(ExcelUtil.PSW_APPROVAL, ExcelUtil.PSW_APPROVAL, IndexedColors.LIME);
		addCell(ExcelUtil.NR, ExcelUtil.NR, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.CHANGE, ExcelUtil.CHANGE, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.BELT, ExcelUtil.BELT, IndexedColors.GREEN);
		addCell(ExcelUtil.JPNAME, ExcelUtil.JPNAME, IndexedColors.GREEN);
		addCell(ExcelUtil.DESCRIPTION_CHANGE, ExcelUtil.DESCRIPTION_CHANGE, IndexedColors.LIGHT_GREEN);

		addCell(ExcelUtil.LOC, ExcelUtil.LOC, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.LINE, ExcelUtil.LINE, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.CUS_PLANT, ExcelUtil.CUS_PLANT, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.JATCO, ExcelUtil.JATCO, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.MQS, ExcelUtil.MQS, IndexedColors.LIGHT_GREEN);

		/* cell 18-44, add days by week, start from current system date*/

		LocalDate date = LocalDate.now();
		for (int i = 18; i < 45; i++) {
			addCell(formatter.format(date), String.valueOf(i), IndexedColors.LIGHT_GREEN);
			date = date.plusWeeks(1);
		}

		addCell(ExcelUtil.NPCS, ExcelUtil.NPCS, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.NPCR, ExcelUtil.NPCR, IndexedColors.LIGHT_GREEN);

		addCell("F-DR0", "F-DR0", IndexedColors.LIGHT_GREEN);
		addCell("F-DR1", "F-DR1", IndexedColors.LIGHT_GREEN);
		addCell("F-DR2", "F-DR2", IndexedColors.LIGHT_GREEN);
		addCell("F-DR3", "F-DR3", IndexedColors.LIGHT_GREEN);
		addCell("F-DR4", "F-DR4", IndexedColors.LIGHT_GREEN);
		addCell("F-DR5", "F-DR5", IndexedColors.LIGHT_GREEN);
		addCell("Q-DR", "Q-DR", IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.RISH_REVIEW, ExcelUtil.RISH_REVIEW, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PDR0, ExcelUtil.PDR0, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PDR01, ExcelUtil.PDR01, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PDR2, ExcelUtil.PDR2, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PDR3, ExcelUtil.PDR3, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PDR5, ExcelUtil.PDR5, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.ISR, ExcelUtil.ISR, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.MASTER_BELT, ExcelUtil.MASTER_BELT, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PSW_SUBMIT, ExcelUtil.PSW_SUBMIT, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.PSW_APPROVAL, ExcelUtil.PSW_APPROVAL, IndexedColors.LIGHT_GREEN);
		addCell(ExcelUtil.SOP, ExcelUtil.SOP, IndexedColors.LIGHT_GREEN);

		addCell("SOD", "SOD", IndexedColors.LIGHT_GREEN);
		addCell("NPC-Sa", "NPC-Sa", IndexedColors.LIGHT_GREEN);
		addCell("NPC-Ra", "NPC-Ra", IndexedColors.LIGHT_GREEN);
		addCell("F-DR0a", "F-DR0a", IndexedColors.LIGHT_GREEN);
		addCell("F-DR1a", "F-DR1a", IndexedColors.LIGHT_GREEN);
		addCell("F-DR2a", "F-DR2a", IndexedColors.LIGHT_GREEN);
		addCell("F-DR3a", "F-DR3a", IndexedColors.LIGHT_GREEN);
		addCell("F-DR4a", "F-DR4a", IndexedColors.LIGHT_GREEN);
		addCell("F-DR5a", "F-DR5a", IndexedColors.LIGHT_GREEN);
		addCell("Q-DRa", "Q-DRa", IndexedColors.LIGHT_GREEN);
		addCell("Risk Ra", "Risk Ra", IndexedColors.LIGHT_GREEN);
		addCell("P-DR0a", "P-DR0a", IndexedColors.LIGHT_GREEN);
		addCell("P-DR1a", "P-DR1a", IndexedColors.LIGHT_GREEN);
		addCell("P-DR2a", "P-DR2a", IndexedColors.LIGHT_GREEN);
		addCell("P-DR3a", "P-DR3a", IndexedColors.LIGHT_GREEN);
		addCell("P-DR5a", "P-DR5a", IndexedColors.LIGHT_GREEN);
		addCell("I/Sa", "I/Sa", IndexedColors.LIGHT_GREEN);
		addCell("PSW Sa", "PSW Sa", IndexedColors.LIGHT_GREEN);
		addCell("PSW Aa", "PSW Aa", IndexedColors.LIGHT_GREEN);
		addCell("SOPa", "SOPa", IndexedColors.LIGHT_GREEN);
		addCell("SODa", "SODa", IndexedColors.LIGHT_GREEN);

	}

}
