//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecryptRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecryptRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.messages/}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="encryptedToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecryptRequest", propOrder = {
    "encryptedToken"
})
public class DecryptRequest
    extends Request
    implements Serializable
{

    @XmlElement(required = true)
    protected String encryptedToken;

    /**
     * Gets the value of the encryptedToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedToken() {
        return encryptedToken;
    }

    /**
     * Sets the value of the encryptedToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedToken(String value) {
        this.encryptedToken = value;
    }

}
