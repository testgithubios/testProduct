/**
 * 
 */
package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.CustomerPlant;

/**
 * @author hnd1hc
 *
 */
@Repository
public interface CustomerPlantRepository extends PagingAndSortingRepository<CustomerPlant, String> {

	List<CustomerPlant> findByReleases_Nr(Long nr);
	
}
