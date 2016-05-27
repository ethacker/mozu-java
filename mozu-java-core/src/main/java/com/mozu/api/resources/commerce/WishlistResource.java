/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Wish Lists resource to manage the shopper wish lists of products associated with a customer account. Although customer accounts are managed at the tenant level, the system stores shopper wish lists at the site level. This enables the same customer to have wish lists for each of a merchant's sites. Use the Wish List Items resource to manage items in a wish list.
 * </summary>
 */
public class WishlistResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public WishlistResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of shopper wish lists according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	WishlistCollection wishlistCollection = wishlist.getWishlists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists() throws Exception
	{
		return getWishlists( null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of shopper wish lists according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	WishlistCollection wishlistCollection = wishlist.getWishlists( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of order search terms (not phrases) to use in the query when searching across order number and the name or email of the billing contact. When entering, separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection getWishlists(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.WishlistCollection> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistsClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the shopper wish list specified in the request.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlist( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlist(String wishlistId) throws Exception
	{
		return getWishlist( wishlistId,  null);
	}

	/**
	 * Retrieves the details of the shopper wish list specified in the request.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlist( wishlistId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param wishlistId Unique identifier of the wish list.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlist(String wishlistId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistClient( wishlistId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a wish list by supplying the wish list name.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlistByName( customerAccountId,  wishlistName);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlistByName(Integer customerAccountId, String wishlistName) throws Exception
	{
		return getWishlistByName( customerAccountId,  wishlistName,  null);
	}

	/**
	 * Retrieves the details of a wish list by supplying the wish list name.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.getWishlistByName( customerAccountId,  wishlistName,  responseFields);
	 * </code></pre></p>
	 * @param customerAccountId The unique identifier of the customer account for which to retrieve wish lists.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param wishlistName The name of the wish list to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist getWishlistByName(Integer customerAccountId, String wishlistName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.getWishlistByNameClient( customerAccountId,  wishlistName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new shopper wish list for the associated customer account. Although customer accounts are maintained at the tenant level, the system stores wish lists at the site level. Newly created wish lists do not have any items.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.createWishlist( wishlist);
	 * </code></pre></p>
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist createWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist) throws Exception
	{
		return createWishlist( wishlist,  null);
	}

	/**
	 * Creates a new shopper wish list for the associated customer account. Although customer accounts are maintained at the tenant level, the system stores wish lists at the site level. Newly created wish lists do not have any items.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.createWishlist( wishlist,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist createWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.createWishlistClient( wishlist,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a shopper wish list defined for a customer account.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.updateWishlist( wishlist,  wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist updateWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId) throws Exception
	{
		return updateWishlist( wishlist,  wishlistId,  null);
	}

	/**
	 * Updates one or more properties of a shopper wish list defined for a customer account.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	Wishlist wishlist = wishlist.updateWishlist( wishlist,  wishlistId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param wishlistId Unique identifier of the wish list.
	 * @param wishlist Properties of a shopper wish list defined for a site, associated with a customer account.
	 * @return com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 * @see com.mozu.api.contracts.commerceruntime.wishlists.Wishlist
	 */
	public com.mozu.api.contracts.commerceruntime.wishlists.Wishlist updateWishlist(com.mozu.api.contracts.commerceruntime.wishlists.Wishlist wishlist, String wishlistId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.wishlists.Wishlist> client = com.mozu.api.clients.commerce.WishlistClient.updateWishlistClient( wishlist,  wishlistId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the shopper wish list specified in the request and all items associated with it.
	 * <p><pre><code>
	 *	Wishlist wishlist = new Wishlist();
	 *	wishlist.deleteWishlist( wishlistId);
	 * </code></pre></p>
	 * @param wishlistId Unique identifier of the wish list.
	 * @return 
	 */
	public void deleteWishlist(String wishlistId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.WishlistClient.deleteWishlistClient( wishlistId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



