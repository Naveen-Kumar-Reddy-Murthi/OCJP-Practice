package org.mnr.generics_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		existingProblems();

	}
	
	public static void existingProblems(){
		/**
		 * Generics was introduced in java5
		 * Main purpose is for type-safety and type-casting problems
		 * Arrays are type-safe by default except for object array
		 */
		
			Object[] arr	=	new Object[]{1,2,"Naveen"};//not type-sage
			System.out.println(Arrays.toString(arr));
			int i=(int) arr[1];
			String n=(String) arr[2];
			//for object array casting is mandatory
			//for any other primitive array, we can directly read the elements
			//into their type withoug type-casting
			System.out.println(i);
			System.out.println(n);
			
			//type-safe array
			
			int[]	arr1	=	new int[3];//type-safe
			arr1[0]=1;
			arr1[1]=2;
			arr1[2]=3;
//			arr1[2]="naveen";//CE:Type mismatch: cannot convert from String to int
			int k=arr1[2];//no need of type-casting
			System.out.println("k="+k);
			
			//same is the case for raw type collections.
			//these are not type-safe
			
			ArrayList list	=	new ArrayList();//not type-safe
			
			list.add("String");
			list.add(1);
			list.add(null);
			list.add(new Float("14.5"));
			String s=(String) list.get(0);//type-unsafe
			
			ArrayList<String> list1	=	new ArrayList<String>();
			
//			list1.add(1);//CE:The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
			list1.add("naveen");
			list1.add("reddy");
			String m=list1.get(1);//type-casting not required as list1 is type-safe
			System.out.println(m);
			
			/**
			 * To overcome the above problem in Collections, Generics were introduced in java5
			 *  
			 */
	}
	
	public static void genericsDemo(){
		/**
		 * Following is the generics code for Collections
		 */
		
		 ArrayList		<String> 	list	=	new ArrayList	<String>	();
	   /*basetype*/	  /*param type*/
		 List			<String> 	list1	=	new ArrayList	<String>	();
		 /**
		  * Rules
		  * 1. param types can only be objects but not primitives
		  * 2. polymorphism is applicable for base types i.e.,
		  *    parent class ref can be used to hold child class
		  * Generic classes are nothing but parameters which are
		  * passed to Collections. These are also called as template classes
		  * Ex:
		  * Class Account<T>{
		  * ----
		  * ----
		  * }
		  * 
		  * Account<Gold> a1	=	new Account<Gold>();
		  * Account<Platinum> a2=	new Account<Platinum>();
		  */
	}
}
