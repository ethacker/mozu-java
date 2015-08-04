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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class PublishSetSummaryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient=GetPublishSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> getPublishSetsClient() throws Exception
	{
		return getPublishSetsClient( null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient=GetPublishSetsClient( pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> getPublishSetsClient(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.getPublishSetsUrl(pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PublishSetSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=GetPublishSetItemsClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> getPublishSetItemsClient(String code) throws Exception
	{
		return getPublishSetItemsClient( code,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=GetPublishSetItemsClient( code,  pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> getPublishSetItemsClient(String code, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.getPublishSetItemsUrl(code, pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=DeletePublishSetClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 */
	public static MozuClient<Object> deletePublishSetClient(String code) throws Exception
	{
		return deletePublishSetClient( code,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=DeletePublishSetClient( code,  shouldDiscard,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param shouldDiscard 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 */
	public static MozuClient<Object> deletePublishSetClient(String code, Boolean shouldDiscard, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.deletePublishSetUrl(code, responseFields, shouldDiscard);
		String verb = "POST";
		Class<?> clz = Object.class;
		MozuClient<Object> mozuClient = (MozuClient<Object>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=AddPublishSetItemsClient( documentIds,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param documentIds 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 * @see string
	 */
	public static MozuClient<Object> addPublishSetItemsClient(List<String> documentIds, String code) throws Exception
	{
		return addPublishSetItemsClient( documentIds,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=AddPublishSetItemsClient( documentIds,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code 
	 * @param responseFields 
	 * @param documentIds 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 * @see string
	 */
	public static MozuClient<Object> addPublishSetItemsClient(List<String> documentIds, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.addPublishSetItemsUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = Object.class;
		MozuClient<Object> mozuClient = (MozuClient<Object>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentIds);
		return mozuClient;

	}

}



