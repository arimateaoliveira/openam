//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.idpp.jaxb.impl;

public class AddressCardElementImpl
    extends com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl
    implements com.sun.identity.liberty.ws.idpp.jaxb.AddressCardElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.idpp.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.AddressCardElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:id-sis-pp:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AddressCard";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:id-sis-pp:2003-08", "AddressCard");
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
        return (com.sun.identity.liberty.ws.idpp.jaxb.AddressCardElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.gramm"
+"ar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOr"
+"MoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp"
+"\u0000psq\u0000~\u0000\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psr\u0000 com.sun.m"
+"sv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~"
+"\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u00002com.sun.msv.grammar.Expression$AnyStringEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0016\u0001q\u0000~\u0000\u001fsr\u0000 com.sun.msv.grammar"
+".AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000 q\u0000~\u0000%sr\u0000#com.sun.msv.grammar.SimpleN"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnames"
+"paceURIq\u0000~\u0000\'xq\u0000~\u0000\"t\u00005com.sun.identity.liberty.ws.idpp.jaxb.A"
+"ddrTypeElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elements"
+"sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000"
+"\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000,com.sun.identity.liberty.ws.idpp.j"
+"axb.DSTURIq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.grammar.D"
+"ataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006e"
+"xceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0017"
+"psr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.su"
+"n.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.m"
+"sv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datat"
+"ype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\'L\u0000\btype"
+"Nameq\u0000~\u0000\'L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpac"
+"eProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005"
+"com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0017psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002"
+"\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\'L\u0000\fnamespaceURIq\u0000~\u0000\'xpq\u0000~\u0000@q\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0004"
+"typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000%sq\u0000~\u0000&t"
+"\u0000\bAddrTypet\u0000\u001durn:liberty:id-sis-pp:2003-08q\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000"
+"\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~"
+"\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00004com.sun.identity.liberty.ws.idpp.jaxb.Addres"
+"sElementq\u0000~\u0000*sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~"
+"\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00001com.sun.identity.libe"
+"rty.ws.idpp.jaxb.AddressTypeq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000"
+"~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0007Addressq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000"
+"q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&"
+"t\u00001com.sun.identity.liberty.ws.idpp.jaxb.NickElementq\u0000~\u0000*sq\u0000"
+"~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq"
+"\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000/com.sun.identity.liberty.ws.idpp.jaxb"
+".DSTStringq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0004N"
+"ickq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq"
+"\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00002com.su"
+"n.identity.liberty.ws.idpp.jaxb.LNickElementq\u0000~\u0000*sq\u0000~\u0000\u0000q\u0000~\u0000\u0017"
+"p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000"
+"#q\u0000~\u0000%sq\u0000~\u0000&t\u00008com.sun.identity.liberty.ws.idpp.jaxb.DSTLoca"
+"lizedStringq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0005"
+"LNickq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0011ppsq\u0000~"
+"\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00005com.sun.identity"
+".liberty.ws.idpp.jaxb.LCommentElementq\u0000~\u0000*sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%s"
+"q\u0000~\u0000&q\u0000~\u0000qq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\bL"
+"Commentq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0017psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\u0011ppsq"
+"\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00006com.sun.identi"
+"ty.liberty.ws.idpp.jaxb.ExtensionElementq\u0000~\u0000*sq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq"
+"\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0017psq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~"
+"\u0000%sq\u0000~\u0000&t\u00003com.sun.identity.liberty.ws.idpp.jaxb.ExtensionTy"
+"peq\u0000~\u0000*sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\tExtension"
+"q\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017psq\u0000~\u00005ppsr\u0000\'com.sun.msv.dataty"
+"pe.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalValuexr\u0000\u001ecom.sun.msv"
+".datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypet\u0000)Lcom/sun/msv/dat"
+"atype/xsd/XSDatatypeImpl;xq\u0000~\u0000<q\u0000~\u0000Mt\u0000\u0006IDTypesr\u00005com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Bs"
+"r\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlways"
+"Validxq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0006stringq\u0000~\u0000\u00bb\u0001\u0000\u0000\u0000\u0000q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00beq\u0000~\u0000Msq\u0000~"
+"\u0000&t\u0000\u0002idq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017psq\u0000~\u00005ppsr\u0000%com.sun.msv"
+".datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatyp"
+"e.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?t\u0000\bdateTimeq\u0000~\u0000C"
+"q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00c8q\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0010modificationTimeq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~"
+"\u0000\u0011ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0017pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u000bAddressCardq\u0000~\u0000Msr\u0000\""
+"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/L"
+"com/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun."
+"msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rs"
+"treamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;"
+"xp\u0000\u0000\u0000=\u0001pq\u0000~\u0000\u00ccq\u0000~\u0000\u00b2q\u0000~\u0000\nq\u0000~\u0000wq\u0000~\u0000\u0015q\u0000~\u0000\u00a7q\u0000~\u0000\u0094q\u0000~\u0000\u0080q\u0000~\u0000kq\u0000~\u0000Wq\u0000"
+"~\u0000,q\u0000~\u0000\u0010q\u0000~\u0000\u00aaq\u0000~\u0000\u00a2q\u0000~\u0000\u0097q\u0000~\u0000\u008fq\u0000~\u0000\u0083q\u0000~\u0000{q\u0000~\u0000nq\u0000~\u0000fq\u0000~\u0000\u000eq\u0000~\u0000Zq\u0000"
+"~\u0000Rq\u0000~\u0000/q\u0000~\u0000\u001bq\u0000~\u0000\u000fq\u0000~\u0000\u00a9q\u0000~\u0000\u00a1q\u0000~\u0000\u0096q\u0000~\u0000\u008eq\u0000~\u0000\u0082q\u0000~\u0000zq\u0000~\u0000mq\u0000~\u0000eq\u0000"
+"~\u0000Yq\u0000~\u0000Qq\u0000~\u0000.q\u0000~\u0000\u001aq\u0000~\u0000\u009eq\u0000~\u0000\u008bq\u0000~\u0000bq\u0000~\u0000Nq\u0000~\u0000vq\u0000~\u0000\u0012q\u0000~\u0000\tq\u0000~\u0000\fq\u0000"
+"~\u0000\u009fq\u0000~\u0000\u008cq\u0000~\u0000xq\u0000~\u0000cq\u0000~\u0000Oq\u0000~\u0000\u0018q\u0000~\u0000\u00c2q\u0000~\u0000\rq\u0000~\u0000\u000bq\u0000~\u0000\u00aeq\u0000~\u0000\u009aq\u0000~\u0000\u0087q\u0000"
+"~\u0000rq\u0000~\u0000^q\u0000~\u00003x"));
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
            return com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this;
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
                        if (("AddressCard" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AddrType" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AddrType" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Address" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Address" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Nick" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Nick" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LNick" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LNick" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LComment" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LComment" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  2 :
                        if (("AddressCard" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("id" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        case  1 :
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.AddressCardElementImpl.this).new Unmarshaller(context)), 2, value);
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
