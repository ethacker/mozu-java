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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Publishing resource to publish or discard pending changes to product definitions in the master catalog.
 * </summary>
 */
public class PublishingScopeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public PublishingScopeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public PublishingScopeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.getPublishSet( publishSetCode);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet getPublishSet(String publishSetCode) throws Exception
	{
		return getPublishSet( publishSetCode,  null);
	}

	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.getPublishSet( publishSetCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch getPublishSetAsync(String publishSetCode, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		return getPublishSetAsync( publishSetCode,  null, callback);
	}

	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.getPublishSet( publishSetCode,  responseFields);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet getPublishSet(String publishSetCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetClient( publishSetCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single PublishSet.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.getPublishSet( publishSetCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch getPublishSetAsync(String publishSetCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetClient( publishSetCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSetCollection publishSetCollection = publishingscope.getPublishSets();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets() throws Exception
	{
		return getPublishSets( null);
	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.getPublishSets( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public CountDownLatch getPublishSetsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.PublishSetCollection> callback) throws Exception
	{
		return getPublishSetsAsync( null, callback);
	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSetCollection publishSetCollection = publishingscope.getPublishSets( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public com.mozu.api.contracts.productadmin.PublishSetCollection getPublishSets(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of PublishSets including the product counts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.getPublishSets( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.PublishSetCollection
	 * @see com.mozu.api.contracts.productadmin.PublishSetCollection
	 */
	public CountDownLatch getPublishSetsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSetCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSetCollection> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.getPublishSetsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the draft version of product changes for each product code specified in the request.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.discardDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public void discardDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.discardDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Publishes the draft version of product changes for each product code specified in the request, and changes the product publish state to "live".
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.publishDrafts( publishScope);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishScope Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.PublishingScope
	 */
	public void publishDrafts(com.mozu.api.contracts.productadmin.PublishingScope publishScope) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.publishDraftsClient(_dataViewMode,  publishScope);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(com.mozu.api.contracts.productadmin.PublishSet publishSet) throws Exception
	{
		return assignProductsToPublishSet( publishSet,  null);
	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.assignProductsToPublishSet( publishSet, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch assignProductsToPublishSetAsync(com.mozu.api.contracts.productadmin.PublishSet publishSet, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		return assignProductsToPublishSetAsync( publishSet,  null, callback);
	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	PublishSet publishSet = publishingscope.assignProductsToPublishSet( publishSet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public com.mozu.api.contracts.productadmin.PublishSet assignProductsToPublishSet(com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.assignProductsToPublishSetClient( publishSet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Assigns a product draft to a specified publish set.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	CountDownLatch latch = publishingscope.assignProductsToPublishSet( publishSet,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param publishSet Mozu.ProductAdmin.Contracts.PublishSet ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 * @see com.mozu.api.contracts.productadmin.PublishSet
	 */
	public CountDownLatch assignProductsToPublishSetAsync(com.mozu.api.contracts.productadmin.PublishSet publishSet, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PublishSet> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PublishSet> client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.assignProductsToPublishSetClient( publishSet,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes all details about a PublishSet from the product service. If the discardDrafts param is true, it also deletes the product drafts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.deletePublishSet( publishSetCode);
	 * </code></pre></p>
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deletePublishSet(String publishSetCode) throws Exception
	{
		deletePublishSet( publishSetCode,  null);
	}

	/**
	 * Removes all details about a PublishSet from the product service. If the discardDrafts param is true, it also deletes the product drafts.
	 * <p><pre><code>
	 *	PublishingScope publishingscope = new PublishingScope();
	 *	publishingscope.deletePublishSet( publishSetCode,  discardDrafts);
	 * </code></pre></p>
	 * @param discardDrafts Specifies whether to discard all the drafts assigned to the publish set when the publish set is deleted.
	 * @param publishSetCode The unique identifier of the publish set.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deletePublishSet(String publishSetCode, Boolean discardDrafts) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PublishingScopeClient.deletePublishSetClient( publishSetCode,  discardDrafts);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



