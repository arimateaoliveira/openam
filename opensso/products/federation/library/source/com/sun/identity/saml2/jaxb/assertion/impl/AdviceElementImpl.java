//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion.impl;

public class AdviceElementImpl
    extends com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl
    implements com.sun.identity.saml2.jaxb.assertion.AdviceElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.assertion.AdviceElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:assertion";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Advice";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:assertion", "Advice");
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
        return (com.sun.identity.saml2.jaxb.assertion.AdviceElement.class);
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
+"rammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.O"
+"neOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005val"
+"uexp\u0000psq\u0000~\u0000\nq\u0000~\u0000\u0010psq\u0000~\u0000\nq\u0000~\u0000\u0010psq\u0000~\u0000\nq\u0000~\u0000\u0010psq\u0000~\u0000\nq\u0000~\u0000\u0010psq\u0000~\u0000\u0000"
+"q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010psr\u0000 com.sun.msv.grammar.Attribute"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0010psr\u00002co"
+"m.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0004sq\u0000~\u0000\u000f\u0001q\u0000~\u0000\u001bsr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q"
+"\u0000~\u0000\u001cq\u0000~\u0000!sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L"
+"\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000"
+";com.sun.identity.saml2.jaxb.assertion.AssertionIDRefElement"
+"t\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000s"
+"q\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000<com.s"
+"un.identity.saml2.jaxb.assertion.AssertionURIRefElementq\u0000~\u0000&"
+"sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001bq\u0000~\u0000\u001fq\u0000~\u0000!"
+"sq\u0000~\u0000\"t\u00006com.sun.identity.saml2.jaxb.assertion.AssertionElem"
+"entq\u0000~\u0000&sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\fq\u0000~\u0000\u0010psq\u0000~\u0000\u0018q\u0000~\u0000\u0010pq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001fq\u0000~\u0000!sq\u0000~\u0000\"t\u0000?com.sun.identity.saml2.jaxb.assertion.Encry"
+"ptedAssertionElementq\u0000~\u0000&sq\u0000~\u0000\u0000q\u0000~\u0000\u0010p\u0000sq\u0000~\u0000\u0018ppq\u0000~\u0000\u001bsr\u0000\'com.s"
+"un.msv.grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003n"
+"c2q\u0000~\u0000\u0001xq\u0000~\u0000\u001eq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000\u001esr\u0000&com.sun.msv.grammar."
+"NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000#xq\u0000~\u0000\u001et\u0000\u0000sq"
+"\u0000~\u0000?t\u0000%urn:oasis:names:tc:SAML:2.0:assertionsq\u0000~\u0000?q\u0000~\u0000&q\u0000~\u0000!"
+"sq\u0000~\u0000\nppsq\u0000~\u0000\u0018q\u0000~\u0000\u0010psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.da"
+"tatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd."
+"BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Con"
+"creteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeI"
+"mpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000#L\u0000\btypeNameq\u0000~\u0000#L\u0000\nwhiteSp"
+"acet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 htt"
+"p://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.ms"
+"v.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0010"
+"psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000#"
+"L\u0000\fnamespaceURIq\u0000~\u0000#xpq\u0000~\u0000Rq\u0000~\u0000Qsq\u0000~\u0000\"t\u0000\u0004typet\u0000)http://www.w"
+"3.org/2001/XMLSchema-instanceq\u0000~\u0000!sq\u0000~\u0000\"t\u0000\u0006Adviceq\u0000~\u0000Csr\u0000\"co"
+"m.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lco"
+"m/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.ms"
+"v.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstr"
+"eamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp"
+"\u0000\u0000\u0000\u0010\u0001pq\u0000~\u0000\u000bq\u0000~\u0000Eq\u0000~\u0000\u0013q\u0000~\u0000\u0011q\u0000~\u0000\u0012q\u0000~\u0000\u0014q\u0000~\u0000\tq\u0000~\u0000\u000eq\u0000~\u0000\u0017q\u0000~\u0000)q\u0000~\u0000"
+"/q\u0000~\u0000\u0016q\u0000~\u0000(q\u0000~\u0000.q\u0000~\u00005q\u0000~\u00004x"));
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
            return com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Advice" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("AssertionIDRef" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AssertionURIRef" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Assertion" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("EncryptedAssertion" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (!(("" == ___uri)||("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri))) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
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
                        if (("Advice" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                            spawnHandlerFromText((((com.sun.identity.saml2.jaxb.assertion.impl.AdviceTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.AdviceElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
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
