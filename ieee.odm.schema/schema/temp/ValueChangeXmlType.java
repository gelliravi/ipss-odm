//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueChangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeAction" type="{http://www.ieee.org/odm/Schema/2008}ValueChangeActionEnumType"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueChangeXmlType", propOrder = {
    "changeAction",
    "percent"
})
@XmlSeeAlso({
    DoubleValueChangeXmlType.class,
    ComplexValueChangeXmlType.class
})
public class ValueChangeXmlType {

    @XmlElement(required = true)
    protected ValueChangeActionEnumType changeAction;
    protected Double percent;

    /**
     * Gets the value of the changeAction property.
     * 
     * @return
     *     possible object is
     *     {@link ValueChangeActionEnumType }
     *     
     */
    public ValueChangeActionEnumType getChangeAction() {
        return changeAction;
    }

    /**
     * Sets the value of the changeAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueChangeActionEnumType }
     *     
     */
    public void setChangeAction(ValueChangeActionEnumType value) {
        this.changeAction = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

}