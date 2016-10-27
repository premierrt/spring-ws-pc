//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dane oferty rozszerzone o raty, pr�no�ci, brendy oraz zobowi�zania roz�o�on� w czasie
 *             
 * 
 * <p>Java class for DetailedOffer2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedOffer2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}Offer">
 *       &lt;sequence>
 *         &lt;element ref="{http://playmobile.pl/pc/types}finalPeriodFees" minOccurs="0"/>
 *         &lt;element name="vanity" type="{http://playmobile.pl/pc/types}VanityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://playmobile.pl/pc/types}cfsServices2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedOfferIds" type="{http://playmobile.pl/pc/types}RelatedOfferIdsType" minOccurs="0"/>
 *         &lt;element name="documentLocations" type="{http://playmobile.pl/pc/types}DocumentLocations" minOccurs="0"/>
 *         &lt;element name="displayParam" type="{http://playmobile.pl/pc/types}DisplayParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="leafletPrice" type="{http://playmobile.pl/pc/types}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="processType" type="{http://playmobile.pl/pc/types}ProcessType" />
 *       &lt;attribute name="salesChannel" type="{http://playmobile.pl/pc/types}SalesChannel" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="returnPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="partialPaymentQuantity" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="partialPaymentFee" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="documentSegment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedOffer2", propOrder = {
    "finalPeriodFees",
    "vanity",
    "cfsServices2",
    "relatedOfferIds",
    "documentLocations",
    "displayParam",
    "leafletPrice"
})
public class DetailedOffer2
    extends Offer
{

    protected FinalPeriodFees finalPeriodFees;
    protected List<VanityType> vanity;
    protected List<CFSServices2> cfsServices2;
    protected RelatedOfferIdsType relatedOfferIds;
    protected DocumentLocations documentLocations;
    protected List<DisplayParam> displayParam;
    protected Price leafletPrice;
    @XmlAttribute(name = "processType")
    protected ProcessType processType;
    @XmlAttribute(name = "salesChannel")
    protected SalesChannel salesChannel;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "returnPeriod")
    protected Integer returnPeriod;
    @XmlAttribute(name = "partialPaymentQuantity")
    @XmlSchemaType(name = "unsignedInt")
    protected Long partialPaymentQuantity;
    @XmlAttribute(name = "partialPaymentFee")
    protected BigDecimal partialPaymentFee;
    @XmlAttribute(name = "documentSegment", required = true)
    protected String documentSegment;

    /**
     * Gets the value of the finalPeriodFees property.
     * 
     * @return
     *     possible object is
     *     {@link FinalPeriodFees }
     *     
     */
    public FinalPeriodFees getFinalPeriodFees() {
        return finalPeriodFees;
    }

    /**
     * Sets the value of the finalPeriodFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalPeriodFees }
     *     
     */
    public void setFinalPeriodFees(FinalPeriodFees value) {
        this.finalPeriodFees = value;
    }

    /**
     * Gets the value of the vanity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vanity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVanity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VanityType }
     * 
     * 
     */
    public List<VanityType> getVanity() {
        if (vanity == null) {
            vanity = new ArrayList<VanityType>();
        }
        return this.vanity;
    }

    /**
     * Gets the value of the cfsServices2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfsServices2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfsServices2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFSServices2 }
     * 
     * 
     */
    public List<CFSServices2> getCfsServices2() {
        if (cfsServices2 == null) {
            cfsServices2 = new ArrayList<CFSServices2>();
        }
        return this.cfsServices2;
    }

    /**
     * Gets the value of the relatedOfferIds property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedOfferIdsType }
     *     
     */
    public RelatedOfferIdsType getRelatedOfferIds() {
        return relatedOfferIds;
    }

    /**
     * Sets the value of the relatedOfferIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedOfferIdsType }
     *     
     */
    public void setRelatedOfferIds(RelatedOfferIdsType value) {
        this.relatedOfferIds = value;
    }

    /**
     * Gets the value of the documentLocations property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLocations }
     *     
     */
    public DocumentLocations getDocumentLocations() {
        return documentLocations;
    }

    /**
     * Sets the value of the documentLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLocations }
     *     
     */
    public void setDocumentLocations(DocumentLocations value) {
        this.documentLocations = value;
    }

    /**
     * Gets the value of the displayParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayParam }
     * 
     * 
     */
    public List<DisplayParam> getDisplayParam() {
        if (displayParam == null) {
            displayParam = new ArrayList<DisplayParam>();
        }
        return this.displayParam;
    }

    /**
     * Gets the value of the leafletPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLeafletPrice() {
        return leafletPrice;
    }

    /**
     * Sets the value of the leafletPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLeafletPrice(Price value) {
        this.leafletPrice = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setProcessType(ProcessType value) {
        this.processType = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SalesChannel }
     *     
     */
    public SalesChannel getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesChannel }
     *     
     */
    public void setSalesChannel(SalesChannel value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the returnPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnPeriod() {
        return returnPeriod;
    }

    /**
     * Sets the value of the returnPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnPeriod(Integer value) {
        this.returnPeriod = value;
    }

    /**
     * Gets the value of the partialPaymentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartialPaymentQuantity() {
        return partialPaymentQuantity;
    }

    /**
     * Sets the value of the partialPaymentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartialPaymentQuantity(Long value) {
        this.partialPaymentQuantity = value;
    }

    /**
     * Gets the value of the partialPaymentFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartialPaymentFee() {
        return partialPaymentFee;
    }

    /**
     * Sets the value of the partialPaymentFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartialPaymentFee(BigDecimal value) {
        this.partialPaymentFee = value;
    }

    /**
     * Gets the value of the documentSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSegment() {
        return documentSegment;
    }

    /**
     * Sets the value of the documentSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSegment(String value) {
        this.documentSegment = value;
    }

}