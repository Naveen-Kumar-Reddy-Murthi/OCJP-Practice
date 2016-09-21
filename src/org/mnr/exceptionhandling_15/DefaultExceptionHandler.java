package org.mnr.exceptionhandling_15;

public class DefaultExceptionHandler {
	
	/*
	 * In a method, if there is any exception, then corresponding method
	 * is responsible to create exception object. 
	 * Exception object should contain the following information
	 * Name of the exception, desc of the exception and runtime statck trace
	 * After creating the exception object, method handovers it to jvm.
	 * Jvm checks if that method has any exception handling code or not
	 * If it has any then, it executes that code and terminates the program
	 * If it doesn't, then it moves up the statck trace and checks the caller
	 * method if it has any exception handling code. This continues untill
	 * any method has exception hanlding code. If no method is having exception
	 * handling code till main method. Then jvm handovers the exception object to
	 * DefaultExceptionHanlder. DEH just prints the excetion object and terminates
	 * the program.
	 * First line of stack trace tells what kind of exception is that
	 * second line tells where exactly exception occurred
	 * Following lines are stackframes of that thread
	 *  
	 */

	public static void main(String[] args) {
		
		StackTraceElement[] stackTrace	= Thread.currentThread().getStackTrace();
		 for(StackTraceElement ste: stackTrace)
			 System.out.println("before m1::"+ste);
		 System.out.println();
			m1();
			 
	}
	
	public static void m1(){
		StackTraceElement[] stackTrace	= Thread.currentThread().getStackTrace();
		 for(StackTraceElement ste: stackTrace)
			 System.out.println("m1::"+ste);
		 System.out.println();
		m2();
	}
	
	public static void m2(){
		StackTraceElement[] stackTrace	= Thread.currentThread().getStackTrace();
		 for(StackTraceElement ste: stackTrace)
			 System.out.println("m2::"+ste);
		 System.out.println();
		m3();
		
	}
	public static void m3(){
		StackTraceElement[] stackTrace	= Thread.currentThread().getStackTrace();
		 for(StackTraceElement ste: stackTrace)
			 System.out.println("m3::"+ste);
		 System.out.println();
		m4();
	}
	public static void m4(){
		StackTraceElement[] stackTrace	= Thread.currentThread().getStackTrace();
		 for(StackTraceElement ste: stackTrace)
			 System.out.println("m4::"+ste);
		 System.out.println();
		System.out.println(0/0);
	}
}
