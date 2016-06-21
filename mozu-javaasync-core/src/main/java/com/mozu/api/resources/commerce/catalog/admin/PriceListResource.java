/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

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
 * Allows you to create and manage products that you will offer on your storefront. You can create products with options that a shopper configures (such as a T-shirt color and size). You can set discounts and sale prices for your products, manage product inventory, and more.
 * </summary>
 */
public class PriceListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PriceListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceListCollection priceListCollection = pricelist.getPriceLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists() throws Exception
	{
		return getPriceLists( null,  null,  null,  null,  null);
	}

	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceLists( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public CountDownLatch getPriceListsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.PriceListCollection> callback) throws Exception
	{
		return getPriceListsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceListCollection priceListCollection = pricelist.getPriceLists( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceLists( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public CountDownLatch getPriceListsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList getPriceList(String priceListCode) throws Exception
	{
		return getPriceList( priceListCode,  null);
	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceList( priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch getPriceListAsync(String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return getPriceListAsync( priceListCode,  null, callback);
	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList getPriceList(String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListClient( priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceList( priceListCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch getPriceListAsync(String priceListCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListClient( priceListCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.addPriceList( priceList);
	 * </code></pre></p>
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList addPriceList(com.mozu.api.contracts.productadmin.PriceList priceList) throws Exception
	{
		return addPriceList( priceList,  null);
	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.addPriceList( priceList, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch addPriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return addPriceListAsync( priceList,  null, callback);
	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.addPriceList( priceList,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList addPriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.addPriceListClient( priceList,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.addPriceList( priceList,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch addPriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.addPriceListClient( priceList,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.updatePriceList( priceList,  priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList updatePriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode) throws Exception
	{
		return updatePriceList( priceList,  priceListCode,  null);
	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.updatePriceList( priceList,  priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch updatePriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return updatePriceListAsync( priceList,  priceListCode,  null, callback);
	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.updatePriceList( priceList,  priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList updatePriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.updatePriceListClient( priceList,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.updatePriceList( priceList,  priceListCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch updatePriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.updatePriceListClient( priceList,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * admin-pricelists Delete DeletePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	pricelist.deletePriceList( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return 
	 */
	public void deletePriceList(String priceListCode) throws Exception
	{
		deletePriceList( priceListCode,  null);
	}

	/**
	 * admin-pricelists Delete DeletePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	pricelist.deletePriceList( priceListCode,  cascadeDeleteEntries);
	 * </code></pre></p>
	 * @param cascadeDeleteEntries Specifies whether to deletes all price list entries associated with the price list.
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return 
	 */
	public void deletePriceList(String priceListCode, Boolean cascadeDeleteEntries) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.deletePriceListClient( priceListCode,  cascadeDeleteEntries);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



