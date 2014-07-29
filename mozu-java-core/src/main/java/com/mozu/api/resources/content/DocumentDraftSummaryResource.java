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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the document publishing subresource to manage and publish document drafts in the Content service.
 * </summary>
 */
public class DocumentDraftSummaryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public DocumentDraftSummaryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = documentdraftsummary.ListDocumentDraftSummaries(dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return listDocumentDraftSummaries(dataViewMode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = documentdraftsummary.ListDocumentDraftSummaries(dataViewMode,  pageSize,  startIndex,  documentLists,  responseFields);
	 * </code></pre></p>
	 * @param documentLists Lists that contain the document drafts.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection listDocumentDraftSummaries(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String documentLists, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> client = com.mozu.api.clients.content.DocumentDraftSummaryClient.listDocumentDraftSummariesClient(dataViewMode,  pageSize,  startIndex,  documentLists,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.DeleteDocumentDrafts(dataViewMode,  documentIds);
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return 
	 * @see string
	 */
	public void deleteDocumentDrafts(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds) throws Exception
	{
		deleteDocumentDrafts(dataViewMode,  documentIds,  null);
	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.DeleteDocumentDrafts(dataViewMode,  documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return 
	 * @see string
	 */
	public void deleteDocumentDrafts(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.DocumentDraftSummaryClient.deleteDocumentDraftsClient(dataViewMode,  documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.PublishDocuments(dataViewMode,  documentIds);
	 * </code></pre></p>
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return 
	 * @see string
	 */
	public void publishDocuments(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds) throws Exception
	{
		publishDocuments(dataViewMode,  documentIds,  null);
	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 *	DocumentDraftSummary documentdraftsummary = new DocumentDraftSummary();
	 *	documentdraftsummary.PublishDocuments(dataViewMode,  documentIds,  documentLists);
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to publish.
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return 
	 * @see string
	 */
	public void publishDocuments(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds, String documentLists) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.DocumentDraftSummaryClient.publishDocumentsClient(dataViewMode,  documentIds,  documentLists);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



