package org.mnr.imports_8;

import static java.lang.Math.sqrt;// its static import
import static java.lang.System.out;//its a static import
import static java.lang.Integer.MAX_VALUE;// static import

public class StaticImports {

	static final int MAX_VALUE=900;
	public static void main(String[] args) {
		
		concept();
		staticImportPrecedence();

	}
	
	public static void concept(){
		
		/*
		 * introduced in java5
		 * used to access static members of a class without class name by import static
		 * Explicit static import: import static java.lang.Math.sqrt;
		 * Implicit static import: import static java.lang.System.*;
		 */
		
		out.println(sqrt(4));// instead of importing java.lang.Math.* & java.lang.*; and using like Math.sqrt()
		out.println(MAX_VALUE);
	}
	
	public static void staticImportPrecedence()
	{
		/*
		 * Static import precedence follows like this
		 * 1. Current clas static members or local final constants if its inside a method
		 * 2. Explicit static import
		 * 3. Implicit static import
		 */
		
		final int MAX_VALUE=123;
		out.println(MAX_VALUE);
		
	}
	
}
