package com.bosch.wrd.constraints;

public enum TrafficLight {
	YELLOW("Yellow"), RED("Red"), BLUE("Blue"), GREEN("Green");
	
	private final String value;
	
	private TrafficLight(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
