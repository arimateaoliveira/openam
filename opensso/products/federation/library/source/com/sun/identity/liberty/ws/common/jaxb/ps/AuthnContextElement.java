//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ps;


/**
 * Java content class for AuthnContext element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-protocols-schema.xsd line 187)
 * <p>
 * <pre>
 * &lt;element name="AuthnContext">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="AuthnContextClassRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;element ref="{urn:liberty:ac:2003-08}AuthenticationContextStatement"/>
 *             &lt;element name="AuthnContextStatementRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface AuthnContextElement
    extends javax.xml.bind.Element, com.sun.identity.liberty.ws.common.jaxb.ps.AuthnContextType
{


}
