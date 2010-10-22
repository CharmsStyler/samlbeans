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

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Java class for EncryptionPropertiesType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="EncryptionPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptionProperty" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionPropertiesType", propOrder = {"encryptionProperty"})
public class EncryptionProperties {

    @XmlElement(name = "EncryptionProperty", required = true)
    protected List<EncryptionProperty> encryptionProperty;

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the encryptionProperty property.
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionProperty property.
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionProperty().add(newItem);
     * </pre>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionProperty }
     */
    public List<EncryptionProperty> getEncryptionProperty() {
        if (encryptionProperty == null) {
            encryptionProperty = new ArrayList<EncryptionProperty>();
        }
        return this.encryptionProperty;
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

}
