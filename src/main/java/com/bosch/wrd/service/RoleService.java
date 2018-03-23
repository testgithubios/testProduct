/**
 * 
 */
package com.bosch.wrd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.RoleRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.RoleConverter;
import com.bosch.wrd.dto.RoleDto;
import com.bosch.wrd.entity.entityImpl.Role;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/role")
@CrossOrigin
public class RoleService extends BaseService<Role, Long> {

	private Converter<RoleDto, Role> converter = new RoleConverter();

	public RoleService(RoleRepository dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<RoleDto>> getList() {
		List<RoleDto> dtos = new ArrayList<>();
		Iterable<Role> plants = this.dao.findAll();
		plants.forEach(r -> {
			RoleDto dto = converter.convertFromEntity(r);
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<RoleDto> saveOrUpdate(@RequestBody RoleDto dto) {
		Role role = converter.convertFromDto(dto);
		Role newRole = this.dao.save(role);

		return new ResponseEntity<>((converter.convertFromEntity(newRole)), HttpStatus.CREATED);
	}
}