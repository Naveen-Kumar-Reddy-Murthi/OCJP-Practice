package org.mnr.operators_4;

public class EqualsOperator {

	public static void main(String[] args) {
		
		
		/*
		 * It is legal to use equal operator on every primitve types
		 */
		
		System.out.println(10==20);
		System.out.println('a'==97);
		System.out.println('x'=='f');
		System.out.println(true==false);
		
		/*
		 * = operator can be used to compare object references
		 * 
		 */
		
		System.out.println("navee"=="navee");
		System.out.println(new String("navee")==new String("navee"));
		
		/*
		 * While using == operator on objects, both object should've some
		 * relation. child-parent or parent-child
		 * else compilation error
		 */
		
//		System.out.println(new Thread()==new String());//CE:Incompatible operand types Thread and String
		
		

	}

}
