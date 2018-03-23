package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.Permission;

@Repository
public interface PermissionRepository extends PagingAndSortingRepository<Permission, Long> {
	@Query("SELECT per FROM Permission per JOIN  per.roles roles WHERE roles.id = ?1 ")
	List<Permission> getPermissionByRoleId(Long roleId);
	
	@Query("SELECT per FROM Permission per JOIN  per.roles roles JOIN roles.users users WHERE users.id = ?1 ")
	List<Permission> getPermissionByUserId(String userId);
}
