//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.xmlsig;


/**
 * Java content class for SignedInfoType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/wsfederation/xmldsig-core-schema.xsd line 69)
 * <p>
 * <pre>
 * &lt;complexType name="SignedInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Reference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SignedInfoType {


    /**
     * Gets the value of the signatureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodElement}
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodType}
     */
    com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodType getSignatureMethod();

    /**
     * Sets the value of the signatureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodElement}
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodType}
     */
    void setSignatureMethod(com.sun.identity.wsfederation.jaxb.xmlsig.SignatureMethodType value);

    /**
     * Gets the value of the Reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.wsfederation.jaxb.xmlsig.ReferenceType}
     * {@link com.sun.identity.wsfederation.jaxb.xmlsig.ReferenceElement}
     * 
     */
    java.util.List getReference();

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodType}
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodElement}
     */
    com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodType getCanonicalizationMethod();

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodType}
     *     {@link com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodElement}
     */
    void setCanonicalizationMethod(com.sun.identity.wsfederation.jaxb.xmlsig.CanonicalizationMethodType value);

}
