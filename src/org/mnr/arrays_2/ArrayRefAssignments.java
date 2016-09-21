package org.mnr.arrays_2;

import java.util.Arrays;

public class ArrayRefAssignments {

	public static void main(String[] args) {
		/*
		 * CASE:1
		 */
				 // When we assign one array to another array, source array elements won't 
				 // be copied to destination array. Only ref variable will be reassigned
				 //	Sizes need not match
				 //	But type of array must same for both source and destination array
					int[] a = {1,2,3};
					int[] b = new int[0];
					b=a; //here b is just a reference pointing to a
					System.out.println(Arrays.toString(b));
					System.out.println(a==b);// both pointing to same object, hence returns true.
		/*
		 * CASE:2 
		 */
				// Array element level promotions are not allowed at array object level
			    // For example, char array element can be promoted to int type
				// But char array can't be promoted to int array
					
					int intArr1[]	=	{1,2,3,4,5};
				   char charArr[]	=	{'a','b','A','\n'};//{1,2,3,4,5};
				   int intArr2[]	=	intArr1;	//allowed as both are int types
//				   int ar3[]		=	charArr;	//Type mismatch: cannot convert from char[] to int[]
//				   charArr			=intArr2;		//Type mismatch: cannot convert from int[] to char[]
		/*
		 * CASE:3 
		 */	   
				 //When assigning one array to another both arrays should have same dimensions
				 // dimensions and types must be matched
				   
				   int[][] twoDArr	=	{{1,2},{3,4}};
				   int[][] twoDArr1	=	twoDArr; // Allowed
//				   int[]	arr		=	twoDArr; //Type mismatch: cannot convert from int[][] to int[]
				   
				   int[][] twoDArr2	= new int[3][2];
				   	twoDArr2[0]= new int[6];// Allowed here even sizes need not to be matched
				   		 
				   		 
		
					
	}

}
