package com.bosch.wrd.entity.entityImpl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "stearing_committee")
public class StearingCommittee extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "kpi_t")
	private String kpit;

	@Column(name = "kpi_s")
	private String kpis;

	@Column(name = "kpi_b")
	private String kpib;

	@Column(name = "risk_if")
	private String riskif;

	@Column(name = "risk_then")
	private String riskThen;

	@Column(name = "risk_rating")
	private String riskRating;

	@Column(name = "risk_corrective_action")
	private String riskCorrectiveAction;

	@Column(name = "risk_due")
	private Date riskDue;

	@Column(name = "qg_actual_0")
	private Date qgActual0;

	@Column(name = "qg_actual_1")
	private Date qgActual1;

	@Column(name = "qg_actual_2")
	private Date qgActual2;

	@Column(name = "qg_actual_3")
	private Date qgActual3;

	@Column(name = "qg_actual_4")
	private Date qgActual4;

	@Column(name = "qg_actual_5")
	private Date qgActual5;

	@Column(name = "project_highlight_issue")
	private String projectHighlightIssue;

	@Column(name = "project_highlight_reason")
	private String projectHighlightReason;
	
	@Column(name = "reportDate")
	private Date reportDate;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "pjm")
	private String pjm;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;

	public StearingCommittee() {
	}

	public StearingCommittee(Long id) {
		super(id);
	}

	public StearingCommittee(Long id, String kpit, String kpis, String kpib, String riskif, 
			String riskThen, String riskRating, String riskCorrectiveAction, Date riskDue, Date qgActual0,
			Date qgActual1, Date qgActual2, Date qgActual3, Date qgActual4, Date qgActual5,
			String projectHighlightIssue, String projectHighlightReason, Date reportDate, String title, String pjm) {
		super(id);
		this.kpit = kpit;
		this.kpis = kpis;
		this.kpib = kpib;
		this.riskif = riskif;
		this.riskThen = riskThen;
		this.riskRating = riskRating;
		this.riskCorrectiveAction = riskCorrectiveAction;
		this.riskDue = riskDue;
		this.qgActual0 = qgActual0;
		this.qgActual1 = qgActual1;
		this.qgActual2 = qgActual2;
		this.qgActual3 = qgActual3;
		this.qgActual4 = qgActual4;
		this.qgActual5 = qgActual5;
		this.projectHighlightIssue = projectHighlightIssue;
		this.projectHighlightReason = projectHighlightReason;
		this.reportDate = reportDate;
		this.title = title;
		this.pjm = pjm;
	}
	
	@PrePersist
	void onCreate() {
		this.setReportDate(new Date());
	}
	
	@PreUpdate
	void onPersist() {
		this.setReportDate(new Date());
	}

	public String getKpit() {
		return kpit;
	}

	public String getKpis() {
		return kpis;
	}

	public String getKpib() {
		return kpib;
	}

	public String getRiskif() {
		return riskif;
	}

	public String getRiskThen() {
		return riskThen;
	}

	public String getRiskRating() {
		return riskRating;
	}

	public String getRiskCorrectiveAction() {
		return riskCorrectiveAction;
	}

	public Date getRiskDue() {
		return riskDue;
	}

	public Date getQgActual0() {
		return qgActual0;
	}

	public Date getQgActual1() {
		return qgActual1;
	}

	public Date getQgActual2() {
		return qgActual2;
	}

	public Date getQgActual3() {
		return qgActual3;
	}

	public Date getQgActual4() {
		return qgActual4;
	}

	public Date getQgActual5() {
		return qgActual5;
	}

	public String getProjectHighlightIssue() {
		return projectHighlightIssue;
	}

	public String getProjectHighlightReason() {
		return projectHighlightReason;
	}
	
	public Date getReportDate() {
		return reportDate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPjm() {
		return pjm;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setKpit(String kpit) {
		this.kpit = kpit;
	}

	public void setKpis(String kpis) {
		this.kpis = kpis;
	}

	public void setKpib(String kpib) {
		this.kpib = kpib;
	}

	public void setRiskif(String riskif) {
		this.riskif = riskif;
	}

	public void setRiskThen(String riskThen) {
		this.riskThen = riskThen;
	}

	public void setRiskRating(String riskRating) {
		this.riskRating = riskRating;
	}

	public void setRiskCorrectiveAction(String riskCorrectiveAction) {
		this.riskCorrectiveAction = riskCorrectiveAction;
	}

	public void setRiskDue(Date riskDue) {
		this.riskDue = riskDue;
	}

	public void setQgActual0(Date qgActual0) {
		this.qgActual0 = qgActual0;
	}

	public void setQgActual1(Date qgActual1) {
		this.qgActual1 = qgActual1;
	}

	public void setQgActual2(Date qgActual2) {
		this.qgActual2 = qgActual2;
	}

	public void setQgActual3(Date qgActual3) {
		this.qgActual3 = qgActual3;
	}

	public void setQgActual4(Date qgActual4) {
		this.qgActual4 = qgActual4;
	}

	public void setQgActual5(Date qgActual5) {
		this.qgActual5 = qgActual5;
	}

	public void setProjectHighlightIssue(String projectHighlightIssue) {
		this.projectHighlightIssue = projectHighlightIssue;
	}

	public void setProjectHighlightReason(String projectHighlightReason) {
		this.projectHighlightReason = projectHighlightReason;
	}
	
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPjm(String pjm) {
		this.pjm = pjm;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}
}
