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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * komunikat odpowiedzi do pobrania zapisanej oferty utrzymaniowej
 * 
 * <p>Java class for GetSavedRetentionResponse2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSavedRetentionResponse2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offer" type="{http://playmobile.pl/pc/types}OfferForGetSavedRetention" minOccurs="0"/>
 *         &lt;element name="cfsIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cfsId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created" type="{http://playmobile.pl/pc/types}Date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedRetentionResponse2", propOrder = {
    "offer",
    "cfsIds"
})
public class GetSavedRetentionResponse2 {

    protected OfferForGetSavedRetention offer;
    protected GetSavedRetentionResponse2 .CfsIds cfsIds;
    @XmlAttribute(name = "sid")
    protected String sid;
    @XmlAttribute(name = "created")
    protected XMLGregorianCalendar created;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link OfferForGetSavedRetention }
     *     
     */
    public OfferForGetSavedRetention getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferForGetSavedRetention }
     *     
     */
    public void setOffer(OfferForGetSavedRetention value) {
        this.offer = value;
    }

    /**
     * Gets the value of the cfsIds property.
     * 
     * @return
     *     possible object is
     *     {@link GetSavedRetentionResponse2 .CfsIds }
     *     
     */
    public GetSavedRetentionResponse2 .CfsIds getCfsIds() {
        return cfsIds;
    }

    /**
     * Sets the value of the cfsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSavedRetentionResponse2 .CfsIds }
     *     
     */
    public void setCfsIds(GetSavedRetentionResponse2 .CfsIds value) {
        this.cfsIds = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfsId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfsId"
    })
    public static class CfsIds {

        @XmlElement(type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> cfsId;

        /**
         * Gets the value of the cfsId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cfsId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCfsId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCfsId() {
            if (cfsId == null) {
                cfsId = new ArrayList<Long>();
            }
            return this.cfsId;
        }

    }

}
