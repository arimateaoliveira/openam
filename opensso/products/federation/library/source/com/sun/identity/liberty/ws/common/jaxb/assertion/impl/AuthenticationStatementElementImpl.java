//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion.impl;

public class AuthenticationStatementElementImpl
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:1.0:assertion";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "AuthenticationStatement";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "AuthenticationStatement");
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
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AuthenticationStatementElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\bppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsr\u0000 com.sun.msv.gram"
+"mar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z"
+"\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000"
+"\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u00002com.sun.msv.gramma"
+"r.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0017\u0001q\u0000~\u0000"
+"\u001csr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Ex"
+"pression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001dq\u0000~\u0000\"sr\u0000#com"
+".sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Lj"
+"ava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000$xq\u0000~\u0000\u001ft\u0000@com.sun.identit"
+"y.liberty.ws.common.jaxb.assertion.SubjectElementt\u0000+http://j"
+"ava.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000=com"
+".sun.identity.liberty.ws.common.jaxb.assertion.SubjectTypeq\u0000"
+"~\u0000\'sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000"
+"\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u0000\"com.sun"
+".msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.dataty"
+"pe.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype."
+"xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDa"
+"tatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000$L\u0000\btypeNameq\u0000~\u0000$L\u0000\n"
+"whiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;x"
+"pt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv."
+"datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com."
+"sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com"
+".sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000\u0004q\u0000~\u0000\u0018psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNa"
+"meq\u0000~\u0000$L\u0000\fnamespaceURIq\u0000~\u0000$xpq\u0000~\u0000=q\u0000~\u0000<sq\u0000~\u0000#t\u0000\u0004typet\u0000)http:"
+"//www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u0007Subjectt\u0000%"
+"urn:oasis:names:tc:SAML:1.0:assertionsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00009com.sun.identity.l"
+"iberty.ws.common.jaxb.ps.SubjectElementq\u0000~\u0000\'sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000ep"
+"psq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000Dcom.sun.ide"
+"ntity.liberty.ws.common.jaxb.security.ProxySubjectElementq\u0000~"
+"\u0000\'sq\u0000~\u0000\u000eppsq\u0000~\u0000\u000eq\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000"
+"\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000Hcom.sun.identity.liberty.ws.c"
+"ommon.jaxb.assertion.SubjectLocalityElementq\u0000~\u0000\'sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p"
+"\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 "
+"q\u0000~\u0000\"sq\u0000~\u0000#t\u0000Ecom.sun.identity.liberty.ws.common.jaxb.assert"
+"ion.SubjectLocalityTypeq\u0000~\u0000\'sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000"
+"~\u0000\"sq\u0000~\u0000#t\u0000\u000fSubjectLocalityq\u0000~\u0000Jq\u0000~\u0000\"sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000"
+"~\u0000\u000eq\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq"
+"\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000Icom.sun.identity.liberty.ws.common.jaxb.as"
+"sertion.AuthorityBindingElementq\u0000~\u0000\'sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\u0007ppsq\u0000"
+"~\u0000\u0000pp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t"
+"\u0000Fcom.sun.identity.liberty.ws.common.jaxb.assertion.Authorit"
+"yBindingTypeq\u0000~\u0000\'sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000~\u0000\"sq\u0000~\u0000#t\u0000"
+"\u0010AuthorityBindingq\u0000~\u0000Jq\u0000~\u0000\"sq\u0000~\u0000\u0019ppsq\u0000~\u00002ppsr\u0000%com.sun.msv.d"
+"atatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype."
+"xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00007q\u0000~\u0000<t\u0000\bdateTimeq\u0000~\u0000@q\u0000"
+"~\u0000Bsq\u0000~\u0000Cq\u0000~\u0000\u0085q\u0000~\u0000<sq\u0000~\u0000#t\u0000\u0015AuthenticationInstantt\u0000\u0000sq\u0000~\u0000\u0019pp"
+"sq\u0000~\u00002q\u0000~\u0000\u0018psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u00007q\u0000~\u0000<t\u0000\u0006anyURIq\u0000~\u0000@q\u0000~\u0000Bsq\u0000~\u0000Cq\u0000~\u0000\u008eq\u0000~\u0000<sq\u0000~\u0000#t\u0000\u0014Aut"
+"henticationMethodq\u0000~\u0000\u0089sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000~\u0000\"sq\u0000"
+"~\u0000#t\u0000\u0017AuthenticationStatementq\u0000~\u0000Jsr\u0000\"com.sun.msv.grammar.Ex"
+"pressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Ex"
+"pressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expression"
+"Pool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt"
+"\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000$\u0001pq\u0000~\u0000)q\u0000~\u0000`q\u0000~\u0000"
+"uq\u0000~\u0000\u0013q\u0000~\u0000+q\u0000~\u0000Lq\u0000~\u0000Rq\u0000~\u0000Zq\u0000~\u0000bq\u0000~\u0000oq\u0000~\u0000wq\u0000~\u00000q\u0000~\u0000gq\u0000~\u0000|q\u0000~\u0000"
+"\u0092q\u0000~\u0000\u0010q\u0000~\u0000\tq\u0000~\u0000\u0016q\u0000~\u0000,q\u0000~\u0000Mq\u0000~\u0000Sq\u0000~\u0000[q\u0000~\u0000cq\u0000~\u0000pq\u0000~\u0000xq\u0000~\u0000\u0011q\u0000~\u0000"
+"Xq\u0000~\u0000mq\u0000~\u0000\rq\u0000~\u0000\nq\u0000~\u0000\u000fq\u0000~\u0000Wq\u0000~\u0000\u000bq\u0000~\u0000lq\u0000~\u0000\fq\u0000~\u0000kx"));
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
            return com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("", "AuthenticationInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("AuthenticationStatement" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
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
                    case  2 :
                        if (("AuthenticationStatement" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "AuthenticationInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                        if (("AuthenticationInstant" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementTypeImpl)com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AuthenticationStatementElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("", "AuthenticationInstant");
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
                            attIdx = context.getAttribute("", "AuthenticationInstant");
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
