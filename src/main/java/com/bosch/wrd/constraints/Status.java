package com.bosch.wrd.constraints;

public enum Status {
	CHANGED("Changed"), NEW("New"), RELEASED("Released"), ON_GOING("Ongoing");

	private final String value;

	private Status(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
