/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.customer.Transaction;

/**
 *	Properties of a customer visit to one of a company's sites.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Visit implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer account associated with the visit.
	 */
	protected Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * If the customer visit is made online, the location code associated with the website visited.
	 */
	protected String browserLocationCode;

	public String getBrowserLocationCode() {
		return this.browserLocationCode;
	}

	public void setBrowserLocationCode(String browserLocationCode) {
		this.browserLocationCode = browserLocationCode;
	}

	/**
	 * The date and time of the customer visit.
	 */
	protected DateTime date;

	public DateTime getDate() {
		return this.date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	/**
	 * Unique identifier of the customer visit.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * If the customer visit is made in person and associated with a defined location, the code that identifies the location.
	 */
	protected String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * The type of customer visit, which is "Website," "Store," "Call," or "Unknown."
	 */
	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The user ID of the customer who visited the site.
	 */
	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * The HTTP_Referrer that initiatied the visit started. If the shopper was not referred from another source, this value is null.
	 */
	protected String webReferrer;

	public String getWebReferrer() {
		return this.webReferrer;
	}

	public void setWebReferrer(String webReferrer) {
		this.webReferrer = webReferrer;
	}

	/**
	 * If the visit was made online, the identifier of the web session associated with the visit, which is system-supplied and read only.
	 */
	protected String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	/**
	 * Unique identifier of the site.
	 */
	protected Integer webSiteId;

	public Integer getWebSiteId() {
		return this.webSiteId;
	}

	public void setWebSiteId(Integer webSiteId) {
		this.webSiteId = webSiteId;
	}

	/**
	 * The user agent string for the browser.
	 */
	protected String webUserAgent;

	public String getWebUserAgent() {
		return this.webUserAgent;
	}

	public void setWebUserAgent(String webUserAgent) {
		this.webUserAgent = webUserAgent;
	}

	/**
	 * Array list of transactions the customer performed during the visit. A customer can perform multiple transactions in a single visit, or the visit can have no associated transactions.
	 */
	protected List<Transaction> transactions;
	public List<Transaction> getTransactions() {
		return this.transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}