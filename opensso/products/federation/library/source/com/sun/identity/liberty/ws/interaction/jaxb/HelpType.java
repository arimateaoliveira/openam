//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb;


/**
 * Java content class for HelpType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-interact-svc.xsd line 100)
 * <p>
 * <pre>
 * &lt;complexType name="HelpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="moreLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface HelpType {


    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLink();

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLink(java.lang.String value);

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLabel();

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLabel(java.lang.String value);

    /**
     * Gets the value of the moreLink property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getMoreLink();

    /**
     * Sets the value of the moreLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setMoreLink(java.lang.String value);

}
