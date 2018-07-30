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
 * <p>Java class for FuelPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuelPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prePaidFuelAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contentDetails" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelPreferences", propOrder = {
    "prePaidFuelAcceptance",
    "contentName",
    "contentDetails"
})
public class FuelPreferences
    implements Serializable
{

    protected boolean prePaidFuelAcceptance;
    @XmlElement(required = true)
    protected String contentName;
    @XmlElement(required = true)
    protected String contentDetails;

    /**
     * Gets the value of the prePaidFuelAcceptance property.
     * 
     */
    public boolean isPrePaidFuelAcceptance() {
        return prePaidFuelAcceptance;
    }

    /**
     * Sets the value of the prePaidFuelAcceptance property.
     * 
     */
    public void setPrePaidFuelAcceptance(boolean value) {
        this.prePaidFuelAcceptance = value;
    }

    /**
     * Gets the value of the contentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentName() {
        return contentName;
    }

    /**
     * Sets the value of the contentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentName(String value) {
        this.contentName = value;
    }

    /**
     * Gets the value of the contentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDetails() {
        return contentDetails;
    }

    /**
     * Sets the value of the contentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDetails(String value) {
        this.contentDetails = value;
    }

}