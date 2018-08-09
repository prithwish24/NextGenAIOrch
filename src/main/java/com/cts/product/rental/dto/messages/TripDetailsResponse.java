//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.reservation.TripSummary;


/**
 * <p>Java class for TripDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pastTripDetail" type="{http://com.ehi.gbo.rental.dto.reservation/}TripSummary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripDetailsResponse", propOrder = {
    "pastTripDetail"
})
public class TripDetailsResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected TripSummary pastTripDetail;

    /**
     * Gets the value of the pastTripDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TripSummary }
     *     
     */
    public TripSummary getPastTripDetail() {
        return pastTripDetail;
    }

    /**
     * Sets the value of the pastTripDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripSummary }
     *     
     */
    public void setPastTripDetail(TripSummary value) {
        this.pastTripDetail = value;
    }

}
