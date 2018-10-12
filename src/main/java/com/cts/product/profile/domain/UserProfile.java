package com.cts.product.profile.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "firstName", "lastName", "username", "mobileNo", "emailId", "password", "dateOfBirth",
	"carTypePref", "preferences" })
public class UserProfile {

    private String firstName;
    private String lastName;
    private String username;
    private String mobileNo;
    private String emailId;
    private String password;
    private String dateOfBirth;
    private String authToken;
    private String individualId;
    private String loyaltyNumber;
    private String loyaltyProgram;
    private String encryptedCredential;
    private Boolean creditCardNearExpiration;
    private Boolean creditCardExpired;
    private Boolean driverLicenseExpired;
    private Boolean driverLicenseNearExpiration;

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

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getMobileNo() {
	return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
    }

    public String getEmailId() {
	return emailId;
    }

    public void setEmailId(String emailId) {
	this.emailId = emailId;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getDateOfBirth() {
	return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    public String getAuthToken() {
	return authToken;
    }

    public void setAuthToken(String authToken) {
	this.authToken = authToken;
    }

    public String getIndividualId() {
	return individualId;
    }

    public void setIndividualId(String individualId) {
	this.individualId = individualId;
    }

    public String getLoyaltyNumber() {
	return loyaltyNumber;
    }

    public void setLoyaltyNumber(String loyaltyNumber) {
	this.loyaltyNumber = loyaltyNumber;
    }

    public String getLoyaltyProgram() {
	return loyaltyProgram;
    }

    public void setLoyaltyProgram(String loyaltyProgram) {
	this.loyaltyProgram = loyaltyProgram;
    }

    public String getEncryptedCredential() {
	return encryptedCredential;
    }

    public void setEncryptedCredential(String encryptedCredential) {
	this.encryptedCredential = encryptedCredential;
    }

    public boolean isCreditCardNearExpiration() {
	return creditCardNearExpiration;
    }

    public void setCreditCardNearExpiration(Boolean creditCardNearExpiration) {
	this.creditCardNearExpiration = creditCardNearExpiration;
    }

    public Boolean isCreditCardExpired() {
	return creditCardExpired;
    }

    public void setCreditCardExpired(Boolean creditCardExpired) {
	this.creditCardExpired = creditCardExpired;
    }

    public Boolean isDriverLicenseExpired() {
	return driverLicenseExpired;
    }

    public void setDriverLicenseExpired(Boolean driverLicenseExpired) {
	this.driverLicenseExpired = driverLicenseExpired;
    }

    public Boolean isDriverLicenseNearExpiration() {
	return driverLicenseNearExpiration;
    }

    public void setDriverLicenseNearExpiration(Boolean driverLicenseNearExpiration) {
	this.driverLicenseNearExpiration = driverLicenseNearExpiration;
    }

}
