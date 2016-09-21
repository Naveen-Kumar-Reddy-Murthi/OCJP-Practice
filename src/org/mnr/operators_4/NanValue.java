package org.mnr.operators_4;

public class NanValue {

	public static void main(String[] args) {
		
		/*
		 * For integral arithmetic (byte,short,int,long)
		 * There's noway to represent undefined values or Nan
		 * But for floating point arithmetic ,there's a way
		 * It will give you arithmetic exception
		 */ 
//			System.out.println(0/0);  //RE:Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		 
		 /* 
		 * Float and Double classes have Nan constant
		 */
			
//			System.out.println(0/0.0);//NaN
//			System.out.println(0/-0.0);//NaN
//			System.out.println(-0%0.0);//NaN
		
		/*
		 * For any value including Nan, any comparison 
		 * will return false
		 */
			System.out.println(Float.NaN>0);
			System.out.println(Float.NaN<0);
			System.out.println(Float.NaN>=0);
			System.out.println(Float.NaN<=0);
			System.out.println(Float.NaN==0);
			
			System.out.println(Float.NaN!=10);//true
			System.out.println(Float.NaN!=Float.NaN);//true
			
			/*
			 * Note:
			 * ArithmeticExcpetion occurs only because of
			 * integral values not float
			 * 
			 */
		

	}

}
