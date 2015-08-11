/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.ProductImage;

/**
 *	Content associated with a product definition that can be localized.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Description defined for metadata, used to interally manage data, in the language specified by the `localeCode`. This content is used by categories, products, localized content, and SEO content.
	 */
	protected String metaTagDescription;

	public String getMetaTagDescription() {
		return this.metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	/**
	 * Keywords defined for  metadata, used to internally manage data, in the language specified by the `localeCode`. Keywords are used by content for categories, products, localized content, and SEO content.
	 */
	protected String metaTagKeywords;

	public String getMetaTagKeywords() {
		return this.metaTagKeywords;
	}

	public void setMetaTagKeywords(String metaTagKeywords) {
		this.metaTagKeywords = metaTagKeywords;
	}

	/**
	 * Title defined for  metadata, used to internally manage data, in the language specified by the `localeCode`. Titles are used by content for categories, products, localized content, and SEO content.
	 */
	protected String metaTagTitle;

	public String getMetaTagTitle() {
		return this.metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
	}

	/**
	 * Lengthy full description for a product description, displayed on product detail pages within the storefront.
	 */
	protected String productFullDescription;

	public String getProductFullDescription() {
		return this.productFullDescription;
	}

	public void setProductFullDescription(String productFullDescription) {
		this.productFullDescription = productFullDescription;
	}

	/**
	 * The name of the product that represents a line item in a taxable order or product bundle.
	 */
	protected String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Brief text description of the product or component in a product bundle, typically used when the product is displayed in a list or in search results.
	 */
	protected String productShortDescription;

	public String getProductShortDescription() {
		return this.productShortDescription;
	}

	public void setProductShortDescription(String productShortDescription) {
		this.productShortDescription = productShortDescription;
	}

	/**
	 * The search engine optimized, human-readable portion of the URL. The content is localized according to the product's `localeCode`.
	 */
	protected String seoFriendlyUrl;

	public String getSeoFriendlyUrl() {
		return this.seoFriendlyUrl;
	}

	public void setSeoFriendlyUrl(String seoFriendlyUrl) {
		this.seoFriendlyUrl = seoFriendlyUrl;
	}

	/**
	 * List of image files associated with a product. This content may include the image file URL, name, and other information as available.
	 */
	protected List<ProductImage> productImages;
	public List<ProductImage> getProductImages() {
		return this.productImages;
	}
	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

}