/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.discounts;

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
 * Retrieves and modifies the products, categories, and shipping methods eligible for discounts in the form of a fixed dollar amount, percentage off a product price, or free shipping.
 * </summary>
 */
public class DiscountTargetClient {
	
	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=GetDiscountTargetClient(dataViewMode,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> getDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId) throws Exception
	{
		return getDiscountTargetClient(dataViewMode,  discountId,  null);
	}

	/**
	 * Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=GetDiscountTargetClient(dataViewMode,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> getDiscountTargetClient(com.mozu.api.DataViewMode dataViewMode, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.getDiscountTargetUrl(discountId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=UpdateDiscountTargetClient( discountTarget,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> updateDiscountTargetClient(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId) throws Exception
	{
		return updateDiscountTargetClient( discountTarget,  discountId,  null);
	}

	/**
	 * Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient=UpdateDiscountTargetClient( discountTarget,  discountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountTarget discountTarget = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param discountTarget Properties of the target to which the discount applies, such as the type of discount and which products, categories, or shipping methods are eligible for the discount and the properties of this discount target.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.DiscountTarget>
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 * @see com.mozu.api.contracts.productadmin.DiscountTarget
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> updateDiscountTargetClient(com.mozu.api.contracts.productadmin.DiscountTarget discountTarget, Integer discountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.discounts.DiscountTargetUrl.updateDiscountTargetUrl(discountId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.DiscountTarget.class;
		MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.DiscountTarget>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountTarget);
		return mozuClient;

	}

}



