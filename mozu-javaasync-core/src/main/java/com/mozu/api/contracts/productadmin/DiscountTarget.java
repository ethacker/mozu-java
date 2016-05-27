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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.TargetedCategory;
import com.mozu.api.contracts.productadmin.TargetedProduct;
import com.mozu.api.contracts.productadmin.TargetedShippingMethod;
import com.mozu.api.contracts.productadmin.TargetedShippingZone;

/**
 *	Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountTarget implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean appliesToLeastExpensiveProductsFirst;

	public Boolean getAppliesToLeastExpensiveProductsFirst() {
		return this.appliesToLeastExpensiveProductsFirst;
	}

	public void setAppliesToLeastExpensiveProductsFirst(Boolean appliesToLeastExpensiveProductsFirst) {
		this.appliesToLeastExpensiveProductsFirst = appliesToLeastExpensiveProductsFirst;
	}

	protected  String excludedCategoriesOperator;

	public String getExcludedCategoriesOperator() {
		return this.excludedCategoriesOperator;
	}

	public void setExcludedCategoriesOperator(String excludedCategoriesOperator) {
		this.excludedCategoriesOperator = excludedCategoriesOperator;
	}

	protected  Boolean excludeItemsWithExistingProductDiscounts;

	public Boolean getExcludeItemsWithExistingProductDiscounts() {
		return this.excludeItemsWithExistingProductDiscounts;
	}

	public void setExcludeItemsWithExistingProductDiscounts(Boolean excludeItemsWithExistingProductDiscounts) {
		this.excludeItemsWithExistingProductDiscounts = excludeItemsWithExistingProductDiscounts;
	}

	protected  Boolean excludeItemsWithExistingShippingDiscounts;

	public Boolean getExcludeItemsWithExistingShippingDiscounts() {
		return this.excludeItemsWithExistingShippingDiscounts;
	}

	public void setExcludeItemsWithExistingShippingDiscounts(Boolean excludeItemsWithExistingShippingDiscounts) {
		this.excludeItemsWithExistingShippingDiscounts = excludeItemsWithExistingShippingDiscounts;
	}

	/**
	 * If true, the target discount applies to all products sold on the site, regardless of product category.
	 */
	protected  Boolean includeAllProducts;

	public Boolean getIncludeAllProducts() {
		return this.includeAllProducts;
	}

	public void setIncludeAllProducts(Boolean includeAllProducts) {
		this.includeAllProducts = includeAllProducts;
	}

	protected  String includedCategoriesOperator;

	public String getIncludedCategoriesOperator() {
		return this.includedCategoriesOperator;
	}

	public void setIncludedCategoriesOperator(String includedCategoriesOperator) {
		this.includedCategoriesOperator = includedCategoriesOperator;
	}

	/**
	 * When a condition is specified, this property limits the number of items that are targeted for each discount redemption with an order. If multiple redemptions are allowed for each order then multiples of this value are allowed in multiples of the associated condition. If no condition is specified, then this value is not used. If null and condition exists, then defaults to 1.
	 */
	protected  Integer maximumQuantityPerRedemption;

	public Integer getMaximumQuantityPerRedemption() {
		return this.maximumQuantityPerRedemption;
	}

	public void setMaximumQuantityPerRedemption(Integer maximumQuantityPerRedemption) {
		this.maximumQuantityPerRedemption = maximumQuantityPerRedemption;
	}

	/**
	 * Properties of the object to which this discount is targeted, which can be Product or Shipping. If the discount type is Product, the target properties describe the product or product categories to which the discount applies. If the discount type is Shipping, the target properties describe the shipping methods eligible for the discount.
	 */
	protected  String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The product categories to which the discount can apply. When a discount applies to a category, all products in the category are eligible for the discount.
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
	 * List of  product codes that represent the products to which the discount can apply.
	 */
	protected List<TargetedProduct> products;
	public List<TargetedProduct> getProducts() {
		return this.products;
	}
	public void setProducts(List<TargetedProduct> products) {
		this.products = products;
	}

	/**
	 * The list of shipping method codes that represents the shipping service types to which the discount can apply.
	 */
	protected List<TargetedShippingMethod> shippingMethods;
	public List<TargetedShippingMethod> getShippingMethods() {
		return this.shippingMethods;
	}
	public void setShippingMethods(List<TargetedShippingMethod> shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

	protected List<TargetedShippingZone> shippingZones;
	public List<TargetedShippingZone> getShippingZones() {
		return this.shippingZones;
	}
	public void setShippingZones(List<TargetedShippingZone> shippingZones) {
		this.shippingZones = shippingZones;
	}


}
