package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Releases;
import com.bosch.wrd.util.DateUtil;

public class ReleasesConverter extends Converter<ReleasesDto, Releases> {

	public ReleasesConverter() {
		super(dto -> new Releases(dto.getNr(), DateUtil.stringToDate(dto.getLastUpdate(), DateUtil.DATE_FORMAT), dto.getStatus(), dto.getBelt(), dto.getLine(), dto.getDescriptionChange(),
				dto.getAqcdt(), dto.getJatcoReleaseMeth(), dto.getPic(), dto.getCounterPart(), DateUtil.stringToDate(dto.getNpcsInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getNpcsActual(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getNpcsSubmission(), DateUtil.DATE_FORMAT), dto.getMqs(), DateUtil.stringToDate(dto.getRiskReviewInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getRiskReviewActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getRiskReviewSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr01Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr01Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr01Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr0Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr0Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr0Submission(), DateUtil.DATE_FORMAT), 
				DateUtil.stringToDate(dto.getPdr1Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr1Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr1Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr2Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr2Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr2Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr3Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr3Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr3Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr4Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr4Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr4Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr5Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr5Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr5Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getNpcrInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getNpcrActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getNpcrSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getIsrInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIsrActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIsrSubmission(), DateUtil.DATE_FORMAT),
				dto.getSampleSubmission(), DateUtil.stringToDate(dto.getPswsInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPswsActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPswsSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPdr35Initial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr35Actual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPdr35Submission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getMasterBeltInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getMasterBeltActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getMasterBeltSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getPswaInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPswaActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getPswaSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getRbOrigSop(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getRbSopInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getRbSopActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getRbSopSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getCkdDispatchDate(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getDispatchFromPlantInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getDispatchFromPlantSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getArrivalAtCustomerInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getArrivalAtCustomerActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getArrivalAtCustomerSubmission(), DateUtil.DATE_FORMAT),
				dto.getFrozenPeriod(), dto.getTrafficLight(), DateUtil.stringToDate(dto.getQg1(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getQg2(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getQg3(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getQg4(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getQg5(), DateUtil.DATE_FORMAT),
				dto.getProjectNr(), dto.getEcrStatus(), dto.getEcrNr(), dto.getCustomerInform(), dto.getNotes(), dto.getUnique(), 
				DateUtil.stringToDate(dto.getIppNotificationInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppNotificationActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppNotificationSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getIppRegistrationInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppRegistrationActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppRegistrationSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getIppReportInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppReportActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppReportSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getIppApprovalInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppApprovalActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getIppApprovalSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getInformCustomerInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getInformCustomerActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getInformCustomerSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getValidationRequirementsInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getValidationRequirementsActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getValidationRequirementsSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getSubmitValidationResultsInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getSubmitValidationResultsActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getSubmitValidationResultsSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getCustomerApprovalInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getCustomerApprovalActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getCustomerApprovalSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getOrInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getOrActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getOrSubmission(), DateUtil.DATE_FORMAT),
				DateUtil.stringToDate(dto.getVcLotInitial(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getVcLotActual(), DateUtil.DATE_FORMAT), DateUtil.stringToDate(dto.getVcLotSubmission(), DateUtil.DATE_FORMAT),
				dto.getNpcsColor(), dto.getNpcrColor(), dto.getRiskReviewColor(), dto.getPdr01Color(), dto.getPdr0Color(), dto.getPdr1Color(),
				dto.getPdr2Color(), dto.getPdr3Color(), dto.getPdr4Color(), dto.getPdr5Color(), dto.getIsrColor(), dto.getPswsColor(),
				dto.getPswaColor(), dto.getPdr35Color(), dto.getMasterBeltColor(), dto.getRbSopColor(),
				dto.getDispatchFromPlantColor(), dto.getArrivalAtCustomerColor(), dto.getOrColor(), dto.getVcLotColor(),
				dto.getIppNotificationColor(), dto.getIppRegistrationColor(), dto.getIppReportColor(), dto.getIppApprovalColor(),
				dto.getInformCustomerColor(), dto.getValidationRequirementsColor(), dto.getSubmitValidationResultsColor(), dto.getCustomerApprovalColor()),				
				
				entity -> new ReleasesDto(entity.getNr(), DateUtil.convertDate(entity.getLastUpdate(), DateUtil.DATE_FORMAT), entity.getStatus(), entity.getBelt(), entity.getLine(), entity.getDescriptionChange(),
						entity.getAqcdt(), entity.getJatcoReleaseMeth(), entity.getPic(), entity.getCounterPart(), DateUtil.convertDate(entity.getNpcsInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getNpcsActual(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getNpcsSubmission(), DateUtil.DATE_FORMAT), entity.getMqs(), DateUtil.convertDate(entity.getRiskReviewInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getRiskReviewActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getRiskReviewSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr01Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr01Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr01Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr0Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr0Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr0Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr1Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr1Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr1Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr2Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr2Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr2Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr3Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr3Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr3Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr4Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr4Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr4Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr5Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr5Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr5Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getNpcrInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getNpcrActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getNpcrSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getIsrInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIsrActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIsrSubmission(), DateUtil.DATE_FORMAT),
						entity.getSampleSubmission(), DateUtil.convertDate(entity.getPswsInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPswsActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPswsSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPdr35Initial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr35Actual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPdr35Submission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getMasterBeltInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getMasterBeltActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getMasterBeltSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getPswaInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPswaActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getPswaSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getRbOrigSop(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getRbSopInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getRbSopActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getRbSopSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getCkdDispatchDate(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getDispatchFromPlantInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getDispatchFromPlantActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getDispatchFromPlantSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getArrivalAtCustomerInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getArrivalAtCustomerActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getArrivalAtCustomerSubmission(), DateUtil.DATE_FORMAT),
						entity.getFrozenPeriod(), entity.getTrafficLight(), DateUtil.convertDate(entity.getQg1(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getQg2(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getQg3(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getQg4(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getQg5(), DateUtil.DATE_FORMAT),
						entity.getProjectNr(), entity.getEcrStatus(), entity.getEcrNr(), entity.getCustomerInform(), entity.getNotes(), entity.getUnique(),
						DateUtil.convertDate(entity.getIppNotificationInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppNotificationActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppNotificationSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getIppRegistrationInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppRegistrationActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppRegistrationSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getIppReportInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppReportActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppReportSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getIppApprovalInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppApprovalActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getIppApprovalSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getInformCustomerInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getInformCustomerActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getInformCustomerSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getValidationRequirementsInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getValidationRequirementsActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getValidationRequirementsSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getSubmitValidationResultsInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getSubmitValidationResultsActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getSubmitValidationResultsSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getCustomerApprovalInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getCustomerApprovalActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getCustomerApprovalSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getOrInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getOrActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getOrSubmission(), DateUtil.DATE_FORMAT),
						DateUtil.convertDate(entity.getVcLotInitial(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getVcLotActual(), DateUtil.DATE_FORMAT), DateUtil.convertDate(entity.getVcLotSubmission(), DateUtil.DATE_FORMAT),
						entity.getNpcsColor(), entity.getNpcrColor(), entity.getRiskReviewColor(), entity.getPdr01Color(),
						entity.getPdr0Color(), entity.getPdr1Color(), entity.getPdr2Color(), entity.getPdr3Color(), entity.getPdr4Color(), entity.getPdr5Color(),
						entity.getIsrColor(), entity.getPswsColor(), entity.getPswaColor(), entity.getPdr35Color(), entity.getMasterBeltColor(),
						entity.getRbSopColor(), entity.getDispatchFromPlantColor(), entity.getArrivalAtCustomerColor(), entity.getOrColor(),
						entity.getVcLotColor(), entity.getIppNotificationColor(), entity.getIppRegistrationColor(), entity.getIppReportColor(),
						entity.getIppApprovalColor(), entity.getInformCustomerColor(), entity.getValidationRequirementsColor(),
						entity.getSubmitValidationResultsColor(), entity.getCustomerApprovalColor()));

	}

}
