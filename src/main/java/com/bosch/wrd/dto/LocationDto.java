package com.bosch.wrd.dto;

public class LocationDto {

	private String id;
	private String name;
	private Long releasesId;
	
	public LocationDto() {
	}

	public LocationDto(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Long getReleasesId() {
		return releasesId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setReleasesId(Long releasesId) {
		this.releasesId = releasesId;
	}
}
