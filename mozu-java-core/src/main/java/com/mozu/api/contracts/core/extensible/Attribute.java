/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.extensible.AttributeMetadataItem;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.extensible.AttributeLocalizedContent;
import com.mozu.api.contracts.core.extensible.AttributeValidation;
import com.mozu.api.contracts.core.extensible.AttributeVocabularyValue;

/**
 *	Properties of an attribute used to describe customers or orders.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrator name associated with the object/data.
	 */
	protected  String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Merchant-defined code for an extensible attribute. This code may be used to generate an object's fully qualified name, such as for products.
	 */
	protected  String attributeCode;

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	/**
	 * The fully qualified name of the attribute. The attributeDefiniteId may be used to generate this name.
	 */
	protected  String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * Whether the customer or order attribute appears in  only, or in both  and the website storefront. Possible values are Admin and AdminAndStorefront.
	 */
	protected  String displayGroup;

	public String getDisplayGroup() {
		return this.displayGroup;
	}

	public void setDisplayGroup(String displayGroup) {
		this.displayGroup = displayGroup;
	}

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The type of input selection used to define a value for the attribute, including Yes/No, Date, DateTime, List, TextBox, or TextArea.
	 */
	protected  String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * Indicates if the object or feature is active.
	 */
	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, the attribute can have more than one value.
	 */
	protected  Boolean isMultiValued;

	public Boolean getIsMultiValued() {
		return this.isMultiValued;
	}

	public void setIsMultiValued(Boolean isMultiValued) {
		this.isMultiValued = isMultiValued;
	}

	/**
	 * Flag used to indicate if this attribute definition is read-only. Once an attribute definition is set to read-only this action cannot be undone. 
	 */
	protected  Boolean isReadOnly;

	public Boolean getIsReadOnly() {
		return this.isReadOnly;
	}

	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	/**
	 * Indicates if the property, attribute, product option, or product extra is required. If true, the object must have a defined value.
	 */
	protected  Boolean isRequired;

	public Boolean getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	/**
	 * If true, the attribute is visible in its defined display group.
	 */
	protected  Boolean isVisible;

	public Boolean getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	/**
	 * The namespace for the accessible APIs and source capabilities in the core of  APIs.
	 */
	protected  String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * Integer that represents the sequence order of the attribute.
	 */
	protected  Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * An attribute value type is either predefined vocabulary by the admin during attribute set up or user-defined with an appropriate type (AdminEntered or ShopperEntered depending on the user). These types are used by products and attributes. The difference between predefined values versus manually entered values is such that the first choice is a set of options to choose from. AdminEntered and ShopperEntered are values that are entered rather than system-supplied and are not stored in the database, but captured during a live commerce operations such as during an order.
	 */
	protected  String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	/**
	 * List of metadata key-value pairs defined for an extensible attribute.
	 */
	protected List<AttributeMetadataItem> attributeMetadata;
	public List<AttributeMetadataItem> getAttributeMetadata() {
		return this.attributeMetadata;
	}
	public void setAttributeMetadata(List<AttributeMetadataItem> attributeMetadata) {
		this.attributeMetadata = attributeMetadata;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Localizable content (such as a name and/or description) for an attribute. The content may be localized when displayed according to the locale code specified by the master catalog. Content can include descriptive text for product extensible attributes, catalog-level descriptions (displayed if isContentOverriden is true), product bundles, and customer account notes.
	 */
	protected  AttributeLocalizedContent content;

	public AttributeLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeLocalizedContent content) {
		this.content = content;
	}

	/**
	 * Properties used when validating a value entered for an object, including extensible attributes, products attributes, and database entries.
	 */
	protected  AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

	/**
	 * List of valid vocabulary values defined for an attribute.
	 */
	protected List<AttributeVocabularyValue> vocabularyValues;
	public List<AttributeVocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<AttributeVocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}


}
