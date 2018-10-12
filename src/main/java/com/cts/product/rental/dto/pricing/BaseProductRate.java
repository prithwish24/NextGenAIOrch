//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.pricing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseProductRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseProductRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.pricing/}BaseExtraRate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="setByProfilePreference" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductRate", propOrder = {
    "selectedQuantity",
    "maxQuantity",
    "setByProfilePreference"
})
@XmlSeeAlso({
    EquipmentRate.class,
    InsuranceRate.class,
    FuelRate.class
})
public class BaseProductRate
    extends BaseExtraRate
    implements Serializable
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer selectedQuantity;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxQuantity;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean setByProfilePreference;

    /**
     * Gets the value of the selectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectedQuantity() {
        return selectedQuantity;
    }

    /**
     * Sets the value of the selectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectedQuantity(Integer value) {
        this.selectedQuantity = value;
    }

    /**
     * Gets the value of the maxQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * Sets the value of the maxQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxQuantity(Integer value) {
        this.maxQuantity = value;
    }

    /**
     * Gets the value of the setByProfilePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSetByProfilePreference() {
        return setByProfilePreference;
    }

    /**
     * Sets the value of the setByProfilePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetByProfilePreference(Boolean value) {
        this.setByProfilePreference = value;
    }

}
