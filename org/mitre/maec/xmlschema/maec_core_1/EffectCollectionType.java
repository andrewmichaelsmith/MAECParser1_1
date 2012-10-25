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
 * EffectCollectionType is intended to provide a mechanism for characterizing collections of effects. For instance, it can be used to group all of the effects that result from the execution of a particular malware instance.
 * 
 * <p>Java class for EffectCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Affinity_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Affinity_Degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://maec.mitre.org/XMLSchema/maec-core-1}StructuredTextType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Effect_Sub_Collection" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectCollectionType" minOccurs="0"/>
 *           &lt;element name="Effect" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectType" minOccurs="0"/>
 *           &lt;element name="Effect_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectCollIDPattern" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectCollectionType", propOrder = {
    "affinityType",
    "affinityDegree",
    "description",
    "effectSubCollectionOrEffectOrEffectReference"
})
public class EffectCollectionType {

    @XmlElement(name = "Affinity_Type")
    protected String affinityType;
    @XmlElement(name = "Affinity_Degree")
    protected String affinityDegree;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElements({
        @XmlElement(name = "Effect_Sub_Collection", type = EffectCollectionType.class),
        @XmlElement(name = "Effect", type = EffectType.class),
        @XmlElement(name = "Effect_Reference", type = EffectReferenceType.class)
    })
    protected List<Object> effectSubCollectionOrEffectOrEffectReference;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectSubCollectionOrEffectOrEffectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectSubCollectionOrEffectOrEffectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectSubCollectionOrEffectOrEffectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectCollectionType }
     * {@link EffectType }
     * {@link EffectReferenceType }
     * 
     * 
     */
    public List<Object> getEffectSubCollectionOrEffectOrEffectReference() {
        if (effectSubCollectionOrEffectOrEffectReference == null) {
            effectSubCollectionOrEffectOrEffectReference = new ArrayList<Object>();
        }
        return this.effectSubCollectionOrEffectOrEffectReference;
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