/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

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
 * Use the Document List Types resource to manage the types of document lists in your site's document hierarchy. The type denotes a content type for that list of folders, sub-folders, and documents such as `web_pages`.
 * </summary>
 */
public class DocumentListTypeClient {
	
	/**
	 * Creates a new documentListType
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient=CreateDocumentListTypeClient(dataViewMode,  list);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListType documentListType = client.Result();
	 * </code></pre></p>
	 * @param list Properties for the document list type. Document lists contain documents with an associated document type, such as web pages.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListType>
	 * @see com.mozu.api.contracts.content.DocumentListType
	 * @see com.mozu.api.contracts.content.DocumentListType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListType> createDocumentListTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list) throws Exception
	{
		return createDocumentListTypeClient(dataViewMode,  list,  null);
	}

	/**
	 * Creates a new documentListType
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient=CreateDocumentListTypeClient(dataViewMode,  list,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListType documentListType = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param list Properties for the document list type. Document lists contain documents with an associated document type, such as web pages.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListType>
	 * @see com.mozu.api.contracts.content.DocumentListType
	 * @see com.mozu.api.contracts.content.DocumentListType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListType> createDocumentListTypeClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListTypeUrl.createDocumentListTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.content.DocumentListType.class;
		MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentListType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(list);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates a DocumentListType
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient=UpdateDocumentListTypeClient( list,  documentListTypeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListType documentListType = client.Result();
	 * </code></pre></p>
	 * @param documentListTypeFQN 
	 * @param list Properties for the document list type. Document lists contain documents with an associated document type, such as web pages.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListType>
	 * @see com.mozu.api.contracts.content.DocumentListType
	 * @see com.mozu.api.contracts.content.DocumentListType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListType> updateDocumentListTypeClient(com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN) throws Exception
	{
		return updateDocumentListTypeClient( list,  documentListTypeFQN,  null);
	}

	/**
	 * Updates a DocumentListType
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient=UpdateDocumentListTypeClient( list,  documentListTypeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentListType documentListType = client.Result();
	 * </code></pre></p>
	 * @param documentListTypeFQN 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param list Properties for the document list type. Document lists contain documents with an associated document type, such as web pages.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentListType>
	 * @see com.mozu.api.contracts.content.DocumentListType
	 * @see com.mozu.api.contracts.content.DocumentListType
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentListType> updateDocumentListTypeClient(com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentListTypeUrl.updateDocumentListTypeUrl(documentListTypeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.DocumentListType.class;
		MozuClient<com.mozu.api.contracts.content.DocumentListType> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentListType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(list);
		return mozuClient;

	}

}



