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
 * <p>Java class for RFSPIGAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFSPIGAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="poolId" type="{http://playmobile.pl/pc/types}IdType" />
 *       &lt;attribute name="pigType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="moneyValue" type="{http://playmobile.pl/pc/types}Amount" />
 *       &lt;attribute name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFSPIGAttributes")
public class RFSPIGAttributes {

    @XmlAttribute(name = "poolId")
    protected Long poolId;
    @XmlAttribute(name = "pigType")
    protected String pigType;
    @XmlAttribute(name = "moneyValue")
    protected BigDecimal moneyValue;
    @XmlAttribute(name = "cardNo")
    protected String cardNo;

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoolId(Long value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the pigType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPigType() {
        return pigType;
    }

    /**
     * Sets the value of the pigType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPigType(String value) {
        this.pigType = value;
    }

    /**
     * Gets the value of the moneyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoneyValue() {
        return moneyValue;
    }

    /**
     * Sets the value of the moneyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoneyValue(BigDecimal value) {
        this.moneyValue = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

}