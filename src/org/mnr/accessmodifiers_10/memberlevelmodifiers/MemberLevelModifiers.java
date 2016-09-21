package org.mnr.accessmodifiers_10.memberlevelmodifiers;

public class MemberLevelModifiers {
	
	
	/*
	 * public method is accessible from anywhere any package
	 * For this to happen, This class also must be public
	 * Otherwise corresponding modifier rules will apply for the method too.
	 * 
	 */
	public void m1(){
		
		System.out.println("public Method m1");
	}
	
	/*
	 * This method is available for this class only
	 * No other class anywhere is allowed use this method
	 */
	private void m2(){
		
		System.out.println("private Method m2");
	}
	
	
	/*
	 * This offers access <default>+kids
	 * This method can be accessed in the current package as well as 
	 * in child classes outside the current package
	 * Within in the package we can parent reference/child reference to access this method
	 * But outside package in child classes, to access this method
	 * we can only use child reference to access this method but not parent reference
	 */
	protected void m3(){
		
		System.out.println("protected Method m3");
	}
	
	
	/*
	 * This method is accessible in the classes that present in the package this class resides
	 * Also from child class with in this package
	 * No other classes are allowed to access it
	 */
	void m4(){
		
		System.out.println("default Method m4");
	}
	
	/*
	 * can be accessed from anywhere as long as this class is public
	 * Acess of this method depends on this class level modifier
	 * This method can't be overrided in child class
	 */
	
	public final void m5(){
		
		System.out.println("final Method m5");
	}
	
	
}
