//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 06:05:25 PM IST 
//


package com.cts.product.rental.dto.pricing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalDriverRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalDriverRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.cts.product.rental.dto.pricing/}SupplementalRate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfFreeAdditionalDrivers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalDriverRate", propOrder = {
    "numberOfFreeAdditionalDrivers"
})
public class AdditionalDriverRate
    extends SupplementalRate
    implements Serializable
{

    protected int numberOfFreeAdditionalDrivers;

    /**
     * Gets the value of the numberOfFreeAdditionalDrivers property.
     * 
     */
    public int getNumberOfFreeAdditionalDrivers() {
        return numberOfFreeAdditionalDrivers;
    }

    /**
     * Sets the value of the numberOfFreeAdditionalDrivers property.
     * 
     */
    public void setNumberOfFreeAdditionalDrivers(int value) {
        this.numberOfFreeAdditionalDrivers = value;
    }

}
