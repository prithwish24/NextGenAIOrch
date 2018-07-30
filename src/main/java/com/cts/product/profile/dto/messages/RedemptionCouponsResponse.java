//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.Coupon;


/**
 * <p>Get Redemption Coupons Response</p> 
 * 
 * <p>Java class for RedemptionCouponsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionCouponsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coupons" type="{http://com.ehi.gbo.profile.dto.profiles/}Coupon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionCouponsResponse", propOrder = {
    "coupons"
})
public class RedemptionCouponsResponse
    extends Response
    implements Serializable
{

    protected List<Coupon> coupons;

    /**
     * Gets the value of the coupons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coupon }
     * 
     * 
     */
    public List<Coupon> getCoupons() {
        if (coupons == null) {
            coupons = new ArrayList<Coupon>();
        }
        return this.coupons;
    }

}