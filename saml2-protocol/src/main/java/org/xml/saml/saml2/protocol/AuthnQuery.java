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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for AuthnQueryType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="AuthnQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}SubjectQueryAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequestedAuthnContext" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnQueryType", propOrder = {"requestedAuthnContext"})
public class AuthnQuery extends SubjectQuery {

    @XmlElement(name = "RequestedAuthnContext")
    protected RequestedAuthnContext requestedAuthnContext;

    @XmlAttribute(name = "SessionIndex")
    protected String sessionIndex;

    /**
     * Returns the {@link org.xml.saml.saml2.protocol.RequestedAuthnContext RequestedAuthnContext}.
     *
     * @return the {@link org.xml.saml.saml2.protocol.RequestedAuthnContext RequestedAuthnContext}.
     */
    public RequestedAuthnContext getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    /**
     * Sets the the {@link org.xml.saml.saml2.protocol.RequestedAuthnContext RequestedAuthnContext}.
     *
     * @param value the {@link org.xml.saml.saml2.protocol.RequestedAuthnContext RequestedAuthnContext}.
     */
    public void setRequestedAuthnContext(RequestedAuthnContext value) {
        this.requestedAuthnContext = value;
    }

    /**
     * Returns the session index.
     *
     * @return the session index.
     */
    public String getSessionIndex() {
        return sessionIndex;
    }

    /**
     * Sets the session index.
     *
     * @param value the session index.
     */
    public void setSessionIndex(String value) {
        this.sessionIndex = value;
    }

}
