/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.couponsets;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CouponUrl
{

	/**
	 * Get Resource Url for GetCoupon
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param includeCounts Specifies whether to return the redemptionCount property in the response body object.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCouponUrl(String couponCode, String couponSetCode, Boolean includeCounts, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode}?includeCounts={includeCounts}&responseFields={responseFields}");
		formatter.formatUrl("couponCode", couponCode);
		formatter.formatUrl("couponSetCode", couponSetCode);
		formatter.formatUrl("includeCounts", includeCounts);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCoupons
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the redemptionCount property in the response body object.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCouponsUrl(String couponSetCode, String filter, Boolean includeCounts, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&includeCounts={includeCounts}&responseFields={responseFields}");
		formatter.formatUrl("couponSetCode", couponSetCode);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("includeCounts", includeCounts);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCoupons
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return   String Resource Url
	 */
	public static MozuUrl addCouponsUrl(String couponSetCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes");
		formatter.formatUrl("couponSetCode", couponSetCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCoupons
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCouponsUrl(String couponSetCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/remove");
		formatter.formatUrl("couponSetCode", couponSetCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCoupon
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCouponUrl(String couponCode, String couponSetCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode}");
		formatter.formatUrl("couponCode", couponCode);
		formatter.formatUrl("couponSetCode", couponSetCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

