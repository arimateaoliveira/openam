//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 08:49:24 DU CEST 
//


package com.sun.identity.diagnostic.base.core.jaxbgen.impl;

public class ServiceTypeImpl implements com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType, com.sun.xml.bind.JAXBObject, com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.UnmarshallableObject, com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.XMLSerializable, com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.ValidatableObject
{

    protected java.lang.String _Name;
    protected com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceType _Typeofservice;
    protected com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeType _Runtime;
    protected java.lang.String _Clazz;
    protected java.lang.String _Id;
    protected com.sun.identity.diagnostic.base.core.jaxbgen.RealizationType _Realization;
    public final static java.lang.Class version = (com.sun.identity.diagnostic.base.core.jaxbgen.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType.class);
    }

    public java.lang.String getName() {
        return _Name;
    }

    public void setName(java.lang.String value) {
        _Name = value;
    }

    public com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceType getTypeofservice() {
        return _Typeofservice;
    }

    public void setTypeofservice(com.sun.identity.diagnostic.base.core.jaxbgen.TypeofserviceType value) {
        _Typeofservice = value;
    }

    public com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeType getRuntime() {
        return _Runtime;
    }

    public void setRuntime(com.sun.identity.diagnostic.base.core.jaxbgen.RuntimeType value) {
        _Runtime = value;
    }

    public java.lang.String getClazz() {
        return _Clazz;
    }

    public void setClazz(java.lang.String value) {
        _Clazz = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public com.sun.identity.diagnostic.base.core.jaxbgen.RealizationType getRealization() {
        return _Realization;
    }

    public void setRealization(com.sun.identity.diagnostic.base.core.jaxbgen.RealizationType value) {
        _Realization = value;
    }

    public com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Typeofservice instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
        } else {
            context.startElement("", "typeofservice");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
            context.endElement();
        }
        if (_Realization instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
        } else {
            context.startElement("", "realization");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
            context.endElement();
        }
        if (_Runtime instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
        } else {
            context.startElement("", "runtime");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "clazz");
        try {
            context.text(((java.lang.String) _Clazz), "Clazz");
        } catch (java.lang.Exception e) {
            com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "id");
        try {
            context.text(((java.lang.String) _Id), "Id");
        } catch (java.lang.Exception e) {
            com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "name");
        try {
            context.text(((java.lang.String) _Name), "Name");
        } catch (java.lang.Exception e) {
            com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Typeofservice instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
        }
        if (_Realization instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
        }
        if (_Runtime instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
        }
    }

    public void serializeURIs(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Typeofservice instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Typeofservice), "Typeofservice");
        }
        if (_Realization instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Realization), "Realization");
        }
        if (_Runtime instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Runtime), "Runtime");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.diagnostic.base.core.jaxbgen.ServiceType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom."
