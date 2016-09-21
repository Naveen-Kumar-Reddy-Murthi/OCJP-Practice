package org.mnr.classtypes_14;

import org.mnr.interfaces_13.Left;

public class AdapterClass implements Left{

	public static void main(String[] args) {
		/*
		 * A class implementing an interface with empty implementation
		 * An implementation of an interface enforces impl class to implement all methods even though not all are required for that class
		 * Using Adapter classes we can solve this problem. 
		 * We can have user defined adapter class
		 * This class is an adapter class
		 * Now we can simply extend this class and override required methods
		 * Main purpose of Adapter Classes are reducing the code length
		 * Ex:GenericServlet, HttpServlet
		 */

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(int val) {
		// TODO Auto-generated method stub
		
	}

}
