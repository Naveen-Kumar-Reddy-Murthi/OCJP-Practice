package org.mnr.exceptionhandling_15;

public class ThrowKeyWord {
	
	public static ArithmeticException exception;

	public static void main(String[] args) {
		
//		throwKeyword();
//		throwMyExceptionObject();
//		throwNonThrowableObjects();	
//		throwCheckedExceptions();
//		throw new Exception();//CE:Unhandled exception type Exception
//		throwError();
		throw new Error();
		
	}
	
	public static void throwKeyword(){
		/*
		 * Used to throw the exception to the caller method/JVM
		 * here main method is responsible to create ArithmeticException object
	     * then it handsover to jvm automaticaly
	     * ***imp***
	     * throw keyword is only used with Throwable objects
	     * both checked and unchecked exceptions are allowed to be thrown using throw keyword
	     *  no other objects are allowed to throw
		 */
		
			System.out.println(0/0);// 
		
		/*
		 * but here programmer is responsible to create 
	     * ArithmeticException and handsover to jvm manually using throw keyword
		 */
		
			throw new ArithmeticException("/by zero ");//
		
		
	}
	
	
	public static void throwMyExceptionObject(){
		
		/*
		 * we can throw our own created exception object
		 * But object can't be null, otherwise nul pointer exception
		 * throw is the last execution part of any block/method
		 * no other statemnt after throw is allowed, CE
		 */
		
		exception= new ArithmeticException(" /by zero");
		
		
		  throw exception;// if exception is null, then NPE
//		  System.out.println();//CE:Unreachable code
		  
		  
		  
		
	}
	
	public static void throwNonThrowableObjects(){
		
		String name	= new String("naveen");
//		throw name; //CE:No exception of type String can be thrown; an exception type must be a subclass of Throwable
	}
	
	
	public static void throwCheckedExceptions() throws Exception{
		
		throw new Exception();//CE:Unhandled exception type Exception unless we add throws Exception to method header
		
		/*
		 * here caller of this method must either throw or have try-catch while calling 
		 */
	}
	
	static void throwError(){//we can throw Error object
		
		throw new Error();
	}

}
