package com.bosch.wrd.dto;

public class InternalCustomerAlignmentDto {

	private Long nr;
	private String typeChange;
	private String dateInitial;
	private String dateActual;
	private String dateSubmission;
	
	public InternalCustomerAlignmentDto() {
	}

	public Long getNr() {
		return nr;
	}

	public String getTypeChange() {
		return typeChange;
	}

	public String getDateInitial() {
		return dateInitial;
	}

	public String getDateActual() {
		return dateActual;
	}

	public String getDateSubmission() {
		return dateSubmission;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public void setTypeChange(String typeChange) {
		this.typeChange = typeChange;
	}

	public void setDateInitial(String dateInitial) {
		this.dateInitial = dateInitial;
	}

	public void setDateActual(String dateActual) {
		this.dateActual = dateActual;
	}

	public void setDateSubmission(String dateSubmission) {
		this.dateSubmission = dateSubmission;
	}
}
