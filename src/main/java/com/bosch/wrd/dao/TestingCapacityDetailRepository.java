package com.bosch.wrd.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.TestingCapacityDetail;

@Repository
public interface TestingCapacityDetailRepository extends PagingAndSortingRepository<TestingCapacityDetail, Long> {

	List<TestingCapacityDetail> findByTestingCapacity_Id(Long id);
	
	@Query("SELECT t FROM TestingCapacityDetail t WHERE t.testingCapacity.id=?1 AND t.dateOfNotes BETWEEN ?2 AND ?3")
	List<TestingCapacityDetail> findByCapacityIdAndDate(Long id, Date start, Date end);
	
}
