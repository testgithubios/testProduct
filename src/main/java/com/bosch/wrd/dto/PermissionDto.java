package com.bosch.wrd.dto;

public class PermissionDto {

	private Long id;
	
	private Boolean name;

	private Boolean nr;

	private Boolean priority;

	private Boolean status;

	private Boolean belt;

	private Boolean customerPlant;

	private Boolean line;

	private Boolean descriptionChange;

	private Boolean aqcdt;

	private Boolean etpTest;

	private Boolean jatcoReleaseMeth;

	private Boolean npcsInitial;

	private Boolean npcsActual;

	private Boolean npcsSubmission;

	private Boolean mqs;

	private Boolean riskReviewInitial;

	private Boolean riskReviewActual;

	private Boolean riskReviewSubmission;

	private Boolean pdr01Initial;

	private Boolean pdr01Actual;

	private Boolean pdr01Submission;

	private Boolean pdr0Initial;

	private Boolean pdr0Actual;

	private Boolean pdr0Submission;

	private Boolean pdr1Initial;

	private Boolean pdr1Actual;

	private Boolean pdr1Submission;

	private Boolean pdr2Initial;

	private Boolean pdr2Actual;

	private Boolean pdr2Submission;

	private Boolean pdr3Initial;

	private Boolean pdr3Actual;

	private Boolean pdr3Submission;

	private Boolean pdr4Initial;

	private Boolean pdr4Actual;

	private Boolean pdr4Submission;

	private Boolean pdr5Initial;

	private Boolean pdr5Actual;

	private Boolean pdr5Submission;

	private Boolean npcrInitial;

	private Boolean npcrActual;

	private Boolean npcrSubmission;

	private Boolean isrInitial;

	private Boolean isrActual;

	private Boolean isrSubmission;

	private Boolean sampleSubmission;

	private Boolean pswsInitial;

	private Boolean pswsActual;

	private Boolean pswsSubmission;

	private Boolean pdr35Initial;

	private Boolean pdr35Actual;

	private Boolean pdr35Submission;

	private Boolean masterBeltInitial;

	private Boolean masterBeltActual;

	private Boolean masterBeltSubmission;

	private Boolean pswaInitial;

	private Boolean pswaActual;

	private Boolean pswaSubmission;

	private Boolean rbOrigSop;

	private Boolean rbSopInitial;

	private Boolean rbSopActual;

	private Boolean rbSopSubmission;

	private Boolean ckdDispatchDate;

	private Boolean dispatchFromPlantInitial;

	private Boolean dispatchFromPlantActual;

	private Boolean dispatchFromPlantSubmission;

	private Boolean arrivalAtCustomerInitial;

	private Boolean arrivalAtCustomerActual;

	private Boolean arrivalAtCustomerSubmission;

	private Boolean frozenPeriod;

	private Boolean trafficLight;

	private Boolean qg1;

	private Boolean qg2;

	private Boolean qg3;

	private Boolean qg4;

	private Boolean qg5;

	private Boolean projectNr;

	private Boolean ecrNumber;

	private Boolean customerInform;

	private Boolean notes;

	private Boolean lastUpdate;

	private Boolean customer;

	private Boolean typeofChange;

	private Boolean unit;

	private Boolean location;

	private Boolean uniqu;

	private Boolean pic;

	private Boolean counterPart;

	private Boolean ippNotificationInitial;

	private Boolean ippNotificationActual;

	private Boolean ippNotificationSubmission;

	private Boolean ippRegistrationInitial;

	private Boolean ippRegistrationActual;

	private Boolean ippRegistrationSubmission;

	private Boolean ippReportInitial;

	private Boolean ippReportActual;

	private Boolean ippReportSubmission;

	private Boolean ippApprovalInitial;

	private Boolean ippApprovalActual;

	private Boolean ippApprovalSubmission;

	private Boolean informCustomerInitial;

	private Boolean informCustomerActual;

	private Boolean informCustomerSubmission;

	private Boolean validationRequirementsInitial;

	private Boolean validationRequirementsActual;

	private Boolean validationRequirementsSubmission;

	private Boolean submitValidationResultsInitial;

	private Boolean submitValidationResultsActual;

	private Boolean submitValidationResultsSubmission;

	private Boolean customerApprovalInitial;

	private Boolean customerApprovalActual;

	private Boolean customerApprovalSubmission;

	private Boolean orInitial;

	private Boolean orActual;

	private Boolean orSubmission;

	private Boolean vcLotInitial;

	private Boolean vcLotActual;

	private Boolean vcLotSubmission;
	
	private Long roleId;

	public PermissionDto() {
	}

