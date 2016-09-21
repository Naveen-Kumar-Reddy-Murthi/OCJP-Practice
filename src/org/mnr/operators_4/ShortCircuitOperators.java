package org.mnr.operators_4;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		
		/*
		 * Same as bitwise operators
		 * but much faster
		 * &&: returns true if both operands are true. Here evaluation of second operand is optional
		 * 		i.e., if first operand turns out to be false, second operand won't be evaluated
		 * ||: returns true if one of the operands is true. Here evaluation of second operand is optional
		 * 		i.e., if first operand turns out to be true, second operand won't be evaluated
		 */
//		System.out.println(check(2)&&check(1));//check gets called only once as check(2) is false
//		System.out.println(check(2)&check(1));//check gets called twice as operator isn't short-circuit
		
//		System.out.println(check(1)||check(2));//check gets called only once as check(1) is true
		System.out.println(check(1)|check(1));//check gets called twice as operator isn't short-circuit
	

	}
	
	public static boolean check(int i)
	{
		System.out.println("check called:"+i);
		if(i==1)
			return true;
		return false;
	}

}
