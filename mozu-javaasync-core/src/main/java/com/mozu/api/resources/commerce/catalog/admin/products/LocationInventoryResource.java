/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

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
 * Use the Product Location Inventory resource to manage the levels of active product inventory to maintain across defined locations at the product level.
 * </summary>
 */
public class LocationInventoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public LocationInventoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public LocationInventoryResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String productCode) throws Exception
	{
		return getLocationInventories( productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventories( productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public CountDownLatch getLocationInventoriesAsync(String productCode, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventoryCollection> callback) throws Exception
	{
		return getLocationInventoriesAsync( productCode,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoriesClient(_dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves all locations for which a product has inventory defined and displays the inventory definition properties of each location.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventories( productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public CountDownLatch getLocationInventoriesAsync(String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventoryCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoriesClient(_dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the inventory of the product in the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( productCode,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String productCode, String locationCode) throws Exception
	{
		return getLocationInventory( productCode,  locationCode,  null);
	}

	/**
	 * Retrieves the details of the inventory of the product in the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventory( productCode,  locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch getLocationInventoryAsync(String productCode, String locationCode, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventory> callback) throws Exception
	{
		return getLocationInventoryAsync( productCode,  locationCode,  null, callback);
	}

	/**
	 * Retrieves the details of the inventory of the product in the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( productCode,  locationCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String productCode, String locationCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoryClient(_dataViewMode,  productCode,  locationCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the inventory of the product in the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventory( productCode,  locationCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch getLocationInventoryAsync(String productCode, String locationCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventory> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.getLocationInventoryClient(_dataViewMode,  productCode,  locationCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode) throws Exception
	{
		return addLocationInventory( locationInventoryList,  productCode,  null);
	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.addLocationInventory( locationInventoryList,  productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch addLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		return addLocationInventoryAsync( locationInventoryList,  productCode,  null, callback);
	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  productCode,  performUpserts);
	 * </code></pre></p>
	 * @param performUpserts Query string parameter lets the service perform an update for a new or existing record. When run, the update occurs without throwing a conflict exception that the record exists. If true, the updates completes regardless of the record currently existing. By default, if no value is specified, the service assumes this value is false.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, Boolean performUpserts) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.addLocationInventoryClient(_dataViewMode,  locationInventoryList,  productCode,  performUpserts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.addLocationInventory( locationInventoryList,  productCode,  performUpserts, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param performUpserts Query string parameter lets the service perform an update for a new or existing record. When run, the update occurs without throwing a conflict exception that the record exists. If true, the updates completes regardless of the record currently existing. By default, if no value is specified, the service assumes this value is false.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationInventoryList Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch addLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String productCode, Boolean performUpserts, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.addLocationInventoryClient(_dataViewMode,  locationInventoryList,  productCode,  performUpserts);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the current level of stock at each location associated with the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.updateLocationInventory( locationInventoryAdjustments,  productCode);
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param locationInventoryAdjustments Properties of an adjustment to the active product inventory of a specific location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.updateLocationInventoryClient(_dataViewMode,  locationInventoryAdjustments,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the current level of stock at each location associated with the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.updateLocationInventory( locationInventoryAdjustments,  productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param  callback callback handler for asynchronous operations
	 * @param locationInventoryAdjustments Properties of an adjustment to the active product inventory of a specific location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public CountDownLatch updateLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String productCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.updateLocationInventoryClient(_dataViewMode,  locationInventoryAdjustments,  productCode);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the location inventory definition for the product code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	locationinventory.deleteLocationInventory( productCode,  locationCode);
	 * </code></pre></p>
	 * @param locationCode The unique, user-defined code that identifies a location. 
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return 
	 */
	public void deleteLocationInventory(String productCode, String locationCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.LocationInventoryClient.deleteLocationInventoryClient(_dataViewMode,  productCode,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



