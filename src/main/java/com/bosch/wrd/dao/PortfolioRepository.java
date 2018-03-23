package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Portfolio;

@Repository
public interface PortfolioRepository extends PagingAndSortingRepository<Portfolio, Long> {

	@Query("SELECT p FROM Portfolio p WHERE p.releases.nr = ?1")
	List<Portfolio> findByReleasesNr(Long nr);
	
	List<Portfolio> findByTypeOfChange(String id);
	
	@Query("SELECT p FROM Portfolio p WHERE p.typeOfChange=null")
	List<Portfolio> findByOther();
	
}
