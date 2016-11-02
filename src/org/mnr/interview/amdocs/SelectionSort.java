package org.mnr.interview.amdocs;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr	=	{23,45,711,0,1,5,-1};
		int minIndex,temp = 0;
		for(int i=0;i<arr.length;i++){
			
			minIndex=i;
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println("Selection Sort:"+Arrays.toString(arr));
	}

}
