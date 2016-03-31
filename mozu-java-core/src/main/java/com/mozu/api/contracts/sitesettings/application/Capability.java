/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.application;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.thirdparty.ActiveShippingCountry;
import com.mozu.api.contracts.core.thirdparty.OperationUrl;
import com.mozu.api.contracts.core.thirdparty.InitializablePropertyValue;
import com.mozu.api.contracts.core.thirdparty.InitializableShippingCountryPropertyValue;

/**
 *	Properties of a capability application installed in a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Capability implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Indicates if the capability or app is enabled for the tenant/site. If true, the capability/application is enabled for the tenant. System-supplied and read-only.
	 */
	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Indicates if an app is initialized and capable of being enabled in the tenant and site. Apps will need to be installed and configured to become initialized, such as validating credentials and/or API keys with a third-party service. If true, the app is initialized and can be enabled for usage.
	 */
	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	/**
	 * The ID of the specific scope for the object. 
	 */
	protected Integer scopeId;

	public Integer getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(Integer scopeId) {
		this.scopeId = scopeId;
	}

	/**
	 * The scope at which the object exists, such as "Tenant", "MasterCatalog", or "Site". Scope delineates the level and area of Mozu the object exists within or affects.
	 */
	protected String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	/**
	 * Array list of credit types active for the capability.
	 */
	protected List<String> activeCreditTypes;
	public List<String> getActiveCreditTypes() {
		return this.activeCreditTypes;
	}
	public void setActiveCreditTypes(List<String> activeCreditTypes) {
		this.activeCreditTypes = activeCreditTypes;
	}

	/**
	 * Array list of the countries (by country code) for which this capability can actively shop. All active shopping countries must be in the supported shopping country list. Validation rules determine the supported validity of the entered country against the list.
	 */
	protected List<String> activeShoppingCountries;
	public List<String> getActiveShoppingCountries() {
		return this.activeShoppingCountries;
	}
	public void setActiveShoppingCountries(List<String> activeShoppingCountries) {
		this.activeShoppingCountries = activeShoppingCountries;
	}

	/**
	 * The enablement mode of the capability, typically read only.
	 */
	protected String capabilityMode;

	public String getCapabilityMode() {
		return this.capabilityMode;
	}

	public void setCapabilityMode(String capabilityMode) {
		this.capabilityMode = capabilityMode;
	}

	/**
	 * The capability type installed in the tenant.
	 */
	protected String capabilityType;

	public String getCapabilityType() {
		return this.capabilityType;
	}

	public void setCapabilityType(String capabilityType) {
		this.capabilityType = capabilityType;
	}

	/**
	 * Array list of the countries (by country code) to which this capability can actively ship. The entered shipping country is validated against a list of supported shipping countries. Messages return if the country code is not supported or duplicated. Supported carriers are also checked per country code.
	 */
	protected List<ActiveShippingCountry> activeShippingCountries;
	public List<ActiveShippingCountry> getActiveShippingCountries() {
		return this.activeShippingCountries;
	}
	public void setActiveShippingCountries(List<ActiveShippingCountry> activeShippingCountries) {
		this.activeShippingCountries = activeShippingCountries;
	}

	/**
	 * Array list of URL endpoints for the operations associated with this capability.
	 */
	protected List<OperationUrl> operationUrls;
	public List<OperationUrl> getOperationUrls() {
		return this.operationUrls;
	}
	public void setOperationUrls(List<OperationUrl> operationUrls) {
		this.operationUrls = operationUrls;
	}

	/**
	 * List of credit types this capability supports.
	 */
	protected List<InitializablePropertyValue> supportedCreditTypes;
	public List<InitializablePropertyValue> getSupportedCreditTypes() {
		return this.supportedCreditTypes;
	}
	public void setSupportedCreditTypes(List<InitializablePropertyValue> supportedCreditTypes) {
		this.supportedCreditTypes = supportedCreditTypes;
	}

	/**
	 * Array list of countries this capability supports for shipping.
	 */
	protected List<InitializableShippingCountryPropertyValue> supportedShippingCountries;
	public List<InitializableShippingCountryPropertyValue> getSupportedShippingCountries() {
		return this.supportedShippingCountries;
	}
	public void setSupportedShippingCountries(List<InitializableShippingCountryPropertyValue> supportedShippingCountries) {
		this.supportedShippingCountries = supportedShippingCountries;
	}

	/**
	 * List of countries this capability supports for shopping.
	 */
	protected List<InitializablePropertyValue> supportedShoppingCountries;
	public List<InitializablePropertyValue> getSupportedShoppingCountries() {
		return this.supportedShoppingCountries;
	}
	public void setSupportedShoppingCountries(List<InitializablePropertyValue> supportedShoppingCountries) {
		this.supportedShoppingCountries = supportedShoppingCountries;
	}

}
