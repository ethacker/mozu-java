/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingadmin.ServiceTypeLocalizedContent;

/**
 *	Properties of the service type, or shipping method, for a specific shipping carrier.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The service type code supplied by the carrier. Service type codes include a prefix that indicates the carrier name. For example: FEDEX_INTERNATIONAL_STANDARD.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected  ServiceTypeLocalizedContent content;

	public ServiceTypeLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ServiceTypeLocalizedContent content) {
		this.content = content;
	}


}
