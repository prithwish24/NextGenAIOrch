//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.ticket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.CurrencyAmount;
import com.cts.product.rental.dto.common.PaymentHistory;
import com.cts.product.rental.dto.common.enums.RentalState;
import com.cts.product.rental.dto.location.LocationDetail;
import com.cts.product.rental.dto.reservation.DriverInfo;
import com.cts.product.rental.dto.user.ContractDetails;
import com.cts.product.rental.dto.vehicle.Vehicle;
import com.cts.product.rental.dto.vehicle.VehicleContent;


/**
 * <p>Java class for TicketDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pickupLocation" type="{http://com.cts.product.rental.dto.location/}LocationDetail"/&gt;
 *         &lt;element name="pickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnLocation" type="{http://com.cts.product.rental.dto.location/}LocationDetail"/&gt;
 *         &lt;element name="returnTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ticketStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vehicleDriven" type="{http://com.cts.product.rental.dto.vehicle/}Vehicle"/&gt;
 *         &lt;element name="paymentHistory" type="{http://com.cts.product.rental.dto.common/}PaymentHistory"/&gt;
 *         &lt;element name="extensionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxExtendableDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contractDetails" type="{http://com.cts.product.rental.dto.user/}ContractDetails"/&gt;
 *         &lt;element name="driverInfo" type="{http://com.cts.product.rental.dto.reservation/}DriverInfo"/&gt;
 *         &lt;element name="additionalDrivers" type="{http://com.cts.product.rental.dto.reservation/}DriverInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleContent" type="{http://com.cts.product.rental.dto.vehicle/}VehicleContent"/&gt;
 *         &lt;element name="totalAmount" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="rentalState" type="{http://com.cts.product.rental.dto.common.enums/}RentalState"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketDetails", propOrder = {
    "ticketNumber",
    "reservationNumber",
    "pickupLocation",
    "pickupTime",
    "returnLocation",
    "returnTime",
    "ticketStatus",
    "vehicleDriven",
    "paymentHistory",
    "extensionAllowed",
    "maxExtendableDays",
    "contractDetails",
    "driverInfo",
    "additionalDrivers",
    "vehicleContent",
    "totalAmount",
    "rentalState"
})
public class TicketDetails
    implements Serializable
{

    @XmlElement(required = true)
    protected String ticketNumber;
    @XmlElement(required = true)
    protected String reservationNumber;
    @XmlElement(required = true)
    protected LocationDetail pickupLocation;
    @XmlElement(required = true)
    protected String pickupTime;
    @XmlElement(required = true)
    protected LocationDetail returnLocation;
    @XmlElement(required = true)
    protected String returnTime;
    @XmlElement(required = true)
    protected String ticketStatus;
    @XmlElement(required = true)
    protected Vehicle vehicleDriven;
    @XmlElement(required = true)
    protected PaymentHistory paymentHistory;
    protected boolean extensionAllowed;
    protected int maxExtendableDays;
    @XmlElement(required = true)
    protected ContractDetails contractDetails;
    @XmlElement(required = true)
    protected DriverInfo driverInfo;
    protected List<DriverInfo> additionalDrivers;
    @XmlElement(required = true)
    protected VehicleContent vehicleContent;
    @XmlElement(required = true)
    protected CurrencyAmount totalAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RentalState rentalState;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetail }
     *     
     */
    public LocationDetail getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetail }
     *     
     */
    public void setPickupLocation(LocationDetail value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the pickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * Sets the value of the pickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTime(String value) {
        this.pickupTime = value;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetail }
     *     
     */
    public LocationDetail getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetail }
     *     
     */
    public void setReturnLocation(LocationDetail value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTime(String value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the vehicleDriven property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicleDriven() {
        return vehicleDriven;
    }

    /**
     * Sets the value of the vehicleDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicleDriven(Vehicle value) {
        this.vehicleDriven = value;
    }

    /**
     * Gets the value of the paymentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHistory }
     *     
     */
    public PaymentHistory getPaymentHistory() {
        return paymentHistory;
    }

    /**
     * Sets the value of the paymentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHistory }
     *     
     */
    public void setPaymentHistory(PaymentHistory value) {
        this.paymentHistory = value;
    }

    /**
     * Gets the value of the extensionAllowed property.
     * 
     */
    public boolean isExtensionAllowed() {
        return extensionAllowed;
    }

    /**
     * Sets the value of the extensionAllowed property.
     * 
     */
    public void setExtensionAllowed(boolean value) {
        this.extensionAllowed = value;
    }

    /**
     * Gets the value of the maxExtendableDays property.
     * 
     */
    public int getMaxExtendableDays() {
        return maxExtendableDays;
    }

    /**
     * Sets the value of the maxExtendableDays property.
     * 
     */
    public void setMaxExtendableDays(int value) {
        this.maxExtendableDays = value;
    }

    /**
     * Gets the value of the contractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetails }
     *     
     */
    public ContractDetails getContractDetails() {
        return contractDetails;
    }

    /**
     * Sets the value of the contractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetails }
     *     
     */
    public void setContractDetails(ContractDetails value) {
        this.contractDetails = value;
    }

    /**
     * Gets the value of the driverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DriverInfo }
     *     
     */
    public DriverInfo getDriverInfo() {
        return driverInfo;
    }

    /**
     * Sets the value of the driverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverInfo }
     *     
     */
    public void setDriverInfo(DriverInfo value) {
        this.driverInfo = value;
    }

    /**
     * Gets the value of the additionalDrivers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDrivers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDrivers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInfo }
     * 
     * 
     */
    public List<DriverInfo> getAdditionalDrivers() {
        if (additionalDrivers == null) {
            additionalDrivers = new ArrayList<DriverInfo>();
        }
        return this.additionalDrivers;
    }

    /**
     * Gets the value of the vehicleContent property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleContent }
     *     
     */
    public VehicleContent getVehicleContent() {
        return vehicleContent;
    }

    /**
     * Sets the value of the vehicleContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleContent }
     *     
     */
    public void setVehicleContent(VehicleContent value) {
        this.vehicleContent = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalAmount(CurrencyAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the rentalState property.
     * 
     * @return
     *     possible object is
     *     {@link RentalState }
     *     
     */
    public RentalState getRentalState() {
        return rentalState;
    }

    /**
     * Sets the value of the rentalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalState }
     *     
     */
    public void setRentalState(RentalState value) {
        this.rentalState = value;
    }

}
