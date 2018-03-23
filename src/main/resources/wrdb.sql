/* Counter Part */
-- INSERT INTO COUNTER_PART (ID, DEPARTMENT, NAME) VALUES('Willi', 'HcP/PJM' , 'Focken Willi');
-- INSERT INTO COUNTER_PART (ID, DEPARTMENT, NAME) VALUES('Tam', 'HcP/PJM2' , 'Nguyen Thi Minh Tam');
-- INSERT INTO COUNTER_PART (ID, DEPARTMENT, NAME) VALUES('Clirim', 'GS-CT/MFC', 'Shahini Clirim');

/* Customer */
INSERT INTO CUSTOMER(ID, NAME)  VALUES ('Jatco','Jatco');
INSERT INTO CUSTOMER(ID, NAME)  VALUES ('Honda','Honda');

/* Customer Plant */
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('CHAM','Honda China(CN) CHAM');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('HPPM','Honda Indonesia (ID) HPPM');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('Mss (Hamamatsu)','Honda Japan (JP) Mss (Hamamatsu)');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('Sss (Suzuka)','Honda Japan (JP) Sss (Suzuka)');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('HDMC','Honda Mexico (MX) HDMC');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('HTM','Honda United States (US) HTM');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('JGZ','Jatco China (CN) JGZ');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('JTC','Jatco Japan (JP) JTC');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('JTL','Jatco Thailand (Tl) JTL');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('JMEX','Jatco Mexico (MX) JMEX');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('WLY_CN','WLY China (CN)');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('PUNCH_CN','Punch China (CN)');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('Hunan','Hunan');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('WLY_Chery','WLY (Chery)');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('SAGW','SAGW');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('WLY','WLY');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('SAIC_SMPV','SAIC SMPV');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('SAIC_SAGW_LD','SAIC SAGW-LD');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('Sokon_Rundar','Sokon Rundar');
INSERT INTO CUSTOMER_PLANT(ID, DESCRIPTION) VALUES ('Hyundai','Hyundai');

/* ETP Testing */
INSERT INTO ETPTESTING (ID, VALUE) VALUES ('R', 'Planned in relocations + releases');
INSERT INTO ETPTESTING (ID, VALUE) VALUES ('H', 'Planned in HcP test planning');
INSERT INTO ETPTESTING (ID, VALUE) VALUES ('NA', 'To be planned by other party');
INSERT INTO ETPTESTING (ID, VALUE) VALUES ('TBD', 'Not yet defined');
INSERT INTO ETPTESTING (ID, VALUE) VALUES ('X', 'Testing done or not needed');

/* Location */;
INSERT INTO LOCATION(ID, NAME)  VALUES ('HcP','Ho Chi Minh Plant');
INSERT INTO LOCATION(ID, NAME)  VALUES ('TbP','Tilburg Plant');
INSERT INTO LOCATION(ID, NAME)  VALUES ('SlpP','San Luis Potosi Plant');

/* Person In Charge */;
-- INSERT INTO PIC(ID, DEPARTMENT, NAME) VALUES ('Willi', 'HcP/PJM', 'Focken Willi');
-- INSERT INTO PIC(ID, DEPARTMENT, NAME) VALUES ('Tam', 'HcP/PJM2', 'Nguyen Thi Minh Tam');
-- INSERT INTO PIC(ID, DEPARTMENT, NAME) VALUES ('Clirim', 'GS-CT/MFC', 'Shahini Clirim');

/* Priority */;
INSERT INTO PRIORITY(ID, NAME)  VALUES ('1','Priority 1 - Hight');
INSERT INTO PRIORITY(ID, NAME)  VALUES ('2','Priority 2 - Middle');
INSERT INTO PRIORITY(ID, NAME)  VALUES ('J','Priority for Jatco');
INSERT INTO PRIORITY(ID, NAME)  VALUES ('H','Priority for Honda');
INSERT INTO PRIORITY(ID, NAME)  VALUES ('O','Relate to other main');

/* Type Of Change */;
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('App','Application');
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('Cap','Capacity');
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('Reloc','Relocation');
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('Mat','Material');
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('ECR','ECR');
INSERT INTO TYPE_OF_CHANGE(ID, NAME) VALUES ('ECR-i','ECR-i');

