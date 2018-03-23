/**
 * 
 */
package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.EtpTesting;
import com.bosch.wrd.entity.entityImpl.Releases;

/**
 * @author hnd1hc
 *
 */
@Repository
public interface EtpTestingRepository extends PagingAndSortingRepository<EtpTesting, String> {

	List<EtpTesting> findByReleases_Nr(Long nr);
	
	@Query("SELECT r FROM EtpTesting e JOIN e.releases r WHERE e.id=?1")
	List<Releases> findByEtpTestingId(String id);
}