/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.sitesettings.order.ThirdPartyCredentialField;

/**
 *	Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPaymentWorkflowDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates if the object or process is enabled. This indicator is used on external payment workflows and product option values. For product options, if true, the product option value is available for a shopper to choose. During configuration, this property will be false if the option value is invalid with other selected options. For external payment workflows, if true, the workflow is enabled and available for routing payments for the submitted order.
	 */
	protected Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The credential fields required to communicate with the external payment processor.
	 */
	protected List<ThirdPartyCredentialField> credentials;
	public List<ThirdPartyCredentialField> getCredentials() {
		return this.credentials;
	}
	public void setCredentials(List<ThirdPartyCredentialField> credentials) {
		this.credentials = credentials;
	}

}
