/**
 * 
 */
package com.bosch.wrd.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.CustomerRepository;
import com.bosch.wrd.entity.entityImpl.Customer;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/customer")
public class CustomerService extends BaseService<Customer, String> {

	public CustomerService(CustomerRepository dao) {
		super();
		this.dao = dao;
	}

}
