//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ps;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-protocols-schema.xsd line 115)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AuthnContextClassRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *           &lt;element name="AuthnContextStatementRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="AuthnContextComparison" type="{urn:liberty:iff:2003-08}AuthnContextComparisonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RequestAuthnContextType {


    /**
     * Gets the value of the AuthnContextStatementRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AuthnContextStatementRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthnContextStatementRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getAuthnContextStatementRef();

    /**
     * Gets the value of the AuthnContextClassRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AuthnContextClassRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthnContextClassRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getAuthnContextClassRef();

    /**
     * Gets the value of the authnContextComparison property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuthnContextComparison();

    /**
     * Sets the value of the authnContextComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuthnContextComparison(java.lang.String value);

}
