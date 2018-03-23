package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.TestingCapacity;

@Repository
public interface TestingCapacityRepository extends PagingAndSortingRepository<TestingCapacity, Long> {

	List<TestingCapacity> findByReleases_Nr(Long nr);
	
}
