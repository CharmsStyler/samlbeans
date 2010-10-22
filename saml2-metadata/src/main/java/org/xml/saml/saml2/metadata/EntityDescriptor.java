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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3.xmldsig.Signature;

/**
 * <p>Java class for EntityDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}Extensions" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}IDPSSODescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}SPSSODescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AuthnAuthorityDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AttributeAuthorityDescriptor"/>
 *             &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}PDPDescriptor"/>
 *           &lt;/choice>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AffiliationDescriptor"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}Organization" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ContactPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AdditionalMetadataLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entityID" use="required" type="{urn:oasis:names:tc:SAML:2.0:metadata}entityIDType" />
 *       &lt;attribute name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cacheDuration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityDescriptorType", propOrder = {
    "signature",
    "extensions",
    "roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor",
    "affiliationDescriptor",
    "organization",
    "contactPerson",
    "additionalMetadataLocation"
})
public class EntityDescriptor {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected Signature signature;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlElements({
        @XmlElement(name = "RoleDescriptor"),
        @XmlElement(name = "IDPSSODescriptor", type = IDPSSODescriptor.class),
        @XmlElement(name = "AuthnAuthorityDescriptor", type = AuthnAuthorityDescriptor.class),
        @XmlElement(name = "AttributeAuthorityDescriptor", type = AttributeAuthorityDescriptor.class),
        @XmlElement(name = "PDPDescriptor", type = PDPDescriptor.class),
        @XmlElement(name = "SPSSODescriptor", type = SPSSODescriptor.class)
    })
    protected List<RoleDescriptor> roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor;
    @XmlElement(name = "AffiliationDescriptor")
    protected AffiliationDescriptor affiliationDescriptor;
    @XmlElement(name = "Organization")
    protected Organization organization;
    @XmlElement(name = "ContactPerson")
    protected List<Contact> contactPerson;
    @XmlElement(name = "AdditionalMetadataLocation")
    protected List<AdditionalMetadataLocation> additionalMetadataLocation;
    @XmlAttribute(required = true)
    protected String entityID;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlAttribute
    protected Duration cacheDuration;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleDescriptorOrIDPSSODescriptorOrSPSSODescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDescriptor }
     * {@link IDPSSODescriptor }
     * {@link AuthnAuthorityDescriptor }
     * {@link AttributeAuthorityDescriptor }
     * {@link PDPDescriptor }
     * {@link SPSSODescriptor }
     * 
     * 
     */
    public List<RoleDescriptor> getRoleDescriptorOrIDPSSODescriptorOrSPSSODescriptor() {
        if (roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor == null) {
            roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor = new ArrayList<RoleDescriptor>();
        }
        return this.roleDescriptorOrIDPSSODescriptorOrSPSSODescriptor;
    }

    /**
     * Gets the value of the affiliationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationDescriptor }
     *     
     */
    public AffiliationDescriptor getAffiliationDescriptor() {
        return affiliationDescriptor;
    }

    /**
     * Sets the value of the affiliationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationDescriptor }
     *     
     */
    public void setAffiliationDescriptor(AffiliationDescriptor value) {
        this.affiliationDescriptor = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<Contact>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the additionalMetadataLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMetadataLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMetadataLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalMetadataLocation }
     * 
     * 
     */
    public List<AdditionalMetadataLocation> getAdditionalMetadataLocation() {
        if (additionalMetadataLocation == null) {
            additionalMetadataLocation = new ArrayList<AdditionalMetadataLocation>();
        }
        return this.additionalMetadataLocation;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the cacheDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCacheDuration() {
        return cacheDuration;
    }

    /**
     * Sets the value of the cacheDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCacheDuration(Duration value) {
        this.cacheDuration = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
