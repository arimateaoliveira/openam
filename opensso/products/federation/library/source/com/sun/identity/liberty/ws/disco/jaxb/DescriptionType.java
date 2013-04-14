//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.disco.jaxb;


/**
 * Java content class for DescriptionType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-disco-svc.xsd line 78)
 * <p>
 * <pre>
 * &lt;complexType name="DescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityMechID" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="CredentialRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{urn:liberty:disco:2003-08}WsdlRef"/>
 *           &lt;group ref="{urn:liberty:disco:2003-08}BriefSoapHttpDescription"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface DescriptionType {


    /**
     * Gets the value of the SecurityMechID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the SecurityMechID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityMechID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getSecurityMechID();

    /**
     * Gets the value of the serviceNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName}
     */
    javax.xml.namespace.QName getServiceNameRef();

    /**
     * Sets the value of the serviceNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName}
     */
    void setServiceNameRef(javax.xml.namespace.QName value);

    /**
     * Gets the value of the soapAction property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSoapAction();

    /**
     * Sets the value of the soapAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSoapAction(java.lang.String value);

    /**
     * Gets the value of the CredentialRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the CredentialRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object}
     * 
     */
    java.util.List getCredentialRef();

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
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getEndpoint();

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setEndpoint(java.lang.String value);

    /**
     * Gets the value of the wsdlURI property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getWsdlURI();

    /**
     * Sets the value of the wsdlURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setWsdlURI(java.lang.String value);

}
