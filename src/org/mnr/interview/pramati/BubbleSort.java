package org.mnr.interview.pramati;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {22,11,10,-3,4,-7,0,5};
//		int[] arr = {1,2,3,4,5,6,7,8};
		bubbleSort(arr);

	}
	
	public static int[] bubbleSort(int arr[]){
		System.out.println(Arrays.toString(arr));
		int temp,loopCount =0;
		boolean flag =false;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				loopCount++;
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				System.out.println(Arrays.toString(arr));
				if(flag==false)
					break;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("total loopCount:"+loopCount);
		
		return arr;
	}
	
}
