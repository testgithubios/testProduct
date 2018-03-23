/**
 * 
 */
package com.bosch.wrd.export.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import com.bosch.wrd.constraints.TrafficLight;
import com.bosch.wrd.dto.StearingCommiteeDto;
import com.bosch.wrd.util.DateUtil;
import com.bosch.wrd.util.FileUtil;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.TextField;

/**
 * @author hnd1hc
 *
 */
public class StearingCommiteeHandlingPDF extends PdfTemplate {

	private static final Float[] PROJECT_HIGHLIGHTS = { 810f, 60f, 430f, 395f };
	
	private static final String TITLE_1 = "Steering Committee Releases l ";
	private static final String SOP_1 = "SOP1";
	
	private StearingCommiteeFields fields;
	private StearingCommiteeDto dto;
	private PdfReader reader = null;
	private PdfStamper stamper = null;
	private ByteArrayOutputStream out = null;
	private PdfContentByte cb = null;

	public StearingCommiteeHandlingPDF(StearingCommiteeDto dto) {
		this.dto = dto;
		fields = new StearingCommiteeFields();
	}

	@Override
	public void beforeCreatePdf() throws IOException, FileNotFoundException, DocumentException {
		reader = new PdfReader(this.getClass().getResourceAsStream(FILE_PATH + FileUtil.STEERING_COMMITTEE_IN));

		out = new ByteArrayOutputStream();
		stamper = new PdfStamper(reader, out);
		cb = stamper.getOverContent(1);
	}
	