	public PermissionDto(Long id, Boolean name, Boolean nr, Boolean priority, Boolean status, Boolean belt,
			Boolean customerPlant, Boolean line, Boolean descriptionChange, Boolean aqcdt, Boolean etpTest,
			Boolean jatcoReleaseMeth, Boolean npcsInitial, Boolean npcsActual, Boolean npcsSubmission, Boolean mqs,
			Boolean riskReviewInitial, Boolean riskReviewActual, Boolean riskReviewSubmission, Boolean pdr01Initial,
			Boolean pdr01Actual, Boolean pdr01Submission, Boolean pdr0Initial, Boolean pdr0Actual,
			Boolean pdr0Submission, Boolean pdr1Initial, Boolean pdr1Actual, Boolean pdr1Submission,
			Boolean pdr2Initial, Boolean pdr2Actual, Boolean pdr2Submission, Boolean pdr3Initial, Boolean pdr3Actual,
			Boolean pdr3Submission, Boolean pdr4Initial, Boolean pdr4Actual, Boolean pdr4Submission,
			Boolean pdr5Initial, Boolean pdr5Actual, Boolean pdr5Submission, Boolean npcrInitial, Boolean npcrActual,
			Boolean npcrSubmission, Boolean isrInitial, Boolean isrActual, Boolean isrSubmission,
			Boolean sampleSubmission, Boolean pswsInitial, Boolean pswsActual, Boolean pswsSubmission,
			Boolean pdr35Initial, Boolean pdr35Actual, Boolean pdr35Submission, Boolean masterBeltInitial,
			Boolean masterBeltActual, Boolean masterBeltSubmission, Boolean pswaInitial, Boolean pswaActual,
			Boolean pswaSubmission, Boolean rbOrigSop, Boolean rbSopInitial, Boolean rbSopActual,
			Boolean rbSopSubmission, Boolean ckdDispatchDate, Boolean dispatchFromPlantInitial,
			Boolean dispatchFromPlantActual, Boolean dispatchFromPlantSubmission, Boolean arrivalAtCustomerInitial,
			Boolean arrivalAtCustomerActual, Boolean arrivalAtCustomerSubmission, Boolean frozenPeriod,
			Boolean trafficLight, Boolean qg1, Boolean qg2, Boolean qg3, Boolean qg4, Boolean qg5, Boolean projectNr,
			Boolean ecrNumber, Boolean customerInform, Boolean notes, Boolean lastUpdate, Boolean customer,
			Boolean typeofChange, Boolean unit, Boolean location, Boolean uniqu, Boolean pic, Boolean counterPart,
			Boolean ippNotificationInitial, Boolean ippNotificationActual, Boolean ippNotificationSubmission,
			Boolean ippRegistrationInitial, Boolean ippRegistrationActual, Boolean ippRegistrationSubmission,
			Boolean ippReportInitial, Boolean ippReportActual, Boolean ippReportSubmission, Boolean ippApprovalInitial,
			Boolean ippApprovalActual, Boolean ippApprovalSubmission, Boolean informCustomerInitial,
			Boolean informCustomerActual, Boolean informCustomerSubmission, Boolean validationRequirementsInitial,
			Boolean validationRequirementsActual, Boolean validationRequirementsSubmission,
			Boolean submitValidationResultsInitial, Boolean submitValidationResultsActual,
			Boolean submitValidationResultsSubmission, Boolean customerApprovalInitial, Boolean customerApprovalActual,
			Boolean customerApprovalSubmission, Boolean orInitial, Boolean orActual, Boolean orSubmission,
			Boolean vcLotInitial, Boolean vcLotActual, Boolean vcLotSubmission) {
		this.id = id;
		this.name = name;
		this.nr = nr;
		this.priority = priority;
		this.status = status;
		this.belt = belt;
		this.customerPlant = customerPlant;
		this.line = line;
		this.descriptionChange = descriptionChange;
		this.aqcdt = aqcdt;
		this.etpTest = etpTest;
		this.jatcoReleaseMeth = jatcoReleaseMeth;
		this.npcsInitial = npcsInitial;
		this.npcsActual = npcsActual;
		this.npcsSubmission = npcsSubmission;
		this.mqs = mqs;
		this.riskReviewInitial = riskReviewInitial;
		this.riskReviewActual = riskReviewActual;
		this.riskReviewSubmission = riskReviewSubmission;
		this.pdr01Initial = pdr01Initial;
		this.pdr01Actual = pdr01Actual;
		this.pdr01Submission = pdr01Submission;
		this.pdr0Initial = pdr0Initial;
		this.pdr0Actual = pdr0Actual;
		this.pdr0Submission = pdr0Submission;
		this.pdr1Initial = pdr1Initial;
		this.pdr1Actual = pdr1Actual;
		this.pdr1Submission = pdr1Submission;
		this.pdr2Initial = pdr2Initial;
		this.pdr2Actual = pdr2Actual;
		this.pdr2Submission = pdr2Submission;
		this.pdr3Initial = pdr3Initial;
		this.pdr3Actual = pdr3Actual;
		this.pdr3Submission = pdr3Submission;
		this.pdr4Initial = pdr4Initial;
		this.pdr4Actual = pdr4Actual;
		this.pdr4Submission = pdr4Submission;
		this.pdr5Initial = pdr5Initial;
		this.pdr5Actual = pdr5Actual;
		this.pdr5Submission = pdr5Submission;
		this.npcrInitial = npcrInitial;
		this.npcrActual = npcrActual;
		this.npcrSubmission = npcrSubmission;
		this.isrInitial = isrInitial;
		this.isrActual = isrActual;
		this.isrSubmission = isrSubmission;
		this.sampleSubmission = sampleSubmission;
		this.pswsInitial = pswsInitial;
		this.pswsActual = pswsActual;
		this.pswsSubmission = pswsSubmission;
		this.pdr35Initial = pdr35Initial;
		this.pdr35Actual = pdr35Actual;
		this.pdr35Submission = pdr35Submission;
		this.masterBeltInitial = masterBeltInitial;
		this.masterBeltActual = masterBeltActual;
		this.masterBeltSubmission = masterBeltSubmission;
		this.pswaInitial = pswaInitial;
		this.pswaActual = pswaActual;
		this.pswaSubmission = pswaSubmission;
		this.rbOrigSop = rbOrigSop;
		this.rbSopInitial = rbSopInitial;
		this.rbSopActual = rbSopActual;
		this.rbSopSubmission = rbSopSubmission;
		this.ckdDispatchDate = ckdDispatchDate;
		this.dispatchFromPlantInitial = dispatchFromPlantInitial;
		this.dispatchFromPlantActual = dispatchFromPlantActual;
		this.dispatchFromPlantSubmission = dispatchFromPlantSubmission;
		this.arrivalAtCustomerInitial = arrivalAtCustomerInitial;
		this.arrivalAtCustomerActual = arrivalAtCustomerActual;
		this.arrivalAtCustomerSubmission = arrivalAtCustomerSubmission;
		this.frozenPeriod = frozenPeriod;
		this.trafficLight = trafficLight;
		this.qg1 = qg1;
		this.qg2 = qg2;
		this.qg3 = qg3;
		this.qg4 = qg4;
		this.qg5 = qg5;
		this.projectNr = projectNr;
		this.ecrNumber = ecrNumber;
		this.customerInform = customerInform;
		this.notes = notes;
		this.lastUpdate = lastUpdate;
		this.customer = customer;
		this.typeofChange = typeofChange;
		this.unit = unit;
		this.location = location;
		this.uniqu = uniqu;
		this.pic = pic;
		this.counterPart = counterPart;
		this.ippNotificationInitial = ippNotificationInitial;
		this.ippNotificationActual = ippNotificationActual;
		this.ippNotificationSubmission = ippNotificationSubmission;
		this.ippRegistrationInitial = ippRegistrationInitial;
		this.ippRegistrationActual = ippRegistrationActual;
		this.ippRegistrationSubmission = ippRegistrationSubmission;
		this.ippReportInitial = ippReportInitial;
		this.ippReportActual = ippReportActual;
		this.ippReportSubmission = ippReportSubmission;
		this.ippApprovalInitial = ippApprovalInitial;
		this.ippApprovalActual = ippApprovalActual;
		this.ippApprovalSubmission = ippApprovalSubmission;
		this.informCustomerInitial = informCustomerInitial;
		this.informCustomerActual = informCustomerActual;
		this.informCustomerSubmission = informCustomerSubmission;
		this.validationRequirementsInitial = validationRequirementsInitial;
		this.validationRequirementsActual = validationRequirementsActual;
		this.validationRequirementsSubmission = validationRequirementsSubmission;
		this.submitValidationResultsInitial = submitValidationResultsInitial;
		this.submitValidationResultsActual = submitValidationResultsActual;
		this.submitValidationResultsSubmission = submitValidationResultsSubmission;
		this.customerApprovalInitial = customerApprovalInitial;
		this.customerApprovalActual = customerApprovalActual;
		this.customerApprovalSubmission = customerApprovalSubmission;
		this.orInitial = orInitial;
		this.orActual = orActual;
		this.orSubmission = orSubmission;
		this.vcLotInitial = vcLotInitial;
		this.vcLotActual = vcLotActual;
		this.vcLotSubmission = vcLotSubmission;
	}

