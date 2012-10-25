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
 * <p>Java class for RelationshipTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="relatedTo"/>
 *     &lt;enumeration value="isClassifiedAs"/>
 *     &lt;enumeration value="hosts"/>
 *     &lt;enumeration value="installed"/>
 *     &lt;enumeration value="isParentOf"/>
 *     &lt;enumeration value="causesToInstall"/>
 *     &lt;enumeration value="downloads"/>
 *     &lt;enumeration value="runs"/>
 *     &lt;enumeration value="usesCNC"/>
 *     &lt;enumeration value="isNameServerOf"/>
 *     &lt;enumeration value="resolvesTo"/>
 *     &lt;enumeration value="verifiedBy"/>
 *     &lt;enumeration value="isServerOfService"/>
 *     &lt;enumeration value="hasAssociatedConfiguration"/>
 *     &lt;enumeration value="operatedByEntity"/>
 *     &lt;enumeration value="downloadedFrom"/>
 *     &lt;enumeration value="contactedBy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationshipTypeEnum")
@XmlEnum
public enum RelationshipTypeEnum {


    /**
     * 
     *      relatedTo - generic relationship.
     *      
     * 
     */
    @XmlEnumValue("relatedTo")
    RELATED_TO("relatedTo"),

    /**
     * 
     *       isClassifiedAs -  Used to match an object to a classification to provide a "name" for the object. 
     *      
     * 
     */
    @XmlEnumValue("isClassifiedAs")
    IS_CLASSIFIED_AS("isClassifiedAs"),

    /**
     * 
     *       hosts - Used when a web site hosts a file.
     *      
     * 
     */
    @XmlEnumValue("hosts")
    HOSTS("hosts"),

    /**
     * 
     *       installed - Used to relate files that install one another. 
     *      
     * 
     */
    @XmlEnumValue("installed")
    INSTALLED("installed"),

    /**
     * 
     *       isParentOf - Used to relate files that creates another one. 
     *      
     * 
     */
    @XmlEnumValue("isParentOf")
    IS_PARENT_OF("isParentOf"),

    /**
     * 
     *      causesToInstall - As in web site causes file to be installed.
     *      
     * 
     */
    @XmlEnumValue("causesToInstall")
    CAUSES_TO_INSTALL("causesToInstall"),

    /**
     * 
     *       downloads - As in file retrieves data from a url, or file downloads file.
     *      
     * 
     */
    @XmlEnumValue("downloads")
    DOWNLOADS("downloads"),

    /**
     * 
     *       runs - File that a url with an exploit runs. Or a file (parent) that runs another file (child).
     *      
     * 
     */
    @XmlEnumValue("runs")
    RUNS("runs"),

    /**
     * 
     *       usesCNC - As in classification/object uses command and control url/domain/ip.
     *      
     * 
     */
    @XmlEnumValue("usesCNC")
    USES_CNC("usesCNC"),

    /**
     * 
     *       isNameServerOf - Maps name server ip to domain.
     *      
     * 
     */
    @XmlEnumValue("isNameServerOf")
    IS_NAME_SERVER_OF("isNameServerOf"),

    /**
     * 
     *       resolvesTo - Maps domain/url to ip address, could also use for ip address and asn.
     *      
     * 
     */
    @XmlEnumValue("resolvesTo")
    RESOLVES_TO("resolvesTo"),

    /**
     * 
     *       verifiedBy - Mapping from object information (e.g. url) to entity, with date indicating verified time.
     *      
     * 
     */
    @XmlEnumValue("verifiedBy")
    VERIFIED_BY("verifiedBy"),

    /**
     * 
     *      isServerOfService - Map from domain/ip to service object.
     *      
     * 
     */
    @XmlEnumValue("isServerOfService")
    IS_SERVER_OF_SERVICE("isServerOfService"),

    /**
     * 
     *       hasAssociatedConfiguration - Map from file to associated registry information.
     *      
     * 
     */
    @XmlEnumValue("hasAssociatedConfiguration")
    HAS_ASSOCIATED_CONFIGURATION("hasAssociatedConfiguration"),

    /**
     * 
     *       operatedByEntity  - Map from object to operating entity.
     *      
     * 
     */
    @XmlEnumValue("operatedByEntity")
    OPERATED_BY_ENTITY("operatedByEntity"),

    /**
     * 
     *       downloadedFrom  - Map from file to url.
     *      
     * 
     */
    @XmlEnumValue("downloadedFrom")
    DOWNLOADED_FROM("downloadedFrom"),

    /**
     * 
     *       contactedBy  - Map from file to url.
     *      
     * 
     */
    @XmlEnumValue("contactedBy")
    CONTACTED_BY("contactedBy");
    private final String value;

    RelationshipTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipTypeEnum fromValue(String v) {
        for (RelationshipTypeEnum c: RelationshipTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
