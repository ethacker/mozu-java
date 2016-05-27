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
 *	The properties of the price difference between the product extra and the base product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductExtraValueDeltaPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * The difference between the price associated with this product extra and the base product. For example, if a product with a defined monogram extra costs an additional $10, the DeltaPrice value is "10".
	 */
	protected  Double deltaPrice;

	public Double getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(Double deltaPrice) {
		this.deltaPrice = deltaPrice;
	}


}
