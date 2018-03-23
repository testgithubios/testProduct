package com.bosch.wrd.dto;

import java.util.List;

public class ReleasesDto {
	private Long nr;
	private String lastUpdate;
	private String status;
	private String belt;
	private String line;
	private String descriptionChange;
	private String aqcdt;
	private String jatcoReleaseMeth;
	private String pic;
	private String counterPart;
	private String npcsInitial;
	private String npcsActual;
	private String npcsSubmission;
	private String mqs;
	private String riskReviewInitial;
	private String riskReviewActual;
	private String riskReviewSubmission;
	private String pdr01Initial;
	private String pdr01Actual;
	private String pdr01Submission;
	private String pdr0Initial;
	private String pdr0Actual;
	private String pdr0Submission;
	private String pdr1Initial;
	private String pdr1Actual;
	private String pdr1Submission;
	private String pdr2Initial;
	private String pdr2Actual;
	private String pdr2Submission;
	private String pdr3Initial;
	private String pdr3Actual;
	private String pdr3Submission;
	private String pdr4Initial;
	private String pdr4Actual;
	private String pdr4Submission;
	private String pdr5Initial;
	private String pdr5Actual;
	private String pdr5Submission;
	private String npcrInitial;
	private String npcrActual;
	private String npcrSubmission;
	private String isrInitial;
	private String isrActual;
	private String isrSubmission;
	private String sampleSubmission;
	private String pswsInitial;
	private String pswsActual;
	private String pswsSubmission;
	private String pdr35Initial;
	private String pdr35Actual;
	private String pdr35Submission;
	private String masterBeltInitial;
	private String masterBeltActual;
	private String masterBeltSubmission;
	private String pswaInitial;
	private String pswaActual;
	private String pswaSubmission;
	private String rbOrigSop;
	private String rbSopInitial;
	private String rbSopActual;
	private String rbSopSubmission;
	private String ckdDispatchDate;
	private String dispatchFromPlantInitial;
	private String dispatchFromPlantActual;
	private String dispatchFromPlantSubmission;
	private String arrivalAtCustomerInitial;
	private String arrivalAtCustomerActual;
	private String arrivalAtCustomerSubmission;
	private Integer frozenPeriod;
	private String trafficLight;
	private String qg1;
	private String qg2;
	private String qg3;
	private String qg4;
	private String qg5;
	private String projectNr;
	private Integer ecrStatus;
	private String ecrNr;
	private String customerInform;
	private String notes;
	private String unique;
	private String ippNotificationInitial;
	private String ippNotificationActual;
	private String ippNotificationSubmission;
	private String ippRegistrationInitial;
	private String ippRegistrationActual;
	private String ippRegistrationSubmission;
	private String ippReportInitial;
	private String ippReportActual;
	private String ippReportSubmission;
	private String ippApprovalInitial;
	private String ippApprovalActual;
	private String ippApprovalSubmission;
	private String informCustomerInitial;
	private String informCustomerActual;
	private String informCustomerSubmission;
	private String validationRequirementsInitial;
	private String validationRequirementsActual;
	private String validationRequirementsSubmission;
	private String submitValidationResultsInitial;
	private String submitValidationResultsActual;
	private String submitValidationResultsSubmission;
	private String customerApprovalInitial;
	private String customerApprovalActual;
	private String customerApprovalSubmission;
	private String orInitial;
	private String orActual;
	private String orSubmission;
	private String vcLotInitial;
	private String vcLotActual;
	private String vcLotSubmission;
	private String npcsColor;
	private String npcrColor;
	private String riskReviewColor;
	private String pdr01Color;
	private String pdr0Color;
	private String pdr1Color;
	private String pdr2Color;
	private String pdr3Color;
	private String pdr4Color;
	private String pdr5Color;
	private String isrColor;
	private String pswsColor;
	private String pswaColor;
	private String pdr35Color;
	private String masterBeltColor;
	private String rbSopColor;
	private String dispatchFromPlantColor;
	private String arrivalAtCustomerColor;
	private String orColor;
	private String vcLotColor;
	private String ippNotificationColor;
	private String ippRegistrationColor;
	private String ippReportColor;
	private String ippApprovalColor;
	private String informCustomerColor;
	private String validationRequirementsColor;
	private String submitValidationResultsColor;
	private String customerApprovalColor;
	

	// for relationship
	private String user;
	private String change;
	private String unit;
	private List<LocationDto> locations;
	private String objCustomer;
	private List<PriorityDto> objPriority;
	private String objCounterPart;
	private List<CustomerPlantDto> objCustomerPlant;
	private Long projectReviews;
	private Long stearingCommittees;
	private Long testingCapacities;
	private Long porfolios;
	private String etpTesting;
	
