package com.bosch.wrd.constraints;

public enum CustomerInform {
	A("A"), I("I"), NO("no");
	
	private final String value;
	
	private CustomerInform(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
