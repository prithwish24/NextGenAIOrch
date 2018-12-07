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
import com.cts.product.rental.dto.common.DriverLicenseDetails;
import com.cts.product.rental.dto.common.Phone;


/**
 * <p>Java class for ModifyRenterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyRenterInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://com.cts.product.rental.dto.common/}Phone"/&gt;
 *         &lt;element name="requestEmailPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="driversLicense" type="{http://com.cts.product.rental.dto.common/}DriverLicenseDetails" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyRenterInfo", propOrder = {
    "emailAddress",
    "phone",
    "requestEmailPromotions",
    "driversLicense",
    "firstName"
})
public class ModifyRenterInfo
    implements Serializable
{

    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected Phone phone;
    protected Boolean requestEmailPromotions;
    protected DriverLicenseDetails driversLicense;
    @XmlElement(required = true)
    protected String firstName;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the requestEmailPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequestEmailPromotions() {
        return requestEmailPromotions;
    }

    /**
     * Sets the value of the requestEmailPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestEmailPromotions(Boolean value) {
        this.requestEmailPromotions = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicenseDetails }
     *     
     */
    public DriverLicenseDetails getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicenseDetails }
     *     
     */
    public void setDriversLicense(DriverLicenseDetails value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

}
