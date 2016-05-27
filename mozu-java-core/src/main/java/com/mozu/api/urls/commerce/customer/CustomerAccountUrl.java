/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerAccountUrl
{

	/**
	 * Get Resource Url for GetAccounts
	 * @param fields The fields to include in the response.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param isAnonymous If true, retrieve anonymous shopper accounts in the response.
	 * @param pageSize 
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountsUrl(String fields, String filter, Boolean isAnonymous, Integer pageSize, String q, Integer qLimit, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&fields={fields}&q={q}&qLimit={qLimit}&isAnonymous={isAnonymous}&responseFields={responseFields}");
		formatter.formatUrl("fields", fields);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("isAnonymous", isAnonymous);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLoginState
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLoginStateUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/loginstate?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAccount
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccount
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ChangePassword
	 * @param accountId Unique identifier of the customer account.
	 * @param unlockAccount 
	 * @return   String Resource Url
	 */
	public static MozuUrl changePasswordUrl(Integer accountId, Boolean unlockAccount)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/Change-Password?unlockAccount={unlockAccount}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("unlockAccount", unlockAccount);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddLoginToExistingCustomer
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addLoginToExistingCustomerUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/Create-Login?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RecomputeCustomerLifetimeValue
	 * @param accountId Unique identifier of the customer account.
	 * @return   String Resource Url
	 */
	public static MozuUrl recomputeCustomerLifetimeValueUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/recomputelifetimevalue");
		formatter.formatUrl("accountId", accountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for SetLoginLocked
	 * @param accountId Unique identifier of the customer account.
	 * @return   String Resource Url
	 */
	public static MozuUrl setLoginLockedUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/Set-Login-Locked");
		formatter.formatUrl("accountId", accountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for SetPasswordChangeRequired
	 * @param accountId Unique identifier of the customer account.
	 * @return   String Resource Url
	 */
	public static MozuUrl setPasswordChangeRequiredUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/Set-Password-Change-Required");
		formatter.formatUrl("accountId", accountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccountAndLogin
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountAndLoginUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/Add-Account-And-Login?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccounts
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/Bulk?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ChangePasswords
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl changePasswordsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/Change-Passwords?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLoginStateByEmailAddress
	 * @param emailAddress The email address associated with the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLoginStateByEmailAddressUrl(String emailAddress, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/loginstatebyemailaddress?emailAddress={emailAddress}&responseFields={responseFields}");
		formatter.formatUrl("emailAddress", emailAddress);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetLoginStateByUserName
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userName The user name associated with the customer account.
	 * @return   String Resource Url
	 */
	public static MozuUrl getLoginStateByUserNameUrl(String responseFields, String userName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/loginstatebyusername?userName={userName}&responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("userName", userName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ResetPassword
	 * @return   String Resource Url
	 */
	public static MozuUrl resetPasswordUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/Reset-Password");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAccount
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAccountUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAccount
	 * @param accountId Unique identifier of the customer account.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAccountUrl(Integer accountId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}");
		formatter.formatUrl("accountId", accountId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

