//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wspolicy.impl;

public class PolicyAttachmentTypeImpl implements com.sun.identity.wsfederation.jaxb.wspolicy.PolicyAttachmentType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Any;
    protected com.sun.identity.wsfederation.jaxb.wspolicy.AppliesToType _AppliesTo;
    protected com.sun.xml.bind.util.ListImpl _PolicyOrPolicyReference;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wspolicy.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wspolicy.PolicyAttachmentType.class);
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

    public com.sun.identity.wsfederation.jaxb.wspolicy.AppliesToType getAppliesTo() {
        return _AppliesTo;
    }

    public void setAppliesTo(com.sun.identity.wsfederation.jaxb.wspolicy.AppliesToType value) {
        _AppliesTo = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getPolicyOrPolicyReference() {
        if (_PolicyOrPolicyReference == null) {
            _PolicyOrPolicyReference = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _PolicyOrPolicyReference;
    }

    public java.util.List getPolicyOrPolicyReference() {
        return _getPolicyOrPolicyReference();
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyAttachmentTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        int idx3 = 0;
        final int len3 = ((_PolicyOrPolicyReference == null)? 0 :_PolicyOrPolicyReference.size());
        if (_AppliesTo instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
        } else {
            context.startElement("http://schemas.xmlsoap.org/ws/2004/09/policy", "AppliesTo");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
            context.endElement();
        }
        while (idx3 != len3) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _PolicyOrPolicyReference.get(idx3 ++)), "PolicyOrPolicyReference");
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
        int idx3 = 0;
        final int len3 = ((_PolicyOrPolicyReference == null)? 0 :_PolicyOrPolicyReference.size());
        if (_AppliesTo instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
        }
        while (idx3 != len3) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _PolicyOrPolicyReference.get(idx3 ++)), "PolicyOrPolicyReference");
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        int idx3 = 0;
        final int len3 = ((_PolicyOrPolicyReference == null)? 0 :_PolicyOrPolicyReference.size());
        if (_AppliesTo instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AppliesTo), "AppliesTo");
        }
        while (idx3 != len3) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _PolicyOrPolicyReference.get(idx3 ++)), "PolicyOrPolicyReference");
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wspolicy.PolicyAttachmentType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0007ppsr\u0000 com.s"
+"un.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gramma"
+"r.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.sun"
+".msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003"
+"sq\u0000~\u0000\u0011\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv"
+".grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017q"
+"\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloc"
+"alNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000<com."
+"sun.identity.wsfederation.jaxb.wspolicy.AppliesToElementt\u0000+h"
+"ttp://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0000pps"
+"q\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000"
+"\u001dt\u00009com.sun.identity.wsfederation.jaxb.wspolicy.AppliesToTyp"
+"eq\u0000~\u0000!sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000"
+"\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun."
+"msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatyp"
+"e.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.x"
+"sd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDat"
+"atypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001eL\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nw"
+"hiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xp"
+"t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com."
+"sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNam"
+"eq\u0000~\u0000\u001eL\u0000\fnamespaceURIq\u0000~\u0000\u001expq\u0000~\u00007q\u0000~\u00006sq\u0000~\u0000\u001dt\u0000\u0004typet\u0000)http:/"
+"/www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\tAppliesTot\u0000"
+",http://schemas.xmlsoap.org/ws/2004/09/policysq\u0000~\u0000\u000eppsq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000"
+"~\u0000\u001dt\u00009com.sun.identity.wsfederation.jaxb.wspolicy.PolicyElem"
+"entq\u0000~\u0000!sq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq"
+"\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000Bcom.sun.identity.wsfederation.jaxb.wspolicy.Pol"
+"icyReferenceElementq\u0000~\u0000!sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\tq\u0000~\u0000\u0012p\u0000sq\u0000"
+"~\u0000\u0013ppq\u0000~\u0000\u0016sr\u0000\'com.sun.msv.grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\nL\u0000\u0003nc2q\u0000~\u0000\nxq\u0000~\u0000\u0019q\u0000~\u0000\u001asr\u0000#com.sun.msv.grammar"
+".ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\nL\u0000\u0003nc2q\u0000~\u0000\nxq\u0000~\u0000\u0019sr\u0000&c"
+"om.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespace"
+"URIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000\u0000sq\u0000~\u0000[q\u0000~\u0000Dsq\u0000~\u0000[q\u0000~\u0000!q\u0000~\u0000\u001csr\u0000\"com.sun.msv."
+"grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/"
+"grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar."
+"ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersion"
+"L\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0011\u0001pq\u0000~\u0000"
+"Sq\u0000~\u0000*q\u0000~\u0000\u0010q\u0000~\u0000&q\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000#q\u0000~\u0000\rq\u0000~\u0000%q\u0000~\u0000Hq\u0000~\u0000Nq\u0000~\u0000Eq\u0000~\u0000"
+"\u0006q\u0000~\u0000Fq\u0000~\u0000\u0005q\u0000~\u0000\bq\u0000~\u0000Tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "------");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyAttachmentTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("Policy" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
                            _getPolicyOrPolicyReference().add(((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PolicyReference" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
                            _getPolicyOrPolicyReference().add(((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyReferenceElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyReferenceElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (!(("" == ___uri)||("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri))) {
                            java.lang.Object co = spawnWildcard(5, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        state = 5;
                        continue outer;
                    case  5 :
                        if (!(("" == ___uri)||("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri))) {
                            java.lang.Object co = spawnWildcard(5, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        if (("Policy" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
                            _getPolicyOrPolicyReference().add(((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("PolicyReference" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
                            _getPolicyOrPolicyReference().add(((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyReferenceElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.PolicyReferenceElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  1 :
                        if (true) {
                            _AppliesTo = ((com.sun.identity.wsfederation.jaxb.wspolicy.impl.AppliesToTypeImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.AppliesToTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("AppliesTo" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
                            _AppliesTo = ((com.sun.identity.wsfederation.jaxb.wspolicy.impl.AppliesToElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wspolicy.impl.AppliesToElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("AppliesTo" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
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
                    case  4 :
                        state = 5;
                        continue outer;
                    case  5 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("AppliesTo" == ___local)&&("http://schemas.xmlsoap.org/ws/2004/09/policy" == ___uri)) {
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
                    case  4 :
                        state = 5;
                        continue outer;
                    case  5 :
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
                    case  4 :
                        state = 5;
                        continue outer;
                    case  5 :
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
                        case  4 :
                            state = 5;
                            continue outer;
                        case  5 :
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
