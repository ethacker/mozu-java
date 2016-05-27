/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.content.ActiveDateRange;

/**
 *	The document properties that define the content used by the content management system (CMS).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The character length associated with the document content.
	 */
	protected  Long contentLength;

	public Long getContentLength() {
		return this.contentLength;
	}

	public void setContentLength(Long contentLength) {
		this.contentLength = contentLength;
	}

	/**
	 * The mime type associated with the document content, if applicable.
	 */
	protected  String contentMimeType;

	public String getContentMimeType() {
		return this.contentMimeType;
	}

	public void setContentMimeType(String contentMimeType) {
		this.contentMimeType = contentMimeType;
	}

	/**
	 * The date and time the most recent content update was made. UTC date/time. System-supplied and read-only.
	 */
	protected  DateTime contentUpdateDate;

	public DateTime getContentUpdateDate() {
		return this.contentUpdateDate;
	}

	public void setContentUpdateDate(DateTime contentUpdateDate) {
		this.contentUpdateDate = contentUpdateDate;
	}

	protected  String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	/**
	 * If applicable, the file extension associated with the document content.
	 */
	protected  String extension;

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Unique identifier of the document.
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * When the document was added to the document list. System-supplied and read-only.
	 */
	protected  DateTime insertDate;

	public DateTime getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(DateTime insertDate) {
		this.insertDate = insertDate;
	}

	protected  String listFQN;

	public String getListFQN() {
		return this.listFQN;
	}

	public void setListFQN(String listFQN) {
		this.listFQN = listFQN;
	}

	/**
	 * The name of the document, which is unique within its folder.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected  String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}

	/**
	 * The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	 */
	protected  String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	/**
	 * Date and time when the entity was last updated, represented in UTC Date/Time.
	 */
	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	protected  ActiveDateRange activeDateRange;

	public ActiveDateRange getActiveDateRange() {
		return this.activeDateRange;
	}

	public void setActiveDateRange(ActiveDateRange activeDateRange) {
		this.activeDateRange = activeDateRange;
	}

	/**
	 * List of properties for the given property value.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode properties;

	public com.fasterxml.jackson.databind.JsonNode getProperties() {
		return this.properties;
	}

	public void setProperties(com.fasterxml.jackson.databind.JsonNode properties) {
		this.properties = properties;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(properties == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, properties);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.properties = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
