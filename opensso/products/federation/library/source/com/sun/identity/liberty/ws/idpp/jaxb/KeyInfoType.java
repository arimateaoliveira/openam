//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * Java content class for KeyInfoType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-id-sis-pp.xsd line 18)
 * <p>
 * <pre>
 * &lt;complexType name="KeyInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2000/09/xmldsig#}KeyInfoType">
 *       &lt;attribute ref="{urn:liberty:id-sis-pp:2003-08}ACC"/>
 *       &lt;attribute ref="{urn:liberty:id-sis-pp:2003-08}ACCTime"/>
 *       &lt;attribute ref="{urn:liberty:id-sis-pp:2003-08}modificationTime"/>
 *       &lt;attribute ref="{urn:liberty:id-sis-pp:2003-08}modifier"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface KeyInfoType
    extends com.sun.identity.liberty.ws.common.jaxb.xmlsig.KeyInfoType
{


    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getACC();

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setACC(java.lang.String value);

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModificationTime();

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModificationTime(java.util.Calendar value);

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getModifier();

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setModifier(java.lang.String value);

    /**
     * Gets the value of the accTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getACCTime();

    /**
     * Sets the value of the accTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setACCTime(java.util.Calendar value);

}
