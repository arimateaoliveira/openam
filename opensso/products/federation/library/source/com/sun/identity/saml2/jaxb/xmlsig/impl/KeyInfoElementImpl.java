//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.xmlsig.impl;

public class KeyInfoElementImpl
    extends com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl
    implements com.sun.identity.saml2.jaxb.xmlsig.KeyInfoElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.xmlsig.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.xmlsig.KeyInfoElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "KeyInfo";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
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
        return (com.sun.identity.saml2.jaxb.xmlsig.KeyInfoElement.class);
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
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsr\u0000\u001ccom.s"
+"un.msv.grammar.MixedExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000 com.sun.msv.grammar."
+"OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\fppsr\u0000\u001dcom.sun.msv.grammar.Choic"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000"
+"\u0010ppsq\u0000~\u0000\u0010ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000esr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u001cpsr\u00002com.sun.msv"
+".grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~"
+"\u0000\u001b\u0001q\u0000~\u0000 sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dc"
+"om.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gra"
+"mmar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000!q\u0000~\u0000&"
+"sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNa"
+"met\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000(xq\u0000~\u0000#t\u00001com.sun."
+"identity.saml2.jaxb.xmlsig.KeyNameElementt\u0000+http://java.sun."
+"com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~\u0000\u001cpsq\u0000~"
+"\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00002com.sun.identity.saml2.jaxb."
+"xmlsig.KeyValueElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~\u0000\u001cpsq\u0000~"
+"\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00009com.sun.identity.saml2.jaxb."
+"xmlsig.RetrievalMethodElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~"
+"\u0000\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00002com.sun.identity.saml"
+"2.jaxb.xmlsig.X509DataElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~"
+"\u0000\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00001com.sun.identity.saml"
+"2.jaxb.xmlsig.PGPDataElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~\u0000"
+"\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00002com.sun.identity.saml2"
+".jaxb.xmlsig.SPKIDataElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u000eq\u0000~\u0000"
+"\u001cpsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpq\u0000~\u0000 q\u0000~\u0000$q\u0000~\u0000&sq\u0000~\u0000\'t\u00002com.sun.identity.saml2"
+".jaxb.xmlsig.MgmtDataElementq\u0000~\u0000+sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u001dppq\u0000~\u0000 sr\u0000\'c"
+"om.sun.msv.grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001"
+"L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000#q\u0000~\u0000$sr\u0000#com.sun.msv.grammar.ChoiceNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000#sr\u0000&com.sun.msv.gram"
+"mar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000(xq\u0000~\u0000#t"
+"\u0000\u0000sq\u0000~\u0000Vt\u0000\"http://www.w3.org/2000/09/xmldsig#sq\u0000~\u0000Vq\u0000~\u0000+sq\u0000~"
+"\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000"
+"\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\u001fcom.sun.msv.dataty"
+"pe.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAl"
+"waysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnames"
+"paceUriq\u0000~\u0000(L\u0000\btypeNameq\u0000~\u0000(L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0002IDsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
+"$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceP"
+"rocessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000sr\u00000com.sun.msv.grammar.Expression$Nul"
+"lSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001cpsr\u0000\u001bcom.sun.msv.util.St"
+"ringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000"
+"~\u0000lq\u0000~\u0000ksq\u0000~\u0000\'t\u0000\u0002Idq\u0000~\u0000Xq\u0000~\u0000&sq\u0000~\u0000\u0010ppsq\u0000~\u0000\u001dq\u0000~\u0000\u001cpsq\u0000~\u0000^ppsr\u0000"
+"\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000fq\u0000~\u0000kt\u0000\u0005"
+"QNameq\u0000~\u0000oq\u0000~\u0000qsq\u0000~\u0000rq\u0000~\u0000{q\u0000~\u0000ksq\u0000~\u0000\'t\u0000\u0004typet\u0000)http://www.w3"
+".org/2001/XMLSchema-instanceq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\u0007KeyInfoq\u0000~\u0000Zsr\u0000\"co"
+"m.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lco"
+"m/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.ms"
+"v.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstr"
+"eamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp"
+"\u0000\u0000\u0000\u001b\u0001pq\u0000~\u0000?q\u0000~\u0000Fq\u0000~\u0000Eq\u0000~\u0000Lq\u0000~\u0000Kq\u0000~\u0000\u0013q\u0000~\u0000\\q\u0000~\u0000vq\u0000~\u0000\u0016q\u0000~\u0000\u0011q\u0000~\u0000"
+"\tq\u0000~\u0000\rq\u0000~\u0000\u0015q\u0000~\u0000\u000fq\u0000~\u0000\u0017q\u0000~\u0000\u0014q\u0000~\u0000\nq\u0000~\u0000\u0012q\u0000~\u0000\u001aq\u0000~\u0000.q\u0000~\u00004q\u0000~\u0000\u0019q\u0000~\u0000"
+"-q\u0000~\u00003q\u0000~\u0000:q\u0000~\u00009q\u0000~\u0000@x"));
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
            return com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this;
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
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyName" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("RetrievalMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("X509Data" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("PGPData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SPKIData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("MgmtData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (!(("" == ___uri)||("http://www.w3.org/2000/09/xmldsig#" == ___uri))) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        if (("Id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl)com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.this).new Unmarshaller(context)), 2, value);
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
