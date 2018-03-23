package com.bosch.wrd.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ExceptionHandlingController extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ ResourceNotFoundException.class })
	public ResponseEntity<ExceptionResponse> resourceNotFound(ResourceNotFoundException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("Not Found");
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	/*@ExceptionHandler({ AccessDeniedException.class })
	public ResponseEntity<ExceptionResponse> handleAccessDeniedException(AccessDeniedException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorCode("Access denied");
		response.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
	}*/
	
}
