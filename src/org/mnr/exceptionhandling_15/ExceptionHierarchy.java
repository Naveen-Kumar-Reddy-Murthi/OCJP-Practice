package org.mnr.exceptionhandling_15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHierarchy {

	public static void main(String[] args) {
		/*
		 * Throwable class is base class for all kinda exceptions
		 * It has two child class Exception and Error
		 * Exceptions:Caused by programmer wrong logic
		 * Error: Caused due to machine resources
		 * Exceptions: RuntimeException, IOException, InterruptedException,ServletExceptions
		 * Errors: VMError, StackOverflowError,OutOfMemoryError,LinkageError,VerifyError,AssertionError
		 * UncheckedExceptions: Which are not checked by compiler Ex:RuntimeExceptions and its subclasses
		 * CheckedExceptions: Which are not checked by compiler. Error and its subclasses and  IOException, InterruptedException,ServletExceptions
		 * 
		 */

//			checkedExceptions();
//			unCheckedExceptions();
//			Error();
			System.out.println(returnInExceptions());
	}
		
	public static void checkedExceptions(){
		
		try {// we can either surround with try-catch or throw it to the caller then caller has to handle
			FileInputStream fin	= new FileInputStream("C:\\Users\\Naveen Reddy\\desktop\\magnets.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void unCheckedExceptions(){
		
		//System.out.println(0/0);//here a runtime exception will occur but it need not to be handled
	}
	
	public static void Error() {
		try {
			int array[] = new int[Integer.MAX_VALUE];// Exception in thread
														// "main"
														// java.lang.OutOfMemoryError:
														// Java heap space
			System.out.println("After array");
		} catch (Throwable error) {// its possible to catch errors but it's not
									// recommanded. Because you never know, even
									// if we handle there's no guaruntee that
									// program will run consistenlty
			System.out.println("error:" + error.toString());

		}
		System.out.println("After catching the exceptions");
	}
	
	public static void tryWithMultipleCatchBlocks(){
		
		/*
		 * If there are multiple catch blocks, order of catch blocks must be child to parent 
		 */
		try{
			//1
			//1.1
		}
		catch(ArithmeticException exception){
			//2
		}
		catch(Exception exception){
			//3
		}
		catch(Throwable exception){
			//4
		}
		finally{ 
			//5
		}
		
		/*
		 * In the above code if any exceptions occurs at 1.1 and there is matching catch block then flow is 1,catch,5
		 * if there is no matching catch block 1 and abnormal termination
		 * if there is an exception at 2/3/5 then abnormal termination
		 * 
		 */
		}
	public static int returnInExceptions(){// this always returns 3
		//finally dominates return statement
		try{
			return 1;
		}
		catch(Throwable th){
			return 2;
		}
		finally{// this block will always executes nomatter what except there is system.exit before this block
			return 3;
		}
	}
	
}
