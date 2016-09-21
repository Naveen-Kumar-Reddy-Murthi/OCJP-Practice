package org.mnr.java7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptionCatchingInSingleCatchBlock {

	public static void main(String[] args) {
		/*
		 * until java6 eventhough all catch blocks are having same handling code
		 * we need to write it in each catch block
		 * java7 simplifies this by handling multiple exceptions within a single catch block
		 * 
		 */
		concept();
	}
	
	public static void concept(){
		try{
			int arr[]={1,2,3};
			String name=null;
//			System.out.println(0/0); //java.lang.ArithmeticException: / by zero
//			System.out.println(name.equals(""));//java.lang.NullPointerException
			System.out.println(arr[20]);//java.lang.ArrayIndexOutOfBoundsException: 20
			
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();	
		}
//		catch(IOException | FileNotFoundException exception){}//here when catching multiple exceptions there must'nt be any releation between those exceptions
		//either parent-child or child-parent are allowed. CE
	}
}
