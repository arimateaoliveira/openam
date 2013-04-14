//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for SecretKeyProtectionType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 714)
 * <p>
 * <pre>
 * &lt;complexType name="SecretKeyProtectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:ac:2003-08}KeyActivation" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}KeyStorage" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SecretKeyProtectionType {


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
     * Gets the value of the keyStorage property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType getKeyStorage();

    /**
     * Sets the value of the keyStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType}
     */
    void setKeyStorage(com.sun.identity.liberty.ws.common.jaxb.ac.KeyStorageType value);

    /**
     * Gets the value of the keyActivation property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType getKeyActivation();

    /**
     * Sets the value of the keyActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationElement}
     */
    void setKeyActivation(com.sun.identity.liberty.ws.common.jaxb.ac.KeyActivationType value);

}
