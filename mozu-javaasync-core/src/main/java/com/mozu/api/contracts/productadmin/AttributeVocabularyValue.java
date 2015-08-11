/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent;

/**
 *	Properties of a vocabulary value defined for an extensible attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * The number that denotes the order of the entity value within a list of entity values.
	 */
	protected Integer valueSequence;

	public Integer getValueSequence() {
		return this.valueSequence;
	}

	public void setValueSequence(Integer valueSequence) {
		this.valueSequence = valueSequence;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected AttributeVocabularyValueLocalizedContent content;

	public AttributeVocabularyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeVocabularyValueLocalizedContent content) {
		this.content = content;
	}

	/**
	 * The localized content of an attribute determined by the `localeCode`. This content is always in the default language of the MasterCatalog.
	 */
	protected List<AttributeVocabularyValueLocalizedContent> localizedContent;
	public List<AttributeVocabularyValueLocalizedContent> getLocalizedContent() {
		return this.localizedContent;
	}
	public void setLocalizedContent(List<AttributeVocabularyValueLocalizedContent> localizedContent) {
		this.localizedContent = localizedContent;
	}

}