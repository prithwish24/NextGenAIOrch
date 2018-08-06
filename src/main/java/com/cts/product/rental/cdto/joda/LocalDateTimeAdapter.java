package com.cts.product.rental.cdto.joda;

import org.joda.time.LocalDateTime;

public class LocalDateTimeAdapter {
    public static LocalDateTime unmarshal(String v) {
	return new LocalDateTime(v);
    }

    public static String marshal(LocalDateTime v) {
	return v.toString();
    }
}