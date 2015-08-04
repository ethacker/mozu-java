/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Manage the results of order validation.
 * </summary>
 */
public class OrderValidationResultResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public OrderValidationResultResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the validation results associated with the order.
	 * <p><pre><code>
	 *	OrderValidationResult ordervalidationresult = new OrderValidationResult();
	 *	OrderValidationResult orderValidationResult = ordervalidationresult.getValidationResults( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> getValidationResults(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult>> client = com.mozu.api.clients.commerce.orders.OrderValidationResultClient.getValidationResultsClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Add a new order validation result to a submitted order.
	 * <p><pre><code>
	 *	OrderValidationResult ordervalidationresult = new OrderValidationResult();
	 *	OrderValidationResult orderValidationResult = ordervalidationresult.addValidationResult( validationResult,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param validationResult Properties of the resulting order validation performed by an order validation capability.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult addValidationResult(com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult validationResult, String orderId) throws Exception
	{
		return addValidationResult( validationResult,  orderId,  null);
	}

	/**
	 * Add a new order validation result to a submitted order.
	 * <p><pre><code>
	 *	OrderValidationResult ordervalidationresult = new OrderValidationResult();
	 *	OrderValidationResult orderValidationResult = ordervalidationresult.addValidationResult( validationResult,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param validationResult Properties of the resulting order validation performed by an order validation capability.
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult addValidationResult(com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult validationResult, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderValidationResult> client = com.mozu.api.clients.commerce.orders.OrderValidationResultClient.addValidationResultClient( validationResult,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



