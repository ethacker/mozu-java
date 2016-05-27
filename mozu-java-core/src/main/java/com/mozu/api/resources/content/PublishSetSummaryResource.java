/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * content/publishsets related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublishSetSummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublishSetSummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Returns a List of current Publishing sets with counts of drafts in each
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = publishsetsummary.getPublishSets();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets() throws Exception
	{
		return getPublishSets( null,  null,  null);
	}

	/**
	 * Returns a List of current Publishing sets with counts of drafts in each
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = publishsetsummary.getPublishSets( pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.PublishSetSummaryPagedCollection getPublishSets(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetsClient( pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve a paged collection of publish set Items.
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = publishsetsummary.getPublishSetItems( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(String code) throws Exception
	{
		return getPublishSetItems( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieve a paged collection of publish set Items.
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = publishsetsummary.getPublishSetItems( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection getPublishSetItems(String code, Integer pageSize, Integer startIndex, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.PublishSetSummaryClient.getPublishSetItemsClient( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.deletePublishSet( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return object
	 * @see object
	 */
	public Object deletePublishSet(String code) throws Exception
	{
		return deletePublishSet( code,  null,  null);
	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.deletePublishSet( code,  shouldDiscard,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param shouldDiscard Specifies whether to discard the pending content changes assigned to the content publish set when the publish set is deleted.
	 * @return object
	 * @see object
	 */
	public Object deletePublishSet(String code, Boolean shouldDiscard, String responseFields) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.deletePublishSetClient( code,  shouldDiscard,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.addPublishSetItems( itemsToPublish,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param itemsToPublish Mozu.Content.Contracts.AddOrDeletePublishItem ApiType DOCUMENT_HERE 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public Object addPublishSetItems(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code) throws Exception
	{
		return addPublishSetItems( itemsToPublish,  code,  null);
	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 *	PublishSetSummary publishsetsummary = new PublishSetSummary();
	 *	object object = publishsetsummary.addPublishSetItems( itemsToPublish,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param itemsToPublish Mozu.Content.Contracts.AddOrDeletePublishItem ApiType DOCUMENT_HERE 
	 * @return object
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public Object addPublishSetItems(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, String responseFields) throws Exception
	{
		MozuClient<Object> client = com.mozu.api.clients.content.PublishSetSummaryClient.addPublishSetItemsClient( itemsToPublish,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



