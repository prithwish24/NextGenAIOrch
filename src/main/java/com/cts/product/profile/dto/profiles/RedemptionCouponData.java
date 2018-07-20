//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.profiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionCouponData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionCouponData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableCouponsList" type="{http://com.ehi.gbo.profile.dto.profiles/}AvailableCoupons" maxOccurs="unbounded"/&gt;
 *         &lt;element name="redemptionCouponId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionCouponData", propOrder = {
    "availableCouponsLists",
    "redemptionCouponId"
})
public class RedemptionCouponData
    implements Serializable
{

    @XmlElement(name = "availableCouponsList", required = true)
    protected List<AvailableCoupons> availableCouponsLists;
    @XmlElement(required = true)
    protected String redemptionCouponId;

    /**
     * Gets the value of the availableCouponsLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableCouponsLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableCouponsLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableCoupons }
     * 
     * 
     */
    public List<AvailableCoupons> getAvailableCouponsLists() {
        if (availableCouponsLists == null) {
            availableCouponsLists = new ArrayList<AvailableCoupons>();
        }
        return this.availableCouponsLists;
    }

    /**
     * Gets the value of the redemptionCouponId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionCouponId() {
        return redemptionCouponId;
    }

    /**
     * Sets the value of the redemptionCouponId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionCouponId(String value) {
        this.redemptionCouponId = value;
    }

}
