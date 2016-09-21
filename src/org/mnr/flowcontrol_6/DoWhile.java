package org.mnr.flowcontrol_6;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		 * For do-while loop curly braces rule is same as for others
		 * do-while loop gets executed atleast once despite condition is false/may fail
		 */
		
//			do	
//				System.out.println("hello");
//			while(true);//infinite loop	
//			System.out.println();//unreachable code as it is the line after infinite lop
		
//			do;//it is an empty do block so valid
//			while(true);//valid
			
//			do		
//				int x=10;	//Invalid as there are no curly braces 
//			while(true);
		
		
//			do		{
//				int x=10;	//valid as there are curly braces
//			}
//			while(true);
			
			do		
				System.out.println("hello");//valid loop will break after it is 
			
			while(false);
			System.out.println("hi1133333333");
	}

}
