package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.TypeOfChange;

@Repository
public interface TypeOfChangeRepository extends PagingAndSortingRepository<TypeOfChange, String> {

}
