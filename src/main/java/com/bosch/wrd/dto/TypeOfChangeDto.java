package com.bosch.wrd.dto;

public class TypeOfChangeDto {

	private String id;
	private String name;
	
	public TypeOfChangeDto() {
	}

	public TypeOfChangeDto(String id, String name) {
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
