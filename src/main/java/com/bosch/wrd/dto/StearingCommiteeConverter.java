/**
 * 
 */
package com.bosch.wrd.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.bosch.wrd.entity.entityImpl.StearingCommittee;

/**
 * @author hnd1hc
 *
 */
public class StearingCommiteeConverter extends Converter<StearingCommiteeDto, StearingCommittee> {

	private static final Logger LOG = Logger.getLogger(StearingCommiteeConverter.class);
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	public StearingCommiteeConverter() {
		super(dto -> new StearingCommittee(dto.getId(), dto.getKpitCurrent(), dto.getKpisCurrent(),
				dto.getKpibCurrent(), dto.getRiskif(), dto.getRiskThen(), dto.getRiskRating(),
				dto.getRiskCorrectiveAction(), stringToDate(dto.getRiskDue()), stringToDate(dto.getQgActual0()),
				stringToDate(dto.getQgActual1()), stringToDate(dto.getQgActual2()), stringToDate(dto.getQgActual3()),
				stringToDate(dto.getQgActual4()), stringToDate(dto.getQgActual5()), dto.getProjectHighlightIssue(),
				dto.getProjectHighlightReason(), stringToDate(dto.getReportDate()), dto.getTitle(), dto.getPjm()),

				entity -> new StearingCommiteeDto(entity.getId(), entity.getKpib(), entity.getKpis(), entity.getKpit(),
						entity.getRiskif(), entity.getRiskThen(), entity.getRiskRating(),
						entity.getRiskCorrectiveAction(), dateToString(entity.getRiskDue()),
						dateToString(entity.getQgActual0()), dateToString(entity.getQgActual1()),
						dateToString(entity.getQgActual2()), dateToString(entity.getQgActual3()),
						dateToString(entity.getQgActual4()), dateToString(entity.getQgActual5()),
						entity.getProjectHighlightIssue(), entity.getProjectHighlightReason(),
						dateToString(entity.getReportDate()), entity.getTitle(), entity.getPjm()));
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
