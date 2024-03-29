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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * ObjectCollectionType is intended to provide a mechanism for characterizing collections of effects. For instance, it can be used to group all of the actions that are associated with a specific behavior.
 * 
 * <p>Java class for ObjectCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Affinity_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Affinity_Degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Object_Sub_Collection" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectCollectionType" minOccurs="0"/>
 *           &lt;element name="Object" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectType" minOccurs="0"/>
 *           &lt;element name="Object_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectCollIDPattern" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectCollectionType", propOrder = {
    "affinityType",
    "affinityDegree",
    "objectSubCollectionOrObjectOrObjectReference"
})
public class ObjectCollectionType {

    @XmlElement(name = "Affinity_Type")
    protected String affinityType;
    @XmlElement(name = "Affinity_Degree")
    protected String affinityDegree;
    @XmlElements({
        @XmlElement(name = "Object_Sub_Collection", type = ObjectCollectionType.class),
        @XmlElement(name = "Object", type = ObjectType.class),
        @XmlElement(name = "Object_Reference", type = ObjectReferenceType.class)
    })
    protected List<Object> objectSubCollectionOrObjectOrObjectReference;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the affinityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityType() {
        return affinityType;
    }

    /**
     * Sets the value of the affinityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityType(String value) {
        this.affinityType = value;
    }

    /**
     * Gets the value of the affinityDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityDegree() {
        return affinityDegree;
    }

    /**
     * Sets the value of the affinityDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityDegree(String value) {
        this.affinityDegree = value;
    }

    /**
     * Gets the value of the objectSubCollectionOrObjectOrObjectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectSubCollectionOrObjectOrObjectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectSubCollectionOrObjectOrObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectCollectionType }
     * {@link ObjectType }
     * {@link ObjectReferenceType }
     * 
     * 
     */
    public List<Object> getObjectSubCollectionOrObjectOrObjectReference() {
        if (objectSubCollectionOrObjectOrObjectReference == null) {
            objectSubCollectionOrObjectOrObjectReference = new ArrayList<Object>();
        }
        return this.objectSubCollectionOrObjectOrObjectReference;
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

}
