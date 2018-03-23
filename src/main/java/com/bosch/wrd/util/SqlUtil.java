package com.bosch.wrd.util;

import java.util.ArrayList;
import java.util.List;

public class SqlUtil {

	public static String createCustomer(String date) {
		return "CREATE TABLE customer_" + date + "(id varchar(255) not null, name varchar(255), PRIMARY KEY (id))";
	}
	
	public static String createCustomerPlant(String date) {
		return "CREATE TABLE customer_plant_" + date + "(id varchar(255) not null, description varchar(255), PRIMARY KEY (id))";
	}
	
	public static String createEtptesting(String date) {
		return "CREATE TABLE etptesting_" + date + "(id varchar(255) not null, value varchar(255), PRIMARY KEY (id))";
	}
	
	public static String createPriority(String date) {
		return "CREATE TABLE priority_" + date + "(id varchar(255) not null, name varchar(255), PRIMARY KEY (id))";
	}
	
	public static String createLocation(String date) {
		return "CREATE TABLE location_" + date + "(id varchar(255) not null, name varchar(255), PRIMARY KEY (id))";
	}
	
	public static String createPermission(String date) {
		return "CREATE TABLE permission_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"  aqcdt bit(1) DEFAULT NULL," + 
				"  arrival_at_customer bit(1) DEFAULT NULL," + 
				"  belt bit(1) DEFAULT NULL," + 
				"  ckd_dispatch_date bit(1) DEFAULT NULL," + 
				"  counter_part bit(1) DEFAULT NULL," + 
				"  customer bit(1) DEFAULT NULL," + 
				"  customer_inform bit(1) DEFAULT NULL," + 
				"  customer_plant bit(1) DEFAULT NULL," + 
				"  description_change bit(1) DEFAULT NULL," + 
				"  dispatch_from_bosch_plant bit(1) DEFAULT NULL," + 
				"  ecr_status bit(1) DEFAULT NULL," + 
				"  etp_test bit(1) DEFAULT NULL," + 
				"  frozen_period bit(1) DEFAULT NULL," + 
				"  isr bit(1) DEFAULT NULL," + 
				"  jatco_release_meth bit(1) DEFAULT NULL," + 
				"  last_update bit(1) DEFAULT NULL," + 
				"  line bit(1) DEFAULT NULL," + 
				"  location bit(1) DEFAULT NULL," + 
				"  master_belt_delivery bit(1) DEFAULT NULL," + 
				"  mqs bit(1) DEFAULT NULL," + 
				"  name bit(1) DEFAULT NULL," + 
				"  notes bit(1) DEFAULT NULL," + 
				"  npc_r bit(1) DEFAULT NULL," + 
				"  npc_r_old bit(1) DEFAULT NULL," + 
				"  npc_s bit(1) DEFAULT NULL," + 
				"  npc_s_old bit(1) DEFAULT NULL," + 
				"  nr bit(1) DEFAULT NULL," + 
				"  p_dr01 bit(1) DEFAULT NULL," + 
				"  p_dr01_old bit(1) DEFAULT NULL," + 
				"  p_dr2 bit(1) DEFAULT NULL," + 
				"  p_dr2_old bit(1) DEFAULT NULL," + 
				"  p_dr_3_5 bit(1) DEFAULT NULL," + 
				"  pic bit(1) DEFAULT NULL," + 
				"  priority bit(1) DEFAULT NULL," + 
				"  project_nr bit(1) DEFAULT NULL," + 
				"  psw_approval bit(1) DEFAULT NULL," + 
				"  psw_submit bit(1) DEFAULT NULL," + 
				"  psw_submit_old bit(1) DEFAULT NULL," + 
				"  psw_approval_old bit(1) DEFAULT NULL," + 
				"  qg1 bit(1) DEFAULT NULL," + 
				"  qg2 bit(1) DEFAULT NULL," + 
				"  qg3 bit(1) DEFAULT NULL," + 
				"  qg4 bit(1) DEFAULT NULL," + 
				"  qg5 bit(1) DEFAULT NULL," + 
				"  rb_orig_sop bit(1) DEFAULT NULL," + 
				"  rb_sop bit(1) DEFAULT NULL," + 
				"  risk_review bit(1) DEFAULT NULL," + 
				"  quality_resp bit(1) DEFAULT NULL," + 
				"  status bit(1) DEFAULT NULL," + 
				"  traffic_light bit(1) DEFAULT NULL," + 
				"  type_of_change bit(1) DEFAULT NULL," + 
				"  uniqu bit(1) DEFAULT NULL," + 
				"  unit bit(1) DEFAULT NULL," + 
				"  PRIMARY KEY (id))";
	}
	
