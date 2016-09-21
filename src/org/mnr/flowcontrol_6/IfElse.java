package org.mnr.flowcontrol_6;

public class IfElse {

	public static void main(String[] args) {
		/*
		 * arguement to if bock should be of boolean types
		 * otherwise we will get compilation error
		 * Curly braces are optional
		 * In this case only the first statement after if/else
		 * will be executed as part of the block
		 * That statement after if can't be declarative statement
		 */
		
		int x=20;
		if(x==20)//valid
//		if(x=20)//CE:Type mismatch: cannot convert from int to boolean
//		if(x)//CE: change x type to boolean
//		int y=10;//CE:The left-hand side of an assignment must be a variable
			System.out.println("Hello");
		else
			System.out.println("No Hello");
		;//it is valid statement in java known as empty statement
		
		/*
		 * There's no dangling else issue in java
		 * Every else block will be mapped to nearest if block
		 */

	}

}
