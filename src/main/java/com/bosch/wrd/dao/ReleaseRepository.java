package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Releases;

@Repository
public interface ReleaseRepository extends PagingAndSortingRepository<Releases, Long> {

	@Query("SELECT r FROM Releases r")
	List<Releases> getListReleases();
	
	Releases findByNr(Long nr);
	
	@Query(value = "SELECT DISTINCT r FROM Releases r LEFT JOIN r.objCustomer cus LEFT JOIN r.change c LEFT JOIN r.locations loc WHERE cus.id IN ?1 OR c.id IN ?2 OR loc.id IN ?3 OR r.status IN ?4",
			countQuery = "SELECT COUNT(DISTINCT r) FROM Releases r LEFT JOIN r.objCustomer cus LEFT JOIN r.change c LEFT JOIN r.locations loc WHERE cus.id IN ?1 OR c.id IN ?2 OR loc.id IN ?3 OR r.status IN ?4")
	Page<Releases> getSelectedReleases(List<String> customerIds, List<String> typeOfChangeIds, List<String> locationIds, List<String> lstStatus, Pageable pageable);
	
	@Query("SELECT r FROM Releases r WHERE r.nr IN ?1")
	List<Releases> getReleasesByNrs(List<Long> nrs);
	
	@Query("SELECT DISTINCT(r) FROM Releases r JOIN r.objCustomer cus LEFT JOIN r.change c WHERE cus.id = ?1 AND c.id = ?2")
	List<Releases> findByCustomerIdAndTypeOfChangeId(String customerId, String typeOfChangeId);
	
	@Query("SELECT r FROM Releases r WHERE r.objCustomer IS EMPTY AND r.change IS EMPTY")
	List<Releases> findNotInCustomerAndTypeOfChange();
	
	@Query("SELECT DISTINCT(r) FROM Releases r JOIN r.objCustomer cus WHERE cus.id = ?1")
	List<Releases> findByCustomerId(String customerId);
	
	@Query("SELECT DISTINCT(r) FROM Releases r JOIN r.change c WHERE c.id = ?1")
	List<Releases> findByTypeOfChangeId(String changeId);
	
	@Query("SELECT r FROM Releases r JOIN r.locations l WHERE l.id='HcP' AND r.change.id = ?1")
	List<Releases> findByHcpAndTypeOfChange(String id);
	
	@Query("SELECT r FROM Releases r JOIN r.locations l WHERE l.id='HcP' AND r.change.id = null")
	List<Releases> findByHcpAndOther();
	
}