	public Long getId() {
		return id;
	}

	public Boolean getName() {
		return name;
	}

	public Boolean getNr() {
		return nr;
	}

	public Boolean getPriority() {
		return priority;
	}

	public Boolean getStatus() {
		return status;
	}

	public Boolean getBelt() {
		return belt;
	}

	public Boolean getCustomerPlant() {
		return customerPlant;
	}

	public Boolean getLine() {
		return line;
	}

	public Boolean getDescriptionChange() {
		return descriptionChange;
	}

	public Boolean getAqcdt() {
		return aqcdt;
	}

	public Boolean getEtpTest() {
		return etpTest;
	}

	public Boolean getJatcoReleaseMeth() {
		return jatcoReleaseMeth;
	}

	public Boolean getNpcsInitial() {
		return npcsInitial;
	}

	public Boolean getNpcsActual() {
		return npcsActual;
	}

	public Boolean getNpcsSubmission() {
		return npcsSubmission;
	}

	public Boolean getMqs() {
		return mqs;
	}

	public Boolean getRiskReviewInitial() {
		return riskReviewInitial;
	}

	public Boolean getRiskReviewActual() {
		return riskReviewActual;
	}

	public Boolean getRiskReviewSubmission() {
		return riskReviewSubmission;
	}

	public Boolean getPdr01Initial() {
		return pdr01Initial;
	}

