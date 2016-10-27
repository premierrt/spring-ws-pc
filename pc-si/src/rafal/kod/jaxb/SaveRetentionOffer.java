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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * typ komunikatu s�u��cy do zapisu oferty retencji
 * 
 * <p>Java class for SaveRetentionOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveRetentionOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}BaseRequestWithOptionalRoles">
 *       &lt;sequence>
 *         &lt;element name="cfsIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cfsId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rfsParameterValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rfsParameterValue" type="{http://playmobile.pl/pc/types}RfsParameterValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" use="required" type="{http://playmobile.pl/pc/types}UserId" />
 *       &lt;attribute name="msisdn" use="required" type="{http://playmobile.pl/pc/types}MSISDN" />
 *       &lt;attribute name="offerId" use="required" type="{http://playmobile.pl/pc/types}OfferId" />
 *       &lt;attribute name="isDelayedAnnex" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="annexActivationFee" type="{http://playmobile.pl/pc/types}Amount" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveRetentionOffer", propOrder = {
    "cfsIds",
    "rfsParameterValues"
})
public class SaveRetentionOffer
    extends BaseRequestWithOptionalRoles
{

    protected SaveRetentionOffer.CfsIds cfsIds;
    protected SaveRetentionOffer.RfsParameterValues rfsParameterValues;
    @XmlAttribute(name = "userId", required = true)
    protected String userId;
    @XmlAttribute(name = "msisdn", required = true)
    protected String msisdn;
    @XmlAttribute(name = "offerId", required = true)
    protected long offerId;
    @XmlAttribute(name = "isDelayedAnnex")
    protected Boolean isDelayedAnnex;
    @XmlAttribute(name = "annexActivationFee")
    protected BigDecimal annexActivationFee;

    /**
     * Gets the value of the cfsIds property.
     * 
     * @return
     *     possible object is
     *     {@link SaveRetentionOffer.CfsIds }
     *     
     */
    public SaveRetentionOffer.CfsIds getCfsIds() {
        return cfsIds;
    }

    /**
     * Sets the value of the cfsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveRetentionOffer.CfsIds }
     *     
     */
    public void setCfsIds(SaveRetentionOffer.CfsIds value) {
        this.cfsIds = value;
    }

    /**
     * Gets the value of the rfsParameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link SaveRetentionOffer.RfsParameterValues }
     *     
     */
    public SaveRetentionOffer.RfsParameterValues getRfsParameterValues() {
        return rfsParameterValues;
    }

    /**
     * Sets the value of the rfsParameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveRetentionOffer.RfsParameterValues }
     *     
     */
    public void setRfsParameterValues(SaveRetentionOffer.RfsParameterValues value) {
        this.rfsParameterValues = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
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
     * Gets the value of the isDelayedAnnex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelayedAnnex() {
        return isDelayedAnnex;
    }

    /**
     * Sets the value of the isDelayedAnnex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelayedAnnex(Boolean value) {
        this.isDelayedAnnex = value;
    }

    /**
     * Gets the value of the annexActivationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnexActivationFee() {
        return annexActivationFee;
    }

    /**
     * Sets the value of the annexActivationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnexActivationFee(BigDecimal value) {
        this.annexActivationFee = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfsId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfsId"
    })
    public static class CfsIds {

        @XmlElement(type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> cfsId;

        /**
         * Gets the value of the cfsId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cfsId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCfsId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCfsId() {
            if (cfsId == null) {
                cfsId = new ArrayList<Long>();
            }
            return this.cfsId;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rfsParameterValue" type="{http://playmobile.pl/pc/types}RfsParameterValue" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rfsParameterValue"
    })
    public static class RfsParameterValues {

        protected List<RfsParameterValue> rfsParameterValue;

        /**
         * Gets the value of the rfsParameterValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rfsParameterValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRfsParameterValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RfsParameterValue }
         * 
         * 
         */
        public List<RfsParameterValue> getRfsParameterValue() {
            if (rfsParameterValue == null) {
                rfsParameterValue = new ArrayList<RfsParameterValue>();
            }
            return this.rfsParameterValue;
        }

    }

}