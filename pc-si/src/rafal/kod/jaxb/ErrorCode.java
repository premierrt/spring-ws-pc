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
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN_COMPONENT"/>
 *     &lt;enumeration value="ACCESS_DENIED"/>
 *     &lt;enumeration value="NO_DEDICATED_OFFER_FOUND"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_LOCKED"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_CONSUMED"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_NOT_ACCESSIBLE_YET"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_EXPIRED"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_ALREADY_ADDED"/>
 *     &lt;enumeration value="DEDICATED_OFFER_IS_ALREADY_LOCKED"/>
 *     &lt;enumeration value="DEDICATED_OFFER_GROUP_NOT_FOUND"/>
 *     &lt;enumeration value="NO_VOUCHER_OFFER_FOUND"/>
 *     &lt;enumeration value="VOUCHER_OFFER_IS_LOCKED"/>
 *     &lt;enumeration value="VOUCHER_OFFER_IS_CONSUMED"/>
 *     &lt;enumeration value="VOUCHER_OFFER_IS_NOT_ACCESSIBLE_YET"/>
 *     &lt;enumeration value="VOUCHER_OFFER_IS_EXPIRED"/>
 *     &lt;enumeration value="NO_RETENTION_OFFER_FOUND"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_ALREADY_LOCKED"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_ALREADY_UNLOCKED"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_LOCKED"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_CONSUMED"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_NOT_ACCESSIBLE_YET"/>
 *     &lt;enumeration value="RETENTION_OFFER_IS_EXPIRED"/>
 *     &lt;enumeration value="REQUIRED_CFS"/>
 *     &lt;enumeration value="DEFAULT_RETENTION_OFFER_IS_ALREADY_SAVED"/>
 *     &lt;enumeration value="PARAMETERS_ARE_EMPTY"/>
 *     &lt;enumeration value="PARAMETER_IS_NOT_VALID"/>
 *     &lt;enumeration value="SEGMENT_NOT_ASSIGNED"/>
 *     &lt;enumeration value="CFS_SERVICE_NOT_FOUND"/>
 *     &lt;enumeration value="RFS_PARAMETER_NOT_FOUND"/>
 *     &lt;enumeration value="RFS_PARAMETER"/>
 *     &lt;enumeration value="CHANNEL_NOT_FOUND"/>
 *     &lt;enumeration value="NO_PENALTY_FOUND"/>
 *     &lt;enumeration value="VALIDATION_ERROR"/>
 *     &lt;enumeration value="OFFER_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="ANOTHER_USER_HAS_LOCKED_THIS_OFFER"/>
 *     &lt;enumeration value="P_USER_SID_IS_NULL"/>
 *     &lt;enumeration value="INCOMPLETE_DATA"/>
 *     &lt;enumeration value="ERROR_WHILE_ADDING_CFS_SERVICE"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    UNKNOWN_COMPONENT,
    ACCESS_DENIED,
    NO_DEDICATED_OFFER_FOUND,
    DEDICATED_OFFER_IS_LOCKED,
    DEDICATED_OFFER_IS_CONSUMED,
    DEDICATED_OFFER_IS_NOT_ACCESSIBLE_YET,
    DEDICATED_OFFER_IS_EXPIRED,
    DEDICATED_OFFER_IS_ALREADY_ADDED,
    DEDICATED_OFFER_IS_ALREADY_LOCKED,
    DEDICATED_OFFER_GROUP_NOT_FOUND,
    NO_VOUCHER_OFFER_FOUND,
    VOUCHER_OFFER_IS_LOCKED,
    VOUCHER_OFFER_IS_CONSUMED,
    VOUCHER_OFFER_IS_NOT_ACCESSIBLE_YET,
    VOUCHER_OFFER_IS_EXPIRED,
    NO_RETENTION_OFFER_FOUND,
    RETENTION_OFFER_IS_ALREADY_LOCKED,
    RETENTION_OFFER_IS_ALREADY_UNLOCKED,
    RETENTION_OFFER_IS_LOCKED,
    RETENTION_OFFER_IS_CONSUMED,
    RETENTION_OFFER_IS_NOT_ACCESSIBLE_YET,
    RETENTION_OFFER_IS_EXPIRED,
    REQUIRED_CFS,
    DEFAULT_RETENTION_OFFER_IS_ALREADY_SAVED,
    PARAMETERS_ARE_EMPTY,
    PARAMETER_IS_NOT_VALID,
    SEGMENT_NOT_ASSIGNED,
    CFS_SERVICE_NOT_FOUND,
    RFS_PARAMETER_NOT_FOUND,
    RFS_PARAMETER,
    CHANNEL_NOT_FOUND,
    NO_PENALTY_FOUND,
    VALIDATION_ERROR,
    OFFER_DOES_NOT_EXIST,
    ANOTHER_USER_HAS_LOCKED_THIS_OFFER,
    P_USER_SID_IS_NULL,
    INCOMPLETE_DATA,
    ERROR_WHILE_ADDING_CFS_SERVICE,
    UNKNOWN_ERROR;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
