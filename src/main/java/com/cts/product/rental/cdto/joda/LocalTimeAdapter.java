package com.cts.product.rental.cdto.joda;

import org.joda.time.LocalTime;

public class LocalTimeAdapter {
    public static LocalTime unmarshal(String v) {
	return new LocalTime(v);
    }

    public static String marshal(LocalTime v) {
	return v.toString();
    }
}