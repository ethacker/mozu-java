/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.PriceListNode;

/**
 *	The details of the price list.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceList implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Indicates if a capability, function tied to an Arc.js action, application, or price list is enabled for the tenant/site. If true, the capability/application/function/price list is enabled for the tenant. System-supplied and read-only with the exception of functions tied to an Arc.js action and price lists.
	 */
	protected  Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Indicates whether the price list is exclusive. When a price list is exclusive, shoppers that resolve to the exclusive price list can only view and purchase products that have price entries in the price list and any of its parents. The default is .
	 */
	protected  Boolean filteredInStoreFront;

	public Boolean getFilteredInStoreFront() {
		return this.filteredInStoreFront;
	}

	public void setFilteredInStoreFront(Boolean filteredInStoreFront) {
		this.filteredInStoreFront = filteredInStoreFront;
	}

	/**
	 * Specifies whether the price list is indexed for the site.
	 */
	protected  Boolean isIndexed;

	public Boolean getIsIndexed() {
		return this.isIndexed;
	}

	public void setIsIndexed(Boolean isIndexed) {
		this.isIndexed = isIndexed;
	}

	/**
	 * Specifies whether the price list is the default price list for the site. Refer to [Default](../../../guides/catalog/price-lists.htm#default) in the Price Lists guides topic for more information. 
	 */
	protected  Boolean isSiteDefault;

	public Boolean getIsSiteDefault() {
		return this.isSiteDefault;
	}

	public void setIsSiteDefault(Boolean isSiteDefault) {
		this.isSiteDefault = isSiteDefault;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The unique, user-defined code of the price list.
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * The internal identifier of the price list.
	 */
	protected  Integer priceListId;

	public Integer getPriceListId() {
		return this.priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	/**
	 * Specifies whether the price list is resolvable. When ,  is able to apply the price list and its product pricing directly to a shopper. When ,  is unable to apply the price list and its product pricing directly to a shopper; however  can still apply the price list to a shopper if it is a parent of a resolvable price list. Refer to [Resolution](../../../guides/catalog/price-lists.htm#resolution) in the Price Lists guides topic for more information.
	 */
	protected  Boolean resolvable;

	public Boolean getResolvable() {
		return this.resolvable;
	}

	public void setResolvable(Boolean resolvable) {
		this.resolvable = resolvable;
	}

	/**
	 * A list of site identifiers for which the price list is valid.
	 */
	protected List<Integer> validSites;
	public List<Integer> getValidSites() {
		return this.validSites;
	}
	public void setValidSites(List<Integer> validSites) {
		this.validSites = validSites;
	}

	/**
	 * A list of price lists and their details that describe the ancestor/parent hierarchy of the current price list. Each price list within this list is an ancestor/parent of the current price list. An ancestor/parent price list can have it's own ancestor/parent, which is denoted by .
	 */
	protected List<PriceListNode> ancestors;
	public List<PriceListNode> getAncestors() {
		return this.ancestors;
	}
	public void setAncestors(List<PriceListNode> ancestors) {
		this.ancestors = ancestors;
	}

	/**
	 * A list of price lists and their details that describe the descendant/child hierarchy of the current price list. Each price list within this list is an descendant/child of the current price list. A descendant/child price list can have it's own descendant/child, which is denoted by .
	 */
	protected List<PriceListNode> descendants;
	public List<PriceListNode> getDescendants() {
		return this.descendants;
	}
	public void setDescendants(List<PriceListNode> descendants) {
		this.descendants = descendants;
	}


}