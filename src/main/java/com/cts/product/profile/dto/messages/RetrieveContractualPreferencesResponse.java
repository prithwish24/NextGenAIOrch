//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.ExtendedContractualPreferences;
import com.cts.product.profile.dto.profiles.Level;


/**
 * <p>Retrieve Contractual
 * 				Preferences</p> 
 * 
 * <p>Java class for RetrieveContractualPreferencesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveContractualPreferencesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractualPreferences" type="{http://com.ehi.gbo.profile.dto.profiles/}ExtendedContractualPreferences"/&gt;
 *         &lt;element name="level" type="{http://com.ehi.gbo.profile.dto.profiles/}Level"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveContractualPreferencesResponse", propOrder = {
    "contractualPreferences",
    "level"
})
public class RetrieveContractualPreferencesResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected ExtendedContractualPreferences contractualPreferences;
    @XmlElement(required = true)
    protected Level level;

    /**
     * Gets the value of the contractualPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedContractualPreferences }
     *     
     */
    public ExtendedContractualPreferences getContractualPreferences() {
        return contractualPreferences;
    }

    /**
     * Sets the value of the contractualPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedContractualPreferences }
     *     
     */
    public void setContractualPreferences(ExtendedContractualPreferences value) {
        this.contractualPreferences = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

}
