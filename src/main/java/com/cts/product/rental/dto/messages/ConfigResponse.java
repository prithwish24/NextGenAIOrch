//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.SubscriptionConfig;


/**
 * <p>Java class for ConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mappedCOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mappedLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supportedLocales" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubscriptionConfig" type="{http://com.cts.product.rental.dto.common/}SubscriptionConfig"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigResponse", propOrder = {
    "mappedCOR",
    "mappedLocale",
    "supportedLocales",
    "subscriptionConfig"
})
public class ConfigResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected String mappedCOR;
    @XmlElement(required = true)
    protected String mappedLocale;
    @XmlElement(required = true)
    protected List<String> supportedLocales;
    @XmlElement(name = "SubscriptionConfig", required = true)
    protected SubscriptionConfig subscriptionConfig;

    /**
     * Gets the value of the mappedCOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedCOR() {
        return mappedCOR;
    }

    /**
     * Sets the value of the mappedCOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedCOR(String value) {
        this.mappedCOR = value;
    }

    /**
     * Gets the value of the mappedLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedLocale() {
        return mappedLocale;
    }

    /**
     * Sets the value of the mappedLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedLocale(String value) {
        this.mappedLocale = value;
    }

    /**
     * Gets the value of the supportedLocales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedLocales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedLocales() {
        if (supportedLocales == null) {
            supportedLocales = new ArrayList<String>();
        }
        return this.supportedLocales;
    }

    /**
     * Gets the value of the subscriptionConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionConfig }
     *     
     */
    public SubscriptionConfig getSubscriptionConfig() {
        return subscriptionConfig;
    }

    /**
     * Sets the value of the subscriptionConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionConfig }
     *     
     */
    public void setSubscriptionConfig(SubscriptionConfig value) {
        this.subscriptionConfig = value;
    }

}
