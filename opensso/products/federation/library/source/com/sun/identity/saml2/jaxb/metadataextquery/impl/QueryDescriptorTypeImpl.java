//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.metadataextquery.impl;

public class QueryDescriptorTypeImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadataextquery.QueryDescriptorType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _NameIDFormat;
    protected boolean has_WantAssertionsSigned;
    protected boolean _WantAssertionsSigned;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadataextquery.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadataextquery.QueryDescriptorType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getNameIDFormat() {
        if (_NameIDFormat == null) {
            _NameIDFormat = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _NameIDFormat;
    }

    public java.util.List getNameIDFormat() {
        return _getNameIDFormat();
    }

    public boolean isWantAssertionsSigned() {
        return _WantAssertionsSigned;
    }

    public void setWantAssertionsSigned(boolean value) {
        _WantAssertionsSigned = value;
        has_WantAssertionsSigned = true;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameIDFormat == null)? 0 :_NameIDFormat.size());
        super.serializeBody(context);
        while (idx1 != len1) {
            context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "NameIDFormat");
            int idx_0 = idx1;
            try {
                idx_0 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endNamespaceDecls();
            int idx_1 = idx1;
            try {
                idx_1 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttributes();
            try {
                context.text(((java.lang.String) _NameIDFormat.get(idx1 ++)), "NameIDFormat");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameIDFormat == null)? 0 :_NameIDFormat.size());
        if (has_WantAssertionsSigned) {
            context.startAttribute("", "WantAssertionsSigned");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _WantAssertionsSigned)), "WantAssertionsSigned");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
        while (idx1 != len1) {
            try {
                idx1 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_NameIDFormat == null)? 0 :_NameIDFormat.size());
        super.serializeURIs(context);
        while (idx1 != len1) {
            try {
                idx1 += 1;
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadataextquery.QueryDescriptorType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.gram"
+"mar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0010sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPa"
+"ttern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClas"
+"s;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUnde"
+"claredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0010ppsr\u0000"
+" com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv."
+"grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000 com.su"
+"n.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClass"
+"q\u0000~\u0000\u0016xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStrin"
+"gExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001q\u0000~\u0000 sr\u0000 com.sun.msv.gram"
+"mar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000!q\u0000~\u0000&sr\u0000#com.sun.msv.grammar.Simp"
+"leNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fna"
+"mespaceURIq\u0000~\u0000(xq\u0000~\u0000#t\u00003com.sun.identity.saml2.jaxb.xmlsig.S"
+"ignatureElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~"
+"\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00000com.sun.identity.saml2.jaxb.xmlsi"
+"g.SignatureTypeq\u0000~\u0000+sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.gram"
+"mar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype"
+";L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003"
+"ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.s"
+"un.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun."
+"msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.data"
+"type.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000(L\u0000\btyp"
+"eNameq\u0000~\u0000(L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpa"
+"ceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0"
+"\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000~\u0000Aq\u0000~\u0000@sq\u0000~\u0000\'t\u0000"
+"\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000&sq\u0000~\u0000\'"
+"t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u0000&sq\u0000~\u0000\u0010"
+"ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq"
+"\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00006com.sun.identity.saml2.jaxb.metadata."
+"ExtensionsElementq\u0000~\u0000+sq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015pp\u0000sq\u0000~\u0000\u0010pp"
+"sq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00003com.sun.iden"
+"tity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000+sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000"
+"~\u0000\u0014pq\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\nExtensionst\u0000$urn:oasis:names:tc:"
+"SAML:2.0:metadataq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015"
+"q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'"
+"t\u00009com.sun.identity.saml2.jaxb.metadata.KeyDescriptorElement"
+"q\u0000~\u0000+sq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000"
+"\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00006com.sun.identity.saml2.jaxb.m"
+"etadata.KeyDescriptorTypeq\u0000~\u0000+sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u00009q\u0000~\u0000I"
+"q\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rKeyDescriptorq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000"
+"~\u0000\'t\u00008com.sun.identity.saml2.jaxb.metadata.OrganizationEleme"
+"ntq\u0000~\u0000+sq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00005com.sun.identity.saml2.jaxb"
+".metadata.OrganizationTypeq\u0000~\u0000+sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u00009q\u0000~\u0000"
+"Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\fOrganizationq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000"
+"~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q"
+"\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00009com.sun.identity.saml2.jaxb.metadata.Conta"
+"ctPersonElementq\u0000~\u0000+sq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015pp\u0000sq\u0000~\u0000\u0010ppsq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u0014psq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00000com.sun.identi"
+"ty.saml2.jaxb.metadata.ContactTypeq\u0000~\u0000+sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq"
+"\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rContactPersonq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001a"
+"q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u00006q\u0000~\u0000\u0014psr\u0000#com.sun.msv.datat"
+"ype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\u0006anyURIq\u0000~\u0000Dq\u0000~\u0000Fs"
+"q\u0000~\u0000Gq\u0000~\u0000\u00a9q\u0000~\u0000@sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u00009q\u0000~\u0000Iq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\fN"
+"ameIDFormatq\u0000~\u0000cq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014psq\u0000~\u00006ppsr\u0000\u001fcom.sun"
+".msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype."
+"xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000;q\u0000~\u0000@t\u0000\u0002IDq\u0000~\u0000D\u0000q\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00b7q\u0000"
+"~\u0000@sq\u0000~\u0000\'t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014psq\u0000~\u00006ppsr\u0000%com.su"
+"n.msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\bdura"
+"tionq\u0000~\u0000Dq\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00c1q\u0000~\u0000@sq\u0000~\u0000\'t\u0000\rcacheDurationq\u0000~\u0000\u00bbq\u0000~"
+"\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014pq\u0000~\u0000\u00a6sq\u0000~\u0000\'t\u0000\berrorURLq\u0000~\u0000\u00bbq\u0000~\u0000&sq\u0000~\u0000\u001d"
+"ppsq\u0000~\u00006ppsr\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\bitemTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000<q"
+"\u0000~\u0000ct\u0000\u000eanyURIListTypeq\u0000~\u0000Dq\u0000~\u0000\u00a8q\u0000~\u0000Fpsq\u0000~\u0000\'t\u0000\u001aprotocolSuppor"
+"tEnumerationq\u0000~\u0000\u00bbsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0014psq\u0000~\u00006ppsr\u0000%com.sun.msv"
+".datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatyp"
+"e.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\bdateTimeq\u0000~\u0000D"
+"q\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00d7q\u0000~\u0000@sq\u0000~\u0000\'t\u0000\nvalidUntilq\u0000~\u0000\u00bbq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq"
+"\u0000~\u0000\u001dq\u0000~\u0000\u0014psq\u0000~\u00006ppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;q\u0000~\u0000@t\u0000\u0007booleanq\u0000~\u0000Dq\u0000~\u0000Fsq\u0000~\u0000Gq\u0000~\u0000\u00e0q\u0000~\u0000@sq\u0000~"
+"\u0000\'t\u0000\u0014WantAssertionsSignedq\u0000~\u0000\u00bbq\u0000~\u0000&sr\u0000\"com.sun.msv.grammar.E"
+"xpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/E"
+"xpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressio"
+"nPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parent"
+"t\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000>\u0001pq\u0000~\u0000\u0006q\u0000~\u0000\u008eq\u0000~"
+"\u0000eq\u0000~\u0000yq\u0000~\u0000Oq\u0000~\u0000\u0011q\u0000~\u0000iq\u0000~\u0000[q\u0000~\u0000Sq\u0000~\u00000q\u0000~\u0000\u001cq\u0000~\u0000\u009aq\u0000~\u0000\u000fq\u0000~\u0000\u0092q\u0000~"
+"\u0000\u0085q\u0000~\u0000}q\u0000~\u0000qq\u0000~\u0000\rq\u0000~\u0000\tq\u0000~\u0000\bq\u0000~\u0000\u00a5q\u0000~\u0000\u000eq\u0000~\u0000\u00c5q\u0000~\u0000\u0005q\u0000~\u0000Zq\u0000~\u0000Rq\u0000~"
+"\u0000/q\u0000~\u0000\u0019q\u0000~\u0000\u0099q\u0000~\u0000\u0091q\u0000~\u0000\u0084q\u0000~\u0000|q\u0000~\u0000pq\u0000~\u0000hq\u0000~\u0000\u00abq\u0000~\u0000\u009eq\u0000~\u0000\u0089q\u0000~\u0000uq\u0000~"
+"\u0000\u00a2q\u0000~\u0000_q\u0000~\u00004q\u0000~\u0000\u00d1q\u0000~\u0000\u00dbq\u0000~\u0000\u00afq\u0000~\u0000\u008dq\u0000~\u0000dq\u0000~\u0000\u00bcq\u0000~\u0000\nq\u0000~\u0000\u00a3q\u0000~\u0000\u0007q\u0000~"
+"\u0000\fq\u0000~\u0000\u008fq\u0000~\u0000zq\u0000~\u0000fq\u0000~\u0000Pq\u0000~\u0000\u0012q\u0000~\u0000\u0097q\u0000~\u0000\u0082q\u0000~\u0000nq\u0000~\u0000Xq\u0000~\u0000-q\u0000~\u0000\u000bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        if (("NameIDFormat" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  7 :
                        if (("NameIDFormat" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _WantAssertionsSigned = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_WantAssertionsSigned = true;
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
                    case  0 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        if (("NameIDFormat" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
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
                        if (("WantAssertionsSigned" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  3 :
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.RoleDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
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
                    case  0 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  3 :
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("WantAssertionsSigned" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
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
                            attIdx = context.getAttribute("", "WantAssertionsSigned");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  3 :
                            attIdx = context.getAttribute("", "ID");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "cacheDuration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "errorURL");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "protocolSupportEnumeration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  5 :
                            state = 6;
                            eatText2(value);
                            return ;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
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
                _getNameIDFormat().add(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
