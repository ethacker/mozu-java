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
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Mozu.AppDev.Contracts.AppVersion ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppVersion implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.AppDev.Contracts.AppVersion majorVersion ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer majorVersion;

	public Integer getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(Integer majorVersion) {
		this.majorVersion = majorVersion;
	}

	/**
	 * Mozu.AppDev.Contracts.AppVersion minorVersion ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer minorVersion;

	public Integer getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(Integer minorVersion) {
		this.minorVersion = minorVersion;
	}

	/**
	 * Mozu.AppDev.Contracts.AppVersion revision ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer revision;

	public Integer getRevision() {
		return this.revision;
	}

	public void setRevision(Integer revision) {
		this.revision = revision;
	}


}
