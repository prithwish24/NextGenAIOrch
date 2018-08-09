//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Renter Driver License Details.
 *             
 * 
 * <p>Java class for DriverLicenseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverLicenseDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countrySubdivisionCode"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countrySubdivisionName"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countryCode"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countryName"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}birthDate"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}issuingAuthority"/&gt;
 *         &lt;element name="licenseExpiry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="licenseIssue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverLicenseDetails", propOrder = {
    "licenseNumber",
    "countrySubdivisionCode",
    "countrySubdivisionName",
    "countryCode",
    "countryName",
    "birthDate",
    "issuingAuthority",
    "licenseExpiry",
    "licenseIssue"
})
public class DriverLicenseDetails
    implements Serializable
{

    @XmlElement(required = true)
    protected String licenseNumber;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countrySubdivisionCode;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countrySubdivisionName;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countryCode;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countryName;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String birthDate;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String issuingAuthority;
    @XmlElement(required = true)
    protected String licenseExpiry;
    @XmlElement(required = true)
    protected String licenseIssue;

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the countrySubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    /**
     * Sets the value of the countrySubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionCode(String value) {
        this.countrySubdivisionCode = value;
    }

    /**
     * Gets the value of the countrySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionName() {
        return countrySubdivisionName;
    }

    /**
     * Sets the value of the countrySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionName(String value) {
        this.countrySubdivisionName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAuthority(String value) {
        this.issuingAuthority = value;
    }

    /**
     * Gets the value of the licenseExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseExpiry() {
        return licenseExpiry;
    }

    /**
     * Sets the value of the licenseExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseExpiry(String value) {
        this.licenseExpiry = value;
    }

    /**
     * Gets the value of the licenseIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseIssue() {
        return licenseIssue;
    }

    /**
     * Sets the value of the licenseIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseIssue(String value) {
        this.licenseIssue = value;
    }

}
