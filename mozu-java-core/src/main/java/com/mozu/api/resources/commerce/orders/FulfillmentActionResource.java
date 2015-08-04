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
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FulfillmentActionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return performFulfillmentAction( action,  orderId,  null);
	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.performFulfillmentActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * orders-fulfillment Post ResendPackageFulfillmentEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return resendPackageFulfillmentEmail( action,  orderId,  null);
	}

	/**
	 * orders-fulfillment Post ResendPackageFulfillmentEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.resendPackageFulfillmentEmailClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



