package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.CustomerPlant;

public class CustomerPlantConverter extends Converter<CustomerPlantDto, CustomerPlant> {

	public CustomerPlantConverter() {
		super(dto -> new CustomerPlant(dto.getId(), dto.getDescription()), 
				entity -> new CustomerPlantDto(entity.getId(), entity.getDescription()));
	}
	
}
