//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ps.impl;

public class AssertionTypeImpl
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.ps.AssertionType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected java.lang.String _InResponseTo;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ps.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ps.AssertionType.class);
    }

    public java.lang.String getInResponseTo() {
        return _InResponseTo;
    }

    public void setInResponseTo(java.lang.String value) {
        _InResponseTo = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ps.impl.AssertionTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_InResponseTo!= null) {
            context.startAttribute("", "InResponseTo");
            try {
                context.text(((java.lang.String) _InResponseTo), "InResponseTo");
            } catch (java.lang.Exception e) {
                com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ps.AssertionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000esr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005val"
+"uexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.ms"
+"v.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributes"
+"L\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000eppsr\u0000 com.sun.msv.gra"
+"mmar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000 com.sun.msv.grammar.At"
+"tributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0014xq\u0000~\u0000\u0003q\u0000~\u0000\u0012"
+"psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0011\u0001q\u0000~\u0000\u001esr\u0000 com.sun.msv.grammar.AnyNameClass"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u0000"
+"0com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0003q\u0000~\u0000\u001fq\u0000~\u0000$sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000&x"
+"q\u0000~\u0000!t\u0000Ccom.sun.identity.liberty.ws.common.jaxb.assertion.Co"
+"nditionsElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-element"
+"ssq\u0000~\u0000\u0013q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~"
+"\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000@com.sun.identity.liberty.ws.commo"
+"n.jaxb.assertion.ConditionsTypeq\u0000~\u0000)sq\u0000~\u0000\u000eppsq\u0000~\u0000\u001bq\u0000~\u0000\u0012psr\u0000\u001b"
+"com.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/d"
+"atatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/S"
+"tringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\"com.sun.msv.datatype.xsd.QnameType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUriq\u0000~\u0000&L\u0000\btypeNameq\u0000~\u0000&L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/d"
+"atatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/"
+"XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProc"
+"essor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteS"
+"paceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression"
+"$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.uti"
+"l.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000&L\u0000\fnamespaceURIq\u0000~\u0000&"
+"xpq\u0000~\u0000?q\u0000~\u0000>sq\u0000~\u0000%t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema"
+"-instanceq\u0000~\u0000$sq\u0000~\u0000%t\u0000\nConditionst\u0000%urn:oasis:names:tc:SAML:"
+"1.0:assertionq\u0000~\u0000$sq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000epps"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000?com.sun.ident"
+"ity.liberty.ws.common.jaxb.assertion.AdviceElementq\u0000~\u0000)sq\u0000~\u0000"
+"\u0013q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~"
+"\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000<com.sun.identity.liberty.ws.common.jaxb"
+".assertion.AdviceTypeq\u0000~\u0000)sq\u0000~\u0000\u000eppsq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u00007q\u0000~\u0000Gq\u0000~\u0000"
+"$sq\u0000~\u0000%t\u0000\u0006Adviceq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0018ppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq"
+"\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012ps"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Bcom.sun.identity.liberty."
+"ws.common.jaxb.assertion.StatementElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000"
+"\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Icom.sun.i"
+"dentity.liberty.ws.common.jaxb.ps.AuthenticationStatementEle"
+"mentq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\""
+"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Icom.sun.identity.liberty.ws.common.jaxb.assert"
+"ion.SubjectStatementElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012"
+"psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Ocom.sun.identity.libert"
+"y.ws.common.jaxb.security.ResourceAccessStatementElementq\u0000~\u0000"
+")sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000"
+"~\u0000%t\u0000Ocom.sun.identity.liberty.ws.common.jaxb.security.Sessi"
+"onContextStatementElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012ps"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Pcom.sun.identity.liberty."
+"ws.common.jaxb.assertion.AuthenticationStatementElementq\u0000~\u0000)"
+"sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~"
+"\u0000%t\u0000Wcom.sun.identity.liberty.ws.common.jaxb.assertion.Autho"
+"rizationDecisionStatementElementq\u0000~\u0000)sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000Kcom.sun.identity.l"
+"iberty.ws.common.jaxb.assertion.AttributeStatementElementq\u0000~"
+"\u0000)sq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000"
+"\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000?com.sun.identity.liberty.ws.c"
+"ommon.jaxb.xmlsig.SignatureElementq\u0000~\u0000)sq\u0000~\u0000\u0013q\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0013pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0018q\u0000~\u0000\u0012psq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~"
+"\u0000%t\u0000<com.sun.identity.liberty.ws.common.jaxb.xmlsig.Signatur"
+"eTypeq\u0000~\u0000)sq\u0000~\u0000\u000eppsq\u0000~\u0000\u001bq\u0000~\u0000\u0012pq\u0000~\u00007q\u0000~\u0000Gq\u0000~\u0000$sq\u0000~\u0000%t\u0000\tSignat"
+"uret\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u0000$sq\u0000~\u0000\u001bppsq\u0000~\u00004p"
+"psr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.m"
+"sv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatyp"
+"e.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.Strin"
+"gType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00009q\u0000~\u0000>t\u0000\u0002IDq\u0000~\u0000B\u0000q\u0000~\u0000Ds"
+"q\u0000~\u0000Eq\u0000~\u0000\u00b5q\u0000~\u0000>sq\u0000~\u0000%t\u0000\u000bAssertionIDt\u0000\u0000sq\u0000~\u0000\u001bppsq\u0000~\u00004ppsr\u0000%co"
+"m.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.ms"
+"v.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00009q\u0000~\u0000>t\u0000\bdate"
+"Timeq\u0000~\u0000Bq\u0000~\u0000Dsq\u0000~\u0000Eq\u0000~\u0000\u00bfq\u0000~\u0000>sq\u0000~\u0000%t\u0000\fIssueInstantq\u0000~\u0000\u00b9sq\u0000~"
+"\u0000\u001bppsq\u0000~\u00004q\u0000~\u0000\u0012psq\u0000~\u0000\u00b3q\u0000~\u0000>t\u0000\u0006stringsr\u00005com.sun.msv.datatype"
+".xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000A\u0001q\u0000~\u0000Dsq\u0000~"
+"\u0000Eq\u0000~\u0000\u00c6q\u0000~\u0000>sq\u0000~\u0000%t\u0000\u0006Issuerq\u0000~\u0000\u00b9sq\u0000~\u0000\u001bppsq\u0000~\u00004ppsr\u0000$com.sun."
+"msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datat"
+"ype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/su"
+"n/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u00009q\u0000~\u0000>t\u0000\u0007integerq\u0000~\u0000B"
+"sr\u0000,com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I"
+"\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConst"
+"raintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWi"
+"thFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbas"
+"eTypeq\u0000~\u0000\u00d0L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concre"
+"teType;L\u0000\tfacetNameq\u0000~\u0000&xq\u0000~\u0000;ppq\u0000~\u0000B\u0001\u0000sr\u0000#com.sun.msv.datat"
+"ype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00009q\u0000~\u0000>t\u0000\u0007decimalq\u0000~\u0000Bq\u0000~\u0000\u00d9"
+"t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000Dsq\u0000~\u0000Eq\u0000~\u0000\u00d2q\u0000~\u0000>sq\u0000~\u0000%t\u0000\fMajorVers"
+"ionq\u0000~\u0000\u00b9sq\u0000~\u0000\u001bppq\u0000~\u0000\u00cdsq\u0000~\u0000%t\u0000\fMinorVersionq\u0000~\u0000\u00b9sq\u0000~\u0000\u000eppsq\u0000~\u0000"
+"\u001bq\u0000~\u0000\u0012psq\u0000~\u00004ppsq\u0000~\u0000\u00b1q\u0000~\u0000>t\u0000\u0006NCNameq\u0000~\u0000B\u0000q\u0000~\u0000Dsq\u0000~\u0000Eq\u0000~\u0000\u00e6q\u0000~"
+"\u0000>sq\u0000~\u0000%t\u0000\fInResponseToq\u0000~\u0000\u00b9q\u0000~\u0000$sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000"
+"$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000:\u0001pq\u0000~\u0000\u0005q\u0000~\u0000dq\u0000~\u0000b"
+"q\u0000~\u0000hq\u0000~\u0000\u0007q\u0000~\u0000cq\u0000~\u0000\u00a2q\u0000~\u0000Vq\u0000~\u0000+q\u0000~\u0000\nq\u0000~\u0000gq\u0000~\u0000\u00a5q\u0000~\u0000\u009dq\u0000~\u0000\u0095q\u0000~\u0000\u008f"
+"q\u0000~\u0000\u0089q\u0000~\u0000\u0083q\u0000~\u0000}q\u0000~\u0000wq\u0000~\u0000qq\u0000~\u0000kq\u0000~\u0000Yq\u0000~\u0000Qq\u0000~\u0000.q\u0000~\u0000\u001aq\u0000~\u0000aq\u0000~\u0000\b"
+"q\u0000~\u0000\tq\u0000~\u0000fq\u0000~\u0000\u00e2q\u0000~\u0000\u0006q\u0000~\u0000\u00a4q\u0000~\u0000\u009cq\u0000~\u0000\u0094q\u0000~\u0000\u008eq\u0000~\u0000\u0088q\u0000~\u0000\u0082q\u0000~\u0000|q\u0000~\u0000v"
+"q\u0000~\u0000pq\u0000~\u0000jq\u0000~\u0000Xq\u0000~\u0000Pq\u0000~\u0000-q\u0000~\u0000\u0017q\u0000~\u0000\u0099q\u0000~\u0000Mq\u0000~\u0000\u000fq\u0000~\u0000\u000bq\u0000~\u0000eq\u0000~\u0000\u009a"
+"q\u0000~\u0000Nq\u0000~\u0000\u0010q\u0000~\u0000\rq\u0000~\u0000\fq\u0000~\u0000\u00a9q\u0000~\u0000]q\u0000~\u00002x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ps.impl.AssertionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "AssertionID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _InResponseTo = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
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
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "AssertionID");
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
                    case  0 :
                        if (("InResponseTo" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("AssertionID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionTypeImpl)com.sun.identity.liberty.ws.common.jaxb.ps.impl.AssertionTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
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
                    case  2 :
                        if (("InResponseTo" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "InResponseTo");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "AssertionID");
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
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "InResponseTo");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "AssertionID");
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
