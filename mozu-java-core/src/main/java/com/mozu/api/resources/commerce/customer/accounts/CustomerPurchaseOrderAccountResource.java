/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Account Purchase Order resource to manage purchase order details for specific customer acocunts.
 * </summary>
 */
public class CustomerPurchaseOrderAccountResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerPurchaseOrderAccountResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of the specified customer purchase order account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderAccount( accountId,  null);
	}

	/**
	 * Retrieves the details of the specified customer purchase order account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.getCustomerPurchaseOrderAccount( accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderAccountClient( accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of purchase order transactions for the specified customer account according to any specified sort options.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(Integer accountId) throws Exception
	{
		return getCustomerPurchaseOrderTransactions( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of purchase order transactions for the specified customer account according to any specified sort options.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransactionCollection purchaseOrderTransactionCollection = customerpurchaseorderaccount.getCustomerPurchaseOrderTransactions( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransactionCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.getCustomerPurchaseOrderTransactionsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a purchase order account to the specified customer account.This adds the ability for the specified customer account to use the purchase order payment method.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param customerPurchaseOrderAccount Unique identifier of the customer purchase order account.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * Adds a purchase order account to the specified customer account.This adds the ability for the specified customer account to use the purchase order payment method.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.createCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customerPurchaseOrderAccount Unique identifier of the customer purchase order account.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a purchase order transaction on the specified customer purchase order account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransaction purchaseOrderTransaction = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param purchaseOrderTransaction The purchase order transaction type to add to the specified customer account.
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId) throws Exception
	{
		return createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  null);
	}

	/**
	 * Creates a purchase order transaction on the specified customer purchase order account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	PurchaseOrderTransaction purchaseOrderTransaction = customerpurchaseorderaccount.createPurchaseOrderTransaction( purchaseOrderTransaction,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param purchaseOrderTransaction The purchase order transaction type to add to the specified customer account.
	 * @return com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 * @see com.mozu.api.contracts.customer.PurchaseOrderTransaction
	 */
	public com.mozu.api.contracts.customer.PurchaseOrderTransaction createPurchaseOrderTransaction(com.mozu.api.contracts.customer.PurchaseOrderTransaction purchaseOrderTransaction, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.PurchaseOrderTransaction> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.createPurchaseOrderTransactionClient( purchaseOrderTransaction,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the details of the purchase order account for the specified customer account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param customerPurchaseOrderAccount Unique identifier of the customer purchase order account.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId) throws Exception
	{
		return updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  null);
	}

	/**
	 * Updates the details of the purchase order account for the specified customer account.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	CustomerPurchaseOrderAccount customerPurchaseOrderAccount = customerpurchaseorderaccount.updateCustomerPurchaseOrderAccount( customerPurchaseOrderAccount,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param customerPurchaseOrderAccount Unique identifier of the customer purchase order account.
	 * @return com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 * @see com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount
	 */
	public com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount customerPurchaseOrderAccount, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerPurchaseOrderAccount> client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.updateCustomerPurchaseOrderAccountClient( customerPurchaseOrderAccount,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the specified customer purchase order account.This removes the ability for the specified customer account to use the purchase order payment method.
	 * <p><pre><code>
	 *	CustomerPurchaseOrderAccount customerpurchaseorderaccount = new CustomerPurchaseOrderAccount();
	 *	customerpurchaseorderaccount.deleteCustomerPurchaseOrderAccount( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return 
	 */
	public void deleteCustomerPurchaseOrderAccount(Integer accountId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerPurchaseOrderAccountClient.deleteCustomerPurchaseOrderAccountClient( accountId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}


