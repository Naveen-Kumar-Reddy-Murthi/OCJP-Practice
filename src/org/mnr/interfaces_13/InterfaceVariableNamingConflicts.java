package org.mnr.interfaces_13;

public class InterfaceVariableNamingConflicts implements Left, Right{

	public static void main(String[] args) {
		
		/*
		 * Both Left and Right interfaces have a variable with name x
		 * Now we can't access that variable directly using name
		 * compiler throws ambiquity error
		 * To solve this, we need to use those variables using interface
		 */
		
//		System.out.println(x);//CE:The field x is ambiguous
		
		System.out.println(Right.x);
		System.out.println(Left.x);
		

	}

	@Override
	public void m2(String val) {
		// TODO Auto-generated method stub
		
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
