/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicCard implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.PaymentService.Contracts.PublicCard cardHolderName ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String cardHolderName;

	public String getCardHolderName() {
		return this.cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * Mozu.PaymentService.Contracts.PublicCard cardIssueMonth ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer cardIssueMonth;

	public Integer getCardIssueMonth() {
		return this.cardIssueMonth;
	}

	public void setCardIssueMonth(Integer cardIssueMonth) {
		this.cardIssueMonth = cardIssueMonth;
	}

	/**
	 * For Amex Cards, this is an additional field for verification that is used in conjunction with a CVV
	 */
	protected  String cardIssueNumber;

	public String getCardIssueNumber() {
		return this.cardIssueNumber;
	}

	public void setCardIssueNumber(String cardIssueNumber) {
		this.cardIssueNumber = cardIssueNumber;
	}

	/**
	 * Mozu.PaymentService.Contracts.PublicCard cardIssueYear ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer cardIssueYear;

	public Integer getCardIssueYear() {
		return this.cardIssueYear;
	}

	public void setCardIssueYear(Integer cardIssueYear) {
		this.cardIssueYear = cardIssueYear;
	}

	/**
	 * This is the full number of the card.
	 */
	protected  String cardNumber;

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Mozu.PaymentService.Contracts.PublicCard cardType ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String cardType;

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * Mozu.PaymentService.Contracts.PublicCard cvv ApiTypeMember DOCUMENT_HERE 
	 */
	protected  String cvv;

	public String getCvv() {
		return this.cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	/**
	 * The two-digit month a credit card expires for a payment method.
	 */
	protected  Integer expireMonth;

	public Integer getExpireMonth() {
		return this.expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	/**
	 * The four-digit year the credit card expires for a payment method.
	 */
	protected  Integer expireYear;

	public Integer getExpireYear() {
		return this.expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}


}
