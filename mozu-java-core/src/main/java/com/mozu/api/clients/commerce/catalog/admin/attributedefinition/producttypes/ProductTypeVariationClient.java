/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.producttypes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the variations resource to preview possible product variations for a specific product type based on the option attributes defined for the product type, such as size or color.
 * </summary>
 */
public class ProductTypeVariationClient {
	
	/**
	 * Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient( productOptionsIn,  productTypeId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param productOptionsIn Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId) throws Exception
	{
		return generateProductVariationsClient( productOptionsIn,  productTypeId,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Generates the variations possible for a product associated with the product type based on the option values supplied in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GenerateProductVariationsClient( productOptionsIn,  productTypeId,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode 
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param dataViewMode DataViewMode
	 * @param productOptionsIn Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> generateProductVariationsClient(List<com.mozu.api.contracts.productadmin.ProductOption> productOptionsIn, Integer productTypeId, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.producttypes.ProductTypeVariationUrl.generateProductVariationsUrl(filter, pageSize, productCode, productTypeId, responseFields, sortBy, startIndex);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionsIn);
		return mozuClient;

	}

}



