//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.06 at 04:12:32 PM IST 
//


package com.cts.product.rental.dto.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This holds About this application text
 *             
 * 
 * <p>Java class for AboutThisAppResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AboutThisAppResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.rental.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aboutThisApp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AboutThisAppResponse", propOrder = {
    "aboutThisApp"
})
public class AboutThisAppResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected String aboutThisApp;

    /**
     * Gets the value of the aboutThisApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboutThisApp() {
        return aboutThisApp;
    }

    /**
     * Sets the value of the aboutThisApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboutThisApp(String value) {
        this.aboutThisApp = value;
    }

}
