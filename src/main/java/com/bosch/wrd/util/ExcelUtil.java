package com.bosch.wrd.util;

import com.bosch.wrd.dto.TestingCapacityDto;
import com.bosch.wrd.entity.entityImpl.Location;
import com.bosch.wrd.entity.entityImpl.Releases;

public class ExcelUtil {
	public static final String YES = "Yes";
	public static final String NO = "No";
	public static final String BLANK_SPACE = " ";
	public static final String BLANK = "";

	/**
	 * Lessons Learned
	 */
	public static final String NUMBER = "No.";
	public static final String CATEGORY = "category";
	public static final String PROBLEM_DESC = "Problem description";
	public static final String ROOT_CAUSES = "Root causes";
	public static final String LESSON_LEARNED = "lesson learned";
	public static final String WHO_SHOULD_GET_INFR = "Who should get informed";
	public static final String TRANFERABLE = "Tranferable (Y/N)?";
	public static final String ACTION_FOR_EL7 = "Action for EL7";
	public static final String LESSON_LEARNED_SHEET_NAME = "LESSON LEARNED";
	/**
	 * Testing Capacity
	 */
	public static final String PROJECT_NAME = "Project name";
	public static final String HcP_PjM = "HcP PjM";
	public static final String TbP_PjM = "TbP PjM";
	public static final String PLANNED_START_TIME = "Planned start time";
	public static final String PLANNED_SOP = "Planned SOP";
	public static final String PLANNED_ISR = "Planned ISR";
	public static final String TEST_LOCATION = "Test location";
	public static final String KICK_OFF = "Kick off";
	public static final String TESTING_CAPACITY_SHEET_NAME = "TESTING CAPACITY";
	/**
	 * SelectedReleases
	 */
	public static final String SELECTED_RELEASES_SHEET_NAME = "SELECTED RELEASES";
	public static final String NR = "Nr";
	public static final String STATUS = "Status";
	public static final String BELT = "Belt";
	public static final String LINE = "Line";
	public static final String DESCRIPTION_CHANGE = "Description change";
	public static final String AQCDT = "AQCDT";
	public static final String JATCO = "Jatco release meth";
	public static final String NPCS = "NPCS";
	public static final String MQS = "MQS";
	public static final String RISH_REVIEW = "Risk review";
	public static final String PDR0 = "PDR0";
	public static final String PDR3 = "PDR3";
	public static final String PDR5 = "PDR5";
	public static final String PDR01 = "PDR01";
	public static final String PDR2 = "PDR2";
	public static final String NPCR = "NPCR";
	public static final String ISR = "ISR";
	public static final String SAMPLE_SUBMIT = "Sample submission";
	public static final String PSW_SUBMIT = "PSW Submit";
	public static final String PDR_35 = "PDR 35";
	public static final String MASTER_BELT = "Master belt delivery";
	public static final String PSW_APPROVAL = "PSW Approval";
	public static final String RB_ORIG_SOP = "RB Orig Sop";
	public static final String RB_SOP = "RB Sop";
	public static final String CKD_DISPATCH_DATE = "CKD dispatch date";
	public static final String DISPATCH_FROM_BOSCH = "Dispatch from bosch plant";
	public static final String ARRIVAL_AT_CUSTOMER = "Arrival at customer";
	public static final String FROZEN_PERIOD = "Frozen period";
	public static final String TRAFFIC_LIGHT = "Traffic light";
	public static final String QG1 = "QG1";
	public static final String QG2 = "QG2";
	public static final String QG3 = "QG3";
	public static final String QG4 = "QG4";
	public static final String QG5 = "QG5";
	public static final String PROJECT_NR = "Project nr"; 
	public static final String ECR_STATUS = "ECR status";
	public static final String ECR_NR = "ECR nr";
	public static final String CUSTOMER_INFR = "Customer inform";
	public static final String NOTES = "Notes";
	public static final String LAST_UPDATED = "Last updated";
	public static final String PIC = "PIC";
	public static final String COUNTER_PART = "Counter part";
	public static final String UNIQUE = "Unique";
	/**
	 * Porfolio 
	 */
	public static final String PGL = "x";
	public static final String PORTFOLIO_SHEET_NAME = "PORTFOLIO";
	
	/**
	 * Milestone 
	 */
	public static final String MILESTONE_SHEET_NAME = "MILESTONE";
	public static final String HEADER_B = "B";
	public static final String HEADER_J = "J";
	public static final String HEADER_LINK_MFC = "Link to MFC, don't change";
	public static final String FULL_PRO = "Ful Pro* ";
	public static final String PPDR = "PP DR*";
	public static final String DR = "要DR";
	public static final String PSWA = "PSW A";
	public static final String CHANGE = "Change/ New/ Released";
	public static final String JPNAME = "JP name";
	public static final String PRIO = "Prio";
	public static final String SOP = "SOP";
	public static final String SUB_TOTAL = "80";  // ACTUALLY IS =SUBTOTAL(103,I4:I65035)
	public static final String DATE_K2 = "5/18/2017";
	public static final String BOSCH_MAINTENANCE = "DR steps　(Bosch maintenance)　";
	public static final String DR_STATUS = "DR status updated as of 25/Aug";
	public static final String JATCO_MAINTENACE = "DR steps　(actual) Jatco maintenance ";
	public static final String LOC = "Loc";
	public static final String CUS_PLANT = "Cust. plant";
	
	public static void setDataCapacityByReleases(Releases r, TestingCapacityDto dto) {
		dto.setRealeasesId(r.getNr());
		dto.setProjectName(getProjectName(r));
		dto.setPlannedStartTime(DateUtil.convertDate(r.getPlannedStartTime(), DateUtil.YEAR_FORMAT));
		dto.setPlannedSop(DateUtil.convertDate(r.getPlannedSop(), DateUtil.PLANNED_SOP_FORMAT));
		dto.setPlannedIsr(DateUtil.convertDate(r.getPlannedIsr(), DateUtil.PLANNED_ISR_FORMAT));
	}
	
	public static String getProjectName(Releases releases) {
		String belt = releases.getBelt() != null ? releases.getBelt() : BLANK;
		
		String location = BLANK;
		if (releases.getLocations() != null && releases.getLocations().size() > 0) {
			for (Location l : releases.getLocations()) {
				location += l.getName();
			}
		}
		
		String line = releases.getLine() != null ? releases.getLine() : BLANK;
		
		String customer = BLANK;
		if (releases.getObjCustomer() != null && releases.getObjCustomer().getName() != null)
			customer = releases.getObjCustomer().getName();
		
		String description = releases.getDescriptionChange() != null ? releases.getDescriptionChange() : BLANK;
		
		StringBuilder sb = new StringBuilder(belt + BLANK_SPACE);
		sb.append(location + BLANK_SPACE);
		sb.append(line + BLANK_SPACE);
		sb.append(customer + BLANK_SPACE);
		sb.append(description);		
		return sb.toString();
	}
	
}
