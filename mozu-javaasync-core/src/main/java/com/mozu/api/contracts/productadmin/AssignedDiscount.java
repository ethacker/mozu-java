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

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssignedDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String couponSetCode;

	public String getCouponSetCode() {
		return this.couponSetCode;
	}

	public void setCouponSetCode(String couponSetCode) {
		this.couponSetCode = couponSetCode;
	}

	protected  Integer couponSetId;

	public Integer getCouponSetId() {
		return this.couponSetId;
	}

	public void setCouponSetId(Integer couponSetId) {
		this.couponSetId = couponSetId;
	}

	protected  Integer discountId;

	public Integer getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}


}
