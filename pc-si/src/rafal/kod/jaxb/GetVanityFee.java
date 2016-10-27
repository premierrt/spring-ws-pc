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
 * typ komunikatu s�u��cy do pobrania op�aty aktywacyjnych lub komponentu dla wyr�nionych
 *                 numer�w
 *             
 * 
 * <p>Java class for GetVanityFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVanityFee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}BaseRequestWithOptionalRoles">
 *       &lt;attribute name="tariffId" type="{http://playmobile.pl/pc/types}TariffId" />
 *       &lt;attribute name="ccbsPackageId" type="{http://playmobile.pl/pc/types}CCBSPackageId" />
 *       &lt;attribute name="processType" type="{http://playmobile.pl/pc/types}ProcessType" />
 *       &lt;attribute name="vanityName" use="required" type="{http://playmobile.pl/pc/types}VanityName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVanityFee")
public class GetVanityFee
    extends BaseRequestWithOptionalRoles
{

    @XmlAttribute(name = "tariffId")
    protected String tariffId;
    @XmlAttribute(name = "ccbsPackageId")
    protected String ccbsPackageId;
    @XmlAttribute(name = "processType")
    protected ProcessType processType;
    @XmlAttribute(name = "vanityName", required = true)
    protected VanityName vanityName;

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
     * Gets the value of the vanityName property.
     * 
     * @return
     *     possible object is
     *     {@link VanityName }
     *     
     */
    public VanityName getVanityName() {
        return vanityName;
    }

    /**
     * Sets the value of the vanityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VanityName }
     *     
     */
    public void setVanityName(VanityName value) {
        this.vanityName = value;
    }

}