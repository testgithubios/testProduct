package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Location;

public class LocationConverter extends Converter<LocationDto, Location> {

	public LocationConverter() {
		super(dto -> new Location(dto.getId(), dto.getName()), entity -> new LocationDto(entity.getId(), entity.getName()));
	}

}
