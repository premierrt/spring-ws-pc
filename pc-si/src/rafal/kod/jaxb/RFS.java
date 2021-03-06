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
 * typ us�ugi RFS komponent
 * 
 * <p>Java class for RFS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountAttributes" type="{http://playmobile.pl/pc/types}RFSDiscountAttributes" minOccurs="0"/>
 *         &lt;element name="componentAttributes" type="{http://playmobile.pl/pc/types}RFSComponentAttributes" minOccurs="0"/>
 *         &lt;element name="virtualAttributes" type="{http://playmobile.pl/pc/types}RFSVirtualAttributes" minOccurs="0"/>
 *         &lt;element name="pigAttributes" type="{http://playmobile.pl/pc/types}RFSPIGAttributes" minOccurs="0"/>
 *         &lt;element name="otherAttributes" type="{http://playmobile.pl/pc/types}RFSOtherAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ccbsComponentId" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rfsId" use="required" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="ccbsPackageId" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="shortDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rfsTypeName" use="required" type="{http://playmobile.pl/pc/types}RFSType" />
 *       &lt;attribute name="isAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFS", propOrder = {
    "discountAttributes",
    "componentAttributes",
    "virtualAttributes",
    "pigAttributes",
    "otherAttributes"
})
public class RFS {

    protected RFSDiscountAttributes discountAttributes;
    protected RFSComponentAttributes componentAttributes;
    protected RFSVirtualAttributes virtualAttributes;
    protected RFSPIGAttributes pigAttributes;
    protected RFSOtherAttributes otherAttributes;
    @XmlAttribute(name = "ccbsComponentId")
    protected Long ccbsComponentId;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "rfsId", required = true)
    protected long rfsId;
    @XmlAttribute(name = "ccbsPackageId")
    protected Long ccbsPackageId;
    @XmlAttribute(name = "shortDisplay")
    protected String shortDisplay;
    @XmlAttribute(name = "rfsTypeName", required = true)
    protected RFSType rfsTypeName;
    @XmlAttribute(name = "isAccount")
    protected Boolean isAccount;

    /**
     * Gets the value of the discountAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RFSDiscountAttributes }
     *     
     */
    public RFSDiscountAttributes getDiscountAttributes() {
        return discountAttributes;
    }

    /**
     * Sets the value of the discountAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSDiscountAttributes }
     *     
     */
    public void setDiscountAttributes(RFSDiscountAttributes value) {
        this.discountAttributes = value;
    }

    /**
     * Gets the value of the componentAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RFSComponentAttributes }
     *     
     */
    public RFSComponentAttributes getComponentAttributes() {
        return componentAttributes;
    }

    /**
     * Sets the value of the componentAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSComponentAttributes }
     *     
     */
    public void setComponentAttributes(RFSComponentAttributes value) {
        this.componentAttributes = value;
    }

    /**
     * Gets the value of the virtualAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RFSVirtualAttributes }
     *     
     */
    public RFSVirtualAttributes getVirtualAttributes() {
        return virtualAttributes;
    }

    /**
     * Sets the value of the virtualAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSVirtualAttributes }
     *     
     */
    public void setVirtualAttributes(RFSVirtualAttributes value) {
        this.virtualAttributes = value;
    }

    /**
     * Gets the value of the pigAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RFSPIGAttributes }
     *     
     */
    public RFSPIGAttributes getPigAttributes() {
        return pigAttributes;
    }

    /**
     * Sets the value of the pigAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSPIGAttributes }
     *     
     */
    public void setPigAttributes(RFSPIGAttributes value) {
        this.pigAttributes = value;
    }

    /**
     * Gets the value of the otherAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link RFSOtherAttributes }
     *     
     */
    public RFSOtherAttributes getOtherAttributes() {
        return otherAttributes;
    }

    /**
     * Sets the value of the otherAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSOtherAttributes }
     *     
     */
    public void setOtherAttributes(RFSOtherAttributes value) {
        this.otherAttributes = value;
    }

    /**
     * Gets the value of the ccbsComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcbsComponentId() {
        return ccbsComponentId;
    }

    /**
     * Sets the value of the ccbsComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcbsComponentId(Long value) {
        this.ccbsComponentId = value;
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
     * Gets the value of the rfsId property.
     * 
     */
    public long getRfsId() {
        return rfsId;
    }

    /**
     * Sets the value of the rfsId property.
     * 
     */
    public void setRfsId(long value) {
        this.rfsId = value;
    }

    /**
     * Gets the value of the ccbsPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCcbsPackageId() {
        return ccbsPackageId;
    }

    /**
     * Sets the value of the ccbsPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCcbsPackageId(Long value) {
        this.ccbsPackageId = value;
    }

    /**
     * Gets the value of the shortDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDisplay() {
        return shortDisplay;
    }

    /**
     * Sets the value of the shortDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDisplay(String value) {
        this.shortDisplay = value;
    }

    /**
     * Gets the value of the rfsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link RFSType }
     *     
     */
    public RFSType getRfsTypeName() {
        return rfsTypeName;
    }

    /**
     * Sets the value of the rfsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFSType }
     *     
     */
    public void setRfsTypeName(RFSType value) {
        this.rfsTypeName = value;
    }

    /**
     * Gets the value of the isAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccount() {
        return isAccount;
    }

    /**
     * Sets the value of the isAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccount(Boolean value) {
        this.isAccount = value;
    }

}
