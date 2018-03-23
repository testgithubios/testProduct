/**
 * 
 */
package com.bosch.wrd.exception;

/**
 * @author hnd1hc
 *
 */
public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;
 
	public String getErrorMessage() {
		return errorMessage;
	}
	public CustomException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public CustomException() {
		super();
	}
}