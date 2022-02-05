package com.vlad.web.dvdrental.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtil {
	private DateUtil() {
	}

	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_PAGE_FORMAT = "dd.MM.yyyy";

	public static String convertDate(String date, String formatFrom, String formatTo) {
		DateTimeFormatter formatterFrom = DateTimeFormatter.ofPattern(formatFrom);
		LocalDateTime dateFrom = LocalDateTime.parse(date, formatterFrom);

		DateTimeFormatter formatterTo = DateTimeFormatter.ofPattern(formatTo);
		return dateFrom.format(formatterTo);

	}

	public static String convertDateToString(LocalDateTime dateTime, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		return dateTime.format(formatter);
	}
}
