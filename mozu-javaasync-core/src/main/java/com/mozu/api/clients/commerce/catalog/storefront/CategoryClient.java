/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Storefront Categories resource to view the product category hierarchy as it appears to shoppers who are browsing the storefront. The hierarchy can be returned as a flat list or as a category tree.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient() throws Exception
	{
		return getCategoriesClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient=GetCategoriesClient( filter,  startIndex,  pageSize,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> getCategoriesClient(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoriesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.CategoryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(Integer categoryId) throws Exception
	{
		return getCategoryClient( categoryId,  null,  null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient=GetCategoryClient( categoryId,  allowInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, allow inactive categories to be retrieved in the category list response. If false, the categories retrieved will not include ones marked inactive.
	 * @param categoryId Unique identifier for the storefront container used to organize products.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Category>
	 * @see com.mozu.api.contracts.productruntime.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Category> getCategoryClient(Integer categoryId, Boolean allowInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryUrl(allowInactive, categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Category.class;
		MozuClient<com.mozu.api.contracts.productruntime.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient=GetCategoryTreeClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> getCategoryTreeClient() throws Exception
	{
		return getCategoryTreeClient( null);
	}

	/**
	 * Retrieves the list of product categories that appear on the storefront organized in a hierarchical format. Hidden categories do not appear in the list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient=GetCategoryTreeClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.CategoryCollection>
	 * @see com.mozu.api.contracts.productruntime.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> getCategoryTreeClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.CategoryUrl.getCategoryTreeUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.CategoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



