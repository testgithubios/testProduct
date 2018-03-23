package com.bosch.wrd.dto;

public class SelectedReleasesDto {

	private CustomerDto[] customers = new CustomerDto[] {};
	private TypeOfChangeDto[] typeOfChanges = new TypeOfChangeDto[] {};
	private StatusDto[] status = new StatusDto[] {};
	private LocationDto[] locations = new LocationDto[] {};
	
	public SelectedReleasesDto() {
	}

	public CustomerDto[] getCustomers() {
		return customers;
	}

	public TypeOfChangeDto[] getTypeOfChanges() {
		return typeOfChanges;
	}

	public StatusDto[] getStatus() {
		return status;
	}

	public LocationDto[] getLocations() {
		return locations;
	}

	public void setCustomers(CustomerDto[] customers) {
		this.customers = customers;
	}

	public void setTypeOfChanges(TypeOfChangeDto[] typeOfChanges) {
		this.typeOfChanges = typeOfChanges;
	}

	public void setStatus(StatusDto[] status) {
		this.status = status;
	}

	public void setLocations(LocationDto[] locations) {
		this.locations = locations;
	}
	
}
