/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeClient {
	
	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient=GetProductTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductTypeCollection productTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductTypeCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> getProductTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductTypesClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient=GetProductTypesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductTypeCollection productTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductTypeCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> getProductTypesClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.getProductTypesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductTypeCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=GetProductTypeClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> getProductTypeClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		return getProductTypeClient(dataViewMode,  productTypeId,  null);
	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=GetProductTypeClient(dataViewMode,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> getProductTypeClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.getProductTypeUrl(productTypeId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=AddProductTypeClient(dataViewMode,  productType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> addProductTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType) throws Exception
	{
		return addProductTypeClient(dataViewMode,  productType,  null);
	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=AddProductTypeClient(dataViewMode,  productType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> addProductTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.addProductTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=UpdateProductTypeClient(dataViewMode,  productType,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> updateProductTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId) throws Exception
	{
		return updateProductTypeClient(dataViewMode,  productType,  productTypeId,  null);
	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient=UpdateProductTypeClient(dataViewMode,  productType,  productTypeId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductType productType = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductType>
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductType> updateProductTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.updateProductTypeUrl(productTypeId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductType.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productType);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the product type by providing the product type ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductTypeClient(dataViewMode,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductTypeClient(com.mozu.api.DataViewMode dataViewMode, Integer productTypeId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.ProductTypeUrl.deleteProductTypeUrl(productTypeId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