	// for UI
	private String customerPlantName;
	private String priorityName;
	private String changeName;
	private String customerName;
	private String locationName;

	public ReleasesDto() {
	}

	public ReleasesDto(Long nr, String lastUpdate, String status, String belt, String line, String descriptionChange,
			String aqcdt, String jatcoReleaseMeth, String pic, String counterPart, String npcsInitial,
			String npcsActual, String npcsSubmission, String mqs, String riskReviewInitial, String riskReviewActual,
			String riskReviewSubmission, String pdr01Initial, String pdr01Actual, String pdr01Submission,
			String pdr0Initial, String pdr0Actual, String pdr0Submission, String pdr1Initial, String pdr1Actual,
			String pdr1Submission, String pdr2Initial, String pdr2Actual, String pdr2Submission, String pdr3Initial,
			String pdr3Actual, String pdr3Submission, String pdr4Initial, String pdr4Actual, String pdr4Submission,
			String pdr5Initial, String pdr5Actual, String pdr5Submission, String npcrInitial, String npcrActual,
			String npcrSubmission, String isrInitial, String isrActual, String isrSubmission, String sampleSubmission,
			String pswsInitial, String pswsActual, String pswsSubmission, String pdr35Initial, String pdr35Actual,
			String pdr35Submission, String masterBeltInitial, String masterBeltActual, String masterBeltSubmission,
			String pswaInitial, String pswaActual, String pswaSubmission, String rbOrigSop, String rbSopInitial,
			String rbSopActual, String rbSopSubmission, String ckdDispatchDate, String dispatchFromPlantInitial,
			String dispatchFromPlantActual, String dispatchFromPlantSubmission, String arrivalAtCustomerInitial,
			String arrivalAtCustomerActual, String arrivalAtCustomerSubmission, Integer frozenPeriod, String trafficLight,
			String qg1, String qg2, String qg3, String qg4, String qg5, String projectNr, Integer ecrStatus,
			String ecrNr, String customerInform, String notes, String unique, String ippNotificationInitial,
			String ippNotificationActual, String ippNotificationSubmission, String ippRegistrationInitial,
			String ippRegistrationActual, String ippRegistrationSubmission, String ippReportInitial,
			String ippReportActual, String ippReportSubmission, String ippApprovalInitial, String ippApprovalActual,
			String ippApprovalSubmission, String informCustomerInitial, String informCustomerActual,
			String informCustomerSubmission, String validationRequirementsInitial, String validationRequirementsActual,
			String validationRequirementsSubmission, String submitValidationResultsInitial,
			String submitValidationResultsActual, String submitValidationResultsSubmission,
			String customerApprovalInitial, String customerApprovalActual, String customerApprovalSubmission,
			String orInitial, String orActual, String orSubmission, String vcLotInitial, String vcLotActual,
			String vcLotSubmission, String npcsColor, String npcrColor, String riskReviewColor, String pdr01Color,
			String pdr0Color, String pdr1Color, String pdr2Color, String pdr3Color, String pdr4Color, String pdr5Color,
			String isrColor, String pswsColor, String pswaColor, String pdr35Color, String masterBeltColor,
			String rbSopColor, String dispatchFromPlantColor, String arrivalAtCustomerColor, String orColor,
			String vcLotColor, String ippNotificationColor, String ippRegistrationColor, String ippReportColor,
			String ippApprovalColor, String informCustomerColor, String validationRequirementsColor,
			String submitValidationResultsColor, String customerApprovalColor) {
		this.nr = nr;
		this.lastUpdate = lastUpdate;
		this.status = status;
		this.belt = belt;
		this.line = line;
		this.descriptionChange = descriptionChange;
		this.aqcdt = aqcdt;
		this.jatcoReleaseMeth = jatcoReleaseMeth;
		this.pic = pic;
		this.counterPart = counterPart;
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
		this.ecrStatus = ecrStatus;
		this.ecrNr = ecrNr;
		this.customerInform = customerInform;
		this.notes = notes;
		this.unique = unique;
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
		this.npcsColor = npcsColor;
		this.npcrColor = npcrColor;
		this.riskReviewColor = riskReviewColor;
		this.pdr01Color = pdr01Color;
		this.pdr0Color = pdr0Color;
		this.pdr1Color = pdr1Color;
		this.pdr2Color = pdr2Color;
		this.pdr3Color = pdr3Color;
		this.pdr4Color = pdr4Color;
		this.pdr5Color = pdr5Color;
		this.isrColor = isrColor;
		this.pswsColor = pswsColor;
		this.pswaColor = pswaColor;
		this.pdr35Color = pdr35Color;
		this.masterBeltColor = masterBeltColor;
		this.rbSopColor = rbSopColor;
		this.dispatchFromPlantColor = dispatchFromPlantColor;
		this.arrivalAtCustomerColor = arrivalAtCustomerColor;
		this.orColor = orColor;
		this.vcLotColor = vcLotColor;
		this.ippNotificationColor = ippNotificationColor;
		this.ippRegistrationColor = ippRegistrationColor;
		this.ippReportColor = ippReportColor;
		this.ippApprovalColor = ippApprovalColor;
		this.informCustomerColor = informCustomerColor;
		this.validationRequirementsColor = validationRequirementsColor;
		this.submitValidationResultsColor = submitValidationResultsColor;
		this.customerApprovalColor = customerApprovalColor;
	}

