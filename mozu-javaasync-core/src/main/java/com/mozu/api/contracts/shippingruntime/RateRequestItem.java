/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingruntime.ProductSummary;
import com.mozu.api.contracts.shippingruntime.ItemMeasurements;

/**
 *	Properties of an item for which to calculate a shipping rate.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateRequestItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the item to ship, for which to calculate a shipping rate.
	 */
	protected  String itemId;

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * Quantity of the item for which to calculate the shipping rate.
	 */
	protected  Integer quantity;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * If true, this item must ship separately from other items in a shipment.
	 */
	protected  Boolean shipsByItself;

	public Boolean getShipsByItself() {
		return this.shipsByItself;
	}

	public void setShipsByItself(Boolean shipsByItself) {
		this.shipsByItself = shipsByItself;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	protected List<ProductSummary> productSummaries;
	public List<ProductSummary> getProductSummaries() {
		return this.productSummaries;
	}
	public void setProductSummaries(List<ProductSummary> productSummaries) {
		this.productSummaries = productSummaries;
	}

	/**
	 * The measured weight and dimensions of the item to ship.
	 */
	protected  ItemMeasurements unitMeasurements;

	public ItemMeasurements getUnitMeasurements() {
		return this.unitMeasurements;
	}

	public void setUnitMeasurements(ItemMeasurements unitMeasurements) {
		this.unitMeasurements = unitMeasurements;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
