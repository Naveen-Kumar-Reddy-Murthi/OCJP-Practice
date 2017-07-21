package org.test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int arr[] = {100,4,200,1,8,10,3,2,6,7,9,5,11,12,13};
		
		System.out.println(Arrays.toString(sort(arr)));
		System.out.println(findLongestSeqLength(arr));

	}
	
	private static int findLongestSeqLength(int[] arr){
		int length=1;
		int temp =0;
		int minIndex=0;
		for(int i=0;i<arr.length-1;i++){
			minIndex=i;
			
			for(int j=minIndex;j<arr.length-2;j++){
				if(arr[j]+1==arr[j+1])
					length++;
				else {
					if(length>temp)
					temp=length;
					length=1;
					break;
				}
				
			}	
		}
		return temp;
		
	}
	
	
	private static int[] sort(int arr[]) {
		
		int temp =0;
		boolean flag= false;
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length-i-1;j++){
				 
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				
			}
			if(flag==false)
				break;
		}
		
		return arr;
	}

}
