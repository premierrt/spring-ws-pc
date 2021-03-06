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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstrakcyjny typ prostego zapytania. Niekt�re zapytania dziedzicz� po nim cechy.
 * 
 * <p>Java class for SimpleBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleBaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="usageMode" type="{http://playmobile.pl/pc/types}UsageMode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleBaseRequest")
@XmlSeeAlso({
    GetServicePoints.class,
    GetProductServicingDetails.class,
    GetMaxGroupMembers.class,
    GetCfsInTariffs.class,
    GetProducts.class,
    GetSavedRetention2 .class,
    GetProductPenalty.class,
    AbstractRequestWithRoles.class,
    AbstractRequestWithOptionalRoles.class
})
public abstract class SimpleBaseRequest {

    @XmlAttribute(name = "usageMode")
    protected UsageMode usageMode;

    /**
     * Gets the value of the usageMode property.
     * 
     * @return
     *     possible object is
     *     {@link UsageMode }
     *     
     */
    public UsageMode getUsageMode() {
        return usageMode;
    }

    /**
     * Sets the value of the usageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageMode }
     *     
     */
    public void setUsageMode(UsageMode value) {
        this.usageMode = value;
    }

}