	public static String createRole(String date) {
		return "CREATE TABLE role_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT, code varchar(255) DEFAULT NULL, label varchar(255) DEFAULT NULL, PRIMARY KEY (id))";
	}
	
	public static String createRolePermission(String date) {
		return "CREATE TABLE roles_permissions_" + date + "(role_id bigint(20) NOT NULL," + 
				"permission_id bigint(20) NOT NULL," + 
				"PRIMARY KEY (role_id,permission_id))";
	}
	
	public static String createTypeOfChange(String date) {
		return "CREATE TABLE type_of_change_" + date + "(id varchar(255) NOT NULL," + 
				"name varchar(255) DEFAULT NULL," + 
				"PRIMARY KEY (id))";
	}
	
	public static String createUnit(String date) {
		return "CREATE TABLE unit_" + date + "(id varchar(255) NOT NULL," + 
				"description varchar(255) DEFAULT NULL," + 
				"PRIMARY KEY (id))";
	}
	
	public static String createUser(String date) {
		return "CREATE TABLE user_" + date + "(id varchar(255) NOT NULL," + 
				"date_created datetime DEFAULT NULL," + 
				"credentials_expired_date datetime DEFAULT NULL," + 
				"email varchar(255) DEFAULT NULL," + 
				"enabled bit(1) DEFAULT NULL," + 
				"name varchar(255) DEFAULT NULL," + 
				"password varchar(255) DEFAULT NULL," + 
				"PRIMARY KEY (id))";
	}
	
	public static String createUserRole(String date) {
		return "CREATE TABLE users_roles_" + date + "(user_id varchar(255) NOT NULL," + 
				"role_id bigint(20) NOT NULL," + 
				"PRIMARY KEY (user_id,role_id))"; 
	}
	
