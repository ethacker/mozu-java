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

/**
 *	Mozu.ProductAdmin.Contracts.CategorySequence ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorySequence implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of a category. 
	 */
	protected Integer categoryId;

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.CategorySequence parentCategoryId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer parentCategoryId;

	public Integer getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * The numeric order of objects, used by a vocabulary value defined for an extensible attribute, images, and categories.
	 */
	protected Integer sequence;

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

}
