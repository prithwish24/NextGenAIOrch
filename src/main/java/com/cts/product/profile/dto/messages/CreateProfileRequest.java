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
import com.cts.product.profile.dto.profiles.LicenseProfile;
import com.cts.product.profile.dto.profiles.NationalId;
import com.cts.product.profile.dto.profiles.Passport;
import com.cts.product.profile.dto.profiles.Phone;
import com.cts.product.profile.dto.profiles.Preference;
import com.cts.product.profile.dto.profiles.TermsAndConditions;


/**
 * <p>The request for an update to the user's profile.</p> 
 * 
 * <p>Java class for CreateProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateProfileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com.ehi.gbo.profile.dto.messages/}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="townOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://com.ehi.gbo.profile.dto.profiles/}Address"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phones" type="{http://com.ehi.gbo.profile.dto.profiles/}Phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="driversLicense" type="{http://com.ehi.gbo.profile.dto.profiles/}LicenseProfile"/&gt;
 *         &lt;element name="passport" type="{http://com.ehi.gbo.profile.dto.profiles/}Passport"/&gt;
 *         &lt;element name="nationalId" type="{http://com.ehi.gbo.profile.dto.profiles/}NationalId"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termsAndConditions" type="{http://com.ehi.gbo.profile.dto.profiles/}TermsAndConditions"/&gt;
 *         &lt;element name="preference" type="{http://com.ehi.gbo.profile.dto.profiles/}Preference"/&gt;
 *         &lt;element name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useMemberNumberAsUsername" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="requestOriginChannel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="normalLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="individualId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateProfileRequest", propOrder = {
    "firstName",
    "lastName",
    "dateOfBirth",
    "townOfBirth",
    "address",
    "email",
    "phones",
    "driversLicense",
    "passport",
    "nationalId",
    "password",
    "termsAndConditions",
    "preference",
    "preferredLanguage",
    "useMemberNumberAsUsername",
    "requestOriginChannel",
    "userName",
    "normalLink",
    "individualId"
})
public class CreateProfileRequest
    extends Request
    implements Serializable
{

    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String dateOfBirth;
    @XmlElement(required = true)
    protected String townOfBirth;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected String email;
    protected List<Phone> phones;
    @XmlElement(required = true)
    protected LicenseProfile driversLicense;
    @XmlElement(required = true)
    protected Passport passport;
    @XmlElement(required = true)
    protected NationalId nationalId;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected TermsAndConditions termsAndConditions;
    @XmlElement(required = true)
    protected Preference preference;
    @XmlElement(required = true)
    protected String preferredLanguage;
    protected boolean useMemberNumberAsUsername;
    @XmlElement(required = true)
    protected String requestOriginChannel;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean normalLink;
    @XmlElement(required = true)
    protected String individualId;

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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the townOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownOfBirth() {
        return townOfBirth;
    }

    /**
     * Sets the value of the townOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownOfBirth(String value) {
        this.townOfBirth = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhones() {
        if (phones == null) {
            phones = new ArrayList<Phone>();
        }
        return this.phones;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseProfile }
     *     
     */
    public LicenseProfile getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseProfile }
     *     
     */
    public void setDriversLicense(LicenseProfile value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link Passport }
     *     
     */
    public Passport getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passport }
     *     
     */
    public void setPassport(Passport value) {
        this.passport = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link NationalId }
     *     
     */
    public NationalId getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalId }
     *     
     */
    public void setNationalId(NationalId value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setPreference(Preference value) {
        this.preference = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the useMemberNumberAsUsername property.
     * 
     */
    public boolean isUseMemberNumberAsUsername() {
        return useMemberNumberAsUsername;
    }

    /**
     * Sets the value of the useMemberNumberAsUsername property.
     * 
     */
    public void setUseMemberNumberAsUsername(boolean value) {
        this.useMemberNumberAsUsername = value;
    }

    /**
     * Gets the value of the requestOriginChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestOriginChannel() {
        return requestOriginChannel;
    }

    /**
     * Sets the value of the requestOriginChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestOriginChannel(String value) {
        this.requestOriginChannel = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the normalLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNormalLink() {
        return normalLink;
    }

    /**
     * Sets the value of the normalLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalLink(Boolean value) {
        this.normalLink = value;
    }

    /**
     * Gets the value of the individualId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualId() {
        return individualId;
    }

    /**
     * Sets the value of the individualId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualId(String value) {
        this.individualId = value;
    }

}
