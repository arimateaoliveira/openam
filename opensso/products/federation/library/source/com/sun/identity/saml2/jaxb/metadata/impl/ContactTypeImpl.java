//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class ContactTypeImpl implements com.sun.identity.saml2.jaxb.metadata.ContactType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.identity.saml2.jaxb.metadata.ExtensionsType _Extensions;
    protected java.lang.String _SurName;
    protected java.lang.String _GivenName;
    protected com.sun.xml.bind.util.ListImpl _TelephoneNumber;
    protected com.sun.xml.bind.util.ListImpl _EmailAddress;
    protected java.lang.String _Company;
    protected java.lang.String _ContactType;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.ContactType.class);
    }

    public com.sun.identity.saml2.jaxb.metadata.ExtensionsType getExtensions() {
        return _Extensions;
    }

    public void setExtensions(com.sun.identity.saml2.jaxb.metadata.ExtensionsType value) {
        _Extensions = value;
    }

    public java.lang.String getSurName() {
        return _SurName;
    }

    public void setSurName(java.lang.String value) {
        _SurName = value;
    }

    public java.lang.String getGivenName() {
        return _GivenName;
    }

    public void setGivenName(java.lang.String value) {
        _GivenName = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getTelephoneNumber() {
        if (_TelephoneNumber == null) {
            _TelephoneNumber = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _TelephoneNumber;
    }

    public java.util.List getTelephoneNumber() {
        return _getTelephoneNumber();
    }

    protected com.sun.xml.bind.util.ListImpl _getEmailAddress() {
        if (_EmailAddress == null) {
            _EmailAddress = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _EmailAddress;
    }

    public java.util.List getEmailAddress() {
        return _getEmailAddress();
    }

    public java.lang.String getCompany() {
        return _Company;
    }

    public void setCompany(java.lang.String value) {
        _Company = value;
    }

    public java.lang.String getContactType() {
        return _ContactType;
    }

    public void setContactType(java.lang.String value) {
        _ContactType = value;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.ContactTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx4 = 0;
        final int len4 = ((_TelephoneNumber == null)? 0 :_TelephoneNumber.size());
        int idx5 = 0;
        final int len5 = ((_EmailAddress == null)? 0 :_EmailAddress.size());
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "Extensions");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endElement();
            }
        }
        if (_Company!= null) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "Company");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _Company), "Company");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_GivenName!= null) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "GivenName");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _GivenName), "GivenName");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_SurName!= null) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "SurName");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _SurName), "SurName");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        while (idx5 != len5) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "EmailAddress");
            int idx_8 = idx5;
            try {
                idx_8 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endNamespaceDecls();
            int idx_9 = idx5;
            try {
                idx_9 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttributes();
            try {
                context.text(((java.lang.String) _EmailAddress.get(idx5 ++)), "EmailAddress");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        while (idx4 != len4) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "TelephoneNumber");
            int idx_10 = idx4;
            try {
                idx_10 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endNamespaceDecls();
            int idx_11 = idx4;
            try {
                idx_11 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttributes();
            try {
                context.text(((java.lang.String) _TelephoneNumber.get(idx4 ++)), "TelephoneNumber");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx4 = 0;
        final int len4 = ((_TelephoneNumber == null)? 0 :_TelephoneNumber.size());
        int idx5 = 0;
        final int len5 = ((_EmailAddress == null)? 0 :_EmailAddress.size());
        context.startAttribute("", "contactType");
        try {
            context.text(((java.lang.String) _ContactType), "ContactType");
        } catch (java.lang.Exception e) {
            com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            }
        }
        while (idx5 != len5) {
            try {
                idx5 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
        while (idx4 != len4) {
            try {
                idx4 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx4 = 0;
        final int len4 = ((_TelephoneNumber == null)? 0 :_TelephoneNumber.size());
        int idx5 = 0;
        final int len5 = ((_EmailAddress == null)? 0 :_EmailAddress.size());
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            }
        }
        while (idx5 != len5) {
            try {
                idx5 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
        while (idx4 != len4) {
            try {
                idx4 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.ContactType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000bsr"
+"\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.gr"
+"ammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/"
+"msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~"
+"\u0000\u0003q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u000bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq"
+"\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003"
+"expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0011xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar"
+".Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u001b"
+"sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.m"
+"sv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Exp"
+"ression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001cq\u0000~\u0000!sr\u0000#com."
+"sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Lja"
+"va/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u00006com.sun.identity"
+".saml2.jaxb.metadata.ExtensionsElementt\u0000+http://java.sun.com"
+"/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0010q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010pp\u0000sq\u0000~\u0000\u000b"
+"ppsq\u0000~\u0000\u0015q\u0000~\u0000\u000fpsq\u0000~\u0000\u0018q\u0000~\u0000\u000fpq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u00003com.sun.id"
+"entity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000&sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg"
+"/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/"
+"msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Qna"
+"meType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\fnamespaceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSpacet\u0000.Lcom/sun"
+"/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org"
+"/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expr"
+"ession$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.m"
+"sv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000#xpq\u0000~\u0000<q\u0000~\u0000;sq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\nExtensionst\u0000$urn:oasis:names:tc"
+":SAML:2.0:metadataq\u0000~\u0000!sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0010q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u00001q\u0000"
+"~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risA"
+"lwaysValidxq\u0000~\u00006q\u0000~\u0000;t\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000>\u0001q\u0000~\u0000Asq\u0000~\u0000Bq\u0000~\u0000"
+"Pq\u0000~\u0000;sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0018q\u0000~\u0000\u000fpq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0007Companyq\u0000~"
+"\u0000Iq\u0000~\u0000!sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0010q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000Msq\u0000~\u0000\u000bppsq\u0000~\u0000\u0018q\u0000~\u0000\u000f"
+"pq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\tGivenNameq\u0000~\u0000Iq\u0000~\u0000!sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0010q\u0000"
+"~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000Msq\u0000~\u0000\u000bppsq\u0000~\u0000\u0018q\u0000~\u0000\u000fpq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t"
+"\u0000\u0007SurNameq\u0000~\u0000Iq\u0000~\u0000!sq\u0000~\u0000\u000bppsq\u0000~\u0000\u0015q\u0000~\u0000\u000fpsq\u0000~\u0000\u0010q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000pp"
+"sq\u0000~\u00001q\u0000~\u0000\u000fpsr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u00006q\u0000~\u0000;t\u0000\u0006anyURIq\u0000~\u0000?q\u0000~\u0000Asq\u0000~\u0000Bq\u0000~\u0000mq\u0000~\u0000;sq\u0000~\u0000\u000bppsq\u0000~"
+"\u0000\u0018q\u0000~\u0000\u000fpq\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\fEmailAddressq\u0000~\u0000Iq\u0000~\u0000!sq\u0000~\u0000\u000b"
+"ppsq\u0000~\u0000\u0015q\u0000~\u0000\u000fpsq\u0000~\u0000\u0010q\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppq\u0000~\u0000Msq\u0000~\u0000\u000bppsq\u0000~\u0000\u0018q\u0000~\u0000\u000fp"
+"q\u0000~\u00004q\u0000~\u0000Dq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u000fTelephoneNumberq\u0000~\u0000Iq\u0000~\u0000!sq\u0000~\u0000\u0018ppsq\u0000"
+"~\u00001ppsr\u0000)com.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.Dat"
+"aTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.data"
+"type.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needV"
+"alueCheckFlagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatat"
+"ypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concrete"
+"Type;L\u0000\tfacetNameq\u0000~\u0000#xq\u0000~\u00008q\u0000~\u0000It\u0000\u000fContactTypeTypeq\u0000~\u0000R\u0000\u0000q\u0000"
+"~\u0000Oq\u0000~\u0000Ot\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000"
+"\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0005t\u0000\u0007billingt\u0000\u0005othert\u0000\u0007supportt\u0000\u000eadministrativet\u0000\tte"
+"chnicalxq\u0000~\u0000Asq\u0000~\u0000Bq\u0000~\u0000\u0084q\u0000~\u0000Isq\u0000~\u0000\"t\u0000\u000bcontactTypet\u0000\u0000sr\u0000\"com."
+"sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/"
+"sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv."
+"grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstrea"
+"mVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000"
+"\u0000\u001f\u0001pq\u0000~\u0000tq\u0000~\u0000\nq\u0000~\u0000\rq\u0000~\u0000/q\u0000~\u0000Tq\u0000~\u0000[q\u0000~\u0000bq\u0000~\u0000oq\u0000~\u0000wq\u0000~\u0000fq\u0000~\u0000Lq"
+"\u0000~\u0000Zq\u0000~\u0000aq\u0000~\u0000vq\u0000~\u0000\u0005q\u0000~\u0000sq\u0000~\u0000\tq\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000~\u0000Jq\u0000~\u0000Xq\u0000~\u0000_q\u0000~\u0000\u0007q"
+"\u0000~\u0000iq\u0000~\u0000\fq\u0000~\u0000(q\u0000~\u0000gq\u0000~\u0000\u0017q\u0000~\u0000+q\u0000~\u0000\u0014q\u0000~\u0000*x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----------------------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.ContactTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        if (("Company" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  3 :
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _Extensions = ((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsElementImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        if (("EmailAddress" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        state = 18;
                        continue outer;
                    case  21 :
                        if (("TelephoneNumber" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 19;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  18 :
                        if (("EmailAddress" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 16;
                            return ;
                        }
                        if (("TelephoneNumber" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 19;
                            return ;
                        }
                        state = 21;
                        continue outer;
                    case  4 :
                        if (!(("" == ___uri)||("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri))) {
                            _Extensions = ((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "contactType");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        if (("SurName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                    case  9 :
                        if (("GivenName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _ContactType = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        state = 9;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  14 :
                        if (("SurName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 15;
                            return ;
                        }
                        break;
                    case  20 :
                        if (("TelephoneNumber" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 21;
                            return ;
                        }
                        break;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  5 :
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "contactType");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  11 :
                        if (("GivenName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  8 :
                        if (("Company" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  17 :
                        if (("EmailAddress" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 18;
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        state = 9;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  0 :
                        if (("contactType" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  9 :
                        state = 12;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        state = 9;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  15 :
                        state = 18;
                        continue outer;
                    case  21 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  18 :
                        state = 21;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "contactType");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  2 :
                        if (("contactType" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  9 :
                        state = 12;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  6 :
                            state = 9;
                            continue outer;
                        case  19 :
                            state = 20;
                            eatText2(value);
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  15 :
                            state = 18;
                            continue outer;
                        case  21 :
                            revertToParentFromText(value);
                            return ;
                        case  18 :
                            state = 21;
                            continue outer;
                        case  13 :
                            state = 14;
                            eatText3(value);
                            return ;
                        case  10 :
                            state = 11;
                            eatText4(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "contactType");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  12 :
                            state = 15;
                            continue outer;
                        case  16 :
                            state = 17;
                            eatText5(value);
                            return ;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  7 :
                            state = 8;
                            eatText6(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _getTelephoneNumber().add(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _SurName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _GivenName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText5(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _getEmailAddress().add(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText6(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Company = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
