/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.PriorityRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.PriorityConverter;
import com.bosch.wrd.dto.PriorityDto;
import com.bosch.wrd.entity.entityImpl.Priority;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/priority")
public class PriorityService extends BaseService<Priority, String> {
	
	private Converter<PriorityDto, Priority> converter = new PriorityConverter();

	@Autowired
	public PriorityService(PriorityRepository dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<PriorityDto>> getList() {
		List<PriorityDto> dtos = new ArrayList<>();
		Iterable<Priority> iterable = this.dao.findAll();
		iterable.forEach(p -> {
			PriorityDto dto = converter.convertFromEntity(p);
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

}