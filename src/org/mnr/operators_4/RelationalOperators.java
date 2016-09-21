package org.mnr.operators_4;

public class RelationalOperators {

	public static void main(String[] args) {
		/*
		 * Relational operators(<,>,<=,>=) can only be applied on
		 * primitives but not on objects
		 */
		
		int a='a';
		System.out.println(a);
		System.out.println('a'>65);
		
		/*
		 * Can't apply on objects otherwise jvm will throw
		 * compilation error
		 */
		
//		System.out.println("naveen">"naveen");//CE:The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		
		/*
		 * We can't nest relational operators either
		 * JVM will throw compilation error
		 */
		
//		System.out.println(10<20<40);//CE:The operator < is undefined for the argument type(s) boolean, int
	}

}
