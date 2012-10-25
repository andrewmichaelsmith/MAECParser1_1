//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package org.mitre.maec.xmlschema.maec_core_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * PESectionType is intended as container for the attributes relevant to PE binary sections.
 * 
 * <p>Java class for PESectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PESectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header_Hashes" minOccurs="0">
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
 *         &lt;element name="Data_Hashes" minOccurs="0">
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
 *         &lt;element name="Section_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Entropy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Virtual_Address" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="Virtual_Size" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="Relocations" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PESectionType", propOrder = {
    "headerHashes",
    "dataHashes",
    "sectionName",
    "entropy",
    "virtualAddress",
    "virtualSize",
    "flags",
    "relocations"
})
public class PESectionType {

    @XmlElement(name = "Header_Hashes")
    protected PESectionType.HeaderHashes headerHashes;
    @XmlElement(name = "Data_Hashes")
    protected PESectionType.DataHashes dataHashes;
    @XmlElement(name = "Section_Name", required = true)
    protected String sectionName;
    @XmlElement(name = "Entropy")
    protected Float entropy;
    @XmlElement(name = "Virtual_Address", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] virtualAddress;
    @XmlElement(name = "Virtual_Size")
    protected BigInteger virtualSize;
    @XmlElement(name = "Flags", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] flags;
    @XmlElement(name = "Relocations")
    protected BigInteger relocations;

    /**
     * Gets the value of the headerHashes property.
     * 
     * @return
     *     possible object is
     *     {@link PESectionType.HeaderHashes }
     *     
     */
    public PESectionType.HeaderHashes getHeaderHashes() {
        return headerHashes;
    }

    /**
     * Sets the value of the headerHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PESectionType.HeaderHashes }
     *     
     */
    public void setHeaderHashes(PESectionType.HeaderHashes value) {
        this.headerHashes = value;
    }

    /**
     * Gets the value of the dataHashes property.
     * 
     * @return
     *     possible object is
     *     {@link PESectionType.DataHashes }
     *     
     */
    public PESectionType.DataHashes getDataHashes() {
        return dataHashes;
    }

    /**
     * Sets the value of the dataHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PESectionType.DataHashes }
     *     
     */
    public void setDataHashes(PESectionType.DataHashes value) {
        this.dataHashes = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the entropy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEntropy() {
        return entropy;
    }

    /**
     * Sets the value of the entropy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEntropy(Float value) {
        this.entropy = value;
    }

    /**
     * Gets the value of the virtualAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getVirtualAddress() {
        return virtualAddress;
    }

    /**
     * Sets the value of the virtualAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualAddress(byte[] value) {
        this.virtualAddress = value;
    }

    /**
     * Gets the value of the virtualSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVirtualSize() {
        return virtualSize;
    }

    /**
     * Sets the value of the virtualSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVirtualSize(BigInteger value) {
        this.virtualSize = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(byte[] value) {
        this.flags = value;
    }

    /**
     * Gets the value of the relocations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelocations() {
        return relocations;
    }

    /**
     * Sets the value of the relocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelocations(BigInteger value) {
        this.relocations = value;
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
    public static class DataHashes {

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
    public static class HeaderHashes {

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