//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.reservation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.CurrencyAmount;
import com.cts.product.rental.dto.pricing.ExtrasContent;
import com.cts.product.rental.dto.pricing.VehicleRate;


/**
 * This element contains a vehicle content along with rates and pricing details.
 *             
 * 
 * <p>Java class for CarClassDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarClassDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.reservation/}CarClass"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rentalDuration" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="extras" type="{http://com.ehi.gbo.rental.dto.pricing/}ExtrasContent"/&gt;
 *         &lt;element name="vehicleRates" type="{http://com.ehi.gbo.rental.dto.pricing/}VehicleRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="noRedemptionOriginalTotalPayment" type="{http://com.ehi.gbo.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="noRedemptionOriginalTotalView" type="{http://com.ehi.gbo.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.reservation/}ePlusPointsUsed"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.reservation/}eplusPointsEarned"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.rental.dto.reservation/}redemptionDayCount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarClassDetails", propOrder = {
    "rentalDuration",
    "extras",
    "vehicleRates",
    "noRedemptionOriginalTotalPayment",
    "noRedemptionOriginalTotalView",
    "ePlusPointsUsed",
    "eplusPointsEarned",
    "redemptionDayCount"
})
public class CarClassDetails
    extends CarClass
    implements Serializable
{

    protected long rentalDuration;
    @XmlElement(required = true)
    protected ExtrasContent extras;
    protected List<VehicleRate> vehicleRates;
    @XmlElement(required = true)
    protected CurrencyAmount noRedemptionOriginalTotalPayment;
    @XmlElement(required = true)
    protected CurrencyAmount noRedemptionOriginalTotalView;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.reservation/", required = true, type = Integer.class, nillable = true)
    protected Integer ePlusPointsUsed;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.reservation/", required = true, type = Integer.class, nillable = true)
    protected Integer eplusPointsEarned;
    @XmlElement(namespace = "http://com.ehi.gbo.rental.dto.reservation/", required = true, type = Integer.class, nillable = true)
    protected Integer redemptionDayCount;

    /**
     * Gets the value of the rentalDuration property.
     * 
     */
    public long getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Sets the value of the rentalDuration property.
     * 
     */
    public void setRentalDuration(long value) {
        this.rentalDuration = value;
    }

    /**
     * Gets the value of the extras property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasContent }
     *     
     */
    public ExtrasContent getExtras() {
        return extras;
    }

    /**
     * Sets the value of the extras property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasContent }
     *     
     */
    public void setExtras(ExtrasContent value) {
        this.extras = value;
    }

    /**
     * Gets the value of the vehicleRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRate }
     * 
     * 
     */
    public List<VehicleRate> getVehicleRates() {
        if (vehicleRates == null) {
            vehicleRates = new ArrayList<VehicleRate>();
        }
        return this.vehicleRates;
    }

    /**
     * Gets the value of the noRedemptionOriginalTotalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getNoRedemptionOriginalTotalPayment() {
        return noRedemptionOriginalTotalPayment;
    }

    /**
     * Sets the value of the noRedemptionOriginalTotalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setNoRedemptionOriginalTotalPayment(CurrencyAmount value) {
        this.noRedemptionOriginalTotalPayment = value;
    }

    /**
     * Gets the value of the noRedemptionOriginalTotalView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getNoRedemptionOriginalTotalView() {
        return noRedemptionOriginalTotalView;
    }

    /**
     * Sets the value of the noRedemptionOriginalTotalView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setNoRedemptionOriginalTotalView(CurrencyAmount value) {
        this.noRedemptionOriginalTotalView = value;
    }

    /**
     * Gets the value of the ePlusPointsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEPlusPointsUsed() {
        return ePlusPointsUsed;
    }

    /**
     * Sets the value of the ePlusPointsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEPlusPointsUsed(Integer value) {
        this.ePlusPointsUsed = value;
    }

    /**
     * Gets the value of the eplusPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEplusPointsEarned() {
        return eplusPointsEarned;
    }

    /**
     * Sets the value of the eplusPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEplusPointsEarned(Integer value) {
        this.eplusPointsEarned = value;
    }

    /**
     * Gets the value of the redemptionDayCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedemptionDayCount() {
        return redemptionDayCount;
    }

    /**
     * Sets the value of the redemptionDayCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedemptionDayCount(Integer value) {
        this.redemptionDayCount = value;
    }

}
