package com.bosch.wrd.export.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import com.bosch.wrd.constraints.TrafficLight;
import com.bosch.wrd.dto.ProjectReviewDto;
import com.bosch.wrd.util.DateUtil;
import com.bosch.wrd.util.FileUtil;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.TextField;

public class ProjectReviewHandlingPDF extends PdfTemplate {

	private static final Float[] CURRENT_HIGHLIGHTS = { 410f, 45f, 40f, 385f };
	private static final Float[] ACTIVITIES_PLANNED_NEXT_WEEKS = { 810f, 45f, 435f, 385f };
	private static final Float[] RISKS = { 410f, 45f, 40f, 130f };
	private static final Float[] MITIGATION = { 810f, 45f, 440f, 130f };
	private static final String DATE_FORMAT1 = "dd-MMM";
	private static final String STANDARD_DATE_FORMAT = "dd/MM/yyyy";

	private ProjectReviewFields fields;
	private ProjectReviewDto dto;
	private PdfReader reader = null;
	private PdfStamper stamper = null;
	private ByteArrayOutputStream out = null;
	private PdfContentByte cb = null;

	public ProjectReviewHandlingPDF(ProjectReviewDto dto) {
		this.dto = dto;
		fields = new ProjectReviewFields();
	}

	@Override
	public void beforeCreatePdf() throws IOException, FileNotFoundException, DocumentException {
		reader = new PdfReader(this.getClass().getResourceAsStream(FILE_PATH + FileUtil.PROJECT_REVIEW_IN));

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
		
		Date dateCreated = DateUtil.stringToDate(dto.getDateCreated(), STANDARD_DATE_FORMAT);
		Date dateUpdated = DateUtil.stringToDate(dto.getDateUpdated(), STANDARD_DATE_FORMAT);
		
		form.setFieldProperty(fields.dateCreated, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.dateCreated, DateUtil.convertDate(dateCreated, DATE_FORMAT1));
		form.setFieldProperty(fields.dateUpdated, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.dateUpdated, DateUtil.convertDate(dateUpdated, DATE_FORMAT1));

		form.setFieldProperty(fields.title, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.title, dto.getTitle());
		
		form.setFieldProperty(fields.subTitle1, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.subTitle1, dto.getSubTitle1());
		
		form.setFieldProperty(fields.sub_title2, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.sub_title2, dto.getSubTitle2() + dto.getCoordinator());

		form.setFieldProperty(fields.currentHighlight, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.currentHighlight, dto.getCurrentHighLight());
		form.setFieldProperty(fields.currentHighlightData, "setfflags", TextField.READ_ONLY, null);
		FileUtil.buildParagraph(dto.getCurrentHighLightData(), CURRENT_HIGHLIGHTS[0], CURRENT_HIGHLIGHTS[1],
				CURRENT_HIGHLIGHTS[2], CURRENT_HIGHLIGHTS[3], cb);
		
		form.setFieldProperty(fields.activitiesPlanned, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.activitiesPlanned, dto.getActivitiesPlanned());
		form.setFieldProperty(fields.activitiesPlannedData, "setfflags", TextField.READ_ONLY, null);
		FileUtil.buildParagraph(dto.getActivitiesPlannedData(), ACTIVITIES_PLANNED_NEXT_WEEKS[0],
				ACTIVITIES_PLANNED_NEXT_WEEKS[1], ACTIVITIES_PLANNED_NEXT_WEEKS[2], ACTIVITIES_PLANNED_NEXT_WEEKS[3], cb);
		
		form.setFieldProperty(fields.risks, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.risks, dto.getRisks());		
		form.setFieldProperty(fields.risksData, "setfflags", TextField.READ_ONLY, null);
		FileUtil.buildParagraph(dto.getRisksData(), RISKS[0], RISKS[1], RISKS[2], RISKS[3], cb);
		
		form.setFieldProperty(fields.mitigation, "setfflags", TextField.READ_ONLY, null);
		form.setField(fields.mitigation, dto.getMitigation());
		form.setFieldProperty(fields.mitigationData, "setfflags", TextField.READ_ONLY, null);
		FileUtil.buildParagraph(dto.getMitigationData(), MITIGATION[0], MITIGATION[1], MITIGATION[2], MITIGATION[3], cb);
	}

