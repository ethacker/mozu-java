/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a message returned by an order validation capability for the order specified in the request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderValidationMessage implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the order item associated with a validation message, order, or return.
	 */
	protected String orderItemId;

	public String getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * The text of the change message, such as "This product is no longer available." System-supplied and read-only.
	 */
	protected String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * The type of message returned by the order validation capability, such as "Fraud Score."
	 */
	protected String messageType;

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
