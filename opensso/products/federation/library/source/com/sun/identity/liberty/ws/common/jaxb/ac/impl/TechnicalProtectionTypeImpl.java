//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class TechnicalProtectionTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.ac.TechnicalProtectionType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Extension;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType _PrivateKeyProtection;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType _SecretKeyProtection;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.TechnicalProtectionType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getExtension() {
        if (_Extension == null) {
            _Extension = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Extension;
    }

    public java.util.List getExtension() {
        return _getExtension();
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType getPrivateKeyProtection() {
        return _PrivateKeyProtection;
    }

    public void setPrivateKeyProtection(com.sun.identity.liberty.ws.common.jaxb.ac.PrivateKeyProtectionType value) {
        _PrivateKeyProtection = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType getSecretKeyProtection() {
        return _SecretKeyProtection;
    }

    public void setSecretKeyProtection(com.sun.identity.liberty.ws.common.jaxb.ac.SecretKeyProtectionType value) {
        _SecretKeyProtection = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.TechnicalProtectionTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection!= null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_PrivateKeyProtection instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "PrivateKeyProtection");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
                context.endElement();
            }
        } else {
            if (((_SecretKeyProtection!= null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
                if (_SecretKeyProtection instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                } else {
                    context.startElement("urn:liberty:ac:2003-08", "SecretKeyProtection");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                    context.endElement();
                }
            } else {
                if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                    while (idx1 != len1) {
                        if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                        } else {
                            context.startElement("urn:liberty:ac:2003-08", "Extension");
                            int idx_4 = idx1;
                            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_4 ++)), "Extension");
                            context.endNamespaceDecls();
                            int idx_5 = idx1;
                            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_5 ++)), "Extension");
                            context.endAttributes();
                            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                            context.endElement();
                        }
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection!= null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_PrivateKeyProtection instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
            }
        } else {
            if (((_SecretKeyProtection!= null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
                if (_SecretKeyProtection instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                }
            } else {
                if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                    while (idx1 != len1) {
                        if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                        } else {
                            idx1 += 1;
                        }
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection!= null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
            if (_PrivateKeyProtection instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _PrivateKeyProtection), "PrivateKeyProtection");
            }
        } else {
            if (((_SecretKeyProtection!= null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size()) == 0)) {
                if (_SecretKeyProtection instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SecretKeyProtection), "SecretKeyProtection");
                }
            } else {
                if (((_SecretKeyProtection == null)&&(_PrivateKeyProtection == null))&&(((_Extension == null)? 0 :_Extension.size())>= 1)) {
                    while (idx1 != len1) {
                        if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                        } else {
                            idx1 += 1;
                        }
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.TechnicalProtectionType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000sr\u0000\u0011java.lan"
+"g.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex"
+".ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gramma"
+"r/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001a"
+"ignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000bp\u0000s"
+"q\u0000~\u0000\u0000ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cco"
+"m.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000bp"
+"sr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000"
+"\tnameClassq\u0000~\u0000\rxq\u0000~\u0000\u0003q\u0000~\u0000\u000bpsr\u00002com.sun.msv.grammar.Expressio"
+"n$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\n\u0001q\u0000~\u0000\u0017sr\u0000 com.su"
+"n.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar"
+".NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Ep"
+"silonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/St"
+"ring;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000Fcom.sun.identity.liberty.w"
+"s.common.jaxb.ac.PrivateKeyProtectionElementt\u0000+http://java.s"
+"un.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\fq\u0000~\u0000\u000bp\u0000sr\u0000\u001fcom.sun.msv.g"
+"rammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011"
+"q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Ccom.sun.identity.l"
+"iberty.ws.common.jaxb.ac.PrivateKeyProtectionTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000"
+"ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002d"
+"tt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dL"
+"com/sun/msv/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u000bpsr\u0000\"com.sun.msv.data"
+"type.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Bu"
+"iltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.Concr"
+"eteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImp"
+"l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpac"
+"et\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http:"
+"//www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.d"
+"atatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv."
+"grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u000bps"
+"r\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000"
+"\fnamespaceURIq\u0000~\u0000\u001fxpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3."
+"org/2001/XMLSchema-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0014PrivateKeyProtectio"
+"nt\u0000\u0016urn:liberty:ac:2003-08q\u0000~\u0000\u001dsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bp"
+"sq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000Ecom.sun.identity.liberty"
+".ws.common.jaxb.ac.SecretKeyProtectionElementq\u0000~\u0000\"sq\u0000~\u0000\fpp\u0000s"
+"q\u0000~\u0000$ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000"
+"~\u0000\u001dsq\u0000~\u0000\u001et\u0000Bcom.sun.identity.liberty.ws.common.jaxb.ac.Secre"
+"tKeyProtectionTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001dsq"
+"\u0000~\u0000\u001et\u0000\u0013SecretKeyProtectionq\u0000~\u0000Fsq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~"
+"\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000;com.sun."
+"identity.liberty.ws.common.jaxb.ac.ExtensionElementq\u0000~\u0000\"sq\u0000~"
+"\u0000\fpp\u0000sq\u0000~\u0000$ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0011q\u0000~\u0000\u000bpsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u0000\u0017q"
+"\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u00008com.sun.identity.liberty.ws.common.jaxb.ac"
+".ExtensionTypeq\u0000~\u0000\"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014q\u0000~\u0000\u000bpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001dsq\u0000~\u0000\u001e"
+"t\u0000\tExtensionq\u0000~\u0000Fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Clos"
+"edHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j"
+"\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gr"
+"ammar/ExpressionPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000%q\u0000~\u0000Nq\u0000~\u0000bq\u0000~\u0000\u0010q\u0000~\u0000\'q\u0000~\u0000Hq"
+"\u0000~\u0000Pq\u0000~\u0000\\q\u0000~\u0000dq\u0000~\u0000,q\u0000~\u0000Uq\u0000~\u0000iq\u0000~\u0000\u0013q\u0000~\u0000(q\u0000~\u0000Iq\u0000~\u0000Qq\u0000~\u0000]q\u0000~\u0000eq"
+"\u0000~\u0000\tq\u0000~\u0000Zq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000~\u0000\u0007q\u0000~\u0000Yx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.TechnicalProtectionTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  4 :
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeySharing" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeySharing" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  2 :
                        if (!(("" == ___uri)||("urn:liberty:ac:2003-08" == ___uri))) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl.class), 3, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  6 :
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyActivation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyStorage" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("PrivateKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PrivateKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("SecretKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _SecretKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.SecretKeyProtectionElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SecretKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 1;
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
                    case  4 :
                        _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromLeaveElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  7 :
                        if (("SecretKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  5 :
                        if (("PrivateKeyProtection" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
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
                        _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  1 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
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
                    case  4 :
                        _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  1 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
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
                        case  4 :
                            _PrivateKeyProtection = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.ac.impl.PrivateKeyProtectionTypeImpl.class), 5, value));
                            return ;
                        case  1 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            state = 1;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
