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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchOverrideXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchOverrideXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BaseBranchOverrideXmlType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.ieee.org/odm/Schema/2008}BranchOverrideEnumType"/>
 *         &lt;element name="ratingBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ratingContingecy" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="monitor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchOverrideXmlType", propOrder = {
    "type",
    "ratingBase",
    "ratingContingecy",
    "monitor"
})
public class BranchOverrideXmlType
    extends BaseBranchOverrideXmlType
{

    @XmlElement(required = true)
    protected BranchOverrideEnumType type;
    protected double ratingBase;
    protected double ratingContingecy;
    protected boolean monitor;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BranchOverrideEnumType }
     *     
     */
    public BranchOverrideEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchOverrideEnumType }
     *     
     */
    public void setType(BranchOverrideEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the ratingBase property.
     * 
     */
    public double getRatingBase() {
        return ratingBase;
    }

    /**
     * Sets the value of the ratingBase property.
     * 
     */
    public void setRatingBase(double value) {
        this.ratingBase = value;
    }

    /**
     * Gets the value of the ratingContingecy property.
     * 
     */
    public double getRatingContingecy() {
        return ratingContingecy;
    }

    /**
     * Sets the value of the ratingContingecy property.
     * 
     */
    public void setRatingContingecy(double value) {
        this.ratingContingecy = value;
    }

    /**
     * Gets the value of the monitor property.
     * 
     */
    public boolean isMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     */
    public void setMonitor(boolean value) {
        this.monitor = value;
    }

}