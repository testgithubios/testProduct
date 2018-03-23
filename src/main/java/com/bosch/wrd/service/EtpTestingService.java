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

import com.bosch.wrd.dao.EtpTestingRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.EtpTestingConverter;
import com.bosch.wrd.dto.EtpTestingDto;
import com.bosch.wrd.entity.entityImpl.EtpTesting;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/etpTesting")
public class EtpTestingService extends BaseService<EtpTesting, String> {
	
	private Converter<EtpTestingDto, EtpTesting> converter = new EtpTestingConverter();

	public EtpTestingService(EtpTestingRepository dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<EtpTestingDto>> getList() {
		List<EtpTestingDto> dtos = new ArrayList<>();
		Iterable<EtpTesting> plants = this.dao.findAll();
		plants.forEach(r -> {
			EtpTestingDto dto = converter.convertFromEntity(r);
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
}