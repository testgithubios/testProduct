package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.LessonsLearned;

@Repository
public interface LessonsLearnedRepository extends PagingAndSortingRepository<LessonsLearned, Long> {

	List<LessonsLearned> findByReleases_Nr(Long nr);
	
}
