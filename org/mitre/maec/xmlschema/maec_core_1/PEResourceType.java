//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package org.mitre.maec.xmlschema.maec_core_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PEResourceType is intended as container for the attributes relevant to PE binary resources.
 * 
 * <p>Java class for PEResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PEResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hashes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Hash" type="{http://maec.mitre.org/XMLSchema/maec-core-1}HashType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Cursor"/>
 *             &lt;enumeration value="Bitmap"/>
 *             &lt;enumeration value="Icon"/>
 *             &lt;enumeration value="Menu"/>
 *             &lt;enumeration value="Dialog"/>
 *             &lt;enumeration value="String"/>
 *             &lt;enumeration value="Fontdir"/>
 *             &lt;enumeration value="Font"/>
 *             &lt;enumeration value="Accelerator"/>
 *             &lt;enumeration value="RCData"/>
 *             &lt;enumeration value="MessageTable"/>
 *             &lt;enumeration value="GroupCursor"/>
 *             &lt;enumeration value="GroupIcon"/>
 *             &lt;enumeration value="Version"/>
 *             &lt;enumeration value="DLGInclude"/>
 *             &lt;enumeration value="PlugPlay"/>
 *             &lt;enumeration value="Vxd"/>
 *             &lt;enumeration value="AniCursor"/>
 *             &lt;enumeration value="AniIcon"/>
 *             &lt;enumeration value="HTML"/>
 *             &lt;enumeration value="Manifest"/>
 *             &lt;enumeration value="Other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEResourceType", propOrder = {
    "name",
    "hashes"
})
public class PEResourceType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Hashes")
    protected PEResourceType.Hashes hashes;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hashes property.
     * 
     * @return
     *     possible object is
     *     {@link PEResourceType.Hashes }
     *     
     */
    public PEResourceType.Hashes getHashes() {
        return hashes;
    }

    /**
     * Sets the value of the hashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEResourceType.Hashes }
     *     
     */
    public void setHashes(PEResourceType.Hashes value) {
        this.hashes = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element name="Hash" type="{http://maec.mitre.org/XMLSchema/maec-core-1}HashType" maxOccurs="unbounded"/>
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
        "hash"
    })
    public static class Hashes {

        @XmlElement(name = "Hash", required = true)
        protected List<HashType> hash;

        /**
         * Gets the value of the hash property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hash property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHash().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HashType }
         * 
         * 
         */
        public List<HashType> getHash() {
            if (hash == null) {
                hash = new ArrayList<HashType>();
            }
            return this.hash;
        }

    }

}
