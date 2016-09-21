package org.mnr.exceptionhandling_15;

public class ExceptionWrapping {

	public static void main(String[] args) {
		
		wrapException();

	}
	
	
	private static void wrapException(){
		try{
			System.out.println(0/0);
		}
		catch(ArithmeticException exception){
			throw new AppException(exception);
		}
	}
}
