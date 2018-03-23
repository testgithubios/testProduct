/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.LocationRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.LocationConverter;
import com.bosch.wrd.dto.LocationDto;
import com.bosch.wrd.entity.entityImpl.Location;

@RestController
@RequestMapping(value = "/api/location")
public class LocationService extends BaseService<Location, String> {

	public LocationService(LocationRepository dao) {
		super();
		this.dao = dao;
	}
	
	private Converter<LocationDto, Location> converter = new LocationConverter();
	
	@RequestMapping(value = "/getAllLocations", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<LocationDto>> getAllLocations() {
		List<Location> locations = ((LocationRepository) this.dao).getAllLocations();
		List<LocationDto> dtos = new ArrayList<>();
		locations.forEach(l -> {
			dtos.add(converter.convertFromEntity(l));
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
}
