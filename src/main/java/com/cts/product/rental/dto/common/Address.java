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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.enums.AddressType;


/**
 * <p>Contains the address information such as
 *                 street, state, city, zip, country.</p>
 *             
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countrySubdivisionCode"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countrySubdivisionName"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countryCode"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.common/}countryName"/&gt;
 *         &lt;element name="postal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressType" type="{http://com.ehi.gbo.rental.dto.common.enums/}AddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "streetAddresses",
    "city",
    "countrySubdivisionCode",
    "countrySubdivisionName",
    "countryCode",
    "countryName",
    "postal",
    "addressType"
})
@XmlRootElement(name = "address")
public class Address
    implements Serializable
{

    @XmlElement(name = "streetAddress")
    protected List<String> streetAddresses;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countrySubdivisionCode;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countrySubdivisionName;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countryCode;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.common/", required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String postal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AddressType addressType;

    /**
     * Gets the value of the streetAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetAddresses() {
        if (streetAddresses == null) {
            streetAddresses = new ArrayList<String>();
        }
        return this.streetAddresses;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostal(String value) {
        this.postal = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddressType(AddressType value) {
        this.addressType = value;
    }

}
