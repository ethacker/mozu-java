/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/orders/orderrefunds related resources. DOCUMENT_HERE 
 * </summary>
 */
public class RefundClient {
	
	/**
	 * orders-orderrefunds Post CreateRefund description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient=CreateRefundClient( refund,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Refund refund = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.refunds.Refund>
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> createRefundClient(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId) throws Exception
	{
		return createRefundClient( refund,  orderId,  null);
	}

	/**
	 * orders-orderrefunds Post CreateRefund description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient=CreateRefundClient( refund,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Refund refund = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.refunds.Refund>
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> createRefundClient(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.RefundUrl.createRefundUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.refunds.Refund.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(refund);
		return mozuClient;

	}

	/**
	 * orders-orderrefunds Put ResendRefundEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendRefundEmailClient( orderId,  refundId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refundId 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient resendRefundEmailClient(String orderId, String refundId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.RefundUrl.resendRefundEmailUrl(orderId, refundId);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



