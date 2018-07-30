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
 * <p>Contains basic information from a
 *                 customer profile. Contains select information related to a loyalty
 *                 profile, user information, and any associated corporate
 *                 account.</p>
 *             
 * 
 * <p>Java class for BasicProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://com.ehi.gbo.profile.dto.profiles/}lastName"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.profile.dto.profiles/}firstName"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loyaltyData" type="{http://com.ehi.gbo.profile.dto.profiles/}LoyaltyData"/&gt;
 *         &lt;element name="debitCardAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="levelOfServicesCodelist" type="{http://com.ehi.gbo.profile.dto.profiles/}LevelOfServices" maxOccurs="unbounded"/&gt;
 *         &lt;element name="customerSourceList" type="{http://com.ehi.gbo.profile.dto.profiles/}CustomerSource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="redemptionDaysLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="individualId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicProfile", propOrder = {
    "lastName",
    "firstName",
    "dateOfBirth",
    "age",
    "loyaltyData",
    "debitCardAllowedIndicator",
    "levelOfServicesCodelists",
    "customerSourceLists",
    "redemptionDaysLimit",
    "individualId"
})
public class BasicProfile
    implements Serializable
{

    @XmlElement(namespace = "http://com.ehi.gbo.profile.dto.profiles/", required = true)
    protected String lastName;
    @XmlElement(namespace = "http://com.ehi.gbo.profile.dto.profiles/", required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String dateOfBirth;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer age;
    @XmlElement(required = true)
    protected LoyaltyData loyaltyData;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean debitCardAllowedIndicator;
    @XmlElement(name = "levelOfServicesCodelist", required = true)
    protected List<LevelOfServices> levelOfServicesCodelists;
    @XmlElement(name = "customerSourceList", required = true)
    protected List<CustomerSource> customerSourceLists;
    protected int redemptionDaysLimit;
    @XmlElement(required = true)
    protected String individualId;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the loyaltyData property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyData }
     *     
     */
    public LoyaltyData getLoyaltyData() {
        return loyaltyData;
    }

    /**
     * Sets the value of the loyaltyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyData }
     *     
     */
    public void setLoyaltyData(LoyaltyData value) {
        this.loyaltyData = value;
    }

    /**
     * Gets the value of the debitCardAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDebitCardAllowedIndicator() {
        return debitCardAllowedIndicator;
    }

    /**
     * Sets the value of the debitCardAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebitCardAllowedIndicator(Boolean value) {
        this.debitCardAllowedIndicator = value;
    }

    /**
     * Gets the value of the levelOfServicesCodelists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelOfServicesCodelists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelOfServicesCodelists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelOfServices }
     * 
     * 
     */
    public List<LevelOfServices> getLevelOfServicesCodelists() {
        if (levelOfServicesCodelists == null) {
            levelOfServicesCodelists = new ArrayList<LevelOfServices>();
        }
        return this.levelOfServicesCodelists;
    }

    /**
     * Gets the value of the customerSourceLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSourceLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSourceLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSource }
     * 
     * 
     */
    public List<CustomerSource> getCustomerSourceLists() {
        if (customerSourceLists == null) {
            customerSourceLists = new ArrayList<CustomerSource>();
        }
        return this.customerSourceLists;
    }

    /**
     * Gets the value of the redemptionDaysLimit property.
     * 
     */
    public int getRedemptionDaysLimit() {
        return redemptionDaysLimit;
    }

    /**
     * Sets the value of the redemptionDaysLimit property.
     * 
     */
    public void setRedemptionDaysLimit(int value) {
        this.redemptionDaysLimit = value;
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

}