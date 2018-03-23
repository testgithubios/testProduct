package com.bosch.wrd.dto;

public class RoleDto {

	private Long id;
	private String code;
	private String label;

	public RoleDto() {
	}

	public RoleDto(Long id, String code, String label) {
		super();
		this.id = id;
		this.code = code;
		this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
