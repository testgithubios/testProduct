package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {

}
