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
 *	Mozu.ProductAdmin.Contracts.PriceListEntryPrice ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListEntryPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The product's list price if  is set to .
	 */
	protected  Double listPrice;

	public Double getListPrice() {
		return this.listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * Specifies whether to use the product's default catalog list price, or to override the product's default catalog list price.This property has the following valid values:* * 
	 */
	protected  String listPriceMode;

	public String getListPriceMode() {
		return this.listPriceMode;
	}

	public void setListPriceMode(String listPriceMode) {
		this.listPriceMode = listPriceMode;
	}

	/**
	 * This property is for future price list entry functionality and currently should always be 1.
	 */
	protected  Integer minQty;

	public Integer getMinQty() {
		return this.minQty;
	}

	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	/**
	 * The set sale price for a product consisting of a price with a discount already applied.For price list entries, this property is the product's sale price if the  is set to .
	 */
	protected  Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * Specifies whether to use the product's default catalog sale price, or to override the product's default catalog sale price.This property has the following valid values:* * 
	 */
	protected  String salePriceMode;

	public String getSalePriceMode() {
		return this.salePriceMode;
	}

	public void setSalePriceMode(String salePriceMode) {
		this.salePriceMode = salePriceMode;
	}


}
