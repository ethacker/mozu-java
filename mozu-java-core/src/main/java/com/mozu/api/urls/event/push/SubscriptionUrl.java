/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.event.push;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SubscriptionUrl
{

	/**
	 * Get Resource Url for GetSubscriptions
	 * @param filter 
	 * @param pageSize 
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getSubscriptionsUrl(String filter, Integer pageSize, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/event/push/subscriptions/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
