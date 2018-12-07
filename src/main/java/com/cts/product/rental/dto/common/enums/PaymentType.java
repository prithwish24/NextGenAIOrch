//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPOSIT"/&gt;
 *     &lt;enumeration value="DEBIT"/&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *     &lt;enumeration value="PRE_PAYMENT"/&gt;
 *     &lt;enumeration value="RE_PAYMENT_REFUND"/&gt;
 *     &lt;enumeration value="DEPOSIT_REFUND"/&gt;
 *     &lt;enumeration value="AUTHORIZATION"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_REVERSAL"/&gt;
 *     &lt;enumeration value="RES_PREPAY_CASH"/&gt;
 *     &lt;enumeration value="STAND_ALONE_PAYMENT"/&gt;
 *     &lt;enumeration value="STAND_ALONE_REFUND"/&gt;
 *     &lt;enumeration value="WRITE_OFF"/&gt;
 *     &lt;enumeration value="DECLINED"/&gt;
 *     &lt;enumeration value="DEPOSIT_SETTLEMENT"/&gt;
 *     &lt;enumeration value="LOYALTY_FEE_PAYMENT"/&gt;
 *     &lt;enumeration value="GARANTEED_RES_PENALTY_PAYMENT"/&gt;
 *     &lt;enumeration value="PENALTY_REFUND"/&gt;
 *     &lt;enumeration value="ROLLED_BACK_PRE_PAY"/&gt;
 *     &lt;enumeration value="DEPOSIT_SETTLEMENT_TICKET_RETURN"/&gt;
 *     &lt;enumeration value="PRE_PAYMENT_PANALTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentType", namespace = "http://com.cts.product.rental.dto.common.enums/")
@XmlEnum
public enum PaymentType {

    DEPOSIT,
    DEBIT,
    CREDIT,
    PRE_PAYMENT,
    RE_PAYMENT_REFUND,
    DEPOSIT_REFUND,
    AUTHORIZATION,
    AUTHORIZATION_REVERSAL,
    RES_PREPAY_CASH,
    STAND_ALONE_PAYMENT,
    STAND_ALONE_REFUND,
    WRITE_OFF,
    DECLINED,
    DEPOSIT_SETTLEMENT,
    LOYALTY_FEE_PAYMENT,
    GARANTEED_RES_PENALTY_PAYMENT,
    PENALTY_REFUND,
    ROLLED_BACK_PRE_PAY,
    DEPOSIT_SETTLEMENT_TICKET_RETURN,
    PRE_PAYMENT_PANALTY;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v) {
        return valueOf(v);
    }

}
