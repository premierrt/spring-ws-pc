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
 * request dla taryf migracyjnych
 * 
 * <p>Java class for GetMigrationTariffs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMigrationTariffs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://playmobile.pl/pc/types}GetTariffs">
 *       &lt;attribute name="migrationPosition" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMigrationTariffs")
public class GetMigrationTariffs
    extends GetTariffs
{

    @XmlAttribute(name = "migrationPosition")
    protected BigDecimal migrationPosition;

    /**
     * Gets the value of the migrationPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMigrationPosition() {
        return migrationPosition;
    }

    /**
     * Sets the value of the migrationPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMigrationPosition(BigDecimal value) {
        this.migrationPosition = value;
    }

}