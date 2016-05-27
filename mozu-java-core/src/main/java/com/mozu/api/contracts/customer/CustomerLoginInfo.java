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

/**
 *	The login information for a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerLoginInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The email address associated with the customer login.
	 */
	protected  String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	protected  String externalPassword;

	public String getExternalPassword() {
		return this.externalPassword;
	}

	public void setExternalPassword(String externalPassword) {
		this.externalPassword = externalPassword;
	}

	/**
	 * If true, this customer account data was imported from an external program.
	 */
	protected  Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * The password associated with the customer login.
	 */
	protected  String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * The user name associated with the customer login.
	 */
	protected  String username;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
