/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Validates the attribute configured for the customer in the storefront against the attribute configured in Mozu admin.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeValidation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The latest possible date and time the extensible attribute can be validated.
	 */
	protected  DateTime maxDateTime;

	public DateTime getMaxDateTime() {
		return this.maxDateTime;
	}

	public void setMaxDateTime(DateTime maxDateTime) {
		this.maxDateTime = maxDateTime;
	}

	/**
	 * The maximum number that can be entered as a value for an extensible attribute.
	 */
	protected  Double maxNumericValue;

	public Double getMaxNumericValue() {
		return this.maxNumericValue;
	}

	public void setMaxNumericValue(Double maxNumericValue) {
		this.maxNumericValue = maxNumericValue;
	}

	/**
	 * The maximum length possible for a string value entered for an extensible attribute.
	 */
	protected  Integer maxStringLength;

	public Integer getMaxStringLength() {
		return this.maxStringLength;
	}

	public void setMaxStringLength(Integer maxStringLength) {
		this.maxStringLength = maxStringLength;
	}

	/**
	 * The earliest date and time an extensible attribute can be validated.
	 */
	protected  DateTime minDateTime;

	public DateTime getMinDateTime() {
		return this.minDateTime;
	}

	public void setMinDateTime(DateTime minDateTime) {
		this.minDateTime = minDateTime;
	}

	/**
	 * The minimum numeric value required to validate an extensible attribute.
	 */
	protected  Double minNumericValue;

	public Double getMinNumericValue() {
		return this.minNumericValue;
	}

	public void setMinNumericValue(Double minNumericValue) {
		this.minNumericValue = minNumericValue;
	}

	/**
	 * The maximum length possible for a string value entered for an extensible attribute.
	 */
	protected  Integer minStringLength;

	public Integer getMinStringLength() {
		return this.minStringLength;
	}

	public void setMinStringLength(Integer minStringLength) {
		this.minStringLength = minStringLength;
	}

	/**
	 * Regular expression used to validate the extensible attribute value.
	 */
	protected  String regularExpression;

	public String getRegularExpression() {
		return this.regularExpression;
	}

	public void setRegularExpression(String regularExpression) {
		this.regularExpression = regularExpression;
	}


}
