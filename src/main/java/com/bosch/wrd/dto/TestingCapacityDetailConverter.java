package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.TestingCapacityDetail;
import com.bosch.wrd.util.DateUtil;

public class TestingCapacityDetailConverter extends Converter<TestingCapacityDetailDto, TestingCapacityDetail> {

	public TestingCapacityDetailConverter() {
		super(dto -> new TestingCapacityDetail(dto.getId(), DateUtil.stringToDate(dto.getKey(), DateUtil.TESTING_CAPACITY_FORMAT), dto.getValue()), 
				entity -> new TestingCapacityDetailDto(entity.getId(), DateUtil.convertDate(entity.getDateOfNotes(), DateUtil.TESTING_CAPACITY_FORMAT), entity.getNotes()));
	}

}
