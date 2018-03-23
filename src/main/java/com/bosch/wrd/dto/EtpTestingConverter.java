package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.EtpTesting;

public class EtpTestingConverter extends Converter<EtpTestingDto, EtpTesting> {

	public EtpTestingConverter() {
		super(dto -> new EtpTesting(dto.getId(), dto.getValue()), 
				entity -> new EtpTestingDto(entity.getId(), entity.getValue()));
	}
	
}
