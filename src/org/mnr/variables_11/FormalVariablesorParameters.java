package org.mnr.variables_11;

public class FormalVariablesorParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * parameters which are declared in the method signature are called formal parameters
	 * These can be declared as final
	 * Once declared as final, we can't reassign values to method parameters in the method body
	 * Refer below example
	 */
	
	public static int sum(final int a ,final int b){//here a,b can be final
//		a=10;
//		b=20;//CE:The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		return a+b;
	}

}
