/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
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
 * Use the Product Administration resource to create new product definitions in the master catalog and determine which catalogs will feature products. You can also assign attribute values for defined products, manage product-level location inventory, and configure the variations of a product.
 * </summary>
 */
public class ProductResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductCollection productCollection = product.getProducts();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.ProductCollection
	 * @see com.mozu.api.contracts.productadmin.ProductCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductCollection getProducts() throws Exception
	{
		return getProducts( null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of products according to any specified facets, filter criteria, and sort options.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductCollection productCollection = product.getProducts( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  noCount,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param noCount If true, the operation does not return the TotalCount number of results.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.ProductCollection
	 * @see com.mozu.api.contracts.productadmin.ProductCollection
	 */
	public com.mozu.api.contracts.productadmin.ProductCollection getProducts(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, Boolean noCount, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductCollection> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductsClient(_dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  noCount,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a product that is associated with one or more specific catalogs.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.getProductInCatalogs( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> getProductInCatalogs(String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductInCatalogsClient(_dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a product associated with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.getProductInCatalog( productCode,  catalogId);
	 * </code></pre></p>
	 * @param catalogId The unique identifier of the catalog of products used by a site.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo getProductInCatalog(String productCode, Integer catalogId) throws Exception
	{
		return getProductInCatalog( productCode,  catalogId,  null);
	}

	/**
	 * Retrieves the details of a product associated with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.getProductInCatalog( productCode,  catalogId,  responseFields);
	 * </code></pre></p>
	 * @param catalogId The unique identifier of the catalog of products used by a site.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo getProductInCatalog(String productCode, Integer catalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductInCatalogClient(_dataViewMode,  productCode,  catalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a product definition.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProduct( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product getProduct(String productCode) throws Exception
	{
		return getProduct( productCode,  null);
	}

	/**
	 * Retrieves the details of a product definition.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.getProduct( productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product getProduct(String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.getProductClient(_dataViewMode,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new product definition in the specified master catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.addProduct( product);
	 * </code></pre></p>
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product addProduct(com.mozu.api.contracts.productadmin.Product product) throws Exception
	{
		return addProduct( product,  null);
	}

	/**
	 * Creates a new product definition in the specified master catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.addProduct( product,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product addProduct(com.mozu.api.contracts.productadmin.Product product, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.addProductClient(_dataViewMode,  product,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Associates a new product defined in the master catalog with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.addProductInCatalog( productInCatalogInfoIn,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo addProductInCatalog(com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode) throws Exception
	{
		return addProductInCatalog( productInCatalogInfoIn,  productCode,  null);
	}

	/**
	 * Associates a new product defined in the master catalog with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.addProductInCatalog( productInCatalogInfoIn,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo addProductInCatalog(com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.addProductInCatalogClient(_dataViewMode,  productInCatalogInfoIn,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Performs an update to a product code by renaming or replacing the current product code with a new one.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	product.renameProductCodes( productCodeRenames);
	 * </code></pre></p>
	 * @param productCodeRenames Properties for a product code current and changed content.
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.ProductCodeRename
	 */
	public void renameProductCodes(List<com.mozu.api.contracts.productadmin.ProductCodeRename> productCodeRenames) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.renameProductCodesClient( productCodeRenames);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Updates the properties of a product specific to each catalog associated with the product.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.updateProductInCatalogs( productInCatalogsIn,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productInCatalogsIn Properties of a product associated with a specific catalog.
	 * @return List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> updateProductInCatalogs(List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> productInCatalogsIn, String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductInCatalogInfo>> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductInCatalogsClient(_dataViewMode,  productInCatalogsIn,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a product associated with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.updateProductInCatalog( productInCatalogInfoIn,  productCode,  catalogId);
	 * </code></pre></p>
	 * @param catalogId The unique identifier of the catalog of products used by a site.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo updateProductInCatalog(com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId) throws Exception
	{
		return updateProductInCatalog( productInCatalogInfoIn,  productCode,  catalogId,  null);
	}

	/**
	 * Updates one or more properties of a product associated with a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	ProductInCatalogInfo productInCatalogInfo = product.updateProductInCatalog( productInCatalogInfoIn,  productCode,  catalogId,  responseFields);
	 * </code></pre></p>
	 * @param catalogId The unique identifier of the catalog of products used by a site.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productInCatalogInfoIn Properties of a product associated with a specific catalog.
	 * @return com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 * @see com.mozu.api.contracts.productadmin.ProductInCatalogInfo
	 */
	public com.mozu.api.contracts.productadmin.ProductInCatalogInfo updateProductInCatalog(com.mozu.api.contracts.productadmin.ProductInCatalogInfo productInCatalogInfoIn, String productCode, Integer catalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductInCatalogInfo> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductInCatalogClient(_dataViewMode,  productInCatalogInfoIn,  productCode,  catalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a product definition in a master catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.updateProduct( product,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product updateProduct(com.mozu.api.contracts.productadmin.Product product, String productCode) throws Exception
	{
		return updateProduct( product,  productCode,  null);
	}

	/**
	 * Updates one or more properties of a product definition in a master catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	Product product = product.updateProduct( product,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param product The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 * @return com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 * @see com.mozu.api.contracts.productadmin.Product
	 */
	public com.mozu.api.contracts.productadmin.Product updateProduct(com.mozu.api.contracts.productadmin.Product product, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Product> client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.updateProductClient(_dataViewMode,  product,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the specified product from a master catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	product.deleteProduct( productCode);
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return 
	 */
	public void deleteProduct(String productCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.deleteProductClient(_dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Removes the product association defined for a specific catalog.
	 * <p><pre><code>
	 *	Product product = new Product();
	 *	product.deleteProductInCatalog( productCode,  catalogId);
	 * </code></pre></p>
	 * @param catalogId The unique identifier of the catalog of products used by a site.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return 
	 */
	public void deleteProductInCatalog(String productCode, Integer catalogId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.ProductClient.deleteProductInCatalogClient(_dataViewMode,  productCode,  catalogId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



