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
 * Identyfikacja RFS za pomoc� componentId i packageId
 * 
 * <p>Java class for RfsId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RfsId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ccbsComponentId" use="required" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="ccbsPackageId" use="required" type="{http://playmobile.pl/pc/types}IdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfsId")
public class RfsId {

    @XmlAttribute(name = "ccbsComponentId", required = true)
    protected long ccbsComponentId;
    @XmlAttribute(name = "ccbsPackageId", required = true)
    protected long ccbsPackageId;

    /**
     * Gets the value of the ccbsComponentId property.
     * 
     */
    public long getCcbsComponentId() {
        return ccbsComponentId;
    }

    /**
     * Sets the value of the ccbsComponentId property.
     * 
     */
    public void setCcbsComponentId(long value) {
        this.ccbsComponentId = value;
    }

    /**
     * Gets the value of the ccbsPackageId property.
     * 
     */
    public long getCcbsPackageId() {
        return ccbsPackageId;
    }

    /**
     * Sets the value of the ccbsPackageId property.
     * 
     */
    public void setCcbsPackageId(long value) {
        this.ccbsPackageId = value;
    }

}