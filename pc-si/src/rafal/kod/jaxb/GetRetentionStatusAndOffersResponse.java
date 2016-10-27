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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * odpowied� na zagregowane zapytanie o oferty
 * 
 * <p>Java class for GetRetentionStatusAndOffersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRetentionStatusAndOffersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retentionStatus" type="{http://playmobile.pl/pc/types}RetentionOfferStatus" minOccurs="0"/>
 *         &lt;element name="segmentStatus" type="{http://playmobile.pl/pc/types}SegmentStatus" minOccurs="0"/>
 *         &lt;element name="bucket" type="{http://playmobile.pl/pc/types}PhoneBucket"/>
 *         &lt;element name="offer" type="{http://playmobile.pl/pc/types}RelaxedOffer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRetentionStatusAndOffersResponse", propOrder = {
    "retentionStatus",
    "segmentStatus",
    "bucket",
    "offer"
})
public class GetRetentionStatusAndOffersResponse {

    protected RetentionOfferStatus retentionStatus;
    protected SegmentStatus segmentStatus;
    @XmlElement(required = true)
    protected PhoneBucket bucket;
    protected List<RelaxedOffer> offer;

    /**
     * Gets the value of the retentionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionOfferStatus }
     *     
     */
    public RetentionOfferStatus getRetentionStatus() {
        return retentionStatus;
    }

    /**
     * Sets the value of the retentionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionOfferStatus }
     *     
     */
    public void setRetentionStatus(RetentionOfferStatus value) {
        this.retentionStatus = value;
    }

    /**
     * Gets the value of the segmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentStatus }
     *     
     */
    public SegmentStatus getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * Sets the value of the segmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentStatus }
     *     
     */
    public void setSegmentStatus(SegmentStatus value) {
        this.segmentStatus = value;
    }

    /**
     * Gets the value of the bucket property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneBucket }
     *     
     */
    public PhoneBucket getBucket() {
        return bucket;
    }

    /**
     * Sets the value of the bucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneBucket }
     *     
     */
    public void setBucket(PhoneBucket value) {
        this.bucket = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelaxedOffer }
     * 
     * 
     */
    public List<RelaxedOffer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<RelaxedOffer>();
        }
        return this.offer;
    }

}
