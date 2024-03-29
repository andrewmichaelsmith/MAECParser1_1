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
 * <p>Java class for RegionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NorthAmerica"/>
 *     &lt;enumeration value="SouthAmerica"/>
 *     &lt;enumeration value="CentralAmerica"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="Africa"/>
 *     &lt;enumeration value="APAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionTypeEnum")
@XmlEnum
public enum RegionTypeEnum {

    @XmlEnumValue("NorthAmerica")
    NORTH_AMERICA("NorthAmerica"),
    @XmlEnumValue("SouthAmerica")
    SOUTH_AMERICA("SouthAmerica"),
    @XmlEnumValue("CentralAmerica")
    CENTRAL_AMERICA("CentralAmerica"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    @XmlEnumValue("Africa")
    AFRICA("Africa"),
    APAC("APAC");
    private final String value;

    RegionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegionTypeEnum fromValue(String v) {
        for (RegionTypeEnum c: RegionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
