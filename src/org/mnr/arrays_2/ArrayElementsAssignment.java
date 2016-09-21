package org.mnr.arrays_2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.FutureTask;

public class ArrayElementsAssignment {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		/*
		 *CASE:1 
		 */
				//In case of primitive types as array elements,
				//we can assign any primitive types which can be automatically promoted to declared type.
				
				int[] arr=new int[5];
				byte b=12;
				short sh=123;
				int i=2888;
				long l=88888;
				char ch=67;
				arr[0]=b;
				arr[1]=sh;
				arr[2]=i;
				//arr[3]= l; // long type doesn't implicitly get converted to int, so can't assign to int type array
				arr[4]=ch;
				System.out.println(Arrays.toString(arr));
		/*
		 *CASE:2 
		 */
				//In case of object type arrays,
				//we can assign either declared or its child classes
				
				Object[] obj= new Object[3];
					obj[0]= new String("naveen");
					obj[1]= new Integer(10);
					obj[2]= new StringBuilder("NaveenReddy");
					System.out.println(Arrays.toString(obj));
					
					
				Number[] num= new Number[10];
					num[0]	=	new Integer(10);
					num[1]	=	new Double(20.77);
					num[2]	=	new Float(10.33);
//					num[3]	= 	new String("Naveen"); // String is not allowed becuase it isn't child class of Number class
					num[4]	=	new Long(2000000);
					num[5]	=   new Byte("1");
					num[6]	= 	new BigInteger("100000000");
					num[7]	=	new BigDecimal(100.567);
					num[8]	=	new Short("2000");
					System.out.println(Arrays.toString(num));
		/*
		 *CASE:3 
		 */			
				// In case of interface type arrays
				// we can assign declared type of any of its implementation classes
					
					Runnable[] run = new Runnable[2];
					run[0]	=	new Thread();
					run[1]	=	new FutureTask(new Thread(), "naven");
//					run[2]	=	new String("NaveenReddy");// String isn't implementation class of Runnable so not allowed
					System.out.println(Arrays.toString(run));
					
		/*
		 *CASE:4
		 */
				// In case of Abstract class type arrays
				// we can assign its child class objects
					
					AbstractClass[] abs	=	new AbstractClass[2];
					abs[0]	=	new AbstractImpl();
//					abs[1]	=	new String(""); // Not allowed since String is not an impl of Abstract Class
					System.out.println(Arrays.toString(abs));
	}

}
