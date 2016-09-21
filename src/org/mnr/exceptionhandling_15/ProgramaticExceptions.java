package org.mnr.exceptionhandling_15;

public class ProgramaticExceptions {
	
	public static int value;

	public static void main(String[] args) {
//		arrayIndexOutOfBoundsException();
//		nullPointerException();
//		classCastException();
//		noClasDefFoundError();
//		stackOverflowError();
//		exceptionInitializerError();
//		illegalArguementException();
//		numberFormatException();
//		illegalStateException();
		assertionError();
	}
	
	static void arrayIndexOutOfBoundsException(){
		
		int arr[]={1,2,3,5,666,89};
		System.out.println(arr[2]);
		System.out.println(arr[123]);//here java.lang.ArrayIndexOutOfBoundsException
	}
	
	static void nullPointerException(){
		
		String param=	null;
		
//		if(param.equals("naveen"))// here java.lang.NullPointerException
//			System.out.println("naveen");
		
		/*
		 * It's always recommanded to put target string first in order
		 * This mechanism avoid NPE, if comparing parameter is NPE
		 */
		
		if("naveen".equals(param))// here no NPE
			System.out.println("naveen");
		else
			System.out.println("Nothing to print");
		
	}
	
	private static void classCastException() throws StackOverflowError{
		
		/*
		 * unchecked excpetion
		 * raised when doing wrong/illegal typecasting
		 */
		Object obj	=	new String("naveen");
//		StringBuffer sb	=	(StringBuffer)obj;//java.lang.ClassCastException:
		
		/*Correct way to do it is*/
		StringBuffer sb1=null;
			if(obj instanceof StringBuffer)
				 sb1	=	(StringBuffer)obj;
			else
				System.out.println("wrong typecasting");

	}
	
	private static void noClasDefFoundError(){
		/*
		 * It is a checkedException
		 * rasied automatically by JVM
		 */
		
		AppException exception	= new AppException(new ArithmeticException());//java.lang.NoClassDefFoundError
		//here AppException class file has been deleted, hence no class is found to create an object
		//Eventually it wil throw NoClassDefFoundError
	}
	
	private static void stackOverflowError(){
		/*
		 * unchecked exception
		 * raised by jvm automatically when the stack memory of a thread is exhausted
		 */
		stackOverflowError();//recursive calling results in stackoverflow error
	}
	
	private static void exceptionInitializerError(){
		/*
		 * unchecked exception
		 * raised by jvm when there is an error while initializing static member
		 */
		
		value=0/0;
		
	}

	private static void illegalArguementException(){
		
		Thread thread	=	new Thread();
		thread.setPriority(1);//thread priority is between 1 and 10. any other value will result in java.lang.IllegalArgumentException
		thread.setPriority(120);//java.lang.IllegalArgumentException
	}
	
	private static void numberFormatException(){
		/*
		 * unchecked exception
		 * raised by jvm when illegal casting of numbers i.e., string to int/ object to int et
		 */
		
		int value= Integer.parseInt("25");//valid
		value= Integer.parseInt("naveen");//java.lang.NumberFormatException
		
	}
	
	private static void illegalStateException(){
		/*
		 * unchecked exception
		 *  Signals that a method has been invoked at an illegal or
		 * inappropriate time.  In other words, the Java environment or
		 * Java application is not in an appropriate state for the requested
		 * operation.
		 *
		 */
		
		Thread thread	=	new Thread();
		thread.start();
		thread.start();//java.lang.IllegalThreadStateException
		
		/*
		 * Another example
		 * we can't access call any method on session object after it got invalidated
		 * doing so illegalstateexception will be thrown
		 */
	}

	private static void assertionError(){
		/*
		 * uncheckedException
		 * Thrown to indicate that an assertion has failed.
		 */
		
		int x=10;
//		assert(x>10);//fails	//java.lang.AssertionError
		System.out.println(x);
		
	}

}
