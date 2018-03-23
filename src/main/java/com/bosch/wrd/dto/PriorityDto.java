package com.bosch.wrd.dto;

public class PriorityDto {

	private String id;
	private String name;
	
	public PriorityDto() {
	}

	public PriorityDto(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
