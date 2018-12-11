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
		httpHeaders.add(entry.getKey(), entry.getValue());
	    }
	}
	if (httpHeaders.containsKey(HttpHeaders.ACCEPT_ENCODING)) {
	    httpHeaders.remove("accept-encoding");
	}
	if (httpHeaders.containsKey(HttpHeaders.ACCEPT_CHARSET)) {
	    httpHeaders.remove("accept-charset");
	}
	if (httpHeaders.containsKey(HttpHeaders.AUTHORIZATION)) {
	    httpHeaders.remove("authorization");
	}
	return httpHeaders;
    }
}
