package com.cts.product.profile.dto.messages;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.TermsAndConditions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription", propOrder = { "status", "enrollDate", "startDate", "endDate", "termsAndConditions" })
public class Subscription implements Serializable {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String enrollDate;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String endDate;
    @XmlElement(required = true)
    protected TermsAndConditions termsAndConditions;

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public String getEnrollDate() {
	return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
	this.enrollDate = enrollDate;
    }

    public String getStartDate() {
	return startDate;
    }

    public void setStartDate(String startDate) {
	this.startDate = startDate;
    }

    public String getEndDate() {
	return endDate;
    }

    public void setEndDate(String endDate) {
	this.endDate = endDate;
    }

    public TermsAndConditions getTermsAndConditions() {
	return termsAndConditions;
    }

    public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
	this.termsAndConditions = termsAndConditions;
    }

}
