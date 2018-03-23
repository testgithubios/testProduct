/**
 * 
 */
package com.bosch.wrd.dto;

/**
 * @author hnd1hc
 *
 */
public class StearingCommiteeDto {

	private Long id;
	private String kpitCurrent;
	private String kpisCurrent;
	private String kpibCurrent;
	private String kpitLast;
	private String kpisLast;
	private String kpibLast;
	private String rbSop;
	private String projectHighlightIssue;
	private String projectHighlightReason;
	private String qgActual0;
	private String qgActual1;
	private String qgActual2;
	private String qgActual3;
	private String qgActual4;
	private String qgActual5;
	private String qgPlant0;
	private String qgPlant1;
	private String qgPlant2;
	private String qgPlant3;
	private String qgPlant4;
	private String qgPlant5;
	private String statusQg0;
	private String statusQg1;
	private String statusQg2;
	private String statusQg3;
	private String statusQg4;
	private String statusQg5;
	private String riskif;
	private String riskThen;
	private String riskRating;
	private String riskCorrectiveAction;
	private String riskDue;
	private String title;
	private String reportDate;
	private String pjm;
	private Long realeasesId;

	public StearingCommiteeDto(Long id, String kpitCurrent, String kpisCurrent, String kpibCurrent, String riskif,
			String riskThen, String riskRating, String riskCorrectiveAction, String riskDue, String qgActual0,
			String qgActual1, String qgActual2, String qgActual3, String qgActual4, String qgActual5,
			String projectHighlightIssue, String projectHighlightReason, String reportDate, String title, String pjm) {
		this.id = id;
		this.kpitCurrent = kpitCurrent;
		this.kpisCurrent = kpisCurrent;
		this.kpibCurrent = kpibCurrent;
		this.projectHighlightIssue = projectHighlightIssue;
		this.projectHighlightReason = projectHighlightReason;
		this.qgActual0 = qgActual0;
		this.qgActual1 = qgActual1;
		this.qgActual2 = qgActual2;
		this.qgActual3 = qgActual3;
		this.qgActual4 = qgActual4;
		this.qgActual5 = qgActual5;
		this.riskif = riskif;
		this.riskThen = riskThen;
		this.riskRating = riskRating;
		this.riskCorrectiveAction = riskCorrectiveAction;
		this.riskDue = riskDue;
		this.reportDate = reportDate;
		this.title = title;
		this.pjm = pjm;
	}

	public StearingCommiteeDto() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKpitCurrent() {
		return kpitCurrent;
	}

	public void setKpitCurrent(String kpitCurrent) {
		this.kpitCurrent = kpitCurrent;
	}

	public String getKpisCurrent() {
		return kpisCurrent;
	}

	public void setKpisCurrent(String kpisCurrent) {
		this.kpisCurrent = kpisCurrent;
	}

	public String getKpibCurrent() {
		return kpibCurrent;
	}

	public void setKpibCurrent(String kpibCurrent) {
		this.kpibCurrent = kpibCurrent;
	}

	public String getKpitLast() {
		return kpitLast;
	}

	public void setKpitLast(String kpitLast) {
		this.kpitLast = kpitLast;
	}

	public String getKpisLast() {
		return kpisLast;
	}

	public void setKpisLast(String kpisLast) {
		this.kpisLast = kpisLast;
	}

	public String getKpibLast() {
		return kpibLast;
	}

	public void setKpibLast(String kpibLast) {
		this.kpibLast = kpibLast;
	}

	public String getRbSop() {
		return rbSop;
	}

	public void setRbSop(String rbSop) {
		this.rbSop = rbSop;
	}

	public String getProjectHighlightIssue() {
		return projectHighlightIssue;
	}

	public void setProjectHighlightIssue(String projectHighlightIssue) {
		this.projectHighlightIssue = projectHighlightIssue;
	}

	public String getProjectHighlightReason() {
		return projectHighlightReason;
	}

	public void setProjectHighlightReason(String projectHighlightReason) {
		this.projectHighlightReason = projectHighlightReason;
	}