	public Long getNr() {
		return nr;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public String getStatus() {
		return status;
	}

	public String getBelt() {
		return belt;
	}

	public String getLine() {
		return line;
	}

	public String getDescriptionChange() {
		return descriptionChange;
	}

	public String getAqcdt() {
		return aqcdt;
	}

	public String getJatcoReleaseMeth() {
		return jatcoReleaseMeth;
	}

	public String getPic() {
		return pic;
	}

	public String getCounterPart() {
		return counterPart;
	}

	public String getNpcsInitial() {
		return npcsInitial;
	}

	public String getNpcsActual() {
		return npcsActual;
	}

	public String getNpcsSubmission() {
		return npcsSubmission;
	}

	public String getMqs() {
		return mqs;
	}

	public String getRiskReviewInitial() {
		return riskReviewInitial;
	}

	public String getRiskReviewActual() {
		return riskReviewActual;
	}

	public String getRiskReviewSubmission() {
		return riskReviewSubmission;
	}

	public String getPdr01Initial() {
		return pdr01Initial;
	}

	public String getPdr01Actual() {
		return pdr01Actual;
	}

	public String getPdr01Submission() {
		return pdr01Submission;
	}

	public String getPdr0Initial() {
		return pdr0Initial;
	}

	public String getPdr0Actual() {
		return pdr0Actual;
	}

	public String getPdr0Submission() {
		return pdr0Submission;
	}

	public String getPdr1Initial() {
		return pdr1Initial;
	}

	public String getPdr1Actual() {
		return pdr1Actual;
	}

	public String getPdr1Submission() {
		return pdr1Submission;
	}

	public String getPdr2Initial() {
		return pdr2Initial;
	}

	public String getPdr2Actual() {
		return pdr2Actual;
	}

	public String getPdr2Submission() {
		return pdr2Submission;
	}

	public String getPdr3Initial() {
		return pdr3Initial;
	}

	public String getPdr3Actual() {
		return pdr3Actual;
	}

	public String getPdr3Submission() {
		return pdr3Submission;
	}

	public String getPdr4Initial() {
		return pdr4Initial;
	}

	public String getPdr4Actual() {
		return pdr4Actual;
	}

	public String getPdr4Submission() {
		return pdr4Submission;
	}

	public String getPdr5Initial() {
		return pdr5Initial;
	}

	public String getPdr5Actual() {
		return pdr5Actual;
	}

	public String getPdr5Submission() {
		return pdr5Submission;
	}

	public String getNpcrInitial() {
		return npcrInitial;
	}

	public String getNpcrActual() {
		return npcrActual;
	}

	public String getNpcrSubmission() {
		return npcrSubmission;
	}

	public String getIsrInitial() {
		return isrInitial;
	}

	public String getIsrActual() {
		return isrActual;
	}

	public String getIsrSubmission() {
		return isrSubmission;
	}

	public String getSampleSubmission() {
		return sampleSubmission;
	}

	public String getPswsInitial() {
		return pswsInitial;
	}

	public String getPswsActual() {
		return pswsActual;
	}

	public String getPswsSubmission() {
		return pswsSubmission;
	}

	public String getPdr35Initial() {
		return pdr35Initial;
	}

	public String getPdr35Actual() {
		return pdr35Actual;
	}

	public String getPdr35Submission() {
		return pdr35Submission;
	}

	public String getMasterBeltInitial() {
		return masterBeltInitial;
	}

	public String getMasterBeltActual() {
		return masterBeltActual;
	}

	public String getMasterBeltSubmission() {
		return masterBeltSubmission;
	}

	public String getPswaInitial() {
		return pswaInitial;
	}

	public String getPswaActual() {
		return pswaActual;
	}

	public String getPswaSubmission() {
		return pswaSubmission;
	}

	public String getRbOrigSop() {
		return rbOrigSop;
	}

	public String getRbSopInitial() {
		return rbSopInitial;
	}

	public String getRbSopActual() {
		return rbSopActual;
	}

	public String getRbSopSubmission() {
		return rbSopSubmission;
	}

	public String getCkdDispatchDate() {
		return ckdDispatchDate;
	}

	public String getDispatchFromPlantInitial() {
		return dispatchFromPlantInitial;
	}

	public String getDispatchFromPlantActual() {
		return dispatchFromPlantActual;
	}

	public String getDispatchFromPlantSubmission() {
		return dispatchFromPlantSubmission;
	}

	public String getArrivalAtCustomerInitial() {
		return arrivalAtCustomerInitial;
	}

	public String getArrivalAtCustomerActual() {
		return arrivalAtCustomerActual;
	}

	public String getArrivalAtCustomerSubmission() {
		return arrivalAtCustomerSubmission;
	}

	public Integer getFrozenPeriod() {
		return frozenPeriod;
	}

	public String getTrafficLight() {
		return trafficLight;
	}

	public String getQg1() {
		return qg1;
	}

	public String getQg2() {
		return qg2;
	}

	public String getQg3() {
		return qg3;
	}

	public String getQg4() {
		return qg4;
	}

	public String getQg5() {
		return qg5;
	}

	public String getProjectNr() {
		return projectNr;
	}

	public Integer getEcrStatus() {
		return ecrStatus;
	}

	public String getEcrNr() {
		return ecrNr;
	}

	public String getCustomerInform() {
		return customerInform;
	}

	public String getNotes() {
		return notes;
	}

	public String getUnique() {
		return unique;
	}

	public String getIppNotificationInitial() {
		return ippNotificationInitial;
	}

	public String getIppNotificationActual() {
		return ippNotificationActual;
	}

	public String getIppNotificationSubmission() {
		return ippNotificationSubmission;
	}

	public String getIppRegistrationInitial() {
		return ippRegistrationInitial;
	}

	public String getIppRegistrationActual() {
		return ippRegistrationActual;
	}

	public String getIppRegistrationSubmission() {
		return ippRegistrationSubmission;
	}

	public String getIppReportInitial() {
		return ippReportInitial;
	}

	public String getIppReportActual() {
		return ippReportActual;
	}

	public String getIppReportSubmission() {
		return ippReportSubmission;
	}

	public String getIppApprovalInitial() {
		return ippApprovalInitial;
	}

	public String getIppApprovalActual() {
		return ippApprovalActual;
	}

	public String getIppApprovalSubmission() {
		return ippApprovalSubmission;
	}

	public String getInformCustomerInitial() {
		return informCustomerInitial;
	}

	public String getInformCustomerActual() {
		return informCustomerActual;
	}

	public String getInformCustomerSubmission() {
		return informCustomerSubmission;
	}

	public String getValidationRequirementsInitial() {
		return validationRequirementsInitial;
	}

	public String getValidationRequirementsActual() {
		return validationRequirementsActual;
	}

	public String getValidationRequirementsSubmission() {
		return validationRequirementsSubmission;
	}

	public String getSubmitValidationResultsInitial() {
		return submitValidationResultsInitial;
	}

	public String getSubmitValidationResultsActual() {
		return submitValidationResultsActual;
	}

	public String getSubmitValidationResultsSubmission() {
		return submitValidationResultsSubmission;
	}

	public String getCustomerApprovalInitial() {
		return customerApprovalInitial;
	}

	public String getCustomerApprovalActual() {
		return customerApprovalActual;
	}

	public String getCustomerApprovalSubmission() {
		return customerApprovalSubmission;
	}

	public String getOrInitial() {
		return orInitial;
	}

	public String getOrActual() {
		return orActual;
	}

	public String getOrSubmission() {
		return orSubmission;
	}

	public String getVcLotInitial() {
		return vcLotInitial;
	}

	public String getVcLotActual() {
		return vcLotActual;
	}

	public String getVcLotSubmission() {
		return vcLotSubmission;
	}

	public String getNpcsColor() {
		return npcsColor;
	}

	public String getNpcrColor() {
		return npcrColor;
	}

	public String getRiskReviewColor() {
		return riskReviewColor;
	}

	public String getPdr01Color() {
		return pdr01Color;
	}

	public String getPdr0Color() {
		return pdr0Color;
	}

	public String getPdr1Color() {
		return pdr1Color;
	}

	public String getPdr2Color() {
		return pdr2Color;
	}

	public String getPdr3Color() {
		return pdr3Color;
	}

	public String getPdr4Color() {
		return pdr4Color;
	}

	public String getPdr5Color() {
		return pdr5Color;
	}

	public String getIsrColor() {
		return isrColor;
	}

	public String getPswsColor() {
		return pswsColor;
	}

	public String getPswaColor() {
		return pswaColor;
	}

	public String getPdr35Color() {
		return pdr35Color;
	}

	public String getMasterBeltColor() {
		return masterBeltColor;
	}

	public String getRbSopColor() {
		return rbSopColor;
	}

	public String getDispatchFromPlantColor() {
		return dispatchFromPlantColor;
	}

	public String getArrivalAtCustomerColor() {
		return arrivalAtCustomerColor;
	}

	public String getOrColor() {
		return orColor;
	}

	public String getVcLotColor() {
		return vcLotColor;
	}

	public String getIppNotificationColor() {
		return ippNotificationColor;
	}

	public String getIppRegistrationColor() {
		return ippRegistrationColor;
	}

	public String getIppReportColor() {
		return ippReportColor;
	}

	public String getIppApprovalColor() {
		return ippApprovalColor;
	}

	public String getInformCustomerColor() {
		return informCustomerColor;
	}

	public String getValidationRequirementsColor() {
		return validationRequirementsColor;
	}

	public String getSubmitValidationResultsColor() {
		return submitValidationResultsColor;
	}

	public String getCustomerApprovalColor() {
		return customerApprovalColor;
	}

	public String getUser() {
		return user;
	}

	public String getChange() {
		return change;
	}

	public String getUnit() {
		return unit;
	}

	public List<LocationDto> getLocations() {
		return locations;
	}

	public String getObjCustomer() {
		return objCustomer;
	}

	public List<PriorityDto> getObjPriority() {
		return objPriority;
	}

	public String getObjCounterPart() {
		return objCounterPart;
	}

	public List<CustomerPlantDto> getObjCustomerPlant() {
		return objCustomerPlant;
	}

	public Long getProjectReviews() {
		return projectReviews;
	}

	public Long getStearingCommittees() {
		return stearingCommittees;
	}

	public Long getTestingCapacities() {
		return testingCapacities;
	}

	public Long getPorfolios() {
		return porfolios;
	}

	public String getEtpTesting() {
		return etpTesting;
	}

	public String getCustomerPlantName() {
		return customerPlantName;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public String getChangeName() {
		return changeName;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public void setDescriptionChange(String descriptionChange) {
		this.descriptionChange = descriptionChange;
	}

	public void setAqcdt(String aqcdt) {
		this.aqcdt = aqcdt;
	}

	public void setJatcoReleaseMeth(String jatcoReleaseMeth) {
		this.jatcoReleaseMeth = jatcoReleaseMeth;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public void setCounterPart(String counterPart) {
		this.counterPart = counterPart;
	}

	public void setNpcsInitial(String npcsInitial) {
		this.npcsInitial = npcsInitial;
	}

	public void setNpcsActual(String npcsActual) {
		this.npcsActual = npcsActual;
	}

	public void setNpcsSubmission(String npcsSubmission) {
		this.npcsSubmission = npcsSubmission;
	}

	public void setMqs(String mqs) {
		this.mqs = mqs;
	}

	public void setRiskReviewInitial(String riskReviewInitial) {
		this.riskReviewInitial = riskReviewInitial;
	}

	public void setRiskReviewActual(String riskReviewActual) {
		this.riskReviewActual = riskReviewActual;
	}

	public void setRiskReviewSubmission(String riskReviewSubmission) {
		this.riskReviewSubmission = riskReviewSubmission;
	}

	public void setPdr01Initial(String pdr01Initial) {
		this.pdr01Initial = pdr01Initial;
	}

	public void setPdr01Actual(String pdr01Actual) {
		this.pdr01Actual = pdr01Actual;
	}

	public void setPdr01Submission(String pdr01Submission) {
		this.pdr01Submission = pdr01Submission;
	}

	public void setPdr0Initial(String pdr0Initial) {
		this.pdr0Initial = pdr0Initial;
	}

	public void setPdr0Actual(String pdr0Actual) {
		this.pdr0Actual = pdr0Actual;
	}

	public void setPdr0Submission(String pdr0Submission) {
		this.pdr0Submission = pdr0Submission;
	}

	public void setPdr1Initial(String pdr1Initial) {
		this.pdr1Initial = pdr1Initial;
	}

	public void setPdr1Actual(String pdr1Actual) {
		this.pdr1Actual = pdr1Actual;
	}

	public void setPdr1Submission(String pdr1Submission) {
		this.pdr1Submission = pdr1Submission;
	}

	public void setPdr2Initial(String pdr2Initial) {
		this.pdr2Initial = pdr2Initial;
	}

	public void setPdr2Actual(String pdr2Actual) {
		this.pdr2Actual = pdr2Actual;
	}

	public void setPdr2Submission(String pdr2Submission) {
		this.pdr2Submission = pdr2Submission;
	}

	public void setPdr3Initial(String pdr3Initial) {
		this.pdr3Initial = pdr3Initial;
	}

	public void setPdr3Actual(String pdr3Actual) {
		this.pdr3Actual = pdr3Actual;
	}

	public void setPdr3Submission(String pdr3Submission) {
		this.pdr3Submission = pdr3Submission;
	}

	public void setPdr4Initial(String pdr4Initial) {
		this.pdr4Initial = pdr4Initial;
	}

	public void setPdr4Actual(String pdr4Actual) {
		this.pdr4Actual = pdr4Actual;
	}

	public void setPdr4Submission(String pdr4Submission) {
		this.pdr4Submission = pdr4Submission;
	}

	public void setPdr5Initial(String pdr5Initial) {
		this.pdr5Initial = pdr5Initial;
	}

	public void setPdr5Actual(String pdr5Actual) {
		this.pdr5Actual = pdr5Actual;
	}

	public void setPdr5Submission(String pdr5Submission) {
		this.pdr5Submission = pdr5Submission;
	}

	public void setNpcrInitial(String npcrInitial) {
		this.npcrInitial = npcrInitial;
	}

	public void setNpcrActual(String npcrActual) {
		this.npcrActual = npcrActual;
	}

	public void setNpcrSubmission(String npcrSubmission) {
		this.npcrSubmission = npcrSubmission;
	}

	public void setIsrInitial(String isrInitial) {
		this.isrInitial = isrInitial;
	}

	public void setIsrActual(String isrActual) {
		this.isrActual = isrActual;
	}

	public void setIsrSubmission(String isrSubmission) {
		this.isrSubmission = isrSubmission;
	}

	public void setSampleSubmission(String sampleSubmission) {
		this.sampleSubmission = sampleSubmission;
	}

	public void setPswsInitial(String pswsInitial) {
		this.pswsInitial = pswsInitial;
	}

	public void setPswsActual(String pswsActual) {
		this.pswsActual = pswsActual;
	}

	public void setPswsSubmission(String pswsSubmission) {
		this.pswsSubmission = pswsSubmission;
	}

	public void setPdr35Initial(String pdr35Initial) {
		this.pdr35Initial = pdr35Initial;
	}

	public void setPdr35Actual(String pdr35Actual) {
		this.pdr35Actual = pdr35Actual;
	}

	public void setPdr35Submission(String pdr35Submission) {
		this.pdr35Submission = pdr35Submission;
	}

	public void setMasterBeltInitial(String masterBeltInitial) {
		this.masterBeltInitial = masterBeltInitial;
	}

	public void setMasterBeltActual(String masterBeltActual) {
		this.masterBeltActual = masterBeltActual;
	}

	public void setMasterBeltSubmission(String masterBeltSubmission) {
		this.masterBeltSubmission = masterBeltSubmission;
	}

	public void setPswaInitial(String pswaInitial) {
		this.pswaInitial = pswaInitial;
	}

	public void setPswaActual(String pswaActual) {
		this.pswaActual = pswaActual;
	}

	public void setPswaSubmission(String pswaSubmission) {
		this.pswaSubmission = pswaSubmission;
	}

	public void setRbOrigSop(String rbOrigSop) {
		this.rbOrigSop = rbOrigSop;
	}

	public void setRbSopInitial(String rbSopInitial) {
		this.rbSopInitial = rbSopInitial;
	}

	public void setRbSopActual(String rbSopActual) {
		this.rbSopActual = rbSopActual;
	}

	public void setRbSopSubmission(String rbSopSubmission) {
		this.rbSopSubmission = rbSopSubmission;
	}

	public void setCkdDispatchDate(String ckdDispatchDate) {
		this.ckdDispatchDate = ckdDispatchDate;
	}

	public void setDispatchFromPlantInitial(String dispatchFromPlantInitial) {
		this.dispatchFromPlantInitial = dispatchFromPlantInitial;
	}

	public void setDispatchFromPlantActual(String dispatchFromPlantActual) {
		this.dispatchFromPlantActual = dispatchFromPlantActual;
	}

	public void setDispatchFromPlantSubmission(String dispatchFromPlantSubmission) {
		this.dispatchFromPlantSubmission = dispatchFromPlantSubmission;
	}

	public void setArrivalAtCustomerInitial(String arrivalAtCustomerInitial) {
		this.arrivalAtCustomerInitial = arrivalAtCustomerInitial;
	}

	public void setArrivalAtCustomerActual(String arrivalAtCustomerActual) {
		this.arrivalAtCustomerActual = arrivalAtCustomerActual;
	}

	public void setArrivalAtCustomerSubmission(String arrivalAtCustomerSubmission) {
		this.arrivalAtCustomerSubmission = arrivalAtCustomerSubmission;
	}

	public void setFrozenPeriod(Integer frozenPeriod) {
		this.frozenPeriod = frozenPeriod;
	}

	public void setTrafficLight(String trafficLight) {
		this.trafficLight = trafficLight;
	}

	public void setQg1(String qg1) {
		this.qg1 = qg1;
	}

	public void setQg2(String qg2) {
		this.qg2 = qg2;
	}

	public void setQg3(String qg3) {
		this.qg3 = qg3;
	}

	public void setQg4(String qg4) {
		this.qg4 = qg4;
	}

	public void setQg5(String qg5) {
		this.qg5 = qg5;
	}

	public void setProjectNr(String projectNr) {
		this.projectNr = projectNr;
	}

	public void setEcrStatus(Integer ecrStatus) {
		this.ecrStatus = ecrStatus;
	}

	public void setEcrNr(String ecrNr) {
		this.ecrNr = ecrNr;
	}

	public void setCustomerInform(String customerInform) {
		this.customerInform = customerInform;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setUnique(String unique) {
		this.unique = unique;
	}

	public void setIppNotificationInitial(String ippNotificationInitial) {
		this.ippNotificationInitial = ippNotificationInitial;
	}

	public void setIppNotificationActual(String ippNotificationActual) {
		this.ippNotificationActual = ippNotificationActual;
	}

	public void setIppNotificationSubmission(String ippNotificationSubmission) {
		this.ippNotificationSubmission = ippNotificationSubmission;
	}

	public void setIppRegistrationInitial(String ippRegistrationInitial) {
		this.ippRegistrationInitial = ippRegistrationInitial;
	}

	public void setIppRegistrationActual(String ippRegistrationActual) {
		this.ippRegistrationActual = ippRegistrationActual;
	}

	public void setIppRegistrationSubmission(String ippRegistrationSubmission) {
		this.ippRegistrationSubmission = ippRegistrationSubmission;
	}

	public void setIppReportInitial(String ippReportInitial) {
		this.ippReportInitial = ippReportInitial;
	}

	public void setIppReportActual(String ippReportActual) {
		this.ippReportActual = ippReportActual;
	}

	public void setIppReportSubmission(String ippReportSubmission) {
		this.ippReportSubmission = ippReportSubmission;
	}

	public void setIppApprovalInitial(String ippApprovalInitial) {
		this.ippApprovalInitial = ippApprovalInitial;
	}

	public void setIppApprovalActual(String ippApprovalActual) {
		this.ippApprovalActual = ippApprovalActual;
	}

	public void setIppApprovalSubmission(String ippApprovalSubmission) {
		this.ippApprovalSubmission = ippApprovalSubmission;
	}

	public void setInformCustomerInitial(String informCustomerInitial) {
		this.informCustomerInitial = informCustomerInitial;
	}

	public void setInformCustomerActual(String informCustomerActual) {
		this.informCustomerActual = informCustomerActual;
	}

	public void setInformCustomerSubmission(String informCustomerSubmission) {
		this.informCustomerSubmission = informCustomerSubmission;
	}

	public void setValidationRequirementsInitial(String validationRequirementsInitial) {
		this.validationRequirementsInitial = validationRequirementsInitial;
	}

	public void setValidationRequirementsActual(String validationRequirementsActual) {
		this.validationRequirementsActual = validationRequirementsActual;
	}

	public void setValidationRequirementsSubmission(String validationRequirementsSubmission) {
		this.validationRequirementsSubmission = validationRequirementsSubmission;
	}

	public void setSubmitValidationResultsInitial(String submitValidationResultsInitial) {
		this.submitValidationResultsInitial = submitValidationResultsInitial;
	}

	public void setSubmitValidationResultsActual(String submitValidationResultsActual) {
		this.submitValidationResultsActual = submitValidationResultsActual;
	}

	public void setSubmitValidationResultsSubmission(String submitValidationResultsSubmission) {
		this.submitValidationResultsSubmission = submitValidationResultsSubmission;
	}

	public void setCustomerApprovalInitial(String customerApprovalInitial) {
		this.customerApprovalInitial = customerApprovalInitial;
	}

	public void setCustomerApprovalActual(String customerApprovalActual) {
		this.customerApprovalActual = customerApprovalActual;
	}

	public void setCustomerApprovalSubmission(String customerApprovalSubmission) {
		this.customerApprovalSubmission = customerApprovalSubmission;
	}

	public void setOrInitial(String orInitial) {
		this.orInitial = orInitial;
	}

	public void setOrActual(String orActual) {
		this.orActual = orActual;
	}

	public void setOrSubmission(String orSubmission) {
		this.orSubmission = orSubmission;
	}

	public void setVcLotInitial(String vcLotInitial) {
		this.vcLotInitial = vcLotInitial;
	}

	public void setVcLotActual(String vcLotActual) {
		this.vcLotActual = vcLotActual;
	}

	public void setVcLotSubmission(String vcLotSubmission) {
		this.vcLotSubmission = vcLotSubmission;
	}

	public void setNpcsColor(String npcsColor) {
		this.npcsColor = npcsColor;
	}

	public void setNpcrColor(String npcrColor) {
		this.npcrColor = npcrColor;
	}

	public void setRiskReviewColor(String riskReviewColor) {
		this.riskReviewColor = riskReviewColor;
	}

	public void setPdr01Color(String pdr01Color) {
		this.pdr01Color = pdr01Color;
	}

	public void setPdr0Color(String pdr0Color) {
		this.pdr0Color = pdr0Color;
	}

	public void setPdr1Color(String pdr1Color) {
		this.pdr1Color = pdr1Color;
	}

	public void setPdr2Color(String pdr2Color) {
		this.pdr2Color = pdr2Color;
	}

	public void setPdr3Color(String pdr3Color) {
		this.pdr3Color = pdr3Color;
	}

	public void setPdr4Color(String pdr4Color) {
		this.pdr4Color = pdr4Color;
	}

	public void setPdr5Color(String pdr5Color) {
		this.pdr5Color = pdr5Color;
	}

	public void setIsrColor(String isrColor) {
		this.isrColor = isrColor;
	}

	public void setPswsColor(String pswsColor) {
		this.pswsColor = pswsColor;
	}

	public void setPswaColor(String pswaColor) {
		this.pswaColor = pswaColor;
	}

	public void setPdr35Color(String pdr35Color) {
		this.pdr35Color = pdr35Color;
	}

	public void setMasterBeltColor(String masterBeltColor) {
		this.masterBeltColor = masterBeltColor;
	}

	public void setRbSopColor(String rbSopColor) {
		this.rbSopColor = rbSopColor;
	}

	public void setDispatchFromPlantColor(String dispatchFromPlantColor) {
		this.dispatchFromPlantColor = dispatchFromPlantColor;
	}

	public void setArrivalAtCustomerColor(String arrivalAtCustomerColor) {
		this.arrivalAtCustomerColor = arrivalAtCustomerColor;
	}

	public void setOrColor(String orColor) {
		this.orColor = orColor;
	}

	public void setVcLotColor(String vcLotColor) {
		this.vcLotColor = vcLotColor;
	}

	public void setIppNotificationColor(String ippNotificationColor) {
		this.ippNotificationColor = ippNotificationColor;
	}

	public void setIppRegistrationColor(String ippRegistrationColor) {
		this.ippRegistrationColor = ippRegistrationColor;
	}

	public void setIppReportColor(String ippReportColor) {
		this.ippReportColor = ippReportColor;
	}

	public void setIppApprovalColor(String ippApprovalColor) {
		this.ippApprovalColor = ippApprovalColor;
	}

	public void setInformCustomerColor(String informCustomerColor) {
		this.informCustomerColor = informCustomerColor;
	}

	public void setValidationRequirementsColor(String validationRequirementsColor) {
		this.validationRequirementsColor = validationRequirementsColor;
	}

	public void setSubmitValidationResultsColor(String submitValidationResultsColor) {
		this.submitValidationResultsColor = submitValidationResultsColor;
	}

	public void setCustomerApprovalColor(String customerApprovalColor) {
		this.customerApprovalColor = customerApprovalColor;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setLocations(List<LocationDto> locations) {
		this.locations = locations;
	}

	public void setObjCustomer(String objCustomer) {
		this.objCustomer = objCustomer;
	}

	public void setObjPriority(List<PriorityDto> objPriority) {
		this.objPriority = objPriority;
	}

	public void setObjCounterPart(String objCounterPart) {
		this.objCounterPart = objCounterPart;
	}

	public void setObjCustomerPlant(List<CustomerPlantDto> objCustomerPlant) {
		this.objCustomerPlant = objCustomerPlant;
	}

	public void setProjectReviews(Long projectReviews) {
		this.projectReviews = projectReviews;
	}

	public void setStearingCommittees(Long stearingCommittees) {
		this.stearingCommittees = stearingCommittees;
	}

	public void setTestingCapacities(Long testingCapacities) {
		this.testingCapacities = testingCapacities;
	}

	public void setPorfolios(Long porfolios) {
		this.porfolios = porfolios;
	}

	public void setEtpTesting(String etpTesting) {
		this.etpTesting = etpTesting;
	}

	public void setCustomerPlantName(String customerPlantName) {
		this.customerPlantName = customerPlantName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
}
