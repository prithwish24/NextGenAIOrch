//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.vehicle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains a consolidated vehicle filters for all the available vehicles
 * 			
 * 
 * <p>Java class for VehicleFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filterCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filterValues" type="{http://com.cts.product.rental.dto.vehicle/}FilterValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleFilter", propOrder = {
    "filterDescription",
    "filterCode",
    "filterValues"
})
public class VehicleFilter
    implements Serializable
{

    @XmlElement(required = true)
    protected String filterDescription;
    @XmlElement(required = true)
    protected String filterCode;
    protected List<FilterValue> filterValues;

    /**
     * Gets the value of the filterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterDescription() {
        return filterDescription;
    }

    /**
     * Sets the value of the filterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterDescription(String value) {
        this.filterDescription = value;
    }

    /**
     * Gets the value of the filterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterCode() {
        return filterCode;
    }

    /**
     * Sets the value of the filterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterCode(String value) {
        this.filterCode = value;
    }

    /**
     * Gets the value of the filterValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterValue }
     * 
     * 
     */
    public List<FilterValue> getFilterValues() {
        if (filterValues == null) {
            filterValues = new ArrayList<FilterValue>();
        }
        return this.filterValues;
    }

}
