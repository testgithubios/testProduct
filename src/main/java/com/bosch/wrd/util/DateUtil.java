package com.bosch.wrd.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateUtil {
	static Logger LOG = Logger.getLogger(DateUtil.class);
	
	public static final String DATE_FORMAT = "dd/MM/yyyy";
	public static final String DATE_FORMAT_2 = "dd-MM-yyyy";
	public static final String YEAR_FORMAT = "yyyy";
	public static final String PLANNED_SOP_FORMAT = "MM.yyyy";
	public static final String PLANNED_ISR_FORMAT = "dd.MM.yyyy";
	public static final String TESTING_CAPACITY_FORMAT = "MMM - yyyy";
	
	public static String convertDate(Date inputDate, String formatDate) {
		if (null == inputDate)
			return "";
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(formatDate);
		return DATE_FORMAT.format(inputDate);
	}
	
	public static Date stringToDate(String strDate, String formatDate) {
		try {
			if (null != strDate) {
				SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(formatDate);
				return DATE_FORMAT.parse(strDate);
			}
		} catch (ParseException e) {
			LOG.warn(e.getMessage());
		}
		return null;
	}
	
	public static boolean isDateExpired(Date old) {
		if (old == null)
			return false;
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.setTime(old);
		cal1.set(Calendar.DAY_OF_MONTH, 0);
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		
		Date current = new Date();
		cal2.setTime(current);
		cal2.set(Calendar.DAY_OF_MONTH, 0);
		cal2.set(Calendar.HOUR_OF_DAY, 0);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.SECOND, 0);
		cal2.set(Calendar.MILLISECOND, 0);
		return cal1.before(cal2);
	}
}
