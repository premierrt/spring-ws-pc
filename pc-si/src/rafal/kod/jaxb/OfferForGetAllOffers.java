//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * typ oferty zwracanej w operacji getAllOffers
 * 
 * <p>Java class for OfferForGetAllOffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferForGetAllOffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://playmobile.pl/pc/types}tariff"/>
 *         &lt;element ref="{http://playmobile.pl/pc/types}offerPromotion" minOccurs="0"/>
 *         &lt;element name="businessCondition" type="{http://playmobile.pl/pc/types}BusinessCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="firstPeriodFee" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="offerId" use="required" type="{http://playmobile.pl/pc/types}OfferId" />
 *       &lt;attribute name="backupOfferId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agreementType" use="required" type="{http://playmobile.pl/pc/types}AgreementType" />
 *       &lt;attribute name="loyalityPeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="penalty" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="maxPenalty" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="commitment" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="acceptation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="noHandset" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="startDate" type="{http://playmobile.pl/pc/types}Date" />
 *       &lt;attribute name="endDate" type="{http://playmobile.pl/pc/types}Date" />
 *       &lt;attribute name="productPriceListId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="serviceType" type="{http://playmobile.pl/pc/types}ServiceType" />
 *       &lt;attribute name="offerCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="brand" type="{http://playmobile.pl/pc/types}BrandType" />
 *       &lt;attribute name="promotionType" use="required" type="{http://playmobile.pl/pc/types}PromotionType" />
 *       &lt;attribute name="groupId" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commitmentInMixOffer" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="contractType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isTemporary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="temporaryOfferId" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="temporaryOfferDuration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="recharge1" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="recharge2" type="{http://playmobile.pl/pc/types}Amount" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferForGetAllOffers", propOrder = {
    "tariff",
    "offerPromotion",
    "businessCondition"
})
@XmlSeeAlso({
    OfferForGetOffers.class,
    Offer.class
})
public class OfferForGetAllOffers {

    @XmlElement(required = true)
    protected Tariff tariff;
    protected OfferPromotion offerPromotion;
    protected List<BusinessCondition> businessCondition;
    @XmlAttribute(name = "firstPeriodFee")
    protected BigDecimal firstPeriodFee;
    @XmlAttribute(name = "offerId", required = true)
    protected long offerId;
    @XmlAttribute(name = "backupOfferId")
    protected String backupOfferId;
    @XmlAttribute(name = "agreementType", required = true)
    protected AgreementType agreementType;
    @XmlAttribute(name = "loyalityPeriod")
    protected String loyalityPeriod;
    @XmlAttribute(name = "offerName", required = true)
    protected String offerName;
    @XmlAttribute(name = "penalty")
    protected BigDecimal penalty;
    @XmlAttribute(name = "maxPenalty")
    protected BigDecimal maxPenalty;
    @XmlAttribute(name = "commitment")
    protected BigDecimal commitment;
    @XmlAttribute(name = "acceptation")
    protected Boolean acceptation;
    @XmlAttribute(name = "noHandset")
    protected Boolean noHandset;
    @XmlAttribute(name = "startDate")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "productPriceListId")
    protected BigInteger productPriceListId;
    @XmlAttribute(name = "serviceType")
    protected ServiceType serviceType;
    @XmlAttribute(name = "offerCategory")
    protected String offerCategory;
    @XmlAttribute(name = "brand")
    protected BrandType brand;
    @XmlAttribute(name = "promotionType", required = true)
    protected PromotionType promotionType;
    @XmlAttribute(name = "groupId")
    protected Long groupId;
    @XmlAttribute(name = "groupName")
    protected String groupName;
    @XmlAttribute(name = "commitmentInMixOffer")
    protected BigDecimal commitmentInMixOffer;
    @XmlAttribute(name = "contractType")
    protected String contractType;
    @XmlAttribute(name = "isTemporary")
    protected Boolean isTemporary;
    @XmlAttribute(name = "temporaryOfferId")
    protected Long temporaryOfferId;
    @XmlAttribute(name = "temporaryOfferDuration")
    protected Long temporaryOfferDuration;
    @XmlAttribute(name = "recharge1")
    protected BigDecimal recharge1;
    @XmlAttribute(name = "recharge2")
    protected BigDecimal recharge2;

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link Tariff }
     *     
     */
    public Tariff getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tariff }
     *     
     */
    public void setTariff(Tariff value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the offerPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPromotion }
     *     
     */
    public OfferPromotion getOfferPromotion() {
        return offerPromotion;
    }

    /**
     * Sets the value of the offerPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPromotion }
     *     
     */
    public void setOfferPromotion(OfferPromotion value) {
        this.offerPromotion = value;
    }

    /**
     * Gets the value of the businessCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessCondition }
     * 
     * 
     */
    public List<BusinessCondition> getBusinessCondition() {
        if (businessCondition == null) {
            businessCondition = new ArrayList<BusinessCondition>();
        }
        return this.businessCondition;
    }

    /**
     * Gets the value of the firstPeriodFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPeriodFee() {
        return firstPeriodFee;
    }

    /**
     * Sets the value of the firstPeriodFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPeriodFee(BigDecimal value) {
        this.firstPeriodFee = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     */
    public long getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     */
    public void setOfferId(long value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the backupOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupOfferId() {
        return backupOfferId;
    }

    /**
     * Sets the value of the backupOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupOfferId(String value) {
        this.backupOfferId = value;
    }

    /**
     * Gets the value of the agreementType property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementType }
     *     
     */
    public AgreementType getAgreementType() {
        return agreementType;
    }

    /**
     * Sets the value of the agreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType }
     *     
     */
    public void setAgreementType(AgreementType value) {
        this.agreementType = value;
    }

    /**
     * Gets the value of the loyalityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyalityPeriod() {
        return loyalityPeriod;
    }

    /**
     * Sets the value of the loyalityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyalityPeriod(String value) {
        this.loyalityPeriod = value;
    }

    /**
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the maxPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPenalty() {
        return maxPenalty;
    }

    /**
     * Sets the value of the maxPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPenalty(BigDecimal value) {
        this.maxPenalty = value;
    }

    /**
     * Gets the value of the commitment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommitment() {
        return commitment;
    }

    /**
     * Sets the value of the commitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommitment(BigDecimal value) {
        this.commitment = value;
    }

    /**
     * Gets the value of the acceptation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptation() {
        return acceptation;
    }

    /**
     * Sets the value of the acceptation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptation(Boolean value) {
        this.acceptation = value;
    }

    /**
     * Gets the value of the noHandset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoHandset() {
        return noHandset;
    }

    /**
     * Sets the value of the noHandset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoHandset(Boolean value) {
        this.noHandset = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the productPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductPriceListId() {
        return productPriceListId;
    }

    /**
     * Sets the value of the productPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductPriceListId(BigInteger value) {
        this.productPriceListId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the offerCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCategory() {
        return offerCategory;
    }

    /**
     * Sets the value of the offerCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCategory(String value) {
        this.offerCategory = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link BrandType }
     *     
     */
    public BrandType getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandType }
     *     
     */
    public void setBrand(BrandType value) {
        this.brand = value;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotionType(PromotionType value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the commitmentInMixOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommitmentInMixOffer() {
        return commitmentInMixOffer;
    }

    /**
     * Sets the value of the commitmentInMixOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommitmentInMixOffer(BigDecimal value) {
        this.commitmentInMixOffer = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the isTemporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemporary() {
        return isTemporary;
    }

    /**
     * Sets the value of the isTemporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemporary(Boolean value) {
        this.isTemporary = value;
    }

    /**
     * Gets the value of the temporaryOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemporaryOfferId() {
        return temporaryOfferId;
    }

    /**
     * Sets the value of the temporaryOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemporaryOfferId(Long value) {
        this.temporaryOfferId = value;
    }

    /**
     * Gets the value of the temporaryOfferDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemporaryOfferDuration() {
        return temporaryOfferDuration;
    }

    /**
     * Sets the value of the temporaryOfferDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemporaryOfferDuration(Long value) {
        this.temporaryOfferDuration = value;
    }

    /**
     * Gets the value of the recharge1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecharge1() {
        return recharge1;
    }

    /**
     * Sets the value of the recharge1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecharge1(BigDecimal value) {
        this.recharge1 = value;
    }

    /**
     * Gets the value of the recharge2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecharge2() {
        return recharge2;
    }

    /**
     * Sets the value of the recharge2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecharge2(BigDecimal value) {
        this.recharge2 = value;
    }

}