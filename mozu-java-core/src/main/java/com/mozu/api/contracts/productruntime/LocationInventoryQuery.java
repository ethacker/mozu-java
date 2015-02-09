/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties for the product location inventory provided for queries to locate products by their location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInventoryQuery implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of location codes to associate with the location usage. At this time, you can only specify one location code in the request for the direct ship location usage type.
	 */
	protected List<String> locationCodes;
	public List<String> getLocationCodes() {
		return this.locationCodes;
	}
	public void setLocationCodes(List<String> locationCodes) {
		this.locationCodes = locationCodes;
	}

	/**
	 * List of product codes of associated products, used for pending product changes to publish or delete and returned in a product inventory location query.
	 */
	protected List<String> productCodes;
	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