	public String getQgActual0() {
		return qgActual0;
	}

	public void setQgActual0(String qgActual0) {
		this.qgActual0 = qgActual0;
	}

	public String getQgActual1() {
		return qgActual1;
	}

	public void setQgActual1(String qgActual1) {
		this.qgActual1 = qgActual1;
	}

	public String getQgActual2() {
		return qgActual2;
	}

	public void setQgActual2(String qgActual2) {
		this.qgActual2 = qgActual2;
	}

	public String getQgActual3() {
		return qgActual3;
	}

	public void setQgActual3(String qgActual3) {
		this.qgActual3 = qgActual3;
	}

	public String getQgActual4() {
		return qgActual4;
	}

	public void setQgActual4(String qgActual4) {
		this.qgActual4 = qgActual4;
	}

	public String getQgActual5() {
		return qgActual5;
	}

	public void setQgActual5(String qgActual5) {
		this.qgActual5 = qgActual5;
	}

	public String getQgPlant0() {
		return qgPlant0;
	}

	public void setQgPlant0(String qgPlant0) {
		this.qgPlant0 = qgPlant0;
	}

	public String getQgPlant1() {
		return qgPlant1;
	}

	public void setQgPlant1(String qgPlant1) {
		this.qgPlant1 = qgPlant1;
	}

	public String getQgPlant2() {
		return qgPlant2;
	}

	public void setQgPlant2(String qgPlant2) {
		this.qgPlant2 = qgPlant2;
	}

	public String getQgPlant3() {
		return qgPlant3;
	}

	public void setQgPlant3(String qgPlant3) {
		this.qgPlant3 = qgPlant3;
	}

	public String getQgPlant4() {
		return qgPlant4;
	}

	public void setQgPlant4(String qgPlant4) {
		this.qgPlant4 = qgPlant4;
	}

	public String getQgPlant5() {
		return qgPlant5;
	}

	public void setQgPlant5(String qgPlant5) {
		this.qgPlant5 = qgPlant5;
	}

	public String getStatusQg0() {
		return statusQg0;
	}

	public void setStatusQg0(String statusQg0) {
		this.statusQg0 = statusQg0;
	}

	public String getStatusQg1() {
		return statusQg1;
	}

	public void setStatusQg1(String statusQg1) {
		this.statusQg1 = statusQg1;
	}

	public String getStatusQg2() {
		return statusQg2;
	}

	public void setStatusQg2(String statusQg2) {
		this.statusQg2 = statusQg2;
	}

	public String getStatusQg3() {
		return statusQg3;
	}

	public void setStatusQg3(String statusQg3) {
		this.statusQg3 = statusQg3;
	}

	public String getStatusQg4() {
		return statusQg4;
	}

	public void setStatusQg4(String statusQg4) {
		this.statusQg4 = statusQg4;
	}

	public String getStatusQg5() {
		return statusQg5;
	}

	public void setStatusQg5(String statusQg5) {
		this.statusQg5 = statusQg5;
	}

	public String getRiskif() {
		return riskif;
	}

	public void setRiskif(String riskif) {
		this.riskif = riskif;
	}

	public String getRiskThen() {
		return riskThen;
	}

	public void setRiskThen(String riskThen) {
		this.riskThen = riskThen;
	}

	public String getRiskRating() {
		return riskRating;
	}

	public void setRiskRating(String riskRating) {
		this.riskRating = riskRating;
	}

	public String getRiskCorrectiveAction() {
		return riskCorrectiveAction;
	}

	public void setRiskCorrectiveAction(String riskCorrectiveAction) {
		this.riskCorrectiveAction = riskCorrectiveAction;
	}

	public String getRiskDue() {
		return riskDue;
	}

	public void setRiskDue(String riskDue) {
		this.riskDue = riskDue;
	}

	public Long getRealeasesId() {
		return realeasesId;
	}

	public void setRealeasesId(Long realeasesId) {
		this.realeasesId = realeasesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getPjm() {
		return pjm;
	}

	public void setPjm(String pjm) {
		this.pjm = pjm;
	}

}
