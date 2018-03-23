package com.bosch.wrd.service;

import java.io.Serializable;
import java.util.List;

import com.bosch.wrd.exception.CustomException;

/**
 * A generic service for handling CRUD operations.
 *
 */
public interface GenericService<Entity extends Serializable, ID extends Serializable> {

	/**
	 * Retrieves an object.
	 */
	public List<Entity> findAll();

	/**
	 * Retrieves a single object.
	 * 
	 * @param id
	 * @throws CustomException 
	 */
	public Entity findById(ID id) throws CustomException;

	/**
	 * Add new object.
	 * 
	 * @param t
	 */
	public Entity save(Entity entity);

	/**
	 * Update object.
	 * 
	 * @param t
	 */
	public Entity update(Entity entity);

	/**
	 * Delete by id.
	 * 
	 * @param id
	 */
	public void deleteById(ID id);

	/**
	 * Get page.
	 * 
	 * @param pageNo,
	 *            pageSize, orderBy, ascOrder
	 */
	public List<Entity> getPage(int pageNo, int pageSize, String orderBy, boolean ascOrder);
}
