//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * typ komunikatu s�u��cy do zwracania cfs�w dla operacji getCfsInTariffs
 * 
 * <p>Java class for GetCfsInTariffs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCfsInTariffs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}SimpleBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ccbsPackageAndComponents" type="{http://playmobile.pl/pc/types}CcbsPackageAndComponents" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="onlyTimeUndefinedComponents" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCfsInTariffs", propOrder = {
    "ccbsPackageAndComponents"
})
public class GetCfsInTariffs
    extends SimpleBaseRequest
{

    @XmlElement(required = true)
    protected List<CcbsPackageAndComponents> ccbsPackageAndComponents;
    @XmlAttribute(name = "onlyTimeUndefinedComponents", required = true)
    protected boolean onlyTimeUndefinedComponents;

    /**
     * Gets the value of the ccbsPackageAndComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccbsPackageAndComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcbsPackageAndComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcbsPackageAndComponents }
     * 
     * 
     */
    public List<CcbsPackageAndComponents> getCcbsPackageAndComponents() {
        if (ccbsPackageAndComponents == null) {
            ccbsPackageAndComponents = new ArrayList<CcbsPackageAndComponents>();
        }
        return this.ccbsPackageAndComponents;
    }

    /**
     * Gets the value of the onlyTimeUndefinedComponents property.
     * 
     */
    public boolean isOnlyTimeUndefinedComponents() {
        return onlyTimeUndefinedComponents;
    }

    /**
     * Sets the value of the onlyTimeUndefinedComponents property.
     * 
     */
    public void setOnlyTimeUndefinedComponents(boolean value) {
        this.onlyTimeUndefinedComponents = value;
    }

}
