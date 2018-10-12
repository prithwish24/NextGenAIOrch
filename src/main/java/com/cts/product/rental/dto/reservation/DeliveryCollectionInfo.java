//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.reservation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.Address;
import com.cts.product.rental.dto.common.Phone;


/**
 * <p>Java class for DeliveryCollectionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryCollectionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://com.cts.product.rental.dto.common/}Address"/&gt;
 *         &lt;element name="phone" type="{http://com.cts.product.rental.dto.common/}Phone"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restrictedSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryCollectionInfo", propOrder = {
    "address",
    "phone",
    "comments",
    "restrictedSiteId"
})
public class DeliveryCollectionInfo
    implements Serializable
{

    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected Phone phone;
    @XmlElement(required = true)
    protected String comments;
    @XmlElement(required = true)
    protected String restrictedSiteId;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

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

}
