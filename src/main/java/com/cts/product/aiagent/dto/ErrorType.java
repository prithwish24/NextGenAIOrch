package com.cts.product.aiagent.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Error handling model. Below are the error ranges.
 * <ul>
 * 		<li> 0 - Success, No error </li>
 * 		<li> 1 to 99 - Reserved for future use </li>
 * 		<li> 100 to 199 - Application related error </li>
 * 		<li> 900 to 999 - Error related to request and response structure </li>
 * </ul>
 * @author 222273 Prithwish Ghosh
 *
 */
public class ErrorType {
	private int code;
	private String message;
	
	public ErrorType (int code) {
		this.code = code;
	}
	public ErrorType (int code, String message) {
		this (code);
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}
}
