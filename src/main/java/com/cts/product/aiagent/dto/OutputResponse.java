package com.cts.product.aiagent.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class OutputResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	public enum Status {SUCCESS, ERROR};
	
	private ErrorType error;
	private String status;
	private String responseId;
	private String session;
	private QueryResult queryResult;
	private FollowupEventInput followupEvent;
	
	
	public OutputResponse() {
		this.error = new ErrorType(0);
		this.status = Status.SUCCESS.name();
	}
	public void setError(int code, String desc) {
		this.error = new ErrorType(code, desc);
		this.status = Status.ERROR.name();
	}

	public ErrorType getError() {
		return error;
	}
	public String getStatus() {
		return status;
	}
	public String getResponseId() {
		return responseId;
	}
	public String getSession() {
		return session;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public FollowupEventInput getFollowupEvent() {
		return followupEvent;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	public void setFollowupEvent(FollowupEventInput followupEvent) {
		this.followupEvent = followupEvent;
	}
	
}
