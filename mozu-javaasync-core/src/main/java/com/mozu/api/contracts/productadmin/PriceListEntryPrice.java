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
	 * Mozu.ProductAdmin.Contracts.PriceListEntryPrice listPrice ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Double listPrice;

	public Double getListPrice() {
		return this.listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.PriceListEntryPrice listPriceMode ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String listPriceMode;

	public String getListPriceMode() {
		return this.listPriceMode;
	}

	public void setListPriceMode(String listPriceMode) {
		this.listPriceMode = listPriceMode;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.PriceListEntryPrice minQty ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer minQty;

	public Integer getMinQty() {
		return this.minQty;
	}

	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	/**
	 * The set sale price for a product consisting of a price with a discount already applied.
	 */
	protected  Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.PriceListEntryPrice salePriceMode ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String salePriceMode;

	public String getSalePriceMode() {
		return this.salePriceMode;
	}

	public void setSalePriceMode(String salePriceMode) {
		this.salePriceMode = salePriceMode;
	}


}