	public static String createReleases(String date) {
		return "CREATE TABLE releases_" + date + "(nr bigint(20) NOT NULL AUTO_INCREMENT," + 
				"aqcdt varchar(255) DEFAULT NULL," + 
				"arrival_at_customer_actual datetime DEFAULT NULL," + 
				"arrival_at_customer_initial datetime DEFAULT NULL," + 
				"arrival_at_customer_submission datetime DEFAULT NULL," + 
				"belt varchar(255) DEFAULT NULL," + 
				"ckd_dispatch_date datetime DEFAULT NULL," + 
				"counter_part varchar(255) DEFAULT NULL," + 
				"customer_approval_actual datetime DEFAULT NULL," + 
				"customer_approval_initial datetime DEFAULT NULL," + 
				"customer_approval_submission datetime DEFAULT NULL," + 
				"customer_inform varchar(255) DEFAULT NULL," + 
				"description_change varchar(255) DEFAULT NULL," + 
				"dispatch_from_plant_actual datetime DEFAULT NULL," + 
				"dispatch_from_plant_initial datetime DEFAULT NULL," + 
				"dispatch_from_plant_submission datetime DEFAULT NULL," + 
				"ecr_nr int(11) DEFAULT NULL," + 
				"ecr_status int(11) DEFAULT NULL," + 
				"frozen_period int(11) DEFAULT NULL," + 
				"inform_customer_actual datetime DEFAULT NULL," + 
				"inform_customer_initial datetime DEFAULT NULL," + 
				"inform_customer_submission datetime DEFAULT NULL," + 
				"ipp_approval_actual datetime DEFAULT NULL," + 
				"ipp_approval_initial datetime DEFAULT NULL," + 
				"ipp_approval_submission datetime DEFAULT NULL," + 
				"ipp_notification_actual datetime DEFAULT NULL," + 
				"ipp_notification_initial datetime DEFAULT NULL," + 
				"ipp_notification_submission datetime DEFAULT NULL," + 
				"ipp_registration_actual datetime DEFAULT NULL," + 
				"ipp_registration_initial datetime DEFAULT NULL," + 
				"ipp_registration_submission datetime DEFAULT NULL," + 
				"ipp_report_actual datetime DEFAULT NULL," + 
				"ipp_report_initial datetime DEFAULT NULL," + 
				"ipp_report_submission datetime DEFAULT NULL," + 
				"isr_actual datetime DEFAULT NULL," + 
				"isr_initial datetime DEFAULT NULL," + 
				"isr_submission datetime DEFAULT NULL," + 
				"jatco_release_meth varchar(255) DEFAULT NULL," + 
				"last_update datetime DEFAULT NULL," + 
				"line varchar(255) DEFAULT NULL," + 
				"master_belt_actual datetime DEFAULT NULL," + 
				"master_belt_initial datetime DEFAULT NULL," + 
				"master_belt_submission datetime DEFAULT NULL," + 
				"mqs varchar(255) DEFAULT NULL," + 
				"notes varchar(255) DEFAULT NULL," + 
				"npc_r_actual datetime DEFAULT NULL," + 
				"npc_r_initial datetime DEFAULT NULL," + 
				"npc_r_submission datetime DEFAULT NULL," + 
				"npc_s_actual datetime DEFAULT NULL," + 
				"npc_s_initial datetime DEFAULT NULL," + 
				"npc_s_submission datetime DEFAULT NULL," + 
				"or_actual datetime DEFAULT NULL," + 
				"or_initial datetime DEFAULT NULL," + 
				"or_submission datetime DEFAULT NULL," + 
				"p_dr01_actual datetime DEFAULT NULL," + 
				"p_dr01_initial datetime DEFAULT NULL," + 
				"p_dr01_submission datetime DEFAULT NULL," + 
				"p_dr0_actual datetime DEFAULT NULL," + 
				"p_dr0_initial datetime DEFAULT NULL," + 
				"p_dr0_submission datetime DEFAULT NULL," + 
				"p_dr1_actual datetime DEFAULT NULL," + 
				"p_dr1_initial datetime DEFAULT NULL," + 
				"p_dr1_submission datetime DEFAULT NULL," + 
				"p_dr2_actual datetime DEFAULT NULL," + 
				"p_dr2_initial datetime DEFAULT NULL," + 
				"p_dr2_submission datetime DEFAULT NULL," + 
				"p_dr_3_5_actual datetime DEFAULT NULL," + 
				"p_dr_3_5_initial datetime DEFAULT NULL," + 
				"p_dr_3_5_submission datetime DEFAULT NULL," + 
				"p_dr3_actual datetime DEFAULT NULL," + 
				"p_dr3_initial datetime DEFAULT NULL," + 
				"p_dr3_submission datetime DEFAULT NULL," + 
				"p_dr4_actual datetime DEFAULT NULL," + 
				"p_dr4_initial datetime DEFAULT NULL," + 
				"p_dr4_submission datetime DEFAULT NULL," + 
				"p_dr5_actual datetime DEFAULT NULL," + 
				"p_dr5_initial datetime DEFAULT NULL," + 
				"p_dr5_submission datetime DEFAULT NULL," + 
				"pic varchar(255) DEFAULT NULL," + 
				"planned_isr datetime DEFAULT NULL," + 
				"planned_sop datetime DEFAULT NULL," + 
				"planned_start_time datetime DEFAULT NULL," + 
				"project_highlight varchar(255) DEFAULT NULL," + 
				"project_nr varchar(255) DEFAULT NULL," + 
				"psw_a_actual datetime DEFAULT NULL," + 
				"psw_a_initial datetime DEFAULT NULL," + 
				"psw_a_submission datetime DEFAULT NULL," + 
				"psw_s_actual datetime DEFAULT NULL," + 
				"psw_s_initial datetime DEFAULT NULL," + 
				"psw_s_submission datetime DEFAULT NULL," + 
				"qg1 datetime DEFAULT NULL," + 
				"qg2 datetime DEFAULT NULL," + 
				"qg3 datetime DEFAULT NULL," + 
				"qg4 datetime DEFAULT NULL," + 
				"qg5 datetime DEFAULT NULL," + 
				"rb_orig_sop datetime DEFAULT NULL," + 
				"rb_sop_actual datetime DEFAULT NULL," + 
				"rb_sop_initial datetime DEFAULT NULL," + 
				"rb_sop_submission datetime DEFAULT NULL," + 
				"risk_review_actual datetime DEFAULT NULL," + 
				"risk_review_initial datetime DEFAULT NULL," + 
				"risk_review_submission datetime DEFAULT NULL," + 
				"quality_resp varchar(255) DEFAULT NULL," + 
				"status varchar(255) DEFAULT NULL," + 
				"submit_validation_results_actual datetime DEFAULT NULL," + 
				"submit_validation_results_initial datetime DEFAULT NULL," + 
				"submit_validation_results_submission datetime DEFAULT NULL," + 
				"traffic_light varchar(255) DEFAULT NULL," + 
				"uniqu varchar(255) DEFAULT NULL," + 
				"validation_requirements_actual datetime DEFAULT NULL," + 
				"validation_requirements_initial datetime DEFAULT NULL," + 
				"validation_requirements_submission datetime DEFAULT NULL," + 
				"vc_lot_actual datetime DEFAULT NULL," + 
				"vc_lot_initial datetime DEFAULT NULL," + 
				"vc_lot_submission datetime DEFAULT NULL," + 
				"type_of_change varchar(255) DEFAULT NULL," + 
				"customer varchar(255) DEFAULT NULL," + 
				"etp_testing varchar(255) DEFAULT NULL," + 
				"unit varchar(255) DEFAULT NULL," + 
				"user_id varchar(255) DEFAULT NULL," + 
				"PRIMARY KEY (nr))";
	}
	
