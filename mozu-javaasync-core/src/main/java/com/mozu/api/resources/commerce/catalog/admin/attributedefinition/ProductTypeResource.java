/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Product Types resource to manage the types for your product catalog. Product types act as configuration templates, which store a set of attributes common to all products associated with that type. Unlike categories, products can only be associated with a single product type.
 * </summary>
 */
public class ProductTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductTypeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.getProductTypes();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes() throws Exception
	{
		return getProductTypes( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.getProductTypes( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public CountDownLatch getProductTypesAsync( AsyncCallback<com.mozu.api.contracts.productadmin.ProductTypeCollection> callback) throws Exception
	{
		return getProductTypesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductTypeCollection productTypeCollection = producttype.getProductTypes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductTypeCollection getProductTypes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypesClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of product types according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.getProductTypes( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductTypeCollection
	 * @see com.mozu.api.contracts.productadmin.ProductTypeCollection
	 */
	public CountDownLatch getProductTypesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductTypeCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductTypeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypesClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.getProductType( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType getProductType(Integer productTypeId) throws Exception
	{
		return getProductType( productTypeId,  null);
	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.getProductType( productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch getProductTypeAsync(Integer productTypeId, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		return getProductTypeAsync( productTypeId,  null, callback);
	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.getProductType( productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType getProductType(Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypeClient(_dataViewMode,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the product type specified in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.getProductType( productTypeId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch getProductTypeAsync(Integer productTypeId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.getProductTypeClient(_dataViewMode,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.addProductType( productType);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType addProductType(com.mozu.api.contracts.productadmin.ProductType productType) throws Exception
	{
		return addProductType( productType,  null);
	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.addProductType( productType, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch addProductTypeAsync(com.mozu.api.contracts.productadmin.ProductType productType, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		return addProductTypeAsync( productType,  null, callback);
	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.addProductType( productType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType addProductType(com.mozu.api.contracts.productadmin.ProductType productType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.addProductTypeClient(_dataViewMode,  productType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product type based on the information supplied in the request.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.addProductType( productType,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch addProductTypeAsync(com.mozu.api.contracts.productadmin.ProductType productType, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.addProductTypeClient(_dataViewMode,  productType,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.updateProductType( productType,  productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType updateProductType(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId) throws Exception
	{
		return updateProductType( productType,  productTypeId,  null);
	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.updateProductType( productType,  productTypeId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch updateProductTypeAsync(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		return updateProductTypeAsync( productType,  productTypeId,  null, callback);
	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	ProductType productType = producttype.updateProductType( productType,  productTypeId,  responseFields);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public com.mozu.api.contracts.productadmin.ProductType updateProductType(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.updateProductTypeClient(_dataViewMode,  productType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a product type.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	CountDownLatch latch = producttype.updateProductType( productType,  productTypeId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param productType A product type is like a product template.
	 * @return com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 * @see com.mozu.api.contracts.productadmin.ProductType
	 */
	public CountDownLatch updateProductTypeAsync(com.mozu.api.contracts.productadmin.ProductType productType, Integer productTypeId, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductType> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductType> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.updateProductTypeClient(_dataViewMode,  productType,  productTypeId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the product type by providing the product type ID.
	 * <p><pre><code>
	 *	ProductType producttype = new ProductType();
	 *	producttype.deleteProductType( productTypeId);
	 * </code></pre></p>
	 * @param productTypeId Identifier of the product type.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteProductType(Integer productTypeId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.ProductTypeClient.deleteProductTypeClient(_dataViewMode,  productTypeId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



