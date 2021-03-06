//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.28 at 10:33:06 AM CEST 
//


package rafal.kod.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="mnp"/>
 *     &lt;enumeration value="migracja"/>
 *     &lt;enumeration value="retencja"/>
 *     &lt;enumeration value="upsell"/>
 *     &lt;enumeration value="resignation"/>
 *     &lt;enumeration value="product_only"/>
 *     &lt;enumeration value="offer_change"/>
 *     &lt;enumeration value="offer_migration"/>
 *     &lt;enumeration value="msisdn_swap"/>
 *     &lt;enumeration value="tariff_migration"/>
 *     &lt;enumeration value="cession"/>
 *     &lt;enumeration value="sim_card_replacement"/>
 *     &lt;enumeration value="annex_handset_only"/>
 *     &lt;enumeration value="annex_component_only"/>
 *     &lt;enumeration value="special_offer_standard"/>
 *     &lt;enumeration value="special_offer_annex"/>
 *     &lt;enumeration value="other_sales"/>
 *     &lt;enumeration value="network_preferences"/>
 *     &lt;enumeration value="budget"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessType")
@XmlEnum
public enum ProcessType {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("mnp")
    MNP("mnp"),
    @XmlEnumValue("migracja")
    MIGRACJA("migracja"),
    @XmlEnumValue("retencja")
    RETENCJA("retencja"),
    @XmlEnumValue("upsell")
    UPSELL("upsell"),
    @XmlEnumValue("resignation")
    RESIGNATION("resignation"),
    @XmlEnumValue("product_only")
    PRODUCT_ONLY("product_only"),
    @XmlEnumValue("offer_change")
    OFFER_CHANGE("offer_change"),
    @XmlEnumValue("offer_migration")
    OFFER_MIGRATION("offer_migration"),
    @XmlEnumValue("msisdn_swap")
    MSISDN_SWAP("msisdn_swap"),
    @XmlEnumValue("tariff_migration")
    TARIFF_MIGRATION("tariff_migration"),
    @XmlEnumValue("cession")
    CESSION("cession"),
    @XmlEnumValue("sim_card_replacement")
    SIM_CARD_REPLACEMENT("sim_card_replacement"),
    @XmlEnumValue("annex_handset_only")
    ANNEX_HANDSET_ONLY("annex_handset_only"),
    @XmlEnumValue("annex_component_only")
    ANNEX_COMPONENT_ONLY("annex_component_only"),
    @XmlEnumValue("special_offer_standard")
    SPECIAL_OFFER_STANDARD("special_offer_standard"),
    @XmlEnumValue("special_offer_annex")
    SPECIAL_OFFER_ANNEX("special_offer_annex"),
    @XmlEnumValue("other_sales")
    OTHER_SALES("other_sales"),
    @XmlEnumValue("network_preferences")
    NETWORK_PREFERENCES("network_preferences"),
    @XmlEnumValue("budget")
    BUDGET("budget");
    private final String value;

    ProcessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessType fromValue(String v) {
        for (ProcessType c: ProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
