//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.25 at 10:39:55 PM BST 
//


package xml.metadatasharing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassificationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clean"/>
 *     &lt;enumeration value="dirty"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="unwanted"/>
 *     &lt;enumeration value="neutral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassificationTypeEnum")
@XmlEnum
public enum ClassificationTypeEnum {


    /**
     * 
     *       clean - the object can be regarded as not malicious.
     *      
     * 
     */
    @XmlEnumValue("clean")
    CLEAN("clean"),

    /**
     * 
     *       dirty - the object can be regarded as malicious.
     *      
     * 
     */
    @XmlEnumValue("dirty")
    DIRTY("dirty"),

    /**
     * 
     *       unknown - the object classification type is unknown.
     *      
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * 
     *       unwanted - the object can be regarded as potentially unwanted. This is intended to cover the well known case of "potentially unwanted programs".
     *      
     * 
     */
    @XmlEnumValue("unwanted")
    UNWANTED("unwanted"),

    /**
     * 
     *       neutral - the object can be regarded as neutral, neither malicious nor legitimate.
     *      
     * 
     */
    @XmlEnumValue("neutral")
    NEUTRAL("neutral");
    private final String value;

    ClassificationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassificationTypeEnum fromValue(String v) {
        for (ClassificationTypeEnum c: ClassificationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
