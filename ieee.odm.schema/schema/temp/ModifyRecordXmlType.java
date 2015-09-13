//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Each modifyRecord may describe different modification for some purpose. Each ModifyRecord is retrieved 
 * 			using the record id. ModifyRecordXmlType is an abstract type. All modification record types are sub-type
 * 			of ModifyRecordXmlType.
 * 		
 * 
 * <p>Java class for ModifyRecordXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyRecordXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}IDRecordXmlType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyRecordXmlType")
@XmlSeeAlso({
    OverrideOutageScheduleXmlType.class,
    NetModificationXmlType.class,
    BaseDailyScheduleXmlType.class,
    BranchLossAreaAllocationXmlType.class,
    OutageScheduleXmlType.class,
    GenLoadModifyXmlType.class,
    DclfContingencySetXmlType.class
})
public abstract class ModifyRecordXmlType
    extends IDRecordXmlType
{


}