package org.mnr.accessmodifiers_10;

final class FinalClass {
	
	/*
	 * data members in final class are not final by default
	 * If specified they are final and can't be changed
	 *  Disadvantages:
	 *  	Loses main oops features inheritance and polymorphsim
	 *  Adv: Security can be achieved by restricting functionality to single unit
	 *  final, abstract modifier combinations are illegal
	 *  final class can't contain an abstract method
	 */
	 int val=0;
	
	/*
	 * Methods of a final class are final by default whether specified or not
	 * Since final class can't be extended, then there's noway to override methods of final class
	 */
	public void m1(){
		System.out.println("m1 method");
	}

}
