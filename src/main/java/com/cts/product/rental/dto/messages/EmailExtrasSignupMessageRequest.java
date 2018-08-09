//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.PasswordReset;


/**
 * <p>Java class for EmailExtrasSignupMessageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailExtrasSignupMessageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.messages/}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mailTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailExtras" type="{http://com.ehi.gbo.rental.dto.common/}PasswordReset"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailExtrasSignupMessageRequest", propOrder = {
    "mailTo",
    "emailExtras"
})
public class EmailExtrasSignupMessageRequest
    extends Request
    implements Serializable
{

    @XmlElement(required = true)
    protected String mailTo;
    @XmlElement(required = true)
    protected PasswordReset emailExtras;

    /**
     * Gets the value of the mailTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailTo() {
        return mailTo;
    }

    /**
     * Sets the value of the mailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailTo(String value) {
        this.mailTo = value;
    }

    /**
     * Gets the value of the emailExtras property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordReset }
     *     
     */
    public PasswordReset getEmailExtras() {
        return emailExtras;
    }

    /**
     * Sets the value of the emailExtras property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordReset }
     *     
     */
    public void setEmailExtras(PasswordReset value) {
        this.emailExtras = value;
    }

}