//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.soapbinding.jaxb11.impl;

public class CredentialsContextTypeImpl implements com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.xml.bind.marshaller.IdentifiableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _SecurityMechID;
    protected boolean has_MustUnderstand;
    protected boolean _MustUnderstand;
    protected java.lang.String _Actor;
    protected com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType _RequestAuthnContext;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getSecurityMechID() {
        if (_SecurityMechID == null) {
            _SecurityMechID = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _SecurityMechID;
    }

    public java.util.List getSecurityMechID() {
        return _getSecurityMechID();
    }

    public boolean isMustUnderstand() {
        return _MustUnderstand;
    }

    public void setMustUnderstand(boolean value) {
        _MustUnderstand = value;
        has_MustUnderstand = true;
    }

    public java.lang.String getActor() {
        return _Actor;
    }

    public void setActor(java.lang.String value) {
        _Actor = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType getRequestAuthnContext() {
        return _RequestAuthnContext;
    }

    public void setRequestAuthnContext(com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType value) {
        _RequestAuthnContext = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_SecurityMechID == null)? 0 :_SecurityMechID.size());
        if (_RequestAuthnContext!= null) {
            if (_RequestAuthnContext instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
            } else {
                context.startElement("urn:liberty:iff:2003-08", "RequestAuthnContext");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            context.startElement("urn:liberty:sb:2004-04", "SecurityMechID");
            int idx_2 = idx1;
            try {
                idx_2 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endNamespaceDecls();
            int idx_3 = idx1;
            try {
                idx_3 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttributes();
            try {
                context.text(((java.lang.String) _SecurityMechID.get(idx1 ++)), "SecurityMechID");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_SecurityMechID == null)? 0 :_SecurityMechID.size());
        if (_Id!= null) {
            context.startAttribute("", "id");
            try {
                context.text(context.onID(this, ((java.lang.String) _Id)), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Actor!= null) {
            context.startAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
            try {
                context.text(((java.lang.String) _Actor), "Actor");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (has_MustUnderstand) {
            context.startAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _MustUnderstand)), "MustUnderstand");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_RequestAuthnContext!= null) {
            if (_RequestAuthnContext instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
            }
        }
        while (idx1 != len1) {
            try {
                idx1 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_SecurityMechID == null)? 0 :_SecurityMechID.size());
        if (_Actor!= null) {
            context.getNamespaceContext().declareNamespace("http://schemas.xmlsoap.org/soap/envelope/", null, true);
        }
        if (has_MustUnderstand) {
            context.getNamespaceContext().declareNamespace("http://schemas.xmlsoap.org/soap/envelope/", null, true);
        }
        if (_RequestAuthnContext!= null) {
            if (_RequestAuthnContext instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _RequestAuthnContext), "RequestAuthnContext");
            }
        }
        while (idx1 != len1) {
            try {
                idx1 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public java.lang.String ____jaxb____getId() {
        return ((java.lang.String) _Id);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv."
+"grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\tsr\u0000\u0011java.lang.Bool"
+"ean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.Eleme"
+"ntPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Name"
+"Class;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignore"
+"UndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\rp\u0000sq\u0000~\u0000\tp"
+"psr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun."
+"msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u0000 co"
+"m.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameC"
+"lassq\u0000~\u0000\u000fxq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u00002com.sun.msv.grammar.Expression$AnyS"
+"tringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv."
+"grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar."
+"SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L"
+"\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000Ecom.sun.identity.liberty.ws.comm"
+"on.jaxb.ps.RequestAuthnContextElementt\u0000+http://java.sun.com/"
+"jaxb/xjc/dummy-elementssq\u0000~\u0000\u000eq\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000epp\u0000sq\u0000~\u0000\tp"
+"psq\u0000~\u0000\u0013q\u0000~\u0000\rpsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000Bcom.sun.ide"
+"ntity.liberty.ws.common.jaxb.ps.RequestAuthnContextTypeq\u0000~\u0000$"
+"sq\u0000~\u0000\tppsq\u0000~\u0000\u0016q\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u0000\"com.sun.ms"
+"v.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatat"
+"ypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhi"
+"teSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000"
+" http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q"
+"\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq"
+"\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u0000:q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://w"
+"ww.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0013RequestAuthnC"
+"ontextt\u0000\u0017urn:liberty:iff:2003-08q\u0000~\u0000\u001fsq\u0000~\u0000\tppsq\u0000~\u0000\u0013q\u0000~\u0000\rpsq\u0000"
+"~\u0000\u000eq\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000/q\u0000~\u0000\rpsr\u0000#com.sun.msv.datatype.xsd.A"
+"nyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00004q\u0000~\u00009t\u0000\u0006anyURIq\u0000~\u0000=q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000"
+"Oq\u0000~\u00009sq\u0000~\u0000\tppsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u00002q\u0000~\u0000Bq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u000eSecurityMe"
+"chIDt\u0000\u0016urn:liberty:sb:2004-04q\u0000~\u0000\u001fsq\u0000~\u0000\tppsq\u0000~\u0000\u0016q\u0000~\u0000\rpsq\u0000~\u0000/"
+"ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun."
+"msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.dataty"
+"pe.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.Stri"
+"ngType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00004q\u0000~\u00009t\u0000\u0002IDq\u0000~\u0000=\u0000q\u0000~\u0000?"
+"sq\u0000~\u0000@q\u0000~\u0000^q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0002idt\u0000\u0000q\u0000~\u0000\u001fsq\u0000~\u0000\tppsq\u0000~\u0000\u0016q\u0000~\u0000\rpq\u0000~\u0000L"
+"sq\u0000~\u0000 t\u0000\u0005actort\u0000)http://schemas.xmlsoap.org/soap/envelope/q\u0000"
+"~\u0000\u001fsq\u0000~\u0000\tppsq\u0000~\u0000\u0016q\u0000~\u0000\rpsq\u0000~\u0000/ppsr\u0000%com.sun.msv.datatype.xsd."
+"PatternFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001[\u0000\bpatternst\u0000\u0013[Ljava/lang/String;xr\u0000;"
+"com.sun.msv.datatype.xsd.DataTypeWithLexicalConstraintFacetT"
+"\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lco"
+"m/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom"
+"/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u00006q\u0000"
+"~\u0000gpq\u0000~\u0000=\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u00004q\u0000~\u00009t\u0000\u0007booleanq\u0000~\u0000=q\u0000~\u0000st\u0000\u0007patternur\u0000\u0013[Ljava.lang.S"
+"tring;\u00ad\u00d2V\u00e7\u00e9\u001d{G\u0002\u0000\u0000xp\u0000\u0000\u0000\u0001t\u0000\u00030|1q\u0000~\u0000?sq\u0000~\u0000@t\u0000\u000fboolean-derivedq\u0000"
+"~\u0000gsq\u0000~\u0000 t\u0000\u000emustUnderstandq\u0000~\u0000gq\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar."
+"ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/"
+"ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressi"
+"onPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006paren"
+"tt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0013\u0001pq\u0000~\u0000&q\u0000~\u0000\u0012q\u0000"
+"~\u0000(q\u0000~\u0000-q\u0000~\u0000Qq\u0000~\u0000\u0015q\u0000~\u0000)q\u0000~\u0000\u000bq\u0000~\u0000hq\u0000~\u0000Kq\u0000~\u0000\u0007q\u0000~\u0000Vq\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000"
+"~\u0000Hq\u0000~\u0000\nq\u0000~\u0000Iq\u0000~\u0000cq\u0000~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  12 :
                        if (("SecurityMechID" == ___local)&&("urn:liberty:sb:2004-04" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        state = 15;
                        continue outer;
                    case  10 :
                        if (("AuthnContextClassRef" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            _RequestAuthnContext = ((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextTypeImpl.class), 11, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AuthnContextStatementRef" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            _RequestAuthnContext = ((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextTypeImpl.class), 11, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        if (("SecurityMechID" == ___local)&&("urn:liberty:sb:2004-04" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 13;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (("RequestAuthnContext" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            _RequestAuthnContext = ((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ps.impl.RequestAuthnContextElementImpl.class), 12, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("RequestAuthnContext" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 10;
                            return ;
                        }
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
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
                _Id = context.addToIdTable(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Actor = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _MustUnderstand = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_MustUnderstand = true;
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
                    case  11 :
                        if (("RequestAuthnContext" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  14 :
                        if (("SecurityMechID" == ___local)&&("urn:liberty:sb:2004-04" == ___uri)) {
                            context.popAttributes();
                            state = 15;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
                        continue outer;
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
                    case  0 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  3 :
                        if (("actor" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  6 :
                        if (("mustUnderstand" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        state = 9;
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
                    case  2 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("actor" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  12 :
                        state = 15;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  15 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 12;
                        continue outer;
                    case  8 :
                        if (("mustUnderstand" == ___local)&&("http://schemas.xmlsoap.org/soap/envelope/" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        state = 9;
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
                        case  0 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  12 :
                            state = 15;
                            continue outer;
                        case  7 :
                            state = 8;
                            eatText3(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "actor");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText2(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  15 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 12;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  4 :
                            state = 5;
                            eatText2(value);
                            return ;
                        case  6 :
                            attIdx = context.getAttribute("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText3(v);
                                continue outer;
                            }
                            state = 9;
                            continue outer;
                        case  13 :
                            state = 14;
                            eatText4(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText4(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _getSecurityMechID().add(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}