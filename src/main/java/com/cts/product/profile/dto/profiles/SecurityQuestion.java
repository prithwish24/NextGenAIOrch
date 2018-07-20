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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SecurityQuestionAndAnswer.</p>
 * 
 * <p>Java class for SecurityQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityQuestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securityQuestionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="securityQuestionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityQuestion", propOrder = {
    "securityQuestionCode",
    "securityQuestionDescription"
})
@XmlSeeAlso({
    SecurityQuestionAnswer.class
})
public class SecurityQuestion
    implements Serializable
{

    @XmlElement(required = true)
    protected String securityQuestionCode;
    @XmlElement(required = true)
    protected String securityQuestionDescription;

    /**
     * Gets the value of the securityQuestionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestionCode() {
        return securityQuestionCode;
    }

    /**
     * Sets the value of the securityQuestionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestionCode(String value) {
        this.securityQuestionCode = value;
    }

    /**
     * Gets the value of the securityQuestionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityQuestionDescription() {
        return securityQuestionDescription;
    }

    /**
     * Sets the value of the securityQuestionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityQuestionDescription(String value) {
        this.securityQuestionDescription = value;
    }

}
