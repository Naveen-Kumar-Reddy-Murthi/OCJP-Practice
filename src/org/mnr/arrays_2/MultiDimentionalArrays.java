package org.mnr.arrays_2;

import java.util.Arrays;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
//		Multidimensional arrays are nothing but array of arrays. And it is not matrix implementation
//		
		int[][] a;
		a= new int[3][3];// here we are declaring 3x3array
//		That means it is an array of size 3 with each element being another array with size 3
//		second dimension is optional while declaring/initialising the array
//		It is even possible to declare uneven sized array like the following
		
		int [][]b;
		b= new int[2][];// here number of rows must be specified i.e., first dimension otherwise compilation error is thrown
//		here i wil provide the size individually for each internal array
		
		b[0]=new int[4];// 
		b[1]=new int [5];
		
//		Another way of declaring and initialising multidimensional array in single array
//		if any kind of array is being created and initialised in same line then
//		there is no need of specifying the dimensions.
		int [][] c= {
					 {1,2,3},
					 {1,2,3,4,5,6},
					 {6},
					 {1,2,3,4,5,6,7,8,9,9,99,999,99999,888,10,11}
		    		};
		for(int i=0;i<c.length;i++)
		System.out.println(Arrays.toString(c[i]));
			
		//for
		
		int[][][] d= new int[3][7][3];// here also number of rows, i.e., first dimension must be specified otherwise compilation error is thrown 
//		here d is an array having three rows and each row having seven elements and each of seven element is
//		is an array of size 3
		for(int i=0;i<d.length;i++)
			for(int j=0;j<d[i].length;j++)
				for(int k=0;k<d[i][j].length;k++)
			System.out.println(d[i][j].length);
	
	}
	

}
