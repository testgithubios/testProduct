package com.bosch.wrd.dto;

public class ProjectReviewDto {

	private String dateCreated;
	private String dateUpdated;
	private String dateCreatedLight;
	private String dateUpdatedLight;
	private String title;
	private String subTitle1;
	private String subTitle2;
	private String currentHighLight;
	private String currentHighLightData;
	private String activitiesPlanned;
	private String activitiesPlannedData;
	private String risks;
	private String risksData;
	private String mitigation;
	private String mitigationData;
	private String status;
	private String coordinator;
	private Long id;
	private Long releasesId;

	public ProjectReviewDto() {
	}

	public ProjectReviewDto(String currentHighLightData, String risksData, String activitiesPlannedData,
			String mitigationData, String status, String title, String dateCreated, String dateUpdated,
			String dateCreatedLight, String dateUpdatedLight, String coordinator, Long id) {
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.title = title;
		this.currentHighLightData = currentHighLightData;
		this.activitiesPlannedData = activitiesPlannedData;
		this.risksData = risksData;
		this.mitigationData = mitigationData;
		this.status = status;
		this.dateCreatedLight = dateCreatedLight;
		this.dateUpdatedLight = dateUpdatedLight;
		this.coordinator = coordinator;
		this.id = id;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCurrentHighLight() {
		return currentHighLight;
	}

	public void setCurrentHighLight(String currentHighLight) {
		this.currentHighLight = currentHighLight;
	}

	public String getActivitiesPlanned() {
		return activitiesPlanned;
	}

	public void setActivitiesPlanned(String activitiesPlanned) {
		this.activitiesPlanned = activitiesPlanned;
	}

	public String getRisks() {
		return risks;
	}

	public void setRisks(String risks) {
		this.risks = risks;
	}

	public String getMitigation() {
		return mitigation;
	}

	public void setMitigation(String mitigation) {
		this.mitigation = mitigation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateCreatedLight() {
		return dateCreatedLight;
	}

	public void setDateCreatedLight(String dateCreatedLight) {
		this.dateCreatedLight = dateCreatedLight;
	}

	public String getDateUpdatedLight() {
		return dateUpdatedLight;
	}

	public void setDateUpdatedLight(String dateUpdatedLight) {
		this.dateUpdatedLight = dateUpdatedLight;
	}

	public String getSubTitle1() {
		return subTitle1;
	}

	public void setSubTitle1(String subTitle1) {
		this.subTitle1 = subTitle1;
	}

	public String getSubTitle2() {
		return subTitle2;
	}

	public void setSubTitle2(String subTitle2) {
		this.subTitle2 = subTitle2;
	}

	public String getCurrentHighLightData() {
		return currentHighLightData;
	}

	public void setCurrentHighLightData(String currentHighLightData) {
		this.currentHighLightData = currentHighLightData;
	}

	public String getActivitiesPlannedData() {
		return activitiesPlannedData;
	}

	public void setActivitiesPlannedData(String activitiesPlannedData) {
		this.activitiesPlannedData = activitiesPlannedData;
	}

	public String getRisksData() {
		return risksData;
	}

	public void setRisksData(String risksData) {
		this.risksData = risksData;
	}

	public String getMitigationData() {
		return mitigationData;
	}

	public void setMitigationData(String mitigationData) {
		this.mitigationData = mitigationData;
	}

	public Long getReleasesId() {
		return releasesId;
	}

	public void setReleasesId(Long releasesId) {
		this.releasesId = releasesId;
	}

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
