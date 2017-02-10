/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.ProductRuntime.Contracts.PriceListNode ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListNode implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Specifies the id of the price list's parent within the ancestor/descendant hierarchy, if applicable.
	 */
	protected  Integer parentPriceListId;

	public Integer getParentPriceListId() {
		return this.parentPriceListId;
	}

	public void setParentPriceListId(Integer parentPriceListId) {
		this.parentPriceListId = parentPriceListId;
	}

	/**
	 * Specifies the code of the price list within the ancestor/descendant hierarchy, if applicable.
	 */
	protected  String priceListCode;

	public String getPriceListCode() {
		return this.priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	/**
	 * Specifies the internal id of the price list within the ancestor/descendant hierarchy, if applicable.
	 */
	protected  Integer priceListId;

	public Integer getPriceListId() {
		return this.priceListId;
	}

	public void setPriceListId(Integer priceListId) {
		this.priceListId = priceListId;
	}

	/**
	 * Denotes the place of the ancestor/descendant within the hierarchy. A value of 1 is the closest ancestor/descendant to the current price list. For example an ancestor that has a value of 1 is the direct parent of the current price list.
	 */
	protected  Integer priceListLevel;

	public Integer getPriceListLevel() {
		return this.priceListLevel;
	}

	public void setPriceListLevel(Integer priceListLevel) {
		this.priceListLevel = priceListLevel;
	}


}