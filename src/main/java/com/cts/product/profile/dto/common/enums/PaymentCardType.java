//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS ACCOUNT-APPLICANT"/&gt;
 *     &lt;enumeration value="CENTRAL BILL"/&gt;
 *     &lt;enumeration value="CREDIT CARD"/&gt;
 *     &lt;enumeration value="CHECK"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="PURCHASE ORDER"/&gt;
 *     &lt;enumeration value="Prepaid Cash Manifest"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="VOUCHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardType", namespace = "http://com.ehi.gbo.profile.dto.common.enums/")
@XmlEnum
public enum PaymentCardType {

    @XmlEnumValue("BUSINESS ACCOUNT-APPLICANT")
    BUSINESS_ACCOUNT_APPLICANT("BUSINESS ACCOUNT-APPLICANT"),
    @XmlEnumValue("CENTRAL BILL")
    CENTRAL_BILL("CENTRAL BILL"),
    @XmlEnumValue("CREDIT CARD")
    CREDIT_CARD("CREDIT CARD"),
    CHECK("CHECK"),
    CASH("CASH"),
    @XmlEnumValue("PURCHASE ORDER")
    PURCHASE_ORDER("PURCHASE ORDER"),
    @XmlEnumValue("Prepaid Cash Manifest")
    PREPAID_CASH_MANIFEST("Prepaid Cash Manifest"),
    UNKNOWN("UNKNOWN"),
    VOUCHER("VOUCHER");
    private final String value;

    PaymentCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentCardType fromValue(String v) {
        for (PaymentCardType c: PaymentCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
