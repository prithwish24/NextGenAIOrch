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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.common.enums.LoyaltyProgramType;
import com.cts.product.profile.dto.profiles.Address;
import com.cts.product.profile.dto.profiles.Phone;


/**
 * <p>Java class for DriverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://com.ehi.gbo.profile.dto.profiles/}Phone"/&gt;
 *         &lt;element name="address" type="{http://com.ehi.gbo.profile.dto.profiles/}Address"/&gt;
 *         &lt;element name="requestEmailPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="individualIndentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="membershipProgram" type="{http://com.ehi.gbo.profile.dto.common.enums/}LoyaltyProgramType"/&gt;
 *         &lt;element name="sourceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverInfo", propOrder = {
    "firstName",
    "lastName",
    "emailAddress",
    "phone",
    "address",
    "requestEmailPromotions",
    "individualIndentifier",
    "membershipProgram",
    "sourceCode"
})
public class DriverInfo
    extends Request
    implements Serializable
{

    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected Phone phone;
    @XmlElement(required = true)
    protected Address address;
    protected Boolean requestEmailPromotions;
    @XmlElement(required = true)
    protected String individualIndentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyProgramType membershipProgram;
    @XmlElement(required = true)
    protected String sourceCode;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the requestEmailPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequestEmailPromotions() {
        return requestEmailPromotions;
    }

    /**
     * Sets the value of the requestEmailPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestEmailPromotions(Boolean value) {
        this.requestEmailPromotions = value;
    }

    /**
     * Gets the value of the individualIndentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualIndentifier() {
        return individualIndentifier;
    }

    /**
     * Sets the value of the individualIndentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualIndentifier(String value) {
        this.individualIndentifier = value;
    }

    /**
     * Gets the value of the membershipProgram property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramType }
     *     
     */
    public LoyaltyProgramType getMembershipProgram() {
        return membershipProgram;
    }

    /**
     * Sets the value of the membershipProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramType }
     *     
     */
    public void setMembershipProgram(LoyaltyProgramType value) {
        this.membershipProgram = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCode(String value) {
        this.sourceCode = value;
    }

}
