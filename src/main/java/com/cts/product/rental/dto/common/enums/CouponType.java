//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPGRADE"/&gt;
 *     &lt;enumeration value="FREE_DAY"/&gt;
 *     &lt;enumeration value="CURRENCY_OFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CouponType", namespace = "http://com.ehi.gbo.rental.dto.common.enums/")
@XmlEnum
public enum CouponType {

    UPGRADE,
    FREE_DAY,
    CURRENCY_OFF;

    public String value() {
        return name();
    }

    public static CouponType fromValue(String v) {
        return valueOf(v);
    }

}
