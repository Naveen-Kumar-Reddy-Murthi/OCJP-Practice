package org.mnr.exceptionhandling_15;

public class AppException extends RuntimeException {
	public AppException(RuntimeException exception) {
		
		super(exception);
	}

}
   