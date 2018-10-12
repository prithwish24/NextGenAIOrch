package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

@Configuration
public class JacksonConfiguration {

    @Bean
    public ObjectMapper jackson2ObjectMapperBuilder() {
	ObjectMapper objMapper = new ObjectMapper();
	objMapper.setSerializationInclusion(Include.NON_NULL);
	objMapper.setSerializationInclusion(Include.NON_EMPTY);
	objMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	return objMapper;
    }
}