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
import javax.xml.bind.annotation.XmlType;


/**
 * typ komunikatu do informowania o wymaganych komponentach
 * 
 * <p>Java class for FaultInfoWithRequiredCfs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultInfoWithRequiredCfs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}FaultInfo">
 *       &lt;sequence>
 *         &lt;element name="requiredCfs" type="{http://playmobile.pl/pc/types}RequiredCfs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultInfoWithRequiredCfs", propOrder = {
    "requiredCfs"
})
public class FaultInfoWithRequiredCfs
    extends FaultInfo
{

    protected List<RequiredCfs> requiredCfs;

    /**
     * Gets the value of the requiredCfs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredCfs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredCfs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredCfs }
     * 
     * 
     */
    public List<RequiredCfs> getRequiredCfs() {
        if (requiredCfs == null) {
            requiredCfs = new ArrayList<RequiredCfs>();
        }
        return this.requiredCfs;
    }

}