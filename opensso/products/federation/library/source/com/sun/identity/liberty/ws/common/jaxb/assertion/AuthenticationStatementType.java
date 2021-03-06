//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion;


/**
 * Java content class for AuthenticationStatementType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/cs-sstc-schema-assertion-01.xsd line 153)
 * <p>
 * <pre>
 * &lt;complexType name="AuthenticationStatementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectStatementAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectLocality" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AuthorityBinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthenticationInstant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AuthenticationMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AuthenticationStatementType
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementAbstractType
{


    /**
     * Gets the value of the AuthorityBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AuthorityBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorityBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingType}
     * {@link com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingElement}
     * 
     */
    java.util.List getAuthorityBinding();

    /**
     * Gets the value of the subjectLocality property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType}
     */
    com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType getSubjectLocality();

    /**
     * Sets the value of the subjectLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType}
     */
    void setSubjectLocality(com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType value);

    /**
     * Gets the value of the authenticationInstant property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getAuthenticationInstant();

    /**
     * Sets the value of the authenticationInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setAuthenticationInstant(java.util.Calendar value);

    /**
     * Gets the value of the authenticationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuthenticationMethod();

    /**
     * Sets the value of the authenticationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuthenticationMethod(java.lang.String value);

}
