//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.pricing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.Coupon;


/**
 * <p>Java class for CouponDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.common/}Coupon"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailedDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rentalMinimumLength" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rentalMaximumLength" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="participatingVehicles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="participatingCountries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetails", propOrder = {
    "detailedDescription",
    "termsAndConditions",
    "rentalMinimumLength",
    "rentalMaximumLength",
    "expirationDate",
    "participatingVehicles",
    "participatingCountries"
})
public class CouponDetails
    extends Coupon
    implements Serializable
{

    @XmlElement(required = true)
    protected String detailedDescription;
    @XmlElement(required = true)
    protected String termsAndConditions;
    protected long rentalMinimumLength;
    protected long rentalMaximumLength;
    @XmlElement(required = true)
    protected String expirationDate;
    @XmlElement(required = true)
    protected List<String> participatingVehicles;
    @XmlElement(required = true)
    protected List<String> participatingCountries;

    /**
     * Gets the value of the detailedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * Sets the value of the detailedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedDescription(String value) {
        this.detailedDescription = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the rentalMinimumLength property.
     * 
     */
    public long getRentalMinimumLength() {
        return rentalMinimumLength;
    }

    /**
     * Sets the value of the rentalMinimumLength property.
     * 
     */
    public void setRentalMinimumLength(long value) {
        this.rentalMinimumLength = value;
    }

    /**
     * Gets the value of the rentalMaximumLength property.
     * 
     */
    public long getRentalMaximumLength() {
        return rentalMaximumLength;
    }

    /**
     * Sets the value of the rentalMaximumLength property.
     * 
     */
    public void setRentalMaximumLength(long value) {
        this.rentalMaximumLength = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the participatingVehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingVehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParticipatingVehicles() {
        if (participatingVehicles == null) {
            participatingVehicles = new ArrayList<String>();
        }
        return this.participatingVehicles;
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

}
