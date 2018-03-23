package com.bosch.wrd.entity.entityImpl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "releases")
public class Releases implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "nr")
	private Long nr;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update")
	private Date lastUpdate;

	@Column(name = "status")
	private String status;

	@Column(name = "belt")
	private String belt;

	@Column(name = "line")
	private String line;

	@Column(name = "description_change")
	private String descriptionChange;

	@Column(name = "aqcdt")
	private String aqcdt;

	@Column(name = "jatco_release_meth")
	private String jatcoReleaseMeth;

	@Column(name = "pic")
	private String pic;

	@Column(name = "counter_part")
	private String counterPart;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "npc_s_initial")
	private Date npcsInitial;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "npc_s_actual")
	private Date npcsActual;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "npc_s_submission")
	private Date npcsSubmission;

	@Column(name = "mqs")
	private String mqs;

	@Column(name = "risk_review_initial")
	private Date riskReviewInitial;
	
	@Column(name = "risk_review_actual")
	private Date riskReviewActual;
	
	@Column(name = "risk_review_submission")
	private Date riskReviewSubmission;
	
	@Column(name = "p_dr01_initial")
	private Date pdr01Initial;
	
	@Column(name = "p_dr01_actual")
	private Date pdr01Actual;
	
	@Column(name = "p_dr01_submission")
	private Date pdr01Submission;
	
	@Column(name = "p_dr0_initial")
	private Date pdr0Initial;
	
	@Column(name = "p_dr0_actual")
	private Date pdr0Actual;
	
	@Column(name = "p_dr0_submission")
	private Date pdr0Submission;
	
	@Column(name = "p_dr1_initial")
	private Date pdr1Initial;
	
	@Column(name = "p_dr1_actual")
	private Date pdr1Actual;
	
	@Column(name = "p_dr1_submission")
	private Date pdr1Submission;

	@Column(name = "p_dr2_initial")
	private Date pdr2Initial;
	
	@Column(name = "p_dr2_actual")
	private Date pdr2Actual;
	
	@Column(name = "p_dr2_submission")
	private Date pdr2Submission;
	
	@Column(name = "p_dr3_initial")
	private Date pdr3Initial;
	
	@Column(name = "p_dr3_actual")
	private Date pdr3Actual;
	
	@Column(name = "p_dr3_submission")
	private Date pdr3Submission;
	
	@Column(name = "p_dr4_initial")
	private Date pdr4Initial;
	
	@Column(name = "p_dr4_actual")
	private Date pdr4Actual;
	
	@Column(name = "p_dr4_submission")
	private Date pdr4Submission;
	
	@Column(name = "p_dr5_initial")
	private Date pdr5Initial;
	
	@Column(name = "p_dr5_actual")
	private Date pdr5Actual;
	
	@Column(name = "p_dr5_submission")
	private Date pdr5Submission;

	@Column(name = "npc_r_initial")
	private Date npcrInitial;
	
	@Column(name = "npc_r_actual")
	private Date npcrActual;
	
	@Column(name = "npc_r_submission")
	private Date npcrSubmission;

	@Column(name = "isr_initial")
	private Date isrInitial;
	
	@Column(name = "isr_actual")
	private Date isrActual;
	
	@Column(name = "isr_submission")
	private Date isrSubmission;

	@Column(name = "quality_resp")
	private String sampleSubmission;

	@Column(name = "psw_s_initial")
	private Date pswsInitial;
	
	@Column(name = "psw_s_actual")
	private Date pswsActual;
	
	@Column(name = "psw_s_submission")
	private Date pswsSubmission;

	@Column(name = "p_dr_3_5_initial")
	private Date pdr35Initial;
	
	@Column(name = "p_dr_3_5_actual")
	private Date pdr35Actual;
	
	@Column(name = "p_dr_3_5_submission")
	private Date pdr35Submission;

	@Column(name = "master_belt_initial")
	private Date masterBeltInitial;
	
	@Column(name = "master_belt_actual")
	private Date masterBeltActual;
	
	@Column(name = "master_belt_submission")
	private Date masterBeltSubmission;

	@Column(name = "psw_a_initial")
	private Date pswaInitial;
	
	@Column(name = "psw_a_actual")
	private Date pswaActual;
	
	@Column(name = "psw_a_submission")
	private Date pswaSubmission;

	@Column(name = "rb_orig_sop")
	private Date rbOrigSop;

	@Column(name = "rb_sop_initial")
	private Date rbSopInitial;
	
	@Column(name = "rb_sop_actual")
	private Date rbSopActual;
	
	@Column(name = "rb_sop_submission")
	private Date rbSopSubmission;

	@Column(name = "ckd_dispatch_date")
	private Date ckdDispatchDate;

	@Column(name = "dispatch_from_plant_initial")
	private Date dispatchFromPlantInitial;
	
	@Column(name = "dispatch_from_plant_actual")
	private Date dispatchFromPlantActual;
	
	@Column(name = "dispatch_from_plant_submission")
	private Date dispatchFromPlantSubmission;

	@Column(name = "arrival_at_customer_initial")
	private Date arrivalAtCustomerInitial;
	
	@Column(name = "arrival_at_customer_actual")
	private Date arrivalAtCustomerActual;
	
	@Column(name = "arrival_at_customer_submission")
	private Date arrivalAtCustomerSubmission;

	@Column(name = "frozen_period")
	private Integer frozenPeriod;

	@Column(name = "traffic_light")
	private String trafficLight;

	@Column(name = "qg1")
	private Date qg1;

	@Column(name = "qg2")
	private Date qg2;

	@Column(name = "qg3")
	private Date qg3;

	@Column(name = "qg4")
	private Date qg4;

	@Column(name = "qg5")
	private Date qg5;

	@Column(name = "project_nr")
	private String projectNr;

	@Column(name = "ecr_status")
	private Integer ecrStatus;

	@Column(name = "ecr_nr")
	private String ecrNr;

	@Column(name = "customer_inform")
	private String customerInform;

	@Column(name = "notes")
	private String notes;

	@Column(name = "uniqu")
	private String unique;
	
	@Column(name = "project_highlight")
	private String projectHighlight;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "planned_start_time")
	private Date plannedStartTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "planned_sop")
	private Date plannedSop;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "planned_isr")
	private Date plannedIsr;
	
	@Column(name = "ipp_notification_initial")
	private Date ippNotificationInitial;
	
	@Column(name = "ipp_notification_actual")
	private Date ippNotificationActual;
	
	@Column(name = "ipp_notification_submission")
	private Date ippNotificationSubmission;
	
	@Column(name = "ipp_registration_initial")
	private Date ippRegistrationInitial;
	
	@Column(name = "ipp_registration_actual")
	private Date ippRegistrationActual;
	
	@Column(name = "ipp_registration_submission")
	private Date ippRegistrationSubmission;
	
	@Column(name = "ipp_report_initial")
	private Date ippReportInitial;
	
	@Column(name = "ipp_report_actual")
	private Date ippReportActual;
	
	@Column(name = "ipp_report_submission")
	private Date ippReportSubmission;
	
	@Column(name = "ipp_approval_initial")
	private Date ippApprovalInitial;
	
	@Column(name = "ipp_approval_actual")
	private Date ippApprovalActual;
	
	@Column(name = "ipp_approval_submission")
	private Date ippApprovalSubmission;
	
	@Column(name = "inform_customer_initial")
	private Date informCustomerInitial;
	
	@Column(name = "inform_customer_actual")
	private Date informCustomerActual;
	
	@Column(name = "inform_customer_submission")
	private Date informCustomerSubmission;
	
	@Column(name = "validation_requirements_initial")
	private Date validationRequirementsInitial;
	
	@Column(name = "validation_requirements_actual")
	private Date validationRequirementsActual;
	
	@Column(name = "validation_requirements_submission")
	private Date validationRequirementsSubmission;
	
	@Column(name = "submit_validation_results_initial")
	private Date submitValidationResultsInitial;
	
	@Column(name = "submit_validation_results_actual")
	private Date submitValidationResultsActual;
	
	@Column(name = "submit_validation_results_submission")
	private Date submitValidationResultsSubmission;
	
	@Column(name = "customer_approval_initial")
	private Date customerApprovalInitial;
	
	@Column(name = "customer_approval_actual")
	private Date customerApprovalActual;
	
	@Column(name = "customer_approval_submission")
	private Date customerApprovalSubmission;
	
	@Column(name = "or_initial")
	private Date orInitial;
	
	@Column(name = "or_actual")
	private Date orActual;
	
	@Column(name = "or_submission")
	private Date orSubmission;
	
	@Column(name = "vc_lot_initial")
	private Date vcLotInitial;
	
	@Column(name = "vc_lot_actual")
	private Date vcLotActual;
	
	@Column(name = "vc_lot_submission")
	private Date vcLotSubmission;
	
	@Column(name = "npc_s_color")
	private String npcsColor;
	
	@Column(name = "npc_r_color")
	private String npcrColor;
	
	@Column(name = "risk_review_color")
	private String riskReviewColor;
	
	@Column(name = "pdr_01_color")
	private String pdr01Color;
	
	@Column(name = "pdr_0_color")
	private String pdr0Color;
	
	@Column(name = "pdr_1_color")
	private String pdr1Color;
	
	@Column(name = "pdr_2_color")
	private String pdr2Color;
	
	@Column(name = "pdr_3_color")
	private String pdr3Color;
	
	@Column(name = "pdr_4_color")
	private String pdr4Color;
	
	@Column(name = "pdr_5_color")
	private String pdr5Color;
	
	@Column(name = "isr_color")
	private String isrColor;
	
	@Column(name = "psws_color")
	private String pswsColor;
	
	@Column(name = "pswa_color")
	private String pswaColor;
	
	@Column(name = "pdr_35_color")
	private String pdr35Color;
	
	@Column(name = "master_belt_color")
	private String masterBeltColor;
	
	@Column(name = "rb_sop_color")
	private String rbSopColor;
	
	@Column(name = "dispatch_from_plant_color")
	private String dispatchFromPlantColor;
	
	@Column(name = "arrival_at_customer_color")
	private String arrivalAtCustomerColor;
	
	@Column(name = "or_color")
	private String orColor;
	
	@Column(name = "vc_lot_color")
	private String vcLotColor;
	
	@Column(name = "ipp_notification_color")
	private String ippNotificationColor;
	
	@Column(name = "ipp_registration_color")
	private String ippRegistrationColor;
	
	@Column(name = "ipp_report_color")
	private String ippReportColor;
	
	@Column(name = "ipp_approval_color")
	private String ippApprovalColor;
	
	@Column(name = "inform_customer_color")
	private String informCustomerColor;
	
	@Column(name = "validation_requirements_color")
	private String validationRequirementsColor;
	
	@Column(name = "submit_validation_results_color")
	private String submitValidationResultsColor;
	
	@Column(name = "customer_approval_color")
	private String customerApprovalColor;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_of_change")
	private TypeOfChange change;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer")
	private Customer objCustomer;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit")
	private Unit unit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "etp_testing")
	private EtpTesting objEtpTesting;

	@OneToOne(mappedBy = "releases", fetch = FetchType.LAZY)
	private ProjectReview objProjectReview;

	@OneToOne(mappedBy = "releases", fetch = FetchType.LAZY)
	private StearingCommittee objStrearingCommittee;

	@OneToOne(mappedBy = "releases", fetch = FetchType.LAZY)
	private TestingCapacity objTestingCapacity;
	
	@OneToMany(mappedBy = "releases")
	private Set<Highlight> highlights = new HashSet<>(0);

	@OneToMany(mappedBy = "releases")
	private Set<RowFormatting> rowFormattings = new HashSet<>(0);

	@OneToMany(mappedBy = "releases")
	private Set<Portfolio> porfolios = new HashSet<>(0);
	
	@OneToMany(mappedBy = "releases")
	private Set<LessonsLearned> lessonsLearneds = new HashSet<>(0);
	
	@ManyToMany
	@JoinTable(name = "releases_locations", joinColumns = @JoinColumn(name = "releases_nr", referencedColumnName = "nr"), inverseJoinColumns = @JoinColumn(name = "location_id", referencedColumnName = "id"))
	private Set<Location> locations = new HashSet<>(0);

	@ManyToMany
	@JoinTable(name = "releases_priorities", joinColumns = @JoinColumn(name = "releases_nr", referencedColumnName = "nr"), inverseJoinColumns = @JoinColumn(name = "priority_id", referencedColumnName = "id"))
	private Set<Priority> priorities = new HashSet<>(0);

	@ManyToMany
	@JoinTable(name = "releases_customerPlants", joinColumns = @JoinColumn(name = "releases_nr", referencedColumnName = "nr"), inverseJoinColumns = @JoinColumn(name = "customer_plant_id", referencedColumnName = "id"))
	private Set<CustomerPlant> customerPlants = new HashSet<>(0);

	public Releases() {
	}

	public Releases(Long nr, Date lastUpdate, String status, String belt, String line, String descriptionChange,
			String aqcdt, String jatcoReleaseMeth, String pic, String counterPart, Date npcsInitial, Date npcsActual,
			Date npcsSubmission, String mqs, Date riskReviewInitial, Date riskReviewActual, Date riskReviewSubmission,
			Date pdr01Initial, Date pdr01Actual, Date pdr01Submission, Date pdr0Initial, Date pdr0Actual,
			Date pdr0Submission, Date pdr1Initial, Date pdr1Actual, Date pdr1Submission, Date pdr2Initial,
			Date pdr2Actual, Date pdr2Submission, Date pdr3Initial, Date pdr3Actual, Date pdr3Submission,
			Date pdr4Initial, Date pdr4Actual, Date pdr4Submission, Date pdr5Initial, Date pdr5Actual,
			Date pdr5Submission, Date npcrInitial, Date npcrActual, Date npcrSubmission, Date isrInitial,
			Date isrActual, Date isrSubmission, String sampleSubmission, Date pswsInitial, Date pswsActual,
			Date pswsSubmission, Date pdr35Initial, Date pdr35Actual, Date pdr35Submission, Date masterBeltInitial,
			Date masterBeltActual, Date masterBeltSubmission, Date pswaInitial, Date pswaActual, Date pswaSubmission,
			Date rbOrigSop, Date rbSopInitial, Date rbSopActual, Date rbSopSubmission, Date ckdDispatchDate,
			Date dispatchFromPlantInitial, Date dispatchFromPlantActual, Date dispatchFromPlantSubmission,
			Date arrivalAtCustomerInitial, Date arrivalAtCustomerActual, Date arrivalAtCustomerSubmission,
			Integer frozenPeriod, String trafficLight, Date qg1, Date qg2, Date qg3, Date qg4, Date qg5,
			String projectNr, Integer ecrStatus, String ecrNr, String customerInform, String notes, String unique,
			Date ippNotificationInitial, Date ippNotificationActual, Date ippNotificationSubmission,
			Date ippRegistrationInitial, Date ippRegistrationActual, Date ippRegistrationSubmission,
			Date ippReportInitial, Date ippReportActual, Date ippReportSubmission, Date ippApprovalInitial,
			Date ippApprovalActual, Date ippApprovalSubmission, Date informCustomerInitial, Date informCustomerActual,
			Date informCustomerSubmission, Date validationRequirementsInitial, Date validationRequirementsActual,
			Date validationRequirementsSubmission, Date submitValidationResultsInitial,
			Date submitValidationResultsActual, Date submitValidationResultsSubmission, Date customerApprovalInitial,
			Date customerApprovalActual, Date customerApprovalSubmission, Date orInitial, Date orActual,
			Date orSubmission, Date vcLotInitial, Date vcLotActual, Date vcLotSubmission, String npcsColor,
			String npcrColor, String riskReviewColor, String pdr01Color, String pdr0Color, String pdr1Color,
			String pdr2Color, String pdr3Color, String pdr4Color, String pdr5Color, String isrColor, String pswsColor,
			String pswaColor, String pdr35Color, String masterBeltColor, String rbSopColor,
			String dispatchFromPlantColor, String arrivalAtCustomerColor, String orColor, String vcLotColor,
			String ippNotificationColor, String ippRegistrationColor, String ippReportColor, String ippApprovalColor,
			String informCustomerColor, String validationRequirementsColor, String submitValidationResultsColor,
			String customerApprovalColor) {
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

	public Date getLastUpdate() {
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

	public Date getNpcsInitial() {
		return npcsInitial;
	}

	public Date getNpcsActual() {
		return npcsActual;
	}

	public Date getNpcsSubmission() {
		return npcsSubmission;
	}

	public String getMqs() {
		return mqs;
	}

	public Date getRiskReviewInitial() {
		return riskReviewInitial;
	}

	public Date getRiskReviewActual() {
		return riskReviewActual;
	}

	public Date getRiskReviewSubmission() {
		return riskReviewSubmission;
	}

	public Date getPdr01Initial() {
		return pdr01Initial;
	}

	public Date getPdr01Actual() {
		return pdr01Actual;
	}

	public Date getPdr01Submission() {
		return pdr01Submission;
	}

	public Date getPdr0Initial() {
		return pdr0Initial;
	}

	public Date getPdr0Actual() {
		return pdr0Actual;
	}

	public Date getPdr0Submission() {
		return pdr0Submission;
	}

	public Date getPdr1Initial() {
		return pdr1Initial;
	}

	public Date getPdr1Actual() {
		return pdr1Actual;
	}

	public Date getPdr1Submission() {
		return pdr1Submission;
	}

	public Date getPdr2Initial() {
		return pdr2Initial;
	}

	public Date getPdr2Actual() {
		return pdr2Actual;
	}

	public Date getPdr2Submission() {
		return pdr2Submission;
	}

	public Date getPdr3Initial() {
		return pdr3Initial;
	}

	public Date getPdr3Actual() {
		return pdr3Actual;
	}

	public Date getPdr3Submission() {
		return pdr3Submission;
	}

	public Date getPdr4Initial() {
		return pdr4Initial;
	}

	public Date getPdr4Actual() {
		return pdr4Actual;
	}

	public Date getPdr4Submission() {
		return pdr4Submission;
	}

	public Date getPdr5Initial() {
		return pdr5Initial;
	}

	public Date getPdr5Actual() {
		return pdr5Actual;
	}

	public Date getPdr5Submission() {
		return pdr5Submission;
	}

	public Date getNpcrInitial() {
		return npcrInitial;
	}

	public Date getNpcrActual() {
		return npcrActual;
	}

	public Date getNpcrSubmission() {
		return npcrSubmission;
	}

	public Date getIsrInitial() {
		return isrInitial;
	}

	public Date getIsrActual() {
		return isrActual;
	}

	public Date getIsrSubmission() {
		return isrSubmission;
	}

	public String getSampleSubmission() {
		return sampleSubmission;
	}

	public Date getPswsInitial() {
		return pswsInitial;
	}

	public Date getPswsActual() {
		return pswsActual;
	}

	public Date getPswsSubmission() {
		return pswsSubmission;
	}

	public Date getPdr35Initial() {
		return pdr35Initial;
	}

	public Date getPdr35Actual() {
		return pdr35Actual;
	}

	public Date getPdr35Submission() {
		return pdr35Submission;
	}

	public Date getMasterBeltInitial() {
		return masterBeltInitial;
	}

	public Date getMasterBeltActual() {
		return masterBeltActual;
	}

	public Date getMasterBeltSubmission() {
		return masterBeltSubmission;
	}

	public Date getPswaInitial() {
		return pswaInitial;
	}

	public Date getPswaActual() {
		return pswaActual;
	}

	public Date getPswaSubmission() {
		return pswaSubmission;
	}

	public Date getRbOrigSop() {
		return rbOrigSop;
	}

	public Date getRbSopInitial() {
		return rbSopInitial;
	}

	public Date getRbSopActual() {
		return rbSopActual;
	}

	public Date getRbSopSubmission() {
		return rbSopSubmission;
	}

	public Date getCkdDispatchDate() {
		return ckdDispatchDate;
	}

	public Date getDispatchFromPlantInitial() {
		return dispatchFromPlantInitial;
	}

	public Date getDispatchFromPlantActual() {
		return dispatchFromPlantActual;
	}

	public Date getDispatchFromPlantSubmission() {
		return dispatchFromPlantSubmission;
	}

	public Date getArrivalAtCustomerInitial() {
		return arrivalAtCustomerInitial;
	}

	public Date getArrivalAtCustomerActual() {
		return arrivalAtCustomerActual;
	}

	public Date getArrivalAtCustomerSubmission() {
		return arrivalAtCustomerSubmission;
	}

	public Integer getFrozenPeriod() {
		return frozenPeriod;
	}

	public String getTrafficLight() {
		return trafficLight;
	}

	public Date getQg1() {
		return qg1;
	}

	public Date getQg2() {
		return qg2;
	}

	public Date getQg3() {
		return qg3;
	}

	public Date getQg4() {
		return qg4;
	}

	public Date getQg5() {
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

	public String getProjectHighlight() {
		return projectHighlight;
	}

	public Date getPlannedStartTime() {
		return plannedStartTime;
	}

	public Date getPlannedSop() {
		return plannedSop;
	}

	public Date getPlannedIsr() {
		return plannedIsr;
	}

	public Date getIppNotificationInitial() {
		return ippNotificationInitial;
	}

	public Date getIppNotificationActual() {
		return ippNotificationActual;
	}

	public Date getIppNotificationSubmission() {
		return ippNotificationSubmission;
	}

	public Date getIppRegistrationInitial() {
		return ippRegistrationInitial;
	}

	public Date getIppRegistrationActual() {
		return ippRegistrationActual;
	}

	public Date getIppRegistrationSubmission() {
		return ippRegistrationSubmission;
	}

	public Date getIppReportInitial() {
		return ippReportInitial;
	}

	public Date getIppReportActual() {
		return ippReportActual;
	}

	public Date getIppReportSubmission() {
		return ippReportSubmission;
	}

	public Date getIppApprovalInitial() {
		return ippApprovalInitial;
	}

	public Date getIppApprovalActual() {
		return ippApprovalActual;
	}

	public Date getIppApprovalSubmission() {
		return ippApprovalSubmission;
	}

	public Date getInformCustomerInitial() {
		return informCustomerInitial;
	}

	public Date getInformCustomerActual() {
		return informCustomerActual;
	}

	public Date getInformCustomerSubmission() {
		return informCustomerSubmission;
	}

	public Date getValidationRequirementsInitial() {
		return validationRequirementsInitial;
	}

	public Date getValidationRequirementsActual() {
		return validationRequirementsActual;
	}

	public Date getValidationRequirementsSubmission() {
		return validationRequirementsSubmission;
	}

	public Date getSubmitValidationResultsInitial() {
		return submitValidationResultsInitial;
	}

	public Date getSubmitValidationResultsActual() {
		return submitValidationResultsActual;
	}

	public Date getSubmitValidationResultsSubmission() {
		return submitValidationResultsSubmission;
	}

	public Date getCustomerApprovalInitial() {
		return customerApprovalInitial;
	}

	public Date getCustomerApprovalActual() {
		return customerApprovalActual;
	}

	public Date getCustomerApprovalSubmission() {
		return customerApprovalSubmission;
	}

	public Date getOrInitial() {
		return orInitial;
	}

	public Date getOrActual() {
		return orActual;
	}

	public Date getOrSubmission() {
		return orSubmission;
	}

	public Date getVcLotInitial() {
		return vcLotInitial;
	}

	public Date getVcLotActual() {
		return vcLotActual;
	}

	public Date getVcLotSubmission() {
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

	public TypeOfChange getChange() {
		return change;
	}

	public Customer getObjCustomer() {
		return objCustomer;
	}

	public Unit getUnit() {
		return unit;
	}

	public User getUser() {
		return user;
	}

	public EtpTesting getObjEtpTesting() {
		return objEtpTesting;
	}

	public ProjectReview getObjProjectReview() {
		return objProjectReview;
	}

	public StearingCommittee getObjStrearingCommittee() {
		return objStrearingCommittee;
	}

	public TestingCapacity getObjTestingCapacity() {
		return objTestingCapacity;
	}

	public Set<Highlight> getHighlights() {
		return highlights;
	}

	public Set<RowFormatting> getRowFormattings() {
		return rowFormattings;
	}

	public Set<Portfolio> getPorfolios() {
		return porfolios;
	}

	public Set<LessonsLearned> getLessonsLearneds() {
		return lessonsLearneds;
	}

	public Set<Location> getLocations() {
		return locations;
	}

	public Set<Priority> getPriorities() {
		return priorities;
	}

	public Set<CustomerPlant> getCustomerPlants() {
		return customerPlants;
	}

	public void setNr(Long nr) {
		this.nr = nr;
	}

	public void setLastUpdate(Date lastUpdate) {
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

	public void setNpcsInitial(Date npcsInitial) {
		this.npcsInitial = npcsInitial;
	}

	public void setNpcsActual(Date npcsActual) {
		this.npcsActual = npcsActual;
	}

	public void setNpcsSubmission(Date npcsSubmission) {
		this.npcsSubmission = npcsSubmission;
	}

	public void setMqs(String mqs) {
		this.mqs = mqs;
	}

	public void setRiskReviewInitial(Date riskReviewInitial) {
		this.riskReviewInitial = riskReviewInitial;
	}

	public void setRiskReviewActual(Date riskReviewActual) {
		this.riskReviewActual = riskReviewActual;
	}

	public void setRiskReviewSubmission(Date riskReviewSubmission) {
		this.riskReviewSubmission = riskReviewSubmission;
	}

	public void setPdr01Initial(Date pdr01Initial) {
		this.pdr01Initial = pdr01Initial;
	}

	public void setPdr01Actual(Date pdr01Actual) {
		this.pdr01Actual = pdr01Actual;
	}

	public void setPdr01Submission(Date pdr01Submission) {
		this.pdr01Submission = pdr01Submission;
	}

	public void setPdr0Initial(Date pdr0Initial) {
		this.pdr0Initial = pdr0Initial;
	}

	public void setPdr0Actual(Date pdr0Actual) {
		this.pdr0Actual = pdr0Actual;
	}

	public void setPdr0Submission(Date pdr0Submission) {
		this.pdr0Submission = pdr0Submission;
	}

	public void setPdr1Initial(Date pdr1Initial) {
		this.pdr1Initial = pdr1Initial;
	}

	public void setPdr1Actual(Date pdr1Actual) {
		this.pdr1Actual = pdr1Actual;
	}

	public void setPdr1Submission(Date pdr1Submission) {
		this.pdr1Submission = pdr1Submission;
	}

	public void setPdr2Initial(Date pdr2Initial) {
		this.pdr2Initial = pdr2Initial;
	}

	public void setPdr2Actual(Date pdr2Actual) {
		this.pdr2Actual = pdr2Actual;
	}

	public void setPdr2Submission(Date pdr2Submission) {
		this.pdr2Submission = pdr2Submission;
	}

	public void setPdr3Initial(Date pdr3Initial) {
		this.pdr3Initial = pdr3Initial;
	}

	public void setPdr3Actual(Date pdr3Actual) {
		this.pdr3Actual = pdr3Actual;
	}

	public void setPdr3Submission(Date pdr3Submission) {
		this.pdr3Submission = pdr3Submission;
	}

	public void setPdr4Initial(Date pdr4Initial) {
		this.pdr4Initial = pdr4Initial;
	}

	public void setPdr4Actual(Date pdr4Actual) {
		this.pdr4Actual = pdr4Actual;
	}

	public void setPdr4Submission(Date pdr4Submission) {
		this.pdr4Submission = pdr4Submission;
	}

	public void setPdr5Initial(Date pdr5Initial) {
		this.pdr5Initial = pdr5Initial;
	}

	public void setPdr5Actual(Date pdr5Actual) {
		this.pdr5Actual = pdr5Actual;
	}

	public void setPdr5Submission(Date pdr5Submission) {
		this.pdr5Submission = pdr5Submission;
	}

	public void setNpcrInitial(Date npcrInitial) {
		this.npcrInitial = npcrInitial;
	}

	public void setNpcrActual(Date npcrActual) {
		this.npcrActual = npcrActual;
	}

	public void setNpcrSubmission(Date npcrSubmission) {
		this.npcrSubmission = npcrSubmission;
	}

	public void setIsrInitial(Date isrInitial) {
		this.isrInitial = isrInitial;
	}

	public void setIsrActual(Date isrActual) {
		this.isrActual = isrActual;
	}

	public void setIsrSubmission(Date isrSubmission) {
		this.isrSubmission = isrSubmission;
	}

	public void setSampleSubmission(String sampleSubmission) {
		this.sampleSubmission = sampleSubmission;
	}

	public void setPswsInitial(Date pswsInitial) {
		this.pswsInitial = pswsInitial;
	}

	public void setPswsActual(Date pswsActual) {
		this.pswsActual = pswsActual;
	}

	public void setPswsSubmission(Date pswsSubmission) {
		this.pswsSubmission = pswsSubmission;
	}

	public void setPdr35Initial(Date pdr35Initial) {
		this.pdr35Initial = pdr35Initial;
	}

	public void setPdr35Actual(Date pdr35Actual) {
		this.pdr35Actual = pdr35Actual;
	}

	public void setPdr35Submission(Date pdr35Submission) {
		this.pdr35Submission = pdr35Submission;
	}

	public void setMasterBeltInitial(Date masterBeltInitial) {
		this.masterBeltInitial = masterBeltInitial;
	}

	public void setMasterBeltActual(Date masterBeltActual) {
		this.masterBeltActual = masterBeltActual;
	}

	public void setMasterBeltSubmission(Date masterBeltSubmission) {
		this.masterBeltSubmission = masterBeltSubmission;
	}

	public void setPswaInitial(Date pswaInitial) {
		this.pswaInitial = pswaInitial;
	}

	public void setPswaActual(Date pswaActual) {
		this.pswaActual = pswaActual;
	}

	public void setPswaSubmission(Date pswaSubmission) {
		this.pswaSubmission = pswaSubmission;
	}

	public void setRbOrigSop(Date rbOrigSop) {
		this.rbOrigSop = rbOrigSop;
	}

	public void setRbSopInitial(Date rbSopInitial) {
		this.rbSopInitial = rbSopInitial;
	}

	public void setRbSopActual(Date rbSopActual) {
		this.rbSopActual = rbSopActual;
	}

	public void setRbSopSubmission(Date rbSopSubmission) {
		this.rbSopSubmission = rbSopSubmission;
	}

	public void setCkdDispatchDate(Date ckdDispatchDate) {
		this.ckdDispatchDate = ckdDispatchDate;
	}

	public void setDispatchFromPlantInitial(Date dispatchFromPlantInitial) {
		this.dispatchFromPlantInitial = dispatchFromPlantInitial;
	}

	public void setDispatchFromPlantActual(Date dispatchFromPlantActual) {
		this.dispatchFromPlantActual = dispatchFromPlantActual;
	}

	public void setDispatchFromPlantSubmission(Date dispatchFromPlantSubmission) {
		this.dispatchFromPlantSubmission = dispatchFromPlantSubmission;
	}

	public void setArrivalAtCustomerInitial(Date arrivalAtCustomerInitial) {
		this.arrivalAtCustomerInitial = arrivalAtCustomerInitial;
	}

	public void setArrivalAtCustomerActual(Date arrivalAtCustomerActual) {
		this.arrivalAtCustomerActual = arrivalAtCustomerActual;
	}

	public void setArrivalAtCustomerSubmission(Date arrivalAtCustomerSubmission) {
		this.arrivalAtCustomerSubmission = arrivalAtCustomerSubmission;
	}

	public void setFrozenPeriod(Integer frozenPeriod) {
		this.frozenPeriod = frozenPeriod;
	}

	public void setTrafficLight(String trafficLight) {
		this.trafficLight = trafficLight;
	}

	public void setQg1(Date qg1) {
		this.qg1 = qg1;
	}

	public void setQg2(Date qg2) {
		this.qg2 = qg2;
	}

	public void setQg3(Date qg3) {
		this.qg3 = qg3;
	}

	public void setQg4(Date qg4) {
		this.qg4 = qg4;
	}

	public void setQg5(Date qg5) {
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

	public void setProjectHighlight(String projectHighlight) {
		this.projectHighlight = projectHighlight;
	}

	public void setPlannedStartTime(Date plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}

	public void setPlannedSop(Date plannedSop) {
		this.plannedSop = plannedSop;
	}

	public void setPlannedIsr(Date plannedIsr) {
		this.plannedIsr = plannedIsr;
	}

	public void setIppNotificationInitial(Date ippNotificationInitial) {
		this.ippNotificationInitial = ippNotificationInitial;
	}

	public void setIppNotificationActual(Date ippNotificationActual) {
		this.ippNotificationActual = ippNotificationActual;
	}

	public void setIppNotificationSubmission(Date ippNotificationSubmission) {
		this.ippNotificationSubmission = ippNotificationSubmission;
	}

	public void setIppRegistrationInitial(Date ippRegistrationInitial) {
		this.ippRegistrationInitial = ippRegistrationInitial;
	}

	public void setIppRegistrationActual(Date ippRegistrationActual) {
		this.ippRegistrationActual = ippRegistrationActual;
	}

	public void setIppRegistrationSubmission(Date ippRegistrationSubmission) {
		this.ippRegistrationSubmission = ippRegistrationSubmission;
	}

	public void setIppReportInitial(Date ippReportInitial) {
		this.ippReportInitial = ippReportInitial;
	}

	public void setIppReportActual(Date ippReportActual) {
		this.ippReportActual = ippReportActual;
	}

	public void setIppReportSubmission(Date ippReportSubmission) {
		this.ippReportSubmission = ippReportSubmission;
	}

	public void setIppApprovalInitial(Date ippApprovalInitial) {
		this.ippApprovalInitial = ippApprovalInitial;
	}

	public void setIppApprovalActual(Date ippApprovalActual) {
		this.ippApprovalActual = ippApprovalActual;
	}

	public void setIppApprovalSubmission(Date ippApprovalSubmission) {
		this.ippApprovalSubmission = ippApprovalSubmission;
	}

	public void setInformCustomerInitial(Date informCustomerInitial) {
		this.informCustomerInitial = informCustomerInitial;
	}

	public void setInformCustomerActual(Date informCustomerActual) {
		this.informCustomerActual = informCustomerActual;
	}

	public void setInformCustomerSubmission(Date informCustomerSubmission) {
		this.informCustomerSubmission = informCustomerSubmission;
	}

	public void setValidationRequirementsInitial(Date validationRequirementsInitial) {
		this.validationRequirementsInitial = validationRequirementsInitial;
	}

	public void setValidationRequirementsActual(Date validationRequirementsActual) {
		this.validationRequirementsActual = validationRequirementsActual;
	}

	public void setValidationRequirementsSubmission(Date validationRequirementsSubmission) {
		this.validationRequirementsSubmission = validationRequirementsSubmission;
	}

	public void setSubmitValidationResultsInitial(Date submitValidationResultsInitial) {
		this.submitValidationResultsInitial = submitValidationResultsInitial;
	}

	public void setSubmitValidationResultsActual(Date submitValidationResultsActual) {
		this.submitValidationResultsActual = submitValidationResultsActual;
	}

	public void setSubmitValidationResultsSubmission(Date submitValidationResultsSubmission) {
		this.submitValidationResultsSubmission = submitValidationResultsSubmission;
	}

	public void setCustomerApprovalInitial(Date customerApprovalInitial) {
		this.customerApprovalInitial = customerApprovalInitial;
	}

	public void setCustomerApprovalActual(Date customerApprovalActual) {
		this.customerApprovalActual = customerApprovalActual;
	}

	public void setCustomerApprovalSubmission(Date customerApprovalSubmission) {
		this.customerApprovalSubmission = customerApprovalSubmission;
	}

	public void setOrInitial(Date orInitial) {
		this.orInitial = orInitial;
	}

	public void setOrActual(Date orActual) {
		this.orActual = orActual;
	}

	public void setOrSubmission(Date orSubmission) {
		this.orSubmission = orSubmission;
	}

	public void setVcLotInitial(Date vcLotInitial) {
		this.vcLotInitial = vcLotInitial;
	}

	public void setVcLotActual(Date vcLotActual) {
		this.vcLotActual = vcLotActual;
	}

	public void setVcLotSubmission(Date vcLotSubmission) {
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

	public void setChange(TypeOfChange change) {
		this.change = change;
	}

	public void setObjCustomer(Customer objCustomer) {
		this.objCustomer = objCustomer;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setObjEtpTesting(EtpTesting objEtpTesting) {
		this.objEtpTesting = objEtpTesting;
	}

	public void setObjProjectReview(ProjectReview objProjectReview) {
		this.objProjectReview = objProjectReview;
	}

	public void setObjStrearingCommittee(StearingCommittee objStrearingCommittee) {
		this.objStrearingCommittee = objStrearingCommittee;
	}

	public void setObjTestingCapacity(TestingCapacity objTestingCapacity) {
		this.objTestingCapacity = objTestingCapacity;
	}

	public void setHighlights(Set<Highlight> highlights) {
		this.highlights = highlights;
	}

	public void setRowFormattings(Set<RowFormatting> rowFormattings) {
		this.rowFormattings = rowFormattings;
	}

	public void setPorfolios(Set<Portfolio> porfolios) {
		this.porfolios = porfolios;
	}

	public void setLessonsLearneds(Set<LessonsLearned> lessonsLearneds) {
		this.lessonsLearneds = lessonsLearneds;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	public void setPriorities(Set<Priority> priorities) {
		this.priorities = priorities;
	}

	public void setCustomerPlants(Set<CustomerPlant> customerPlants) {
		this.customerPlants = customerPlants;
	}
		
}
