package com.bosch.wrd.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.bosch.wrd.entity.entityImpl.Portfolio;

public class PortfolioConverter extends Converter<PortfolioDto, Portfolio> {

	private static final Logger LOG = Logger.getLogger(PortfolioConverter.class);
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM.yy");

	public PortfolioConverter() {
		super(dto -> new Portfolio(dto.getHcpPjmCoordinator(), dto.getLastQualityGate(), dto.getNo(),
				dto.getPgl(), dto.getPia(), dto.getProcessAudit(), dto.getProjectOwner(),
				dto.getRemarkForClosedProject(), dto.getScopeShortDesc(), dto.getTbpSlppPJM(),
				stringToDate(dto.getVersion()), dto.getTypeOfChange(), dto.getAlElLl()),

				entity -> new PortfolioDto(entity.getHcpPjmCoordinator(), entity.getLastQualityGate(), entity.getId(),
						entity.isPgl(), entity.getPia(), entity.getProcessAudit(),
						entity.getProjectOwner(), entity.getRemarkForClosedProject(), entity.getScopeShortDesc(),
						entity.getTbpSlppPJM(), dateToString(entity.getVersion()), entity.getTypeOfChange(), entity.getAlElLl()));
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
