/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Contact;
import com.mozu.api.contracts.commerceruntime.payments.PaymentCard;
import com.mozu.api.contracts.commerceruntime.payments.PurchaseOrderPayment;

/**
 *	Properties of the billing information entered for an order during checkout.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String externalTransactionId;

	public String getExternalTransactionId() {
		return this.externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	/**
	 * If true, the system overrides the customer's billing address information with the supplied fulfillment information.
	 */
	protected  Boolean isSameBillingShippingAddress;

	public Boolean getIsSameBillingShippingAddress() {
		return this.isSameBillingShippingAddress;
	}

	public void setIsSameBillingShippingAddress(Boolean isSameBillingShippingAddress) {
		this.isSameBillingShippingAddress = isSameBillingShippingAddress;
	}

	/**
	 * The type of payment, such as credit card, check, or PayPal Express. Additional payment types will be supported in future releases.
	 */
	protected  String paymentType;

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	protected  String paymentWorkflow;

	public String getPaymentWorkflow() {
		return this.paymentWorkflow;
	}

	public void setPaymentWorkflow(String paymentWorkflow) {
		this.paymentWorkflow = paymentWorkflow;
	}

	/**
	 * The code that identifies the store credit to apply to the order.
	 */
	protected  String storeCreditCode;

	public String getStoreCreditCode() {
		return this.storeCreditCode;
	}

	public void setStoreCreditCode(String storeCreditCode) {
		this.storeCreditCode = storeCreditCode;
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

	/**
	 * The cardholder's billing contact information, including addresses.
	 */
	protected  Contact billingContact;

	public Contact getBillingContact() {
		return this.billingContact;
	}

	public void setBillingContact(Contact billingContact) {
		this.billingContact = billingContact;
	}

	/**
	 * If the customer is paying by card, the credit card information.
	 */
	protected  PaymentCard card;

	public PaymentCard getCard() {
		return this.card;
	}

	public void setCard(PaymentCard card) {
		this.card = card;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected  PurchaseOrderPayment purchaseOrderPayment;

	public PurchaseOrderPayment getPurchaseOrderPayment() {
		return this.purchaseOrderPayment;
	}

	public void setPurchaseOrderPayment(PurchaseOrderPayment purchaseOrderPayment) {
		this.purchaseOrderPayment = purchaseOrderPayment;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
