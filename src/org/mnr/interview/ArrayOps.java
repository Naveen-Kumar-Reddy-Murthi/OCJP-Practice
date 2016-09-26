package org.mnr.interview;

import java.text.MessageFormat;
import java.util.Arrays;

public class ArrayOps {

	public static void main(String[] args) {
		int arr[]={256,56,156,22,23,1,6};
		//System.out.println("Before Sorting..");
		System.out.println(Arrays.toString(arr));
		//arr=selectionSort(arr);
		arr=bubbleSort(arr);
		//System.out.println("After  Sorting..");
		System.out.println(Arrays.toString(arr));

	}

	public static int[] selectionSort(int arr[]){
		long startTime=System.nanoTime();
		int i,j,minIndex,minValue,temp=0;
		
		for(i=0;i<arr.length;i++) 
		{
			minIndex=i;
			minValue=arr[i];
			
				for(j=i+1;j<arr.length;j++)
				{
					if(minValue>arr[j])
					{
						minIndex=j;
						minValue=arr[j];
					}
				}
				temp=arr[i];
				arr[i]=minValue;
				arr[minIndex]=temp;	
		}
		//System.out.println(MessageFormat.format("Sorting completed in {0} seconds", (double) (System.nanoTime()-startTime)/1000000000) );
		System.out.println(MessageFormat.format("Array sorted in {0} nano Seconds", System.nanoTime()-startTime));
		return arr;
	}
	
	public static int[] bubbleSort(int []arr){
		long startTime=System.nanoTime();
		for(int i=0;i<arr.length;i++){	
			for(int j=0;j<arr.length-1;j++){		
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
		
		System.out.println(MessageFormat.format("Array sorted in {0} nano Seconds", System.nanoTime()-startTime));
		return arr;
	}
}
