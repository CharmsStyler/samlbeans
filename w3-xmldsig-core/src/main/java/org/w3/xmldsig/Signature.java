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
package org.w3.xmldsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Java class for SignatureType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignedInfo"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureValue"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
        "signedInfo",
        "signatureValue",
        "keyInfo",
        "object"
})
public class Signature {

    @XmlElement(name = "SignedInfo", required = true)
    protected SignedInfo signedInfo;

    @XmlElement(name = "SignatureValue", required = true)
    protected SignatureValue signatureValue;

    @XmlElement(name = "KeyInfo")
    protected KeyInfo keyInfo;

    @XmlElement(name = "Object")
    protected List<SignatureObject> object;

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the signedInfo property.
     *
     * @return possible object is
     *         {@link SignedInfo }
     */
    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    /**
     * Sets the value of the signedInfo property.
     *
     * @param value allowed object is
     *              {@link SignedInfo }
     */
    public void setSignedInfo(SignedInfo value) {
        this.signedInfo = value;
    }

    /**
     * Gets the value of the signatureValue property.
     *
     * @return possible object is
     *         {@link SignatureValue }
     */
    public SignatureValue getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     *
     * @param value allowed object is
     *              {@link SignatureValue }
     */
    public void setSignatureValue(SignatureValue value) {
        this.signatureValue = value;
    }

    /**
     * Gets the value of the keyInfo property.
     *
     * @return possible object is
     *         {@link KeyInfo }
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * Sets the value of the keyInfo property.
     *
     * @param value allowed object is
     *              {@link KeyInfo }
     */
    public void setKeyInfo(KeyInfo value) {
        this.keyInfo = value;
    }

    /**
     * Gets the value of the object property.
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureObject }
     */
    public List<SignatureObject> getObject() {
        if (object == null) {
            object = new ArrayList<SignatureObject>();
        }
        return this.object;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

}
