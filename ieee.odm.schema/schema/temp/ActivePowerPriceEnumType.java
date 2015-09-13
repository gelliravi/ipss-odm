//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ActivePowerPriceEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivePowerPriceEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dollarPerMW"/>
 *     &lt;enumeration value="dollarPerKW"/>
 *     &lt;enumeration value="dollarPerMWSquare"/>
 *     &lt;enumeration value="dollarPerKWSquare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ActivePowerPriceEnumType {

    @XmlEnumValue("dollarPerMW")
    DOLLAR_PER_MW("dollarPerMW"),
    @XmlEnumValue("dollarPerKW")
    DOLLAR_PER_KW("dollarPerKW"),
    @XmlEnumValue("dollarPerMWSquare")
    DOLLAR_PER_MW_SQUARE("dollarPerMWSquare"),
    @XmlEnumValue("dollarPerKWSquare")
    DOLLAR_PER_KW_SQUARE("dollarPerKWSquare");
    private final String value;

    ActivePowerPriceEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivePowerPriceEnumType fromValue(String v) {
        for (ActivePowerPriceEnumType c: ActivePowerPriceEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}