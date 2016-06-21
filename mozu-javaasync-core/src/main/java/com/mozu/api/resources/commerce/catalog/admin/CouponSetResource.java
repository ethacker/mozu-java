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
 * Use the Coupon Sets resource to view and create coupon sets. You can use coupon sets to group multiple coupon codes together and associate them with one or more discounts.
 * </summary>
 */
public class CouponSetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CouponSetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of coupon sets according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets() throws Exception
	{
		return getCouponSets( null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of coupon sets according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public CountDownLatch getCouponSetsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.CouponSetCollection> callback) throws Exception
	{
		return getCouponSetsAsync( null,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of coupon sets according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSetCollection couponSetCollection = couponset.getCouponSets( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public com.mozu.api.contracts.productadmin.CouponSetCollection getCouponSets(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of coupon sets according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSets( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSetCollection
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public CountDownLatch getCouponSetsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSetCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Returns a single
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.getCouponSet( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet getCouponSet(String couponSetCode) throws Exception
	{
		return getCouponSet( couponSetCode,  null,  null);
	}

	/**
	 * Returns a single
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSet( couponSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch getCouponSetAsync(String couponSetCode, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		return getCouponSetAsync( couponSetCode,  null,  null, callback);
	}

	/**
	 * Returns a single
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.getCouponSet( couponSetCode,  includeCounts,  responseFields);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet getCouponSet(String couponSetCode, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetClient( couponSetCode,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Returns a single
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getCouponSet( couponSetCode,  includeCounts,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch getCouponSetAsync(String couponSetCode, Boolean includeCounts, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getCouponSetClient( couponSetCode,  includeCounts,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Returns a random, unique four character coupon set code.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode();
	 * </code></pre></p>
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode() throws Exception
	{
		return getUniqueCouponSetCode( null);
	}

	/**
	 * Returns a random, unique four character coupon set code.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getUniqueCouponSetCode( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getUniqueCouponSetCodeAsync( AsyncCallback<String> callback) throws Exception
	{
		return getUniqueCouponSetCodeAsync( null, callback);
	}

	/**
	 * Returns a random, unique four character coupon set code.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	string string = couponset.getUniqueCouponSetCode( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return string
	 * @see string
	 */
	public String getUniqueCouponSetCode(String responseFields) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getUniqueCouponSetCodeClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Returns a random, unique four character coupon set code.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.getUniqueCouponSetCode( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return string
	 * @see string
	 */
	public CountDownLatch getUniqueCouponSetCodeAsync(String responseFields, AsyncCallback<String> callback) throws Exception
	{
		MozuClient<String> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.getUniqueCouponSetCodeClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Adds a new coupon set.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet);
	 * </code></pre></p>
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSet( couponSet,  null);
	}

	/**
	 * Adds a new coupon set.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.addCouponSet( couponSet, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch addCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		return addCouponSetAsync( couponSet,  null, callback);
	}

	/**
	 * Adds a new coupon set.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.addCouponSet( couponSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet addCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.addCouponSetClient( couponSet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new coupon set.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.addCouponSet( couponSet,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch addCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.addCouponSetClient( couponSet,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Validates the coupon set code and tests it for uniqueness.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	couponset.validateUniqueCouponSetCode( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return 
	 */
	public void validateUniqueCouponSetCode(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.validateUniqueCouponSetCodeClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Update a representation. You can not update the Code or ID once the set is created.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.updateCouponSet( couponSet,  couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet updateCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode) throws Exception
	{
		return updateCouponSet( couponSet,  couponSetCode,  null);
	}

	/**
	 * Update a representation. You can not update the Code or ID once the set is created.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.updateCouponSet( couponSet,  couponSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch updateCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		return updateCouponSetAsync( couponSet,  couponSetCode,  null, callback);
	}

	/**
	 * Update a representation. You can not update the Code or ID once the set is created.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CouponSet couponSet = couponset.updateCouponSet( couponSet,  couponSetCode,  responseFields);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public com.mozu.api.contracts.productadmin.CouponSet updateCouponSet(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.updateCouponSetClient( couponSet,  couponSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update a representation. You can not update the Code or ID once the set is created.
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	CountDownLatch latch = couponset.updateCouponSet( couponSet,  couponSetCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public CountDownLatch updateCouponSetAsync(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.CouponSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.updateCouponSetClient( couponSet,  couponSetCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * admin-couponsets Delete DeleteCouponSet description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	CouponSet couponset = new CouponSet();
	 *	couponset.deleteCouponSet( couponSetCode);
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return 
	 */
	public void deleteCouponSet(String couponSetCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CouponSetClient.deleteCouponSetClient( couponSetCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



