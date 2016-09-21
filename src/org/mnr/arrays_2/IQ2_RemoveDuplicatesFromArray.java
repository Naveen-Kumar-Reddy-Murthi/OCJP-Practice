package org.mnr.arrays_2;

import java.util.Arrays;

public class IQ2_RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,3,4,4};
		//System.out.println(Arrays.toString(arr));
		arr=removeDuplicates(arr);
		
	}

	public static  int[] removeDuplicates(int[] arr){
		
		int counter=0;
		arr[counter]=arr[0];
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("counter:"+counter+" | "+"i:"+i);
	    	System.out.println(arr[counter]+" | "+arr[i]);
	        if (arr[counter]!=arr[i])
	        { 
	        	counter++;
	            arr[counter]=arr[i];
	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println();
	    }

	    return arr;
	}
	
public static  int[] removeDuplicates1(int[] arr){
		
		int counter=0;
		arr[counter]=arr[0];
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("counter:"+counter+" | "+"i:"+i);
	    	System.out.println(arr[counter]+" | "+arr[i]);
	        if (arr[counter]!=arr[i])
	        { 
	        	counter++;
	            arr[counter]=arr[i];
	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println();
	    }

	    return arr;
	}
	
}
