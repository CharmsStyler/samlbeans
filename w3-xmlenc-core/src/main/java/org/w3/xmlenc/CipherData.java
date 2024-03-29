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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CipherDataType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="CipherDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CipherValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}CipherReference"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CipherDataType", propOrder = {"cipherValue", "cipherReference"})
public class CipherData {

    @XmlElement(name = "CipherValue")
    protected byte[] cipherValue;

    @XmlElement(name = "CipherReference")
    protected CipherReference cipherReference;

    /**
     * Returns the cipher bytes.
     *
     * @return the cipher bytes.
     */
    public byte[] getCipherValue() {
        return cipherValue;
    }

    /**
     * Sets the cipher bytes.
     *
     * @param value the cipher bytes
     */
    public void setCipherValue(byte[] value) {
        this.cipherValue = value;
    }

    /**
     * Returns the {@link org.w3.xmlenc.CipherReference CipherReference}.
     *
     * @return the {@link org.w3.xmlenc.CipherReference CipherReference}.
     */
    public CipherReference getCipherReference() {
        return cipherReference;
    }

    /**
     * Sets the {@link org.w3.xmlenc.CipherReference CipherReference}.
     *
     * @param value the {@link org.w3.xmlenc.CipherReference CipherReference}.
     */
    public void setCipherReference(CipherReference value) {
        this.cipherReference = value;
    }

}
