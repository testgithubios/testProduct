package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.Customer;

public class CustomerConverter extends Converter<CustomerDto, Customer> {

	public CustomerConverter() {
		super(dto -> new Customer(dto.getId(), dto.getName()), entity -> new CustomerDto(entity.getId(), entity.getName()));
	}

}
