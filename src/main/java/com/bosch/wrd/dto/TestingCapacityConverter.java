package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.TestingCapacity;

public class TestingCapacityConverter extends Converter<TestingCapacityDto, TestingCapacity> {

	public TestingCapacityConverter() {
		super(dto -> new TestingCapacity(dto.getId(), dto.getTestLocation(), dto.getHcpPjm(), dto.getTbpPjm(), dto.getKickOff()),
				entity -> new TestingCapacityDto(entity.getId(), entity.getTestLocation(), entity.getHcpPjm(), entity.getTbpPjm(), entity.getKickOff()));

	}

}
