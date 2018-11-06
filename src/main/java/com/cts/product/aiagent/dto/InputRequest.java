package com.cts.product.aiagent.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class InputRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("responseId")		private String responseId;
	@JsonProperty("session")		private String session;
	@JsonProperty("queryResult")	private QueryResult queryResult;
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
}