	public static String createHidhlight(String date) {
		return "CREATE TABLE highlight_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"color varchar(255) DEFAULT NULL," + 
				"column_name varchar(255) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createLessonsLearned(String date) { 
		return "CREATE TABLE lessons_learned_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"action_for_el_7 varchar(255) DEFAULT NULL," + 
				"category varchar(255) DEFAULT NULL," + 
				"lesson_learned varchar(255) DEFAULT NULL," + 
				"problem_description varchar(255) DEFAULT NULL," + 
				"root_cause varchar(255) DEFAULT NULL," + 
				"transferable bit(1) DEFAULT NULL," + 
				"who_should_get_inform varchar(255) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createPortfolio(String date) {
		return "CREATE TABLE portfolio_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"hcp_pjm_coordinator varchar(255) DEFAULT NULL," + 
				"last_quality_gate varchar(255) DEFAULT NULL," + 
				"pgl bit(1) DEFAULT NULL," + 
				"pia varchar(255) DEFAULT NULL," + 
				"process_audit varchar(255) DEFAULT NULL," + 
				"project_owner varchar(255) DEFAULT NULL," + 
				"remark_for_closed_project varchar(255) DEFAULT NULL," + 
				"scope_short_desc varchar(255) DEFAULT NULL," + 
				"tbp_slpppjm varchar(255) DEFAULT NULL," +
				"type_of_change varchar(255) DEFAULT NULL," +
				"alelll varchar(255) DEFAULT NULL," + 
				"version datetime DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createProjectReview(String date) {
		return "CREATE TABLE project_review_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"activities_planned varchar(255) DEFAULT NULL," + 
				"coordinator varchar(255) DEFAULT NULL," + 
				"current_highlights varchar(255) DEFAULT NULL," + 
				"date_created datetime DEFAULT NULL," + 
				"date_created_light varchar(255) DEFAULT NULL," + 
				"date_updated datetime DEFAULT NULL," + 
				"date_updated_light varchar(255) DEFAULT NULL," + 
				"mitigation varchar(255) DEFAULT NULL," + 
				"risks_issues varchar(255) DEFAULT NULL," + 
				"status varchar(255) DEFAULT NULL," + 
				"title varchar(255) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createReleasesCustomerPlants(String date) {
		return "CREATE TABLE releases_customerPlants_" + date + "(releases_nr bigint(20) NOT NULL," + 
				"customer_plant_id varchar(255) NOT NULL," + 
				"PRIMARY KEY (releases_nr,customer_plant_id))"; 
	}
	
	public static String createReleasesPriorities(String date) {
		return "CREATE TABLE releases_priorities_" + date + "(releases_nr bigint(20) NOT NULL," + 
				"priority_id varchar(255) NOT NULL," + 
				"PRIMARY KEY (releases_nr,priority_id))"; 
	}
	
	public static String createReleasesLocations(String date) {
		return "CREATE TABLE releases_locations_" + date + "(releases_nr bigint(20) NOT NULL," + 
				"location_id varchar(255) NOT NULL," + 
				"PRIMARY KEY (releases_nr,location_id))"; 
	}
	
