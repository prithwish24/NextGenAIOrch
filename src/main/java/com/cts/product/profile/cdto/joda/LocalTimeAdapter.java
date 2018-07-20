package com.cts.product.profile.cdto.joda;

import org.joda.time.LocalTime;

public class LocalTimeAdapter {
    public static LocalTime unmarshal(String v) {
	return new LocalTime(v);
    }

    public static String marshal(LocalTime v) {
	return v.toString();
    }
}