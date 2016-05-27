/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.checkout;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PaymentSettingsUrl
{

	/**
	 * Get Resource Url for GetThirdPartyPaymentWorkflowWithValues
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl getThirdPartyPaymentWorkflowWithValuesUrl(String fullyQualifiedName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/paymentsettings/thirdpartyworkflow/{fullyQualifiedName}?responseFields={responseFields}");
		formatter.formatUrl("fullyQualifiedName", fullyQualifiedName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetThirdPartyPaymentWorkflows
	 * @return   String Resource Url
	 */
	public static MozuUrl getThirdPartyPaymentWorkflowsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/paymentsettings/thirdpartyworkflows");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddThirdPartyPaymentWorkflow
	 * @return   String Resource Url
	 */
	public static MozuUrl addThirdPartyPaymentWorkflowUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/paymentsettings/thirdpartyworkflows");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteThirdPartyPaymentWorkflow
	 * @param fullyQualifiedName Fully qualified name of the attribute for the third-party payment workflow.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteThirdPartyPaymentWorkflowUrl(String fullyQualifiedName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/paymentsettings/thirdpartyworkflows/{fullyQualifiedName}");
		formatter.formatUrl("fullyQualifiedName", fullyQualifiedName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

