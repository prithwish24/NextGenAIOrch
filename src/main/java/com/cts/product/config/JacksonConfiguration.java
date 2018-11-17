package com.cts.product.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.couchbase.client.deps.com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

@Configuration
public class JacksonConfiguration {
    
	@Bean (name = {"jackson2ObjectMapperBuilder", "defaultObjectMapper"})
    public ObjectMapper jackson2ObjectMapperBuilder() {
    	ObjectMapper objMapper = new ObjectMapper();
    	objMapper.setSerializationInclusion(Include.NON_NULL);
    	objMapper.setSerializationInclusion(Include.NON_EMPTY);
    	objMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    	objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	objMapper.setDateFormat(new ISO8601DateFormat());
    	return objMapper;
    }
    
    
    public String toJson(final Object instance) throws IOException {
      return jackson2ObjectMapperBuilder().writeValueAsString(instance);
    }

    public <T> T fromJson(final String json, final Class<T> clazz) throws IOException {
      return jackson2ObjectMapperBuilder().readValue(json, clazz);
    }
    
    public <T> T fromJsonNode(final TreeNode jsonNode, final Class<T> clazz) throws IOException {
        return jackson2ObjectMapperBuilder().treeToValue(jsonNode, clazz);
    }
}