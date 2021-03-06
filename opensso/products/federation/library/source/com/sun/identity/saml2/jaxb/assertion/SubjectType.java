//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for SubjectType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 106)
 * <p>
 * <pre>
 * &lt;complexType name="SubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}BaseID"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}NameID"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedID"/>
 *           &lt;/choice>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectConfirmation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectConfirmation" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SubjectType {


    /**
     * Gets the value of the encryptedID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.EncryptedElementType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.EncryptedIDElement}
     */
    com.sun.identity.saml2.jaxb.assertion.EncryptedElementType getEncryptedID();

    /**
     * Sets the value of the encryptedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.EncryptedElementType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.EncryptedIDElement}
     */
    void setEncryptedID(com.sun.identity.saml2.jaxb.assertion.EncryptedElementType value);

    /**
     * Gets the value of the SubjectConfirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the SubjectConfirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.saml2.jaxb.assertion.SubjectConfirmationElement}
     * {@link com.sun.identity.saml2.jaxb.assertion.SubjectConfirmationType}
     * {@link com.sun.identity.saml2.jaxb.assertion.SubjectConfirmationElement}
     * {@link com.sun.identity.saml2.jaxb.assertion.SubjectConfirmationType}
     * 
     */
    java.util.List getSubjectConfirmation();

    /**
     * Gets the value of the baseID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.BaseIDAbstractType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.BaseIDElement}
     */
    com.sun.identity.saml2.jaxb.assertion.BaseIDAbstractType getBaseID();

    /**
     * Sets the value of the baseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.BaseIDAbstractType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.BaseIDElement}
     */
    void setBaseID(com.sun.identity.saml2.jaxb.assertion.BaseIDAbstractType value);

    /**
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.NameIDElement}
     *     {@link com.sun.identity.saml2.jaxb.assertion.NameIDType}
     */
    com.sun.identity.saml2.jaxb.assertion.NameIDType getNameID();

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.NameIDElement}
     *     {@link com.sun.identity.saml2.jaxb.assertion.NameIDType}
     */
    void setNameID(com.sun.identity.saml2.jaxb.assertion.NameIDType value);

}
