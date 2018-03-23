package com.bosch.wrd.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bosch.wrd.exception.CustomException;
import com.bosch.wrd.exception.ExceptionResponse;

/**
 * The implementation of Generic Service for handling CRUD operations.
 *
 */
@CrossOrigin
public class BaseService<Entity extends Serializable, ID extends Serializable> implements GenericService<Entity, ID> {

	@Autowired
	protected PagingAndSortingRepository<Entity, ID> dao;

	@RequestMapping(method = RequestMethod.GET)
	@Override
	public @ResponseBody List<Entity> findAll() {
		return (List<Entity>) dao.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody Entity findById(@PathVariable ID id) throws InvalidDataAccessApiUsageException {
		return dao.findOne(id);
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody Entity save(@RequestBody Entity entity) {
		return dao.save(entity);
	}

	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody Entity update(@RequestBody Entity entity) {
		return dao.save(entity);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody void deleteById(@PathVariable ID id) {
		dao.delete(id);
	}

	@RequestMapping(value = "/{pageNo}/{pageSize}/{orderBy}/{ascOrder}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody List<Entity> getPage(@PathVariable int pageNo, @PathVariable int pageSize,
			@PathVariable String orderBy, @PathVariable boolean ascOrder) {

		Sort sort = (ascOrder ? new Sort(new Sort.Order(Direction.ASC, orderBy))
				: new Sort(new Sort.Order(Direction.DESC, orderBy)));
		Pageable pageable = new PageRequest(pageNo, pageSize, sort);
		return this.dao.findAll(pageable).getContent();
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public @ResponseBody Long count() {
		return new Long(this.dao.count());
	}

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ExceptionResponse> exceptionHandler(Exception ex) {
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorCode(HttpStatus.PRECONDITION_FAILED.toString());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity<ExceptionResponse>(error, HttpStatus.OK);
	}
}
