package com.bosch.wrd.entity.entityImpl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "portfolio")
public class Portfolio extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "hcpPjmCoordinator")
	private String hcpPjmCoordinator;

	@Column(name = "last_quality_gate")
	private String lastQualityGate;

	@Column(name = "pgl")
	private String pgl;

	@Column(name = "pia")
	private String pia;

	@Column(name = "process_audit")
	private String processAudit;

	@Column(name = "project_owner")
	private String projectOwner;

	@Column(name = "remark_for_closed_project")
	private String remarkForClosedProject;

	@Column(name = "scope_short_desc")
	private String scopeShortDesc;

	@Column(name = "tbp_slpppjm")
	private String tbpSlppPJM;

	@Temporal(TemporalType.TIMESTAMP)
	private Date version;
	
	@Column(name = "type_of_change")
	private String typeOfChange;
	
	@Column(name = "alelll")
	private String alElLl;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;

	public Portfolio() {
	}

	public Portfolio(String hcpPjmCoordinator, String lastQualityGate, Long no, String pgl, String pia,
			String processAudit, String projectOwner, String remarkForClosedProject, String scopeShortDesc,
			String tbpSlppPJM, Date version, String typeOfChange, String alElLl) {
		super(no);
		this.hcpPjmCoordinator = hcpPjmCoordinator;
		this.lastQualityGate = lastQualityGate;
		this.pgl = pgl;
		this.pia = pia;
		this.processAudit = processAudit;
		this.projectOwner = projectOwner;
		this.remarkForClosedProject = remarkForClosedProject;
		this.scopeShortDesc = scopeShortDesc;
		this.tbpSlppPJM = tbpSlppPJM;
		this.version = version;
		this.typeOfChange = typeOfChange;
		this.alElLl = alElLl;
	}

	public String getHcpPjmCoordinator() {
		return hcpPjmCoordinator;
	}

	public void setHcpPjmCoordinator(String hcpPjmCoordinator) {
		this.hcpPjmCoordinator = hcpPjmCoordinator;
	}

	public String getLastQualityGate() {
		return lastQualityGate;
	}

	public void setLastQualityGate(String lastQualityGate) {
		this.lastQualityGate = lastQualityGate;
	}

	public String isPgl() {
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

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public String getRemarkForClosedProject() {
		return remarkForClosedProject;
	}

	public void setRemarkForClosedProject(String remarkForClosedProject) {
		this.remarkForClosedProject = remarkForClosedProject;
	}

	public String getScopeShortDesc() {
		return scopeShortDesc;
	}

	public void setScopeShortDesc(String scopeShortDesc) {
		this.scopeShortDesc = scopeShortDesc;
	}

	public String getTbpSlppPJM() {
		return tbpSlppPJM;
	}

	public void setTbpSlppPJM(String tbpSlppPJM) {
		this.tbpSlppPJM = tbpSlppPJM;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}

	public String getTypeOfChange() {
		return typeOfChange;
	}

	public void setTypeOfChange(String typeOfChange) {
		this.typeOfChange = typeOfChange;
	}

	public String getAlElLl() {
		return alElLl;
	}

	public void setAlElLl(String alElLl) {
		this.alElLl = alElLl;
	}

}
