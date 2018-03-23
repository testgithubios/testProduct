package com.bosch.wrd.dto;

public class CustomerPlantDto {

	private String id;
	private String description;
	
	public CustomerPlantDto() {
	}

	public CustomerPlantDto(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
