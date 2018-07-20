package com.cts.product.profile.cdto.joda;

import java.util.regex.Pattern;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeAdapter {

    private static final String DATE = "\\d{4}-\\d{2}-\\d{2}"; // e.g., 2015-09-14
    private static final String TIME = "\\d{2}:\\d{2}:\\d{2}(\\.\\d{3})?"; // e.g, 23:59:59 or 23:59:59.999
    private static final String DATE_TIME_DELIM = "T";
    private static final String TZ_UTC = "Z";
    private static final String TZ_OFFSET = "[-+]\\d{2}:\\d{2}"; // e.g., -05:00 or +05:00

    // e.g., 2015-09-14T23:59:59+11:00 or 2015-09-14T23:59:59.999-05:00
    private static final String DATETIME_UTC = DATE + DATE_TIME_DELIM + TIME + TZ_UTC;

    // e.g., 2015-09-14T23:59:59Z or 2015-09-14T23:59:59.999Z
    private static final String DATETIME_TZ_OFFSET = DATE + DATE_TIME_DELIM + TIME + TZ_OFFSET;

    private static final String DATE_IN_UNPARSABLE_FORMAT = "Date cannot be parsed: ";

    public static DateTime unmarshal(final String v) {
	if (v == null) {
	    throw new IllegalArgumentException(DATE_IN_UNPARSABLE_FORMAT + v);
	}

	DateTime dateTime = null;

	if (Pattern.matches(DATETIME_UTC, v)) {
	    dateTime = new DateTime(v).withZone(DateTimeZone.UTC);
	} else if (Pattern.matches(DATETIME_TZ_OFFSET, v)) {
	    final int offsetIndex = (v.indexOf("+") != -1) ? v.indexOf("+") : v.lastIndexOf("-");
	    final DateTimeZone timezone = DateTimeZone.forID(v.substring(offsetIndex));
	    dateTime = new DateTime(v, timezone);
	} else {
	    throw new IllegalArgumentException(DATE_IN_UNPARSABLE_FORMAT + v);
	}

	return dateTime;
    }

    public static String marshal(final DateTime v) {
	return (v == null) ? "" : v.toString();
    }
}