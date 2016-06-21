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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.sitesettings.order.PurchaseOrderCustomField;
import com.mozu.api.contracts.sitesettings.order.PurchaseOrderPaymentTerm;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderPaymentDefinition implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean allowSplitPayment;

	public Boolean getAllowSplitPayment() {
		return this.allowSplitPayment;
	}

	public void setAllowSplitPayment(Boolean allowSplitPayment) {
		this.allowSplitPayment = allowSplitPayment;
	}

	protected  Boolean isEnabled;

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	protected List<PurchaseOrderCustomField> customFields;
	public List<PurchaseOrderCustomField> getCustomFields() {
		return this.customFields;
	}
	public void setCustomFields(List<PurchaseOrderCustomField> customFields) {
		this.customFields = customFields;
	}

	protected List<PurchaseOrderPaymentTerm> paymentTerms;
	public List<PurchaseOrderPaymentTerm> getPaymentTerms() {
		return this.paymentTerms;
	}
	public void setPaymentTerms(List<PurchaseOrderPaymentTerm> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}


}
