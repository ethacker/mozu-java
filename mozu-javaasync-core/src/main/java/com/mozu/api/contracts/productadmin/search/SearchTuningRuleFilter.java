/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin.search;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTuningRuleFilter implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String field;

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
