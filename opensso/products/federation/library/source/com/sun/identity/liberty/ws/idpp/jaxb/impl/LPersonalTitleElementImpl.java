//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.idpp.jaxb.impl;

public class LPersonalTitleElementImpl
    extends com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl
    implements com.sun.identity.liberty.ws.idpp.jaxb.LPersonalTitleElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.idpp.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.LPersonalTitleElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:id-sis-pp:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "LPersonalTitle";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:id-sis-pp:2003-08", "LPersonalTitle");
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
        return (com.sun.identity.liberty.ws.idpp.jaxb.LPersonalTitleElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv.gramm"
+"ar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;"
+"L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004s"
+"r\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000#com.sun.msv.d"
+"atatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun"
+".msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.ms"
+"v.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.dataty"
+"pe.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang"
+"/String;L\u0000\btypeNameq\u0000~\u0000\u001bL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatyp"
+"e/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSch"
+"emat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
+"$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceP"
+"rocessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$Nul"
+"lSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.util.St"
+"ringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxpq\u0000"
+"~\u0000\u001fq\u0000~\u0000\u001esr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003ex"
+"pq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0011ppsr\u0000%com.sun.msv.datat"
+"ype.xsd.LanguageType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd."
+"TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0017q\u0000~\u0000\u001et\u0000\blanguagesr\u00005com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!\u0000q\u0000~"
+"\u0000$sq\u0000~\u0000%q\u0000~\u0000-q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001bL\u0000\fnamespaceURIq\u0000~\u0000\u001bxr\u0000\u001dcom.sun.msv"
+".grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004langt\u0000$http://www.w3.org/X"
+"ML/1998/namespacesr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\'q\u0000~\u0000\u0016psq\u0000~\u0000\u0011q\u0000~\u0000\u0016psr\u0000#com.sun.msv.datatype.xs"
+"d.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0006anyURIq\u0000~\u0000/q\u0000~\u0000$sq\u0000~\u0000%q"
+"\u0000~\u0000<q\u0000~\u0000\u001esq\u0000~\u00001t\u0000\u0006scriptt\u0000\u001durn:liberty:id-sis-pp:2003-08sr\u00000"
+"com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0004sq\u0000~\u0000\u0015\u0001q\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016pq\u0000~\u00009sq\u0000~\u00001t\u0000\u0003ACCq\u0000~\u0000@q"
+"\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016psq\u0000~\u0000\u0011ppsr\u0000%com.sun.msv.datatype.xsd"
+".DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTim"
+"eBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\bdateTimeq\u0000~\u0000/q\u0000~\u0000$sq\u0000~\u0000%q\u0000"
+"~\u0000Nq\u0000~\u0000\u001esq\u0000~\u00001t\u0000\u0007ACCTimeq\u0000~\u0000@q\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016psq\u0000~\u0000\u0011"
+"ppsr\u0000\'com.sun.msv.datatype.xsd.MaxLengthFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\tm"
+"axLengthxr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConstr"
+"aintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWit"
+"hFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbase"
+"Typet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteT"
+"ypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~"
+"\u0000\u001bxq\u0000~\u0000\u001at\u0000\u001curn:liberty:metadata:2003-08t\u0000\fentityIDTypeq\u0000~\u0000/\u0000"
+"\u0000q\u0000~\u0000;q\u0000~\u0000;t\u0000\tmaxLength\u0000\u0000\u0004\u0000q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000\\q\u0000~\u0000[sq\u0000~\u00001t\u0000\bmod"
+"ifierq\u0000~\u0000@q\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016psq\u0000~\u0000\u0011ppsr\u0000\'com.sun.msv.d"
+"atatype.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalValuexr\u0000\u001ecom.su"
+"n.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypeq\u0000~\u0000Xxq\u0000~\u0000\u001aq\u0000~"
+"\u0000@t\u0000\u0006IDTypeq\u0000~\u0000\"q\u0000~\u0000\u001d\u0000\u0000\u0000\u0000q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000\u001fq\u0000~\u0000@sq\u0000~\u00001t\u0000\u0002idq\u0000~"
+"\u0000@q\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016pq\u0000~\u0000Jsq\u0000~\u00001t\u0000\u0010modificationTimeq\u0000~"
+"\u0000@q\u0000~\u0000Bsq\u0000~\u00006ppsq\u0000~\u0000\'q\u0000~\u0000\u0016psq\u0000~\u0000\u0011q\u0000~\u0000\u0016psr\u0000\"com.sun.msv.datat"
+"ype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001et\u0000\u0005QNameq\u0000~\u0000/q\u0000~\u0000$sq\u0000"
+"~\u0000%q\u0000~\u0000tq\u0000~\u0000\u001esq\u0000~\u00001t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchem"
+"a-instanceq\u0000~\u0000Bsq\u0000~\u00001t\u0000\u000eLPersonalTitleq\u0000~\u0000@sr\u0000\"com.sun.msv.g"
+"rammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/g"
+"rammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.E"
+"xpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL"
+"\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000f\u0001pq\u0000~\u0000o"
+"q\u0000~\u0000kq\u0000~\u0000aq\u0000~\u0000\u0010q\u0000~\u0000\tq\u0000~\u0000\u000bq\u0000~\u00007q\u0000~\u0000\nq\u0000~\u0000Hq\u0000~\u0000\rq\u0000~\u0000\fq\u0000~\u0000\u000fq\u0000~\u0000\u000e"
+"q\u0000~\u0000Dq\u0000~\u0000Rx"));
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
            return com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("LPersonalTitle" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, true);
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
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("LPersonalTitle" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
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
                    case  1 :
                        if (("id" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("ACC" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("ACCTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("modifier" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("lang" == ___local)&&("http://www.w3.org/XML/1998/namespace" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.DSTLocalizedStringImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.LPersonalTitleElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
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
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACC");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "ACCTime");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modifier");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
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
