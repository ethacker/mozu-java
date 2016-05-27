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
 *	The cost a client pays the supplier to stock the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCost implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The amount paid by the client to stock the product.
	 */
	protected  Double cost;

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String isoCurrencyCode;

	public String getIsoCurrencyCode() {
		return this.isoCurrencyCode;
	}

	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}


}
