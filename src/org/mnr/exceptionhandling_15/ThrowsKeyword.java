package org.mnr.exceptionhandling_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException  {
		
		/*
		 * If there is any chance of raising checked exceptions then
		 * that exception must be hanlded otherwise CE
		 * Hanlding can either be using try-catch or throws keyword
		 * Ex:
		 * throws can only be used to delegate the throwable objects
		 * no other are allowed else CE
		 * throws can be used on methods and constructors
		 */
		
//		delegatingException();//here we can either delegate the exception or by try catch
		
//		hanldingTheException();
		
//		delegatingUncheckedException();
//		System.out.println("delegatingUncheckedException333");
		
		
	
			handlingUnnecessaryFullyCheckedExceptions();
			
//			throw new Exception(); //this must either be try-catched or delegated by main method otherwise CE
		
	}

	private static void delegatingException() throws InterruptedException 
	{		
			/*
			 * If an exception is delegated in any block/method, then
			 * caller must hanlde that either by again delegating it to the caller or by try-catch
			 * Both checked and unchecked exceptions can be delegated
			 * but there's no point in delegating unchecked exceptions
			 */
			System.out.println("bfore");
			Thread.currentThread().sleep(10000);//CE:Unhandled exception type InterruptedException if not thrown/try-cathced
			System.out.println("after");
	}

	private static void hanldingTheException()
	{
		System.out.println("bfore");
		try {// with try-catch no need to throws on method. This is hanlding the exception
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("after");
	}
	
	private static void delegatingUncheckedException()throws ArithmeticException{
		
		/*
		 * There's no use of delegating unchecked exceptions
		 */
		
		System.out.println("before11");
		int arr[]	=	new int[Integer.MAX_VALUE];
		//System.out.println(0/0);
		System.out.println("after22");
	}
	
	
	private static void handlingUnnecessaryFullyCheckedExceptions()throws InterruptedException{
		
		/*
		 * An Exception whose child classes are checkedExceptions then they are called
		 * fully checked exceptions
		 * These exceptions need to be thrown only if there is a chance of that exception
		 */
		//FileInputStream fin	= new FileInputStream("");
		
	//	try{}catch(FileNotFoundException fne){}//CE:Unreachable catch block for FileNotFoundException. This exception is never thrown from the try statement body
		
	}

}
