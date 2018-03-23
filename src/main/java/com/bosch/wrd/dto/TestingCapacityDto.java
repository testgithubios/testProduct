package com.bosch.wrd.dto;

public class TestingCapacityDto {

	private Long id;
	private String projectName;
	private String hcpPjm;
	private String tbpPjm;
	private Boolean kickOff;
	private String plannedStartTime;
	private String plannedSop;
	private String plannedIsr;
	private String testLocation;
	private Long realeasesId;
	private TestingCapacityDetailDto[] testingDates;
	
	public TestingCapacityDto() {
		this.kickOff = false;
	}

	public TestingCapacityDto(Long id, String testLocation, String hcpPjm, String tbpPjm, Boolean kickOff) {
		this.id = id;
		this.testLocation = testLocation;
		this.hcpPjm = hcpPjm;
		this.tbpPjm = tbpPjm;
		this.kickOff = kickOff;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public String getHcpPjm() {
		return hcpPjm;
	}

	public String getTbpPjm() {
		return tbpPjm;
	}
	
	public Boolean getKickOff() {
		return kickOff;
	}

	public String getPlannedStartTime() {
		return plannedStartTime;
	}

	public String getPlannedSop() {
		return plannedSop;
	}

	public String getPlannedIsr() {
		return plannedIsr;
	}

	public String getTestLocation() {
		return testLocation;
	}

	public Long getRealeasesId() {
		return realeasesId;
	}
	
	public TestingCapacityDetailDto[] getTestingDates() {
		return testingDates;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setHcpPjm(String hcpPjm) {
		this.hcpPjm = hcpPjm;
	}

	public void setTbpPjm(String tbpPjm) {
		this.tbpPjm = tbpPjm;
	}
	
	public void setKickOff(Boolean kickOff) {
		this.kickOff = kickOff;
	}

	public void setPlannedStartTime(String plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}

	public void setPlannedSop(String plannedSop) {
		this.plannedSop = plannedSop;
	}

	public void setPlannedIsr(String plannedIsr) {
		this.plannedIsr = plannedIsr;
	}

	public void setTestLocation(String testLocation) {
		this.testLocation = testLocation;
	}

	public void setRealeasesId(Long realeasesId) {
		this.realeasesId = realeasesId;
	}
	
	public void setTestingDates(TestingCapacityDetailDto[] testingDates) {
		this.testingDates = testingDates;
	}

}
