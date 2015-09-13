//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.13 at 08:40:51 AM CST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Key concepts:
 * 				- Acsc Fault : defined using Fault Type (BusFault, BranchFault, BranchOutage) and Fault Category (3P, LG, LL, LLG)
 * 				- Dynamic Event : defined using Dynamic Event Type (Fault, LoadChange, SetPointChange). Dynamic Event Fault is then 
 *                                   defined using Acsc Fault.
 * 		
 * 
 * <p>Java class for IpssStudyScenarioXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IpssStudyScenarioXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}StudyScenarioXmlType">
 *       &lt;sequence>
 *         &lt;element name="gridRunOption" type="{http://www.interpss.org/Schema/odm/2008}GridComputingXmlType" minOccurs="0"/>
 *         &lt;element name="defaultAclfAlgo" type="{http://www.ieee.org/odm/Schema/2008}AclfAlgorithmXmlType" minOccurs="0"/>
 *         &lt;element name="powerTradingInfo" type="{http://www.interpss.org/Schema/odm/2008}PowerTradingInfoXmlType" minOccurs="0"/>
 *         &lt;element name="analysisCaseList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="curAnalysisCaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="analysisCase" type="{http://www.interpss.org/Schema/odm/2008}IpssAnalysisCaseXmlType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpssStudyScenarioXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "gridRunOption",
    "defaultAclfAlgo",
    "powerTradingInfo",
    "analysisCaseList"
})
public class IpssStudyScenarioXmlType
    extends StudyScenarioXmlType
{

    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected GridComputingXmlType gridRunOption;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected AclfAlgorithmXmlType defaultAclfAlgo;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
    protected PowerTradingInfoXmlType powerTradingInfo;
    @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
    protected IpssStudyScenarioXmlType.AnalysisCaseList analysisCaseList;

    /**
     * Gets the value of the gridRunOption property.
     * 
     * @return
     *     possible object is
     *     {@link GridComputingXmlType }
     *     
     */
    public GridComputingXmlType getGridRunOption() {
        return gridRunOption;
    }

    /**
     * Sets the value of the gridRunOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridComputingXmlType }
     *     
     */
    public void setGridRunOption(GridComputingXmlType value) {
        this.gridRunOption = value;
    }

    /**
     * Gets the value of the defaultAclfAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AclfAlgorithmXmlType }
     *     
     */
    public AclfAlgorithmXmlType getDefaultAclfAlgo() {
        return defaultAclfAlgo;
    }

    /**
     * Sets the value of the defaultAclfAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclfAlgorithmXmlType }
     *     
     */
    public void setDefaultAclfAlgo(AclfAlgorithmXmlType value) {
        this.defaultAclfAlgo = value;
    }

    /**
     * Gets the value of the powerTradingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PowerTradingInfoXmlType }
     *     
     */
    public PowerTradingInfoXmlType getPowerTradingInfo() {
        return powerTradingInfo;
    }

    /**
     * Sets the value of the powerTradingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerTradingInfoXmlType }
     *     
     */
    public void setPowerTradingInfo(PowerTradingInfoXmlType value) {
        this.powerTradingInfo = value;
    }

    /**
     * Gets the value of the analysisCaseList property.
     * 
     * @return
     *     possible object is
     *     {@link IpssStudyScenarioXmlType.AnalysisCaseList }
     *     
     */
    public IpssStudyScenarioXmlType.AnalysisCaseList getAnalysisCaseList() {
        return analysisCaseList;
    }

    /**
     * Sets the value of the analysisCaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpssStudyScenarioXmlType.AnalysisCaseList }
     *     
     */
    public void setAnalysisCaseList(IpssStudyScenarioXmlType.AnalysisCaseList value) {
        this.analysisCaseList = value;
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
     *         &lt;element name="curAnalysisCaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="analysisCase" type="{http://www.interpss.org/Schema/odm/2008}IpssAnalysisCaseXmlType" maxOccurs="unbounded"/>
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
        "curAnalysisCaseId",
        "analysisCase"
    })
    public static class AnalysisCaseList {

        @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008")
        protected String curAnalysisCaseId;
        @XmlElement(namespace = "http://www.interpss.org/Schema/odm/2008", required = true)
        protected List<IpssAnalysisCaseXmlType> analysisCase;

        /**
         * Gets the value of the curAnalysisCaseId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurAnalysisCaseId() {
            return curAnalysisCaseId;
        }

        /**
         * Sets the value of the curAnalysisCaseId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurAnalysisCaseId(String value) {
            this.curAnalysisCaseId = value;
        }

        /**
         * Gets the value of the analysisCase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the analysisCase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnalysisCase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IpssAnalysisCaseXmlType }
         * 
         * 
         */
        public List<IpssAnalysisCaseXmlType> getAnalysisCase() {
            if (analysisCase == null) {
                analysisCase = new ArrayList<IpssAnalysisCaseXmlType>();
            }
            return this.analysisCase;
        }

    }

}