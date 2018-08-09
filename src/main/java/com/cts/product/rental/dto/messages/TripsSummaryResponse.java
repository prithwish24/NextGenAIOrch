//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.reservation.TripSummary;


/**
 * <p>Java class for TripsSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripsSummaryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripSummary" type="{http://com.ehi.gbo.rental.dto.reservation/}TripSummary" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripsSummaryResponse", propOrder = {
    "tripSummaries"
})
public class TripsSummaryResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "tripSummary", required = true)
    protected List<TripSummary> tripSummaries;

    /**
     * Gets the value of the tripSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripSummary }
     * 
     * 
     */
    public List<TripSummary> getTripSummaries() {
        if (tripSummaries == null) {
            tripSummaries = new ArrayList<TripSummary>();
        }
        return this.tripSummaries;
    }

}