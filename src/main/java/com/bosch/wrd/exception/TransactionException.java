package com.bosch.wrd.exception;

public class TransactionException extends ResourceNotFoundException {
	private static final long serialVersionUID = 1L;

	public TransactionException() {
		super();
	}
	
	public TransactionException(String message) {
		super(message);
	}
	
	public TransactionException(Throwable cause) {
		super(cause);
	}
	
	public TransactionException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public TransactionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
