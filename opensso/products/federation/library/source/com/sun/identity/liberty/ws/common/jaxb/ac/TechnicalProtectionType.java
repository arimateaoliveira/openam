//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for TechnicalProtectionType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 555)
 * <p>
 * <pre>
 * &lt;complexType name="TechnicalProtectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:liberty:ac:2003-08}PrivateKeyProtection" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}SecretKeyProtection" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TechnicalProtectionType {


    /**
     * Gets the value of the Extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.common.jaxb.ac.ExtensionType}
     * {@link com.sun.identity.liberty.ws.common.jaxb.ac.ExtensionElement}
     * 
     */
    java.util.List getExtension();

    /**
     * Gets the value of the privateKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType getPrivateKeyProtection();

    /**
     * Sets the value of the privateKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionElement}
     */
    void setPrivateKeyProtection(com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType value);

    /**
     * Gets the value of the secretKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType getSecretKeyProtection();

    /**
     * Sets the value of the secretKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType}
     */
    void setSecretKeyProtection(com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType value);

}