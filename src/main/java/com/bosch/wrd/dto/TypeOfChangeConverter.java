package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.TypeOfChange;

public class TypeOfChangeConverter extends Converter<TypeOfChangeDto, TypeOfChange> {

	public TypeOfChangeConverter() {
		super(dto -> new TypeOfChange(dto.getId(), dto.getName()), entity -> new TypeOfChangeDto(entity.getId(), entity.getName()));
	}

}