	public static String createRowFormatting(String date) {
		return "CREATE TABLE row_formatting_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"font_index int(11) DEFAULT NULL," + 
				"run_len int(11) DEFAULT NULL," + 
				"run_pos int(11) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createStearingCommittee(String date) {
		return "CREATE TABLE stearing_committee_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"kpi_b varchar(255) DEFAULT NULL," + 
				"kpi_s varchar(255) DEFAULT NULL," + 
				"kpi_t varchar(255) DEFAULT NULL," + 
				"pjm varchar(255) DEFAULT NULL," + 
				"project_highlight_issue varchar(255) DEFAULT NULL," + 
				"project_highlight_reason varchar(255) DEFAULT NULL," + 
				"qg_actual_0 datetime DEFAULT NULL," + 
				"qg_actual_1 datetime DEFAULT NULL," + 
				"qg_actual_2 datetime DEFAULT NULL," + 
				"qg_actual_3 datetime DEFAULT NULL," + 
				"qg_actual_4 datetime DEFAULT NULL," + 
				"qg_actual_5 datetime DEFAULT NULL," + 
				"report_date datetime DEFAULT NULL," + 
				"risk_corrective_action varchar(255) DEFAULT NULL," + 
				"risk_due datetime DEFAULT NULL," + 
				"risk_rating varchar(255) DEFAULT NULL," + 
				"risk_then varchar(255) DEFAULT NULL," + 
				"risk_if varchar(255) DEFAULT NULL," + 
				"title varchar(255) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))"; 
	}
	
	public static String createTestingCapacity(String date) {
		return "CREATE TABLE testing_capacity_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"hcp_pjm varchar(255) DEFAULT NULL," + 
				"kick_off bit(1) DEFAULT NULL," + 
				"tbp_pjm varchar(255) DEFAULT NULL," + 
				"test_location varchar(255) DEFAULT NULL," + 
				"releases_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))";
	}
	
	public static String createTestingCapacityDetail(String date) {
		return "CREATE TABLE testing_capacity_detail_" + date + "(id bigint(20) NOT NULL AUTO_INCREMENT," + 
				"date_of_notes datetime DEFAULT NULL," + 
				"notes varchar(255) DEFAULT NULL," + 
				"testing_capacity_id bigint(20) DEFAULT NULL," + 
				"PRIMARY KEY (id))";
	}
	
