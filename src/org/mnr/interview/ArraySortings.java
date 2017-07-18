package org.mnr.interview;

import java.text.MessageFormat;
import java.util.Arrays;

public class ArraySortings {

	public static void main(String[] args) {
		
		int arr[] ={10,121,12,567,39,3,2,1234};
		long startTime=System.nanoTime();
//		arr=bubbleSort(arr);
		arr=selectionSort(new int[]{10,121,12,567,39,3,2,1234});
		System.out.println(Arrays.toString(arr));
//		linearSearch(arr, 121);
		binarySearch(arr, 1234);
		System.out.println(MessageFormat.format("Operation done in {0} nano seconds",(System.nanoTime()-startTime)));
		//
		

	}

	
	public static int[] bubbleSort(int []arr){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
				arr[j]=(arr[j]*arr[j+1])/(arr[j+1]=arr[j]);
//					int temp =arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
							
					
				}
			}
		}	
		return arr;
	}
	
	
	public static int[] selectionSort(int[] arr){
		
		int minIndex,temp;
		
		for(int i=0;i<arr.length;i++)
		{	
			minIndex=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[minIndex])
						minIndex=j;
				}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;			
		}
		
		
		return arr;
	}
	
	public static void linearSearch(int[] arr, int key){
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				System.out.println(key+" found at "+i);
			
		}
		
	}
	
	public static void binarySearch(int arr[],int key){
		
		int lowIndex,highIndex,middleIndex=0;
		
		highIndex	=	arr.length;
		lowIndex	=	0;
		
		while(lowIndex<=highIndex){
			
			middleIndex		=	(highIndex+lowIndex)/2;
			
				if(key<arr[middleIndex])
				  highIndex	= middleIndex-1;
				else if(key>arr[middleIndex])
					lowIndex=middleIndex+1;
				else{
					System.out.println(key+" found at "+middleIndex);
					break;
				}
		}
		
	}
}
