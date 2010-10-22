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
package org.xml.saml.saml2.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3.xmldsig.KeyInfo;
import org.w3.xmlenc.EncryptionMethod;

/**
 * <p>Java class for KeyDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}EncryptionMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{urn:oasis:names:tc:SAML:2.0:metadata}KeyTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyDescriptorType", propOrder = {
    "keyInfo",
    "encryptionMethod"
})
public class KeyDescriptor {

    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected KeyInfo keyInfo;
    @XmlElement(name = "EncryptionMethod")
    protected List<EncryptionMethod> encryptionMethod;
    @XmlAttribute
    protected KeyType use;

    /**
     * Gets the value of the keyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KeyInfo }
     *     
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyInfo }
     *     
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the encryptionMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionMethod }
     * 
     * 
     */
    public List<EncryptionMethod> getEncryptionMethod() {
        if (encryptionMethod == null) {
            encryptionMethod = new ArrayList<EncryptionMethod>();
        }
        return this.encryptionMethod;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setUse(KeyType value) {
        this.use = value;
    }

}
