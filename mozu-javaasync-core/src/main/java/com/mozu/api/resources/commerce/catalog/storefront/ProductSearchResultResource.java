/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

import com.mozu.api.ApiContext;
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
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ProductSearchResultResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.search();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search() throws Exception
	{
		return search( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	CountDownLatch latch = productsearchresult.search( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public CountDownLatch searchAsync( AsyncCallback<com.mozu.api.contracts.productruntime.ProductSearchResult> callback) throws Exception
	{
		return searchAsync( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	ProductSearchResult productSearchResult = productsearchresult.search( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param enableSearchTuningRules 
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query A query entered for searches and facet range.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param searchSettings 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleContext 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public com.mozu.api.contracts.productruntime.ProductSearchResult search(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.searchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	CountDownLatch latch = productsearchresult.search( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param enableSearchTuningRules 
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query A query entered for searches and facet range.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param searchSettings 
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleContext 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.ProductSearchResult
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public CountDownLatch searchAsync(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productruntime.ProductSearchResult> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.searchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestionResult searchSuggestionResult = productsearchresult.suggest();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest() throws Exception
	{
		return suggest( null,  null,  null,  null);
	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	CountDownLatch latch = productsearchresult.suggest( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public CountDownLatch suggestAsync( AsyncCallback<com.mozu.api.contracts.productruntime.SearchSuggestionResult> callback) throws Exception
	{
		return suggestAsync( null,  null,  null,  null, callback);
	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	SearchSuggestionResult searchSuggestionResult = productsearchresult.suggest( query,  groups,  pageSize,  responseFields);
	 * </code></pre></p>
	 * @param groups 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query A query entered for searches and facet range.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public com.mozu.api.contracts.productruntime.SearchSuggestionResult suggest(String query, String groups, Integer pageSize, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.suggestClient( query,  groups,  pageSize,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 *	ProductSearchResult productsearchresult = new ProductSearchResult();
	 *	CountDownLatch latch = productsearchresult.suggest( query,  groups,  pageSize,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param groups 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query A query entered for searches and facet range.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public CountDownLatch suggestAsync(String query, String groups, Integer pageSize, String responseFields, AsyncCallback<com.mozu.api.contracts.productruntime.SearchSuggestionResult> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> client = com.mozu.api.clients.commerce.catalog.storefront.ProductSearchResultClient.suggestClient( query,  groups,  pageSize,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



