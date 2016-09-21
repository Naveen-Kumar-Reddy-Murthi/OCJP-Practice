package org.mnr.variables_11;

public class StaticVariables {
	
	/*
	 * static variables will only have one copy for all the objects of this class
	 * static variables are loaded durin class loading
	 * It's not mandatory to initialise static variables
	 * Jvm will provide default values
	 * static variables can be accessed from anywhere either instance/static areas
	 */

	static int x=10;
	

	
	/*
	 * If static variables are declared as final, we must initialize them
	 * Jvm won't provide any default values
	 * We can initialise static variables only in two ways
	 * 1. inside static block
	 * 2.  During declaration
	 */
	
//		final static int y=10;//valid method-1
	
//		final static int y;		
//		static				//valid method-2
//		{
//			y=60;
//		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
