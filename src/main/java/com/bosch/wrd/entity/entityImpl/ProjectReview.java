package com.bosch.wrd.entity.entityImpl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "project_review")
public class ProjectReview extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "current_highlights")
	private String currentHighlights;

	@Column(name = "risks_issues")
	private String risksIssues;

	@Column(name = "activities_planned")
	private String activitiesPlanned;

	@Column(name = "mitigation")
	private String mitigation;

	@Column(name = "status")
	private String status;

	@Column(name = "title")
	private String title;

	@Column(name = "dateCreated")
	private Date dateCreated;

	@Column(name = "dateUpdated")
	private Date dateUpdated;

	@Column(name = "dateCreatedLight")
	private String dateCreatedLight;

	@Column(name = "dateUpdatedLight")
	private String dateUpdatedLight;

	@Column(name = "coordinator")
	private String coordinator;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;

	public ProjectReview() {
	}

	public ProjectReview(Long id) {
		super(id);
	}

	public ProjectReview(String currentHighlights, String risksIssues, String activitiesPlanned, String mitigation,
			String status, String title, Date dateCreated, Date dateUpdated, String dateCreatedLight,
			String dateUpdatedLight, String coordinator, Long id) {
		super(id);
		this.currentHighlights = currentHighlights;
		this.risksIssues = risksIssues;
		this.activitiesPlanned = activitiesPlanned;
		this.mitigation = mitigation;
		this.status = status;
		this.title = title;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.dateCreatedLight = dateCreatedLight;
		this.dateUpdatedLight = dateUpdatedLight;
		this.coordinator = coordinator;
	}

	public String getCurrentHighlights() {
		return currentHighlights;
	}

	public String getRisksIssues() {
		return risksIssues;
	}

	public String getActivitiesPlanned() {
		return activitiesPlanned;
	}

	public String getMitigation() {
		return mitigation;
	}

	public String getStatus() {
		return status;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setCurrentHighlights(String currentHighlights) {
		this.currentHighlights = currentHighlights;
	}

	public void setRisksIssues(String risksIssues) {
		this.risksIssues = risksIssues;
	}

	public void setActivitiesPlanned(String activitiesPlanned) {
		this.activitiesPlanned = activitiesPlanned;
	}

	public void setMitigation(String mitigation) {
		this.mitigation = mitigation;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRelease(Releases releases) {
		this.releases = releases;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
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

	public String getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

}
