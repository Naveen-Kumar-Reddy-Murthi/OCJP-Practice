package org.mnr.interfaces_13;

public interface InterfaceVariables {
	
	/*
	 * An interface can have variables
	 * Any variable inside an interface is a constant i.e., public static final
	 * Where it is declared or not
	 * Since interface variables are final, they must be initialised otherwise CE
	 */
	
	int value=100;
	
	/*
	 * Since above variable is public static, it can be accessed from anywhere
	 * Even using interface name InterfaceVariables.value
	 */

}
