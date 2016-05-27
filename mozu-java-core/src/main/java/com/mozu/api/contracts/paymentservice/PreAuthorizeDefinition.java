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
import com.mozu.api.contracts.paymentservice.PreAuthorizeTransactionTypeDataContract;

/**
 *	Definition of the preauthorization gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAuthorizeDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Identifier of the entity.
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The product environment URL associated with the preauthorization gateway.
	 */
	protected  String preAuthorizeProdUrl;

	public String getPreAuthorizeProdUrl() {
		return this.preAuthorizeProdUrl;
	}

	public void setPreAuthorizeProdUrl(String preAuthorizeProdUrl) {
		this.preAuthorizeProdUrl = preAuthorizeProdUrl;
	}

	/**
	 * The test environment URL associated with the preauthorization gateway.
	 */
	protected  String preAuthorizeTestUrl;

	public String getPreAuthorizeTestUrl() {
		return this.preAuthorizeTestUrl;
	}

	public void setPreAuthorizeTestUrl(String preAuthorizeTestUrl) {
		this.preAuthorizeTestUrl = preAuthorizeTestUrl;
	}

	/**
	 * The type of preauthorization gateway.
	 */
	protected  PreAuthorizeTransactionTypeDataContract type;

	public PreAuthorizeTransactionTypeDataContract getType() {
		return this.type;
	}

	public void setType(PreAuthorizeTransactionTypeDataContract type) {
		this.type = type;
	}


}