	public Boolean getPdr01Actual() {
		return pdr01Actual;
	}

	public Boolean getPdr01Submission() {
		return pdr01Submission;
	}

	public Boolean getPdr0Initial() {
		return pdr0Initial;
	}

	public Boolean getPdr0Actual() {
		return pdr0Actual;
	}

	public Boolean getPdr0Submission() {
		return pdr0Submission;
	}

	public Boolean getPdr1Initial() {
		return pdr1Initial;
	}

	public Boolean getPdr1Actual() {
		return pdr1Actual;
	}

	public Boolean getPdr1Submission() {
		return pdr1Submission;
	}

	public Boolean getPdr2Initial() {
		return pdr2Initial;
	}

	public Boolean getPdr2Actual() {
		return pdr2Actual;
	}

	public Boolean getPdr2Submission() {
		return pdr2Submission;
	}

	public Boolean getPdr3Initial() {
		return pdr3Initial;
	}

	public Boolean getPdr3Actual() {
		return pdr3Actual;
	}

	public Boolean getPdr3Submission() {
		return pdr3Submission;
	}

	public Boolean getPdr4Initial() {
		return pdr4Initial;
	}

	public Boolean getPdr4Actual() {
		return pdr4Actual;
	}

	public Boolean getPdr4Submission() {
		return pdr4Submission;
	}

	public Boolean getPdr5Initial() {
		return pdr5Initial;
	}

	public Boolean getPdr5Actual() {
		return pdr5Actual;
	}

	public Boolean getPdr5Submission() {
		return pdr5Submission;
	}

	public Boolean getNpcrInitial() {
		return npcrInitial;
	}

	public Boolean getNpcrActual() {
		return npcrActual;
	}

	public Boolean getNpcrSubmission() {
		return npcrSubmission;
	}

	public Boolean getIsrInitial() {
		return isrInitial;
	}

	public Boolean getIsrActual() {
		return isrActual;
	}

	public Boolean getIsrSubmission() {
		return isrSubmission;
	}

	public Boolean getSampleSubmission() {
		return sampleSubmission;
	}

	public Boolean getPswsInitial() {
		return pswsInitial;
	}

	public Boolean getPswsActual() {
		return pswsActual;
	}

	public Boolean getPswsSubmission() {
		return pswsSubmission;
	}

	public Boolean getPdr35Initial() {
		return pdr35Initial;
	}

	public Boolean getPdr35Actual() {
		return pdr35Actual;
	}

	public Boolean getPdr35Submission() {
		return pdr35Submission;
	}

	public Boolean getMasterBeltInitial() {
		return masterBeltInitial;
	}

	public Boolean getMasterBeltActual() {
		return masterBeltActual;
	}

	public Boolean getMasterBeltSubmission() {
		return masterBeltSubmission;
	}

	public Boolean getPswaInitial() {
		return pswaInitial;
	}

	public Boolean getPswaActual() {
		return pswaActual;
	}

	public Boolean getPswaSubmission() {
		return pswaSubmission;
	}

	public Boolean getRbOrigSop() {
		return rbOrigSop;
	}

	public Boolean getRbSopInitial() {
		return rbSopInitial;
	}

	public Boolean getRbSopActual() {
		return rbSopActual;
	}

