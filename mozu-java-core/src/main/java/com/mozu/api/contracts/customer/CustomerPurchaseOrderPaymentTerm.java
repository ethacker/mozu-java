/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	The purchase order payment terms that are associated with the specific customer account. Usually the payment terms are an amount of time, such as a certain amount of days the customer has in order to pay the order balance in full.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPurchaseOrderPaymentTerm implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The code of the payment term associated with the customer purchase order account. This term must match the payment term code specified in the purchase order site settings.Refer to [Payment Terms](https://www.mozu.com/guides/orders/purchase-order.htm#payment_terms) in the Purchase Order guides topic for more information.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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
	 * Unique identifier for the site. This ID is used at all levels of a store, catalog, and tenant to associate objects to a site.
	 */
	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. This data may be captured when creating, updating, and removing data.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}