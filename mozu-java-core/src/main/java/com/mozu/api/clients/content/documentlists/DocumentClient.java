/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content.documentlists;

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
public class DocumentClient {
	
	/**
	 * Retrieve the content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=GetDocumentContentClient(dataViewMode,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> getDocumentContentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentContentUrl(documentId, documentListName);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Performs transformations on a document. For example, resizing an image.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=TransformDocumentContentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformDocumentContentClient(String documentListName, String documentId) throws Exception
	{
		return transformDocumentContentClient( documentListName,  documentId,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Performs transformations on a document. For example, resizing an image.
	 * <p><pre><code>
	 * MozuClient<java.io.InputStream> mozuClient=TransformDocumentContentClient( documentListName,  documentId,  width,  height,  max,  maxWidth,  maxHeight,  crop,  quality);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Stream stream = client.Result();
	 * </code></pre></p>
	 * @param crop Crops the image based on the specified coordinates. The reference point for positive coordinates is the top-left corner of the image, and the reference point for negative coordinates is the bottom-right corner of the image.Usage: Example:  removes 10 pixels from all edges of the image.  leaves the image uncropped.
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param height Specifies an exact height dimension for the image, in pixels.
	 * @param max Specifies a pixel limitation for the largest side of an image.
	 * @param maxHeight Specifies a pixel limitation for the height of the image, preserving the aspect ratio if the image needs resizing.
	 * @param maxWidth Specifies a pixel limitation for the width of the image, preserving the aspect ratio if the image needs resizing.
	 * @param quality Adjusts the image compression. Accepts values from 0-100, where 100 = highest quality, least compression.
	 * @param width Specifies an exact width dimension for the image, in pixels.
	 * @return Mozu.Api.MozuClient <Stream>
	 * @see Stream
	 */
	public static MozuClient<java.io.InputStream> transformDocumentContentClient(String documentListName, String documentId, Integer width, Integer height, Integer max, Integer maxWidth, Integer maxHeight, String crop, Integer quality) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.transformDocumentContentUrl(crop, documentId, documentListName, height, max, maxHeight, maxWidth, quality, width);
		String verb = "GET";
		Class<?> clz = java.io.InputStream.class;
		MozuClient<java.io.InputStream> mozuClient = (MozuClient<java.io.InputStream>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a document within the specified document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetDocumentClient(dataViewMode,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId) throws Exception
	{
		return getDocumentClient(dataViewMode,  documentListName,  documentId,  null,  null);
	}

	/**
	 * Retrieves a document within the specified document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=GetDocumentClient(dataViewMode,  documentListName,  documentId,  includeInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param includeInactive Include inactive content.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> getDocumentClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String documentId, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentUrl(documentId, documentListName, includeInactive, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetDocumentsClient(dataViewMode,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		return getDocumentsClient(dataViewMode,  documentListName,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of documents according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetDocumentsClient(dataViewMode,  documentListName,  filter,  sortBy,  pageSize,  startIndex,  includeInactive,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param includeInactive Include inactive content.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String filter, String sortBy, Integer pageSize, Integer startIndex, Boolean includeInactive, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.getDocumentsUrl(documentListName, filter, includeInactive, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new document in an defined document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=CreateDocumentClient(dataViewMode,  document,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> createDocumentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName) throws Exception
	{
		return createDocumentClient(dataViewMode,  document,  documentListName,  null);
	}

	/**
	 * Creates a new document in an defined document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=CreateDocumentClient(dataViewMode,  document,  documentListName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> createDocumentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.Document document, String documentListName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.createDocumentUrl(documentListName, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(document);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates the binary data or content associated with a document, such as a product image or PDF specifications file, by supplying the document ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=UpdateDocumentContentClient( stream,  documentListName,  documentId,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Mozu.Api.MozuClient 
	 * @see Stream
	 */
	public static MozuClient updateDocumentContentClient(java.io.InputStream stream, String documentListName, String documentId, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.updateDocumentContentUrl(documentId, documentListName);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * Updates a document in a document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=UpdateDocumentClient( document,  documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> updateDocumentClient(com.mozu.api.contracts.content.Document document, String documentListName, String documentId) throws Exception
	{
		return updateDocumentClient( document,  documentListName,  documentId,  null);
	}

	/**
	 * Updates a document in a document list.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.Document> mozuClient=UpdateDocumentClient( document,  documentListName,  documentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Document document = client.Result();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param document The document properties that define the content used by the content management system (CMS).
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.Document>
	 * @see com.mozu.api.contracts.content.Document
	 * @see com.mozu.api.contracts.content.Document
	 */
	public static MozuClient<com.mozu.api.contracts.content.Document> updateDocumentClient(com.mozu.api.contracts.content.Document document, String documentListName, String documentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.updateDocumentUrl(documentId, documentListName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.Document.class;
		MozuClient<com.mozu.api.contracts.content.Document> mozuClient = (MozuClient<com.mozu.api.contracts.content.Document>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(document);
		return mozuClient;

	}

	/**
	 * Deletes a specific document based on the specified document ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDocumentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentUrl(documentId, documentListName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the content associated with a document, such as a product image or PDF specification, by supplying the document ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentContentClient( documentListName,  documentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteDocumentContentClient(String documentListName, String documentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.DocumentUrl.deleteDocumentContentUrl(documentId, documentListName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



