/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeClient {
	
	/**
	 * Retrieves the contents of an attribute associated with the specified customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=GetAccountAttributeClient( accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> getAccountAttributeClient(Integer accountId, String attributeFQN) throws Exception
	{
		return getAccountAttributeClient( accountId,  attributeFQN,  null);
	}

	/**
	 * Retrieves the contents of an attribute associated with the specified customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=GetAccountAttributeClient( accountId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> getAccountAttributeClient(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.getAccountAttributeUrl(accountId, attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient=GetAccountAttributesClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttributeCollection customerAttributeCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttributeCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> getAccountAttributesClient(Integer accountId) throws Exception
	{
		return getAccountAttributesClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient=GetAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttributeCollection customerAttributeCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttributeCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> getAccountAttributesClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.getAccountAttributesUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttributeCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Applies a defined attribute to the customer account specified in the request and assigns a value to the customer attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=AddAccountAttributeClient( attribute,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> addAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addAccountAttributeClient( attribute,  accountId,  null);
	}

	/**
	 * Applies a defined attribute to the customer account specified in the request and assigns a value to the customer attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=AddAccountAttributeClient( attribute,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> addAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.addAccountAttributeUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * Updates one or more details of a customer account attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=UpdateAccountAttributeClient( attribute,  accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> updateAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * Updates one or more details of a customer account attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient=UpdateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAttribute customerAttribute = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAttribute>
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> updateAccountAttributeClient(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.updateAccountAttributeUrl(accountId, attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAttribute.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAttribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * Removes the attribute specified in the request from the customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountAttributeClient( accountId,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountAttributeClient(Integer accountId, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAttributeUrl.deleteAccountAttributeUrl(accountId, attributeFQN);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



