package org.openmrs.module.openhmis.commons.api.entity.model;

import org.openmrs.OpenmrsMetadata;

public interface InstanceAttributeType<TOwner extends InstanceType<TOwner>>
		extends  OpenmrsMetadata {
	TOwner getOwner();
	void setOwner(TOwner owner);

	Integer getAttributeOrder();
	void setAttributeOrder(Integer attributeOrder);

	String getFormat();
	void setFormat(String format);

	Integer getForeignKey();
	void setForeignKey(Integer foreignKey);

	String getRegExp();
	void setRegExp(String regExp);

	Boolean getRequired();
	void setRequired(Boolean required);
}

