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


/**
 * typ komunikatu s�u��cy do pobrania us�ug podpi�tych do taryfy
 * 
 * <p>Java class for GetTariffServices2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTariffServices2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}BaseRequestWithOptionalRoles">
 *       &lt;attribute name="tariffId" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="ccbsTariffId" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="feature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTariffServices2")
public class GetTariffServices2
    extends BaseRequestWithOptionalRoles
{

    @XmlAttribute(name = "tariffId")
    protected String tariffId;
    @XmlAttribute(name = "ccbsTariffId")
    protected String ccbsTariffId;
    @XmlAttribute(name = "feature")
    protected String feature;

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

}
