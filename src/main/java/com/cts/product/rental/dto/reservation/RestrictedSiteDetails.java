//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.reservation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestrictedSiteDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictedSiteDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictedSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSiteDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSiteAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="restrictedSiteCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSitePostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSiteCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSiteState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedSiteDetails", propOrder = {
    "restrictedSiteId",
    "restrictedSiteDescription",
    "restrictedSiteAddresses",
    "restrictedSiteCity",
    "restrictedSitePostalCode",
    "restrictedSiteCountry",
    "restrictedSiteState"
})
public class RestrictedSiteDetails
    implements Serializable
{

    @XmlElement(required = true)
    protected String restrictedSiteId;
    @XmlElement(required = true)
    protected String restrictedSiteDescription;
    @XmlElement(name = "restrictedSiteAddress")
    protected List<String> restrictedSiteAddresses;
    @XmlElement(required = true)
    protected String restrictedSiteCity;
    @XmlElement(required = true)
    protected String restrictedSitePostalCode;
    @XmlElement(required = true)
    protected String restrictedSiteCountry;
    @XmlElement(required = true)
    protected String restrictedSiteState;

    /**
     * Gets the value of the restrictedSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSiteId() {
        return restrictedSiteId;
    }

    /**
     * Sets the value of the restrictedSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSiteId(String value) {
        this.restrictedSiteId = value;
    }

    /**
     * Gets the value of the restrictedSiteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSiteDescription() {
        return restrictedSiteDescription;
    }

    /**
     * Sets the value of the restrictedSiteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSiteDescription(String value) {
        this.restrictedSiteDescription = value;
    }

    /**
     * Gets the value of the restrictedSiteAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedSiteAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedSiteAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictedSiteAddresses() {
        if (restrictedSiteAddresses == null) {
            restrictedSiteAddresses = new ArrayList<String>();
        }
        return this.restrictedSiteAddresses;
    }

    /**
     * Gets the value of the restrictedSiteCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSiteCity() {
        return restrictedSiteCity;
    }

    /**
     * Sets the value of the restrictedSiteCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSiteCity(String value) {
        this.restrictedSiteCity = value;
    }

    /**
     * Gets the value of the restrictedSitePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSitePostalCode() {
        return restrictedSitePostalCode;
    }

    /**
     * Sets the value of the restrictedSitePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSitePostalCode(String value) {
        this.restrictedSitePostalCode = value;
    }

    /**
     * Gets the value of the restrictedSiteCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSiteCountry() {
        return restrictedSiteCountry;
    }

    /**
     * Sets the value of the restrictedSiteCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSiteCountry(String value) {
        this.restrictedSiteCountry = value;
    }

    /**
     * Gets the value of the restrictedSiteState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedSiteState() {
        return restrictedSiteState;
    }

    /**
     * Sets the value of the restrictedSiteState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedSiteState(String value) {
        this.restrictedSiteState = value;
    }

}
