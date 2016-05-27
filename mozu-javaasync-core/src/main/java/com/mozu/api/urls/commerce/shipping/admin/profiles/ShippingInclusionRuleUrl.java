/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.shipping.admin.profiles;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ShippingInclusionRuleUrl
{

	/**
	 * Get Resource Url for GetShippingInclusionRule
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getShippingInclusionRuleUrl(String id, String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetShippingInclusionRules
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getShippingInclusionRulesUrl(String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions?responseFields={responseFields}");
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateShippingInclusionRule
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl createShippingInclusionRuleUrl(String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions?responseFields={responseFields}");
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateShippingInclusionRule
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateShippingInclusionRuleUrl(String id, String profilecode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteShippingInclusionRule
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteShippingInclusionRuleUrl(String id, String profilecode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("profilecode", profilecode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

