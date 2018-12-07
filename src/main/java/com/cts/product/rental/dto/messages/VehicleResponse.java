//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.vehicle.VehicleCategory;
import com.cts.product.rental.dto.vehicle.VehicleContent;
import com.cts.product.rental.dto.vehicle.VehicleFilter;


/**
 * <p>The response containing the vehicle
 *                 content and features details.</p>
 *             
 * 
 * <p>Java class for VehicleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicles" type="{http://com.cts.product.rental.dto.vehicle/}VehicleContent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFilters" type="{http://com.cts.product.rental.dto.vehicle/}VehicleFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCategories" type="{http://com.cts.product.rental.dto.vehicle/}VehicleCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleResponse", propOrder = {
    "vehicles",
    "vehicleFilters",
    "vehicleCategories"
})
public class VehicleResponse
    extends Response
    implements Serializable
{

    protected List<VehicleContent> vehicles;
    protected List<VehicleFilter> vehicleFilters;
    protected List<VehicleCategory> vehicleCategories;

    /**
     * Gets the value of the vehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleContent }
     * 
     * 
     */
    public List<VehicleContent> getVehicles() {
        if (vehicles == null) {
            vehicles = new ArrayList<VehicleContent>();
        }
        return this.vehicles;
    }

    /**
     * Gets the value of the vehicleFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFilter }
     * 
     * 
     */
    public List<VehicleFilter> getVehicleFilters() {
        if (vehicleFilters == null) {
            vehicleFilters = new ArrayList<VehicleFilter>();
        }
        return this.vehicleFilters;
    }

    /**
     * Gets the value of the vehicleCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCategory }
     * 
     * 
     */
    public List<VehicleCategory> getVehicleCategories() {
        if (vehicleCategories == null) {
            vehicleCategories = new ArrayList<VehicleCategory>();
        }
        return this.vehicleCategories;
    }

}
