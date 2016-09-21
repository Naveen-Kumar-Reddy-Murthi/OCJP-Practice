package org.mnr.interfaces_13;

public class InterfaceMethodNamingConflicts implements Left, Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * Since both Left and Right interfaces have exactly same abstract method(m1),
	 * in the implementation class we can only have one method
	 * obviously we can't have duplicate methods in a class
	 * 
	 * Lef and Right interfaces have a method(m2) with same signature but with different 
	 * arguments.
	 * In this case, implementation class can implement both methods, no conflict
	 * 
	 * Left and Right interfaces have a method(m3) with same signature arguements
	 * It's impossible to implement those two interfaces having m3 method unless
	 * return types are co-variant types
	 * 
	 */
	
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(String val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(int val) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public int m3() {//CE:The return type is incompatible with Left.m3()
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	

}
