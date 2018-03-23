package com.bosch.wrd.entity.entityImpl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "permission")
public class Permission extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private Boolean name;

	@Column(name = "nr")
	private Boolean nr;

	@Column(name = "priority")
	private Boolean priority;

	@Column(name = "status")
	private Boolean status;

	@Column(name = "belt")
	private Boolean belt;

	@Column(name = "customer_plant")
	private Boolean customerPlant;

	@Column(name = "line")
	private Boolean line;

	@Column(name = "description_change")
	private Boolean descriptionChange;

	@Column(name = "aqcdt")
	private Boolean aqcdt;

	@Column(name = "etp_test")
	private Boolean etpTest;

	@Column(name = "jatco_release_meth")
	private Boolean jatcoReleaseMeth;

	@Column(name = "npc_s_initial")
	private Boolean npcsInitial;

	@Column(name = "npc_s_actual")
	private Boolean npcsActual;

	@Column(name = "npc_s_submission")
	private Boolean npcsSubmission;

	@Column(name = "mqs")
	private Boolean mqs;

	@Column(name = "risk_review_initial")
	private Boolean riskReviewInitial;

	@Column(name = "risk_review_actual")
	private Boolean riskReviewActual;

	@Column(name = "risk_review_submission")
	private Boolean riskReviewSubmission;

	@Column(name = "p_dr01_initial")
	private Boolean pdr01Initial;

	@Column(name = "p_dr01_actual")
	private Boolean pdr01Actual;

	@Column(name = "p_dr01_submission")
	private Boolean pdr01Submission;

	@Column(name = "p_dr0_initial")
	private Boolean pdr0Initial;

	@Column(name = "p_dr0_actual")
	private Boolean pdr0Actual;

	@Column(name = "p_dr0_submission")
	private Boolean pdr0Submission;

	@Column(name = "p_dr1_initial")
	private Boolean pdr1Initial;

	@Column(name = "p_dr1_actual")
	private Boolean pdr1Actual;

	@Column(name = "p_dr1_submission")
	private Boolean pdr1Submission;

	@Column(name = "p_dr2_initial")
	private Boolean pdr2Initial;

	@Column(name = "p_dr2_actual")
	private Boolean pdr2Actual;

	@Column(name = "p_dr2_submission")
	private Boolean pdr2Submission;

	@Column(name = "p_dr3_initial")
	private Boolean pdr3Initial;

	@Column(name = "p_dr3_actual")
	private Boolean pdr3Actual;

	@Column(name = "p_dr3_submission")
	private Boolean pdr3Submission;

	@Column(name = "p_dr4_initial")
	private Boolean pdr4Initial;

	@Column(name = "p_dr4_actual")
	private Boolean pdr4Actual;

	@Column(name = "p_dr4_submission")
	private Boolean pdr4Submission;

	@Column(name = "p_dr5_initial")
	private Boolean pdr5Initial;

	@Column(name = "p_dr5_actual")
	private Boolean pdr5Actual;

	@Column(name = "p_dr5_submission")
	private Boolean pdr5Submission;

	@Column(name = "npc_r_initial")
	private Boolean npcrInitial;

	@Column(name = "npc_r_actual")
	private Boolean npcrActual;

	@Column(name = "npc_r_submission")
	private Boolean npcrSubmission;

	@Column(name = "isr_initial")
	private Boolean isrInitial;

	@Column(name = "isr_actual")
	private Boolean isrActual;

	@Column(name = "isr_submission")
	private Boolean isrSubmission;

	@Column(name = "quality_resp")
	private Boolean sampleSubmission;

	@Column(name = "psw_s_initial")
	private Boolean pswsInitial;

	@Column(name = "psw_s_actual")
	private Boolean pswsActual;

	@Column(name = "psw_s_submission")
	private Boolean pswsSubmission;

	@Column(name = "p_dr_3_5_initial")
	private Boolean pdr35Initial;

	@Column(name = "p_dr_3_5_actual")
	private Boolean pdr35Actual;

	@Column(name = "p_dr_3_5_submission")
	private Boolean pdr35Submission;

	@Column(name = "master_belt_initial")
	private Boolean masterBeltInitial;

	@Column(name = "master_belt_actual")
	private Boolean masterBeltActual;

	@Column(name = "master_belt_submission")
	private Boolean masterBeltSubmission;

	@Column(name = "psw_a_initial")
	private Boolean pswaInitial;

	@Column(name = "psw_a_actual")
	private Boolean pswaActual;

	@Column(name = "psw_a_submission")
	private Boolean pswaSubmission;

	@Column(name = "rb_orig_sop")
	private Boolean rbOrigSop;

	@Column(name = "rb_sop_initial")
	private Boolean rbSopInitial;

	@Column(name = "rb_sop_actual")
	private Boolean rbSopActual;

	@Column(name = "rb_sop_submission")
	private Boolean rbSopSubmission;

	@Column(name = "ckd_dispatch_date")
	private Boolean ckdDispatchDate;

	@Column(name = "dispatch_from_plant_initial")
	private Boolean dispatchFromPlantInitial;

	@Column(name = "dispatch_from_plant_actual")
	private Boolean dispatchFromPlantActual;

	@Column(name = "dispatch_from_plant_submission")
	private Boolean dispatchFromPlantSubmission;

	@Column(name = "arrival_at_customer_initial")
	private Boolean arrivalAtCustomerInitial;

	@Column(name = "arrival_at_customer_actual")
	private Boolean arrivalAtCustomerActual;

	@Column(name = "arrival_at_customer_submission")
	private Boolean arrivalAtCustomerSubmission;

	@Column(name = "frozen_period")
	private Boolean frozenPeriod;

	@Column(name = "traffic_light")
	private Boolean trafficLight;

	@Column(name = "qg1")
	private Boolean qg1;

	@Column(name = "qg2")
	private Boolean qg2;

	@Column(name = "qg3")
	private Boolean qg3;

	@Column(name = "qg4")
	private Boolean qg4;

	@Column(name = "qg5")
	private Boolean qg5;

	@Column(name = "project_nr")
	private Boolean projectNr;

	@Column(name = "ecr_number")
	private Boolean ecrNumber;

	@Column(name = "customer_inform")
	private Boolean customerInform;

	@Column(name = "notes")
	private Boolean notes;

	@Column(name = "last_update")
	private Boolean lastUpdate;

	@Column(name = "customer")
	private Boolean customer;

	@Column(name = "type_of_change")
	private Boolean typeofChange;

	@Column(name = "unit")
	private Boolean unit;

	@Column(name = "location")
	private Boolean location;

	@Column(name = "uniqu")
	private Boolean uniqu;

	@Column(name = "pic")
	private Boolean pic;

	@Column(name = "counter_part")
	private Boolean counterPart;

	@Column(name = "ipp_notification_initial")
	private Boolean ippNotificationInitial;

	@Column(name = "ipp_notification_actual")
	private Boolean ippNotificationActual;

	@Column(name = "ipp_notification_submission")
	private Boolean ippNotificationSubmission;

	@Column(name = "ipp_registration_initial")
	private Boolean ippRegistrationInitial;

	@Column(name = "ipp_registration_actual")
	private Boolean ippRegistrationActual;

	@Column(name = "ipp_registration_submission")
	private Boolean ippRegistrationSubmission;

	@Column(name = "ipp_report_initial")
	private Boolean ippReportInitial;

	@Column(name = "ipp_report_actual")
	private Boolean ippReportActual;

	@Column(name = "ipp_report_submission")
	private Boolean ippReportSubmission;

	@Column(name = "ipp_approval_initial")
	private Boolean ippApprovalInitial;

	@Column(name = "ipp_approval_actual")
	private Boolean ippApprovalActual;

	@Column(name = "ipp_approval_submission")
	private Boolean ippApprovalSubmission;

	@Column(name = "inform_customer_initial")
	private Boolean informCustomerInitial;

	@Column(name = "inform_customer_actual")
	private Boolean informCustomerActual;

	@Column(name = "inform_customer_submission")
	private Boolean informCustomerSubmission;

	@Column(name = "validation_requirements_initial")
	private Boolean validationRequirementsInitial;

	@Column(name = "validation_requirements_actual")
	private Boolean validationRequirementsActual;

	@Column(name = "validation_requirements_submission")
	private Boolean validationRequirementsSubmission;

	@Column(name = "submit_validation_results_initial")
	private Boolean submitValidationResultsInitial;

	@Column(name = "submit_validation_results_actual")
	private Boolean submitValidationResultsActual;

	@Column(name = "submit_validation_results_submission")
	private Boolean submitValidationResultsSubmission;

	@Column(name = "customer_approval_initial")
	private Boolean customerApprovalInitial;

	@Column(name = "customer_approval_actual")
	private Boolean customerApprovalActual;

	@Column(name = "customer_approval_submission")
	private Boolean customerApprovalSubmission;

	@Column(name = "or_initial")
	private Boolean orInitial;

	@Column(name = "or_actual")
	private Boolean orActual;

	@Column(name = "or_submission")
	private Boolean orSubmission;

	@Column(name = "vc_lot_initial")
	private Boolean vcLotInitial;

	@Column(name = "vc_lot_actual")
	private Boolean vcLotActual;

	@Column(name = "vc_lot_submission")
	private Boolean vcLotSubmission;

	@ManyToMany(mappedBy = "permissions", cascade = CascadeType.ALL)
	private Set<Role> roles = new HashSet<Role>(0);

	public Permission() {
	}

	public Permission(Long id, Boolean name, Boolean nr, Boolean priority, Boolean status, Boolean belt,
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
		super(id);
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

	public Set<Role> getRoles() {
		return roles;
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

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
