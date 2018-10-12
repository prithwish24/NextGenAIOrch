//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.enums.PaymentProcessorEnum;


/**
 * <p>Java class for PaymentContextData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentContextData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentProcessor" type="{http://com.cts.product.rental.dto.common.enums/}PaymentProcessorEnum"/&gt;
 *         &lt;element name="cardSubmissionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingInterfaceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentContextData", propOrder = {
    "sourceSystemId",
    "paymentProcessor",
    "cardSubmissionUrl",
    "callingApplicationName",
    "callingInterfaceVersion"
})
public class PaymentContextData
    implements Serializable
{

    protected String sourceSystemId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PaymentProcessorEnum paymentProcessor;
    protected String cardSubmissionUrl;
    protected String callingApplicationName;
    protected String callingInterfaceVersion;

    /**
     * Gets the value of the sourceSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Sets the value of the sourceSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemId(String value) {
        this.sourceSystemId = value;
    }

    /**
     * Gets the value of the paymentProcessor property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessorEnum }
     *     
     */
    public PaymentProcessorEnum getPaymentProcessor() {
        return paymentProcessor;
    }

    /**
     * Sets the value of the paymentProcessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessorEnum }
     *     
     */
    public void setPaymentProcessor(PaymentProcessorEnum value) {
        this.paymentProcessor = value;
    }

    /**
     * Gets the value of the cardSubmissionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSubmissionUrl() {
        return cardSubmissionUrl;
    }

    /**
     * Sets the value of the cardSubmissionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSubmissionUrl(String value) {
        this.cardSubmissionUrl = value;
    }

    /**
     * Gets the value of the callingApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingApplicationName() {
        return callingApplicationName;
    }

    /**
     * Sets the value of the callingApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingApplicationName(String value) {
        this.callingApplicationName = value;
    }

    /**
     * Gets the value of the callingInterfaceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingInterfaceVersion() {
        return callingInterfaceVersion;
    }

    /**
     * Sets the value of the callingInterfaceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingInterfaceVersion(String value) {
        this.callingInterfaceVersion = value;
    }

}
