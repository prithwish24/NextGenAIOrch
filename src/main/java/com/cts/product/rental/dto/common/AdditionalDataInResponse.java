//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is to return the additional data elements in the response which is not either part of the
 *                 response resource nor a part of the messages. These data will indicate special processing in the client side.
 *             
 * 
 * <p>Java class for AdditionalDataInResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDataInResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redirectUrl" type="{http://com.ehi.gbo.rental.dto.common/}RedirectUrl"/&gt;
 *         &lt;element name="emailUnique" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="readOnlyRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expediteEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="subscriptionEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tnmDiscountApplied" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDataInResponse", propOrder = {
    "redirectUrl",
    "emailUnique",
    "readOnlyRestrictions",
    "expediteEligible",
    "subscriptionEligible",
    "tnmDiscountApplied"
})
public class AdditionalDataInResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected RedirectUrl redirectUrl;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean emailUnique;
    protected List<String> readOnlyRestrictions;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean expediteEligible;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean subscriptionEligible;
    protected boolean tnmDiscountApplied;

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectUrl }
     *     
     */
    public RedirectUrl getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectUrl }
     *     
     */
    public void setRedirectUrl(RedirectUrl value) {
        this.redirectUrl = value;
    }

    /**
     * Gets the value of the emailUnique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEmailUnique() {
        return emailUnique;
    }

    /**
     * Sets the value of the emailUnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailUnique(Boolean value) {
        this.emailUnique = value;
    }

    /**
     * Gets the value of the readOnlyRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readOnlyRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadOnlyRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReadOnlyRestrictions() {
        if (readOnlyRestrictions == null) {
            readOnlyRestrictions = new ArrayList<String>();
        }
        return this.readOnlyRestrictions;
    }

    /**
     * Gets the value of the expediteEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExpediteEligible() {
        return expediteEligible;
    }

    /**
     * Sets the value of the expediteEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpediteEligible(Boolean value) {
        this.expediteEligible = value;
    }

    /**
     * Gets the value of the subscriptionEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    /**
     * Sets the value of the subscriptionEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionEligible(Boolean value) {
        this.subscriptionEligible = value;
    }

    /**
     * Gets the value of the tnmDiscountApplied property.
     * 
     */
    public boolean isTnmDiscountApplied() {
        return tnmDiscountApplied;
    }

    /**
     * Sets the value of the tnmDiscountApplied property.
     * 
     */
    public void setTnmDiscountApplied(boolean value) {
        this.tnmDiscountApplied = value;
    }

}
