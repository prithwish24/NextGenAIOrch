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
 * <p>Java class for TravelPurposeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelPurposeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="LEISURE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelPurposeEnum", namespace = "http://com.cts.product.rental.dto.common.enums/")
@XmlEnum
public enum TravelPurposeEnum {

    BUSINESS,
    LEISURE;

    public String value() {
        return name();
    }

    public static TravelPurposeEnum fromValue(String v) {
        return valueOf(v);
    }

}
