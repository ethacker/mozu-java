/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use this subresource to manage documents in a document list.
 * </summary>
 */
public class DocumentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieve the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.getDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentContentClient(_dataViewMode,  documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId 
	 * @param documentListName 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId) throws Exception
	{
		return transformDocumentContent( documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Stream stream = document.transformDocumentContent( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * </code></pre></p>
	 * @param crop 
	 * @param documentId 
	 * @param documentListName 
	 * @param height 
	 * @param max 
	 * @param maxHeight 
	 * @param maxWidth 
	 * @param quality 
	 * @param width 
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream transformDocumentContent(String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.content.documentlists.DocumentClient.transformDocumentContentClient( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a document within the specified document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId) throws Exception
	{
		return getDocument( documentListName,  documentId,  null,  null);
	}

	/**
	 * Retrieves a document within the specified document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.getDocument( documentListName,  documentId,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param includeInactive 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document getDocument(String documentListName, String documentId, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentClient(_dataViewMode,  documentListName,  documentId,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName) throws Exception
	{
		return getDocuments( documentListName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	DocumentCollection documentCollection = document.getDocuments( documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param includeInactive 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getDocuments(String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.DocumentClient.getDocumentsClient(_dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new document in an defined document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		return createDocument( document,  documentListName,  null);
	}

	/**
	 * Creates a new document in an defined document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.createDocument( document,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document createDocument(com.mozu.api.contracts.content.Document document, String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.createDocumentClient(_dataViewMode,  document,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.updateDocumentContent( stream,  documentListName,  documentId,  contentType);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return 
	 * @see Stream
	 */
	public void updateDocumentContent(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Updates a document in a document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		return updateDocument( document,  documentListName,  documentId,  null);
	}

	/**
	 * Updates a document in a document list.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	Document document = document.updateDocument( document,  documentListName,  documentId,  responseFields);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public com.mozu.api.contracts.content.Document updateDocument(com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.Document> client = com.mozu.api.clients.content.documentlists.DocumentClient.updateDocumentClient( document,  documentListName,  documentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a specific document based on the specified document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.deleteDocument( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return 
	 */
	public void deleteDocument(String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specification, by supplying the document ID.
	 * <p><pre><code>
	 *	Document document = new Document();
	 *	document.deleteDocumentContent( documentListName,  documentId);
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return 
	 */
	public void deleteDocumentContent(String documentListName, String documentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.documentlists.DocumentClient.deleteDocumentContentClient( documentListName,  documentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



