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
 * Status segmentu i podsegmentu
 * 
 * <p>Java class for SegmentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="segment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subsegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recommendedTariffId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recommendedPcTariffId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="recommendedTariffName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentStatus")
public class SegmentStatus {

    @XmlAttribute(name = "segment")
    protected String segment;
    @XmlAttribute(name = "subsegment")
    protected String subsegment;
    @XmlAttribute(name = "recommendedTariffId")
    protected String recommendedTariffId;
    @XmlAttribute(name = "recommendedPcTariffId")
    protected Long recommendedPcTariffId;
    @XmlAttribute(name = "recommendedTariffName")
    protected String recommendedTariffName;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the subsegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsegment() {
        return subsegment;
    }

    /**
     * Sets the value of the subsegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsegment(String value) {
        this.subsegment = value;
    }

    /**
     * Gets the value of the recommendedTariffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedTariffId() {
        return recommendedTariffId;
    }

    /**
     * Sets the value of the recommendedTariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedTariffId(String value) {
        this.recommendedTariffId = value;
    }

    /**
     * Gets the value of the recommendedPcTariffId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecommendedPcTariffId() {
        return recommendedPcTariffId;
    }

    /**
     * Sets the value of the recommendedPcTariffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecommendedPcTariffId(Long value) {
        this.recommendedPcTariffId = value;
    }

    /**
     * Gets the value of the recommendedTariffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendedTariffName() {
        return recommendedTariffName;
    }

    /**
     * Sets the value of the recommendedTariffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendedTariffName(String value) {
        this.recommendedTariffName = value;
    }

}
