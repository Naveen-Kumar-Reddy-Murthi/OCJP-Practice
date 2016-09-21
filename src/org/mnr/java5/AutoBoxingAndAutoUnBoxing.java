package org.mnr.java5;

public class AutoBoxingAndAutoUnBoxing {

	public static void main(String[] args) {
		concept();

	}
	
	public static void concept(){
		/*
		 * Automatic conversion of primitive to wrapper object is called
		 * autoboxing. Compiler is responsible to do this autoboxing
		 * Ex:
		 */
		
		Integer i=10;//autoboxing
		/*
		 * compiler equivalent code for above is 
		 * 
		 * Integer i= Integer.valueOd(10);
		 */
		
		/*
		 * Automatic conversion of wrapper object o primitive is called
		 * autounboxing
		 */
		
		Integer integer= new Integer(10);
		int j=integer;//auto unboxing
		/*
		 * compiler equivalent code for above line is
		 * int j=integer.intValue();
		 */
		
		/*
		 * Note: if null is passed for autboxing or autounboxing
		 * NPE will be thrown
		 */
//				Integer k=Integer.valueOf(null);
//				System.out.println(k);
		
		
		/*
		 * All the wrapper classes are immutable
		 * 
		 */
		
			Integer x	=	 new Integer(10);
			Integer y	=	 new Integer(10);
			
			System.out.println(x==y);//false
	}

}
