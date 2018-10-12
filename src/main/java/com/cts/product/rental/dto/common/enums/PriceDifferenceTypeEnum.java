//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceDifferenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceDifferenceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PREPAY"/&gt;
 *     &lt;enumeration value="PREVIOUS_RESERVATION"/&gt;
 *     &lt;enumeration value="PROMOTION"/&gt;
 *     &lt;enumeration value="UPGRADE"/&gt;
 *     &lt;enumeration value="UPGRADE_PREPAY_TO_PREPAY"/&gt;
 *     &lt;enumeration value="UPGRADE_PAYLATER_TO_PREPAY"/&gt;
 *     &lt;enumeration value="UPGRADE_PREPAY_TO_PAYLATER"/&gt;
 *     &lt;enumeration value="UPGRADE_PAYLATER_TO_PAYLATER"/&gt;
 *     &lt;enumeration value="CONTRACT"/&gt;
 *     &lt;enumeration value="UNPAID_REFUND_AMOUNT"/&gt;
 *     &lt;enumeration value="COUPON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceDifferenceTypeEnum", namespace = "http://com.cts.product.rental.dto.common.enums/")
@XmlEnum
public enum PriceDifferenceTypeEnum {

    PREPAY,
    PREVIOUS_RESERVATION,
    PROMOTION,
    UPGRADE,
    UPGRADE_PREPAY_TO_PREPAY,
    UPGRADE_PAYLATER_TO_PREPAY,
    UPGRADE_PREPAY_TO_PAYLATER,
    UPGRADE_PAYLATER_TO_PAYLATER,
    CONTRACT,
    UNPAID_REFUND_AMOUNT,
    COUPON;

    public String value() {
        return name();
    }

    public static PriceDifferenceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
