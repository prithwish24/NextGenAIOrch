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
 * <p>Java class for ReserveTheAisle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReserveTheAisle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMERALD_AISLE"/&gt;
 *     &lt;enumeration value="EXECUTIVE_AISLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReserveTheAisle", namespace = "http://com.cts.product.rental.dto.common.enums/")
@XmlEnum
public enum ReserveTheAisle {

    EMERALD_AISLE,
    EXECUTIVE_AISLE;

    public String value() {
        return name();
    }

    public static ReserveTheAisle fromValue(String v) {
        return valueOf(v);
    }

}
