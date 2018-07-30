//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.profiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is to return the additional data elements in the response which is not either part of the
 *                 response resource nor a part of the messages. These data will indicate special processing in the client side.
 *             
 * 
 * <p>Java class for AdditionalDataInResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataInResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailUnique" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="readOnlyRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expediteEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="subscriptionEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="branchEnrolled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mraComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="firstTimeRental" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="partialProfile" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="encryptedCredential" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passwordExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditCardNearExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="creditCardExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="driverLicenseExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="driverLicenseNearExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="unsignedCoverage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contractualPreferencesModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="partialProfileStatus" type="{http://com.ehi.gbo.profile.dto.profiles/}PartialProfileStatus"/&gt;
 *         &lt;element name="dnrApprovedDepartmentPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ociEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ociIndividualStatus" type="{http://com.ehi.gbo.profile.dto.profiles/}OCIIndividualStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataInResponse", propOrder = {
    "emailUnique",
    "readOnlyRestrictions",
    "expediteEligible",
    "subscriptionEligible",
    "editable",
    "branchEnrolled",
    "mraComplete",
    "firstTimeRental",
    "partialProfile",
    "encryptedCredential",
    "authToken",
    "passwordExpirationDate",
    "creditCardNearExpiration",
    "creditCardExpired",
    "driverLicenseExpired",
    "driverLicenseNearExpiration",
    "profile",
    "unsignedCoverage",
    "contractualPreferencesModified",
    "partialProfileStatus",
    "dnrApprovedDepartmentPhone",
    "ociEligible",
    "ociIndividualStatus"
})
public class AdditionalDataInResponse
    implements Serializable
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean emailUnique;
    protected List<String> readOnlyRestrictions;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean expediteEligible;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean subscriptionEligible;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean editable;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean branchEnrolled;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean mraComplete;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean firstTimeRental;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean partialProfile;
    @XmlElement(required = true)
    protected String encryptedCredential;
    @XmlElement(required = true)
    protected String authToken;
    @XmlElement(required = true)
    protected String passwordExpirationDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean creditCardNearExpiration;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean creditCardExpired;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean driverLicenseExpired;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean driverLicenseNearExpiration;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean profile;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean unsignedCoverage;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean contractualPreferencesModified;
    @XmlElement(required = true)
    protected PartialProfileStatus partialProfileStatus;
    @XmlElement(required = true)
    protected String dnrApprovedDepartmentPhone;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean ociEligible;
    @XmlElement(required = true)
    protected OCIIndividualStatus ociIndividualStatus;

    /**
     * Gets the value of the emailUnique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEmailUnique() {
        return emailUnique;
    }

    /**
     * Sets the value of the emailUnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailUnique(Boolean value) {
        this.emailUnique = value;
    }

    /**
     * Gets the value of the readOnlyRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readOnlyRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadOnlyRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReadOnlyRestrictions() {
        if (readOnlyRestrictions == null) {
            readOnlyRestrictions = new ArrayList<String>();
        }
        return this.readOnlyRestrictions;
    }

    /**
     * Gets the value of the expediteEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpediteEligible() {
        return expediteEligible;
    }

    /**
     * Sets the value of the expediteEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpediteEligible(Boolean value) {
        this.expediteEligible = value;
    }

    /**
     * Gets the value of the subscriptionEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    /**
     * Sets the value of the subscriptionEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionEligible(Boolean value) {
        this.subscriptionEligible = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the branchEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBranchEnrolled() {
        return branchEnrolled;
    }

    /**
     * Sets the value of the branchEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchEnrolled(Boolean value) {
        this.branchEnrolled = value;
    }

    /**
     * Gets the value of the mraComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMraComplete() {
        return mraComplete;
    }

    /**
     * Sets the value of the mraComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMraComplete(Boolean value) {
        this.mraComplete = value;
    }

    /**
     * Gets the value of the firstTimeRental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFirstTimeRental() {
        return firstTimeRental;
    }

    /**
     * Sets the value of the firstTimeRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstTimeRental(Boolean value) {
        this.firstTimeRental = value;
    }

    /**
     * Gets the value of the partialProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPartialProfile() {
        return partialProfile;
    }

    /**
     * Sets the value of the partialProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialProfile(Boolean value) {
        this.partialProfile = value;
    }

    /**
     * Gets the value of the encryptedCredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedCredential() {
        return encryptedCredential;
    }

    /**
     * Sets the value of the encryptedCredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedCredential(String value) {
        this.encryptedCredential = value;
    }

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the passwordExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordExpirationDate() {
        return passwordExpirationDate;
    }

    /**
     * Sets the value of the passwordExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordExpirationDate(String value) {
        this.passwordExpirationDate = value;
    }

    /**
     * Gets the value of the creditCardNearExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCreditCardNearExpiration() {
        return creditCardNearExpiration;
    }

    /**
     * Sets the value of the creditCardNearExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCardNearExpiration(Boolean value) {
        this.creditCardNearExpiration = value;
    }

    /**
     * Gets the value of the creditCardExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCreditCardExpired() {
        return creditCardExpired;
    }

    /**
     * Sets the value of the creditCardExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditCardExpired(Boolean value) {
        this.creditCardExpired = value;
    }

    /**
     * Gets the value of the driverLicenseExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDriverLicenseExpired() {
        return driverLicenseExpired;
    }

    /**
     * Sets the value of the driverLicenseExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverLicenseExpired(Boolean value) {
        this.driverLicenseExpired = value;
    }

    /**
     * Gets the value of the driverLicenseNearExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDriverLicenseNearExpiration() {
        return driverLicenseNearExpiration;
    }

    /**
     * Sets the value of the driverLicenseNearExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverLicenseNearExpiration(Boolean value) {
        this.driverLicenseNearExpiration = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfile(Boolean value) {
        this.profile = value;
    }

    /**
     * Gets the value of the unsignedCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUnsignedCoverage() {
        return unsignedCoverage;
    }

    /**
     * Sets the value of the unsignedCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsignedCoverage(Boolean value) {
        this.unsignedCoverage = value;
    }

    /**
     * Gets the value of the contractualPreferencesModified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContractualPreferencesModified() {
        return contractualPreferencesModified;
    }

    /**
     * Sets the value of the contractualPreferencesModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractualPreferencesModified(Boolean value) {
        this.contractualPreferencesModified = value;
    }

    /**
     * Gets the value of the partialProfileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartialProfileStatus }
     *     
     */
    public PartialProfileStatus getPartialProfileStatus() {
        return partialProfileStatus;
    }

    /**
     * Sets the value of the partialProfileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialProfileStatus }
     *     
     */
    public void setPartialProfileStatus(PartialProfileStatus value) {
        this.partialProfileStatus = value;
    }

    /**
     * Gets the value of the dnrApprovedDepartmentPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnrApprovedDepartmentPhone() {
        return dnrApprovedDepartmentPhone;
    }

    /**
     * Sets the value of the dnrApprovedDepartmentPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnrApprovedDepartmentPhone(String value) {
        this.dnrApprovedDepartmentPhone = value;
    }

    /**
     * Gets the value of the ociEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOciEligible() {
        return ociEligible;
    }

    /**
     * Sets the value of the ociEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOciEligible(Boolean value) {
        this.ociEligible = value;
    }

    /**
     * Gets the value of the ociIndividualStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OCIIndividualStatus }
     *     
     */
    public OCIIndividualStatus getOciIndividualStatus() {
        return ociIndividualStatus;
    }

    /**
     * Sets the value of the ociIndividualStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCIIndividualStatus }
     *     
     */
    public void setOciIndividualStatus(OCIIndividualStatus value) {
        this.ociIndividualStatus = value;
    }

}