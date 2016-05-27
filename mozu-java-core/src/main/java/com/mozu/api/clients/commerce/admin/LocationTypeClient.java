/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Location Types resource to manage the types of locations your tenant maintains, such as warehouses, physical storefronts, and kiosks.
 * </summary>
 */
public class LocationTypeClient {
	
	/**
	 * Retrieve a list of all location types defined for the tenant.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.location.LocationType>> mozuClient=GetLocationTypesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.location.LocationType>>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<List<com.mozu.api.contracts.location.LocationType>> getLocationTypesClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.getLocationTypesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.location.LocationType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.location.LocationType>> mozuClient = (MozuClient<List<com.mozu.api.contracts.location.LocationType>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=GetLocationTypeClient( locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> getLocationTypeClient(String locationTypeCode) throws Exception
	{
		return getLocationTypeClient( locationTypeCode,  null);
	}

	/**
	 * Retrieves the details of the location type specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=GetLocationTypeClient( locationTypeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> getLocationTypeClient(String locationTypeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.getLocationTypeUrl(locationTypeCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=AddLocationTypeClient( locationType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> addLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType) throws Exception
	{
		return addLocationTypeClient( locationType,  null);
	}

	/**
	 * Creates a new location type based on the information specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=AddLocationTypeClient( locationType,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> addLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.addLocationTypeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationType);
		return mozuClient;

	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=UpdateLocationTypeClient( locationType,  locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> updateLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode) throws Exception
	{
		return updateLocationTypeClient( locationType,  locationTypeCode,  null);
	}

	/**
	 * Updates the name of a defined location type.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient=UpdateLocationTypeClient( locationType,  locationTypeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationType locationType = client.Result();
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param locationType Properties of a type of physical location, such as warehouse or kiosk. Location types enable tenants to group similar locations for filtering and location usage type definition.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationType>
	 * @see com.mozu.api.contracts.location.LocationType
	 * @see com.mozu.api.contracts.location.LocationType
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationType> updateLocationTypeClient(com.mozu.api.contracts.location.LocationType locationType, String locationTypeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.updateLocationTypeUrl(locationTypeCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.LocationType.class;
		MozuClient<com.mozu.api.contracts.location.LocationType> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationType>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(locationType);
		return mozuClient;

	}

	/**
	 * Deletes the location type specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocationTypeClient( locationTypeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationTypeCode The user-defined code that identifies the location type.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationTypeClient(String locationTypeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationTypeUrl.deleteLocationTypeUrl(locationTypeCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



