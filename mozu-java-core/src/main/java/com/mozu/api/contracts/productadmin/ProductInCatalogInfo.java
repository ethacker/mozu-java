/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.ActiveDateRange;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.productadmin.ProductCategory;
import com.mozu.api.contracts.productadmin.ProductLocalizedSEOContent;

/**
 *	Properties of a product associated with a specific catalog.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInCatalogInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The unique identifier of the catalog of products used by a site.
	 */
	protected Integer catalogId;

	public Integer getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	protected DateTime dateFirstAvailableInCatalog;

	public DateTime getDateFirstAvailableInCatalog() {
		return this.dateFirstAvailableInCatalog;
	}

	public void setDateFirstAvailableInCatalog(DateTime dateFirstAvailableInCatalog) {
		this.dateFirstAvailableInCatalog = dateFirstAvailableInCatalog;
	}

	/**
	 * Indicates if the object or feature is active. This indicator is used for subscriptions (at the site or tenant level), customer accounts, products and variations.
	 */
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, the content defined for this product in the master catalog in overridden in the catalog with the content specified in the request body. If false, this catalog uses the content defined in the master catalog for the product.
	 */
	protected Boolean isContentOverridden;

	public Boolean getIsContentOverridden() {
		return this.isContentOverridden;
	}

	public void setIsContentOverridden(Boolean isContentOverridden) {
		this.isContentOverridden = isContentOverridden;
	}

	/**
	 * If true, the price defined for this product in the master catalog in overridden in the catalog with the price specified in the request body. If false, this catalog uses the price defined in the master catalog for the product.
	 */
	protected Boolean isPriceOverridden;

	public Boolean getIsPriceOverridden() {
		return this.isPriceOverridden;
	}

	public void setIsPriceOverridden(Boolean isPriceOverridden) {
		this.isPriceOverridden = isPriceOverridden;
	}

	/**
	 * If true, the SEO content defined for this product in the master catalog in overridden in the catalog with the SEO content specified in the request body. If false, this catalog uses the SEO content defined in the master catalog for the product.
	 */
	protected Boolean isseoContentOverridden;

	public Boolean getIsseoContentOverridden() {
		return this.isseoContentOverridden;
	}

	public void setIsseoContentOverridden(Boolean isseoContentOverridden) {
		this.isseoContentOverridden = isseoContentOverridden;
	}

	protected ActiveDateRange activeDateRange;

	public ActiveDateRange getActiveDateRange() {
		return this.activeDateRange;
	}

	public void setActiveDateRange(ActiveDateRange activeDateRange) {
		this.activeDateRange = activeDateRange;
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
	 * Localizable content (such as a name and/or description) for an attribute. The content may be localized when displayed according to the locale code specified by the master catalog. Content can include descriptive text for product extensible attributes, catalog-level descriptions (displayed if isContentOverriden is true), product bundles, and customer account notes.
	 */
	protected ProductLocalizedContent content;

	public ProductLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductLocalizedContent content) {
		this.content = content;
	}

	/**
	 * The price of the product associated with the specified catalog. If no price is specified in the request, this catalog uses the price defined in the master catalog. To override the product price for this catalog, the IsPriceOverridden flag must be set to "true".
	 */
	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * The product categories to define for the product associated with the specified catalog.
	 */
	protected List<ProductCategory> productCategories;
	public List<ProductCategory> getProductCategories() {
		return this.productCategories;
	}
	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	/**
	 * The search engine optimized content defined for products or products associated with a catalog. If no SEO content is specified in the request for products associated with a catalog, this catalog uses the SEO content defined in the master catalog. To override the SEO content for this catalog, the `IsSEOContentOverridden `flag must be set to "true".
	 */
	protected ProductLocalizedSEOContent seoContent;

	public ProductLocalizedSEOContent getSeoContent() {
		return this.seoContent;
	}

	public void setSeoContent(ProductLocalizedSEOContent seoContent) {
		this.seoContent = seoContent;
	}

}
