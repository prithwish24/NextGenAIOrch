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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.rental.dto.common.AdditionalInformationSupportedValue;
import com.cts.product.rental.dto.common.enums.AdditionalFieldTypeEnum;


/**
 * <p>Java class for AdditionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="helperText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="validateAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="type" type="{http://com.ehi.gbo.rental.dto.common.enums/}AdditionalFieldTypeEnum"/&gt;
 *         &lt;element name="supportedValues" type="{http://com.ehi.gbo.rental.dto.common/}AdditionalInformationSupportedValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInfo", propOrder = {
    "id",
    "name",
    "helperText",
    "sequence",
    "required",
    "validateAdditionalInfo",
    "modifiable",
    "type",
    "supportedValues"
})
public class AdditionalInfo
    implements Serializable
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String helperText;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer sequence;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean required;
    protected boolean validateAdditionalInfo;
    protected boolean modifiable;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AdditionalFieldTypeEnum type;
    @XmlElement(nillable = true)
    protected List<AdditionalInformationSupportedValue> supportedValues;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the validateAdditionalInfo property.
     * 
     */
    public boolean isValidateAdditionalInfo() {
        return validateAdditionalInfo;
    }

    /**
     * Sets the value of the validateAdditionalInfo property.
     * 
     */
    public void setValidateAdditionalInfo(boolean value) {
        this.validateAdditionalInfo = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFieldTypeEnum }
     *     
     */
    public AdditionalFieldTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFieldTypeEnum }
     *     
     */
    public void setType(AdditionalFieldTypeEnum value) {
        this.type = value;
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

}