package org.mnr.interview.pramati;

import java.util.Arrays;

public class SortZeroesAndOnes {

	public static void main(String[] args) {
//		int []arr= {0,1,0,1,0,1,0,1,1,1};
		
		
		int []arr= {0,1,0,1,0,1,0,1,1,1};
		
		System.out.println(Arrays.toString(sort(arr)));

	}
	
	public static int[] sort(int []arr){
		
		int temp=0;
		boolean flag=false;
		
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=0;j<arr.length-i-1;j++){
				
				if(arr[j]>arr[j+1]){
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
