/**
 * 
 */
package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Permission;

/**
 * @author hnd1hc
 *
 */
public class PermissionConverter extends Converter<PermissionDto, Permission> {

	public PermissionConverter() {
		super(dto -> new Permission(dto.getId(), dto.getName(), dto.getNr(), dto.getPriority(), dto.getStatus(), dto.getBelt(),
				dto.getCustomerPlant(), dto.getLine(), dto.getDescriptionChange(), dto.getAqcdt(), dto.getEtpTest(),
				dto.getJatcoReleaseMeth(), dto.getNpcsInitial(), dto.getNpcsActual(), dto.getNpcsSubmission(), dto.getMqs(),
				dto.getRiskReviewInitial(), dto.getRiskReviewActual(), dto.getRiskReviewSubmission(), dto.getPdr01Initial(),
				dto.getPdr01Actual(), dto.getPdr01Submission(), dto.getPdr0Initial(), dto.getPdr0Actual(),
				dto.getPdr0Submission(), dto.getPdr1Initial(), dto.getPdr1Actual(), dto.getPdr1Submission(),
				dto.getPdr2Initial(), dto.getPdr2Actual(), dto.getPdr2Submission(), dto.getPdr3Initial(), dto.getPdr3Actual(),
				dto.getPdr3Submission(), dto.getPdr4Initial(), dto.getPdr4Actual(), dto.getPdr4Submission(),
				dto.getPdr5Initial(), dto.getPdr5Actual(), dto.getPdr5Submission(), dto.getNpcrInitial(), dto.getNpcrActual(),
				dto.getNpcrSubmission(), dto.getIsrInitial(), dto.getIsrActual(), dto.getIsrSubmission(),
				dto.getSampleSubmission(), dto.getPswsInitial(), dto.getPswsActual(), dto.getPswsSubmission(),
				dto.getPdr35Initial(), dto.getPdr35Actual(), dto.getPdr35Submission(), dto.getMasterBeltInitial(),
				dto.getMasterBeltActual(), dto.getMasterBeltSubmission(), dto.getPswaInitial(), dto.getPswaActual(),
				dto.getPswaSubmission(), dto.getRbOrigSop(), dto.getRbSopInitial(), dto.getRbSopActual(),
				dto.getRbSopSubmission(), dto.getCkdDispatchDate(), dto.getDispatchFromPlantInitial(),
				dto.getDispatchFromPlantActual(), dto.getDispatchFromPlantSubmission(), dto.getArrivalAtCustomerInitial(),
				dto.getArrivalAtCustomerActual(), dto.getArrivalAtCustomerSubmission(), dto.getFrozenPeriod(),
				dto.getTrafficLight(), dto.getQg1(), dto.getQg2(), dto.getQg3(), dto.getQg4(), dto.getQg5(), dto.getProjectNr(),
				dto.getEcrNumber(), dto.getCustomerInform(), dto.getNotes(), dto.getLastUpdate(), dto.getCustomer(),
				dto.getTypeofChange(), dto.getUnit(), dto.getLocation(), dto.getUniqu(), dto.getPic(), dto.getCounterPart(),
				dto.getIppNotificationInitial(), dto.getIppNotificationActual(), dto.getIppNotificationSubmission(),
				dto.getIppRegistrationInitial(), dto.getIppRegistrationActual(), dto.getIppRegistrationSubmission(),
				dto.getIppReportInitial(), dto.getIppReportActual(), dto.getIppReportSubmission(), dto.getIppApprovalInitial(),
				dto.getIppApprovalActual(), dto.getIppApprovalSubmission(), dto.getInformCustomerInitial(),
				dto.getInformCustomerActual(), dto.getInformCustomerSubmission(), dto.getValidationRequirementsInitial(),
				dto.getValidationRequirementsActual(), dto.getValidationRequirementsSubmission(),
				dto.getSubmitValidationResultsInitial(), dto.getSubmitValidationResultsActual(),
				dto.getSubmitValidationResultsSubmission(), dto.getCustomerApprovalInitial(), dto.getCustomerApprovalActual(),
				dto.getCustomerApprovalSubmission(), dto.getOrInitial(), dto.getOrActual(), dto.getOrSubmission(),
				dto.getVcLotInitial(), dto.getVcLotActual(), dto.getVcLotSubmission()),

				entity -> new PermissionDto(entity.getId(), entity.getName(), entity.getNr(), entity.getPriority(), entity.getStatus(), entity.getBelt(),
						entity.getCustomerPlant(), entity.getLine(), entity.getDescriptionChange(), entity.getAqcdt(), entity.getEtpTest(),
						entity.getJatcoReleaseMeth(), entity.getNpcsInitial(), entity.getNpcsActual(), entity.getNpcsSubmission(), entity.getMqs(),
						entity.getRiskReviewInitial(), entity.getRiskReviewActual(), entity.getRiskReviewSubmission(), entity.getPdr01Initial(),
						entity.getPdr01Actual(), entity.getPdr01Submission(), entity.getPdr0Initial(), entity.getPdr0Actual(),
						entity.getPdr0Submission(), entity.getPdr1Initial(), entity.getPdr1Actual(), entity.getPdr1Submission(),
						entity.getPdr2Initial(), entity.getPdr2Actual(), entity.getPdr2Submission(), entity.getPdr3Initial(), entity.getPdr3Actual(),
						entity.getPdr3Submission(), entity.getPdr4Initial(), entity.getPdr4Actual(), entity.getPdr4Submission(),
						entity.getPdr5Initial(), entity.getPdr5Actual(), entity.getPdr5Submission(), entity.getNpcrInitial(), entity.getNpcrActual(),
						entity.getNpcrSubmission(), entity.getIsrInitial(), entity.getIsrActual(), entity.getIsrSubmission(),
						entity.getSampleSubmission(), entity.getPswsInitial(), entity.getPswsActual(), entity.getPswsSubmission(),
						entity.getPdr35Initial(), entity.getPdr35Actual(), entity.getPdr35Submission(), entity.getMasterBeltInitial(),
						entity.getMasterBeltActual(), entity.getMasterBeltSubmission(), entity.getPswaInitial(), entity.getPswaActual(),
						entity.getPswaSubmission(), entity.getRbOrigSop(), entity.getRbSopInitial(), entity.getRbSopActual(),
						entity.getRbSopSubmission(), entity.getCkdDispatchDate(), entity.getDispatchFromPlantInitial(),
						entity.getDispatchFromPlantActual(), entity.getDispatchFromPlantSubmission(), entity.getArrivalAtCustomerInitial(),
						entity.getArrivalAtCustomerActual(), entity.getArrivalAtCustomerSubmission(), entity.getFrozenPeriod(),
						entity.getTrafficLight(), entity.getQg1(), entity.getQg2(), entity.getQg3(), entity.getQg4(), entity.getQg5(), entity.getProjectNr(),
						entity.getEcrNumber(), entity.getCustomerInform(), entity.getNotes(), entity.getLastUpdate(), entity.getCustomer(),
						entity.getTypeofChange(), entity.getUnit(), entity.getLocation(), entity.getUniqu(), entity.getPic(), entity.getCounterPart(),
						entity.getIppNotificationInitial(), entity.getIppNotificationActual(), entity.getIppNotificationSubmission(),
						entity.getIppRegistrationInitial(), entity.getIppRegistrationActual(), entity.getIppRegistrationSubmission(),
						entity.getIppReportInitial(), entity.getIppReportActual(), entity.getIppReportSubmission(), entity.getIppApprovalInitial(),
						entity.getIppApprovalActual(), entity.getIppApprovalSubmission(), entity.getInformCustomerInitial(),
						entity.getInformCustomerActual(), entity.getInformCustomerSubmission(), entity.getValidationRequirementsInitial(),
						entity.getValidationRequirementsActual(), entity.getValidationRequirementsSubmission(),
						entity.getSubmitValidationResultsInitial(), entity.getSubmitValidationResultsActual(),
						entity.getSubmitValidationResultsSubmission(), entity.getCustomerApprovalInitial(), entity.getCustomerApprovalActual(),
						entity.getCustomerApprovalSubmission(), entity.getOrInitial(), entity.getOrActual(), entity.getOrSubmission(),
						entity.getVcLotInitial(), entity.getVcLotActual(), entity.getVcLotSubmission()));
	}

}