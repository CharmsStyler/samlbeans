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
package org.xml.saml.saml2.protocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.xml.saml.saml2.assertion.Conditions;
import org.xml.saml.saml2.assertion.Subject;

/**
 * Java class for AuthnRequestType complex type.
 * 
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="AuthnRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}RequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Subject" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}NameIDPolicy" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Conditions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequestedAuthnContext" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}Scoping" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ForceAuthn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProtocolBinding" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AssertionConsumerServiceIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="AssertionConsumerServiceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AttributeConsumingServiceIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnRequestType", propOrder = {
    "subject",
    "nameIDPolicy",
    "conditions",
    "requestedAuthnContext",
    "scoping"
})
public class AuthnRequest extends Request {

    @XmlElement(name = "Subject", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected Subject subject;
    @XmlElement(name = "NameIDPolicy")
    protected NameIDPolicy nameIDPolicy;
    @XmlElement(name = "Conditions", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected Conditions conditions;
    @XmlElement(name = "RequestedAuthnContext")
    protected RequestedAuthnContext requestedAuthnContext;
    @XmlElement(name = "Scoping")
    protected Scoping scoping;
    @XmlAttribute(name = "ForceAuthn")
    protected Boolean forceAuthn;
    @XmlAttribute(name = "IsPassive")
    protected Boolean isPassive;
    @XmlAttribute(name = "ProtocolBinding")
    @XmlSchemaType(name = "anyURI")
    protected String protocolBinding;
    @XmlAttribute(name = "AssertionConsumerServiceIndex")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer assertionConsumerServiceIndex;
    @XmlAttribute(name = "AssertionConsumerServiceURL")
    @XmlSchemaType(name = "anyURI")
    protected String assertionConsumerServiceURL;
    @XmlAttribute(name = "AttributeConsumingServiceIndex")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer attributeConsumingServiceIndex;
    @XmlAttribute(name = "ProviderName")
    protected String providerName;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setSubject(Subject value) {
        this.subject = value;
    }

    /**
     * Gets the value of the nameIDPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link NameIDPolicy }
     *     
     */
    public NameIDPolicy getNameIDPolicy() {
        return nameIDPolicy;
    }

    /**
     * Sets the value of the nameIDPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIDPolicy }
     *     
     */
    public void setNameIDPolicy(NameIDPolicy value) {
        this.nameIDPolicy = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link Conditions }
     *     
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditions }
     *     
     */
    public void setConditions(Conditions value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the requestedAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAuthnContext }
     *     
     */
    public RequestedAuthnContext getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    /**
     * Sets the value of the requestedAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAuthnContext }
     *     
     */
    public void setRequestedAuthnContext(RequestedAuthnContext value) {
        this.requestedAuthnContext = value;
    }

    /**
     * Gets the value of the scoping property.
     * 
     * @return
     *     possible object is
     *     {@link Scoping }
     *     
     */
    public Scoping getScoping() {
        return scoping;
    }

    /**
     * Sets the value of the scoping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scoping }
     *     
     */
    public void setScoping(Scoping value) {
        this.scoping = value;
    }

    /**
     * Gets the value of the forceAuthn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceAuthn() {
        return forceAuthn;
    }

    /**
     * Sets the value of the forceAuthn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceAuthn(Boolean value) {
        this.forceAuthn = value;
    }

    /**
     * Gets the value of the isPassive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPassive() {
        return isPassive;
    }

    /**
     * Sets the value of the isPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassive(Boolean value) {
        this.isPassive = value;
    }

    /**
     * Gets the value of the protocolBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolBinding() {
        return protocolBinding;
    }

    /**
     * Sets the value of the protocolBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolBinding(String value) {
        this.protocolBinding = value;
    }

    /**
     * Gets the value of the assertionConsumerServiceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssertionConsumerServiceIndex() {
        return assertionConsumerServiceIndex;
    }

    /**
     * Sets the value of the assertionConsumerServiceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssertionConsumerServiceIndex(Integer value) {
        this.assertionConsumerServiceIndex = value;
    }

    /**
     * Gets the value of the assertionConsumerServiceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssertionConsumerServiceURL() {
        return assertionConsumerServiceURL;
    }

    /**
     * Sets the value of the assertionConsumerServiceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssertionConsumerServiceURL(String value) {
        this.assertionConsumerServiceURL = value;
    }

    /**
     * Gets the value of the attributeConsumingServiceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeConsumingServiceIndex() {
        return attributeConsumingServiceIndex;
    }

    /**
     * Sets the value of the attributeConsumingServiceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeConsumingServiceIndex(Integer value) {
        this.attributeConsumingServiceIndex = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

}
