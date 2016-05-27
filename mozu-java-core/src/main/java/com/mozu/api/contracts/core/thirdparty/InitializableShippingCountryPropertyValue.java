/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.thirdparty;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.thirdparty.InitializablePropertyValue;

/**
 *	Property value that can be initialized for a capability that uses shipping countries.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitializableShippingCountryPropertyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the property value is initialized.
	 */
	protected  Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	/**
	 * Value of the initializable third-party capability property.
	 */
	protected  String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Child value in a hierarchy of shipping country properties.
	 */
	protected List<InitializablePropertyValue> child;
	public List<InitializablePropertyValue> getChild() {
		return this.child;
	}
	public void setChild(List<InitializablePropertyValue> child) {
		this.child = child;
	}


}
