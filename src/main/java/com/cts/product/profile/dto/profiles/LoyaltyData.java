//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 07:18:08 PM IST 
//

package com.cts.product.profile.dto.profiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Contains loyalty information such as name and number.
 * </p>
 * 
 * 
 * <p>
 * Java class for LoyaltyData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyProgram" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loyaltyLevelCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="loyaltyMemberShipType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointsToDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yearToDateRentalCounts" type="{http://com.ehi.gbo.profile.dto.profiles/}RentalCountsType"/&gt;
 *         &lt;element name="lifetimeToDateRentalCounts" type="{http://com.ehi.gbo.profile.dto.profiles/}RentalCountsType"/&gt;
 *         &lt;element name="priorYearRentalCounts" type="{http://com.ehi.gbo.profile.dto.profiles/}RentalCountsType"/&gt;
 *         &lt;element ref="{http://com.ehi.gbo.profile.dto.profiles/}loyaltyTier"/&gt;
 *         &lt;element name="levelOfServicesCodelist" type="{http://com.ehi.gbo.profile.dto.profiles/}LevelOfServices" maxOccurs="unbounded"/&gt;
 *         &lt;element name="granted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="membershipStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="membershipEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="redemptionCouponData" type="{http://com.ehi.gbo.profile.dto.profiles/}RedemptionCouponData"/&gt;
 *         &lt;element name="creditsNeededForFreeDay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="creditsReceived" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="freeDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="freeDaysOverLifetime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="creditsToFreeDayForTier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="activityToNextTier" type="{http://com.ehi.gbo.profile.dto.profiles/}ActivityToNextTier"/&gt;
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brandDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointsExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointsBalanceStatusType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyData", propOrder = { "id", "loyaltyNumber", "loyaltyProgramCode", "loyaltyProgram",
	"loyaltyLevelCode", "loyaltyMemberShipType", "pointsToDate", "yearToDateRentalCounts",
	"lifetimeToDateRentalCounts", "priorYearRentalCounts", "loyaltyTier", "levelOfServicesCodelists", "granted",
	"membershipStartDate", "membershipEndDate", "redemptionCouponData", "creditsNeededForFreeDay",
	"creditsReceived", "freeDays", "freeDaysOverLifetime", "creditsToFreeDayForTier", "activityToNextTier",
	"brandCode", "brandDescription", "pointsExpirationDate", "pointsBalanceStatusType" })
