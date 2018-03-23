/**
 * 
 */
package com.bosch.wrd.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.wrd.dao.UnitRepository;
import com.bosch.wrd.entity.entityImpl.Unit;

/**
 * @author hnd1hc
 *
 */
@RestController
@RequestMapping(value = "/api/unit")
public class UnitService extends BaseService<Unit, String> {

	public UnitService(UnitRepository dao) {
		super();
		this.dao = dao;
	}

}
