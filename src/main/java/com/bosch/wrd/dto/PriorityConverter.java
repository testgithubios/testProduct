package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Priority;

public class PriorityConverter extends Converter<PriorityDto, Priority> {

	public PriorityConverter() {
		super(dto -> new Priority(dto.getId(), dto.getName()), 
				entity -> new PriorityDto(entity.getId(), entity.getName()));
	}

}
