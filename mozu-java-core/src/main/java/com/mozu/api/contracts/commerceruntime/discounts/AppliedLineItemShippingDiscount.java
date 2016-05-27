/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount;

/**
 *	The value of the shipping discount for each line item.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedLineItemShippingDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of the line item that is used for this particular discount.
	 */
	protected  Integer discountQuantity;

	public Integer getDiscountQuantity() {
		return this.discountQuantity;
	}

	public void setDiscountQuantity(Integer discountQuantity) {
		this.discountQuantity = discountQuantity;
	}

	/**
	 * The impact of this discount for each discount quantity.
	 */
	protected  Double impactPerUnit;

	public Double getImpactPerUnit() {
		return this.impactPerUnit;
	}

	public void setImpactPerUnit(Double impactPerUnit) {
		this.impactPerUnit = impactPerUnit;
	}

	protected  String methodCode;

	public String getMethodCode() {
		return this.methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	/**
	 * This describes shipping discounts that apply to a line item in the order, if any.
	 */
	protected  AppliedDiscount discount;

	public AppliedDiscount getDiscount() {
		return this.discount;
	}

	public void setDiscount(AppliedDiscount discount) {
		this.discount = discount;
	}


}
