package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.StearingCommittee;

@Repository
public interface StearingCommitteeRepository extends PagingAndSortingRepository<StearingCommittee, Long> {

	List<StearingCommittee> findByReleases_Nr(Long id);
	
}
