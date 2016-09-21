package org.mnr.operators_4;

public class Infinity {

	public static void main(String[] args) {
		
		/*
		 * For integral values, there's noway to represent infinity
		 * If there is infinite result, jvm will throw arithmetic excpetion
		 * Refer below example
		 */
		
//		System.out.println(10/0);
		
		/*
		 * But for floating type arithmetic, there's way to represent infinite
		 * For float and double primitives, we can represent like following
		 */

		System.out.println(10.0/0);//positive infinity
		
		System.out.println(-10.0/0);//negetive infinity
	}

}
