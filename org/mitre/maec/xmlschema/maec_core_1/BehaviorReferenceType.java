//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package org.mitre.maec.xmlschema.maec_core_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * BehaviorReferenceType is intended to serve as a method for linking to behaviors.
 * 
 * <p>Java class for BehaviorReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BehaviorReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="behavior_id" use="required" type="{http://maec.mitre.org/XMLSchema/maec-core-1}BehaviorIDPattern" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Behavior"/>
 *             &lt;enumeration value="Behavior_Collection"/>
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
@XmlType(name = "BehaviorReferenceType")
public class BehaviorReferenceType {

    @XmlAttribute(name = "behavior_id", required = true)
    protected String behaviorId;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the behaviorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehaviorId() {
        return behaviorId;
    }

    /**
     * Sets the value of the behaviorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehaviorId(String value) {
        this.behaviorId = value;
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

}