package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Highlight;

@Repository
public interface HighlightRepository extends PagingAndSortingRepository<Highlight, Long> {

}
