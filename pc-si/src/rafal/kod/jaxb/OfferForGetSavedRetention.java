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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferForGetSavedRetention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferForGetSavedRetention">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}Offer">
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
@XmlType(name = "OfferForGetSavedRetention")
public class OfferForGetSavedRetention
    extends Offer
{

    @XmlAttribute(name = "isDelayedAnnex")
    protected Boolean isDelayedAnnex;
    @XmlAttribute(name = "annexActivationFee")
    protected BigDecimal annexActivationFee;

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

}
