package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Parameters {
    @JsonProperty("geolocation")
    private String geoLocation;
    @JsonProperty("localtime")
    private String localTime;
    @JsonProperty("agentname")
    private String agentName;
    @JsonProperty("pickupLocation")
    private Location pickupLocation;

    // Input parameters
    @JsonProperty("airport")
    private Airport airport;
    @JsonProperty("geo-city")
    private String geoCity;
    @JsonProperty("zip-code")
    private String zipCode;
    @JsonProperty("address")
    private String address;
    @JsonProperty("date")
    private String date;
    @JsonProperty("time")
    private String time;
    @JsonProperty("car-class")
    private String carclass;
    @JsonProperty("duration")
    private RentDuration duration;
    @JsonProperty("date-period")
    private String datePeriod;
    @JsonProperty("username")
    private String userName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("remember_credentials")
    private boolean rememberCredentials;
    @JsonProperty("accept_decline_version")
    private String acceptDeclineVersion;
    @JsonProperty("auth_token")
    private String authToken;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("fullname")
    private String fullName;
    @JsonProperty("phone_number")
    private String phoneNumber;

    // Output parameters
    @JsonProperty("pickup-branchcode")
    private String branchCode;
    @JsonProperty("gbo-sessionid")
    private String gboSessionId;

    public String getGeoLocation() {
	return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
	this.geoLocation = geoLocation;
    }

    public String getLocalTime() {
	return localTime;
    }

    public void setLocalTime(String localTime) {
	this.localTime = localTime;
    }

    public String getAgentName() {
	return agentName;
    }

    public void setAgentName(String agentName) {
	this.agentName = agentName;
    }

    public Location getPickupLocation() {
	return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation) {
	this.pickupLocation = pickupLocation;
    }

    public String getGeoCity() {
	return geoCity;
    }

    public void setGeoCity(String geoCity) {
	this.geoCity = geoCity;
    }

    public Airport getAirport() {
	return airport;
    }

    public void setAirport(Airport airport) {
	this.airport = airport;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getDate() {
	return date;
    }

    public void setDate(String date) {
	this.date = date;
    }

    public String getTime() {
	return time;
    }

    public void setTime(String time) {
	this.time = time;
    }

    public String getCarclass() {
	return carclass;
    }

    public void setCarclass(String carclass) {
	this.carclass = carclass;
    }

    public RentDuration getDuration() {
	return duration;
    }

    public void setDuration(RentDuration duration) {
	this.duration = duration;
    }

    public String getDatePeriod() {
	return datePeriod;
    }

    public void setDatePeriod(String datePeriod) {
	this.datePeriod = datePeriod;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String getBranchCode() {
	return branchCode;
    }

    public void setBranchCode(String branchCode) {
	this.branchCode = branchCode;
    }

    public String getGboSessionId() {
	return gboSessionId;
    }

    public void setGboSessionId(String gboSessionId) {
	this.gboSessionId = gboSessionId;
    }

    public boolean isRememberCredentials() {
	return rememberCredentials;
    }

    public void setRememberCredentials(boolean rememberCredentials) {
	this.rememberCredentials = rememberCredentials;
    }

    public String getAcceptDeclineVersion() {
	return acceptDeclineVersion;
    }

    public void setAcceptDeclineVersion(String acceptDeclineVersion) {
	this.acceptDeclineVersion = acceptDeclineVersion;
    }

    public String getAuthToken() {
	return authToken;
    }

    public void setAuthToken(String authToken) {
	this.authToken = authToken;
    }

}
