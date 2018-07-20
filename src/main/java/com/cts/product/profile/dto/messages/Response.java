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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.cts.product.profile.dto.profiles.AdditionalDataInResponse;
import com.cts.product.profile.dto.profiles.EnrichedMessage;


/**
 * The base response object
 * 
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://com.ehi.gbo.profile.dto.profiles/}EnrichedMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalData" type="{http://com.ehi.gbo.profile.dto.profiles/}AdditionalDataInResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "messages",
    "additionalData"
})
@XmlSeeAlso({
    ProfileResponse.class,
    RetrieveContractualPreferencesResponse.class,
    SecurityQuestionResponse.class,
    RetrieveUsernameResponse.class,
    SecurityQuestionsResponse.class,
    ResetPasswordResponse.class,
    PartnerRewardsProgramsResponse.class,
    SubscriptionOptInResponse.class,
    LevelOfServiceListResponse.class,
    UserResponse.class,
    PaymentResponse.class,
    CardSubmissionKeyResponse.class,
    RetrieveSubscriptionDetailsResponse.class,
    RedemptionCouponsResponse.class,
    TermsAndConditionResponse.class,
    DecryptResponse.class
})
public class Response
    implements Serializable
{

    @XmlElement(name = "message")
    protected List<EnrichedMessage> messages;
    @XmlElement(required = true)
    protected AdditionalDataInResponse additionalData;

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrichedMessage }
     * 
     * 
     */
    public List<EnrichedMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<EnrichedMessage>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDataInResponse }
     *     
     */
    public AdditionalDataInResponse getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDataInResponse }
     *     
     */
    public void setAdditionalData(AdditionalDataInResponse value) {
        this.additionalData = value;
    }

}
