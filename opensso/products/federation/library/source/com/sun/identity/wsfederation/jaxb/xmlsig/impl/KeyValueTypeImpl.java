//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.xmlsig.impl;

public class KeyValueTypeImpl implements com.sun.identity.wsfederation.jaxb.xmlsig.KeyValueType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Content;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.xmlsig.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.xmlsig.KeyValueType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getContent() {
        if (_Content == null) {
            _Content = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Content;
    }

    public java.util.List getContent() {
        return _getContent();
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.xmlsig.impl.KeyValueTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Content == null)? 0 :_Content.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _Content.get(idx1 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            context.text(((java.lang.String) _Content.get(idx1 ++)), "Content");
                        } catch (java.lang.Exception e) {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Content.get(idx1 ++)), "Content");
                        } else {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Content == null)? 0 :_Content.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Content.get(idx1 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            idx1 += 1;
                        } catch (java.lang.Exception e) {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            idx1 += 1;
                        } else {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Content == null)? 0 :_Content.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Content.get(idx1 ++)), "Content");
                } else {
                    if (o instanceof java.lang.String) {
                        try {
                            idx1 += 1;
                        } catch (java.lang.Exception e) {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
                        }
                    } else {
                        if (o instanceof java.lang.Object) {
                            idx1 += 1;
                        } else {
                            com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "Content", o);
                        }
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.xmlsig.KeyValueType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001ccom.sun.msv.grammar.MixedExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expt\u0000 Lcom/sun/msv/grammar/"
+"Expression;xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013e"
+"psilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002x"
+"pppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.m"
+"sv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0002L\u0000\u0004exp2q\u0000~\u0000\u0002xq\u0000~\u0000"
+"\u0003ppsq\u0000~\u0000\u0006ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.s"
+"un.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttri"
+"butesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0006ppsr\u0000 com.sun.msv.gr"
+"ammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001sr\u0000\u0011java.lang.Boolean\u00cd r\u0080"
+"\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.sun.ms"
+"v.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000"
+"~\u0000\u0011\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001d"
+"com.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gr"
+"ammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017q\u0000~\u0000"
+"\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalN"
+"amet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000<com.sun"
+".identity.wsfederation.jaxb.xmlsig.DSAKeyValueElementt\u0000+http"
+"://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0006ppsq\u0000~"
+"\u0000\u000fq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000<com.sun.identity"
+".wsfederation.jaxb.xmlsig.RSAKeyValueElementq\u0000~\u0000!sq\u0000~\u0000\npp\u0000sq"
+"\u0000~\u0000\u0013ppq\u0000~\u0000\u0016sr\u0000\'com.sun.msv.grammar.DifferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000bL\u0000\u0003nc2q\u0000~\u0000\u000bxq\u0000~\u0000\u0019q\u0000~\u0000\u001asr\u0000#com.sun.msv.gramma"
+"r.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000bL\u0000\u0003nc2q\u0000~\u0000\u000bxq\u0000~\u0000\u0019sr\u0000&"
+"com.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespac"
+"eURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000\u0000sq\u0000~\u0000.t\u0000\"http://www.w3.org/2000/09/xmldsig"
+"#sq\u0000~\u0000.q\u0000~\u0000!sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar"
+"/ExpressionPool;xp\u0000\u0000\u0000\u0007\u0001pq\u0000~\u0000\bq\u0000~\u0000\u0010q\u0000~\u0000$q\u0000~\u0000\u000eq\u0000~\u0000#q\u0000~\u0000\u0005q\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.xmlsig.impl.KeyValueTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("DSAKeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.wsfederation.jaxb.xmlsig.impl.DSAKeyValueElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.xmlsig.impl.DSAKeyValueElementImpl.class), 0, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("RSAKeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _getContent().add(((com.sun.identity.wsfederation.jaxb.xmlsig.impl.RSAKeyValueElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.xmlsig.impl.RSAKeyValueElementImpl.class), 0, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (!(("" == ___uri)||("http://www.w3.org/2000/09/xmldsig#" == ___uri))) {
                            java.lang.Object co = spawnWildcard(0, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getContent().add(co);
                            }
                            return ;
                        }
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
                    case  0 :
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
                    case  0 :
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
                    case  0 :
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
                        case  0 :
                            state = 0;
                            eatText1(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _getContent().add(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
