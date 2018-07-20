//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//


package com.cts.product.profile.dto.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.Address;
import com.cts.product.profile.dto.profiles.ContactProfile;
import com.cts.product.profile.dto.profiles.ExtendedPreference;
import com.cts.product.profile.dto.profiles.LegalId;
import com.cts.product.profile.dto.profiles.LicenseProfile;
import com.cts.product.profile.dto.profiles.PaymentProfile;
import com.cts.product.profile.dto.profiles.Profile;
import com.cts.product.profile.dto.profiles.SecurityQuestion;
import com.cts.product.profile.dto.profiles.TermsAndConditions;


/**
 * <p>The login response</p>
 * 			
 * 
 * <p>Java class for ProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profile" type="{http://com.ehi.gbo.profile.dto.profiles/}Profile"/&gt;
 *         &lt;element name="contactProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}ContactProfile"/&gt;
 *         &lt;element name="addressProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}Address"/&gt;
 *         &lt;element name="licenseProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}LicenseProfile"/&gt;
 *         &lt;element name="citizenshipProfiles" type="{http://com.ehi.gbo.profile.dto.profiles/}LegalId" maxOccurs="unbounded"/&gt;
 *         &lt;element name="paymentProfile" type="{http://com.ehi.gbo.profile.dto.profiles/}PaymentProfile"/&gt;
 *         &lt;element name="securityQuestion" type="{http://com.ehi.gbo.profile.dto.profiles/}SecurityQuestion"/&gt;
 *         &lt;element name="preference" type="{http://com.ehi.gbo.profile.dto.profiles/}ExtendedPreference"/&gt;
 *         &lt;element name="termsAndConditions" type="{http://com.ehi.gbo.profile.dto.profiles/}TermsAndConditions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileResponse", propOrder = {
    "profile",
    "contactProfile",
    "addressProfile",
    "licenseProfile",
    "citizenshipProfiles",
    "paymentProfile",
    "securityQuestion",
    "preference",
    "termsAndConditions"
})
public class ProfileResponse
    extends Response
    implements Serializable
{

    @XmlElement(required = true)
    protected Profile profile;
    @XmlElement(required = true)
    protected ContactProfile contactProfile;
    @XmlElement(required = true)
    protected Address addressProfile;
    @XmlElement(required = true)
    protected LicenseProfile licenseProfile;
    @XmlElement(required = true)
    protected List<LegalId> citizenshipProfiles;
    @XmlElement(required = true)
    protected PaymentProfile paymentProfile;
    @XmlElement(required = true)
    protected SecurityQuestion securityQuestion;
    @XmlElement(required = true)
    protected ExtendedPreference preference;
    @XmlElement(required = true)
    protected TermsAndConditions termsAndConditions;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setProfile(Profile value) {
        this.profile = value;
    }

    /**
     * Gets the value of the contactProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ContactProfile }
     *     
     */
    public ContactProfile getContactProfile() {
        return contactProfile;
    }

    /**
     * Sets the value of the contactProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactProfile }
     *     
     */
    public void setContactProfile(ContactProfile value) {
        this.contactProfile = value;
    }

    /**
     * Gets the value of the addressProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddressProfile() {
        return addressProfile;
    }

    /**
     * Sets the value of the addressProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddressProfile(Address value) {
        this.addressProfile = value;
    }

    /**
     * Gets the value of the licenseProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseProfile }
     *     
     */
    public LicenseProfile getLicenseProfile() {
        return licenseProfile;
    }

    /**
     * Sets the value of the licenseProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseProfile }
     *     
     */
    public void setLicenseProfile(LicenseProfile value) {
        this.licenseProfile = value;
    }

    /**
     * Gets the value of the citizenshipProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenshipProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenshipProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalId }
     * 
     * 
     */
    public List<LegalId> getCitizenshipProfiles() {
        if (citizenshipProfiles == null) {
            citizenshipProfiles = new ArrayList<LegalId>();
        }
        return this.citizenshipProfiles;
    }

    /**
     * Gets the value of the paymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProfile }
     *     
     */
    public PaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    /**
     * Sets the value of the paymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProfile }
     *     
     */
    public void setPaymentProfile(PaymentProfile value) {
        this.paymentProfile = value;
    }

    /**
     * Gets the value of the securityQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityQuestion }
     *     
     */
    public SecurityQuestion getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Sets the value of the securityQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityQuestion }
     *     
     */
    public void setSecurityQuestion(SecurityQuestion value) {
        this.securityQuestion = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPreference }
     *     
     */
    public ExtendedPreference getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPreference }
     *     
     */
    public void setPreference(ExtendedPreference value) {
        this.preference = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link TermsAndConditions }
     *     
     */
    public TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsAndConditions }
     *     
     */
    public void setTermsAndConditions(TermsAndConditions value) {
        this.termsAndConditions = value;
    }

}
