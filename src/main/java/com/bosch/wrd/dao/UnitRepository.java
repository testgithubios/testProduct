package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Unit;

@Repository
public interface UnitRepository extends PagingAndSortingRepository<Unit, String> {

}
