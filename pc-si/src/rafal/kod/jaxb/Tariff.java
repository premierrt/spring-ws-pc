//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * typ taryfy
 * 
 * <p>Java class for Tariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tariff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://playmobile.pl/pc/types}finalPeriodFees" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ccbsPackageId" type="{http://playmobile.pl/pc/types}CCBSPackageId" />
 *       &lt;attribute name="ccbsComponentId" type="{http://playmobile.pl/pc/types}CCBSComponentId" />
 *       &lt;attribute name="periodFee" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="activationFee" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="voiceData" use="required" type="{http://playmobile.pl/pc/types}VoiceData" />
 *       &lt;attribute name="setActivationFee" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agreementType" type="{http://playmobile.pl/pc/types}AgreementType" />
 *       &lt;attribute name="serviceType" type="{http://playmobile.pl/pc/types}ServiceType" />
 *       &lt;attribute name="dedicatedTo" type="{http://playmobile.pl/pc/types}DedicatedTo" />
 *       &lt;attribute name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="migrationPosition" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="einvoiceDiscountGross" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="einvoiceDiscountNet" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="agreementDiscountGross" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="agreementDiscountNet" type="{http://playmobile.pl/pc/types}Amount" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tariff", propOrder = {
    "finalPeriodFees"
})
@XmlSeeAlso({
    MigrationTariff.class
})
public class Tariff {

    protected FinalPeriodFees finalPeriodFees;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "ccbsPackageId")
    protected String ccbsPackageId;
    @XmlAttribute(name = "ccbsComponentId")
    protected String ccbsComponentId;
    @XmlAttribute(name = "periodFee")
    protected BigDecimal periodFee;
    @XmlAttribute(name = "activationFee")
    protected BigDecimal activationFee;
    @XmlAttribute(name = "voiceData", required = true)
    protected VoiceData voiceData;
    @XmlAttribute(name = "setActivationFee")
    protected Boolean setActivationFee;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "codeName")
    protected String codeName;
    @XmlAttribute(name = "agreementType")
    protected AgreementType agreementType;
    @XmlAttribute(name = "serviceType")
    protected ServiceType serviceType;
    @XmlAttribute(name = "dedicatedTo")
    protected String dedicatedTo;
    @XmlAttribute(name = "shortDescription")
    protected String shortDescription;
    @XmlAttribute(name = "longDescription")
    protected String longDescription;
    @XmlAttribute(name = "migrationPosition")
    protected BigDecimal migrationPosition;
    @XmlAttribute(name = "einvoiceDiscountGross")
    protected BigDecimal einvoiceDiscountGross;
    @XmlAttribute(name = "einvoiceDiscountNet")
    protected BigDecimal einvoiceDiscountNet;
    @XmlAttribute(name = "agreementDiscountGross")
    protected BigDecimal agreementDiscountGross;
    @XmlAttribute(name = "agreementDiscountNet")
    protected BigDecimal agreementDiscountNet;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ccbsPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcbsPackageId() {
        return ccbsPackageId;
    }

    /**
     * Sets the value of the ccbsPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcbsPackageId(String value) {
        this.ccbsPackageId = value;
    }

    /**
     * Gets the value of the ccbsComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcbsComponentId() {
        return ccbsComponentId;
    }

    /**
     * Sets the value of the ccbsComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcbsComponentId(String value) {
        this.ccbsComponentId = value;
    }

    /**
     * Gets the value of the periodFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodFee() {
        return periodFee;
    }

    /**
     * Sets the value of the periodFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodFee(BigDecimal value) {
        this.periodFee = value;
    }

    /**
     * Gets the value of the activationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivationFee() {
        return activationFee;
    }

    /**
     * Sets the value of the activationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivationFee(BigDecimal value) {
        this.activationFee = value;
    }

    /**
     * Gets the value of the voiceData property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceData }
     *     
     */
    public VoiceData getVoiceData() {
        return voiceData;
    }

    /**
     * Sets the value of the voiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceData }
     *     
     */
    public void setVoiceData(VoiceData value) {
        this.voiceData = value;
    }

    /**
     * Gets the value of the setActivationFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetActivationFee() {
        return setActivationFee;
    }

    /**
     * Sets the value of the setActivationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetActivationFee(Boolean value) {
        this.setActivationFee = value;
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
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
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
     * Gets the value of the dedicatedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicatedTo() {
        return dedicatedTo;
    }

    /**
     * Sets the value of the dedicatedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicatedTo(String value) {
        this.dedicatedTo = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the migrationPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMigrationPosition() {
        return migrationPosition;
    }

    /**
     * Sets the value of the migrationPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMigrationPosition(BigDecimal value) {
        this.migrationPosition = value;
    }

    /**
     * Gets the value of the einvoiceDiscountGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEinvoiceDiscountGross() {
        return einvoiceDiscountGross;
    }

    /**
     * Sets the value of the einvoiceDiscountGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEinvoiceDiscountGross(BigDecimal value) {
        this.einvoiceDiscountGross = value;
    }

    /**
     * Gets the value of the einvoiceDiscountNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEinvoiceDiscountNet() {
        return einvoiceDiscountNet;
    }

    /**
     * Sets the value of the einvoiceDiscountNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEinvoiceDiscountNet(BigDecimal value) {
        this.einvoiceDiscountNet = value;
    }

    /**
     * Gets the value of the agreementDiscountGross property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgreementDiscountGross() {
        return agreementDiscountGross;
    }

    /**
     * Sets the value of the agreementDiscountGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgreementDiscountGross(BigDecimal value) {
        this.agreementDiscountGross = value;
    }

    /**
     * Gets the value of the agreementDiscountNet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgreementDiscountNet() {
        return agreementDiscountNet;
    }

    /**
     * Sets the value of the agreementDiscountNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgreementDiscountNet(BigDecimal value) {
        this.agreementDiscountNet = value;
    }

}
