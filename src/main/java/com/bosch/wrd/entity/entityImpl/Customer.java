package com.bosch.wrd.entity.entityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bosch.wrd.entity.StringEntity;

@Entity
@Table(name = "customer")
public class Customer extends StringEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	private String name;

	public Customer() {
	}

	public Customer(String id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
