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
 * This contains all elements which determines OCI related indivitual idicator
 *             
 * 
 * <p>Java class for OCIIndividualStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCIIndividualStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactDetailsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="loginCredentialsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="addressDetailsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="driverlicenseDetailsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fullNameDetailsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dobDetailsPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCIIndividualStatus", propOrder = {
    "contactDetailsPresent",
    "loginCredentialsPresent",
    "addressDetailsPresent",
    "driverlicenseDetailsPresent",
    "fullNameDetailsPresent",
    "dobDetailsPresent"
})
public class OCIIndividualStatus
    implements Serializable
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean contactDetailsPresent;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean loginCredentialsPresent;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean addressDetailsPresent;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean driverlicenseDetailsPresent;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean fullNameDetailsPresent;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean dobDetailsPresent;

    /**
     * Gets the value of the contactDetailsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContactDetailsPresent() {
        return contactDetailsPresent;
    }

    /**
     * Sets the value of the contactDetailsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactDetailsPresent(Boolean value) {
        this.contactDetailsPresent = value;
    }

    /**
     * Gets the value of the loginCredentialsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLoginCredentialsPresent() {
        return loginCredentialsPresent;
    }

    /**
     * Sets the value of the loginCredentialsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoginCredentialsPresent(Boolean value) {
        this.loginCredentialsPresent = value;
    }

    /**
     * Gets the value of the addressDetailsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAddressDetailsPresent() {
        return addressDetailsPresent;
    }

    /**
     * Sets the value of the addressDetailsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressDetailsPresent(Boolean value) {
        this.addressDetailsPresent = value;
    }

    /**
     * Gets the value of the driverlicenseDetailsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDriverlicenseDetailsPresent() {
        return driverlicenseDetailsPresent;
    }

    /**
     * Sets the value of the driverlicenseDetailsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDriverlicenseDetailsPresent(Boolean value) {
        this.driverlicenseDetailsPresent = value;
    }

    /**
     * Gets the value of the fullNameDetailsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFullNameDetailsPresent() {
        return fullNameDetailsPresent;
    }

    /**
     * Sets the value of the fullNameDetailsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullNameDetailsPresent(Boolean value) {
        this.fullNameDetailsPresent = value;
    }

    /**
     * Gets the value of the dobDetailsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDobDetailsPresent() {
        return dobDetailsPresent;
    }

    /**
     * Sets the value of the dobDetailsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDobDetailsPresent(Boolean value) {
        this.dobDetailsPresent = value;
    }

}
