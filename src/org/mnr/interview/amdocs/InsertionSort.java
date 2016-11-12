package org.mnr.interview.amdocs;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String...args){
		
		int[] arr	=	{23,45,711,0,1,5,-1};
		int temp	=	0;
		
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
