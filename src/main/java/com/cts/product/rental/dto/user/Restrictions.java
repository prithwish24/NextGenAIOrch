//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.enums.PromotionTypeEnum;


/**
 * <p>Java class for Restrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rentalMinimumLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rentalMaximumLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="validPromotionDisplayOnTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validPromotionDisplayOffTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validPickupStartTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validPickupEndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validReturnTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blackOutDates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promotionType" type="{http://com.ehi.gbo.rental.dto.common.enums/}PromotionTypeEnum"/&gt;
 *         &lt;element name="participatingCountries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participatingStates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participatingCities" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restrictions", propOrder = {
    "rentalMinimumLength",
    "rentalMaximumLength",
    "validPromotionDisplayOnTime",
    "validPromotionDisplayOffTime",
    "validPickupStartTime",
    "validPickupEndTime",
    "validReturnTime",
    "blackOutDates",
    "promotionType",
    "participatingCountries",
    "participatingStates",
    "participatingCities"
})
public class Restrictions
    implements Serializable
{

    protected int rentalMinimumLength;
    protected int rentalMaximumLength;
    @XmlElement(required = true)
    protected String validPromotionDisplayOnTime;
    @XmlElement(required = true)
    protected String validPromotionDisplayOffTime;
    @XmlElement(required = true)
    protected String validPickupStartTime;
    @XmlElement(required = true)
    protected String validPickupEndTime;
    @XmlElement(required = true)
    protected String validReturnTime;
    protected List<String> blackOutDates;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PromotionTypeEnum promotionType;
    protected List<String> participatingCountries;
    protected List<String> participatingStates;
    protected List<String> participatingCities;

    /**
     * Gets the value of the rentalMinimumLength property.
     * 
     */
    public int getRentalMinimumLength() {
        return rentalMinimumLength;
    }

    /**
     * Sets the value of the rentalMinimumLength property.
     * 
     */
    public void setRentalMinimumLength(int value) {
        this.rentalMinimumLength = value;
    }

    /**
     * Gets the value of the rentalMaximumLength property.
     * 
     */
    public int getRentalMaximumLength() {
        return rentalMaximumLength;
    }

    /**
     * Sets the value of the rentalMaximumLength property.
     * 
     */
    public void setRentalMaximumLength(int value) {
        this.rentalMaximumLength = value;
    }

    /**
     * Gets the value of the validPromotionDisplayOnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPromotionDisplayOnTime() {
        return validPromotionDisplayOnTime;
    }

    /**
     * Sets the value of the validPromotionDisplayOnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPromotionDisplayOnTime(String value) {
        this.validPromotionDisplayOnTime = value;
    }

    /**
     * Gets the value of the validPromotionDisplayOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPromotionDisplayOffTime() {
        return validPromotionDisplayOffTime;
    }

    /**
     * Sets the value of the validPromotionDisplayOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPromotionDisplayOffTime(String value) {
        this.validPromotionDisplayOffTime = value;
    }

    /**
     * Gets the value of the validPickupStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPickupStartTime() {
        return validPickupStartTime;
    }

    /**
     * Sets the value of the validPickupStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPickupStartTime(String value) {
        this.validPickupStartTime = value;
    }

    /**
     * Gets the value of the validPickupEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPickupEndTime() {
        return validPickupEndTime;
    }

    /**
     * Sets the value of the validPickupEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPickupEndTime(String value) {
        this.validPickupEndTime = value;
    }

    /**
     * Gets the value of the validReturnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidReturnTime() {
        return validReturnTime;
    }

    /**
     * Sets the value of the validReturnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidReturnTime(String value) {
        this.validReturnTime = value;
    }

    /**
     * Gets the value of the blackOutDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackOutDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackOutDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlackOutDates() {
        if (blackOutDates == null) {
            blackOutDates = new ArrayList<String>();
        }
        return this.blackOutDates;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionTypeEnum }
     *     
     */
    public PromotionTypeEnum getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionTypeEnum }
     *     
     */
    public void setPromotionType(PromotionTypeEnum value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the participatingCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipatingCountries() {
        if (participatingCountries == null) {
            participatingCountries = new ArrayList<String>();
        }
        return this.participatingCountries;
    }

    /**
     * Gets the value of the participatingStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipatingStates() {
        if (participatingStates == null) {
            participatingStates = new ArrayList<String>();
        }
        return this.participatingStates;
    }

    /**
     * Gets the value of the participatingCities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingCities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingCities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipatingCities() {
        if (participatingCities == null) {
            participatingCities = new ArrayList<String>();
        }
        return this.participatingCities;
    }

}