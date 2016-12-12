package org.mnr.arrays_2;

import java.util.Arrays;

public class IQ1_MissingNumberInArray {

	public static void main(String[] args) {
		
		int[] arr	=	new int[101];
		for(int i=1;i<=100;i++){
			if(i!=50)
				arr[i]=i;		
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Missing value is:"+(getSumOfNValues(100)-getSum(arr)));
	}
	public static int getSum(int[] arr){
		
		if(arr.length<=0)
			return 0;
		
		int sum	= 0;
		for(int value:arr)
			sum=sum+value;
		
		return sum;
	}
	
	public static int getSumOfNValues(int maxVal){
		
	
		int sum=0;
			sum=(maxVal*(maxVal+1))/2;
			
		return sum;
	}
}