	public static List<String> createForeignKeys(String date) {
		List<String> alters = new ArrayList<String>();
		alters.add("ALTER TABLE ROLES_PERMISSIONS_" + date +  
				   " ADD CONSTRAINT FK_ROLE_ID_" + date + " FOREIGN KEY (ROLE_ID) REFERENCES ROLE_" + date + " (ID) ");
		alters.add("ALTER TABLE ROLES_PERMISSIONS_" + date +
				" ADD CONSTRAINT FK_PERMISSION_ID_" + date + " FOREIGN KEY (PERMISSION_ID) REFERENCES PERMISSION_" + date + " (ID)");
		
		alters.add("ALTER TABLE users_roles_" + date + 
				" ADD CONSTRAINT FK_users_id_" + date + " FOREIGN KEY (user_id) REFERENCES user_" + date + " (id) ");
		alters.add("ALTER TABLE users_roles_" + date + 
				" ADD CONSTRAINT FK_roles_id_" + date + " FOREIGN KEY (role_id) REFERENCES role_" + date + " (id) ");
		
		alters.add("ALTER TABLE releases_" + date + 
				" ADD CONSTRAINT FK_type_of_change_" + date + " FOREIGN KEY (type_of_change) REFERENCES type_of_change_" + date + " (id) ");
		alters.add("ALTER TABLE releases_" + date + 
				" ADD CONSTRAINT FK_user_" + date + " FOREIGN KEY (user_id) REFERENCES user_" + date + " (id) ");
		alters.add("ALTER TABLE releases_" + date + 
				" ADD CONSTRAINT FK_customer_" + date + " FOREIGN KEY (customer) REFERENCES customer_" + date + " (id) ");
		alters.add("ALTER TABLE releases_" + date + 
				" ADD CONSTRAINT FK_unit_" + date + " FOREIGN KEY (unit) REFERENCES unit_" + date + " (id) ");
		alters.add("ALTER TABLE releases_" + date + 
				" ADD CONSTRAINT FK_etp_testing_" + date + " FOREIGN KEY (etp_testing) REFERENCES etptesting_" + date + " (id) ");
		
		alters.add("ALTER TABLE highlight_" + date + 
				" ADD CONSTRAINT FK_releases_highlight_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE lessons_learned_" + date + 
				" ADD CONSTRAINT FK_releases_lessons_learned_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE portfolio_" + date + 
				" ADD CONSTRAINT FK_releases_portfolio_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE project_review_" + date + 
				" ADD CONSTRAINT FK_releases_project_review_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE releases_customerPlants_" + date + 
				" ADD CONSTRAINT FK_releases_customerPlants_nr_" + date + " FOREIGN KEY (releases_nr) REFERENCES releases_" + date + " (nr) ");
		alters.add("ALTER TABLE releases_customerPlants_" + date + 
				" ADD CONSTRAINT FK_customer_plant_id_" + date + " FOREIGN KEY (customer_plant_id) REFERENCES customer_plant_" + date + " (id) ");
		
		alters.add("ALTER TABLE releases_priorities_" + date + 
				" ADD CONSTRAINT FK_releases_priorities_nr_" + date + " FOREIGN KEY (releases_nr) REFERENCES releases_" + date + " (nr) ");
		alters.add("ALTER TABLE releases_priorities_" + date + 
				" ADD CONSTRAINT FK_priority_id_" + date + " FOREIGN KEY (priority_id) REFERENCES priority_" + date + " (id) ");
		
		alters.add("ALTER TABLE releases_locations_" + date + 
				" ADD CONSTRAINT FK_releases_locations_nr_" + date + " FOREIGN KEY (releases_nr) REFERENCES releases_" + date + " (nr) ");
		alters.add("ALTER TABLE releases_locations_" + date + 
				" ADD CONSTRAINT FK_location_id_" + date + " FOREIGN KEY (location_id) REFERENCES location_" + date + " (id) ");
		
		alters.add("ALTER TABLE row_formatting_" + date + 
				" ADD CONSTRAINT FK_row_formatting_id_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE stearing_committee_" + date + 
				" ADD CONSTRAINT FK_stearing_committee_id_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE testing_capacity_" + date + 
				" ADD CONSTRAINT FK_testing_capacity_id_" + date + " FOREIGN KEY (releases_id) REFERENCES releases_" + date + " (nr) ");
		
		alters.add("ALTER TABLE testing_capacity_detail_" + date + 
				" ADD CONSTRAINT FK_testing_capacity_detail_id_" + date + " FOREIGN KEY (testing_capacity_id) REFERENCES testing_capacity_" + date + " (id) ");
		
		return alters;
	}
	
	public static String insertCustomer(String date) {
		return "INSERT INTO customer_" + date + "(id, name) values (?, ?)";
	}
	
	public static String insertCustomerPlant(String date) {
		return "INSERT INTO customer_plant_" + date + "(id, description) values (?, ?)";
	}
	
	public static String insertEtpTesting(String date) {
		return "INSERT INTO etptesting_" + date + "(id, value) values (?, ?)";
	}
	
	public static String insertPriority(String date) {
		return "INSERT INTO priority_" + date + "(id, name) values (?, ?)";
	}
	
	public static String insertLocation(String date) {
		return "INSERT INTO location_" + date + "(id, name) values (?, ?)";
	}
	
