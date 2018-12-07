//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This will have redirect urls that client needs to show to users in order to perform certain
 *                 operations.
 *             
 * 
 * <p>Java class for RedirectUrl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedirectUrl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="webRedirectUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobileRedirectUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedirectUrl", propOrder = {
    "webRedirectUrl",
    "mobileRedirectUrl"
})
public class RedirectUrl
    implements Serializable
{

    @XmlElement(required = true)
    protected String webRedirectUrl;
    @XmlElement(required = true)
    protected String mobileRedirectUrl;

    /**
     * Gets the value of the webRedirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebRedirectUrl() {
        return webRedirectUrl;
    }

    /**
     * Sets the value of the webRedirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebRedirectUrl(String value) {
        this.webRedirectUrl = value;
    }

    /**
     * Gets the value of the mobileRedirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileRedirectUrl() {
        return mobileRedirectUrl;
    }

    /**
     * Sets the value of the mobileRedirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileRedirectUrl(String value) {
        this.mobileRedirectUrl = value;
    }

}
