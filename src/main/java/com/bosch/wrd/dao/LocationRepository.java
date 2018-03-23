package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Location;

@Repository
public interface LocationRepository extends PagingAndSortingRepository<Location, String> {

	@Query("SELECT l FROM Location l")
	List<Location> getAllLocations();
	
	List<Location> findByReleasesNr(Long nr);
}
