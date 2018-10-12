//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Stores Additional Information that is
 *                 required as part of a rental (corporate accounts). The additional
 *                 information may contain instructions how the min / max accepted
 *                 characters, a list of supported values accepted and whether the
 *                 field is an optional or mandatory field. Additional Information may
 *                 be required to be entered for some corporate accounts prior to a
 *                 reservation / ticket being modified or created. The value entered by
 *                 the user or retrieved from an existing rental is stored in its value
 *                 field. </p><p><span
 *                 style="font-size:12pt;font-family:"Times New
 *                 Roman";"></span></p><p></p>
 *             
 * 
 * <p>Java class for AdditionalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="optionalField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="retriesAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="retriesRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="supportedValues" type="{http://com.cts.product.rental.dto.common/}AdditionalInformationSupportedValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="retryRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minLength" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="helperText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation", propOrder = {
    "name",
    "value",
    "optionalField",
    "retriesAllowed",
    "retriesRemaining",
    "supportedValues",
    "retryRequired",
    "maxLength",
    "minLength",
    "helperText",
    "errorText"
})
public class AdditionalInformation
    implements Serializable
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String value;
    protected boolean optionalField;
    protected int retriesAllowed;
    protected int retriesRemaining;
    protected List<AdditionalInformationSupportedValue> supportedValues;
    protected boolean retryRequired;
    @XmlElement(required = true)
    protected String maxLength;
    @XmlElement(required = true)
    protected String minLength;
    @XmlElement(required = true)
    protected String helperText;
    @XmlElement(required = true)
    protected String errorText;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the optionalField property.
     * 
     */
    public boolean isOptionalField() {
        return optionalField;
    }

    /**
     * Sets the value of the optionalField property.
     * 
     */
    public void setOptionalField(boolean value) {
        this.optionalField = value;
    }

    /**
     * Gets the value of the retriesAllowed property.
     * 
     */
    public int getRetriesAllowed() {
        return retriesAllowed;
    }

    /**
     * Sets the value of the retriesAllowed property.
     * 
     */
    public void setRetriesAllowed(int value) {
        this.retriesAllowed = value;
    }

    /**
     * Gets the value of the retriesRemaining property.
     * 
     */
    public int getRetriesRemaining() {
        return retriesRemaining;
    }

    /**
     * Sets the value of the retriesRemaining property.
     * 
     */
    public void setRetriesRemaining(int value) {
        this.retriesRemaining = value;
    }

    /**
     * Gets the value of the supportedValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationSupportedValue }
     * 
     * 
     */
    public List<AdditionalInformationSupportedValue> getSupportedValues() {
        if (supportedValues == null) {
            supportedValues = new ArrayList<AdditionalInformationSupportedValue>();
        }
        return this.supportedValues;
    }

    /**
     * Gets the value of the retryRequired property.
     * 
     */
    public boolean isRetryRequired() {
        return retryRequired;
    }

    /**
     * Sets the value of the retryRequired property.
     * 
     */
    public void setRetryRequired(boolean value) {
        this.retryRequired = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLength(String value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinLength(String value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the helperText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperText() {
        return helperText;
    }

    /**
     * Sets the value of the helperText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperText(String value) {
        this.helperText = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

}
