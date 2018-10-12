//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.pricing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.CurrencyAmount;


/**
 * <p>Java class for PriceSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estimatedTotalView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalTaxesAndFeesView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalTaxesAndFeesPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalExtrasAndCoveragesView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalExtrasAndCoveragesPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalVehicleView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalVehiclePayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalSavingsView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalSavingsPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalAdditionalDriverView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotalAdditionalDriverPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedDriverView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedDriverPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedBillToView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedBillToPayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="estimatedTotal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalCharged" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unitOfDistance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentLineItems" type="{http://com.cts.product.rental.dto.pricing/}PriceLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalInclusiveChargePayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="totalExclusiveChargePayment" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="totalInclusiveChargeView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *         &lt;element name="totalExclusiveChargeView" type="{http://com.cts.product.rental.dto.common/}CurrencyAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSummary", propOrder = {
    "estimatedTotalView",
    "estimatedTotalPayment",
    "estimatedTotalTaxesAndFeesView",
    "estimatedTotalTaxesAndFeesPayment",
    "estimatedTotalExtrasAndCoveragesView",
    "estimatedTotalExtrasAndCoveragesPayment",
    "estimatedTotalVehicleView",
    "estimatedTotalVehiclePayment",
    "estimatedTotalSavingsView",
    "estimatedTotalSavingsPayment",
    "estimatedTotalAdditionalDriverView",
    "estimatedTotalAdditionalDriverPayment",
    "estimatedDriverView",
    "estimatedDriverPayment",
    "estimatedBillToView",
    "estimatedBillToPayment",
    "estimatedTotal",
    "totalCharged",
    "amountDue",
    "currencyCode",
    "currencySymbol",
    "unitOfDistance",
    "paymentLineItems",
    "totalInclusiveChargePayment",
    "totalExclusiveChargePayment",
    "totalInclusiveChargeView",
    "totalExclusiveChargeView"
})
public class PriceSummary
    implements Serializable
{

    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalTaxesAndFeesView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalTaxesAndFeesPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalExtrasAndCoveragesView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalExtrasAndCoveragesPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalVehicleView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalVehiclePayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalSavingsView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalSavingsPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalAdditionalDriverView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedTotalAdditionalDriverPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedDriverView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedDriverPayment;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedBillToView;
    @XmlElement(required = true)
    protected CurrencyAmount estimatedBillToPayment;
    @XmlElement(required = true)
    protected String estimatedTotal;
    @XmlElement(required = true)
    protected String totalCharged;
    @XmlElement(required = true)
    protected String amountDue;
    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected String currencySymbol;
    @XmlElement(required = true)
    protected String unitOfDistance;
    protected List<PriceLineItem> paymentLineItems;
    @XmlElement(required = true)
    protected CurrencyAmount totalInclusiveChargePayment;
    @XmlElement(required = true)
    protected CurrencyAmount totalExclusiveChargePayment;
    @XmlElement(required = true)
    protected CurrencyAmount totalInclusiveChargeView;
    @XmlElement(required = true)
    protected CurrencyAmount totalExclusiveChargeView;

    /**
     * Gets the value of the estimatedTotalView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalView() {
        return estimatedTotalView;
    }

    /**
     * Sets the value of the estimatedTotalView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalView(CurrencyAmount value) {
        this.estimatedTotalView = value;
    }

    /**
     * Gets the value of the estimatedTotalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalPayment() {
        return estimatedTotalPayment;
    }

    /**
     * Sets the value of the estimatedTotalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalPayment(CurrencyAmount value) {
        this.estimatedTotalPayment = value;
    }

    /**
     * Gets the value of the estimatedTotalTaxesAndFeesView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalTaxesAndFeesView() {
        return estimatedTotalTaxesAndFeesView;
    }

    /**
     * Sets the value of the estimatedTotalTaxesAndFeesView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalTaxesAndFeesView(CurrencyAmount value) {
        this.estimatedTotalTaxesAndFeesView = value;
    }

    /**
     * Gets the value of the estimatedTotalTaxesAndFeesPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalTaxesAndFeesPayment() {
        return estimatedTotalTaxesAndFeesPayment;
    }

    /**
     * Sets the value of the estimatedTotalTaxesAndFeesPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalTaxesAndFeesPayment(CurrencyAmount value) {
        this.estimatedTotalTaxesAndFeesPayment = value;
    }

    /**
     * Gets the value of the estimatedTotalExtrasAndCoveragesView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalExtrasAndCoveragesView() {
        return estimatedTotalExtrasAndCoveragesView;
    }

    /**
     * Sets the value of the estimatedTotalExtrasAndCoveragesView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalExtrasAndCoveragesView(CurrencyAmount value) {
        this.estimatedTotalExtrasAndCoveragesView = value;
    }

    /**
     * Gets the value of the estimatedTotalExtrasAndCoveragesPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalExtrasAndCoveragesPayment() {
        return estimatedTotalExtrasAndCoveragesPayment;
    }

    /**
     * Sets the value of the estimatedTotalExtrasAndCoveragesPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalExtrasAndCoveragesPayment(CurrencyAmount value) {
        this.estimatedTotalExtrasAndCoveragesPayment = value;
    }

    /**
     * Gets the value of the estimatedTotalVehicleView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalVehicleView() {
        return estimatedTotalVehicleView;
    }

    /**
     * Sets the value of the estimatedTotalVehicleView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalVehicleView(CurrencyAmount value) {
        this.estimatedTotalVehicleView = value;
    }

    /**
     * Gets the value of the estimatedTotalVehiclePayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalVehiclePayment() {
        return estimatedTotalVehiclePayment;
    }

    /**
     * Sets the value of the estimatedTotalVehiclePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalVehiclePayment(CurrencyAmount value) {
        this.estimatedTotalVehiclePayment = value;
    }

    /**
     * Gets the value of the estimatedTotalSavingsView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalSavingsView() {
        return estimatedTotalSavingsView;
    }

    /**
     * Sets the value of the estimatedTotalSavingsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalSavingsView(CurrencyAmount value) {
        this.estimatedTotalSavingsView = value;
    }

    /**
     * Gets the value of the estimatedTotalSavingsPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalSavingsPayment() {
        return estimatedTotalSavingsPayment;
    }

    /**
     * Sets the value of the estimatedTotalSavingsPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalSavingsPayment(CurrencyAmount value) {
        this.estimatedTotalSavingsPayment = value;
    }

    /**
     * Gets the value of the estimatedTotalAdditionalDriverView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalAdditionalDriverView() {
        return estimatedTotalAdditionalDriverView;
    }

    /**
     * Sets the value of the estimatedTotalAdditionalDriverView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalAdditionalDriverView(CurrencyAmount value) {
        this.estimatedTotalAdditionalDriverView = value;
    }

    /**
     * Gets the value of the estimatedTotalAdditionalDriverPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedTotalAdditionalDriverPayment() {
        return estimatedTotalAdditionalDriverPayment;
    }

    /**
     * Sets the value of the estimatedTotalAdditionalDriverPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedTotalAdditionalDriverPayment(CurrencyAmount value) {
        this.estimatedTotalAdditionalDriverPayment = value;
    }

    /**
     * Gets the value of the estimatedDriverView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedDriverView() {
        return estimatedDriverView;
    }

    /**
     * Sets the value of the estimatedDriverView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedDriverView(CurrencyAmount value) {
        this.estimatedDriverView = value;
    }

    /**
     * Gets the value of the estimatedDriverPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedDriverPayment() {
        return estimatedDriverPayment;
    }

    /**
     * Sets the value of the estimatedDriverPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedDriverPayment(CurrencyAmount value) {
        this.estimatedDriverPayment = value;
    }

    /**
     * Gets the value of the estimatedBillToView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedBillToView() {
        return estimatedBillToView;
    }

    /**
     * Sets the value of the estimatedBillToView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedBillToView(CurrencyAmount value) {
        this.estimatedBillToView = value;
    }

    /**
     * Gets the value of the estimatedBillToPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimatedBillToPayment() {
        return estimatedBillToPayment;
    }

    /**
     * Sets the value of the estimatedBillToPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimatedBillToPayment(CurrencyAmount value) {
        this.estimatedBillToPayment = value;
    }

    /**
     * Gets the value of the estimatedTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedTotal() {
        return estimatedTotal;
    }

    /**
     * Sets the value of the estimatedTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTotal(String value) {
        this.estimatedTotal = value;
    }

    /**
     * Gets the value of the totalCharged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCharged() {
        return totalCharged;
    }

    /**
     * Sets the value of the totalCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCharged(String value) {
        this.totalCharged = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountDue(String value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Sets the value of the currencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Gets the value of the unitOfDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfDistance() {
        return unitOfDistance;
    }

    /**
     * Sets the value of the unitOfDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfDistance(String value) {
        this.unitOfDistance = value;
    }

    /**
     * Gets the value of the paymentLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceLineItem }
     * 
     * 
     */
    public List<PriceLineItem> getPaymentLineItems() {
        if (paymentLineItems == null) {
            paymentLineItems = new ArrayList<PriceLineItem>();
        }
        return this.paymentLineItems;
    }

    /**
     * Gets the value of the totalInclusiveChargePayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalInclusiveChargePayment() {
        return totalInclusiveChargePayment;
    }

    /**
     * Sets the value of the totalInclusiveChargePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalInclusiveChargePayment(CurrencyAmount value) {
        this.totalInclusiveChargePayment = value;
    }

    /**
     * Gets the value of the totalExclusiveChargePayment property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalExclusiveChargePayment() {
        return totalExclusiveChargePayment;
    }

    /**
     * Sets the value of the totalExclusiveChargePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalExclusiveChargePayment(CurrencyAmount value) {
        this.totalExclusiveChargePayment = value;
    }

    /**
     * Gets the value of the totalInclusiveChargeView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalInclusiveChargeView() {
        return totalInclusiveChargeView;
    }

    /**
     * Sets the value of the totalInclusiveChargeView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalInclusiveChargeView(CurrencyAmount value) {
        this.totalInclusiveChargeView = value;
    }

    /**
     * Gets the value of the totalExclusiveChargeView property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getTotalExclusiveChargeView() {
        return totalExclusiveChargeView;
    }

    /**
     * Sets the value of the totalExclusiveChargeView property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setTotalExclusiveChargeView(CurrencyAmount value) {
        this.totalExclusiveChargeView = value;
    }

}
