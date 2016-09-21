package org.mnr.arrays_2;

import java.util.Arrays;

public class ArrayLength {

	public static void main(String[] args) {
		
		// we can declare initialise an array without new keyword like following
		int[] arr= {1,2,3};
		//above line is equals to following line
		int[] arr1= new int[]{4,5,6};
		
//		System.out.println("length:"+arr1.length);
//		System.out.println(Arrays.toString(arr1));
		
//		length is a final variable of array representing its size
//		in multidimensional arrays length represents the base size of an array
		
		int[][][] arr2={{{1,2,3},{3,2,1}},{{4,5,6,7,8},{9,10,11,12,13}}};
		System.out.println(arr2.length);
		
//		Following is the way to find total size of a multidimensional/2D array
		int size=0;
		for(int k=0;k<arr2.length;k++)
		for(int i=0;i<arr2[k].length;i++)
			for(int j=0;j<arr2[i][k].length;j++)
			size=size+arr2[k][i].length;
		
		System.out.println("Total Length:"+size);
		

	}

}
