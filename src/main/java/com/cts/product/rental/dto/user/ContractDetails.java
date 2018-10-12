//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.12 at 04:33:39 PM IST 
//


package com.cts.product.rental.dto.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.cts.product.rental.dto.common.CustomLink;
import com.cts.product.rental.dto.common.ImageDetails;
import com.cts.product.rental.dto.common.SpecialAccountMessage;
import com.cts.product.rental.dto.common.enums.AuthenticationType;
import com.cts.product.rental.dto.common.enums.ContractSubType;
import com.cts.product.rental.dto.common.enums.ContractSubTypeEnum;
import com.cts.product.rental.dto.common.enums.ContractTypeEnum;
import com.cts.product.rental.dto.reservation.AdditionalInfo;


/**
 * <p>Java class for ContractDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractType" type="{http://com.cts.product.rental.dto.common.enums/}ContractTypeEnum"/&gt;
 *         &lt;element name="contractSubType" type="{http://com.cts.product.rental.dto.common.enums/}ContractSubTypeEnum"/&gt;
 *         &lt;element name="contractName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iataNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractShortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractAcceptsBilling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contractBillingAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maskContractBillingAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractWelcomeMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="additionalInformation" type="{http://com.cts.product.rental.dto.reservation/}AdditionalInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="restrictions" type="{http://com.cts.product.rental.dto.user/}Restrictions"/&gt;
 *         &lt;element name="promotionImage" type="{http://com.cts.product.rental.dto.common/}ImageDetails"/&gt;
 *         &lt;element name="contractImage" type="{http://com.cts.product.rental.dto.common/}ImageDetails"/&gt;
 *         &lt;element name="contractHasAdditionalBenefits" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="marketingMessageIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowAccountRemovalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="loyaltySignUpEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="upgradeOfferIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customLinks" type="{http://com.cts.product.rental.dto.common/}CustomLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="frequentFlyerEligibleIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="authenticationType" type="{http://com.cts.product.rental.dto.common.enums/}AuthenticationType"/&gt;
 *         &lt;element name="nonEnrichedContractName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mobDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mobShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalInfoBeforeRates" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contractUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="specialAccountMessage" type="{http://com.cts.product.rental.dto.common/}SpecialAccountMessage"/&gt;
 *         &lt;element name="thirdPartyEmailNotify" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="emailOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="disableMembershipPrograms" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vipPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultLoyaltyContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="subType" type="{http://com.cts.product.rental.dto.common.enums/}ContractSubType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractDetails", propOrder = {
    "contractNumber",
    "contractType",
    "contractSubType",
    "contractName",
    "contractDescription",
    "iataNumber",
    "contractShortDescription",
    "contractAcceptsBilling",
    "contractBillingAccount",
    "maskContractBillingAccount",
    "termsAndConditions",
    "contractWelcomeMessage",
    "additionalInformation",
    "restrictions",
    "promotionImage",
    "contractImage",
    "contractHasAdditionalBenefits",
    "marketingMessageIndicator",
    "allowAccountRemovalIndicator",
    "loyaltySignUpEligible",
    "upgradeOfferIndicator",
    "customLinks",
    "frequentFlyerEligibleIndicator",
    "allowOneWay",
    "authenticationType",
    "nonEnrichedContractName",
    "mobDescriptions",
    "mobShortDescriptions",
    "additionalInfoBeforeRates",
    "contractUrl",
    "specialAccountMessage",
    "thirdPartyEmailNotify",
    "emailOptIn",
    "disableMembershipPrograms",
    "vipPhoneNumber",
    "defaultLoyaltyContract",
    "subType"
})
@XmlSeeAlso({
    ExtendedContractDetails.class
})
public class ContractDetails
    implements Serializable
{

    @XmlElement(required = true)
    protected String contractNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ContractTypeEnum contractType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ContractSubTypeEnum contractSubType;
    @XmlElement(required = true)
    protected String contractName;
    @XmlElement(required = true)
    protected String contractDescription;
    @XmlElement(required = true)
    protected String iataNumber;
    @XmlElement(required = true)
    protected String contractShortDescription;
    protected boolean contractAcceptsBilling;
    @XmlElement(required = true)
    protected String contractBillingAccount;
    @XmlElement(required = true)
    protected String maskContractBillingAccount;
    @XmlElement(required = true)
    protected String termsAndConditions;
    @XmlElement(required = true)
    protected String contractWelcomeMessage;
    protected List<AdditionalInfo> additionalInformation;
    @XmlElement(required = true)
    protected Restrictions restrictions;
    @XmlElement(required = true)
    protected ImageDetails promotionImage;
    @XmlElement(required = true)
    protected ImageDetails contractImage;
    protected boolean contractHasAdditionalBenefits;
    protected boolean marketingMessageIndicator;
    protected boolean allowAccountRemovalIndicator;
    protected boolean loyaltySignUpEligible;
    protected boolean upgradeOfferIndicator;
    protected List<CustomLink> customLinks;
    protected boolean frequentFlyerEligibleIndicator;
    protected boolean allowOneWay;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationType authenticationType;
    @XmlElement(required = true)
    protected String nonEnrichedContractName;
    @XmlElement(name = "mobDescription")
    protected List<String> mobDescriptions;
    @XmlElement(name = "mobShortDescription")
    protected List<String> mobShortDescriptions;
    protected boolean additionalInfoBeforeRates;
    @XmlElement(required = true)
    protected String contractUrl;
    @XmlElement(required = true)
    protected SpecialAccountMessage specialAccountMessage;
    protected boolean thirdPartyEmailNotify;
    protected boolean emailOptIn;
    protected List<String> disableMembershipPrograms;
    @XmlElement(required = true)
    protected String vipPhoneNumber;
    protected boolean defaultLoyaltyContract;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ContractSubType subType;

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTypeEnum }
     *     
     */
    public ContractTypeEnum getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTypeEnum }
     *     
     */
    public void setContractType(ContractTypeEnum value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the contractSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSubTypeEnum }
     *     
     */
    public ContractSubTypeEnum getContractSubType() {
        return contractSubType;
    }

    /**
     * Sets the value of the contractSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubTypeEnum }
     *     
     */
    public void setContractSubType(ContractSubTypeEnum value) {
        this.contractSubType = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the contractDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDescription() {
        return contractDescription;
    }

    /**
     * Sets the value of the contractDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDescription(String value) {
        this.contractDescription = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the contractShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractShortDescription() {
        return contractShortDescription;
    }

    /**
     * Sets the value of the contractShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractShortDescription(String value) {
        this.contractShortDescription = value;
    }

    /**
     * Gets the value of the contractAcceptsBilling property.
     * 
     */
    public boolean isContractAcceptsBilling() {
        return contractAcceptsBilling;
    }

    /**
     * Sets the value of the contractAcceptsBilling property.
     * 
     */
    public void setContractAcceptsBilling(boolean value) {
        this.contractAcceptsBilling = value;
    }

    /**
     * Gets the value of the contractBillingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractBillingAccount() {
        return contractBillingAccount;
    }

    /**
     * Sets the value of the contractBillingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractBillingAccount(String value) {
        this.contractBillingAccount = value;
    }

    /**
     * Gets the value of the maskContractBillingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskContractBillingAccount() {
        return maskContractBillingAccount;
    }

    /**
     * Sets the value of the maskContractBillingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskContractBillingAccount(String value) {
        this.maskContractBillingAccount = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the contractWelcomeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractWelcomeMessage() {
        return contractWelcomeMessage;
    }

    /**
     * Sets the value of the contractWelcomeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractWelcomeMessage(String value) {
        this.contractWelcomeMessage = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the promotionImage property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDetails }
     *     
     */
    public ImageDetails getPromotionImage() {
        return promotionImage;
    }

    /**
     * Sets the value of the promotionImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDetails }
     *     
     */
    public void setPromotionImage(ImageDetails value) {
        this.promotionImage = value;
    }

    /**
     * Gets the value of the contractImage property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDetails }
     *     
     */
    public ImageDetails getContractImage() {
        return contractImage;
    }

    /**
     * Sets the value of the contractImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDetails }
     *     
     */
    public void setContractImage(ImageDetails value) {
        this.contractImage = value;
    }

    /**
     * Gets the value of the contractHasAdditionalBenefits property.
     * 
     */
    public boolean isContractHasAdditionalBenefits() {
        return contractHasAdditionalBenefits;
    }

    /**
     * Sets the value of the contractHasAdditionalBenefits property.
     * 
     */
    public void setContractHasAdditionalBenefits(boolean value) {
        this.contractHasAdditionalBenefits = value;
    }

    /**
     * Gets the value of the marketingMessageIndicator property.
     * 
     */
    public boolean isMarketingMessageIndicator() {
        return marketingMessageIndicator;
    }

    /**
     * Sets the value of the marketingMessageIndicator property.
     * 
     */
    public void setMarketingMessageIndicator(boolean value) {
        this.marketingMessageIndicator = value;
    }

    /**
     * Gets the value of the allowAccountRemovalIndicator property.
     * 
     */
    public boolean isAllowAccountRemovalIndicator() {
        return allowAccountRemovalIndicator;
    }

    /**
     * Sets the value of the allowAccountRemovalIndicator property.
     * 
     */
    public void setAllowAccountRemovalIndicator(boolean value) {
        this.allowAccountRemovalIndicator = value;
    }

    /**
     * Gets the value of the loyaltySignUpEligible property.
     * 
     */
    public boolean isLoyaltySignUpEligible() {
        return loyaltySignUpEligible;
    }

    /**
     * Sets the value of the loyaltySignUpEligible property.
     * 
     */
    public void setLoyaltySignUpEligible(boolean value) {
        this.loyaltySignUpEligible = value;
    }

    /**
     * Gets the value of the upgradeOfferIndicator property.
     * 
     */
    public boolean isUpgradeOfferIndicator() {
        return upgradeOfferIndicator;
    }

    /**
     * Sets the value of the upgradeOfferIndicator property.
     * 
     */
    public void setUpgradeOfferIndicator(boolean value) {
        this.upgradeOfferIndicator = value;
    }

    /**
     * Gets the value of the customLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLink }
     * 
     * 
     */
    public List<CustomLink> getCustomLinks() {
        if (customLinks == null) {
            customLinks = new ArrayList<CustomLink>();
        }
        return this.customLinks;
    }

    /**
     * Gets the value of the frequentFlyerEligibleIndicator property.
     * 
     */
    public boolean isFrequentFlyerEligibleIndicator() {
        return frequentFlyerEligibleIndicator;
    }

    /**
     * Sets the value of the frequentFlyerEligibleIndicator property.
     * 
     */
    public void setFrequentFlyerEligibleIndicator(boolean value) {
        this.frequentFlyerEligibleIndicator = value;
    }

    /**
     * Gets the value of the allowOneWay property.
     * 
     */
    public boolean isAllowOneWay() {
        return allowOneWay;
    }

    /**
     * Sets the value of the allowOneWay property.
     * 
     */
    public void setAllowOneWay(boolean value) {
        this.allowOneWay = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the nonEnrichedContractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEnrichedContractName() {
        return nonEnrichedContractName;
    }

    /**
     * Sets the value of the nonEnrichedContractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEnrichedContractName(String value) {
        this.nonEnrichedContractName = value;
    }

    /**
     * Gets the value of the mobDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobDescriptions() {
        if (mobDescriptions == null) {
            mobDescriptions = new ArrayList<String>();
        }
        return this.mobDescriptions;
    }

    /**
     * Gets the value of the mobShortDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobShortDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobShortDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobShortDescriptions() {
        if (mobShortDescriptions == null) {
            mobShortDescriptions = new ArrayList<String>();
        }
        return this.mobShortDescriptions;
    }

    /**
     * Gets the value of the additionalInfoBeforeRates property.
     * 
     */
    public boolean isAdditionalInfoBeforeRates() {
        return additionalInfoBeforeRates;
    }

    /**
     * Sets the value of the additionalInfoBeforeRates property.
     * 
     */
    public void setAdditionalInfoBeforeRates(boolean value) {
        this.additionalInfoBeforeRates = value;
    }

    /**
     * Gets the value of the contractUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractUrl() {
        return contractUrl;
    }

    /**
     * Sets the value of the contractUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractUrl(String value) {
        this.contractUrl = value;
    }

    /**
     * Gets the value of the specialAccountMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialAccountMessage }
     *     
     */
    public SpecialAccountMessage getSpecialAccountMessage() {
        return specialAccountMessage;
    }

    /**
     * Sets the value of the specialAccountMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialAccountMessage }
     *     
     */
    public void setSpecialAccountMessage(SpecialAccountMessage value) {
        this.specialAccountMessage = value;
    }

    /**
     * Gets the value of the thirdPartyEmailNotify property.
     * 
     */
    public boolean isThirdPartyEmailNotify() {
        return thirdPartyEmailNotify;
    }

    /**
     * Sets the value of the thirdPartyEmailNotify property.
     * 
     */
    public void setThirdPartyEmailNotify(boolean value) {
        this.thirdPartyEmailNotify = value;
    }

    /**
     * Gets the value of the emailOptIn property.
     * 
     */
    public boolean isEmailOptIn() {
        return emailOptIn;
    }

    /**
     * Sets the value of the emailOptIn property.
     * 
     */
    public void setEmailOptIn(boolean value) {
        this.emailOptIn = value;
    }

    /**
     * Gets the value of the disableMembershipPrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disableMembershipPrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisableMembershipPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisableMembershipPrograms() {
        if (disableMembershipPrograms == null) {
            disableMembershipPrograms = new ArrayList<String>();
        }
        return this.disableMembershipPrograms;
    }

    /**
     * Gets the value of the vipPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipPhoneNumber() {
        return vipPhoneNumber;
    }

    /**
     * Sets the value of the vipPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipPhoneNumber(String value) {
        this.vipPhoneNumber = value;
    }

    /**
     * Gets the value of the defaultLoyaltyContract property.
     * 
     */
    public boolean isDefaultLoyaltyContract() {
        return defaultLoyaltyContract;
    }

    /**
     * Sets the value of the defaultLoyaltyContract property.
     * 
     */
    public void setDefaultLoyaltyContract(boolean value) {
        this.defaultLoyaltyContract = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSubType }
     *     
     */
    public ContractSubType getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubType }
     *     
     */
    public void setSubType(ContractSubType value) {
        this.subType = value;
    }

}
