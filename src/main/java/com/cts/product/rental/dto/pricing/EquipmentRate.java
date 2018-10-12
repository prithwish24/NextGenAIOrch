//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.pricing;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.CurrencyAmount;
import com.cts.product.rental.dto.common.enums.AllocationEnum;


/**
 * <p>Java class for EquipmentRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.pricing/}BaseProductRate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allocation" type="{http://com.cts.product.rental.dto.common.enums/}AllocationEnum"/&gt;
 *         &lt;element name="maxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="maxAmountView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="maxAmountPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="totalAmountView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="totalAmountPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="equipmentPurchaseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equipmentOnRequestMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentRate", propOrder = {
    "allocation",
    "maxAmount",
    "maxAmountView",
    "maxAmountPayment",
    "totalAmountView",
    "totalAmountPayment",
    "equipmentPurchaseMessage",
    "equipmentOnRequestMessage"
})
public class EquipmentRate
    extends BaseProductRate
    implements Serializable
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AllocationEnum allocation;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal maxAmount;
    @XmlElement(required = true, nillable = true)
    protected CurrencyAmount maxAmountView;
    @XmlElement(required = true, nillable = true)
    protected CurrencyAmount maxAmountPayment;
    @XmlElement(required = true, nillable = true)
    protected CurrencyAmount totalAmountView;
    @XmlElement(required = true, nillable = true)
    protected CurrencyAmount totalAmountPayment;
    @XmlElement(required = true)
    protected String equipmentPurchaseMessage;
    @XmlElement(required = true)
    protected String equipmentOnRequestMessage;

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationEnum }
     *     
     */
    public AllocationEnum getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationEnum }
     *     
     */
    public void setAllocation(AllocationEnum value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the maxAmountView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getMaxAmountView() {
        return maxAmountView;
    }

    /**
     * Sets the value of the maxAmountView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setMaxAmountView(CurrencyAmount value) {
        this.maxAmountView = value;
    }

    /**
     * Gets the value of the maxAmountPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getMaxAmountPayment() {
        return maxAmountPayment;
    }

    /**
     * Sets the value of the maxAmountPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setMaxAmountPayment(CurrencyAmount value) {
        this.maxAmountPayment = value;
    }

    /**
     * Gets the value of the totalAmountView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalAmountView() {
        return totalAmountView;
    }

    /**
     * Sets the value of the totalAmountView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalAmountView(CurrencyAmount value) {
        this.totalAmountView = value;
    }

    /**
     * Gets the value of the totalAmountPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalAmountPayment() {
        return totalAmountPayment;
    }

    /**
     * Sets the value of the totalAmountPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalAmountPayment(CurrencyAmount value) {
        this.totalAmountPayment = value;
    }

    /**
     * Gets the value of the equipmentPurchaseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentPurchaseMessage() {
        return equipmentPurchaseMessage;
    }

    /**
     * Sets the value of the equipmentPurchaseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentPurchaseMessage(String value) {
        this.equipmentPurchaseMessage = value;
    }

    /**
     * Gets the value of the equipmentOnRequestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentOnRequestMessage() {
        return equipmentOnRequestMessage;
    }

    /**
     * Sets the value of the equipmentOnRequestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentOnRequestMessage(String value) {
        this.equipmentOnRequestMessage = value;
    }

}
