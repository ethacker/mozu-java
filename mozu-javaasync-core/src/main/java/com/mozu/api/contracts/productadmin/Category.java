/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.CategoryLocalizedContent;
import com.mozu.api.contracts.productadmin.DynamicExpression;

/**
 *	A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer catalogId;

	public Integer getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	/**
	 * External unique identifier of the category.
	 */
	protected String categoryCode;

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	protected String categoryType;

	public String getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	/**
	 * The number of children (subcategories, for example) that stem from a parent (top-level category).
	 */
	protected Integer childCount;

	public Integer getChildCount() {
		return this.childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object is displayed on the storefront. If true, the admin product category is displayed in the store. If true, the category is not displayed.
	 */
	protected Boolean isDisplayed;

	public Boolean getIsDisplayed() {
		return this.isDisplayed;
	}

	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	/**
	 * Identifier of the parent or top-level category.
	 */
	protected Integer parentCategoryId;

	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * The total number of products. This total may indicate the total products associate with a product type or number of products in a list.
	 */
	protected Integer productCount;

	public Integer getProductCount() {
		return this.productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected CategoryLocalizedContent content;

	public CategoryLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(CategoryLocalizedContent content) {
		this.content = content;
	}

	protected DynamicExpression dynamicExpression;

	public DynamicExpression getDynamicExpression() {
		return this.dynamicExpression;
	}

	public void setDynamicExpression(DynamicExpression dynamicExpression) {
		this.dynamicExpression = dynamicExpression;
	}

}
