//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class ArtifactResolutionServiceElementImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.IndexedEndpointTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.ArtifactResolutionServiceElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.ArtifactResolutionServiceElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:metadata";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "ArtifactResolutionService";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.ArtifactResolutionServiceElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "ArtifactResolutionService");
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
        return (com.sun.identity.saml2.jaxb.metadata.ArtifactResolutionServiceElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~"
+"\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000s"
+"r\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\t"
+"nameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004ppsr\u00002com.sun.msv.grammar.Expression$Any"
+"StringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u001asr\u0000\'com.sun.msv"
+".grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000"
+"\u0001xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u0000 com.sun.m"
+"sv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001dsr\u0000#com.sun.msv.gram"
+"mar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000\u001dsr"
+"\u0000&com.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamesp"
+"aceURIt\u0000\u0012Ljava/lang/String;xq\u0000~\u0000\u001dt\u0000\u0000sq\u0000~\u0000#t\u0000$urn:oasis:names"
+":tc:SAML:2.0:metadatasq\u0000~\u0000#t\u0000+http://java.sun.com/jaxb/xjc/d"
+"ummy-elementssr\u00000com.sun.msv.grammar.Expression$EpsilonExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001bq\u0000~\u0000,sq\u0000~\u0000\u0017ppsr\u0000\u001bcom.sun.msv.gram"
+"mar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype"
+";L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004"
+"q\u0000~\u0000\u0015psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*"
+"com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com"
+".sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv"
+".datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000$L"
+"\u0000\btypeNameq\u0000~\u0000$L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/Whi"
+"teSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006any"
+"URIsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t"
+"\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000$L\u0000\fnamespaceURIq\u0000~\u0000$xpq\u0000~\u00009q\u0000~\u00008sr"
+"\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000$L\u0000\fnamespaceURIq\u0000~\u0000$xq\u0000~\u0000\u001dt\u0000\u0007Bindingq\u0000~\u0000&sq\u0000~\u0000\u0017ppq\u0000~\u00001s"
+"q\u0000~\u0000At\u0000\bLocationq\u0000~\u0000&sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0015pq\u0000~\u00001sq\u0000~\u0000At\u0000\u0010Respo"
+"nseLocationq\u0000~\u0000&q\u0000~\u0000,sq\u0000~\u0000\u0017ppsq\u0000~\u0000.ppsr\u0000*com.sun.msv.datatyp"
+"e.xsd.UnsignedShortType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000 com.sun.msv.datatype.x"
+"sd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDer"
+"ivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd"
+"/XSDatatypeImpl;xq\u0000~\u00003q\u0000~\u00008t\u0000\runsignedShortq\u0000~\u0000<sr\u0000*com.sun."
+"msv.datatype.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv"
+".datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lan"
+"g/Object;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConst"
+"raintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWi"
+"thFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbas"
+"eTypeq\u0000~\u0000PL\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/Concre"
+"teType;L\u0000\tfacetNameq\u0000~\u0000$xq\u0000~\u00005ppq\u0000~\u0000<\u0000\u0000sr\u0000(com.sun.msv.datat"
+"ype.xsd.UnsignedIntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000!com.sun.msv.datatype.x"
+"sd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Oq\u0000~\u00008t\u0000\u000bunsignedIntq\u0000~\u0000<sq\u0000~\u0000Spp"
+"q\u0000~\u0000<\u0000\u0000sr\u0000)com.sun.msv.datatype.xsd.UnsignedLongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000O"
+"q\u0000~\u00008t\u0000\funsignedLongq\u0000~\u0000<sq\u0000~\u0000Sppq\u0000~\u0000<\u0000\u0000sr\u0000/com.sun.msv.data"
+"type.xsd.NonNegativeIntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000`q\u0000~\u00008t\u0000\u0012nonN"
+"egativeIntegerq\u0000~\u0000<sr\u0000*com.sun.msv.datatype.xsd.MinInclusive"
+"Facet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Tppq\u0000~\u0000<\u0000\u0000sq\u0000~\u0000`q\u0000~\u00008t\u0000\u0007integerq\u0000~\u0000<sr\u0000"
+",com.sun.msv.datatype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005s"
+"calexr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConstrai"
+"ntFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000Wppq\u0000~\u0000<\u0001\u0000sr\u0000#com.sun.msv.datatype.xs"
+"d.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0007decimalq\u0000~\u0000<q\u0000~\u0000ot\u0000\u000efra"
+"ctionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000it\u0000\fminInclusivesr\u0000)com.sun.msv.datatype."
+"xsd.IntegerValueType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0005valueq\u0000~\u0000$xr\u0000\u0010java.lang.Nu"
+"mber\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xpt\u0000\u00010q\u0000~\u0000et\u0000\fmaxInclusivesq\u0000~\u0000st\u0000\u00141844674407"
+"3709551615q\u0000~\u0000aq\u0000~\u0000wsr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexq\u0000"
+"~\u0000t\u0000\u0000\u0000\u0000\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000\\q\u0000~\u0000wsr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valu"
+"exq\u0000~\u0000t\u0000\u0000\u00ff\u00ffq\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000Rq\u0000~\u00008sq\u0000~\u0000At\u0000\u0005indexq\u0000~\u0000&sq\u0000~\u0000\u000fpps"
+"q\u0000~\u0000\u0017q\u0000~\u0000\u0015psq\u0000~\u0000.ppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0007booleanq\u0000~\u0000<q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u0086q\u0000~\u00008sq\u0000"
+"~\u0000At\u0000\tisDefaultq\u0000~\u0000&q\u0000~\u0000,sq\u0000~\u0000\u000fppsq\u0000~\u0000\u0017q\u0000~\u0000\u0015psq\u0000~\u0000.ppsr\u0000\"com"
+".sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0005QNam"
+"eq\u0000~\u0000<q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u008fq\u0000~\u00008sq\u0000~\u0000At\u0000\u0004typet\u0000)http://www.w3.org"
+"/2001/XMLSchema-instanceq\u0000~\u0000,sq\u0000~\u0000At\u0000\u0019ArtifactResolutionServ"
+"iceq\u0000~\u0000(sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"expTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xp"
+"sr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003"
+"I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Exp"
+"ressionPool;xp\u0000\u0000\u0000\u000b\u0001pq\u0000~\u0000Gq\u0000~\u0000\u0013q\u0000~\u0000\u008aq\u0000~\u0000\u000eq\u0000~\u0000\nq\u0000~\u0000\tq\u0000~\u0000\rq\u0000~\u0000\f"
+"q\u0000~\u0000\u000bq\u0000~\u0000\u0010q\u0000~\u0000\u0081x"));
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
            return com.sun.identity.saml2.jaxb.metadata.impl.ArtifactResolutionServiceElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "index");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("ArtifactResolutionService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
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
                    case  2 :
                        if (("ArtifactResolutionService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "index");
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
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("index" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.IndexedEndpointTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.ArtifactResolutionServiceElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
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
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "index");
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
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "index");
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
