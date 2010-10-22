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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3.xmlenc.EncryptionMethod;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xml.saml.saml2.metadata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SPSSODescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "SPSSODescriptor");
    private final static QName _IDPSSODescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "IDPSSODescriptor");
    private final static QName _SingleLogoutService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "SingleLogoutService");
    private final static QName _EntitiesDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "EntitiesDescriptor");
    private final static QName _AttributeService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AttributeService");
    private final static QName _RequestedAttribute_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "RequestedAttribute");
    private final static QName _AuthzService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AuthzService");
    private final static QName _AuthnQueryService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AuthnQueryService");
    private final static QName _ManageNameIDService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "ManageNameIDService");
    private final static QName _SurName_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "SurName");
    private final static QName _AuthnAuthorityDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AuthnAuthorityDescriptor");
    private final static QName _AdditionalMetadataLocation_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AdditionalMetadataLocation");
    private final static QName _Company_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "Company");
    private final static QName _AttributeConsumingService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AttributeConsumingService");
    private final static QName _OrganizationDisplayName_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationDisplayName");
    private final static QName _Extensions_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "Extensions");
    private final static QName _ServiceDescription_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "ServiceDescription");
    private final static QName _OrganizationURL_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationURL");
    private final static QName _Organization_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "Organization");
    private final static QName _EncryptionMethod_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "EncryptionMethod");
    private final static QName _AttributeProfile_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AttributeProfile");
    private final static QName _SingleSignOnService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "SingleSignOnService");
    private final static QName _TelephoneNumber_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "TelephoneNumber");
    private final static QName _AffiliationDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AffiliationDescriptor");
    private final static QName _ContactPerson_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "ContactPerson");
    private final static QName _EntityDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "EntityDescriptor");
    private final static QName _AffiliateMember_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AffiliateMember");
    private final static QName _GivenName_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "GivenName");
    private final static QName _ServiceName_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "ServiceName");
    private final static QName _RoleDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "RoleDescriptor");
    private final static QName _AttributeAuthorityDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AttributeAuthorityDescriptor");
    private final static QName _PDPDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "PDPDescriptor");
    private final static QName _OrganizationName_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationName");
    private final static QName _NameIDFormat_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "NameIDFormat");
    private final static QName _NameIDMappingService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "NameIDMappingService");
    private final static QName _ArtifactResolutionService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "ArtifactResolutionService");
    private final static QName _AssertionConsumerService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AssertionConsumerService");
    private final static QName _KeyDescriptor_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "KeyDescriptor");
    private final static QName _EmailAddress_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "EmailAddress");
    private final static QName _AssertionIDRequestService_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:metadata", "AssertionIDRequestService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xml.saml.saml2.metadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntityDescriptor }
     * 
     */
    public EntityDescriptor createEntityDescriptor() {
        return new EntityDescriptor();
    }

    /**
     * Create an instance of {@link IndexedEndpoint }
     * 
     */
    public IndexedEndpoint createIndexedEndpoint() {
        return new IndexedEndpoint();
    }

    /**
     * Create an instance of {@link EntitiesDescriptor }
     * 
     */
    public EntitiesDescriptor createEntitiesDescriptor() {
        return new EntitiesDescriptor();
    }

    /**
     * Create an instance of {@link SPSSODescriptor }
     * 
     */
    public SPSSODescriptor createSPSSODescriptor() {
        return new SPSSODescriptor();
    }

    /**
     * Create an instance of {@link AttributeAuthorityDescriptor }
     * 
     */
    public AttributeAuthorityDescriptor createAttributeAuthorityDescriptor() {
        return new AttributeAuthorityDescriptor();
    }

    /**
     * Create an instance of {@link AttributeConsumingService }
     * 
     */
    public AttributeConsumingService createAttributeConsumingService() {
        return new AttributeConsumingService();
    }

    /**
     * Create an instance of {@link LocalizedName }
     * 
     */
    public LocalizedName createLocalizedName() {
        return new LocalizedName();
    }

    /**
     * Create an instance of {@link AffiliationDescriptor }
     * 
     */
    public AffiliationDescriptor createAffiliationDescriptor() {
        return new AffiliationDescriptor();
    }

    /**
     * Create an instance of {@link LocalizedURI }
     * 
     */
    public LocalizedURI createLocalizedURI() {
        return new LocalizedURI();
    }

    /**
     * Create an instance of {@link IDPSSODescriptor }
     * 
     */
    public IDPSSODescriptor createIDPSSODescriptor() {
        return new IDPSSODescriptor();
    }

    /**
     * Create an instance of {@link Endpoint }
     * 
     */
    public Endpoint createEndpoint() {
        return new Endpoint();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link AuthnAuthorityDescriptor }
     * 
     */
    public AuthnAuthorityDescriptor createAuthnAuthorityDescriptor() {
        return new AuthnAuthorityDescriptor();
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link PDPDescriptor }
     * 
     */
    public PDPDescriptor createPDPDescriptor() {
        return new PDPDescriptor();
    }

    /**
     * Create an instance of {@link RequestedAttribute }
     * 
     */
    public RequestedAttribute createRequestedAttribute() {
        return new RequestedAttribute();
    }

    /**
     * Create an instance of {@link KeyDescriptor }
     * 
     */
    public KeyDescriptor createKeyDescriptor() {
        return new KeyDescriptor();
    }

    /**
     * Create an instance of {@link AdditionalMetadataLocation }
     * 
     */
    public AdditionalMetadataLocation createAdditionalMetadataLocation() {
        return new AdditionalMetadataLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPSSODescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "SPSSODescriptor")
    public JAXBElement<SPSSODescriptor> createSPSSODescriptor(SPSSODescriptor value) {
        return new JAXBElement<SPSSODescriptor>(_SPSSODescriptor_QNAME, SPSSODescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDPSSODescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "IDPSSODescriptor")
    public JAXBElement<IDPSSODescriptor> createIDPSSODescriptor(IDPSSODescriptor value) {
        return new JAXBElement<IDPSSODescriptor>(_IDPSSODescriptor_QNAME, IDPSSODescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "SingleLogoutService")
    public JAXBElement<Endpoint> createSingleLogoutService(Endpoint value) {
        return new JAXBElement<Endpoint>(_SingleLogoutService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitiesDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "EntitiesDescriptor")
    public JAXBElement<EntitiesDescriptor> createEntitiesDescriptor(EntitiesDescriptor value) {
        return new JAXBElement<EntitiesDescriptor>(_EntitiesDescriptor_QNAME, EntitiesDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AttributeService")
    public JAXBElement<Endpoint> createAttributeService(Endpoint value) {
        return new JAXBElement<Endpoint>(_AttributeService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "RequestedAttribute")
    public JAXBElement<RequestedAttribute> createRequestedAttribute(RequestedAttribute value) {
        return new JAXBElement<RequestedAttribute>(_RequestedAttribute_QNAME, RequestedAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AuthzService")
    public JAXBElement<Endpoint> createAuthzService(Endpoint value) {
        return new JAXBElement<Endpoint>(_AuthzService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AuthnQueryService")
    public JAXBElement<Endpoint> createAuthnQueryService(Endpoint value) {
        return new JAXBElement<Endpoint>(_AuthnQueryService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "ManageNameIDService")
    public JAXBElement<Endpoint> createManageNameIDService(Endpoint value) {
        return new JAXBElement<Endpoint>(_ManageNameIDService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "SurName")
    public JAXBElement<String> createSurName(String value) {
        return new JAXBElement<String>(_SurName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthnAuthorityDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AuthnAuthorityDescriptor")
    public JAXBElement<AuthnAuthorityDescriptor> createAuthnAuthorityDescriptor(AuthnAuthorityDescriptor value) {
        return new JAXBElement<AuthnAuthorityDescriptor>(_AuthnAuthorityDescriptor_QNAME, AuthnAuthorityDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalMetadataLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AdditionalMetadataLocation")
    public JAXBElement<AdditionalMetadataLocation> createAdditionalMetadataLocation(AdditionalMetadataLocation value) {
        return new JAXBElement<AdditionalMetadataLocation>(_AdditionalMetadataLocation_QNAME, AdditionalMetadataLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "Company")
    public JAXBElement<String> createCompany(String value) {
        return new JAXBElement<String>(_Company_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeConsumingService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AttributeConsumingService")
    public JAXBElement<AttributeConsumingService> createAttributeConsumingService(AttributeConsumingService value) {
        return new JAXBElement<AttributeConsumingService>(_AttributeConsumingService_QNAME, AttributeConsumingService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "OrganizationDisplayName")
    public JAXBElement<LocalizedName> createOrganizationDisplayName(LocalizedName value) {
        return new JAXBElement<LocalizedName>(_OrganizationDisplayName_QNAME, LocalizedName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extensions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "Extensions")
    public JAXBElement<Extensions> createExtensions(Extensions value) {
        return new JAXBElement<Extensions>(_Extensions_QNAME, Extensions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "ServiceDescription")
    public JAXBElement<LocalizedName> createServiceDescription(LocalizedName value) {
        return new JAXBElement<LocalizedName>(_ServiceDescription_QNAME, LocalizedName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "OrganizationURL")
    public JAXBElement<LocalizedURI> createOrganizationURL(LocalizedURI value) {
        return new JAXBElement<LocalizedURI>(_OrganizationURL_QNAME, LocalizedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "EncryptionMethod")
    public JAXBElement<EncryptionMethod> createEncryptionMethod(EncryptionMethod value) {
        return new JAXBElement<EncryptionMethod>(_EncryptionMethod_QNAME, EncryptionMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AttributeProfile")
    public JAXBElement<String> createAttributeProfile(String value) {
        return new JAXBElement<String>(_AttributeProfile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "SingleSignOnService")
    public JAXBElement<Endpoint> createSingleSignOnService(Endpoint value) {
        return new JAXBElement<Endpoint>(_SingleSignOnService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "TelephoneNumber")
    public JAXBElement<String> createTelephoneNumber(String value) {
        return new JAXBElement<String>(_TelephoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffiliationDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AffiliationDescriptor")
    public JAXBElement<AffiliationDescriptor> createAffiliationDescriptor(AffiliationDescriptor value) {
        return new JAXBElement<AffiliationDescriptor>(_AffiliationDescriptor_QNAME, AffiliationDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "ContactPerson")
    public JAXBElement<Contact> createContactPerson(Contact value) {
        return new JAXBElement<Contact>(_ContactPerson_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "EntityDescriptor")
    public JAXBElement<EntityDescriptor> createEntityDescriptor(EntityDescriptor value) {
        return new JAXBElement<EntityDescriptor>(_EntityDescriptor_QNAME, EntityDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AffiliateMember")
    public JAXBElement<String> createAffiliateMember(String value) {
        return new JAXBElement<String>(_AffiliateMember_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "GivenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "ServiceName")
    public JAXBElement<LocalizedName> createServiceName(LocalizedName value) {
        return new JAXBElement<LocalizedName>(_ServiceName_QNAME, LocalizedName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "RoleDescriptor")
    public JAXBElement<RoleDescriptor> createRoleDescriptor(RoleDescriptor value) {
        return new JAXBElement<RoleDescriptor>(_RoleDescriptor_QNAME, RoleDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeAuthorityDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AttributeAuthorityDescriptor")
    public JAXBElement<AttributeAuthorityDescriptor> createAttributeAuthorityDescriptor(AttributeAuthorityDescriptor value) {
        return new JAXBElement<AttributeAuthorityDescriptor>(_AttributeAuthorityDescriptor_QNAME, AttributeAuthorityDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDPDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "PDPDescriptor")
    public JAXBElement<PDPDescriptor> createPDPDescriptor(PDPDescriptor value) {
        return new JAXBElement<PDPDescriptor>(_PDPDescriptor_QNAME, PDPDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "OrganizationName")
    public JAXBElement<LocalizedName> createOrganizationName(LocalizedName value) {
        return new JAXBElement<LocalizedName>(_OrganizationName_QNAME, LocalizedName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "NameIDFormat")
    public JAXBElement<String> createNameIDFormat(String value) {
        return new JAXBElement<String>(_NameIDFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "NameIDMappingService")
    public JAXBElement<Endpoint> createNameIDMappingService(Endpoint value) {
        return new JAXBElement<Endpoint>(_NameIDMappingService_QNAME, Endpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexedEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "ArtifactResolutionService")
    public JAXBElement<IndexedEndpoint> createArtifactResolutionService(IndexedEndpoint value) {
        return new JAXBElement<IndexedEndpoint>(_ArtifactResolutionService_QNAME, IndexedEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexedEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AssertionConsumerService")
    public JAXBElement<IndexedEndpoint> createAssertionConsumerService(IndexedEndpoint value) {
        return new JAXBElement<IndexedEndpoint>(_AssertionConsumerService_QNAME, IndexedEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyDescriptor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "KeyDescriptor")
    public JAXBElement<KeyDescriptor> createKeyDescriptor(KeyDescriptor value) {
        return new JAXBElement<KeyDescriptor>(_KeyDescriptor_QNAME, KeyDescriptor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Endpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:metadata", name = "AssertionIDRequestService")
    public JAXBElement<Endpoint> createAssertionIDRequestService(Endpoint value) {
        return new JAXBElement<Endpoint>(_AssertionIDRequestService_QNAME, Endpoint.class, null, value);
    }

}
