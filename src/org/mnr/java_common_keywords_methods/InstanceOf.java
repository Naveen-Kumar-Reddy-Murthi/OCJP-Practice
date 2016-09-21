package org.mnr.java_common_keywords_methods;

public class InstanceOf {

	public static void main(String[] args) {
		/*
		 * instanceof keyword to used to determine whether the given
		 * reference belongs to particular type
		 */

		String s="";
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		/*
		 * when using instanceof operator, both operands must have some
		 * relationship parent-child or child-parent otherwise CE
		 */
		
//		System.out.println(s instanceof Thread);//CE:Incompatible conditional operand types String and Thread
		Thread t = new Thread();
		System.out.println(t instanceof Object);
	}

}
