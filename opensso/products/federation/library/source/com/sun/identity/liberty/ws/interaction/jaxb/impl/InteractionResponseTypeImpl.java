//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb.impl;

public class InteractionResponseTypeImpl implements com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.interaction.jaxb.StatusType _Status;
    protected com.sun.xml.bind.util.ListImpl _InteractionStatement;
    protected com.sun.xml.bind.util.ListImpl _Parameter;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.interaction.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseType.class);
    }

    public com.sun.identity.liberty.ws.interaction.jaxb.StatusType getStatus() {
        return _Status;
    }

    public void setStatus(com.sun.identity.liberty.ws.interaction.jaxb.StatusType value) {
        _Status = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getInteractionStatement() {
        if (_InteractionStatement == null) {
            _InteractionStatement = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _InteractionStatement;
    }

    public java.util.List getInteractionStatement() {
        return _getInteractionStatement();
    }

    protected com.sun.xml.bind.util.ListImpl _getParameter() {
        if (_Parameter == null) {
            _Parameter = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Parameter;
    }

    public java.util.List getParameter() {
        return _getParameter();
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_InteractionStatement == null)? 0 :_InteractionStatement.size());
        int idx3 = 0;
        final int len3 = ((_Parameter == null)? 0 :_Parameter.size());
        if (_Status instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Status), "Status");
        } else {
            context.startElement("urn:liberty:is:2003-08", "Status");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Status), "Status");
            context.endElement();
        }
        if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size())>= 1)&&(((_Parameter == null)? 0 :_Parameter.size()) == 0)) {
            while (idx2 != len2) {
                context.startElement("urn:liberty:is:2003-08", "InteractionStatement");
                int idx_2 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _InteractionStatement.get(idx_2 ++)), "InteractionStatement");
                context.endNamespaceDecls();
                int idx_3 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _InteractionStatement.get(idx_3 ++)), "InteractionStatement");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _InteractionStatement.get(idx2 ++)), "InteractionStatement");
                context.endElement();
            }
        } else {
            if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size()) == 0)&&(((_Parameter == null)? 0 :_Parameter.size())>= 1)) {
                while (idx3 != len3) {
                    context.startElement("urn:liberty:is:2003-08", "Parameter");
                    int idx_4 = idx3;
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Parameter.get(idx_4 ++)), "Parameter");
                    context.endNamespaceDecls();
                    int idx_5 = idx3;
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Parameter.get(idx_5 ++)), "Parameter");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _Parameter.get(idx3 ++)), "Parameter");
                    context.endElement();
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_InteractionStatement == null)? 0 :_InteractionStatement.size());
        int idx3 = 0;
        final int len3 = ((_Parameter == null)? 0 :_Parameter.size());
        if (_Status instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Status), "Status");
        }
        if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size())>= 1)&&(((_Parameter == null)? 0 :_Parameter.size()) == 0)) {
            while (idx2 != len2) {
                idx2 += 1;
            }
        } else {
            if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size()) == 0)&&(((_Parameter == null)? 0 :_Parameter.size())>= 1)) {
                while (idx3 != len3) {
                    idx3 += 1;
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_InteractionStatement == null)? 0 :_InteractionStatement.size());
        int idx3 = 0;
        final int len3 = ((_Parameter == null)? 0 :_Parameter.size());
        if (_Status instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Status), "Status");
        }
        if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size())>= 1)&&(((_Parameter == null)? 0 :_Parameter.size()) == 0)) {
            while (idx2 != len2) {
                idx2 += 1;
            }
        } else {
            if ((((_InteractionStatement == null)? 0 :_InteractionStatement.size()) == 0)&&(((_Parameter == null)? 0 :_Parameter.size())>= 1)) {
                while (idx3 != len3) {
                    idx3 += 1;
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom."
+"sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttr"
+"ibutesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0006ppsr\u0000 com.sun.msv.g"
+"rammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryE"
+"xp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002"
+"\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003q\u0000~\u0000\u0011psr\u00002com.sun.msv.gra"
+"mmar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0010\u0001q"
+"\u0000~\u0000\u0015sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.s"
+"un.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar"
+".Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#"
+"com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000"
+"\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u0000:com.sun.iden"
+"tity.liberty.ws.interaction.jaxb.StatusElementt\u0000+http://java"
+".sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq"
+"\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u00007com.su"
+"n.identity.liberty.ws.interaction.jaxb.StatusTypeq\u0000~\u0000 sq\u0000~\u0000\u0006"
+"ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002d"
+"tt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dL"
+"com/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0011psr\u0000\"com.sun.msv.data"
+"type.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Bu"
+"iltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concr"
+"eteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImp"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001dL\u0000\btypeNameq\u0000~\u0000\u001dL\u0000\nwhiteSpac"
+"et\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:"
+"//www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv."
+"grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0011ps"
+"r\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001dL\u0000"
+"\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~\u00006q\u0000~\u00005sq\u0000~\u0000\u001ct\u0000\u0004typet\u0000)http://www.w3."
+"org/2001/XMLSchema-instanceq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\u0006Statust\u0000\u0016urn:libert"
+"y:is:2003-08sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\bq\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0000p"
+"psq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000"
+"~\u0000\u001ct\u0000Ecom.sun.identity.liberty.ws.interaction.jaxb.Interacti"
+"onStatementTypeq\u0000~\u0000 sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000\u001bsq\u0000~\u0000"
+"\u001ct\u0000\u0014InteractionStatementq\u0000~\u0000Cq\u0000~\u0000\u001bsq\u0000~\u0000\rppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000pps"
+"q\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000"
+"\u001ct\u0000:com.sun.identity.liberty.ws.interaction.jaxb.ParameterTy"
+"peq\u0000~\u0000 sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\tParameter"
+"q\u0000~\u0000Csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexp"
+"Tablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000"
+"-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005"
+"countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expres"
+"sionPool;xp\u0000\u0000\u0000\u0014\u0001pq\u0000~\u0000\"q\u0000~\u0000Hq\u0000~\u0000Uq\u0000~\u0000\fq\u0000~\u0000$q\u0000~\u0000Jq\u0000~\u0000Wq\u0000~\u0000)q\u0000~"
+"\u0000Oq\u0000~\u0000\\q\u0000~\u0000\u000fq\u0000~\u0000%q\u0000~\u0000Kq\u0000~\u0000Xq\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000Fq\u0000~\u0000Sq\u0000~\u0000Eq\u0000~\u0000Dx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "---------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Status" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Status = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Status" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("InteractionStatement" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("Parameter" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("Inquiry" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _getInteractionStatement().add(((com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Inquiry" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _getInteractionStatement().add(((com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        if (("InteractionStatement" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("Parameter" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "name");
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

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        if (("Parameter" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("InteractionStatement" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Status" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "name");
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
                    case  6 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("code" == ___local)&&("" == ___uri)) {
                            _Status = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusTypeImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  7 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            _getParameter().add(((com.sun.identity.liberty.ws.interaction.jaxb.impl.ParameterTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.ParameterTypeImpl.class), 8, ___uri, ___local, ___qname)));
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
                    case  1 :
                        attIdx = context.getAttribute("", "code");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "name");
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
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "code");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  7 :
                            attIdx = context.getAttribute("", "name");
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
