//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 08:49:24 DU CEST 
//


package com.sun.identity.diagnostic.base.core.jaxbgen;


/**
 * Java content class for service element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/amserver/source/com/sun/identity/diagnostic/base/config/service.xsd line 33)
 * <p>
 * <pre>
 * &lt;element name="service">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}typeofservice"/>
 *           &lt;element ref="{}realization"/>
 *           &lt;element ref="{}runtime"/>
 *         &lt;/sequence>
 *         &lt;attribute name="clazz" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface ServiceElement
    extends javax.xml.bind.Element, com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType
{


}