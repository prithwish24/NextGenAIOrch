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
 * <p>Java class for PostalCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostalCodeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZIP_CODE"/&gt;
 *     &lt;enumeration value="POSTAL_CODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostalCodeEnum", namespace = "http://com.ehi.gbo.rental.dto.common.enums/")
@XmlEnum
public enum PostalCodeEnum {

    ZIP_CODE,
    POSTAL_CODE;

    public String value() {
        return name();
    }

    public static PostalCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
