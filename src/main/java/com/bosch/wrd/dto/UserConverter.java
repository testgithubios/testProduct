/**
 * 
 */
package com.bosch.wrd.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.bosch.wrd.entity.entityImpl.User;

/**
 * @author hnd1hc
 *
 */
public class UserConverter extends Converter<UserDto, User> {

	private static final Logger LOG = Logger.getLogger(UserConverter.class);
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	public UserConverter() {
		super(dto -> new User(stringToDate(dto.getCreated()), stringToDate(dto.getCredentialsExpiredDate()),
				dto.isEnabled(), dto.getId(), dto.getName(), dto.getPassword(), dto.getEmail()),
				entity -> new UserDto(dateToString(entity.getCreated()),
						dateToString(entity.getCredentialsExpiredDate()), entity.isEnabled(), entity.getId(),
						entity.getName(), entity.getPassword(), entity.getEmail()));
	}

	private static Date stringToDate(String strDate) {
		try {
			if (null != strDate) {
				return DATE_FORMAT.parse(strDate);
			}
		} catch (ParseException e) {
			LOG.warn(e.getMessage());
		}
		return null;
	}

	private static String dateToString(Date date) {
		if (date != null) {
			return DATE_FORMAT.format(date);
		}
		return null;
	}

	/*
	 * public UserConverter(Function<UserDto, User> fromDto, Function<User,
	 * UserDto> fromEntity) { super(dto -> new
	 * User(arrayToSet(dto.getRoleDtos())), entity -> new
	 * UserDto(setToArray(entity.getRoles()))); }
	 * 
	 * private static Set arrayToSet(RoleDto[] roleDtos) { if (roleDtos != null)
	 * { Set mySet = new HashSet<>(Arrays.asList(roleDtos)); return mySet; }
	 * return null; }
	 * 
	 * private static RoleDto[] setToArray(Set<Role> set) { if (set != null) {
	 * RoleDto[] targetArray = set.stream().toArray(RoleDto[]::new); return
	 * targetArray; } return null; }
	 */

}