/* Unit */;
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('A','A');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('E','E');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('EC','EC');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('G','G');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('L','L');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('LC','LC');
INSERT INTO UNIT(ID, DESCRIPTION) VALUES ('T','T');

/* User */;
INSERT INTO USER(ID, DATE_CREATED, CREDENTIALS_EXPIRED_DATE, EMAIL, ENABLED, NAME, PASSWORD)
VALUES ('willi', '2018-01-21', '2019-01-21', 'fixed-term.Willi.Focken@de.bosch.com', true, 'willi', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO USER(ID, DATE_CREATED, CREDENTIALS_EXPIRED_DATE, EMAIL, ENABLED, NAME, PASSWORD)
VALUES ('tam', '2018-01-21', '2019-01-21', 'Tam.NguyenThiMinh@vn.bosch.com', true, 'tam', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO USER(ID, DATE_CREATED, CREDENTIALS_EXPIRED_DATE, EMAIL, ENABLED, NAME, PASSWORD)
VALUES ('shahini', '2018-01-21', '2019-01-21', 'fixed-term.Clirim.Shahini@de.bosch.com', true, 'tam', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO USER(ID, DATE_CREATED, CREDENTIALS_EXPIRED_DATE, EMAIL, ENABLED, NAME, PASSWORD)
VALUES ('hoang', '2018-01-21', '2019-01-21', 'hoang.domanh@vn.bosch.com', true, 'hoang', 'e10adc3949ba59abbe56e057f20f883e');

/* PERMISSION */;
INSERT INTO PERMISSION(id, name, nr, priority, status, belt, customer_plant, line, description_change, aqcdt, etp_test, jatco_release_meth, npc_s_initial, npc_s_actual, npc_s_submission, mqs, risk_review_initial, risk_review_actual, risk_review_submission, p_dr01_initial, p_dr01_actual, p_dr01_submission, p_dr0_initial, p_dr0_actual, p_dr0_submission, p_dr1_initial, p_dr1_actual, p_dr1_submission, p_dr2_initial, p_dr2_actual, p_dr2_submission, p_dr3_initial, p_dr3_actual, p_dr3_submission, p_dr4_initial, p_dr4_actual, p_dr4_submission, p_dr5_initial, p_dr5_actual, p_dr5_submission, npc_r_initial, npc_r_actual, npc_r_submission, isr_initial, isr_actual, isr_submission, quality_resp, psw_s_initial, psw_s_actual, psw_s_submission, p_dr_3_5_initial, p_dr_3_5_actual, p_dr_3_5_submission, master_belt_initial, master_belt_actual, master_belt_submission, psw_a_initial, psw_a_actual, psw_a_submission, rb_orig_sop, rb_sop_initial, rb_sop_actual, rb_sop_submission, ckd_dispatch_date, dispatch_from_plant_initial, dispatch_from_plant_actual, dispatch_from_plant_submission, arrival_at_customer_initial, arrival_at_customer_actual, arrival_at_customer_submission, frozen_period, traffic_light, qg1, qg2, qg3, qg4, qg5, project_nr, ecr_number, customer_inform, notes, last_update, customer, type_of_change, unit, location, uniqu, pic, counter_part, ipp_notification_initial, ipp_notification_actual, ipp_notification_submission, ipp_registration_initial, ipp_registration_actual, ipp_registration_submission, ipp_report_initial, ipp_report_actual, ipp_report_submission, ipp_approval_initial, ipp_approval_actual, ipp_approval_submission, inform_customer_initial, inform_customer_actual, inform_customer_submission, validation_requirements_initial, validation_requirements_actual, validation_requirements_submission, submit_validation_results_initial, submit_validation_results_actual, submit_validation_results_submission, customer_approval_initial, customer_approval_actual, customer_approval_submission, or_initial, or_actual, or_submission, vc_lot_initial, vc_lot_actual, vc_lot_submission)
VALUES(1, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
INSERT INTO PERMISSION(id, name, nr, priority, status, belt, customer_plant, line, description_change, aqcdt, etp_test, jatco_release_meth, npc_s_initial, npc_s_actual, npc_s_submission, mqs, risk_review_initial, risk_review_actual, risk_review_submission, p_dr01_initial, p_dr01_actual, p_dr01_submission, p_dr0_initial, p_dr0_actual, p_dr0_submission, p_dr1_initial, p_dr1_actual, p_dr1_submission, p_dr2_initial, p_dr2_actual, p_dr2_submission, p_dr3_initial, p_dr3_actual, p_dr3_submission, p_dr4_initial, p_dr4_actual, p_dr4_submission, p_dr5_initial, p_dr5_actual, p_dr5_submission, npc_r_initial, npc_r_actual, npc_r_submission, isr_initial, isr_actual, isr_submission, quality_resp, psw_s_initial, psw_s_actual, psw_s_submission, p_dr_3_5_initial, p_dr_3_5_actual, p_dr_3_5_submission, master_belt_initial, master_belt_actual, master_belt_submission, psw_a_initial, psw_a_actual, psw_a_submission, rb_orig_sop, rb_sop_initial, rb_sop_actual, rb_sop_submission, ckd_dispatch_date, dispatch_from_plant_initial, dispatch_from_plant_actual, dispatch_from_plant_submission, arrival_at_customer_initial, arrival_at_customer_actual, arrival_at_customer_submission, frozen_period, traffic_light, qg1, qg2, qg3, qg4, qg5, project_nr, ecr_number, customer_inform, notes, last_update, customer, type_of_change, unit, location, uniqu, pic, counter_part, ipp_notification_initial, ipp_notification_actual, ipp_notification_submission, ipp_registration_initial, ipp_registration_actual, ipp_registration_submission, ipp_report_initial, ipp_report_actual, ipp_report_submission, ipp_approval_initial, ipp_approval_actual, ipp_approval_submission, inform_customer_initial, inform_customer_actual, inform_customer_submission, validation_requirements_initial, validation_requirements_actual, validation_requirements_submission, submit_validation_results_initial, submit_validation_results_actual, submit_validation_results_submission, customer_approval_initial, customer_approval_actual, customer_approval_submission, or_initial, or_actual, or_submission, vc_lot_initial, vc_lot_actual, vc_lot_submission)
VALUES(2, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
INSERT INTO PERMISSION(id, name, nr, priority, status, belt, customer_plant, line, description_change, aqcdt, etp_test, jatco_release_meth, npc_s_initial, npc_s_actual, npc_s_submission, mqs, risk_review_initial, risk_review_actual, risk_review_submission, p_dr01_initial, p_dr01_actual, p_dr01_submission, p_dr0_initial, p_dr0_actual, p_dr0_submission, p_dr1_initial, p_dr1_actual, p_dr1_submission, p_dr2_initial, p_dr2_actual, p_dr2_submission, p_dr3_initial, p_dr3_actual, p_dr3_submission, p_dr4_initial, p_dr4_actual, p_dr4_submission, p_dr5_initial, p_dr5_actual, p_dr5_submission, npc_r_initial, npc_r_actual, npc_r_submission, isr_initial, isr_actual, isr_submission, quality_resp, psw_s_initial, psw_s_actual, psw_s_submission, p_dr_3_5_initial, p_dr_3_5_actual, p_dr_3_5_submission, master_belt_initial, master_belt_actual, master_belt_submission, psw_a_initial, psw_a_actual, psw_a_submission, rb_orig_sop, rb_sop_initial, rb_sop_actual, rb_sop_submission, ckd_dispatch_date, dispatch_from_plant_initial, dispatch_from_plant_actual, dispatch_from_plant_submission, arrival_at_customer_initial, arrival_at_customer_actual, arrival_at_customer_submission, frozen_period, traffic_light, qg1, qg2, qg3, qg4, qg5, project_nr, ecr_number, customer_inform, notes, last_update, customer, type_of_change, unit, location, uniqu, pic, counter_part, ipp_notification_initial, ipp_notification_actual, ipp_notification_submission, ipp_registration_initial, ipp_registration_actual, ipp_registration_submission, ipp_report_initial, ipp_report_actual, ipp_report_submission, ipp_approval_initial, ipp_approval_actual, ipp_approval_submission, inform_customer_initial, inform_customer_actual, inform_customer_submission, validation_requirements_initial, validation_requirements_actual, validation_requirements_submission, submit_validation_results_initial, submit_validation_results_actual, submit_validation_results_submission, customer_approval_initial, customer_approval_actual, customer_approval_submission, or_initial, or_actual, or_submission, vc_lot_initial, vc_lot_actual, vc_lot_submission)
VALUES(3, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
INSERT INTO PERMISSION(id, name, nr, priority, status, belt, customer_plant, line, description_change, aqcdt, etp_test, jatco_release_meth, npc_s_initial, npc_s_actual, npc_s_submission, mqs, risk_review_initial, risk_review_actual, risk_review_submission, p_dr01_initial, p_dr01_actual, p_dr01_submission, p_dr0_initial, p_dr0_actual, p_dr0_submission, p_dr1_initial, p_dr1_actual, p_dr1_submission, p_dr2_initial, p_dr2_actual, p_dr2_submission, p_dr3_initial, p_dr3_actual, p_dr3_submission, p_dr4_initial, p_dr4_actual, p_dr4_submission, p_dr5_initial, p_dr5_actual, p_dr5_submission, npc_r_initial, npc_r_actual, npc_r_submission, isr_initial, isr_actual, isr_submission, quality_resp, psw_s_initial, psw_s_actual, psw_s_submission, p_dr_3_5_initial, p_dr_3_5_actual, p_dr_3_5_submission, master_belt_initial, master_belt_actual, master_belt_submission, psw_a_initial, psw_a_actual, psw_a_submission, rb_orig_sop, rb_sop_initial, rb_sop_actual, rb_sop_submission, ckd_dispatch_date, dispatch_from_plant_initial, dispatch_from_plant_actual, dispatch_from_plant_submission, arrival_at_customer_initial, arrival_at_customer_actual, arrival_at_customer_submission, frozen_period, traffic_light, qg1, qg2, qg3, qg4, qg5, project_nr, ecr_number, customer_inform, notes, last_update, customer, type_of_change, unit, location, uniqu, pic, counter_part, ipp_notification_initial, ipp_notification_actual, ipp_notification_submission, ipp_registration_initial, ipp_registration_actual, ipp_registration_submission, ipp_report_initial, ipp_report_actual, ipp_report_submission, ipp_approval_initial, ipp_approval_actual, ipp_approval_submission, inform_customer_initial, inform_customer_actual, inform_customer_submission, validation_requirements_initial, validation_requirements_actual, validation_requirements_submission, submit_validation_results_initial, submit_validation_results_actual, submit_validation_results_submission, customer_approval_initial, customer_approval_actual, customer_approval_submission, or_initial, or_actual, or_submission, vc_lot_initial, vc_lot_actual, vc_lot_submission)
VALUES(4, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);

/* ROLE */;
INSERT INTO ROLE(ID, CODE, LABEL) VALUES(1, 'PjM', 'PJM coordinator');
INSERT INTO ROLE(ID, CODE, LABEL) VALUES(2, 'QAM', 'Quality coordinator');
INSERT INTO ROLE(ID, CODE, LABEL) VALUES(3, 'PM', 'Project manager');
INSERT INTO ROLE(ID, CODE, LABEL) VALUES(4, 'QA', 'Quality engineer');

/* ROLES_PERMISSIONS */;
INSERT INTO ROLES_PERMISSIONS(ROLE_ID, PERMISSION_ID) VALUES(1, 1);
INSERT INTO ROLES_PERMISSIONS(ROLE_ID, PERMISSION_ID) VALUES(2, 2);
INSERT INTO ROLES_PERMISSIONS(ROLE_ID, PERMISSION_ID) VALUES(3, 3);
INSERT INTO ROLES_PERMISSIONS(ROLE_ID, PERMISSION_ID) VALUES(4, 4);

/* USERS_ROLES */;
INSERT INTO USERS_ROLES(USER_ID, ROLE_ID) VALUES('willi', 1);
INSERT INTO USERS_ROLES(USER_ID, ROLE_ID) VALUES('tam', 2);
INSERT INTO USERS_ROLES(USER_ID, ROLE_ID) VALUES('shahini', 3);
INSERT INTO USERS_ROLES(USER_ID, ROLE_ID) VALUES('hoang', 4);