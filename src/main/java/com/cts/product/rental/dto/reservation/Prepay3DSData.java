//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.reservation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prepay3DSData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prepay3DSData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="perform3ds" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="acsUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paReq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prepay3DSData", propOrder = {
    "perform3Ds",
    "acsUrl",
    "paReq"
})
public class Prepay3DSData
    implements Serializable
{

    @XmlElement(name = "perform3ds")
    protected boolean perform3Ds;
    @XmlElement(required = true)
    protected String acsUrl;
    @XmlElement(required = true)
    protected String paReq;

    /**
     * Gets the value of the perform3Ds property.
     * 
     */
    public boolean isPerform3Ds() {
        return perform3Ds;
    }

    /**
     * Sets the value of the perform3Ds property.
     * 
     */
    public void setPerform3Ds(boolean value) {
        this.perform3Ds = value;
    }

    /**
     * Gets the value of the acsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsUrl() {
        return acsUrl;
    }

    /**
     * Sets the value of the acsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsUrl(String value) {
        this.acsUrl = value;
    }

    /**
     * Gets the value of the paReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaReq() {
        return paReq;
    }

    /**
     * Sets the value of the paReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaReq(String value) {
        this.paReq = value;
    }

}
