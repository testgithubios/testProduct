package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Role;

public class RoleConverter extends Converter<RoleDto, Role> {

	public RoleConverter() {
		super(dto -> new Role(dto.getId(), dto.getCode(), dto.getLabel()),
				entity -> new RoleDto(entity.getId(), entity.getCode(), entity.getLabel()));
	}

}
