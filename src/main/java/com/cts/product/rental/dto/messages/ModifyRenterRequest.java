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

import com.cts.product.rental.dto.reservation.AirlineInformation;


/**
 * <p>Java class for ModifyRenterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyRenterRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.messages/}ReservationModifyRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="renterInfo" type="{http://com.ehi.gbo.rental.dto.messages/}ModifyRenterInfo"/&gt;
 *         &lt;element name="airlineInformation" type="{http://com.ehi.gbo.rental.dto.reservation/}AirlineInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyRenterRequest", propOrder = {
    "renterInfo",
    "airlineInformation"
})
public class ModifyRenterRequest
    extends ReservationModifyRequest
    implements Serializable
{

    @XmlElement(required = true)
    protected ModifyRenterInfo renterInfo;
    @XmlElement(required = true)
    protected AirlineInformation airlineInformation;

    /**
     * Gets the value of the renterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyRenterInfo }
     *     
     */
    public ModifyRenterInfo getRenterInfo() {
        return renterInfo;
    }

    /**
     * Sets the value of the renterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyRenterInfo }
     *     
     */
    public void setRenterInfo(ModifyRenterInfo value) {
        this.renterInfo = value;
    }

    /**
     * Gets the value of the airlineInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineInformation }
     *     
     */
    public AirlineInformation getAirlineInformation() {
        return airlineInformation;
    }

    /**
     * Sets the value of the airlineInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineInformation }
     *     
     */
    public void setAirlineInformation(AirlineInformation value) {
        this.airlineInformation = value;
    }

}
