package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "testing_capacity")
public class TestingCapacity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "test_location")
	private String testLocation;
	
	@Column(name = "hcp_pjm")
	private String hcpPjm;
	
	@Column(name = "tbp_pjm")
	private String tbpPjm;
	
	@Column(name = "kick_off")
	private Boolean kickOff;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;
	
	@OneToMany(mappedBy = "testingCapacity")
	private Set<TestingCapacityDetail> capacityDetails = new HashSet<>(0);

	public TestingCapacity() {
	}

	public TestingCapacity(Long id, String testLocation, String hcpPjm, String tbpPjm, Boolean kickOff) {
		super(id);
		this.testLocation = testLocation;
		this.hcpPjm = hcpPjm;
		this.tbpPjm = tbpPjm;
		this.kickOff = kickOff;
	}

	public String getTestLocation() {
		return testLocation;
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

	public Releases getReleases() {
		return releases;
	}
	
	public Set<TestingCapacityDetail> getCapacityDetails() {
		return capacityDetails;
	}

	public void setTestLocation(String testLocation) {
		this.testLocation = testLocation;
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

	public void setReleases(Releases releases) {
		this.releases = releases;
	}
	
	public void setCapacityDetails(Set<TestingCapacityDetail> capacityDetails) {
		this.capacityDetails = capacityDetails;
	}

}