	private void draw() {
		cb.setColorStroke(BaseColor.GRAY);
		cb.setColorFill(BaseColor.LIGHT_GRAY);
		cb.moveTo(690, 470);
		cb.lineTo(730, 470);
		cb.lineTo(730, 550);
		cb.lineTo(690, 550);
		cb.closePathFillStroke();

		cb.setColorStroke(getColor(dto.getDateCreatedLight(), TrafficLight.RED));
		cb.setColorFill(getColor(dto.getDateCreatedLight(), TrafficLight.RED));
		cb.setLineWidth(1f);
		cb.circle(710f, 535f, 9f);
		cb.closePathFillStroke();

		cb.setColorStroke(getColor(dto.getDateCreatedLight(), TrafficLight.YELLOW));
		cb.setColorFill(getColor(dto.getDateCreatedLight(), TrafficLight.YELLOW));
		cb.setLineWidth(1f);
		cb.circle(710f, 510f, 9f);
		cb.closePathFillStroke();

		cb.setColorStroke(getColor(dto.getDateCreatedLight(), TrafficLight.GREEN));
		cb.setColorFill(getColor(dto.getDateCreatedLight(), TrafficLight.GREEN));
		cb.setLineWidth(1f);
		cb.circle(710f, 485f, 9f);
		cb.closePathFillStroke();

		cb.setColorStroke(BaseColor.GRAY);
		cb.setColorFill(BaseColor.LIGHT_GRAY);
		cb.moveTo(760, 440);
		cb.lineTo(805, 440);
		cb.lineTo(805, 550);
		cb.lineTo(760, 550);
		cb.fillStroke();

		cb.setColorStroke(getColor(dto.getDateUpdatedLight(), TrafficLight.RED));
		cb.setColorFill(getColor(dto.getDateUpdatedLight(), TrafficLight.RED));
		cb.setLineWidth(1f);
		cb.circle(785f, 530f, 13f);
		cb.closePathFillStroke();

		cb.setColorStroke(getColor(dto.getDateUpdatedLight(), TrafficLight.YELLOW));
		cb.setColorFill(getColor(dto.getDateUpdatedLight(), TrafficLight.YELLOW));
		cb.setLineWidth(1f);
		cb.circle(785f, 495f, 13f);
		cb.closePathFillStroke();

		cb.setColorStroke(getColor(dto.getDateUpdatedLight(), TrafficLight.GREEN));
		cb.setColorFill(getColor(dto.getDateUpdatedLight(), TrafficLight.GREEN));
		cb.setLineWidth(1f);
		cb.circle(785f, 460f, 13f);
		cb.closePathFillStroke();
		cb.fill();
	}

	private BaseColor getColor(String strColor, TrafficLight light) {
		BaseColor color = BaseColor.WHITE;
		if (strColor == null)
			return color;
		if (strColor.equalsIgnoreCase(light.getValue().toString())
				&& light.getValue().equalsIgnoreCase(TrafficLight.RED.toString())) {
			color = BaseColor.RED;
		}
		if (strColor.equalsIgnoreCase(light.getValue().toString())
				&& light.getValue().equalsIgnoreCase(TrafficLight.GREEN.toString())) {
			color = BaseColor.GREEN;
		}
		if (strColor.equalsIgnoreCase(light.getValue().toString())
				&& light.getValue().equalsIgnoreCase(TrafficLight.YELLOW.toString())) {
			color = BaseColor.YELLOW;
		}
		return color;
	}

	public static class ProjectReviewFields {
		String dateCreated = "date_created";
		String dateUpdated = "date_updated";
		String title = "title";
		String subTitle1 = "sub_title1";
		String sub_title2 = "sub_title2";
		String currentHighlight = "current_highlight";
		String currentHighlightData = "current_highlight_data";
		String activitiesPlanned = "activities_planned";
		String activitiesPlannedData = "activities_planned_data";
		String risks = "risks";
		String risksData = "risks_data";
		String mitigation = "mitigation";
		String mitigationData = "mitigation_data";
	}
}
