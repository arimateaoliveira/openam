//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.protocol.impl;

public class AuthorizationDecisionQueryTypeImpl
    extends com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.protocol.AuthorizationDecisionQueryType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected java.lang.String _Resource;
    protected com.sun.xml.bind.util.ListImpl _Action;
    protected com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType _Evidence;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.protocol.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.AuthorizationDecisionQueryType.class);
    }

    public java.lang.String getResource() {
        return _Resource;
    }

    public void setResource(java.lang.String value) {
        _Resource = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getAction() {
        if (_Action == null) {
            _Action = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Action;
    }

    public java.util.List getAction() {
        return _getAction();
    }

    public com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType getEvidence() {
        return _Evidence;
    }

    public void setEvidence(com.sun.identity.liberty.ws.common.jaxb.assertion.EvidenceType value) {
        _Evidence = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        super.serializeBody(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "Action");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action.get(idx_0 ++)), "Action");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action.get(idx_1 ++)), "Action");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
                context.endElement();
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "Evidence");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        context.startAttribute("", "Resource");
        try {
            context.text(((java.lang.String) _Resource), "Resource");
        } catch (java.lang.Exception e) {
            com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        super.serializeAttributes(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                idx2 += 1;
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Action == null)? 0 :_Action.size());
        super.serializeURIs(context);
        while (idx2 != len2) {
            if (_Action.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Action.get(idx2 ++)), "Action");
            } else {
                idx2 += 1;
            }
        }
        if (_Evidence!= null) {
            if (_Evidence instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Evidence), "Evidence");
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.protocol.AuthorizationDecisionQueryType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\bppsq\u0000~\u0000\bppsr\u0000\'com.sun.msv."
+"grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/su"
+"n/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq"
+"\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~"
+"\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\rxq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000@com.sun.identity.liberty.ws.common.jaxb."
+"assertion.SubjectElementt\u0000+http://java.sun.com/jaxb/xjc/dumm"
+"y-elementssq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~"
+"\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000=com.sun.identity.liberty.ws."
+"common.jaxb.assertion.SubjectTypeq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015psr"
+"\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng"
+"/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util"
+"/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u0000\"com.sun.msv.datatype.xsd.QnameTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fn"
+"amespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv"
+"/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/200"
+"1/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~"
+"\u0000!xpq\u0000~\u0000:q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0007Subjectt\u0000%urn:oasis:names:tc:SAML:1"
+".0:assertionsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000"
+"~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u00009com.sun.identity.liberty.ws.common.jaxb.ps."
+"SubjectElementq\u0000~\u0000$sq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p"
+"q\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000Dcom.sun.identity.liberty.ws.common.j"
+"axb.security.ProxySubjectElementq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\bppsq\u0000~\u0000\fp"
+"p\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000?co"
+"m.sun.identity.liberty.ws.common.jaxb.assertion.ActionElemen"
+"tq\u0000~\u0000$sq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000"
+"~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000<com.sun.identity.liberty.ws.comm"
+"on.jaxb.assertion.ActionTypeq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002q\u0000"
+"~\u0000Bq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0006Actionq\u0000~\u0000Gsq\u0000~\u0000\bppsq\u0000~\u0000\bq\u0000~\u0000\u0015psq\u0000~\u0000\fq\u0000~\u0000\u0015p"
+"\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000Acom"
+".sun.identity.liberty.ws.common.jaxb.assertion.EvidenceEleme"
+"ntq\u0000~\u0000$sq\u0000~\u0000\fq\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000"
+"~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000>com.sun.identity.liberty.ws"
+".common.jaxb.assertion.EvidenceTypeq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015p"
+"q\u0000~\u00002q\u0000~\u0000Bq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\bEvidenceq\u0000~\u0000Gq\u0000~\u0000\u001fsq\u0000~\u0000\u0016ppsq\u0000~\u0000/q\u0000~\u0000"
+"\u0015psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00004q\u0000"
+"~\u00009t\u0000\u0006anyURIq\u0000~\u0000=q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000\u0080q\u0000~\u00009sq\u0000~\u0000 t\u0000\bResourcet\u0000\u0000sr"
+"\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000"
+"/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.su"
+"n.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000"
+"\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPoo"
+"l;xp\u0000\u0000\u0000 \u0001pq\u0000~\u0000&q\u0000~\u0000]q\u0000~\u0000qq\u0000~\u0000\u0010q\u0000~\u0000(q\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000Wq\u0000~\u0000_q\u0000~\u0000k"
+"q\u0000~\u0000sq\u0000~\u0000-q\u0000~\u0000dq\u0000~\u0000xq\u0000~\u0000\nq\u0000~\u0000\u0013q\u0000~\u0000)q\u0000~\u0000Jq\u0000~\u0000Pq\u0000~\u0000Xq\u0000~\u0000`q\u0000~\u0000l"
+"q\u0000~\u0000tq\u0000~\u0000\u000bq\u0000~\u0000Uq\u0000~\u0000iq\u0000~\u0000\u0005q\u0000~\u0000\tq\u0000~\u0000\u0007q\u0000~\u0000hq\u0000~\u0000\u0006q\u0000~\u0000Tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  6 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceElementImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  3 :
                        if (("Subject" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ProxySubject" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionElementImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("AssertionIDReference" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Assertion" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _Evidence = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.EvidenceTypeImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
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
                _Resource = com.sun.xml.bind.WhiteSpaceProcessor.collapse(value);
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
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        if (("Evidence" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("Action" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 5;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
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
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        if (("Namespace" == ___local)&&("" == ___uri)) {
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl.class), 8, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("Resource" == ___local)&&("" == ___uri)) {
                            state = 1;
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
                    case  6 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        attIdx = context.getAttribute("", "Namespace");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  5 :
                        state = 6;
                        continue outer;
                    case  3 :
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, ___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Resource" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "Resource");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
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
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  7 :
                            attIdx = context.getAttribute("", "Namespace");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _getAction().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.ActionTypeImpl.class), 8, value)));
                            return ;
                        case  5 :
                            state = 6;
                            continue outer;
                        case  3 :
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.common.jaxb.protocol.impl.SubjectQueryAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.protocol.impl.AuthorizationDecisionQueryTypeImpl.this).new Unmarshaller(context)), 4, value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "Resource");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
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
