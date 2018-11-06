package com.cts.product.aiagent.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public abstract class BaseInputData {
	@JsonProperty("id") 			private String id;
	@JsonProperty("timestamp")		private String timestamp;
	@JsonProperty("sessionId")		private String sessionId;
	@JsonProperty("source")			private String source;
	@JsonProperty("languageCode")	private String languageCode;
	@JsonProperty("fulfillmentText")private String fulfillmentText;
	@JsonProperty("action")			private String action;
	@JsonProperty("queryText")		private String queryText;
	
	@JsonProperty("intent")					private Intent intent;
	@JsonProperty("parameters")				private Parameter parameters;
	@JsonProperty("outputContexts")			private List<OutputContext> outputContexts;
	@JsonProperty("fulfillmentMessages")	private List<FulfillmentMessage> fulfillmentMessages;
	//private String sentimentAnalysisResult;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public Parameter getParameters() {
		return parameters;
	}
	public void setParameters(Parameter parameters) {
		this.parameters = parameters;
	}
	public List<OutputContext> getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(List<OutputContext> outputContexts) {
		this.outputContexts = outputContexts;
	}
	public List<FulfillmentMessage> getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	
}
