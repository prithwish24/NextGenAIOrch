package com.cts.product.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

public class RestTemplateBuilder {

    public static RestTemplate getRestTemplate() {
	RestTemplate restTemplate = new RestTemplate();
	List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
	ObjectMapper objMapper = getObjectMapper();
	jsonMessageConverter.setObjectMapper(objMapper);
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
}
