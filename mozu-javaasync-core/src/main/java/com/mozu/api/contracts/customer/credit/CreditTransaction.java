/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer.credit;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditTransaction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Notes entered and saved with an order. These notes may be entered by a shopper on a wishlist or for an order. Comments may also be entered by Mozu Admins on an order that may be visible only to authorized shoppers and users.
	 */
	protected  String comments;

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The amount to apply to the credit balance. The defined transaction type determines whether this amount represents a positive or negative integer.
	 */
	protected  Double impactAmount;

	public Double getImpactAmount() {
		return this.impactAmount;
	}

	public void setImpactAmount(Double impactAmount) {
		this.impactAmount = impactAmount;
	}

	/**
	 * The type of transaction, pertaining to the transaction a customer performed or the type of customer credit. For customer credit, you will set the data to Debit to decrease or Credit to update. For the type of transaction, the type includes Order, Return, OrderPickup, or Wishlist.
	 */
	protected  String transactionType;

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
