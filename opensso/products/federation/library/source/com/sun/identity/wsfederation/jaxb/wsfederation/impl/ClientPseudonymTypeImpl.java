//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsfederation.impl;

public class ClientPseudonymTypeImpl implements com.sun.identity.wsfederation.jaxb.wsfederation.ClientPseudonymType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Any;
    protected com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString _EMail;
    protected com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString _PPID;
    protected com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString _DisplayName;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsfederation.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.ClientPseudonymType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getAny() {
        if (_Any == null) {
            _Any = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Any;
    }

    public java.util.List getAny() {
        return _getAny();
    }

    public com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString getEMail() {
        return _EMail;
    }

    public void setEMail(com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString value) {
        _EMail = value;
    }

    public com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString getPPID() {
        return _PPID;
    }

    public void setPPID(com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString value) {
        _PPID = value;
    }

    public com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString getDisplayName() {
        return _DisplayName;
    }

    public void setDisplayName(com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleString value) {
        _DisplayName = value;
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsfederation.impl.ClientPseudonymTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_PPID!= null) {
            context.startElement("http://schemas.xmlsoap.org/ws/2006/12/federation", "PPID");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _PPID), "PPID");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _PPID), "PPID");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _PPID), "PPID");
            context.endElement();
        }
        if (_DisplayName!= null) {
            context.startElement("http://schemas.xmlsoap.org/ws/2006/12/federation", "DisplayName");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DisplayName), "DisplayName");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DisplayName), "DisplayName");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _DisplayName), "DisplayName");
            context.endElement();
        }
        if (_EMail!= null) {
            context.startElement("http://schemas.xmlsoap.org/ws/2006/12/federation", "EMail");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EMail), "EMail");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EMail), "EMail");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _EMail), "EMail");
            context.endElement();
        }
        while (idx1 != len1) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Any.get(idx1 ++)), "Any");
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.ClientPseudonymType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.Ele"
+"mentPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Na"
+"meClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aigno"
+"reUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lan"
+"g.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsr"
+"\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv"
+".grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000 com.s"
+"un.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClas"
+"sq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u00002com.sun.msv.grammar.Expression$AnyStri"
+"ngExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gra"
+"mmar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.Sim"
+"pleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fn"
+"amespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000Icom.sun.identity.wsfederation.jaxb."
+"wsfederation.AttributeExtensibleStringt\u0000+http://java.sun.com"
+"/jaxb/xjc/dummy-elementssq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv."
+"grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Data"
+"type;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq"
+"\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*c"
+"om.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com."
+"sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv."
+"datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000"
+"\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whit"
+"eSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNam"
+"esr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ej"
+"B\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~"
+"\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 t\u0000\u0004PPIDt\u00000http://schemas.xmlsoap.org/ws/2006/12/federati"
+"onq\u0000~\u0000\u001fsq\u0000~\u0000\bppsq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q"
+"\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~"
+"\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u000bDisplayNameq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\bp"
+"psq\u0000~\u0000\nq\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~"
+"\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q"
+"\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0005EMailq\u0000~\u0000?q\u0000~\u0000\u001fsq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\nq"
+"\u0000~\u0000\u000fp\u0000sq\u0000~\u0000\u0016ppq\u0000~\u0000\u0019sr\u0000\'com.sun.msv.grammar.DifferenceNameCla"
+"ss\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000bL\u0000\u0003nc2q\u0000~\u0000\u000bxq\u0000~\u0000\u001cq\u0000~\u0000\u001dsr\u0000#com.sun.ms"
+"v.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000bL\u0000\u0003nc2q\u0000~\u0000\u000bxq"
+"\u0000~\u0000\u001csr\u0000&com.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\f"
+"namespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000\u0000sq\u0000~\u0000`q\u0000~\u0000?sq\u0000~\u0000`q\u0000~\u0000$q\u0000~\u0000\u001fsr\u0000\"com"
+".sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom"
+"/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv"
+".grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstre"
+"amVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000"
+"\u0000\u0000\u0014\u0001pq\u0000~\u0000\u0007q\u0000~\u0000Xq\u0000~\u0000%q\u0000~\u0000Hq\u0000~\u0000Tq\u0000~\u0000\u0015q\u0000~\u0000Eq\u0000~\u0000Qq\u0000~\u0000\u0010q\u0000~\u0000Bq\u0000~\u0000N"
+"q\u0000~\u0000\u0012q\u0000~\u0000Dq\u0000~\u0000Pq\u0000~\u0000\tq\u0000~\u0000@q\u0000~\u0000Lq\u0000~\u0000\u0006q\u0000~\u0000Yq\u0000~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsfederation.impl.ClientPseudonymTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("PPID" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  10 :
                        if (!(("" == ___uri)||("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri))) {
                            java.lang.Object co = spawnWildcard(10, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        if (!(("" == ___uri)||("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri))) {
                            java.lang.Object co = spawnWildcard(10, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  3 :
                        if (("DisplayName" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        if (("EMail" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  8 :
                        if (("EMail" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("DisplayName" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  2 :
                        if (("PPID" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        state = 10;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
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
                            state = 3;
                            continue outer;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            state = 10;
                            continue outer;
                        case  1 :
                            _PPID = ((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl.class), 2, value));
                            return ;
                        case  4 :
                            _DisplayName = ((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl.class), 5, value));
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  7 :
                            _EMail = ((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsfederation.impl.AttributeExtensibleStringImpl.class), 8, value));
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