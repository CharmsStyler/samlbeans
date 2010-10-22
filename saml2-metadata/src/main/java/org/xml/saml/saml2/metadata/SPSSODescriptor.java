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

/**
 * <p>Java class for SPSSODescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPSSODescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}SSODescriptorType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionConsumerService" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AttributeConsumingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthnRequestsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WantAssertionsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPSSODescriptorType", propOrder = {
    "assertionConsumerService",
    "attributeConsumingService"
})
public class SPSSODescriptor extends SSODescriptor {

    @XmlElement(name = "AssertionConsumerService", required = true)
    protected List<IndexedEndpoint> assertionConsumerService;
    @XmlElement(name = "AttributeConsumingService")
    protected List<AttributeConsumingService> attributeConsumingService;
    @XmlAttribute(name = "AuthnRequestsSigned")
    protected Boolean authnRequestsSigned;
    @XmlAttribute(name = "WantAssertionsSigned")
    protected Boolean wantAssertionsSigned;

    /**
     * Gets the value of the assertionConsumerService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionConsumerService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionConsumerService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedEndpoint }
     * 
     * 
     */
    public List<IndexedEndpoint> getAssertionConsumerService() {
        if (assertionConsumerService == null) {
            assertionConsumerService = new ArrayList<IndexedEndpoint>();
        }
        return this.assertionConsumerService;
    }

    /**
     * Gets the value of the attributeConsumingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeConsumingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeConsumingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeConsumingService }
     * 
     * 
     */
    public List<AttributeConsumingService> getAttributeConsumingService() {
        if (attributeConsumingService == null) {
            attributeConsumingService = new ArrayList<AttributeConsumingService>();
        }
        return this.attributeConsumingService;
    }

    /**
     * Gets the value of the authnRequestsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthnRequestsSigned() {
        return authnRequestsSigned;
    }

    /**
     * Sets the value of the authnRequestsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthnRequestsSigned(Boolean value) {
        this.authnRequestsSigned = value;
    }

    /**
     * Gets the value of the wantAssertionsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    /**
     * Sets the value of the wantAssertionsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantAssertionsSigned(Boolean value) {
        this.wantAssertionsSigned = value;
    }

}
