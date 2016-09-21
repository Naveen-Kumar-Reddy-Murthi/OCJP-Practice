package org.mnr.accessmodifiers_10;

public class DefaultTestClass {

	public static void main(String[] args) {
		
		/*
		 * as this is being accessed within the package, then it is allowed
		 */
		
		DefaultClass defaultClass	= new DefaultClass();
		defaultClass.show();

	}

}
