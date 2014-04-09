/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties to describe the unit of measure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnitOfMeasure implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The name of the unit of measure, such as "foot".
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The plural name of the unit of measure, such as "feet".
	 */
	protected String pluralName;

	public String getPluralName() {
		return this.pluralName;
	}

	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}

	/**
	 * The abbreviated symbol for the unit of measure, such as "ft".
	 */
	protected String symbol;

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * The type of measurement, such as length or volume.
	 */
	protected String unitOfMeasureType;

	public String getUnitOfMeasureType() {
		return this.unitOfMeasureType;
	}

	public void setUnitOfMeasureType(String unitOfMeasureType) {
		this.unitOfMeasureType = unitOfMeasureType;
	}

}