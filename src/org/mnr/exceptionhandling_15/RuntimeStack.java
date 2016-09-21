package org.mnr.exceptionhandling_15;

public class RuntimeStack {

	public static void main(String[] args) {
		
		/*
		 * JVM creates a runtime stack for every thread
		 * each method executed by that thread will be registered before executing that method
		 * each entry in the runtime stack is called stack frame/activation record
		 * once method execution is over, that stackframe is removed from runtime stack
		 * when that thread is done with its task, runtime statck will be destroyed by jvm
		 * Following is the way to get stacktrace in java
		 */
			
		
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
//		System.out.println(0/0);
	}
}
