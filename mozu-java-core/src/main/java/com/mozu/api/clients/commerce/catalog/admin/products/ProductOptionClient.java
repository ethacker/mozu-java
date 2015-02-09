/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Options resource to configure the option attributes and vocabulary values for an individual product associated with the product type that uses the option attribute. Options are used to generate variations of a product.
 * </summary>
 */
public class ProductOptionClient {
	
	/**
	 * Retrieves a list of all option attributes configured for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> mozuClient=GetOptionsClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductOption>>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> getOptionsClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductOptionUrl.getOptionsUrl(productCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductOption>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=GetOptionClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> getOptionClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		return getOptionClient(dataViewMode,  productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=GetOptionClient(dataViewMode,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> getOptionClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductOptionUrl.getOptionUrl(attributeFQN, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductOption.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductOption>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=AddOptionClient(dataViewMode,  productOption,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> addOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode) throws Exception
	{
		return addOptionClient(dataViewMode,  productOption,  productCode,  null);
	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=AddOptionClient(dataViewMode,  productOption,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> addOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductOptionUrl.addOptionUrl(productCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductOption.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductOption>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOption);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=UpdateOptionClient(dataViewMode,  productOption,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> updateOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN) throws Exception
	{
		return updateOptionClient(dataViewMode,  productOption,  productCode,  attributeFQN,  null);
	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient=UpdateOptionClient(dataViewMode,  productOption,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductOption productOption = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductOption> updateOptionClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductOptionUrl.updateOptionUrl(attributeFQN, productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductOption.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductOption>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOption);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the configuration of an option attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOptionClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOptionClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductOptionUrl.deleteOptionUrl(attributeFQN, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



