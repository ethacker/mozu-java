/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general.general;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewAuthorizations implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean requireAuthForLive;

	public Boolean getRequireAuthForLive() {
		return this.requireAuthForLive;
	}

	public void setRequireAuthForLive(Boolean requireAuthForLive) {
		this.requireAuthForLive = requireAuthForLive;
	}

	protected  Boolean requireAuthForPending;

	public Boolean getRequireAuthForPending() {
		return this.requireAuthForPending;
	}

	public void setRequireAuthForPending(Boolean requireAuthForPending) {
		this.requireAuthForPending = requireAuthForPending;
	}


}
