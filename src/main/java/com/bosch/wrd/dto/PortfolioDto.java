package com.bosch.wrd.dto;

public class PortfolioDto {

	private Long id;
	private String version;
	private String projectOwner;
	private String hcpPjmCoordinator;
	private String tbpSlppPJM;
	private String lastQualityGate;
	private String pgl;
	private String pia;
	private String processAudit;
	private String scopeShortDesc;
	private String remarkForClosedProject;
	private String alElLl;

	private String projectName;
	private String customer;
	private String plannedStartTime;
	private String plannedSop;
	private String plannedISR;
	private String dispatchFromHcpSite;
	private String typeOfChange;

	private Long releasesId;
	
	public PortfolioDto() {
	}

	public PortfolioDto(String hcpPjmCoordinator, String lastQualityGate, Long id, String pgl, String pia,
			String processAudit, String projectOwner, String remarkForClosedProject, String scopeShortDesc,
			String tbpSlppPJM, String version, String typeOfChange, String alElLl) {
		super();
		this.id = id;
		this.version = version;
		this.projectOwner = projectOwner;
		this.hcpPjmCoordinator = hcpPjmCoordinator;
		this.tbpSlppPJM = tbpSlppPJM;
		this.lastQualityGate = lastQualityGate;
		this.pgl = pgl;
		this.pia = pia;
		this.processAudit = processAudit;
		this.scopeShortDesc = scopeShortDesc;
		this.remarkForClosedProject = remarkForClosedProject;
		this.typeOfChange = typeOfChange;
		this.alElLl = alElLl;
	}

	public Long getNo() {
		return id;
	}

	public void setNo(Long id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public String getHcpPjmCoordinator() {
		return hcpPjmCoordinator;
	}

	public void setHcpPjmCoordinator(String hcpPjmCoordinator) {
		this.hcpPjmCoordinator = hcpPjmCoordinator;
	}

	public String getTbpSlppPJM() {
		return tbpSlppPJM;
	}

	public void setTbpSlppPJM(String tbpSlppPJM) {
		this.tbpSlppPJM = tbpSlppPJM;
	}

	public String getLastQualityGate() {
		return lastQualityGate;
	}

	public void setLastQualityGate(String lastQualityGate) {
		this.lastQualityGate = lastQualityGate;
	}

	public String getPgl() {
		return pgl;
	}

	public void setPgl(String pgl) {
		this.pgl = pgl;
	}

	public String getPia() {
		return pia;
	}

	public void setPia(String pia) {
		this.pia = pia;
	}

	public String getProcessAudit() {
		return processAudit;
	}

	public void setProcessAudit(String processAudit) {
		this.processAudit = processAudit;
	}

	public String getScopeShortDesc() {
		return scopeShortDesc;
	}

	public void setScopeShortDesc(String scopeShortDesc) {
		this.scopeShortDesc = scopeShortDesc;
	}

	public String getRemarkForClosedProject() {
		return remarkForClosedProject;
	}

	public void setRemarkForClosedProject(String remarkForClosedProject) {
		this.remarkForClosedProject = remarkForClosedProject;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getPlannedSop() {
		return plannedSop;
	}

	public void setPlannedSop(String plannedSop) {
		this.plannedSop = plannedSop;
	}

	public String getDispatchFromHcpSite() {
		return dispatchFromHcpSite;
	}

	public void setDispatchFromHcpSite(String dispatchFromHcpSite) {
		this.dispatchFromHcpSite = dispatchFromHcpSite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReleasesId() {
		return releasesId;
	}

	public void setReleasesId(Long releasesId) {
		this.releasesId = releasesId;
	}

	public String getTypeOfChange() {
		return typeOfChange;
	}
	
	public String getAlElLl() {
		return alElLl;
	}

	public void setTypeOfChange(String typeOfChange) {
		this.typeOfChange = typeOfChange;
	}

	public String getPlannedStartTime() {
		return plannedStartTime;
	}

	public String getPlannedISR() {
		return plannedISR;
	}

	public void setPlannedStartTime(String plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}

	public void setPlannedISR(String plannedISR) {
		this.plannedISR = plannedISR;
	}
	
	public void setAlElLl(String alElLl) {
		this.alElLl = alElLl;
	}

}
