package org.mnr.exceptionhandling_15;

public class MyCheckedException extends Throwable/*or Exception clas*/ {
	
	/*
	 * if userdefined exception need to be checked exception
	 * we need to extend either Exception class or Throwable class
	 */
	
	private String message="Positive value supplied";
	
	public MyCheckedException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
        return message;
    }
}
