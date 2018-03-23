/**
 * 
 */
package com.bosch.wrd.dao;

import org.springframework.data.repository.CrudRepository;

import com.bosch.wrd.entity.entityImpl.Releases;

/**
 * @author hnd1hc
 *
 */
public interface ECRImportRepository extends CrudRepository<Releases, Long> {

}