	@Override
	public ByteArrayInputStream createPdf() throws IOException, DocumentException {
		beforeCreatePdf();
		fillData();
		draw();

		stamper.close();
		reader.close();
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	private void fillData() throws IOException, DocumentException {
		AcroFields form = stamper.getAcroFields();
		form.setGenerateAppearances(false);
		
		form.setFieldProperty(fields.milestone_passed, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.sop1, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.date1, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.sop2, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.date2, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.sop3, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.date3, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.sop4, "setfflags", TextField.READ_ONLY, null);
		form.setFieldProperty(fields.date4, "setfflags", TextField.READ_ONLY, null);
		
		form.setFieldProperty(fields.header1, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.header1, TITLE_1);
		
		form.setFieldProperty(fields.header2, "setfflags", TextField.READ_ONLY, null);
		Date reportDate = DateUtil.stringToDate(dto.getReportDate(), DateUtil.DATE_FORMAT);
		form.setField(fields.header2, DateUtil.convertDate(reportDate, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.header3, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.header3, dto.getTitle());
		
		form.setFieldProperty(fields.pjm, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.pjm, dto.getPjm());
		
		form.setFieldProperty(fields.sop0, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.sop0, SOP_1);
		
		form.setFieldProperty(fields.date0, "setfflags", TextField.READ_ONLY, null);
		Date sop1 = DateUtil.stringToDate(dto.getRbSop(), DateUtil.DATE_FORMAT);
		form.setField(fields.date0, DateUtil.convertDate(sop1, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.project_highlight, "setfflags", TextField.READ_ONLY, null);
		FileUtil.buildParagraph(dto.getProjectHighlightReason(), PROJECT_HIGHLIGHTS[0], PROJECT_HIGHLIGHTS[1],
				PROJECT_HIGHLIGHTS[2], PROJECT_HIGHLIGHTS[3], cb);
		// form.setField(fields.project_highlight, dto.getProjectHighlightReason());
		
		form.setFieldProperty(fields.agenda_topics, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.agenda_topics, dto.getProjectHighlightIssue());
		
		form.setFieldProperty(fields.plan0, "setfflags", TextField.READ_ONLY, null);
		Date plan0 = DateUtil.stringToDate(dto.getQgPlant0(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan0, DateUtil.convertDate(plan0, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.plan1, "setfflags", TextField.READ_ONLY, null);
		Date plan1 = DateUtil.stringToDate(dto.getQgPlant1(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan1, DateUtil.convertDate(plan1, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.plan2, "setfflags", TextField.READ_ONLY, null);
		Date plan2 = DateUtil.stringToDate(dto.getQgPlant2(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan2, DateUtil.convertDate(plan2, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.plan3, "setfflags", TextField.READ_ONLY, null);
		Date plan3 = DateUtil.stringToDate(dto.getQgPlant3(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan3, DateUtil.convertDate(plan3, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.plan4, "setfflags", TextField.READ_ONLY, null);
		Date plan4 = DateUtil.stringToDate(dto.getQgPlant4(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan4, DateUtil.convertDate(plan4, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.plan5, "setfflags", TextField.READ_ONLY, null);
		Date plan5 = DateUtil.stringToDate(dto.getQgPlant5(), DateUtil.DATE_FORMAT);
		form.setField(fields.plan5, DateUtil.convertDate(plan5, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual0, "setfflags", TextField.READ_ONLY, null);
		Date actual0 = DateUtil.stringToDate(dto.getQgActual0(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual0, DateUtil.convertDate(actual0, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual1, "setfflags", TextField.READ_ONLY, null);
		Date actual1 = DateUtil.stringToDate(dto.getQgActual1(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual1, DateUtil.convertDate(actual1, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual2, "setfflags", TextField.READ_ONLY, null);
		Date actual2 = DateUtil.stringToDate(dto.getQgActual2(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual2, DateUtil.convertDate(actual2, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual3, "setfflags", TextField.READ_ONLY, null);
		Date actual3 = DateUtil.stringToDate(dto.getQgActual3(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual3, DateUtil.convertDate(actual3, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual4, "setfflags", TextField.READ_ONLY, null);
		Date actual4 = DateUtil.stringToDate(dto.getQgActual4(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual4, DateUtil.convertDate(actual4, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.actual5, "setfflags", TextField.READ_ONLY, null);
		Date actual5 = DateUtil.stringToDate(dto.getQgActual5(), DateUtil.DATE_FORMAT);
		form.setField(fields.actual5, DateUtil.convertDate(actual5, DateUtil.DATE_FORMAT));
		
		form.setFieldProperty(fields.if0, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.if0, dto.getRiskif());
		
		form.setFieldProperty(fields.then0, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.then0, dto.getRiskThen());
		
		form.setFieldProperty(fields.action0, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.action0, dto.getRiskCorrectiveAction());
		
		form.setFieldProperty(fields.due0, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.due0, dto.getRiskDue());
	}
	
	private void draw() {
		cb.setColorStroke(getColor(dto.getRiskRating()));
		cb.setColorFill(getColor(dto.getRiskRating()));
		cb.moveTo(420, 115);
		cb.lineTo(350, 115);
		cb.lineTo(350, 10);
		cb.lineTo(420, 10);
		cb.closePathFillStroke();
		
		cb.setColorStroke(getColor(dto.getKpitLast()));
		cb.setColorFill(getColor(dto.getKpitLast()));
		cb.moveTo(190, 370);
		cb.lineTo(115, 370);
		cb.lineTo(115, 395);
		cb.lineTo(190, 395);
		cb.closePathFillStroke();
		
		cb.setColorStroke(getColor(dto.getKpisLast()));
		cb.setColorFill(getColor(dto.getKpisLast()));
		cb.moveTo(190, 365);
		cb.lineTo(115, 365);
		cb.lineTo(115, 342);
		cb.lineTo(190, 342);
		cb.closePathFillStroke();
        
		cb.setColorStroke(getColor(dto.getKpibLast()));
		cb.setColorFill(getColor(dto.getKpibLast()));
		cb.moveTo(190, 338);
		cb.lineTo(115, 338);
		cb.lineTo(115, 312);
		cb.lineTo(190, 312);
		cb.closePathFillStroke();
		
		cb.setColorStroke(getColor(dto.getKpitCurrent()));
		cb.setColorFill(getColor(dto.getKpitCurrent()));
		cb.moveTo(268, 370);
		cb.lineTo(194, 370);
		cb.lineTo(194, 395);
		cb.lineTo(268, 395);
		cb.closePathFillStroke();
		
		cb.setColorStroke(getColor(dto.getKpisCurrent()));
		cb.setColorFill(getColor(dto.getKpisCurrent()));
		cb.moveTo(268, 365);
		cb.lineTo(194, 365);
		cb.lineTo(194, 342);
		cb.lineTo(268, 342);
		cb.closePathFillStroke();
		
		cb.setColorStroke(getColor(dto.getKpibCurrent()));
		cb.setColorFill(getColor(dto.getKpibCurrent()));
		cb.moveTo(268, 338);
		cb.lineTo(194, 338);
		cb.lineTo(194, 312);
		cb.lineTo(268, 312);
		cb.closePathFillStroke();
	}
	
	public static class StearingCommiteeFields {
		String header1 = "header1";
		String header2 = "header2";
		String header3 = "header3";
		String pjm = "pjm";
		String sop0 = "sop0";
		String date0 = "date0";
		String sop1 = "sop1";
		String date1 = "date1";
		String sop2 = "sop2";
		String date2 = "date2";
		String sop3 = "sop3";
		String date3 = "date3";
		String sop4 = "sop4";
		String date4 = "date4";
		String plan0 = "plan0";
		String plan1 = "plan1";
		String plan2 = "plan2";
		String plan3 = "plan3";
		String plan4 = "plan4";
		String plan5 = "plan5";
		String actual0 = "actual0";
		String actual1 = "actual1";
		String actual2 = "actual2";
		String actual3 = "actual3";
		String actual4 = "actual4";
		String actual5 = "actual5";
		String timing = "timing";
		String other = "other";
		String project_highlight = "project_highlight";
		String agenda_topics = "agenda_topics";
		String if0 = "if";
		String then0 = "then";
		String action0 = "action";
		String due0 = "due";
		String milestone_passed = "milestone_passed";
	}
	
	private BaseColor getColor(String strColor) {
		BaseColor color = BaseColor.LIGHT_GRAY;
		if (strColor == null)
			return color;
		if (strColor.equalsIgnoreCase(TrafficLight.RED.toString())) {
			color = BaseColor.RED;
		}
		if (strColor.equalsIgnoreCase(TrafficLight.GREEN.toString())) {
			color = BaseColor.GREEN;
		}
		if (strColor.equalsIgnoreCase(TrafficLight.YELLOW.toString())) {
			color = BaseColor.YELLOW;
		}
		return color;
	}
}