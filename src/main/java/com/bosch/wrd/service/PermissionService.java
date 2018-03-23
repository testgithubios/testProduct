/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.PermissionRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.PermissionConverter;
import com.bosch.wrd.dto.PermissionDto;
import com.bosch.wrd.entity.entityImpl.Permission;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/permission")
public class PermissionService extends BaseService<Permission, Long> {

	private Converter<PermissionDto, Permission> converter = new PermissionConverter();

	public PermissionService(PermissionRepository dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping(value = "/getList/{roleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<PermissionDto>> getListPers(@PathVariable Long roleId) {

		List<PermissionDto> dtos = new ArrayList<>();
		List<Permission> pers = ((PermissionRepository) this.dao).getPermissionByRoleId(roleId);

		Permission p = pers.get(0);
		PermissionDto dto = converter.convertFromEntity(p);
		dto.setRoleId(roleId);
		dtos.add(dto);
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<PermissionDto> saveOrUpdate(@RequestBody PermissionDto dto) {

		Permission per = converter.convertFromDto(dto);
		Permission newPer = this.dao.save(per);

		return new ResponseEntity<>((converter.convertFromEntity(newPer)), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/listString/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<String> getWritableFields(@PathVariable String userId) {
		List<String> results = new Vector<String>();
		List<Permission> pers = ((PermissionRepository) this.dao).getPermissionByUserId(userId);
		if (pers.size() >= 1) {
			Permission per = pers.get(0);
			if (per.getPriority() != null && per.getPriority()) {
				results.add("Priority");
			}
			if (per.getStatus() != null && per.getStatus()) {
				results.add("Status");
			}
			if (per.getBelt() != null && per.getBelt()) {
				results.add("Belt");
			}
			if (per.getCustomerPlant() != null && per.getCustomerPlant()) {
				results.add("CustomerPlant");
			}
			if (per.getLine() != null && per.getLine()) {
				results.add("Line");
			}
			if (per.getDescriptionChange() != null && per.getDescriptionChange()) {
				results.add("DescriptionChange");
			}
			if (per.getAqcdt() != null && per.getAqcdt()) {
				results.add("Aqcdt");
			}
			if (per.getEtpTest() != null && per.getEtpTest()) {
				results.add("EtpTest");
			}
			if (per.getJatcoReleaseMeth() != null && per.getJatcoReleaseMeth()) {
				results.add("JatcoReleaseMeth");
			}
			if (per.getNpcsInitial() != null && per.getNpcsInitial()) {
				results.add("NpcsInitial");
			}
			if (per.getNpcsActual() != null && per.getNpcsActual()) {
				results.add("NpcsActual");
			}
			if (per.getNpcsSubmission() != null && per.getNpcsSubmission()) {
				results.add("NpcsSubmission");
			}
			if (per.getMqs() != null && per.getMqs()) {
				results.add("Mqs");
			}
			if (per.getRiskReviewInitial() != null && per.getRiskReviewInitial()) {
				results.add("RiskReviewInitial");
			}
			if (per.getRiskReviewActual() != null && per.getRiskReviewActual()) {
				results.add("RiskReviewActual");
			}
			if (per.getRiskReviewSubmission() != null && per.getRiskReviewSubmission()) {
				results.add("RiskReviewSubmission");
			}
			if (per.getPdr01Initial() != null && per.getPdr01Initial()) {
				results.add("Pdr01Initial");
			}
			if (per.getPdr01Actual() != null && per.getPdr01Actual()) {
				results.add("Pdr01Actual");
			}
			if (per.getPdr01Submission() != null && per.getPdr01Submission()) {
				results.add("Pdr01Submission");
			}
			if (per.getPdr0Initial() != null && per.getPdr0Initial()) {
				results.add("Pdr0Initial");
			}
			if (per.getPdr0Actual() != null && per.getPdr0Actual()) {
				results.add("Pdr0Actual");
			}
			if (per.getPdr0Submission() != null && per.getPdr0Submission()) {
				results.add("Pdr0Submission");
			}
			if (per.getPdr1Initial() != null && per.getPdr1Initial()) {
				results.add("Pdr1Initial");
			}
			if (per.getPdr1Actual() != null && per.getPdr1Actual()) {
				results.add("Pdr1Actual");
			}
			if (per.getPdr1Submission() != null && per.getPdr1Submission()) {
				results.add("Pdr1Submission");
			}
			if (per.getPdr2Initial() != null && per.getPdr2Initial()) {
				results.add("Pdr2Initial");
			}
			if (per.getPdr2Actual() != null && per.getPdr2Actual()) {
				results.add("Pdr2Actual");
			}
			if (per.getPdr2Submission() != null && per.getPdr2Submission()) {
				results.add("Pdr2Submission");
			}
			if (per.getPdr3Initial() != null && per.getPdr3Initial()) {
				results.add("Pdr3Initial");
			}
			if (per.getPdr3Actual() != null && per.getPdr3Actual()) {
				results.add("Pdr3Actual");
			}
			if (per.getPdr3Submission() != null && per.getPdr3Submission()) {
				results.add("Pdr3Submission");
			}
			if (per.getPdr4Initial() != null && per.getPdr4Initial()) {
				results.add("Pdr4Initial");
			}
			if (per.getPdr4Actual() != null && per.getPdr4Actual()) {
				results.add("Pdr4Actual");
			}
			if (per.getPdr4Submission() != null && per.getPdr4Submission()) {
				results.add("Pdr4Submission");
			}
			if (per.getPdr5Initial() != null && per.getPdr5Initial()) {
				results.add("Pdr5Initial");
			}
			if (per.getPdr5Actual() != null && per.getPdr5Actual()) {
				results.add("Pdr5Actual");
			}
			if (per.getPdr5Submission() != null && per.getPdr5Submission()) {
				results.add("Pdr5Submission");
			}
			if (per.getNpcrInitial() != null && per.getNpcrInitial()) {
				results.add("NpcrInitial");
			}
			if (per.getNpcrActual() != null && per.getNpcrActual()) {
				results.add("NpcrActual");
			}
			if (per.getNpcrSubmission() != null && per.getNpcrSubmission()) {
				results.add("NpcrSubmission");
			}
			if (per.getIsrInitial() != null && per.getIsrInitial()) {
				results.add("IsrInitial");
			}
			if (per.getIsrActual() != null && per.getIsrActual()) {
				results.add("IsrActual");
			}
			if (per.getIsrSubmission() != null && per.getIsrSubmission()) {
				results.add("IsrSubmission");
			}
			if (per.getSampleSubmission() != null && per.getSampleSubmission()) {
				results.add("SampleSubmission");
			}
			if (per.getPswsInitial() != null && per.getPswsInitial()) {
				results.add("PswsInitial");
			}
			if (per.getPswsActual() != null && per.getPswsActual()) {
				results.add("PswsActual");
			}
			if (per.getPswsSubmission() != null && per.getPswsSubmission()) {
				results.add("PswsSubmission");
			}
			if (per.getPdr35Initial() != null && per.getPdr35Initial()) {
				results.add("Pdr35Initial");
			}
			if (per.getPdr35Actual() != null && per.getPdr35Actual()) {
				results.add("Pdr35Actual");
			}
			if (per.getPdr35Submission() != null && per.getPdr35Submission()) {
				results.add("Pdr35Submission");
			}
			if (per.getMasterBeltInitial() != null && per.getMasterBeltInitial()) {
				results.add("MasterBeltInitial");
			}
			if (per.getMasterBeltActual() != null && per.getMasterBeltActual()) {
				results.add("MasterBeltActual");
			}
			if (per.getMasterBeltSubmission() != null && per.getMasterBeltSubmission()) {
				results.add("MasterBeltSubmission");
			}
			if (per.getPswaInitial() != null && per.getPswaInitial()) {
				results.add("PswaInitial");
			}
			if (per.getPswaActual() != null && per.getPswaActual()) {
				results.add("PswaActual");
			}
			if (per.getPswaSubmission() != null && per.getPswaSubmission()) {
				results.add("PswaSubmission");
			}
			if (per.getRbOrigSop() != null && per.getRbOrigSop()) {
				results.add("RbOrigSop");
			}
			if (per.getRbSopInitial() != null && per.getRbSopInitial()) {
				results.add("RbSopInitial");
			}
			if (per.getRbSopActual() != null && per.getRbSopActual()) {
				results.add("RbSopActual");
			}
			if (per.getRbSopSubmission() != null && per.getRbSopSubmission()) {
				results.add("RbSopSubmission");
			}
			if (per.getCkdDispatchDate() != null && per.getCkdDispatchDate()) {
				results.add("CkdDispatchDate");
			}
			if (per.getDispatchFromPlantInitial() != null && per.getDispatchFromPlantInitial()) {
				results.add("DispatchFromPlantInitial");
			}
			if (per.getDispatchFromPlantActual() != null && per.getDispatchFromPlantActual()) {
				results.add("DispatchFromPlantActual");
			}
			if (per.getDispatchFromPlantSubmission() != null && per.getDispatchFromPlantSubmission()) {
				results.add("DispatchFromPlantSubmission");
			}
			if (per.getArrivalAtCustomerInitial() != null && per.getArrivalAtCustomerInitial()) {
				results.add("ArrivalAtCustomerInitial");
			}
			if (per.getArrivalAtCustomerActual() != null && per.getArrivalAtCustomerActual()) {
				results.add("ArrivalAtCustomerActual");
			}
			if (per.getArrivalAtCustomerSubmission() != null && per.getArrivalAtCustomerSubmission()) {
				results.add("ArrivalAtCustomerSubmission");
			}
			if (per.getFrozenPeriod() != null && per.getFrozenPeriod()) {
				results.add("FrozenPeriod");
			}
			if (per.getTrafficLight() != null && per.getTrafficLight()) {
				results.add("TrafficLight");
			}
			if (per.getQg1() != null && per.getQg1()) {
				results.add("Qg1");
			}
			if (per.getQg2() != null && per.getQg2()) {
				results.add("Qg2");
			}
			if (per.getQg3() != null && per.getQg3()) {
				results.add("Qg3");
			}
			if (per.getQg4() != null && per.getQg4()) {
				results.add("Qg4");
			}
			if (per.getQg5() != null && per.getQg5()) {
				results.add("Qg5");
			}
			if (per.getProjectNr() != null && per.getProjectNr()) {
				results.add("ProjectNr");
			}
			if (per.getEcrNumber() != null && per.getEcrNumber()) {
				results.add("EcrNumber");
			}
			if (per.getCustomerInform() != null && per.getCustomerInform()) {
				results.add("CustomerInform");
			}
			if (per.getNotes() != null && per.getNotes()) {
				results.add("Notes");
			}
			if (per.getLastUpdate() != null && per.getLastUpdate()) {
				results.add("LastUpdate");
			}
			if (per.getCustomer() != null && per.getCustomer()) {
				results.add("Customer");
			}
			if (per.getTypeofChange() != null && per.getTypeofChange()) {
				results.add("TypeofChange");
			}
			if (per.getUnit() != null && per.getUnit()) {
				results.add("Unit");
			}
			if (per.getLocation() != null && per.getLocation()) {
				results.add("Location");
			}
			if (per.getUniqu() != null && per.getUniqu()) {
				results.add("Unique");
			}
			if (per.getPic() != null && per.getPic()) {
				results.add("Pic");
			}
			if (per.getCounterPart() != null && per.getCounterPart()) {
				results.add("CounterPart");
			}
			if (per.getIppNotificationInitial() != null && per.getIppNotificationInitial()) {
				results.add("IppNotificationInitial");
			}
			if (per.getIppNotificationActual() != null && per.getIppNotificationActual()) {
				results.add("IppNotificationActual");
			}
			if (per.getIppNotificationSubmission() != null && per.getIppNotificationSubmission()) {
				results.add("IppNotificationSubmission");
			}
			if (per.getIppRegistrationInitial() != null && per.getIppRegistrationInitial()) {
				results.add("IppRegistrationInitial");
			}
			if (per.getIppRegistrationActual() != null && per.getIppRegistrationActual()) {
				results.add("IppRegistrationActual");
			}
			if (per.getIppRegistrationSubmission() != null && per.getIppRegistrationSubmission()) {
				results.add("IppRegistrationSubmission");
			}
			if (per.getIppReportInitial() != null && per.getIppReportInitial()) {
				results.add("IppReportInitial");
			}
			if (per.getIppReportActual() != null && per.getIppReportActual()) {
				results.add("IppReportActual");
			}
			if (per.getIppReportSubmission() != null && per.getIppReportSubmission()) {
				results.add("IppReportSubmission");
			}
			if (per.getIppApprovalInitial() != null && per.getIppApprovalInitial()) {
				results.add("IppApprovalInitial");
			}
			if (per.getIppApprovalActual() != null && per.getIppApprovalActual()) {
				results.add("IppApprovalActual");
			}
			if (per.getIppApprovalSubmission() != null && per.getIppApprovalSubmission()) {
				results.add("IppApprovalSubmission");
			}
			if (per.getInformCustomerInitial() != null && per.getInformCustomerInitial()) {
				results.add("InformCustomerInitial");
			}
			if (per.getInformCustomerActual() != null && per.getInformCustomerActual()) {
				results.add("InformCustomerActual");
			}
			if (per.getInformCustomerSubmission() != null && per.getInformCustomerSubmission()) {
				results.add("InformCustomerSubmission");
			}
			if (per.getValidationRequirementsInitial() != null && per.getValidationRequirementsInitial()) {
				results.add("ValidationRequirementsInitial");
			}
			if (per.getValidationRequirementsActual() != null && per.getValidationRequirementsActual()) {
				results.add("ValidationRequirementsActual");
			}
			if (per.getValidationRequirementsSubmission() != null && per.getValidationRequirementsSubmission()) {
				results.add("ValidationRequirementsSubmission");
			}
			if (per.getSubmitValidationResultsInitial() != null && per.getSubmitValidationResultsInitial()) {
				results.add("SubmitValidationResultsInitial");
			}
			if (per.getSubmitValidationResultsActual() != null && per.getSubmitValidationResultsActual()) {
				results.add("SubmitValidationResultsActual");
			}
			if (per.getSubmitValidationResultsSubmission() != null && per.getSubmitValidationResultsSubmission()) {
				results.add("SubmitValidationResultsSubmission");
			}
			if (per.getCustomerApprovalInitial() != null && per.getCustomerApprovalInitial()) {
				results.add("CustomerApprovalInitial");
			}
			if (per.getCustomerApprovalActual() != null && per.getCustomerApprovalActual()) {
				results.add("CustomerApprovalActual");
			}
			if (per.getCustomerApprovalSubmission() != null && per.getCustomerApprovalSubmission()) {
				results.add("CustomerApprovalSubmission");
			}
			if (per.getOrInitial() != null && per.getOrInitial()) {
				results.add("OrInitial");
			}
			if (per.getOrActual() != null && per.getOrActual()) {
				results.add("OrActual");
			}
			if (per.getOrSubmission() != null && per.getOrSubmission()) {
				results.add("OrSubmission");
			}
			if (per.getVcLotInitial() != null && per.getVcLotInitial()) {
				results.add("VcLotInitial");
			}
			if (per.getVcLotActual() != null && per.getVcLotActual()) {
				results.add("VcLotActual");
			}
			if (per.getVcLotSubmission() != null && per.getVcLotSubmission()) {
				results.add("VcLotSubmission");
			}
		}
		return results;
	}
}