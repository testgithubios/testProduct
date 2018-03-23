package com.bosch.wrd.dto;

public class TestingCapacityDetailDto {

	private Long id;
	private String key;
	private String value;
	private Boolean readOnly;
	
	public TestingCapacityDetailDto() {
	}

	public TestingCapacityDetailDto(Long id, String key, String value) {
		this.id = id;
		this.key = key;
		this.value = value;
		this.readOnly = false;
	}
	
	public Long getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
	
	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
