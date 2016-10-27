//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * typ komunikatu s�u��cy do pobrania kary dla danej oferty
 * 
 * <p>Java class for GetProductPenalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductPenalty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}SimpleBaseRequest">
 *       &lt;attribute name="offerId" use="required" type="{http://playmobile.pl/pc/types}OfferId" />
 *       &lt;attribute name="penaltyDate" type="{http://playmobile.pl/pc/types}Date" />
 *       &lt;attribute name="materialCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductPenalty")
public class GetProductPenalty
    extends SimpleBaseRequest
{

    @XmlAttribute(name = "offerId", required = true)
    protected long offerId;
    @XmlAttribute(name = "penaltyDate")
    protected XMLGregorianCalendar penaltyDate;
    @XmlAttribute(name = "materialCode")
    protected String materialCode;

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
     * Gets the value of the penaltyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenaltyDate() {
        return penaltyDate;
    }

    /**
     * Sets the value of the penaltyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenaltyDate(XMLGregorianCalendar value) {
        this.penaltyDate = value;
    }

    /**
     * Gets the value of the materialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * Sets the value of the materialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialCode(String value) {
        this.materialCode = value;
    }

}
