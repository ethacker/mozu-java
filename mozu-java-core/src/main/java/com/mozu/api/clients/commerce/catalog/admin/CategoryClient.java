/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getCategoriesClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param fields 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoriesUrl(fields, filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category for which to retrieve subcategories.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return getChildCategoriesClient(dataViewMode,  categoryId,  null);
	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient(dataViewMode,  categoryId,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category for which to retrieve subcategories.
	 * @param fields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getChildCategoriesUrl(categoryId, fields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return getCategoryClient(dataViewMode,  categoryId,  null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient(dataViewMode,  categoryId,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @param fields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoryUrl(categoryId, fields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient(dataViewMode,  category);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param category Properties of the new category to create. You must specify a name and parent category if you want to create it as a subcategory.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategoryClient(dataViewMode,  category,  null,  null);
	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient(dataViewMode,  category,  incrementSequence,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param fields 
	 * @param incrementSequence 
	 * @param category Properties of the new category to create. You must specify a name and parent category if you want to create it as a subcategory.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.addCategoryUrl(fields, incrementSequence);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient(dataViewMode,  category,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category Properties of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategoryClient(dataViewMode,  category,  categoryId,  null,  null);
	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient(dataViewMode,  category,  categoryId,  cascadeVisibility,  fields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param fields 
	 * @param category Properties of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String fields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.updateCategoryUrl(cascadeVisibility, categoryId, fields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient(dataViewMode,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId) throws Exception
	{
		return deleteCategoryByIdClient(dataViewMode,  categoryId,  null);
	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient(dataViewMode,  categoryId,  cascadeDelete);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cascadeDelete If true, also delete all subcategories associated with the specified category.
	 * @param categoryId Unique identifier of the category to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(com.mozu.api.DataViewMode dataViewMode, Integer categoryId, Boolean cascadeDelete) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.deleteCategoryByIdUrl(cascadeDelete, categoryId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



