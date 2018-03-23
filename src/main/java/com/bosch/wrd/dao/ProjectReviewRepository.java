package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.ProjectReview;

@Repository
public interface ProjectReviewRepository extends PagingAndSortingRepository<ProjectReview, Long> {

	List<ProjectReview> findByReleases_Nr(Long nr);
	
}
