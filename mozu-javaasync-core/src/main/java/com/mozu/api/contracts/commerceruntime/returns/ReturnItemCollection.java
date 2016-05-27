/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;

/**
 *	Collection of all return items that appear on the order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnItemCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Retrieves the details of all return items in an order.
	 */
	protected List<ReturnItem> items;
	public List<ReturnItem> getItems() {
		return this.items;
	}
	public void setItems(List<ReturnItem> items) {
		this.items = items;
	}


}
