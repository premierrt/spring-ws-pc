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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetOfferProductOrAllPhones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOfferProductOrAllPhones">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}BaseRequestWithOptionalRoles">
 *       &lt;attribute name="offerId" type="{http://playmobile.pl/pc/types}OfferId" />
 *       &lt;attribute name="processType" type="{http://playmobile.pl/pc/types}ProcessType" />
 *       &lt;attribute name="offerDate" type="{http://playmobile.pl/pc/types}Date" />
 *       &lt;attribute name="tariffId" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="ccbsTariffId" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="ccbsPromotionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="grossPriceMin" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="grossPriceMax" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="phoneId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="materialSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priceListId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOfferProductOrAllPhones")
@XmlSeeAlso({
    GetOfferProduct.class,
    GetAllPhones.class
})
public class GetOfferProductOrAllPhones
    extends BaseRequestWithOptionalRoles
{

    @XmlAttribute(name = "offerId")
    protected Long offerId;
    @XmlAttribute(name = "processType")
    protected ProcessType processType;
    @XmlAttribute(name = "offerDate")
    protected XMLGregorianCalendar offerDate;
    @XmlAttribute(name = "tariffId")
    protected String tariffId;
    @XmlAttribute(name = "ccbsTariffId")
    protected String ccbsTariffId;
    @XmlAttribute(name = "ccbsPromotionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ccbsPromotionId;
    @XmlAttribute(name = "grossPriceMin")
    protected BigDecimal grossPriceMin;
    @XmlAttribute(name = "grossPriceMax")
    protected BigDecimal grossPriceMax;
    @XmlAttribute(name = "phoneId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long phoneId;
    @XmlAttribute(name = "materialSymbol")
    protected String materialSymbol;
    @XmlAttribute(name = "priceListId")
    protected Long priceListId;

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferId(Long value) {
        this.offerId = value;
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
     * Gets the value of the offerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferDate() {
        return offerDate;
    }

    /**
     * Sets the value of the offerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferDate(XMLGregorianCalendar value) {
        this.offerDate = value;
    }

    /**
     * Gets the value of the tariffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffId() {
        return tariffId;
    }

    /**
     * Sets the value of the tariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffId(String value) {
        this.tariffId = value;
    }

    /**
     * Gets the value of the ccbsTariffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcbsTariffId() {
        return ccbsTariffId;
    }

    /**
     * Sets the value of the ccbsTariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcbsTariffId(String value) {
        this.ccbsTariffId = value;
    }

    /**
     * Gets the value of the ccbsPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcbsPromotionId() {
        return ccbsPromotionId;
    }

    /**
     * Sets the value of the ccbsPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcbsPromotionId(Long value) {
        this.ccbsPromotionId = value;
    }

    /**
     * Gets the value of the grossPriceMin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossPriceMin() {
        return grossPriceMin;
    }

    /**
     * Sets the value of the grossPriceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossPriceMin(BigDecimal value) {
        this.grossPriceMin = value;
    }

    /**
     * Gets the value of the grossPriceMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossPriceMax() {
        return grossPriceMax;
    }

    /**
     * Sets the value of the grossPriceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossPriceMax(BigDecimal value) {
        this.grossPriceMax = value;
    }

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhoneId(Long value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the materialSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialSymbol() {
        return materialSymbol;
    }

    /**
     * Sets the value of the materialSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialSymbol(String value) {
        this.materialSymbol = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceListId(Long value) {
        this.priceListId = value;
    }

}
