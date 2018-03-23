/**
 * 
 */
package com.bosch.wrd.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.UserRepository;
import com.bosch.wrd.dto.Converter;
import com.bosch.wrd.dto.RoleConverter;
import com.bosch.wrd.dto.RoleDto;
import com.bosch.wrd.dto.UserConverter;
import com.bosch.wrd.dto.UserDto;
import com.bosch.wrd.entity.entityImpl.Role;
import com.bosch.wrd.entity.entityImpl.User;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserService extends BaseService<User, String> {

	private Converter<UserDto, User> converter = new UserConverter();
	
	private Converter<RoleDto, Role> roleConverter = new RoleConverter();

	public UserService(UserRepository dao) {
		super();
		this.dao = dao;
	}

	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<UserDto>> getList() {
		List<UserDto> dtos = new ArrayList<>();
		Iterable<User> plants = this.dao.findAll();

		plants.forEach(r -> {
			UserDto dto = converter.convertFromEntity(r);

			List<RoleDto> roleDtos = new ArrayList<>();
			r.getRoles().forEach(ro -> {
				roleDtos.add(roleConverter.convertFromEntity(ro));
			});

			/*RoleDto[] arrRoleDtos = new RoleDto[roleDtos.size()];
			arrRoleDtos = roleDtos.toArray(arrRoleDtos);*/
			if (roleDtos.size() >= 1 && !"".equalsIgnoreCase(roleDtos.get(0).getCode())){
				dto.setRoleDtos(roleDtos.get(0).getCode());
			}	
			dtos.add(dto);
		});
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<UserDto> saveOrUpdate(@RequestBody UserDto dto) {
		User user = converter.convertFromDto(dto);
		user.setId(dto.getId());

		MessageDigest md;
		if ("".equals(dto.getPassword()) || dto.getPassword() == null) {
			user.setPassword("");
		} else {
			try {
				md = MessageDigest.getInstance("MD5");

				md.update(dto.getPassword().getBytes());
				byte[] digest = md.digest();
				String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

				user.setPassword(myHash);

			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		User newUser = this.dao.save(user);

		return new ResponseEntity<>((converter.convertFromEntity(newUser)), HttpStatus.CREATED);
	}
}
