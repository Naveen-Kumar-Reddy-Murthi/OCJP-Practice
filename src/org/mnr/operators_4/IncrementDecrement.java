package org.mnr.operators_4;

public class IncrementDecrement {
	
	public static int x=10;
	public static int y=0;

	public static void main(String[] args) {
		
//		y=x++;// here x will be increment after the assignment to y
//		y=++x;// here x is incremented prior to assignment 
//		y=x--;
//		y=--x;
//		print();
		
		/*
		 * Pre and Post incremental operators are applicable only for 
		 * variables but not for literal values
		 * Refer below example
		 */
		
//			System.out.println(10++);//CE:Invalid argument to operation ++/--
		
		/*
		 * Nesting of increment/decrement operators are not allowed
		 * Refer below example
		 */
		
//			y=++(++x);//CE:Invalid argument to operation ++/--
		
		/*
		 * We can't apply increment/decrement operators for final variables
		 * Refer below example
		 */
		
//			final int v=10;
//			v++;	//CE:The final local variable v cannot be assigned. It must be blank and not using a compound assignment

		
		/*
		 * We can apply increment/decrement operator on any primitive types
		 * except for boolean
		 */
		
//			float fl=10.2111111f;
//			System.out.println(++fl);
		
//			boolean	check=false;	
//			check++;	Invalid//CE:Type mismatch: cannot convert from boolean to int
		
		
		
		
	}
	
	public static void reset(){
		x=10;
		y=0;
	}
	
	public static void print(){
		System.out.println("y= "+y);
		System.out.println("x= "+x);	
		reset();
	}
	
	

}