	public Boolean getRbSopSubmission() {
		return rbSopSubmission;
	}

	public Boolean getCkdDispatchDate() {
		return ckdDispatchDate;
	}

	public Boolean getDispatchFromPlantInitial() {
		return dispatchFromPlantInitial;
	}

	public Boolean getDispatchFromPlantActual() {
		return dispatchFromPlantActual;
	}

	public Boolean getDispatchFromPlantSubmission() {
		return dispatchFromPlantSubmission;
	}

	public Boolean getArrivalAtCustomerInitial() {
		return arrivalAtCustomerInitial;
	}

	public Boolean getArrivalAtCustomerActual() {
		return arrivalAtCustomerActual;
	}

	public Boolean getArrivalAtCustomerSubmission() {
		return arrivalAtCustomerSubmission;
	}

	public Boolean getFrozenPeriod() {
		return frozenPeriod;
	}

	public Boolean getTrafficLight() {
		return trafficLight;
	}

	public Boolean getQg1() {
		return qg1;
	}

	public Boolean getQg2() {
		return qg2;
	}

	public Boolean getQg3() {
		return qg3;
	}

	public Boolean getQg4() {
		return qg4;
	}

	public Boolean getQg5() {
		return qg5;
	}

	public Boolean getProjectNr() {
		return projectNr;
	}

	public Boolean getEcrNumber() {
		return ecrNumber;
	}

	public Boolean getCustomerInform() {
		return customerInform;
	}

	public Boolean getNotes() {
		return notes;
	}

	public Boolean getLastUpdate() {
		return lastUpdate;
	}

	public Boolean getCustomer() {
		return customer;
	}

	public Boolean getTypeofChange() {
		return typeofChange;
	}

	public Boolean getUnit() {
		return unit;
	}

	public Boolean getLocation() {
		return location;
	}

	public Boolean getUniqu() {
		return uniqu;
	}

	public Boolean getPic() {
		return pic;
	}

	public Boolean getCounterPart() {
		return counterPart;
	}

	public Boolean getIppNotificationInitial() {
		return ippNotificationInitial;
	}

	public Boolean getIppNotificationActual() {
		return ippNotificationActual;
	}

	public Boolean getIppNotificationSubmission() {
		return ippNotificationSubmission;
	}

	public Boolean getIppRegistrationInitial() {
		return ippRegistrationInitial;
	}

	public Boolean getIppRegistrationActual() {
		return ippRegistrationActual;
	}

	public Boolean getIppRegistrationSubmission() {
		return ippRegistrationSubmission;
	}

	public Boolean getIppReportInitial() {
		return ippReportInitial;
	}

	public Boolean getIppReportActual() {
		return ippReportActual;
	}

	public Boolean getIppReportSubmission() {
		return ippReportSubmission;
	}

	public Boolean getIppApprovalInitial() {
		return ippApprovalInitial;
	}

	public Boolean getIppApprovalActual() {
		return ippApprovalActual;
	}

	public Boolean getIppApprovalSubmission() {
		return ippApprovalSubmission;
	}

	public Boolean getInformCustomerInitial() {
		return informCustomerInitial;
	}

	public Boolean getInformCustomerActual() {
		return informCustomerActual;
	}

	public Boolean getInformCustomerSubmission() {
		return informCustomerSubmission;
	}

	public Boolean getValidationRequirementsInitial() {
		return validationRequirementsInitial;
	}

	public Boolean getValidationRequirementsActual() {
		return validationRequirementsActual;
	}

	public Boolean getValidationRequirementsSubmission() {
		return validationRequirementsSubmission;
	}

	public Boolean getSubmitValidationResultsInitial() {
		return submitValidationResultsInitial;
	}

	public Boolean getSubmitValidationResultsActual() {
		return submitValidationResultsActual;
	}

	public Boolean getSubmitValidationResultsSubmission() {
		return submitValidationResultsSubmission;
	}

	public Boolean getCustomerApprovalInitial() {
		return customerApprovalInitial;
	}

	public Boolean getCustomerApprovalActual() {
		return customerApprovalActual;
	}

	public Boolean getCustomerApprovalSubmission() {
		return customerApprovalSubmission;
	}

	public Boolean getOrInitial() {
		return orInitial;
	}

	public Boolean getOrActual() {
		return orActual;
	}

	public Boolean getOrSubmission() {
		return orSubmission;
	}

	public Boolean getVcLotInitial() {
		return vcLotInitial;
	}

	public Boolean getVcLotActual() {
		return vcLotActual;
	}

