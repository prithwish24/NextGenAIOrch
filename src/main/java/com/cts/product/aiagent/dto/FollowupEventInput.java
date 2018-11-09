package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FollowupEventInput {
	@JsonProperty("name") 			private String name;
	@JsonProperty("languageCode") 	private String languageCode;
	@JsonProperty("parameters") 	private String parameters;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

}
