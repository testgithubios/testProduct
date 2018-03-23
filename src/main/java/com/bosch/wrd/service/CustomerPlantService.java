/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.CustomerPlantRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.CustomerPlantConverter;
import com.bosch.wrd.dto.CustomerPlantDto;
import com.bosch.wrd.entity.entityImpl.CustomerPlant;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/customerPlant")
public class CustomerPlantService extends BaseService<CustomerPlant, String> {
	
	private Converter<CustomerPlantDto, CustomerPlant> converter = new CustomerPlantConverter();

	public CustomerPlantService(CustomerPlantRepository dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<CustomerPlantDto>> getList() {
		List<CustomerPlantDto> dtos = new ArrayList<>();
		Iterable<CustomerPlant> plants = this.dao.findAll();
		plants.forEach(r -> {
			CustomerPlantDto dto = converter.convertFromEntity(r);
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

}
