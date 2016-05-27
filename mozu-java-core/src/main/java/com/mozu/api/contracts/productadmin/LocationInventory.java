/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of an inventory definition that defines the level of inventory for a specific product at a given location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInventory implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String baseProductCode;

	public String getBaseProductCode() {
		return this.baseProductCode;
	}

	public void setBaseProductCode(String baseProductCode) {
		this.baseProductCode = baseProductCode;
	}

	/**
	 * User-defined code that uniquely identifies the location.
	 */
	protected  String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected  String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The name defined in the product definition. System-supplied and read only.
	 */
	protected  String productName;

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * The stock level for the associated product currently available at this location, based on the number of pending product reservations. System-supplied and read only.
	 */
	protected  Integer stockAvailable;

	public Integer getStockAvailable() {
		return this.stockAvailable;
	}

	public void setStockAvailable(Integer stockAvailable) {
		this.stockAvailable = stockAvailable;
	}

	/**
	 * The stock level for the associated product currently on back order for this location, based on the number of pending product reservations. System-supplied and read only.
	 */
	protected  Integer stockOnBackOrder;

	public Integer getStockOnBackOrder() {
		return this.stockOnBackOrder;
	}

	public void setStockOnBackOrder(Integer stockOnBackOrder) {
		this.stockOnBackOrder = stockOnBackOrder;
	}

	/**
	 * The current physical stock level for the associated product, which does not account for pending product reservations.
	 */
	protected  Integer stockOnHand;

	public Integer getStockOnHand() {
		return this.stockOnHand;
	}

	public void setStockOnHand(Integer stockOnHand) {
		this.stockOnHand = stockOnHand;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