	public static String insertPermission(String date) {
		return "INSERT INTO permission_" + date + "(id, aqcdt, arrival_at_customer_actual, arrival_at_customer_initial, arrival_at_customer_submission, "
				+ "belt, ckd_dispatch_date, counter_part, customer, customer_approval_actual, customer_approval_initial, customer_approval_submission, "
				+ "customer_inform, customer_plant, description_change, dispatch_from_plant_actual, dispatch_from_plant_initial, dispatch_from_plant_submission, "
				+ "ecr_number, etp_test, frozen_period, inform_customer_actual, inform_customer_initial, inform_customer_submission, ipp_approval_actual, "
				+ "ipp_approval_initial, ipp_approval_submission, ipp_notification_actual, ipp_notification_initial, ipp_notification_submission, ipp_registration_actual, "
				+ "ipp_registration_initial, ipp_registration_submission, ipp_report_actual, ipp_report_initial, ipp_report_submission, isr_actual, isr_initial, "
				+ "isr_submission, jatco_release_meth, last_update, line, location, master_belt_actual, master_belt_initial, master_belt_submission, mqs, name, "
				+ "notes, npc_r_actual, npc_r_initial, npc_r_submission, npc_s_actual, npc_s_initial, npc_s_submission, nr, or_actual, or_initial, or_submission, "
				+ "p_dr01_actual, p_dr01_initial, p_dr01_submission, p_dr0_actual, p_dr0_initial, p_dr0_submission, p_dr1_actual, p_dr1_initial, p_dr1_submission, "
				+ "p_dr2_actual, p_dr2_initial, p_dr2_submission, p_dr_3_5_actual, p_dr_3_5_initial, p_dr_3_5_submission, p_dr3_actual, p_dr3_initial, p_dr3_submission, "
				+ "p_dr4_actual, p_dr4_initial, p_dr4_submission, p_dr5_actual, p_dr5_initial, p_dr5_submission, pic, priority, project_nr, psw_a_actual, psw_a_initial, "
				+ "psw_a_submission, psw_s_actual, psw_s_initial, psw_s_submission, qg1, qg2, qg3, qg4, qg5, rb_orig_sop, rb_sop_actual, rb_sop_initial, rb_sop_submission, "
				+ "risk_review_actual, risk_review_initial, risk_review_submission, quality_resp, status, submit_validation_results_actual, submit_validation_results_initial, "
				+ "submit_validation_results_submission, traffic_light, type_of_change, uniqu, unit, validation_requirements_actual, validation_requirements_initial, "
				+ "validation_requirements_submission, vc_lot_actual, vc_lot_initial, vc_lot_submission ) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,? , ?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  )";
	}
	
	public static String insertRole(String date) {
		return "INSERT INTO role_" + date + "(id, code, label) values (?, ?, ?)";
	}
	
	public static String insertRolesPermissions(String date) {
		return "INSERT INTO roles_permissions_" + date + "(role_id, permission_id) values (?, ?)";
	}
	
	public static String insertTypeOfChange(String date) {
		return "INSERT INTO type_of_change_" + date + "(id, name) values (?, ?)";
	}
	
	public static String insertUnit(String date) {
		return "INSERT INTO unit_" + date + "(id, description) values (?, ?)";
	}
	
	public static String insertUser(String date) {
		return "INSERT INTO user_" + date + "(id, date_created, credentials_expired_date, email, enabled, name, password) values (?, ?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertUsersRoles(String date) {
		return "INSERT INTO users_roles_" + date + "(user_id, role_id) values (?, ?)";
	}
	
	public static String insertReleases(String date) {
		return "INSERT INTO releases_" + date + "(nr, aqcdt, arrival_at_customer_actual, arrival_at_customer_color, arrival_at_customer_initial, arrival_at_customer_submission, "
				+ "belt, ckd_dispatch_date, counter_part, customer_approval_actual, customer_approval_color, customer_approval_initial, customer_approval_submission, "
				+ "customer_inform, description_change, dispatch_from_plant_actual, dispatch_from_plant_color, dispatch_from_plant_initial, dispatch_from_plant_submission, "
				+ "ecr_nr, ecr_status, frozen_period, inform_customer_actual, inform_customer_color, inform_customer_initial, inform_customer_submission, ipp_approval_actual, "
				+ "ipp_approval_color, ipp_approval_initial, ipp_approval_submission, ipp_notification_actual, ipp_notification_color, ipp_notification_initial, ipp_notification_submission, "
				+ "ipp_registration_actual, ipp_registration_color, ipp_registration_initial, ipp_registration_submission, ipp_report_actual, ipp_report_color, ipp_report_initial, "
				+ "ipp_report_submission, isr_actual, isr_color, isr_initial, isr_submission, jatco_release_meth, last_update, line, master_belt_actual, master_belt_color, "
				+ "master_belt_initial, master_belt_submission, mqs, notes, npc_r_actual, npc_r_color, npc_r_initial, npc_r_submission, npc_s_actual, npc_s_color, npc_s_initial, "
				+ "npc_s_submission, or_actual, or_color, or_initial, or_submission, p_dr01_actual, pdr_01_color, p_dr01_initial, p_dr01_submission, p_dr0_actual, pdr_0_color, "
				+ "p_dr0_initial, p_dr0_submission, p_dr1_actual, pdr_1_color, p_dr1_initial, p_dr1_submission, p_dr2_actual, pdr_2_color, p_dr2_initial, p_dr2_submission, "
				+ "p_dr_3_5_actual, pdr_35_color, p_dr_3_5_initial, p_dr_3_5_submission, p_dr3_actual, pdr_3_color, p_dr3_initial, p_dr3_submission, p_dr4_actual, pdr_4_color, "
				+ "p_dr4_initial, p_dr4_submission, p_dr5_actual, pdr_5_color, p_dr5_initial, p_dr5_submission, pic, planned_isr, planned_sop, planned_start_time, project_highlight, "
				+ "project_nr, psw_a_actual, pswa_color, psw_a_initial, psw_a_submission, psw_s_actual, psws_color, psw_s_initial, psw_s_submission, qg1, qg2, qg3, qg4, qg5, "
				+ "rb_orig_sop, rb_sop_actual, rb_sop_color, rb_sop_initial, rb_sop_submission, risk_review_actual, risk_review_color, risk_review_initial, risk_review_submission, "
				+ "quality_resp, status, submit_validation_results_actual, submit_validation_results_color, submit_validation_results_initial, submit_validation_results_submission, "
				+ "traffic_light, uniqu, validation_requirements_actual, validation_requirements_color, validation_requirements_initial, validation_requirements_submission, "
				+ "vc_lot_actual, vc_lot_color, vc_lot_initial, vc_lot_submission, type_of_change, customer, etp_testing, unit, user_id) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ? ,? ,? , ?, ?, ?, ?, ?, ?, "
				+ "? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,  )";
	}
	
