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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Document Types resource to view the document types supplied by the Content API.
 * </summary>
 */
public class DocumentTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentTypeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentTypeCollection documentTypeCollection = documenttype.getDocumentTypes();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes() throws Exception
	{
		return getDocumentTypes( null,  null,  null);
	}

	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.getDocumentTypes( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public CountDownLatch getDocumentTypesAsync( AsyncCallback<com.mozu.api.contracts.content.DocumentTypeCollection> callback) throws Exception
	{
		return getDocumentTypesAsync( null,  null,  null, callback);
	}

	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentTypeCollection documentTypeCollection = documenttype.getDocumentTypes( pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypesClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a paged list of the system-defined document types.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.getDocumentTypes( pageSize,  startIndex,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public CountDownLatch getDocumentTypesAsync(Integer pageSize, Integer startIndex, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentTypeCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypesClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.getDocumentType( documentTypeName);
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType getDocumentType(String documentTypeName) throws Exception
	{
		return getDocumentType( documentTypeName,  null);
	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.getDocumentType( documentTypeName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch getDocumentTypeAsync(String documentTypeName, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		return getDocumentTypeAsync( documentTypeName,  null, callback);
	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.getDocumentType( documentTypeName,  responseFields);
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType getDocumentType(String documentTypeName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypeClient(_dataViewMode,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a system-defined document type.
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.getDocumentType( documentTypeName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch getDocumentTypeAsync(String documentTypeName, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypeClient(_dataViewMode,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.createDocumentType( documentType);
	 * </code></pre></p>
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType createDocumentType(com.mozu.api.contracts.content.DocumentType documentType) throws Exception
	{
		return createDocumentType( documentType,  null);
	}

	/**
	 * Creates a new DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.createDocumentType( documentType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch createDocumentTypeAsync(com.mozu.api.contracts.content.DocumentType documentType, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		return createDocumentTypeAsync( documentType,  null, callback);
	}

	/**
	 * Creates a new DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.createDocumentType( documentType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType createDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.createDocumentTypeClient(_dataViewMode,  documentType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.createDocumentType( documentType,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch createDocumentTypeAsync(com.mozu.api.contracts.content.DocumentType documentType, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.createDocumentTypeClient(_dataViewMode,  documentType,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates a DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.updateDocumentType( documentType,  documentTypeName);
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType updateDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName) throws Exception
	{
		return updateDocumentType( documentType,  documentTypeName,  null);
	}

	/**
	 * Updates a DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.updateDocumentType( documentType,  documentTypeName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch updateDocumentTypeAsync(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		return updateDocumentTypeAsync( documentType,  documentTypeName,  null, callback);
	}

	/**
	 * Updates a DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.updateDocumentType( documentType,  documentTypeName,  responseFields);
	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType updateDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.updateDocumentTypeClient( documentType,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a DocumentType
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	CountDownLatch latch = documenttype.updateDocumentType( documentType,  documentTypeName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentTypeName The name of the document type to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param documentType The type of documents used in the CMS such as "web_page" or "template" or "image_url".
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public CountDownLatch updateDocumentTypeAsync(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.updateDocumentTypeClient( documentType,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



