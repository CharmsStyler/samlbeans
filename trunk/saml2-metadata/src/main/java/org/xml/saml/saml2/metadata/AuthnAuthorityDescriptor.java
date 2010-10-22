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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AuthnAuthorityDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthnAuthorityDescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptorType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AuthnQueryService" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionIDRequestService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}NameIDFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre> 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnAuthorityDescriptorType", propOrder = {
    "authnQueryService",
    "assertionIDRequestService",
    "nameIDFormat"
})
public class AuthnAuthorityDescriptor
    extends RoleDescriptor
{

    @XmlElement(name = "AuthnQueryService", required = true)
    protected List<Endpoint> authnQueryService;
    @XmlElement(name = "AssertionIDRequestService")
    protected List<Endpoint> assertionIDRequestService;
    @XmlElement(name = "NameIDFormat")
    @XmlSchemaType(name = "anyURI")
    protected List<String> nameIDFormat;

    /**
     * Gets the value of the authnQueryService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authnQueryService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthnQueryService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endpoint }
     * 
     * 
     */
    public List<Endpoint> getAuthnQueryService() {
        if (authnQueryService == null) {
            authnQueryService = new ArrayList<Endpoint>();
        }
        return this.authnQueryService;
    }

    /**
     * Gets the value of the assertionIDRequestService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionIDRequestService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionIDRequestService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endpoint }
     * 
     * 
     */
    public List<Endpoint> getAssertionIDRequestService() {
        if (assertionIDRequestService == null) {
            assertionIDRequestService = new ArrayList<Endpoint>();
        }
        return this.assertionIDRequestService;
    }

    /**
     * Gets the value of the nameIDFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameIDFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameIDFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameIDFormat() {
        if (nameIDFormat == null) {
            nameIDFormat = new ArrayList<String>();
        }
        return this.nameIDFormat;
    }

}
