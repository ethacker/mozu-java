/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of the inventory behavior associated with a product definition.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInventoryInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, Mozu manages inventory levels for this product.
	 */
	protected  Boolean manageStock;

	public Boolean getManageStock() {
		return this.manageStock;
	}

	public void setManageStock(Boolean manageStock) {
		this.manageStock = manageStock;
	}

	/**
	 * Determines the method this product uses when active stock is depeleted. Options are "DisplayMessage" to display an out of stock message to the shopper, "HideProduct" to disable the product on the storefront, or "AllowBackOrder" to allow the shopper to back order the product. This property is required only if Mozu manages inventory for this product.
	 */
	protected  String outOfStockBehavior;

	public String getOutOfStockBehavior() {
		return this.outOfStockBehavior;
	}

	public void setOutOfStockBehavior(String outOfStockBehavior) {
		this.outOfStockBehavior = outOfStockBehavior;
	}


}