	public Boolean getVcLotSubmission() {
		return vcLotSubmission;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(Boolean name) {
		this.name = name;
	}

	public void setNr(Boolean nr) {
		this.nr = nr;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setBelt(Boolean belt) {
		this.belt = belt;
	}

	public void setCustomerPlant(Boolean customerPlant) {
		this.customerPlant = customerPlant;
	}

	public void setLine(Boolean line) {
		this.line = line;
	}

	public void setDescriptionChange(Boolean descriptionChange) {
		this.descriptionChange = descriptionChange;
	}

	public void setAqcdt(Boolean aqcdt) {
		this.aqcdt = aqcdt;
	}

	public void setEtpTest(Boolean etpTest) {
		this.etpTest = etpTest;
	}

	public void setJatcoReleaseMeth(Boolean jatcoReleaseMeth) {
		this.jatcoReleaseMeth = jatcoReleaseMeth;
	}

	public void setNpcsInitial(Boolean npcsInitial) {
		this.npcsInitial = npcsInitial;
	}

	public void setNpcsActual(Boolean npcsActual) {
		this.npcsActual = npcsActual;
	}

	public void setNpcsSubmission(Boolean npcsSubmission) {
		this.npcsSubmission = npcsSubmission;
	}

	public void setMqs(Boolean mqs) {
		this.mqs = mqs;
	}

	public void setRiskReviewInitial(Boolean riskReviewInitial) {
		this.riskReviewInitial = riskReviewInitial;
	}

	public void setRiskReviewActual(Boolean riskReviewActual) {
		this.riskReviewActual = riskReviewActual;
	}

	public void setRiskReviewSubmission(Boolean riskReviewSubmission) {
		this.riskReviewSubmission = riskReviewSubmission;
	}

	public void setPdr01Initial(Boolean pdr01Initial) {
		this.pdr01Initial = pdr01Initial;
	}

	public void setPdr01Actual(Boolean pdr01Actual) {
		this.pdr01Actual = pdr01Actual;
	}

	public void setPdr01Submission(Boolean pdr01Submission) {
		this.pdr01Submission = pdr01Submission;
	}

	public void setPdr0Initial(Boolean pdr0Initial) {
		this.pdr0Initial = pdr0Initial;
	}

	public void setPdr0Actual(Boolean pdr0Actual) {
		this.pdr0Actual = pdr0Actual;
	}

	public void setPdr0Submission(Boolean pdr0Submission) {
		this.pdr0Submission = pdr0Submission;
	}

	public void setPdr1Initial(Boolean pdr1Initial) {
		this.pdr1Initial = pdr1Initial;
	}

	public void setPdr1Actual(Boolean pdr1Actual) {
		this.pdr1Actual = pdr1Actual;
	}

	public void setPdr1Submission(Boolean pdr1Submission) {
		this.pdr1Submission = pdr1Submission;
	}

	public void setPdr2Initial(Boolean pdr2Initial) {
		this.pdr2Initial = pdr2Initial;
	}

	public void setPdr2Actual(Boolean pdr2Actual) {
		this.pdr2Actual = pdr2Actual;
	}

	public void setPdr2Submission(Boolean pdr2Submission) {
		this.pdr2Submission = pdr2Submission;
	}

	public void setPdr3Initial(Boolean pdr3Initial) {
		this.pdr3Initial = pdr3Initial;
	}

	public void setPdr3Actual(Boolean pdr3Actual) {
		this.pdr3Actual = pdr3Actual;
	}

	public void setPdr3Submission(Boolean pdr3Submission) {
		this.pdr3Submission = pdr3Submission;
	}

	public void setPdr4Initial(Boolean pdr4Initial) {
		this.pdr4Initial = pdr4Initial;
	}

	public void setPdr4Actual(Boolean pdr4Actual) {
		this.pdr4Actual = pdr4Actual;
	}

	public void setPdr4Submission(Boolean pdr4Submission) {
		this.pdr4Submission = pdr4Submission;
	}

	public void setPdr5Initial(Boolean pdr5Initial) {
		this.pdr5Initial = pdr5Initial;
	}

	public void setPdr5Actual(Boolean pdr5Actual) {
		this.pdr5Actual = pdr5Actual;
	}

	public void setPdr5Submission(Boolean pdr5Submission) {
		this.pdr5Submission = pdr5Submission;
	}

	public void setNpcrInitial(Boolean npcrInitial) {
		this.npcrInitial = npcrInitial;
	}

	public void setNpcrActual(Boolean npcrActual) {
		this.npcrActual = npcrActual;
	}

	public void setNpcrSubmission(Boolean npcrSubmission) {
		this.npcrSubmission = npcrSubmission;
	}

	public void setIsrInitial(Boolean isrInitial) {
		this.isrInitial = isrInitial;
	}

	public void setIsrActual(Boolean isrActual) {
		this.isrActual = isrActual;
	}

	public void setIsrSubmission(Boolean isrSubmission) {
		this.isrSubmission = isrSubmission;
	}

	public void setSampleSubmission(Boolean sampleSubmission) {
		this.sampleSubmission = sampleSubmission;
	}

	public void setPswsInitial(Boolean pswsInitial) {
		this.pswsInitial = pswsInitial;
	}

	public void setPswsActual(Boolean pswsActual) {
		this.pswsActual = pswsActual;
	}

	public void setPswsSubmission(Boolean pswsSubmission) {
		this.pswsSubmission = pswsSubmission;
	}

	public void setPdr35Initial(Boolean pdr35Initial) {
		this.pdr35Initial = pdr35Initial;
	}

	public void setPdr35Actual(Boolean pdr35Actual) {
		this.pdr35Actual = pdr35Actual;
	}

	public void setPdr35Submission(Boolean pdr35Submission) {
		this.pdr35Submission = pdr35Submission;
	}

	public void setMasterBeltInitial(Boolean masterBeltInitial) {
		this.masterBeltInitial = masterBeltInitial;
	}

	public void setMasterBeltActual(Boolean masterBeltActual) {
		this.masterBeltActual = masterBeltActual;
	}

	public void setMasterBeltSubmission(Boolean masterBeltSubmission) {
		this.masterBeltSubmission = masterBeltSubmission;
	}

	public void setPswaInitial(Boolean pswaInitial) {
		this.pswaInitial = pswaInitial;
	}

	public void setPswaActual(Boolean pswaActual) {
		this.pswaActual = pswaActual;
	}

	public void setPswaSubmission(Boolean pswaSubmission) {
		this.pswaSubmission = pswaSubmission;
	}

	public void setRbOrigSop(Boolean rbOrigSop) {
		this.rbOrigSop = rbOrigSop;
	}

	public void setRbSopInitial(Boolean rbSopInitial) {
		this.rbSopInitial = rbSopInitial;
	}

	public void setRbSopActual(Boolean rbSopActual) {
		this.rbSopActual = rbSopActual;
	}

	public void setRbSopSubmission(Boolean rbSopSubmission) {
		this.rbSopSubmission = rbSopSubmission;
	}

	public void setCkdDispatchDate(Boolean ckdDispatchDate) {
		this.ckdDispatchDate = ckdDispatchDate;
	}

	public void setDispatchFromPlantInitial(Boolean dispatchFromPlantInitial) {
		this.dispatchFromPlantInitial = dispatchFromPlantInitial;
	}

	public void setDispatchFromPlantActual(Boolean dispatchFromPlantActual) {
		this.dispatchFromPlantActual = dispatchFromPlantActual;
	}

	public void setDispatchFromPlantSubmission(Boolean dispatchFromPlantSubmission) {
		this.dispatchFromPlantSubmission = dispatchFromPlantSubmission;
	}

	public void setArrivalAtCustomerInitial(Boolean arrivalAtCustomerInitial) {
		this.arrivalAtCustomerInitial = arrivalAtCustomerInitial;
	}

	public void setArrivalAtCustomerActual(Boolean arrivalAtCustomerActual) {
		this.arrivalAtCustomerActual = arrivalAtCustomerActual;
	}

	public void setArrivalAtCustomerSubmission(Boolean arrivalAtCustomerSubmission) {
		this.arrivalAtCustomerSubmission = arrivalAtCustomerSubmission;
	}

	public void setFrozenPeriod(Boolean frozenPeriod) {
		this.frozenPeriod = frozenPeriod;
	}

	public void setTrafficLight(Boolean trafficLight) {
		this.trafficLight = trafficLight;
	}

	public void setQg1(Boolean qg1) {
		this.qg1 = qg1;
	}

	public void setQg2(Boolean qg2) {
		this.qg2 = qg2;
	}

	public void setQg3(Boolean qg3) {
		this.qg3 = qg3;
	}

	public void setQg4(Boolean qg4) {
		this.qg4 = qg4;
	}

	public void setQg5(Boolean qg5) {
		this.qg5 = qg5;
	}

	public void setProjectNr(Boolean projectNr) {
		this.projectNr = projectNr;
	}

	public void setEcrNumber(Boolean ecrNumber) {
		this.ecrNumber = ecrNumber;
	}

	public void setCustomerInform(Boolean customerInform) {
		this.customerInform = customerInform;
	}

	public void setNotes(Boolean notes) {
		this.notes = notes;
	}

	public void setLastUpdate(Boolean lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setCustomer(Boolean customer) {
		this.customer = customer;
	}

	public void setTypeofChange(Boolean typeofChange) {
		this.typeofChange = typeofChange;
	}

	public void setUnit(Boolean unit) {
		this.unit = unit;
	}

	public void setLocation(Boolean location) {
		this.location = location;
	}

	public void setUniqu(Boolean uniqu) {
		this.uniqu = uniqu;
	}

	public void setPic(Boolean pic) {
		this.pic = pic;
	}

	public void setCounterPart(Boolean counterPart) {
		this.counterPart = counterPart;
	}

	public void setIppNotificationInitial(Boolean ippNotificationInitial) {
		this.ippNotificationInitial = ippNotificationInitial;
	}

	public void setIppNotificationActual(Boolean ippNotificationActual) {
		this.ippNotificationActual = ippNotificationActual;
	}

	public void setIppNotificationSubmission(Boolean ippNotificationSubmission) {
		this.ippNotificationSubmission = ippNotificationSubmission;
	}

	public void setIppRegistrationInitial(Boolean ippRegistrationInitial) {
		this.ippRegistrationInitial = ippRegistrationInitial;
	}

	public void setIppRegistrationActual(Boolean ippRegistrationActual) {
		this.ippRegistrationActual = ippRegistrationActual;
	}

	public void setIppRegistrationSubmission(Boolean ippRegistrationSubmission) {
		this.ippRegistrationSubmission = ippRegistrationSubmission;
	}

	public void setIppReportInitial(Boolean ippReportInitial) {
		this.ippReportInitial = ippReportInitial;
	}

	public void setIppReportActual(Boolean ippReportActual) {
		this.ippReportActual = ippReportActual;
	}

	public void setIppReportSubmission(Boolean ippReportSubmission) {
		this.ippReportSubmission = ippReportSubmission;
	}

	public void setIppApprovalInitial(Boolean ippApprovalInitial) {
		this.ippApprovalInitial = ippApprovalInitial;
	}

	public void setIppApprovalActual(Boolean ippApprovalActual) {
		this.ippApprovalActual = ippApprovalActual;
	}

	public void setIppApprovalSubmission(Boolean ippApprovalSubmission) {
		this.ippApprovalSubmission = ippApprovalSubmission;
	}

	public void setInformCustomerInitial(Boolean informCustomerInitial) {
		this.informCustomerInitial = informCustomerInitial;
	}

	public void setInformCustomerActual(Boolean informCustomerActual) {
		this.informCustomerActual = informCustomerActual;
	}

	public void setInformCustomerSubmission(Boolean informCustomerSubmission) {
		this.informCustomerSubmission = informCustomerSubmission;
	}

	public void setValidationRequirementsInitial(Boolean validationRequirementsInitial) {
		this.validationRequirementsInitial = validationRequirementsInitial;
	}

	public void setValidationRequirementsActual(Boolean validationRequirementsActual) {
		this.validationRequirementsActual = validationRequirementsActual;
	}

	public void setValidationRequirementsSubmission(Boolean validationRequirementsSubmission) {
		this.validationRequirementsSubmission = validationRequirementsSubmission;
	}

	public void setSubmitValidationResultsInitial(Boolean submitValidationResultsInitial) {
		this.submitValidationResultsInitial = submitValidationResultsInitial;
	}

	public void setSubmitValidationResultsActual(Boolean submitValidationResultsActual) {
		this.submitValidationResultsActual = submitValidationResultsActual;
	}

	public void setSubmitValidationResultsSubmission(Boolean submitValidationResultsSubmission) {
		this.submitValidationResultsSubmission = submitValidationResultsSubmission;
	}

	public void setCustomerApprovalInitial(Boolean customerApprovalInitial) {
		this.customerApprovalInitial = customerApprovalInitial;
	}

	public void setCustomerApprovalActual(Boolean customerApprovalActual) {
		this.customerApprovalActual = customerApprovalActual;
	}

	public void setCustomerApprovalSubmission(Boolean customerApprovalSubmission) {
		this.customerApprovalSubmission = customerApprovalSubmission;
	}

	public void setOrInitial(Boolean orInitial) {
		this.orInitial = orInitial;
	}

	public void setOrActual(Boolean orActual) {
		this.orActual = orActual;
	}

	public void setOrSubmission(Boolean orSubmission) {
		this.orSubmission = orSubmission;
	}

	public void setVcLotInitial(Boolean vcLotInitial) {
		this.vcLotInitial = vcLotInitial;
	}

	public void setVcLotActual(Boolean vcLotActual) {
		this.vcLotActual = vcLotActual;
	}

	public void setVcLotSubmission(Boolean vcLotSubmission) {
		this.vcLotSubmission = vcLotSubmission;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
