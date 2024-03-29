//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package xml.metadatasharing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     IP object. Used to hold ipv4, ipv6 ip addresses and address ranges. The globally unique id is 'startAddress-endAddress'.
 *     
 *     There are two required elements, startAddress and endAddress, make these the same if you are 
 *     specifying a single address.
 *     
 *     Thus for ip range id, would be e.g. 213.23.45.7-213.23.45.19
 *     For a single ip, id would be e.g. 12.34.56.1-12.34.56.1
 *     
 *    
 * 
 * <p>Java class for IPObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startAddress" type="{http://xml/metadataSharing.xsd}IPAddress"/>
 *         &lt;element name="endAddress" type="{http://xml/metadataSharing.xsd}IPAddress"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://xml/metadataSharing.xsd}IPRange" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPObject", propOrder = {
    "startAddress",
    "endAddress"
})
public class IPObject {

    @XmlElement(required = true)
    protected IPAddress startAddress;
    @XmlElement(required = true)
    protected IPAddress endAddress;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the startAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddress }
     *     
     */
    public IPAddress getStartAddress() {
        return startAddress;
    }

    /**
     * Sets the value of the startAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *     
     */
    public void setStartAddress(IPAddress value) {
        this.startAddress = value;
    }

    /**
     * Gets the value of the endAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddress }
     *     
     */
    public IPAddress getEndAddress() {
        return endAddress;
    }

    /**
     * Sets the value of the endAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *     
     */
    public void setEndAddress(IPAddress value) {
        this.endAddress = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
