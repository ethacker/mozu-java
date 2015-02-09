/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.entitylists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class EntityUrl
{

	/**
	 * Get Resource Url for GetEntity
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getEntityUrl(String entityListFullName, String id, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/entities/{id}?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("id", id);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetEntities
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @return   String Resource Url
	 */
	public static MozuUrl getEntitiesUrl(String entityListFullName, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/entities?pageSize={pageSize}&startIndex={startIndex}&filter={filter}&sortBy={sortBy}&responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for InsertEntity
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl insertEntityUrl(String entityListFullName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/entities/?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateEntity
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateEntityUrl(String entityListFullName, String id, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/entities/{id}?responseFields={responseFields}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("id", id);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteEntity
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteEntityUrl(String entityListFullName, String id)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/entitylists/{entityListFullName}/entities/{id}");
		formatter.formatUrl("entityListFullName", entityListFullName);
		formatter.formatUrl("id", id);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

