/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.storefront;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductUrl
{

	/**
	 * Get Resource Url for GetProducts
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/?filter={filter}&startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInventory
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInventoryUrl(String locationCodes, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/locationinventory?locationCodes={locationCodes}&responseFields={responseFields}");
		formatter.formatUrl("locationCodes", locationCodes);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProduct
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param supressOutOfStock404 Specifies whether to supress the 404 error when the product is out of stock.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductUrl(Boolean allowInactive, String productCode, Integer quantity, String responseFields, Boolean skipInventoryCheck, Boolean supressOutOfStock404, String variationProductCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}?variationProductCode={variationProductCode}&allowInactive={allowInactive}&skipInventoryCheck={skipInventoryCheck}&supressOutOfStock404={supressOutOfStock404}&quantity={quantity}&responseFields={responseFields}");
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("supressOutOfStock404", supressOutOfStock404);
		formatter.formatUrl("variationProductCode", variationProductCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductForIndexing
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param productVersion 
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductForIndexingUrl(String productCode, Long productVersion, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/indexing/{productCode}&productVersion={productVersion}?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("productVersion", productVersion);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ConfiguredProduct
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl configuredProductUrl(Boolean includeOptionDetails, String productCode, Integer quantity, String responseFields, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/configure?includeOptionDetails={includeOptionDetails}&skipInventoryCheck={skipInventoryCheck}&quantity={quantity}&responseFields={responseFields}");
		formatter.formatUrl("includeOptionDetails", includeOptionDetails);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateProduct
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateProductUrl(String productCode, Integer quantity, String responseFields, Boolean skipInventoryCheck)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/validate?skipInventoryCheck={skipInventoryCheck}&quantity={quantity}&responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("quantity", quantity);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ValidateDiscounts
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return   String Resource Url
	 */
	public static MozuUrl validateDiscountsUrl(Boolean allowInactive, Integer customerAccountId, String productCode, String responseFields, Boolean skipInventoryCheck, String variationProductCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/{productCode}/validateDiscounts?variationProductCode={variationProductCode}&customerAccountId={customerAccountId}&allowInactive={allowInactive}&skipInventoryCheck={skipInventoryCheck}&responseFields={responseFields}");
		formatter.formatUrl("allowInactive", allowInactive);
		formatter.formatUrl("customerAccountId", customerAccountId);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("skipInventoryCheck", skipInventoryCheck);
		formatter.formatUrl("variationProductCode", variationProductCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInventories
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInventoriesUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/storefront/products/locationinventory?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

