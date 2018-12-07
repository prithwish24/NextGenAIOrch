//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base marker class for ReservationModifyRequests
 *             
 * 
 * <p>Java class for ReservationModifyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationModifyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.messages/}Request"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationModifyRequest")
@XmlSeeAlso({
    ModifyInitiateReservationRequest.class,
    ModifyCarClassRequest.class,
    ModifyExtrasRequest.class,
    ModifyRenterRequest.class,
    ModifyRenterAgeRequest.class,
    ModifyPaymentRequest.class,
    ModifyAdditionalInfoRequest.class,
    ModifyDeliveryCollectionRequest.class
})
public class ReservationModifyRequest
    extends Request
    implements Serializable
{


}
