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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for EncryptedKeyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="EncryptedKeyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/04/xmlenc#}EncryptedType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}ReferenceList" minOccurs="0"/>
 *         &lt;element name="CarriedKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Recipient" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedKeyType", propOrder = {"referenceList", "carriedKeyName"})
public class EncryptedKey extends Encrypted {

    @XmlElement(name = "ReferenceList")
    protected ReferenceList referenceList;

    @XmlElement(name = "CarriedKeyName")
    protected String carriedKeyName;

    @XmlAttribute(name = "Recipient")
    protected String recipient;

    /**
     * Returns the ReferenceList.
     *
     * @return the ReferenceList.
     */
    public ReferenceList getReferenceList() {
        return referenceList;
    }

    /**
     * Sets the ReferenceList.
     *
     * @param value the ReferenceList.
     */
    public void setReferenceList(ReferenceList value) {
        this.referenceList = value;
    }

    /**
     * Returns the CarriedKeyName.
     *
     * @return the CarriedKeyName.
     */
    public String getCarriedKeyName() {
        return carriedKeyName;
    }

    /**
     * Sets the CarriedKeyName.
     *
     * @param value the CarriedKeyName.
     */
    public void setCarriedKeyName(String value) {
        this.carriedKeyName = value;
    }

    /**
     * Returns the recipient.
     *
     * @return the recipient.
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the recipient.
     *
     * @param value the recipient.
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

}
