package com.bosch.wrd.entity.entityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "unit")
public class Unit extends StringEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "description")
	private String description;
	
	public Unit() {
	}

	public Unit(String id, String description) {
		super(id);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
