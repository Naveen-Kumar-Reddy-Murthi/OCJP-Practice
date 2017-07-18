package org.mnr.interview.pramati;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr	=	{23,45,711,0,1,5,-1,9};
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println("selection sort");

	}
	
	
	public static int[] selectionSort(int []arr){
		int temp=0;
		int minIndex=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-2;i++){
			minIndex= i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;	
			System.out.println(Arrays.toString(arr));
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}

}
