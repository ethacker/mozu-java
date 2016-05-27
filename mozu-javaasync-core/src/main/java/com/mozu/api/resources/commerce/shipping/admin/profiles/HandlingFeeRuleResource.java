/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.shipping.admin.profiles;

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
 * Use the ProductHandlingFeeRules sub-resource to manage your product handling fee rules that are associated with a specific shipping profile.
 * </summary>
 */
public class HandlingFeeRuleResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public HandlingFeeRuleResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public HandlingFeeRuleResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.getProductHandlingFeeRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getProductHandlingFeeRule(String profilecode, String id) throws Exception
	{
		return getProductHandlingFeeRule( profilecode,  id,  null);
	}

	/**
	 * Retrieves the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.getProductHandlingFeeRule( profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch getProductHandlingFeeRuleAsync(String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return getProductHandlingFeeRuleAsync( profilecode,  id,  null, callback);
	}

	/**
	 * Retrieves the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.getProductHandlingFeeRule( profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule getProductHandlingFeeRule(String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.getProductHandlingFeeRuleClient(_dataViewMode,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.getProductHandlingFeeRule( profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch getProductHandlingFeeRuleAsync(String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.getProductHandlingFeeRuleClient(_dataViewMode,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of product handling fee rules and their details.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRuleCollection handlingFeeRuleCollection = handlingfeerule.getProductHandlingFeeRules( profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getProductHandlingFeeRules(String profilecode) throws Exception
	{
		return getProductHandlingFeeRules( profilecode,  null);
	}

	/**
	 * Retrieves a list of product handling fee rules and their details.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.getProductHandlingFeeRules( profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public CountDownLatch getProductHandlingFeeRulesAsync(String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> callback) throws Exception
	{
		return getProductHandlingFeeRulesAsync( profilecode,  null, callback);
	}

	/**
	 * Retrieves a list of product handling fee rules and their details.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRuleCollection handlingFeeRuleCollection = handlingfeerule.getProductHandlingFeeRules( profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection getProductHandlingFeeRules(String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.getProductHandlingFeeRulesClient(_dataViewMode,  profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of product handling fee rules and their details.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.getProductHandlingFeeRules( profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection
	 */
	public CountDownLatch getProductHandlingFeeRulesAsync(String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRuleCollection> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.getProductHandlingFeeRulesClient(_dataViewMode,  profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.createProductHandlingFeeRule( rule,  profilecode);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createProductHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode) throws Exception
	{
		return createProductHandlingFeeRule( rule,  profilecode,  null);
	}

	/**
	 * Creates a new product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.createProductHandlingFeeRule( rule,  profilecode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch createProductHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return createProductHandlingFeeRuleAsync( rule,  profilecode,  null, callback);
	}

	/**
	 * Creates a new product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.createProductHandlingFeeRule( rule,  profilecode,  responseFields);
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule createProductHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.createProductHandlingFeeRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.createProductHandlingFeeRule( rule,  profilecode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch createProductHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.createProductHandlingFeeRuleClient( rule,  profilecode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.updateProductHandlingFeeRule( rule,  profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateProductHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id) throws Exception
	{
		return updateProductHandlingFeeRule( rule,  profilecode,  id,  null);
	}

	/**
	 * Updates the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.updateProductHandlingFeeRule( rule,  profilecode,  id, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch updateProductHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		return updateProductHandlingFeeRuleAsync( rule,  profilecode,  id,  null, callback);
	}

	/**
	 * Updates the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	HandlingFeeRule handlingFeeRule = handlingfeerule.updateProductHandlingFeeRule( rule,  profilecode,  id,  responseFields);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule updateProductHandlingFeeRule(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.updateProductHandlingFeeRuleClient(_dataViewMode,  rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	CountDownLatch latch = handlingfeerule.updateProductHandlingFeeRule( rule,  profilecode,  id,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.HandlingFeeRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule
	 */
	public CountDownLatch updateProductHandlingFeeRuleAsync(com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule rule, String profilecode, String id, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.HandlingFeeRule> client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.updateProductHandlingFeeRuleClient(_dataViewMode,  rule,  profilecode,  id,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the specified product handling fee rule.
	 * <p><pre><code>
	 *	HandlingFeeRule handlingfeerule = new HandlingFeeRule();
	 *	handlingfeerule.deleteProductHandlingFeeRule( profilecode,  id);
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the product handling fee rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProductHandlingFeeRule(String profilecode, String id) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.shipping.admin.profiles.HandlingFeeRuleClient.deleteProductHandlingFeeRuleClient(_dataViewMode,  profilecode,  id);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



