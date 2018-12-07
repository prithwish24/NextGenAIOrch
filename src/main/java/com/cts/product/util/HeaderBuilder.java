package com.cts.product.util;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.HttpHeaders;

public class HeaderBuilder {

    public static HttpHeaders createHeaders(Map<String, String> headers) {
	HttpHeaders httpHeaders = new HttpHeaders();

	if (headers != null && !headers.isEmpty()) {
	    Set<Entry<String, String>> entrySet = headers.entrySet();
	    for (Entry<String, String> entry : entrySet) {
		if (headers.containsKey("accept-language")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		} else if (headers.containsKey("country-of-residence-code")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		} else if (headers.containsKey("ehi-api-key")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		} else if (headers.containsKey("correlation_id")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		} else if (headers.containsKey("content-type")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		} else if (headers.containsKey("Ehi-Auth-Token")) {
		    httpHeaders.add(entry.getKey(), entry.getValue());
		}
	    }
	}
	return httpHeaders;
    }
}
