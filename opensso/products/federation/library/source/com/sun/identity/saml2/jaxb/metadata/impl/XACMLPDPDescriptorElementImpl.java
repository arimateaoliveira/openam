//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class XACMLPDPDescriptorElementImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:metadata";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "XACMLPDPDescriptor";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "XACMLPDPDescriptor");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.XACMLPDPDescriptorElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0014sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq"
+"\u0000~\u0000\u0014ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom"
+".sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0018ps"
+"r\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\t"
+"nameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u00002com.sun.msv.grammar.Expression"
+"$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0017\u0001q\u0000~\u0000!sr\u0000 com.sun"
+".msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar."
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Eps"
+"ilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\"q\u0000~\u0000\'sr\u0000#com.sun.msv.gra"
+"mmar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Str"
+"ing;L\u0000\fnamespaceURIq\u0000~\u0000)xq\u0000~\u0000$t\u00003com.sun.identity.saml2.jaxb"
+".xmlsig.SignatureElementt\u0000+http://java.sun.com/jaxb/xjc/dumm"
+"y-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018p"
+"sq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00000com.sun.identity.saml2.j"
+"axb.xmlsig.SignatureTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018psr\u0000\u001bcom.sun"
+".msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype"
+"/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPa"
+"ir;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun"
+".msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000"
+"~\u0000)L\u0000\btypeNameq\u0000~\u0000)L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
+"/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
+"\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Colla"
+"pse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u0000\u001bcom.sun.msv.util.StringPai"
+"r\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000)L\u0000\fnamespaceURIq\u0000~\u0000)xpq\u0000~\u0000Bq\u0000~\u0000"
+"Asq\u0000~\u0000(t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000"
+"~\u0000\'sq\u0000~\u0000(t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000"
+"~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~"
+"\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00006com.sun.identity.saml2.jaxb."
+"metadata.ExtensionsElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00003com"
+".sun.identity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000,sq\u0000~\u0000\u0014p"
+"psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\nExtensionst\u0000$urn:oasis:"
+"names:tc:SAML:2.0:metadataq\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u0014q\u0000~"
+"\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000"
+"~\u0000\'sq\u0000~\u0000(t\u00009com.sun.identity.saml2.jaxb.metadata.KeyDescript"
+"orElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00006com.sun.identity.sam"
+"l2.jaxb.metadata.KeyDescriptorTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq"
+"\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\rKeyDescriptorq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000"
+"%q\u0000~\u0000\'sq\u0000~\u0000(t\u00008com.sun.identity.saml2.jaxb.metadata.Organiza"
+"tionElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00005com.sun.identity.s"
+"aml2.jaxb.metadata.OrganizationTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018p"
+"q\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\fOrganizationq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001b"
+"q\u0000~\u0000\u0018psq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~"
+"\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00009com.sun.identity.saml2.jaxb.metad"
+"ata.ContactPersonElementq\u0000~\u0000,sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000s"
+"q\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00000com.s"
+"un.identity.saml2.jaxb.metadata.ContactTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~"
+"\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\rContactPersonq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000"
+"\u001bppsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~"
+"\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u0000=com.sun.identity.saml2.jaxb.metadata.XACMLAu"
+"thzServiceElementq\u0000~\u0000,sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0014ppsq\u0000~"
+"\u0000\u001bq\u0000~\u0000\u0018psq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00001com.sun.identity"
+".saml2.jaxb.metadata.EndpointTypeq\u0000~\u0000,sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000"
+"~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\u0011XACMLAuthzServiceq\u0000~\u0000dsq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000"
+"~\u0000\u0018psq\u0000~\u00007ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000#com.sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun."
+"msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatyp"
+"e.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000<q\u0000~\u0000At\u0000\u0002IDq"
+"\u0000~\u0000E\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00bfq\u0000~\u0000Asq\u0000~\u0000(t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq"
+"\u0000~\u0000\u0018psq\u0000~\u00007ppsr\u0000%com.sun.msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\bdurationq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00c9q\u0000~\u0000Asq\u0000~\u0000(t"
+"\u0000\rcacheDurationq\u0000~\u0000\u00c3q\u0000~\u0000\'sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018psq\u0000~\u00007q\u0000~\u0000\u0018psr\u0000"
+"#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000"
+"\u0006anyURIq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00d2q\u0000~\u0000Asq\u0000~\u0000(t\u0000\berrorURLq\u0000~\u0000\u00c3q\u0000~\u0000\'"
+"sq\u0000~\u0000\u001eppsq\u0000~\u00007ppsr\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bitemTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;x"
+"q\u0000~\u0000=q\u0000~\u0000dt\u0000\u000eanyURIListTypeq\u0000~\u0000Eq\u0000~\u0000\u00d1q\u0000~\u0000Gpsq\u0000~\u0000(t\u0000\u001aprotocol"
+"SupportEnumerationq\u0000~\u0000\u00c3sq\u0000~\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018psq\u0000~\u00007ppsr\u0000%com.s"
+"un.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.d"
+"atatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\bdateTim"
+"eq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00e4q\u0000~\u0000Asq\u0000~\u0000(t\u0000\nvalidUntilq\u0000~\u0000\u00c3q\u0000~\u0000\'sq\u0000~"
+"\u0000\u0014ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0018pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\u0012XACMLPDPDescriptorq\u0000"
+"~\u0000dsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTa"
+"blet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-c"
+"om.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005co"
+"untB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expressi"
+"onPool;xp\u0000\u0000\u0000B\u0001pq\u0000~\u0000\u00a3q\u0000~\u0000\u008fq\u0000~\u0000fq\u0000~\u0000zq\u0000~\u0000Pq\u0000~\u0000\u0015q\u0000~\u0000\u00cdq\u0000~\u0000jq\u0000~\u0000\\"
+"q\u0000~\u0000Tq\u0000~\u00001q\u0000~\u0000\u001dq\u0000~\u0000\u00afq\u0000~\u0000\u0013q\u0000~\u0000\u00a7q\u0000~\u0000\u009bq\u0000~\u0000\u0093q\u0000~\u0000\u0086q\u0000~\u0000~q\u0000~\u0000rq\u0000~\u0000\u000b"
+"q\u0000~\u0000\u0011q\u0000~\u0000\u0012q\u0000~\u0000\nq\u0000~\u0000\u00deq\u0000~\u0000[q\u0000~\u0000Sq\u0000~\u00000q\u0000~\u0000\u001aq\u0000~\u0000\u00aeq\u0000~\u0000\u00a6q\u0000~\u0000\u009aq\u0000~\u0000\u0092"
+"q\u0000~\u0000\u0085q\u0000~\u0000}q\u0000~\u0000qq\u0000~\u0000iq\u0000~\u0000\u00b7q\u0000~\u0000\u00b3q\u0000~\u0000\u009fq\u0000~\u0000\u008aq\u0000~\u0000vq\u0000~\u0000`q\u0000~\u00005q\u0000~\u0000\u00e8"
+"q\u0000~\u0000\tq\u0000~\u0000\u00c4q\u0000~\u0000\u008eq\u0000~\u0000eq\u0000~\u0000\fq\u0000~\u0000\rq\u0000~\u0000\u0010q\u0000~\u0000\u000fq\u0000~\u0000\u00a4q\u0000~\u0000\u0090q\u0000~\u0000{q\u0000~\u0000g"
+"q\u0000~\u0000Qq\u0000~\u0000\u0016q\u0000~\u0000\u00acq\u0000~\u0000\u0098q\u0000~\u0000\u0083q\u0000~\u0000oq\u0000~\u0000Yq\u0000~\u0000.q\u0000~\u0000\u000ex"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
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
                    case  0 :
                        if (("XACMLPDPDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
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
                    case  2 :
                        if (("XACMLPDPDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
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
                    case  1 :
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.XACMLPDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
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
                    case  1 :
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
                    case  3 :
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
                        case  1 :
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
