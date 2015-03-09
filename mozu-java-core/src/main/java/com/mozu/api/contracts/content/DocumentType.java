/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.content.Property;

/**
 *	The type of documents used in the CMS such as "web_page" or "template" or "image_url".
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrator name associated with the object/data.
	 */
	protected String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Fully qualified name of the document type. 
	 */
	protected String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	/**
	 * The package of document lists and content documents to be installed.
	 */
	protected String installationPackage;

	public String getInstallationPackage() {
		return this.installationPackage;
	}

	public void setInstallationPackage(String installationPackage) {
		this.installationPackage = installationPackage;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * If applicable, the registered namespace associated with objects, used to generate the fully qualified name. If no namespace is defined, the namespace associated with the tenant is automatically assigned.
	 */
	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The current version number of the order, wish list, document list, or document type list.
	 */
	protected String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	/**
	 * Collection of property attributes defined for the object. Properties are associated to all objects within Mozu, including documents, products, and product types.
	 */
	protected List<Property> properties;
	public List<Property> getProperties() {
		return this.properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

}
