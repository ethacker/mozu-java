/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.general;

import com.mozu.api.ApiContext;
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

/** <summary>
 * Use the Custom Routes resource to manage your custom route settings. Custom routing allows you to display SEO-friendly URLs on your site that map behind-the-scenes to conventional Mozu resources such as a product page or a search results page. With custom routing, you gain advanced control over the URL structures on your site and can more visibly highlight the products or categories your shoppers are interested in purchasing.To learn more about custom routing, refer to the [Custom Route Settings](../../../guides/settings/custom-routes.htm) topic.
 * </summary>
 */
public class CustomRouteSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomRouteSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the custom route settings configured for a site. These are the same settings configured through  in the Custom Routing JSON Editor.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.getCustomRouteSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings() throws Exception
	{
		return getCustomRouteSettings( null);
	}

	/**
	 * Retrieves the custom route settings configured for a site. These are the same settings configured through  in the Custom Routing JSON Editor.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.getCustomRouteSettings( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch getCustomRouteSettingsAsync( AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		return getCustomRouteSettingsAsync( null, callback);
	}

	/**
	 * Retrieves the custom route settings configured for a site. These are the same settings configured through  in the Custom Routing JSON Editor.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.getCustomRouteSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.getCustomRouteSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the custom route settings configured for a site. These are the same settings configured through  in the Custom Routing JSON Editor.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.getCustomRouteSettings( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch getCustomRouteSettingsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.getCustomRouteSettingsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Create new custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.createCustomRouteSettings( settings);
	 * </code></pre></p>
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return createCustomRouteSettings( settings,  null);
	}

	/**
	 * Create new custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.createCustomRouteSettings( settings, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch createCustomRouteSettingsAsync(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		return createCustomRouteSettingsAsync( settings,  null, callback);
	}

	/**
	 * Create new custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.createCustomRouteSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.createCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Create new custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.createCustomRouteSettings( settings,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch createCustomRouteSettingsAsync(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.createCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.updateCustomRouteSettings( settings);
	 * </code></pre></p>
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return updateCustomRouteSettings( settings,  null);
	}

	/**
	 * Updates custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.updateCustomRouteSettings( settings, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch updateCustomRouteSettingsAsync(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		return updateCustomRouteSettingsAsync( settings,  null, callback);
	}

	/**
	 * Updates custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CustomRouteSettings customRouteSettings = customroutesettings.updateCustomRouteSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.updateCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates custom route settings.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	CountDownLatch latch = customroutesettings.updateCustomRouteSettings( settings,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @param settings Mozu.SiteSettings.General.Contracts.General.Routing.CustomRouteSettings ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public CountDownLatch updateCustomRouteSettingsAsync(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.updateCustomRouteSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes all the custom route settings for a site, returning all routes to their Mozu defaults.
	 * <p><pre><code>
	 *	CustomRouteSettings customroutesettings = new CustomRouteSettings();
	 *	customroutesettings.deleteCustomRouteSettings();
	 * </code></pre></p>
	 * @return 
	 */
	public void deleteCustomRouteSettings() throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.general.CustomRouteSettingsClient.deleteCustomRouteSettingsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



