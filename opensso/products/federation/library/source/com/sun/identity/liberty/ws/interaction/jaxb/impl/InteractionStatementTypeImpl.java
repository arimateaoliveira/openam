//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb.impl;

public class InteractionStatementTypeImpl implements com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType _Signature;
    protected com.sun.identity.liberty.ws.interaction.jaxb.InquiryType _Inquiry;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.interaction.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType.class);
    }

    public com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType getSignature() {
        return _Signature;
    }

    public void setSignature(com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType value) {
        _Signature = value;
    }

    public com.sun.identity.liberty.ws.interaction.jaxb.InquiryType getInquiry() {
        return _Inquiry;
    }

    public void setInquiry(com.sun.identity.liberty.ws.interaction.jaxb.InquiryType value) {
        _Inquiry = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Inquiry instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
        } else {
            context.startElement("urn:liberty:is:2003-08", "Inquiry");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
            context.endElement();
        }
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        } else {
            context.startElement("http://www.w3.org/2000/09/xmldsig#", "Signature");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Inquiry instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
        }
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Inquiry instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Inquiry), "Inquiry");
        }
        if (_Signature instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Signature), "Signature");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType.class);
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
+"\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u0000;com.sun.iden"
+"tity.liberty.ws.interaction.jaxb.InquiryElementt\u0000+http://jav"
+"a.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000s"
+"q\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u00008com.s"
+"un.identity.liberty.ws.interaction.jaxb.InquiryTypeq\u0000~\u0000 sq\u0000~"
+"\u0000\u0006ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000"
+"\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0011psr\u0000\"com.sun.msv.da"
+"tatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd."
+"BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Con"
+"creteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeI"
+"mpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001dL\u0000\btypeNameq\u0000~\u0000\u001dL\u0000\nwhiteSp"
+"acet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 htt"
+"p://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatyp"
+"e.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.ms"
+"v.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0011"
+"psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001d"
+"L\u0000\fnamespaceURIq\u0000~\u0000\u001dxpq\u0000~\u00006q\u0000~\u00005sq\u0000~\u0000\u001ct\u0000\u0004typet\u0000)http://www.w"
+"3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\u0007Inquiryt\u0000\u0016urn:lib"
+"erty:is:2003-08sq\u0000~\u0000\u0006ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000"
+"~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000?com.sun.identity.liberty.ws.comm"
+"on.jaxb.xmlsig.SignatureElementq\u0000~\u0000 sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bp"
+"p\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u0000\rq\u0000~\u0000\u0011psq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000\u0015q\u0000~\u0000\u0019q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000<co"
+"m.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureTypeq\u0000"
+"~\u0000 sq\u0000~\u0000\u0006ppsq\u0000~\u0000\u0012q\u0000~\u0000\u0011pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\tSignaturet\u0000\"h"
+"ttp://www.w3.org/2000/09/xmldsig#sr\u0000\"com.sun.msv.grammar.Exp"
+"ressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Exp"
+"ressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionP"
+"ool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000"
+"$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000f\u0001pq\u0000~\u0000\"q\u0000~\u0000Lq\u0000~\u0000\f"
+"q\u0000~\u0000$q\u0000~\u0000Fq\u0000~\u0000Nq\u0000~\u0000)q\u0000~\u0000Sq\u0000~\u0000\u000fq\u0000~\u0000%q\u0000~\u0000Gq\u0000~\u0000Oq\u0000~\u0000\u0007q\u0000~\u0000Dq\u0000~\u0000\u0005"
+"x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Inquiry" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Inquiry" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "title");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Help" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Help" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Select" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Confirm" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Text" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("Signature" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Signature = ((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Signature" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SignedInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Signature = ((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SignedInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _Signature = ((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
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
                    case  2 :
                        if (("Inquiry" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  4 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "title");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromLeaveElement((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Signature" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 4;
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
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("title" == ___local)&&("" == ___uri)) {
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname));
                            return ;
                        }
                        _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _Signature = ((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.xmlsig.impl.SignatureTypeImpl.class), 6, ___uri, ___local, ___qname));
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
                    case  4 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "title");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, ___uri, ___local, ___qname));
                        return ;
                    case  5 :
                        attIdx = context.getAttribute("", "Id");
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
                        case  4 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "title");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Inquiry = ((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.class), 2, value));
                            return ;
                        case  5 :
                            attIdx = context.getAttribute("", "Id");
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
