package com.bosch.wrd.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bosch.wrd.entity.entityImpl.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String> {

	List<User> findByEmail(String email);

}
