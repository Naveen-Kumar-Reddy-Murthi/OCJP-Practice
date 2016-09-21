package org.mnr.flowcontrol_6;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * If number of iterations are known then
		 * for loop is used
		 * There are three parts in for loop
		 * instaniation, conditional check, increment/decrement section
		 * curly braces are optional and without them we can only take 
		 * one statement after for loop,which shouldn't be declarative
		 * But with curly braces it can be declarative statement
		 */
		
		//	<--1-->	<-2-> <-3->
		for(int i=0;i<10;  i++);//Even empty for loop is valid statement
//			int j=0;//CE:The left-hand side of an assignment must be a variable
//			{int j=0;}//valid because of curly braces
		/*
		 * 1-->Initialisation part;It is optional, can be leftout empty
		 *     executed only once at the begining of the for loop
		 * 	   Here we can declare any number of local variables,but of the same type
		 * 	   Declaring different type of variables will result in CE
		 * 	   In initialisation part, we can declare any valid java statement i.e., sop etc. 
		 */
			
				//for(System.out.println("hello");;);//prints hello
				
				/*int k=0;
				for(System.out.println("hello1");k<3;k++)
					System.out.println("hi1");*/
		
		/*
		 * 2-->conditional check
		 * 	   It is also optional and can be any valid java statement returning boolean type value
		 * 	   If it leftout empty, compiler will always return true
		 */
		
				/*for(int x=0;;x++)
					System.out.println(x);*/ //An infinite loop
		
		/*
		 * 3-->increment/decrement section
		 * 	   It is also optional
		 * 	   It can be any valid java statement including sop
		 */
		
//				for(int z=0;z<3;System.out.println(z));// An infinite loop
		
		
		/*
		 * All three parts of for loop is independent and optional
		 */
		
//				for(;;);//An infinite loop
		
				/*for(;;)
					System.out.println("hello world");*///An infinite loop
	}

}
