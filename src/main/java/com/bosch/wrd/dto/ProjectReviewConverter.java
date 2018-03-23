/**
 * 
 */
package com.bosch.wrd.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.bosch.wrd.entity.entityImpl.ProjectReview;

/**
 * @author hnd1hc
 *
 */
public class ProjectReviewConverter extends Converter<ProjectReviewDto, ProjectReview> {

	private static final Logger LOG = Logger.getLogger(ProjectReviewConverter.class);
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat DATE_FORMAT1 = new SimpleDateFormat("dd-MMM");
	
	public ProjectReviewConverter() {
		super(dto -> new ProjectReview(dto.getCurrentHighLightData(), dto.getRisksData(), dto.getActivitiesPlannedData(),
				dto.getMitigationData(), dto.getStatus(), dto.getTitle(), stringToDate(dto.getDateCreated()), stringToDate(dto.getDateUpdated()),
				dto.getDateCreatedLight(), dto.getDateUpdatedLight(), dto.getCoordinator(), dto.getId()),
				entity -> new ProjectReviewDto(entity.getCurrentHighlights(), entity.getRisksIssues(),
						entity.getActivitiesPlanned(), entity.getMitigation(), entity.getStatus(), entity.getTitle(), 
						dateToString(entity.getDateCreated()), dateToString(entity.getDateUpdated()),
						entity.getDateCreatedLight(), entity.getDateUpdatedLight(), entity.getCoordinator(), entity.getId()));

	}

	private static Date stringToDate(String strDate) {
		try {
			if (null != strDate) {
				return DATE_FORMAT.parse(strDate);
			}
		} catch (ParseException e) {
			LOG.warn(e.getMessage());
		}
		return null;
	}

	private static String dateToString(Date date) {
		if (date != null) {
			return DATE_FORMAT.format(date);
		}
		return null;
	}
}
