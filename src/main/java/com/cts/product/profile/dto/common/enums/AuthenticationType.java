//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.common.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH_NONE"/&gt;
 *     &lt;enumeration value="AUTH_LOYALTY"/&gt;
 *     &lt;enumeration value="AUTH_PIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationType", namespace = "http://com.ehi.gbo.profile.dto.common.enums/")
@XmlEnum
public enum AuthenticationType {

    AUTH_NONE,
    AUTH_LOYALTY,
    AUTH_PIN;

    public String value() {
        return name();
    }

    public static AuthenticationType fromValue(String v) {
        return valueOf(v);
    }

}
