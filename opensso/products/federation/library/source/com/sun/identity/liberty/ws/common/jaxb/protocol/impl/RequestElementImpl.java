//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.protocol.impl;

public class RequestElementImpl
    extends com.sun.identity.liberty.ws.common.jaxb.protocol.impl.RequestTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.protocol.RequestElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.protocol.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.RequestElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:1.0:protocol";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Request";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.protocol.impl.RequestElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:1.0:protocol", "Request");
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
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.RequestElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.Choic"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq"
+"\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000"
+"q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002"
+"dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001d"
+"Lcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\"com.sun.msv.dat"
+"atype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.B"
+"uiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Conc"
+"reteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeIm"
+"pl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeName"
+"q\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpacePro"
+"cessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"psr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000"
+"\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u0000%q\u0000~\u0000$sq\u0000~\u0000\u0010ppsr\u0000 c"
+"om.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tname"
+"Classq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0016pq\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xr\u0000\u001dco"
+"m.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www"
+".w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.grammar.Expre"
+"ssion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0015\u0001q\u0000~\u00006sq\u0000~\u00000t\u0000"
+"\u000bRespondWitht\u0000$urn:oasis:names:tc:SAML:1.0:protocolq\u0000~\u00006sq\u0000~"
+"\u0000\u0010ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0016psq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016"
+"psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u00007q\u0000~\u0000Bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00001q\u0000~\u00006sq\u0000~\u00000t\u0000?com.sun.identity.liberty.ws.com"
+"mon.jaxb.xmlsig.SignatureElementt\u0000+http://java.sun.com/jaxb/"
+"xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~"
+"\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000<com.sun.identity"
+".liberty.ws.common.jaxb.xmlsig.SignatureTypeq\u0000~\u0000Gsq\u0000~\u0000\u0010ppsq\u0000"
+"~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\tSignaturet\u0000\"http://www.w3.o"
+"rg/2000/09/xmldsig#q\u0000~\u00006sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~"
+"\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000=com"
+".sun.identity.liberty.ws.common.jaxb.protocol.QueryElementq\u0000"
+"~\u0000Gsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016"
+"pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Bcom.sun.identity.liberty.ws.common."
+"jaxb.protocol.QueryAbstractTypeq\u0000~\u0000Gsq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000"
+"\u001cq\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0005Queryq\u0000~\u0000:sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016ps"
+"q\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Dcom.sun.identity.liberty."
+"ws.common.jaxb.protocol.SubjectQueryElementq\u0000~\u0000Gsq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u0000"
+"6sq\u0000~\u00000t\u0000Icom.sun.identity.liberty.ws.common.jaxb.protocol.S"
+"ubjectQueryAbstractTypeq\u0000~\u0000Gsq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000~\u00002q\u0000"
+"~\u00006sq\u0000~\u00000t\u0000\fSubjectQueryq\u0000~\u0000:sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq"
+"\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Kcom.sun.identity.liberty.w"
+"s.common.jaxb.protocol.AuthenticationQueryElementq\u0000~\u0000Gsq\u0000~\u0000\u0000"
+"pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~"
+"\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Hcom.sun.identity.liberty.ws.common.jaxb.prot"
+"ocol.AuthenticationQueryTypeq\u0000~\u0000Gsq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000"
+"~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0013AuthenticationQueryq\u0000~\u0000:sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq"
+"\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Fcom.sun.identi"
+"ty.liberty.ws.common.jaxb.protocol.AttributeQueryElementq\u0000~\u0000"
+"Gsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq"
+"\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Ccom.sun.identity.liberty.ws.common.ja"
+"xb.protocol.AttributeQueryTypeq\u0000~\u0000Gsq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001c"
+"q\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u000eAttributeQueryq\u0000~\u0000:sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000"
+"\u0012q\u0000~\u0000\u0016psq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Rcom.sun.identity."
+"liberty.ws.common.jaxb.protocol.AuthorizationDecisionQueryEl"
+"ementq\u0000~\u0000Gsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0016psq\u0000~"
+"\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000Bq\u0000~\u0000Dq\u0000~\u00006sq\u0000~\u00000t\u0000Ocom.sun.identity.liberty.ws."
+"common.jaxb.protocol.AuthorizationDecisionQueryTypeq\u0000~\u0000Gsq\u0000~"
+"\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u001aAuthorizationDecisio"
+"nQueryq\u0000~\u0000:sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0019ppsr\u0000#com.sun.msv."
+"datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.x"
+"sd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\u0006NCNameq\u0000~\u0000(\u0000q\u0000~\u0000*"
+"sq\u0000~\u0000+q\u0000~\u0000\u00c2q\u0000~\u0000$sq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0014"
+"AssertionIDReferencet\u0000%urn:oasis:names:tc:SAML:1.0:assertion"
+"sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u00c0q\u0000~\u0000$t\u0000\u0006stringsr\u0000"
+"5com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\'\u0001q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000\u00ceq\u0000~\u0000$sq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000"
+"~\u00002q\u0000~\u00006sq\u0000~\u00000t\u0000\u0011AssertionArtifactq\u0000~\u0000:sq\u0000~\u0000.ppsq\u0000~\u0000\u0019ppsr\u0000%c"
+"om.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.m"
+"sv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000~\u0000$t\u0000\bdat"
+"eTimeq\u0000~\u0000(q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000\u00dbq\u0000~\u0000$sq\u0000~\u00000t\u0000\fIssueInstantt\u0000\u0000sq\u0000~\u0000"
+".ppsq\u0000~\u0000\u0019ppsr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001"
+"L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000"
+"~\u0000\u001eq\u0000~\u0000$t\u0000\u0007integerq\u0000~\u0000(sr\u0000,com.sun.msv.datatype.xsd.Fraction"
+"DigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.D"
+"ataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv."
+"datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012n"
+"eedValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000\u00e4L\u0000\fconcreteTypet\u0000\'Lcom/sun/"
+"msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000!xq\u0000~\u0000 ppq\u0000~\u0000("
+"\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001eq\u0000"
+"~\u0000$t\u0000\u0007decimalq\u0000~\u0000(q\u0000~\u0000\u00edt\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000\u00e6"
+"q\u0000~\u0000$sq\u0000~\u00000t\u0000\fMajorVersionq\u0000~\u0000\u00dfsq\u0000~\u0000.ppq\u0000~\u0000\u00e1sq\u0000~\u00000t\u0000\fMinorVe"
+"rsionq\u0000~\u0000\u00dfsq\u0000~\u0000.ppsq\u0000~\u0000\u0019ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u00beq\u0000~\u0000$t\u0000\u0002IDq\u0000~\u0000(\u0000q\u0000~\u0000*sq\u0000~\u0000+q\u0000~\u0000\u00faq\u0000~\u0000$sq\u0000~\u0000"
+"0t\u0000\tRequestIDq\u0000~\u0000\u00dfsq\u0000~\u0000\u0010ppsq\u0000~\u0000.q\u0000~\u0000\u0016pq\u0000~\u0000\u001cq\u0000~\u00002q\u0000~\u00006sq\u0000~\u00000t"
+"\u0000\u0007Requestq\u0000~\u0000:sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedH"
+"ash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef"
+"\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gramm"
+"ar/ExpressionPool;xp\u0000\u0000\u0000C\u0001pq\u0000~\u0000nq\u0000~\u0000Pq\u0000~\u0000-q\u0000~\u0000\nq\u0000~\u0000\u00feq\u0000~\u0000\u000fq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0018q\u0000~\u0000Wq\u0000~\u0000Zq\u0000~\u0000\u00cbq\u0000~\u0000[q\u0000~\u0000\u0011q\u0000~\u0000\fq\u0000~\u0000\u00afq\u0000~\u0000\u009dq\u0000~\u0000\u008bq\u0000~\u0000yq\u0000~\u0000"
+"\\q\u0000~\u0000^q\u0000~\u0000gq\u0000~\u0000Iq\u0000~\u0000Xq\u0000~\u0000\u00baq\u0000~\u0000\u000eq\u0000~\u0000Yq\u0000~\u0000\u00b2q\u0000~\u0000\u00aaq\u0000~\u0000\u00a0q\u0000~\u0000\u0098q\u0000~\u0000"
+"\u008eq\u0000~\u0000\u0086q\u0000~\u0000|q\u0000~\u0000tq\u0000~\u0000jq\u0000~\u0000bq\u0000~\u0000Lq\u0000~\u0000?q\u0000~\u0000\tq\u0000~\u0000\rq\u0000~\u0000\u00b1q\u0000~\u0000\u00a9q\u0000~\u0000"
+"\u009fq\u0000~\u0000\u0097q\u0000~\u0000\u008dq\u0000~\u0000\u0085q\u0000~\u0000{q\u0000~\u0000sq\u0000~\u0000iq\u0000~\u0000aq\u0000~\u0000Kq\u0000~\u0000>q\u0000~\u0000]q\u0000~\u0000;q\u0000~\u0000"
+"\u00bcq\u0000~\u0000\u00c9q\u0000~\u0000Vq\u0000~\u0000Uq\u0000~\u0000_q\u0000~\u0000<q\u0000~\u0000\u000bq\u0000~\u0000\u00d2q\u0000~\u0000\u00c4q\u0000~\u0000\u00b6q\u0000~\u0000\u00a4q\u0000~\u0000\u0092q\u0000~\u0000"
+"\u0080x"));
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
            return com.sun.identity.liberty.ws.common.jaxb.protocol.impl.RequestElementImpl.this;
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
                    case  1 :
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Request" == ___local)&&("urn:oasis:names:tc:SAML:1.0:protocol" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
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
                        if (("Request" == ___local)&&("urn:oasis:names:tc:SAML:1.0:protocol" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                    case  1 :
                        if (("IssueInstant" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.RequestTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.RequestElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        attIdx = context.getAttribute("", "IssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                            attIdx = context.getAttribute("", "IssueInstant");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}