package org.mnr.javamodifiers_12;

public class Native {

	public static void main(String[] args) {
		
		/*
		 * native keyword is only applicable for methods
		 * these methods are implemented mostly in c or c++
		 * these are for achieving machine level communication
		 * native and strictfp is illegal combination as mother languages may or may not follow IEEE standards
		 */

	}
	
	public native void  m1();
	//{}//CE:Native methods do not specify a body

}
