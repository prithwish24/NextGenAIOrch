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
 * <p>Java class for RentalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RentalState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNDEFINED"/&gt;
 *     &lt;enumeration value="VEHICLE_CHOSEN"/&gt;
 *     &lt;enumeration value="ON_RENT"/&gt;
 *     &lt;enumeration value="PENDING_ARRIVAL"/&gt;
 *     &lt;enumeration value="RETURNED"/&gt;
 *     &lt;enumeration value="UPCOMING"/&gt;
 *     &lt;enumeration value="ARRIVING"/&gt;
 *     &lt;enumeration value="RETURNING_SOON"/&gt;
 *     &lt;enumeration value="OVER_DUE"/&gt;
 *     &lt;enumeration value="PENDING_CONFIRMATION"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RentalState", namespace = "http://com.cts.product.rental.dto.common.enums/")
@XmlEnum
public enum RentalState {

    UNDEFINED,
    VEHICLE_CHOSEN,
    ON_RENT,
    PENDING_ARRIVAL,
    RETURNED,
    UPCOMING,
    ARRIVING,
    RETURNING_SOON,
    OVER_DUE,
    PENDING_CONFIRMATION,
    CANCELLED;

    public String value() {
        return name();
    }

    public static RentalState fromValue(String v) {
        return valueOf(v);
    }

}
