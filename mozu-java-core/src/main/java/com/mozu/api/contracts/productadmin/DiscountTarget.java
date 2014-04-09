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
import com.mozu.api.contracts.productadmin.TargetedCategory;
import com.mozu.api.contracts.productadmin.TargetedProduct;
import com.mozu.api.contracts.productadmin.TargetedShippingMethod;

/**
 *	Specifies what to discount such as the type of discount and which products, categories, or shipping methods are eligible for the discount. Discount types can include the percentage off, specific monetary amount, or free shipping. This parameter also specifies the minimum monetary amount that the order must meet for the discount to apply.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountTarget implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the target discount applies to all products sold on the storefront.
	 */
	protected Boolean includeAllProducts;

	public Boolean getIncludeAllProducts() {
		return this.includeAllProducts;
	}

	public void setIncludeAllProducts(Boolean includeAllProducts) {
		this.includeAllProducts = includeAllProducts;
	}

	/**
	 * The type of target to which the discount applies, such as a product or shipping.
	 */
	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The product categories to which the discount can apply.
	 */
	protected List<TargetedCategory> categories;
	public List<TargetedCategory> getCategories() {
		return this.categories;
	}
	public void setCategories(List<TargetedCategory> categories) {
		this.categories = categories;
	}

	/**
	 * Array list of categories to exclude for this discount.
	 */
	protected List<TargetedCategory> excludedCategories;
	public List<TargetedCategory> getExcludedCategories() {
		return this.excludedCategories;
	}
	public void setExcludedCategories(List<TargetedCategory> excludedCategories) {
		this.excludedCategories = excludedCategories;
	}

	/**
	 * Array list of products to exclude for this discount.
	 */
	protected List<TargetedProduct> excludedProducts;
	public List<TargetedProduct> getExcludedProducts() {
		return this.excludedProducts;
	}
	public void setExcludedProducts(List<TargetedProduct> excludedProducts) {
		this.excludedProducts = excludedProducts;
	}

	/**
	 * The products to which the discount can apply.
	 */
	protected List<TargetedProduct> products;
	public List<TargetedProduct> getProducts() {
		return this.products;
	}
	public void setProducts(List<TargetedProduct> products) {
		this.products = products;
	}

	/**
	 * The list of shipping method parameters that describe a method including the code, localized content, and audit information.
	 */
	protected List<TargetedShippingMethod> shippingMethods;
	public List<TargetedShippingMethod> getShippingMethods() {
		return this.shippingMethods;
	}
	public void setShippingMethods(List<TargetedShippingMethod> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

}