+"sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv."
+"grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/su"
+"n/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq"
+"\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\nppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~"
+"\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\rxq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000Bcom.sun.identity.diagnostic.base.core.ja"
+"xbgen.TypeofserviceElementt\u0000+http://java.sun.com/jaxb/xjc/du"
+"mmy-elementssq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq"
+"\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000?com.sun.identity.diagnosti"
+"c.base.core.jaxbgen.TypeofserviceTypeq\u0000~\u0000$sq\u0000~\u0000\nppsq\u0000~\u0000\u0016q\u0000~\u0000"
+"\u0015psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/rel"
+"axng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/"
+"util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fn"
+"amespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv"
+"/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/200"
+"1/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expressi"
+"on$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util."
+"StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xp"
+"q\u0000~\u0000:q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-i"
+"nstanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\rtypeofservicet\u0000\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\n"
+"ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000@com.sun.id"
+"entity.diagnostic.base.core.jaxbgen.RealizationElementq\u0000~\u0000$s"
+"q\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~"
+"\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000=com.sun.identity.diagnostic.base.core.j"
+"axbgen.RealizationTypeq\u0000~\u0000$sq\u0000~\u0000\nppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002q\u0000~\u0000Bq\u0000~"
+"\u0000\u001fsq\u0000~\u0000 t\u0000\u000brealizationq\u0000~\u0000Gsq\u0000~\u0000\nppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0011q\u0000"
+"~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000<com.sun.identity.dia"
+"gnostic.base.core.jaxbgen.RuntimeElementq\u0000~\u0000$sq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\u0000"
+"ppsq\u0000~\u0000\fpp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq"
+"\u0000~\u0000 t\u00009com.sun.identity.diagnostic.base.core.jaxbgen.Runtime"
+"Typeq\u0000~\u0000$sq\u0000~\u0000\nppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002q\u0000~\u0000Bq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0007runtime"
+"q\u0000~\u0000Gsq\u0000~\u0000\u0016ppsq\u0000~\u0000/q\u0000~\u0000\u0015psr\u0000#com.sun.msv.datatype.xsd.String"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00004q\u0000~\u00009t\u0000\u0006stringsr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000<\u0001q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000rq\u0000~\u00009sq\u0000~\u0000 t\u0000\u0005clazzq\u0000~\u0000Gsq\u0000~\u0000\u0016ppq\u0000~\u0000os"
+"q\u0000~\u0000 t\u0000\u0002idq\u0000~\u0000Gsq\u0000~\u0000\u0016ppq\u0000~\u0000osq\u0000~\u0000 t\u0000\u0004nameq\u0000~\u0000Gsr\u0000\"com.sun.ms"
+"v.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/ms"
+"v/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gramma"
+"r.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersi"
+"onL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u001a\u0001pq\u0000"
+"~\u0000\u000bq\u0000~\u0000Hq\u0000~\u0000[q\u0000~\u0000\u0010q\u0000~\u0000(q\u0000~\u0000Jq\u0000~\u0000Rq\u0000~\u0000]q\u0000~\u0000eq\u0000~\u0000\u0005q\u0000~\u0000\tq\u0000~\u0000\u0006q\u0000"
+"~\u0000\u0007q\u0000~\u0000\u0013q\u0000~\u0000)q\u0000~\u0000Kq\u0000~\u0000Sq\u0000~\u0000^q\u0000~\u0000fq\u0000~\u0000&q\u0000~\u0000Pq\u0000~\u0000cq\u0000~\u0000\bq\u0000~\u0000-q\u0000"
+"~\u0000Wq\u0000~\u0000jx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------------");
        }

        protected Unmarshaller(com.sun.identity.diagnostic.base.core.jaxbgen.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.diagnostic.base.core.jaxbgen.impl.ServiceTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  14 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "clazz");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  13 :
                        if (("runtime" == ___local)&&("" == ___uri)) {
                            _Runtime = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeElementImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeElementImpl.class), 14, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("runtime" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 15;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("typeofservice" == ___local)&&("" == ___uri)) {
                            _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceElementImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceElementImpl.class), 10, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("typeofservice" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 17;
                            return ;
                        }
                        break;
                    case  17 :
                        _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl.class), 18, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  15 :
                        if (("load-on-startup" == ___local)&&("" == ___uri)) {
                            _Runtime = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl.class), 16, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("load-on-startup" == ___local)&&("" == ___uri)) {
                            _Runtime = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RuntimeTypeImpl.class), 16, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        break;
                    case  10 :
                        if (("realization" == ___local)&&("" == ___uri)) {
                            _Realization = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationElementImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationElementImpl.class), 13, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("realization" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        break;
                    case  11 :
                        if (("category" == ___local)&&("" == ___uri)) {
                            _Realization = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl.class), 12, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("category" == ___local)&&("" == ___uri)) {
                            _Realization = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl) spawnChildFromEnterElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.RealizationTypeImpl.class), 12, ___uri, ___local, ___qname, __atts));
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
                _Clazz = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Name = value;
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
                    case  14 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "clazz");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  12 :
                        if (("realization" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 13;
                            return ;
                        }
                        break;
                    case  17 :
                        _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl) spawnChildFromLeaveElement((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl.class), 18, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  18 :
                        if (("typeofservice" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  16 :
                        if (("runtime" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 14;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
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
                    case  14 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("clazz" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                    case  17 :
                        _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl.class), 18, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            state = 7;
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
                    case  14 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "clazz");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        break;
                    case  2 :
                        if (("clazz" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  17 :
                        _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl.class), 18, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText2(v);
                            continue outer;
                        }
                        break;
                    case  8 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            state = 9;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 9;
                            eatText3(v);
                            continue outer;
                        }
                        break;
                    case  5 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 6;
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
                        case  14 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "clazz");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            break;
                        case  7 :
                            state = 8;
                            eatText3(value);
                            return ;
                        case  17 :
                            _Typeofservice = ((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl) spawnChildFromText((com.sun.identity.diagnostic.base.core.jaxbgen.impl.TypeofserviceTypeImpl.class), 18, value));
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText2(v);
                                continue outer;
                            }
                            break;
                        case  6 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 9;
                                eatText3(v);
                                continue outer;
                            }
                            break;
                        case  4 :
                            state = 5;
                            eatText2(value);
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
