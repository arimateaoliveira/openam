//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class AuthenticatorTransportProtocolElementImpl
    extends com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.ac.AuthenticatorTransportProtocolElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.AuthenticatorTransportProtocolElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:ac:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AuthenticatorTransportProtocol";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:ac:2003-08", "AuthenticatorTransportProtocol");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.AuthenticatorTransportProtocolElement.class);
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
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000\u001dcom.sun.msv.g"
+"rammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\npps"
+"q\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000"
+"\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsr\u0000 com.sun.msv.grammar."
+"OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005va"
+"luexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003exp"
+"q\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u001fpsr\u00002com.sun.msv.grammar.Ex"
+"pression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u001e\u0001q\u0000~\u0000#sr\u0000"
+" com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv."
+"grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expres"
+"sion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000$q\u0000~\u0000)sr\u0000#com.sun"
+".msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/"
+"lang/String;L\u0000\fnamespaceURIq\u0000~\u0000+xq\u0000~\u0000&t\u00006com.sun.identity.li"
+"berty.ws.common.jaxb.ac.HTTPElementt\u0000+http://java.sun.com/ja"
+"xb/xjc/dummy-elementssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000"
+"\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00003com.sun.identity."
+"liberty.ws.common.jaxb.ac.HTTPTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u001fpsr\u0000\"com.sun.msv.datatype.xsd.QnameT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\f"
+"namespaceUriq\u0000~\u0000+L\u0000\btypeNameq\u0000~\u0000+L\u0000\nwhiteSpacet\u0000.Lcom/sun/ms"
+"v/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/20"
+"01/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceP"
+"rocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Express"
+"ion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001fpsr\u0000\u001bcom.sun.msv."
+"util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000+L\u0000\fnamespaceURIq\u0000"
+"~\u0000+xpq\u0000~\u0000Dq\u0000~\u0000Csq\u0000~\u0000*t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSch"
+"ema-instanceq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u0004HTTPt\u0000\u0016urn:liberty:ac:2003-08sq\u0000~\u0000"
+"\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00005"
+"com.sun.identity.liberty.ws.common.jaxb.ac.SSLElementq\u0000~\u0000.sq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000"
+"#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00002com.sun.identity.liberty.ws.common.jaxb."
+"ac.SSLTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u0003S"
+"SLq\u0000~\u0000Qsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000"
+"~\u0000)sq\u0000~\u0000*t\u0000Kcom.sun.identity.liberty.ws.common.jaxb.ac.Mobil"
+"eNetworkNoEncryptionElementq\u0000~\u0000.sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000Hcom.su"
+"n.identity.liberty.ws.common.jaxb.ac.MobileNetworkNoEncrypti"
+"onTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u0019Mobil"
+"eNetworkNoEncryptionq\u0000~\u0000Qsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 "
+"q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000Ncom.sun.identity.liberty.ws.co"
+"mmon.jaxb.ac.MobileNetworkRadioEncryptionElementq\u0000~\u0000.sq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000"
+"\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000Kcom.sun.identity.liberty.ws.common.jaxb.ac.Mo"
+"bileNetworkRadioEncryptionTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<"
+"q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u001cMobileNetworkRadioEncryptionq\u0000~\u0000Qsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000Qcom"
+".sun.identity.liberty.ws.common.jaxb.ac.MobileNetworkEndToEn"
+"dEncryptionElementq\u0000~\u0000.sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000"
+"~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000Ncom.sun.identit"
+"y.liberty.ws.common.jaxb.ac.MobileNetworkEndToEndEncryptionT"
+"ypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u001fMobileNe"
+"tworkEndToEndEncryptionq\u0000~\u0000Qsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000"
+"~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00006com.sun.identity.liberty.ws"
+".common.jaxb.ac.WTLSElementq\u0000~\u0000.sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq"
+"\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00003com.su"
+"n.identity.liberty.ws.common.jaxb.ac.WTLSTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq"
+"\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u0004WTLSq\u0000~\u0000Qsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\npp"
+"sq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00007com.sun.iden"
+"tity.liberty.ws.common.jaxb.ac.IPSecElementq\u0000~\u0000.sq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000"
+")sq\u0000~\u0000*t\u00004com.sun.identity.liberty.ws.common.jaxb.ac.IPSecTy"
+"peq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u0005IPSecq\u0000~\u0000"
+"Qsq\u0000~\u0000\u001bppsq\u0000~\u0000\nppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000"
+"~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u0000;com.sun.identity.liberty.ws.common.jax"
+"b.ac.ExtensionElementq\u0000~\u0000.sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\npp"
+"sq\u0000~\u0000\u001bq\u0000~\u0000\u001fpsq\u0000~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000#q\u0000~\u0000\'q\u0000~\u0000)sq\u0000~\u0000*t\u00008com.sun.iden"
+"tity.liberty.ws.common.jaxb.ac.ExtensionTypeq\u0000~\u0000.sq\u0000~\u0000\nppsq\u0000"
+"~\u0000 q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\tExtensionq\u0000~\u0000Qsq\u0000~\u0000\nppsq\u0000~\u0000"
+" q\u0000~\u0000\u001fpq\u0000~\u0000<q\u0000~\u0000Lq\u0000~\u0000)sq\u0000~\u0000*t\u0000\u001eAuthenticatorTransportProtoco"
+"lq\u0000~\u0000Qsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000"
+"\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expre"
+"ssionPool;xp\u0000\u0000\u0000B\u0001pq\u0000~\u00007q\u0000~\u0000\u00ceq\u0000~\u0000\u00d2q\u0000~\u0000\u000bq\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000\u00beq\u0000~\u0000\u0013q\u0000"
+"~\u0000\u0014q\u0000~\u0000\u00b3q\u0000~\u0000\u00a1q\u0000~\u0000\u008fq\u0000~\u0000}q\u0000~\u0000\u0015q\u0000~\u0000\u0017q\u0000~\u0000kq\u0000~\u0000Yq\u0000~\u0000\u0011q\u0000~\u00000q\u0000~\u0000\u00c7q\u0000"
+"~\u0000\rq\u0000~\u0000\u0012q\u0000~\u0000\u000eq\u0000~\u0000\u00c2q\u0000~\u0000\u00b6q\u0000~\u0000\u00aeq\u0000~\u0000\u00a4q\u0000~\u0000\u009cq\u0000~\u0000\u0092q\u0000~\u0000\u008aq\u0000~\u0000\u0080q\u0000~\u0000xq\u0000"
+"~\u0000nq\u0000~\u0000fq\u0000~\u0000\\q\u0000~\u0000Tq\u0000~\u00003q\u0000~\u0000\u001dq\u0000~\u0000\u00caq\u0000~\u0000\u00c1q\u0000~\u0000\u00b5q\u0000~\u0000\u00adq\u0000~\u0000\u00a3q\u0000~\u0000\u009bq\u0000"
+"~\u0000\u0091q\u0000~\u0000\u0089q\u0000~\u0000\u007fq\u0000~\u0000\u000fq\u0000~\u0000wq\u0000~\u0000mq\u0000~\u0000eq\u0000~\u0000[q\u0000~\u0000Sq\u0000~\u00002q\u0000~\u0000\u001aq\u0000~\u0000\u00c9q\u0000"
+"~\u0000\u0016q\u0000~\u0000\fq\u0000~\u0000\u0018q\u0000~\u0000\u00bfq\u0000~\u0000\u00baq\u0000~\u0000\u00a8q\u0000~\u0000\u0096q\u0000~\u0000\u0084q\u0000~\u0000rq\u0000~\u0000`x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("AuthenticatorTransportProtocol" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("HTTP" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("HTTP" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SSL" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SSL" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkNoEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkNoEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkRadioEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkRadioEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkEndToEndEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MobileNetworkEndToEndEncryption" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("WTLS" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("WTLS" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IPSec" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IPSec" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ac.impl.AuthenticatorTransportProtocolElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("AuthenticatorTransportProtocol" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
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
