package org.mnr.mainMethod_3;

public class ChildClassWithoutMainMethod extends MainMethod {

	/*
	 * If a class isn't having a main method and we try to run it
	 * it will execute the main method of its superclass
	 * if it is extending any class otherwise RE:NoSuchMethodException
	 */

	
	/*
	 * But from 1.7 onwards, if a class has no main method,
	 * then jvm will throw RE:NoSuchMethodException
	 * Even static blocks won't be executed without main method
	 */
}
