//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.PaymentProfile;


/**
 * <p>Java class for PaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}PaymentProfile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponse", propOrder = {
    "paymentProfile"
})
public class PaymentResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected PaymentProfile paymentProfile;

    /**
     * Gets the value of the paymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProfile }
     *     
     */
    public PaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Sets the value of the paymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProfile }
     *     
     */
    public void setPaymentProfile(PaymentProfile value) {
        this.paymentProfile = value;
    }

}