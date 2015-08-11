/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The information required to authenticate third party applications against the Mozu API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppAuthInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the application. System-supplied and read-only.
	 */
	protected String applicationId;

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * System-supplied alphanumeric code used to authenticate applications. This string is only available for viewing in Mozu Dev Center.
	 */
	protected String sharedSecret;

	public String getSharedSecret() {
		return this.sharedSecret;
	}

	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}

}