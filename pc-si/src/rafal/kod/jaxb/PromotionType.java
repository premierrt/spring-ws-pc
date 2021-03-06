//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="INSTALLMENT"/>
 *     &lt;enumeration value="INSTALLMENT_NOSERVICE"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="PRICE_LIST_ONLY"/>
 *     &lt;enumeration value="PARTICULAR_ANNEX_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionType")
@XmlEnum
public enum PromotionType {


    /**
     * zwyczajna promocja
     * 
     */
    REGULAR,

    /**
     * promocja z systemem ratalnym
     * 
     */
    INSTALLMENT,

    /**
     * promocje ratalne bez serwisu
     * 
     */
    INSTALLMENT_NOSERVICE,

    /**
     * biznes grupa
     * 
     */
    BG,

    /**
     * promocja tylko do cennik�w
     * 
     */
    PRICE_LIST_ONLY,

    /**
     * promocja ze specyficznymi typami aneks�w
     * 
     */
    PARTICULAR_ANNEX_ONLY;

    public String value() {
        return name();
    }

    public static PromotionType fromValue(String v) {
        return valueOf(v);
    }

}
