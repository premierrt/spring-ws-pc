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
import javax.xml.bind.annotation.XmlType;


/**
 * Typ komunikatu s�u��cy do pobrania telefon�w.
 * 
 * <p>Java class for GetPhoneInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPhoneInfos">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}BaseRequestWithRoles">
 *       &lt;attribute name="grossPriceMin" use="required" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="grossPriceMax" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="phoneId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="isPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="feature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tac" type="{http://playmobile.pl/pc/types}Tac" />
 *       &lt;attribute name="materialSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processType" type="{http://playmobile.pl/pc/types}ProcessType" />
 *       &lt;attribute name="brand" type="{http://playmobile.pl/pc/types}BrandType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPhoneInfos")
public class GetPhoneInfos
    extends BaseRequestWithRoles
{

    @XmlAttribute(name = "grossPriceMin", required = true)
    protected BigDecimal grossPriceMin;
    @XmlAttribute(name = "grossPriceMax")
    protected BigDecimal grossPriceMax;
    @XmlAttribute(name = "phoneId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long phoneId;
    @XmlAttribute(name = "isPhone")
    protected Boolean isPhone;
    @XmlAttribute(name = "feature")
    protected String feature;
    @XmlAttribute(name = "tac")
    protected String tac;
    @XmlAttribute(name = "materialSymbol")
    protected String materialSymbol;
    @XmlAttribute(name = "processType")
    protected ProcessType processType;
    @XmlAttribute(name = "brand")
    protected BrandType brand;

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
     * Gets the value of the isPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPhone() {
        return isPhone;
    }

    /**
     * Sets the value of the isPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPhone(Boolean value) {
        this.isPhone = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTac(String value) {
        this.tac = value;
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

}