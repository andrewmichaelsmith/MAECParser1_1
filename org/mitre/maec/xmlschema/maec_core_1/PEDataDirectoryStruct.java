//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package org.mitre.maec.xmlschema.maec_core_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * PEDataDirectoryStruct is intended as container for the attributes present in a PE binary's data directory structure.
 * 
 * <p>Java class for PEDataDirectoryStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PEDataDirectoryStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Virtual_Address" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEDataDirectoryStruct", propOrder = {
    "virtualAddress",
    "size"
})
public class PEDataDirectoryStruct {

    @XmlElement(name = "Virtual_Address", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] virtualAddress;
    @XmlElement(name = "Size")
    protected int size;

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
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
