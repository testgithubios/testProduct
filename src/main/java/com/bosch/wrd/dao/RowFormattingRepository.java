package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.RowFormatting;

@Repository
public interface RowFormattingRepository extends PagingAndSortingRepository<RowFormatting, Long>{

}
