//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.common.jaxb.assertion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(61, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.common.jaxb.assertion.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.assertion.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionsType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionsTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ConfirmationMethodElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConfirmationMethodElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.DoNotCacheConditionType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.DoNotCacheConditionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ActionElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.StatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.StatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeStatementType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.DoNotCacheConditionElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.DoNotCacheConditionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementAbstractType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeValueElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeValueElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeDesignatorType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeDesignatorTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceRestrictionConditionType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceRestrictionConditionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorityBindingTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceRestrictionConditionElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceRestrictionConditionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorityBindingElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionAbstractType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionAbstractTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionsElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionsElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectLocalityTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.ActionType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectLocalityElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeDesignatorElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeDesignatorElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationDataElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationDataElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.StatementAbstractType.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.StatementAbstractTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionIDReferenceElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeStatementElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Assertion"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AuthorityBinding"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "NameIdentifier"), (com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Evidence"), (com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AuthorizationDecisionStatement"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AudienceRestrictionCondition"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceRestrictionConditionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AssertionIDReference"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionIDReferenceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AttributeDesignator"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeDesignatorElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Subject"), (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectLocality"), (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Advice"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Action"), (com.sun.identity.liberty.ws.common.jaxb.assertion.ActionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Audience"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Attribute"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AuthenticationStatement"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AttributeStatement"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "ConfirmationMethod"), (com.sun.identity.liberty.ws.common.jaxb.assertion.ConfirmationMethodElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Conditions"), (com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionsElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Condition"), (com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectConfirmationData"), (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationDataElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectStatement"), (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "Statement"), (com.sun.identity.liberty.ws.common.jaxb.assertion.StatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "DoNotCacheCondition"), (com.sun.identity.liberty.ws.common.jaxb.assertion.DoNotCacheConditionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectConfirmation"), (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:1.0:assertion", "AttributeValue"), (com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeValueElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.common.jaxb.assertion
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ConditionsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionsType createConditionsType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionsTypeImpl();
    }

    /**
     * Create an instance of SubjectType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType createSubjectType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl();
    }

    /**
     * Create an instance of ConfirmationMethodElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConfirmationMethodElement createConfirmationMethodElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConfirmationMethodElementImpl();
    }

    /**
     * Create an instance of ConfirmationMethodElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConfirmationMethodElement createConfirmationMethodElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConfirmationMethodElementImpl(value);
    }

    /**
     * Create an instance of DoNotCacheConditionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.DoNotCacheConditionType createDoNotCacheConditionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.DoNotCacheConditionTypeImpl();
    }

    /**
     * Create an instance of AssertionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionType createAssertionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionTypeImpl();
    }

    /**
     * Create an instance of AuthorizationDecisionStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementElement createAuthorizationDecisionStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementElementImpl();
    }

    /**
     * Create an instance of ActionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ActionElement createActionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl();
    }

    /**
     * Create an instance of StatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.StatementElement createStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.StatementElementImpl();
    }

    /**
     * Create an instance of SubjectStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementElement createSubjectStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementElementImpl();
    }

    /**
     * Create an instance of AttributeStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeStatementType createAttributeStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeStatementTypeImpl();
    }

    /**
     * Create an instance of AttributeElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeElement createAttributeElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeElementImpl();
    }

    /**
     * Create an instance of DoNotCacheConditionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.DoNotCacheConditionElement createDoNotCacheConditionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.DoNotCacheConditionElementImpl();
    }

    /**
     * Create an instance of SubjectStatementAbstractType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectStatementAbstractType createSubjectStatementAbstractType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl();
    }

    /**
     * Create an instance of AttributeValueElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeValueElement createAttributeValueElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeValueElementImpl();
    }

    /**
     * Create an instance of AttributeDesignatorType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeDesignatorType createAttributeDesignatorType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeDesignatorTypeImpl();
    }

    /**
     * Create an instance of AudienceRestrictionConditionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceRestrictionConditionType createAudienceRestrictionConditionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceRestrictionConditionTypeImpl();
    }

    /**
     * Create an instance of EvidenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType createEvidenceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl();
    }

    /**
     * Create an instance of AuthorityBindingType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingType createAuthorityBindingType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorityBindingTypeImpl();
    }

    /**
     * Create an instance of AudienceRestrictionConditionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceRestrictionConditionElement createAudienceRestrictionConditionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceRestrictionConditionElementImpl();
    }

    /**
     * Create an instance of AuthorityBindingElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorityBindingElement createAuthorityBindingElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorityBindingElementImpl();
    }

    /**
     * Create an instance of AttributeType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeType createAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeTypeImpl();
    }

    /**
     * Create an instance of ConditionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionElement createConditionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionElementImpl();
    }

    /**
     * Create an instance of NameIdentifierType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType createNameIdentifierType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl();
    }

    /**
     * Create an instance of SubjectElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectElement createSubjectElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectElementImpl();
    }

    /**
     * Create an instance of NameIdentifierElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierElement createNameIdentifierElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierElementImpl();
    }

    /**
     * Create an instance of ConditionAbstractType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionAbstractType createConditionAbstractType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionAbstractTypeImpl();
    }

    /**
     * Create an instance of AdviceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceElement createAdviceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceElementImpl();
    }

    /**
     * Create an instance of EvidenceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceElement createEvidenceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl();
    }

    /**
     * Create an instance of ConditionsElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ConditionsElement createConditionsElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ConditionsElementImpl();
    }

    /**
     * Create an instance of AuthenticationStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement createAuthenticationStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementElementImpl();
    }

    /**
     * Create an instance of SubjectLocalityType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityType createSubjectLocalityType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectLocalityTypeImpl();
    }

    /**
     * Create an instance of ActionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.ActionType createActionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl();
    }

    /**
     * Create an instance of SubjectConfirmationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationElement createSubjectConfirmationElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl();
    }

    /**
     * Create an instance of SubjectConfirmationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationType createSubjectConfirmationType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl();
    }

    /**
     * Create an instance of AuthorizationDecisionStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthorizationDecisionStatementType createAuthorizationDecisionStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthorizationDecisionStatementTypeImpl();
    }

    /**
     * Create an instance of AuthenticationStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementType createAuthenticationStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementTypeImpl();
    }

    /**
     * Create an instance of SubjectLocalityElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectLocalityElement createSubjectLocalityElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectLocalityElementImpl();
    }

    /**
     * Create an instance of AdviceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceType createAdviceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceTypeImpl();
    }

    /**
     * Create an instance of AudienceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceElement createAudienceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceElementImpl();
    }

    /**
     * Create an instance of AudienceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AudienceElement createAudienceElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AudienceElementImpl(value);
    }

    /**
     * Create an instance of AttributeDesignatorElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeDesignatorElement createAttributeDesignatorElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeDesignatorElementImpl();
    }

    /**
     * Create an instance of SubjectConfirmationDataElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationDataElement createSubjectConfirmationDataElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationDataElementImpl();
    }

    /**
     * Create an instance of StatementAbstractType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.StatementAbstractType createStatementAbstractType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.StatementAbstractTypeImpl();
    }

    /**
     * Create an instance of AssertionIDReferenceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionIDReferenceElement createAssertionIDReferenceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl();
    }

    /**
     * Create an instance of AssertionIDReferenceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionIDReferenceElement createAssertionIDReferenceElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl(value);
    }

    /**
     * Create an instance of AssertionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AssertionElement createAssertionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl();
    }

    /**
     * Create an instance of AttributeStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.assertion.AttributeStatementElement createAttributeStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AttributeStatementElementImpl();
    }

}
