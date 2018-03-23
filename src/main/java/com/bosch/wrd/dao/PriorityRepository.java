package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Priority;

@Repository
public interface PriorityRepository extends PagingAndSortingRepository<Priority, String> {

	List<Priority> findByReleases_Nr(Long nr);
	
}
