//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.profiles;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}BasicProfile"/&gt;
 *         &lt;element name="customerDetails" type="{http://com.ehi.gbo.profile.dto.profiles/}ContractDetails"/&gt;
 *         &lt;element name="individualId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.profile.dto.profiles/}userName"/&gt;
 *         &lt;element name="townOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "basicProfile",
    "customerDetails",
    "individualId",
    "userName",
    "townOfBirth",
    "defaultContract"
})
public class Profile
    implements Serializable
{

    @XmlElement(required = true)
    protected BasicProfile basicProfile;
    @XmlElement(required = true)
    protected ContractDetails customerDetails;
    @XmlElement(required = true)
    protected String individualId;
    @XmlElement(namespace = "http://com.ehi.gbo.profile.dto.profiles/", required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String townOfBirth;
    protected boolean defaultContract;

    /**
     * Gets the value of the basicProfile property.
     * 
     * @return
     *     possible object is
     *     {@link BasicProfile }
     *     
     */
    public BasicProfile getBasicProfile() {
        return basicProfile;
    }

    /**
     * Sets the value of the basicProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicProfile }
     *     
     */
    public void setBasicProfile(BasicProfile value) {
        this.basicProfile = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetails }
     *     
     */
    public ContractDetails getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the value of the customerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetails }
     *     
     */
    public void setCustomerDetails(ContractDetails value) {
        this.customerDetails = value;
    }

    /**
     * Gets the value of the individualId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualId() {
        return individualId;
    }

    /**
     * Sets the value of the individualId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualId(String value) {
        this.individualId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the townOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownOfBirth() {
        return townOfBirth;
    }

    /**
     * Sets the value of the townOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownOfBirth(String value) {
        this.townOfBirth = value;
    }

    /**
     * Gets the value of the defaultContract property.
     * 
     */
    public boolean isDefaultContract() {
        return defaultContract;
    }

    /**
     * Sets the value of the defaultContract property.
     * 
     */
    public void setDefaultContract(boolean value) {
        this.defaultContract = value;
    }

}
