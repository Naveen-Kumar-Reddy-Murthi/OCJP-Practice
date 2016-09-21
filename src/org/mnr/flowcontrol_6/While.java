package org.mnr.flowcontrol_6;

public class While {

	public static void main(String[] args) {
		
		/*
		 * Used for infinite number iterative code executions
		 * argument must be boolean type for while block
		 * curly braces are optional. without curly braces only one statement
		 * after while is considered part of while
		 * and that statement shouln't be declarative
		 */
		
		while(true)
			//System.out.println("Hello");// this is infinite loop//valid
			//int x=10;//invalid because without braces there can't be declarative statements
		{// having curly braces after while/any flow control statement, there can be declarative statements inside it
			int x=10;
		}
		
		/*
		 * Curious case
		 */
		
//		final int x=10;
//		final int y=20;
		
//		while(x>y) //CE:Unreachable code as x,y are constants because they are declared as final
//		{			// here compiler is aware that they are constants and can't be changed
//			System.out.println("hi");
//		}
		
		//if final is removed then there won't be unrachable code error

	}

}
