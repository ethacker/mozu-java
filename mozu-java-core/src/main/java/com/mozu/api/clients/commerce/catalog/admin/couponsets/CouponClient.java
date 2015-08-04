/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.couponsets;

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
public class CouponClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> mozuClient=GetAssignedDiscountsClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AssignedDiscount assignedDiscount = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AssignedDiscount>>
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> getAssignedDiscountsClient(String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getAssignedDiscountsUrl(couponSetCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AssignedDiscount>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AssignedDiscount>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient=GetCouponClient( couponSetCode,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Coupon coupon = client.Result();
	 * </code></pre></p>
	 * @param couponCode 
	 * @param couponSetCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Coupon>
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Coupon> getCouponClient(String couponSetCode, String couponCode) throws Exception
	{
		return getCouponClient( couponSetCode,  couponCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient=GetCouponClient( couponSetCode,  couponCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Coupon coupon = client.Result();
	 * </code></pre></p>
	 * @param couponCode 
	 * @param couponSetCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Coupon>
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Coupon> getCouponClient(String couponSetCode, String couponCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getCouponUrl(couponCode, couponSetCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Coupon.class;
		MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Coupon>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient=GetCouponsClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponCollection couponCollection = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> getCouponsClient(String couponSetCode) throws Exception
	{
		return getCouponsClient( couponSetCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient=GetCouponsClient( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponCollection couponCollection = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> getCouponsClient(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getCouponsUrl(couponSetCode, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=GetCouponSetClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> getCouponSetClient(String couponSetCode) throws Exception
	{
		return getCouponSetClient( couponSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=GetCouponSetClient( couponSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> getCouponSetClient(String couponSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getCouponSetUrl(couponSetCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AssignDiscountClient( assignedDiscount,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param assignedDiscount 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public static MozuClient assignDiscountClient(com.mozu.api.contracts.productadmin.AssignedDiscount assignedDiscount, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.assignDiscountUrl(couponSetCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(assignedDiscount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=AddCouponsClient( coupons,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param coupons 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient addCouponsClient(List<com.mozu.api.contracts.productadmin.Coupon> coupons, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.addCouponsUrl(couponSetCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(coupons);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=UpdateCouponSetClient( couponSet,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param couponSet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> updateCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode) throws Exception
	{
		return updateCouponSetClient( couponSet,  couponSetCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=UpdateCouponSetClient( couponSet,  couponSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param responseFields 
	 * @param couponSet 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> updateCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.updateCouponSetUrl(couponSetCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(couponSet);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCouponSetClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCouponSetClient(String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.deleteCouponSetUrl(couponSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=UnAssignDiscountClient( assignedDiscount,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param assignedDiscount 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.AssignedDiscount
	 */
	public static MozuClient unAssignDiscountClient(com.mozu.api.contracts.productadmin.AssignedDiscount assignedDiscount, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.unAssignDiscountUrl(couponSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(assignedDiscount);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCouponsClient( coupons,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode 
	 * @param coupons 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient deleteCouponsClient(List<com.mozu.api.contracts.productadmin.Coupon> coupons, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.deleteCouponsUrl(couponSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(coupons);
		return mozuClient;

	}

}



