package com.cts.product.aiagent.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class OutputResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	public enum Status {SUCCESS, ERROR};
	
	@JsonIgnore	private ErrorType error; 		// LOGGING purpose onlys
	@JsonIgnore	private String status;
	@JsonIgnore	private String session;
	
	@JsonProperty("fulfillmentText")		private String fulfillmentText;
	@JsonProperty("source")					private String source;
	@JsonProperty("outputContexts")			private List<OutputContext> outputContexts;
	@JsonProperty("fulfillmentMessages")	private List<FulfillmentMessage> fulfillmentMessages;
	@JsonProperty("followupEventInput") 	private FollowupEventInput followupEvent;
	
	
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
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<OutputContext> getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(List<OutputContext> outputContexts) {
		this.outputContexts = outputContexts;
	}
	public void addOutputContext(OutputContext outputContext) {
		if (this.outputContexts == null) 
			this.outputContexts = new ArrayList<>();
		this.outputContexts.add(outputContext);
	}
	public List<FulfillmentMessage> getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	public void addFulfillmentMessage(FulfillmentMessage fulfillmentMessage) {
		if (this.fulfillmentMessages == null) 
			this.fulfillmentMessages = new ArrayList<>();
		this.fulfillmentMessages.add(fulfillmentMessage);
	}
	public FollowupEventInput getFollowupEvent() {
		return followupEvent;
	}
	public void setFollowupEvent(FollowupEventInput followupEvent) {
		this.followupEvent = followupEvent;
	}
	
}
