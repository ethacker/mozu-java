/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.appdev.ApplicationTransaction;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationEntitlement implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	protected  Integer applicationEntitlementId;

	public Integer getApplicationEntitlementId() {
		return this.applicationEntitlementId;
	}

	public void setApplicationEntitlementId(Integer applicationEntitlementId) {
		this.applicationEntitlementId = applicationEntitlementId;
	}

	protected  Integer applicationId;

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	protected  String applicationLicenseType;

	public String getApplicationLicenseType() {
		return this.applicationLicenseType;
	}

	public void setApplicationLicenseType(String applicationLicenseType) {
		this.applicationLicenseType = applicationLicenseType;
	}

	protected  String applicationName;

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	protected  String applicationStatusId;

	public String getApplicationStatusId() {
		return this.applicationStatusId;
	}

	public void setApplicationStatusId(String applicationStatusId) {
		this.applicationStatusId = applicationStatusId;
	}

	protected  String applicationVersion;

	public String getApplicationVersion() {
		return this.applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	protected  Integer appOwnerDevAccountId;

	public Integer getAppOwnerDevAccountId() {
		return this.appOwnerDevAccountId;
	}

	public void setAppOwnerDevAccountId(Integer appOwnerDevAccountId) {
		this.appOwnerDevAccountId = appOwnerDevAccountId;
	}

	protected  Integer devAccountId;

	public Integer getDevAccountId() {
		return this.devAccountId;
	}

	public void setDevAccountId(Integer devAccountId) {
		this.devAccountId = devAccountId;
	}

	protected  DateTime effectiveEndDate;

	public DateTime getEffectiveEndDate() {
		return this.effectiveEndDate;
	}

	public void setEffectiveEndDate(DateTime effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	protected  DateTime effectiveStartDate;

	public DateTime getEffectiveStartDate() {
		return this.effectiveStartDate;
	}

	public void setEffectiveStartDate(DateTime effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	protected  String entitlementStatus;

	public String getEntitlementStatus() {
		return this.entitlementStatus;
	}

	public void setEntitlementStatus(String entitlementStatus) {
		this.entitlementStatus = entitlementStatus;
	}

	protected  String installedAppsApplicationId;

	public String getInstalledAppsApplicationId() {
		return this.installedAppsApplicationId;
	}

	public void setInstalledAppsApplicationId(String installedAppsApplicationId) {
		this.installedAppsApplicationId = installedAppsApplicationId;
	}

	protected  String installedByFirstName;

	public String getInstalledByFirstName() {
		return this.installedByFirstName;
	}

	public void setInstalledByFirstName(String installedByFirstName) {
		this.installedByFirstName = installedByFirstName;
	}

	protected  String installedByLastName;

	public String getInstalledByLastName() {
		return this.installedByLastName;
	}

	public void setInstalledByLastName(String installedByLastName) {
		this.installedByLastName = installedByLastName;
	}

	protected  DateTime installedDate;

	public DateTime getInstalledDate() {
		return this.installedDate;
	}

	public void setInstalledDate(DateTime installedDate) {
		this.installedDate = installedDate;
	}

	protected  Integer packageId;

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	protected  String packageName;

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	protected  Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	protected  String tenantName;

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	protected List<ApplicationTransaction> applicationTransactions;
	public List<ApplicationTransaction> getApplicationTransactions() {
		return this.applicationTransactions;
	}
	public void setApplicationTransactions(List<ApplicationTransaction> applicationTransactions) {
		this.applicationTransactions = applicationTransactions;
	}


}
