package com.cts.product.aiagent.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BaseOutputData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("responseId") 	private String responseId;
	@JsonProperty("queryResult") 	private String queryResult;
	
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}
	
	
}
