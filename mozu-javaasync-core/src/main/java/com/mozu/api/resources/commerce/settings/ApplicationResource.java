/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

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
 * Use the Applications resource to update site-specific settings for installed applications.
 * </summary>
 */
public class ApplicationResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ApplicationResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Application application = application.thirdPartyGetApplication();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public com.mozu.api.contracts.sitesettings.application.Application thirdPartyGetApplication() throws Exception
	{
		return thirdPartyGetApplication( null);
	}

	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	CountDownLatch latch = application.thirdPartyGetApplication( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public CountDownLatch thirdPartyGetApplicationAsync( AsyncCallback<com.mozu.api.contracts.sitesettings.application.Application> callback) throws Exception
	{
		return thirdPartyGetApplicationAsync( null, callback);
	}

	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Application application = application.thirdPartyGetApplication( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public com.mozu.api.contracts.sitesettings.application.Application thirdPartyGetApplication(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyGetApplicationClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	CountDownLatch latch = application.thirdPartyGetApplication( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public CountDownLatch thirdPartyGetApplicationAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.application.Application> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyGetApplicationClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Application application = application.thirdPartyUpdateApplication( application);
	 * </code></pre></p>
	 * @param application Properties of an application installed in a tenant.
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public com.mozu.api.contracts.sitesettings.application.Application thirdPartyUpdateApplication(com.mozu.api.contracts.sitesettings.application.Application application) throws Exception
	{
		return thirdPartyUpdateApplication( application,  null);
	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	CountDownLatch latch = application.thirdPartyUpdateApplication( application, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param application Properties of an application installed in a tenant.
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public CountDownLatch thirdPartyUpdateApplicationAsync(com.mozu.api.contracts.sitesettings.application.Application application, AsyncCallback<com.mozu.api.contracts.sitesettings.application.Application> callback) throws Exception
	{
		return thirdPartyUpdateApplicationAsync( application,  null, callback);
	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	Application application = application.thirdPartyUpdateApplication( application,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param application Properties of an application installed in a tenant.
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public com.mozu.api.contracts.sitesettings.application.Application thirdPartyUpdateApplication(com.mozu.api.contracts.sitesettings.application.Application application, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyUpdateApplicationClient( application,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 *	Application application = new Application();
	 *	CountDownLatch latch = application.thirdPartyUpdateApplication( application,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param application Properties of an application installed in a tenant.
	 * @return com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public CountDownLatch thirdPartyUpdateApplicationAsync(com.mozu.api.contracts.sitesettings.application.Application application, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.application.Application> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> client = com.mozu.api.clients.commerce.settings.ApplicationClient.thirdPartyUpdateApplicationClient( application,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



