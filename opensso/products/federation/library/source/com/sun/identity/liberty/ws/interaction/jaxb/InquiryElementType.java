//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb;


/**
 * Java content class for InquiryElementType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-interact-svc.xsd line 135)
 * <p>
 * <pre>
 * &lt;complexType name="InquiryElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:is:2003-08}Help" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:is:2003-08}Hint" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface InquiryElementType {


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.HelpType}
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.HelpElement}
     */
    com.sun.identity.liberty.ws.interaction.jaxb.HelpType getHelp();

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.HelpType}
     *     {@link com.sun.identity.liberty.ws.interaction.jaxb.HelpElement}
     */
    void setHelp(com.sun.identity.liberty.ws.interaction.jaxb.HelpType value);

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setValue(java.lang.String value);

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getHint();

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setHint(java.lang.String value);

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

}