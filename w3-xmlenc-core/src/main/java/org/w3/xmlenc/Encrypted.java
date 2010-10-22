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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3.xmldsig.KeyInfo;

/**
 * Java class for EncryptedType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="EncryptedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncryptionMethod" type="{http://www.w3.org/2001/04/xmlenc#}EncryptionMethodType" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}CipherData"/>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptionProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedType", propOrder = {
        "encryptionMethod",
        "keyInfo",
        "cipherData",
        "encryptionProperties"
})
@XmlSeeAlso({EncryptedKey.class, EncryptedData.class})
public abstract class Encrypted {

    @XmlElement(name = "EncryptionMethod")
    protected EncryptionMethod encryptionMethod;

    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected KeyInfo keyInfo;

    @XmlElement(name = "CipherData", required = true)
    protected CipherData cipherData;

    @XmlElement(name = "EncryptionProperties")
    protected EncryptionProperties encryptionProperties;

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anyURI")
    protected String type;

    @XmlAttribute(name = "MimeType")
    protected String mimeType;

    @XmlAttribute(name = "Encoding")
    @XmlSchemaType(name = "anyURI")
    protected String encoding;

    /**
     * Returns the {@code EncryptionMethod}.
     *
     * @return the {@code EncryptionMethod}.
     */
    public EncryptionMethod getEncryptionMethod() {
        return encryptionMethod;
    }

    /**
     * Sets the {@code EncryptionMethod}.
     *
     * @param value the {@code EncryptionMethod}.
     */
    public void setEncryptionMethod(EncryptionMethod value) {
        this.encryptionMethod = value;
    }

    /**
     * Returns the {@code KeyInfo}.
     *
     * @return the {@code KeyInfo}.
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the {@code KeyInfo}.
     *
     * @param value the {@code KeyInfo}.
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    /**
     * Returns the {@code CipherData}.
     *
     * @return the {@code CipherData}.
     */
    public CipherData getCipherData() {
        return cipherData;
    }

    /**
     * Sets the {@code CipherData}.
     *
     * @param value the {@code CipherData}.
     */
    public void setCipherData(CipherData value) {
        this.cipherData = value;
    }

    /**
     * Returns the {@code EncryptionProperties}.
     *
     * @return the {@code EncryptionProperties}.
     */
    public EncryptionProperties getEncryptionProperties() {
        return encryptionProperties;
    }

    /**
     * Sets the the {@code EncryptionProperties}.
     *
     * @param value the {@code EncryptionProperties}.
     */
    public void setEncryptionProperties(EncryptionProperties value) {
        this.encryptionProperties = value;
    }

    /**
     * Returns the id.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param value the id.
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Returns the type.
     *
     * @return the type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param value the type.
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Returns the MIME type.
     *
     * @return the MIME type.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the MIME type.
     *
     * @param value the MIME type.
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Returns the encoding.
     *
     * @return the encoding.
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the encoding.
     *
     * @param value the encoding.
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
