package com.bosch.wrd.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Role;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

}
