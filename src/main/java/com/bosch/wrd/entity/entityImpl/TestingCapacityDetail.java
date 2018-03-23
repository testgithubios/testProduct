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
@Table(name = "testing_capacity_detail")
public class TestingCapacityDetail extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_of_notes")
	private Date dateOfNotes;

	@Column(name = "notes")
	private String notes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testing_capacity_id")
	private TestingCapacity testingCapacity;
	
	public TestingCapacityDetail() {
	}

	public TestingCapacityDetail(Long id, Date dateOfNotes, String notes) {
		super(id);
		this.dateOfNotes = dateOfNotes;
		this.notes = notes;
	}

	public Date getDateOfNotes() {
		return dateOfNotes;
	}

	public String getNotes() {
		return notes;
	}
	
	public TestingCapacity getTestingCapacity() {
		return testingCapacity;
	}

	public void setDateOfNotes(Date dateOfNotes) {
		this.dateOfNotes = dateOfNotes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void setTestingCapacity(TestingCapacity testingCapacity) {
		this.testingCapacity = testingCapacity;
	}
}
