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
 * EffectType is intended to serve as a method for the characterization of the results of succesfully executed actions and behaviors.
 * 
 * <p>Java class for EffectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://maec.mitre.org/XMLSchema/maec-core-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Affected_Objects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Affected_Object" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Object_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectReferenceType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="effect_type" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectTypeEnum" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Constituent_Effects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Effect_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectReferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vulnerability_Exploit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Known_Exploit" type="{http://maec.mitre.org/XMLSchema/maec-core-1}CVEVulnerabilityType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="vulnerability_type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Known"/>
 *                       &lt;enumeration value="Unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectIDPattern" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectType", propOrder = {
    "description",
    "affectedObjects",
    "constituentEffects",
    "vulnerabilityExploit"
})
public class EffectType {

    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Affected_Objects")
    protected EffectType.AffectedObjects affectedObjects;
    @XmlElement(name = "Constituent_Effects")
    protected EffectType.ConstituentEffects constituentEffects;
    @XmlElement(name = "Vulnerability_Exploit")
    protected EffectType.VulnerabilityExploit vulnerabilityExploit;
    @XmlAttribute(name = "id", required = true)
    protected String id;

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
     * Gets the value of the affectedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link EffectType.AffectedObjects }
     *     
     */
    public EffectType.AffectedObjects getAffectedObjects() {
        return affectedObjects;
    }

    /**
     * Sets the value of the affectedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectType.AffectedObjects }
     *     
     */
    public void setAffectedObjects(EffectType.AffectedObjects value) {
        this.affectedObjects = value;
    }

    /**
     * Gets the value of the constituentEffects property.
     * 
     * @return
     *     possible object is
     *     {@link EffectType.ConstituentEffects }
     *     
     */
    public EffectType.ConstituentEffects getConstituentEffects() {
        return constituentEffects;
    }

    /**
     * Sets the value of the constituentEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectType.ConstituentEffects }
     *     
     */
    public void setConstituentEffects(EffectType.ConstituentEffects value) {
        this.constituentEffects = value;
    }

    /**
     * Gets the value of the vulnerabilityExploit property.
     * 
     * @return
     *     possible object is
     *     {@link EffectType.VulnerabilityExploit }
     *     
     */
    public EffectType.VulnerabilityExploit getVulnerabilityExploit() {
        return vulnerabilityExploit;
    }

    /**
     * Sets the value of the vulnerabilityExploit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectType.VulnerabilityExploit }
     *     
     */
    public void setVulnerabilityExploit(EffectType.VulnerabilityExploit value) {
        this.vulnerabilityExploit = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Affected_Object" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Object_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectReferenceType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="effect_type" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectTypeEnum" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "affectedObject"
    })
    public static class AffectedObjects {

        @XmlElement(name = "Affected_Object", required = true)
        protected List<EffectType.AffectedObjects.AffectedObject> affectedObject;

        /**
         * Gets the value of the affectedObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EffectType.AffectedObjects.AffectedObject }
         * 
         * 
         */
        public List<EffectType.AffectedObjects.AffectedObject> getAffectedObject() {
            if (affectedObject == null) {
                affectedObject = new ArrayList<EffectType.AffectedObjects.AffectedObject>();
            }
            return this.affectedObject;
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
         *         &lt;element name="Object_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}ObjectReferenceType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="effect_type" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectTypeEnum" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "objectReference"
        })
        public static class AffectedObject {

            @XmlElement(name = "Object_Reference", required = true)
            protected ObjectReferenceType objectReference;
            @XmlAttribute(name = "effect_type")
            protected EffectTypeEnum effectType;

            /**
             * Gets the value of the objectReference property.
             * 
             * @return
             *     possible object is
             *     {@link ObjectReferenceType }
             *     
             */
            public ObjectReferenceType getObjectReference() {
                return objectReference;
            }

            /**
             * Sets the value of the objectReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObjectReferenceType }
             *     
             */
            public void setObjectReference(ObjectReferenceType value) {
                this.objectReference = value;
            }

            /**
             * Gets the value of the effectType property.
             * 
             * @return
             *     possible object is
             *     {@link EffectTypeEnum }
             *     
             */
            public EffectTypeEnum getEffectType() {
                return effectType;
            }

            /**
             * Sets the value of the effectType property.
             * 
             * @param value
             *     allowed object is
             *     {@link EffectTypeEnum }
             *     
             */
            public void setEffectType(EffectTypeEnum value) {
                this.effectType = value;
            }

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
     *         &lt;element name="Effect_Reference" type="{http://maec.mitre.org/XMLSchema/maec-core-1}EffectReferenceType" maxOccurs="unbounded"/>
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
        "effectReference"
    })
    public static class ConstituentEffects {

        @XmlElement(name = "Effect_Reference", required = true)
        protected List<EffectReferenceType> effectReference;

        /**
         * Gets the value of the effectReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the effectReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEffectReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EffectReferenceType }
         * 
         * 
         */
        public List<EffectReferenceType> getEffectReference() {
            if (effectReference == null) {
                effectReference = new ArrayList<EffectReferenceType>();
            }
            return this.effectReference;
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
     *         &lt;element name="Known_Exploit" type="{http://maec.mitre.org/XMLSchema/maec-core-1}CVEVulnerabilityType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="vulnerability_type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Known"/>
     *             &lt;enumeration value="Unknown"/>
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
    @XmlType(name = "", propOrder = {
        "knownExploit"
    })
    public static class VulnerabilityExploit {

        @XmlElement(name = "Known_Exploit", required = true)
        protected CVEVulnerabilityType knownExploit;
        @XmlAttribute(name = "vulnerability_type")
        protected String vulnerabilityType;

        /**
         * Gets the value of the knownExploit property.
         * 
         * @return
         *     possible object is
         *     {@link CVEVulnerabilityType }
         *     
         */
        public CVEVulnerabilityType getKnownExploit() {
            return knownExploit;
        }

        /**
         * Sets the value of the knownExploit property.
         * 
         * @param value
         *     allowed object is
         *     {@link CVEVulnerabilityType }
         *     
         */
        public void setKnownExploit(CVEVulnerabilityType value) {
            this.knownExploit = value;
        }

        /**
         * Gets the value of the vulnerabilityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVulnerabilityType() {
            return vulnerabilityType;
        }

        /**
         * Sets the value of the vulnerabilityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVulnerabilityType(String value) {
            this.vulnerabilityType = value;
        }

    }

}