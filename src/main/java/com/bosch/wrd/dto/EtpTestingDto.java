package com.bosch.wrd.dto;

public class EtpTestingDto {

	private String id;
	private String value;
	
	public EtpTestingDto() {
	}

	public EtpTestingDto(String id, String value) {
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
