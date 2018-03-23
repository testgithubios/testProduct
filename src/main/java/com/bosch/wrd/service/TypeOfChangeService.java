/**
 * 
 */
package com.bosch.wrd.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.TypeOfChangeRepository;
import com.bosch.wrd.entity.entityImpl.TypeOfChange;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/typeOfChange")
public class TypeOfChangeService extends BaseService<TypeOfChange, String> {

	public TypeOfChangeService(TypeOfChangeRepository dao) {
		super();
		this.dao = dao;
	}

}
