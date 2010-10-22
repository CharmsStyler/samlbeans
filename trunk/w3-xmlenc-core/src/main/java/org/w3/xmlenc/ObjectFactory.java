/*
 * Copyright 2010 Katasoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.w3.xmlenc;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.w3.xmldsig.KeyInfo;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.w3.xmlenc package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgreementMethodOriginatorKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OriginatorKeyInfo");
    private final static QName _AgreementMethodRecipientKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "RecipientKeyInfo");
    private final static QName _AgreementMethodKANonce_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KA-Nonce");
    private final static QName _EncryptionProperty_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionProperty");
    private final static QName _EncryptedKey_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedKey");
    private final static QName _CipherData_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "CipherData");
    private final static QName _CipherReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "CipherReference");
    private final static QName _EncryptionProperties_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionProperties");
    private final static QName _AgreementMethod_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "AgreementMethod");
    private final static QName _EncryptedData_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedData");
    private final static QName _EncryptionMethodKeySize_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeySize");
    private final static QName _EncryptionMethodOAEPparams_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OAEPparams");
    private final static QName _ReferenceListDataReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "DataReference");
    private final static QName _ReferenceListKeyReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeyReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3.xmlenc
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CipherReference }
     */
    public CipherReference createCipherReference() {
        return new CipherReference();
    }

    /**
     * Create an instance of {@link Transforms }
     */
    public Transforms createTransforms() {
        return new Transforms();
    }

    /**
     * Create an instance of {@link CipherData }
     */
    public CipherData createCipherData() {
        return new CipherData();
    }

    /**
     * Create an instance of {@link AgreementMethod }
     */
    public AgreementMethod createAgreementMethod() {
        return new AgreementMethod();
    }

    /**
     * Create an instance of {@link Reference }
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link EncryptedData }
     */
    public EncryptedData createEncryptedData() {
        return new EncryptedData();
    }

    /**
     * Create an instance of {@link ReferenceList }
     */
    public ReferenceList createReferenceList() {
        return new ReferenceList();
    }

    /**
     * Create an instance of {@link EncryptionMethod }
     */
    public EncryptionMethod createEncryptionMethod() {
        return new EncryptionMethod();
    }

    /**
     * Create an instance of {@link EncryptionProperties }
     */
    public EncryptionProperties createEncryptionProperties() {
        return new EncryptionProperties();
    }

    /**
     * Create an instance of {@link EncryptedKey }
     */
    public EncryptedKey createEncryptedKey() {
        return new EncryptedKey();
    }

    /**
     * Create an instance of {@link EncryptionProperty }
     */
    public EncryptionProperty createEncryptionProperty() {
        return new EncryptionProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfo }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OriginatorKeyInfo", scope = AgreementMethod.class)
    public JAXBElement<KeyInfo> createAgreementMethodOriginatorKeyInfo(KeyInfo value) {
        return new JAXBElement<KeyInfo>(_AgreementMethodOriginatorKeyInfo_QNAME, KeyInfo.class, AgreementMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfo }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "RecipientKeyInfo", scope = AgreementMethod.class)
    public JAXBElement<KeyInfo> createAgreementMethodRecipientKeyInfo(KeyInfo value) {
        return new JAXBElement<KeyInfo>(_AgreementMethodRecipientKeyInfo_QNAME, KeyInfo.class, AgreementMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KA-Nonce", scope = AgreementMethod.class)
    public JAXBElement<byte[]> createAgreementMethodKANonce(byte[] value) {
        return new JAXBElement<byte[]>(_AgreementMethodKANonce_QNAME, byte[].class, AgreementMethod.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionProperty }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptionProperty")
    public JAXBElement<EncryptionProperty> createEncryptionProperty(EncryptionProperty value) {
        return new JAXBElement<EncryptionProperty>(_EncryptionProperty_QNAME, EncryptionProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedKey }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptedKey")
    public JAXBElement<EncryptedKey> createEncryptedKey(EncryptedKey value) {
        return new JAXBElement<EncryptedKey>(_EncryptedKey_QNAME, EncryptedKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherData }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "CipherData")
    public JAXBElement<CipherData> createCipherData(CipherData value) {
        return new JAXBElement<CipherData>(_CipherData_QNAME, CipherData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CipherReference }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "CipherReference")
    public JAXBElement<CipherReference> createCipherReference(CipherReference value) {
        return new JAXBElement<CipherReference>(_CipherReference_QNAME, CipherReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionProperties }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptionProperties")
    public JAXBElement<EncryptionProperties> createEncryptionProperties(EncryptionProperties value) {
        return new JAXBElement<EncryptionProperties>(_EncryptionProperties_QNAME, EncryptionProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementMethod }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "AgreementMethod")
    public JAXBElement<AgreementMethod> createAgreementMethod(AgreementMethod value) {
        return new JAXBElement<AgreementMethod>(_AgreementMethod_QNAME, AgreementMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptedData }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "EncryptedData")
    public JAXBElement<EncryptedData> createEncryptedData(EncryptedData value) {
        return new JAXBElement<EncryptedData>(_EncryptedData_QNAME, EncryptedData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeySize", scope = EncryptionMethod.class)
    public JAXBElement<BigInteger> createEncryptionMethodKeySize(BigInteger value) {
        return new JAXBElement<BigInteger>(_EncryptionMethodKeySize_QNAME, BigInteger.class, EncryptionMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OAEPparams", scope = EncryptionMethod.class)
    public JAXBElement<byte[]> createEncryptionMethodOAEPparams(byte[] value) {
        return new JAXBElement<byte[]>(_EncryptionMethodOAEPparams_QNAME, byte[].class, EncryptionMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "DataReference", scope = ReferenceList.class)
    public JAXBElement<Reference> createReferenceListDataReference(Reference value) {
        return new JAXBElement<Reference>(_ReferenceListDataReference_QNAME, Reference.class, ReferenceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeyReference", scope = ReferenceList.class)
    public JAXBElement<Reference> createReferenceListKeyReference(Reference value) {
        return new JAXBElement<Reference>(_ReferenceListKeyReference_QNAME, Reference.class, ReferenceList.class, value);
    }

}
