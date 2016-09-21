package org.mnr.exceptionhandling_15;

public class MyUncheckedException extends RuntimeException {

	/**
	 * if userdefined exceptions need to be unchecked
	 *  then that exception class must extend from RumtimeException class
	 */
	private static final long serialVersionUID = 1L;

	public MyUncheckedException(String param) {
		super(param);
	}
}
