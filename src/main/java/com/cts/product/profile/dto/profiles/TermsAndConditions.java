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
 * Terms and conditions accepted flag and version
 *             
 * 
 * <p>Java class for TermsAndConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermsAndConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptDecline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="acceptDeclineVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acceptDeclineDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermsAndConditions", propOrder = {
    "acceptDecline",
    "acceptDeclineVersion",
    "acceptDeclineDate"
})
public class TermsAndConditions
    implements Serializable
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean acceptDecline;
    @XmlElement(required = true)
    protected String acceptDeclineVersion;
    @XmlElement(required = true)
    protected String acceptDeclineDate;

    /**
     * Gets the value of the acceptDecline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAcceptDecline() {
        return acceptDecline;
    }

    /**
     * Sets the value of the acceptDecline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptDecline(Boolean value) {
        this.acceptDecline = value;
    }

    /**
     * Gets the value of the acceptDeclineVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptDeclineVersion() {
        return acceptDeclineVersion;
    }

    /**
     * Sets the value of the acceptDeclineVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptDeclineVersion(String value) {
        this.acceptDeclineVersion = value;
    }

    /**
     * Gets the value of the acceptDeclineDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptDeclineDate() {
        return acceptDeclineDate;
    }

    /**
     * Sets the value of the acceptDeclineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptDeclineDate(String value) {
        this.acceptDeclineDate = value;
    }

}
