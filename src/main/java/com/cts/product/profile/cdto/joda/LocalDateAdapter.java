package com.cts.product.profile.cdto.joda;

import org.joda.time.LocalDate;

public class LocalDateAdapter {
    public static LocalDate unmarshal(String v) {
	return new LocalDate(v);
    }

    public static String marshal(LocalDate v) {
	return v == null ? "" : v.toString();
    }
}