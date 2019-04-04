package com.cts.product.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class RestTemplateBuilder {

    public static RestTemplate getRestTemplate() {
	RestTemplate restTemplate = new RestTemplate(
		new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
	restTemplate.setInterceptors(Collections.singletonList(new LoggingInterceptor()));
	List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
	ObjectMapper objMapper = getObjectMapper();
	jsonMessageConverter.setObjectMapper(objMapper);
	jsonMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
	messageConverters.add(jsonMessageConverter);
	restTemplate.setMessageConverters(messageConverters);
	return restTemplate;
    }

    public static ObjectMapper getObjectMapper() {
	ObjectMapper objMapper = new ObjectMapper();
	objMapper.setSerializationInclusion(Include.NON_NULL);
	objMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	return objMapper;
    }

    static class LoggingInterceptor implements ClientHttpRequestInterceptor {
	static final Logger log = LoggerFactory
		.getLogger("com.cts.product.util.RestTemplateBuilder.LoggingInterceptor");

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
		throws IOException {
	    logRequest(request, body);
	    ClientHttpResponse response = execution.execute(request, body);
	    logResponse(response);
	    return response;
	}

	private void logRequest(HttpRequest request, byte[] body) throws IOException {
	    log.info("===========================request begin================================================");
	    log.info("URI         : {}", request.getURI());
	    if (log.isDebugEnabled()) {
		log.debug("Method      : {}", request.getMethod());
		log.debug("Headers     : {}", request.getHeaders());
		log.debug("Request body: {}", new String(body, "UTF-8"));
		log.debug("==========================request end================================================");
	    }
	}

	private void logResponse(ClientHttpResponse response) throws IOException {
	    log.info("============================response begin==========================================");
	    log.info("Status code  : {}", response.getStatusCode());
	    log.info("Status text  : {}", response.getStatusText());
	    if (log.isDebugEnabled()) {
		log.debug("Headers      : {}", response.getHeaders());
		log.debug("Response body: {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
		log.debug("=======================response end=================================================");
	    }
	}

    }

}
