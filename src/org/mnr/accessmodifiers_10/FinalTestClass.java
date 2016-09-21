package org.mnr.accessmodifiers_10;

//public class FinalTestClass  extends FinalClass {//can't extend final classes CE: The type FinalTestClass cannot subclass the final class FinalClass
public class FinalTestClass {
	public static void main(String[] args) {
		
		
		/*
		 * 
		 */
		
		FinalClass finalClass	=	new FinalClass();
		/*
		 * since data members of final classes are not final by default, they can be changed
		 * 
		 */
		finalClass.val=25;
		System.out.println(finalClass.val);

	}

}