public class LoyaltyData implements Serializable {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String loyaltyNumber;
    @XmlElement(required = true)
    protected String loyaltyProgramCode;
    @XmlElement(required = true)
    protected String loyaltyProgram;
    @XmlElement(required = true)
    protected String loyaltyCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long loyaltyLevelCode;
    @XmlElement(required = true)
    protected String loyaltyMemberShipType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pointsToDate;
    @XmlElement(required = true)
    protected RentalCountsType yearToDateRentalCounts;
    @XmlElement(required = true)
    protected RentalCountsType lifetimeToDateRentalCounts;
    @XmlElement(required = true)
    protected RentalCountsType priorYearRentalCounts;
    @XmlElement(namespace = "http://com.ehi.gbo.profile.dto.profiles/", required = true)
    protected String loyaltyTier;
    @XmlElement(name = "levelOfServicesCodelist", required = true)
    protected List<LevelOfServices> levelOfServicesCodelists;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean granted;
    @XmlElement(required = true)
    protected String membershipStartDate;
    @XmlElement(required = true)
    protected String membershipEndDate;
    @XmlElement(required = true)
    protected RedemptionCouponData redemptionCouponData;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creditsNeededForFreeDay;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creditsReceived;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer freeDays;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer freeDaysOverLifetime;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creditsToFreeDayForTier;
    @XmlElement(required = true)
    protected ActivityToNextTier activityToNextTier;
    @XmlElement(required = true)
    protected String brandCode;
    @XmlElement(required = true)
    protected String brandDescription;
    @XmlElement(required = true)
    protected String pointsExpirationDate;
    @XmlElement(required = true)
    protected String pointsBalanceStatusType;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
	return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
	this.id = value;
    }

    /**
     * Gets the value of the loyaltyNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyNumber() {
	return loyaltyNumber;
    }

    /**
     * Sets the value of the loyaltyNumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyNumber(String value) {
	this.loyaltyNumber = value;
    }

    /**
     * Gets the value of the loyaltyProgramCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyProgramCode() {
	return loyaltyProgramCode;
    }

    /**
     * Sets the value of the loyaltyProgramCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyProgramCode(String value) {
	this.loyaltyProgramCode = value;
    }

    /**
     * Gets the value of the loyaltyProgram property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyProgram() {
	return loyaltyProgram;
    }

    /**
     * Sets the value of the loyaltyProgram property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyProgram(String value) {
	this.loyaltyProgram = value;
    }

    /**
     * Gets the value of the loyaltyCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyCode() {
	return loyaltyCode;
    }

    /**
     * Sets the value of the loyaltyCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyCode(String value) {
	this.loyaltyCode = value;
    }

    /**
     * Gets the value of the loyaltyLevelCode property.
     * 
     * @return possible object is {@link Long }
     * 
     */
    public Long getLoyaltyLevelCode() {
	return loyaltyLevelCode;
    }

    /**
     * Sets the value of the loyaltyLevelCode property.
     * 
     * @param value
     *            allowed object is {@link Long }
     * 
     */
    public void setLoyaltyLevelCode(Long value) {
	this.loyaltyLevelCode = value;
    }

    /**
     * Gets the value of the loyaltyMemberShipType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyMemberShipType() {
	return loyaltyMemberShipType;
    }

    /**
     * Sets the value of the loyaltyMemberShipType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyMemberShipType(String value) {
	this.loyaltyMemberShipType = value;
    }

    /**
     * Gets the value of the pointsToDate property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getPointsToDate() {
	return pointsToDate;
    }

    /**
     * Sets the value of the pointsToDate property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setPointsToDate(Integer value) {
	this.pointsToDate = value;
    }

    /**
     * Gets the value of the yearToDateRentalCounts property.
     * 
     * @return possible object is {@link RentalCountsType }
     * 
     */
    public RentalCountsType getYearToDateRentalCounts() {
	return yearToDateRentalCounts;
    }

    /**
     * Sets the value of the yearToDateRentalCounts property.
     * 
     * @param value
     *            allowed object is {@link RentalCountsType }
     * 
     */
    public void setYearToDateRentalCounts(RentalCountsType value) {
	this.yearToDateRentalCounts = value;
    }

    /**
     * Gets the value of the lifetimeToDateRentalCounts property.
     * 
     * @return possible object is {@link RentalCountsType }
     * 
     */
    public RentalCountsType getLifetimeToDateRentalCounts() {
	return lifetimeToDateRentalCounts;
    }

    /**
     * Sets the value of the lifetimeToDateRentalCounts property.
     * 
     * @param value
     *            allowed object is {@link RentalCountsType }
     * 
     */
    public void setLifetimeToDateRentalCounts(RentalCountsType value) {
	this.lifetimeToDateRentalCounts = value;
    }

    /**
     * Gets the value of the priorYearRentalCounts property.
     * 
     * @return possible object is {@link RentalCountsType }
     * 
     */
    public RentalCountsType getPriorYearRentalCounts() {
	return priorYearRentalCounts;
    }

    /**
     * Sets the value of the priorYearRentalCounts property.
     * 
     * @param value
     *            allowed object is {@link RentalCountsType }
     * 
     */
    public void setPriorYearRentalCounts(RentalCountsType value) {
	this.priorYearRentalCounts = value;
    }

    /**
     * Gets the value of the loyaltyTier property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLoyaltyTier() {
	return loyaltyTier;
    }

    /**
     * Sets the value of the loyaltyTier property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLoyaltyTier(String value) {
	this.loyaltyTier = value;
    }

    /**
     * Gets the value of the levelOfServicesCodelists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the levelOfServicesCodelists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getLevelOfServicesCodelists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelOfServices }
     * 
     * 
     */
    public List<LevelOfServices> getLevelOfServicesCodelists() {
	if (levelOfServicesCodelists == null) {
	    levelOfServicesCodelists = new ArrayList<LevelOfServices>();
	}
	return this.levelOfServicesCodelists;
    }

    /**
     * Gets the value of the granted property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean getGranted() {
	return granted;
    }

    /**
     * Sets the value of the granted property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setGranted(Boolean value) {
	this.granted = value;
    }

    /**
     * Gets the value of the membershipStartDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMembershipStartDate() {
	return membershipStartDate;
    }

    /**
     * Sets the value of the membershipStartDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMembershipStartDate(String value) {
	this.membershipStartDate = value;
    }

    /**
     * Gets the value of the membershipEndDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMembershipEndDate() {
	return membershipEndDate;
    }

    /**
     * Sets the value of the membershipEndDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMembershipEndDate(String value) {
	this.membershipEndDate = value;
    }

    /**
     * Gets the value of the redemptionCouponData property.
     * 
     * @return possible object is {@link RedemptionCouponData }
     * 
     */
    public RedemptionCouponData getRedemptionCouponData() {
	return redemptionCouponData;
    }

    /**
     * Sets the value of the redemptionCouponData property.
     * 
     * @param value
     *            allowed object is {@link RedemptionCouponData }
     * 
     */
    public void setRedemptionCouponData(RedemptionCouponData value) {
	this.redemptionCouponData = value;
    }

    /**
     * Gets the value of the creditsNeededForFreeDay property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getCreditsNeededForFreeDay() {
	return creditsNeededForFreeDay;
    }

    /**
     * Sets the value of the creditsNeededForFreeDay property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setCreditsNeededForFreeDay(Integer value) {
	this.creditsNeededForFreeDay = value;
    }

    /**
     * Gets the value of the creditsReceived property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getCreditsReceived() {
	return creditsReceived;
    }

    /**
     * Sets the value of the creditsReceived property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setCreditsReceived(Integer value) {
	this.creditsReceived = value;
    }

    /**
     * Gets the value of the freeDays property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getFreeDays() {
	return freeDays;
    }

    /**
     * Sets the value of the freeDays property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setFreeDays(Integer value) {
	this.freeDays = value;
    }

    /**
     * Gets the value of the freeDaysOverLifetime property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getFreeDaysOverLifetime() {
	return freeDaysOverLifetime;
    }

    /**
     * Sets the value of the freeDaysOverLifetime property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setFreeDaysOverLifetime(Integer value) {
	this.freeDaysOverLifetime = value;
    }

    /**
     * Gets the value of the creditsToFreeDayForTier property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getCreditsToFreeDayForTier() {
	return creditsToFreeDayForTier;
    }

    /**
     * Sets the value of the creditsToFreeDayForTier property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setCreditsToFreeDayForTier(Integer value) {
	this.creditsToFreeDayForTier = value;
    }

    /**
     * Gets the value of the activityToNextTier property.
     * 
     * @return possible object is {@link ActivityToNextTier }
     * 
     */
    public ActivityToNextTier getActivityToNextTier() {
	return activityToNextTier;
    }

    /**
     * Sets the value of the activityToNextTier property.
     * 
     * @param value
     *            allowed object is {@link ActivityToNextTier }
     * 
     */
    public void setActivityToNextTier(ActivityToNextTier value) {
	this.activityToNextTier = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBrandCode() {
	return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBrandCode(String value) {
	this.brandCode = value;
    }

    /**
     * Gets the value of the brandDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBrandDescription() {
	return brandDescription;
    }

    /**
     * Sets the value of the brandDescription property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBrandDescription(String value) {
	this.brandDescription = value;
    }

    /**
     * Gets the value of the pointsExpirationDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPointsExpirationDate() {
	return pointsExpirationDate;
    }

    /**
     * Sets the value of the pointsExpirationDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPointsExpirationDate(String value) {
	this.pointsExpirationDate = value;
    }

    /**
     * Gets the value of the pointsBalanceStatusType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPointsBalanceStatusType() {
	return pointsBalanceStatusType;
    }

    /**
     * Sets the value of the pointsBalanceStatusType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPointsBalanceStatusType(String value) {
	this.pointsBalanceStatusType = value;
    }

}
