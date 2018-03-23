package com.bosch.wrd.constraints;

public enum TestingType {
	RELEASES("R"), HCP("H"), TO_BE_PLANNED_BY_OTHER_PARTY("NA"), NOT_YET_DEFINED("TBD"), TESTING_DONE("X");
	
	private final String value;

	private TestingType(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