	public static String insertHighLight(String date) {
		return "INSERT INTO highlight_" + date + "(id, color, column_name, releases_id) values (?, ?, ?, ?)";
	}
	
	public static String insertLessonsLearned(String date) {
		return "INSERT INTO lessons_learned_" + date + "(id, action_for_el_7, category, lesson_learned, problem_description, root_cause, transferable, who_should_get_inform, releases_id) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertPortfolio(String date) {
		return "INSERT INTO portfolio_" + date + "(id, alelll, hcp_pjm_coordinator, last_quality_gate, pgl, pia, process_audit, project_owner, remark_for_closed_project, "
				+ "scope_short_desc, tbp_slpppjm, type_of_change, version, releases_id) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertProjectReview(String date) {
		return "INSERT INTO project_review_" + date + "(id, activities_planned, coordinator, current_highlights, date_created, date_created_light, date_updated, date_updated_light, "
				+ "mitigation, risks_issues, status, title, releases_id) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertReleasesCustomerPlants(String date) {
		return "INSERT INTO releases_customerPlants_" + date + "(releases_nr, customer_plant_id) "
				+ "values (?, ?)";
	}
	
	public static String insertReleasesPriorities(String date) {
		return "INSERT INTO releases_priorities_" + date + "(releases_nr, priority_id) "
				+ "values (?, ?)";
	}
	
	public static String insertReleasesLocations(String date) {
		return "INSERT INTO releases_locations_" + date + "(releases_nr, location_id) "
				+ "values (?, ?)";
	}
	
	public static String insertRowFormatting(String date) {
		return "INSERT INTO row_formatting_" + date + "(id, font_index, run_len, run_pos, releases_id) "
				+ "values (?, ?, ?, ?, ?)";
	}
	
	public static String insertStearingCommittee(String date) {
		return "INSERT INTO stearing_committee_" + date + "(id, kpi_b, kpi_s, kpi_t, pjm, project_highlight_issue, project_highlight_reason, "
				+ "qg_actual_0, qg_actual_1, qg_actual_2, qg_actual_3, qg_actual_4, qg_actual_5, "
				+ "report_date, risk_corrective_action, risk_due, risk_rating, risk_then, risk_if, title, releases_id) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertTestingCapacity(String date) {
		return "INSERT INTO testing_capacity_" + date + "(id, hcp_pjm, kick_off, tbp_pjm, test_location, releases_id) "
				+ "values (?, ?, ?, ?, ?, ?)";
	}
	
	public static String insertTestingCapacityDetail(String date) {
		return "INSERT INTO testing_capacity_" + date + "(id, date_of_notes, notes, testing_capacity_id) "
				+ "values (?, ?, ?, ?)";
	}
}
