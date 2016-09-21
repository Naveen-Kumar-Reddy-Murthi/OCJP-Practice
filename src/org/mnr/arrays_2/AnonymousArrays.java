package org.mnr.arrays_2;

public class AnonymousArrays {
	
	
	public static void main(String...args){
		sum(new int[]{1,2,3,4,5,6});//here arguement is an anonymous array because it is not having a name
		//For anonymous array we can't specify the size as we are initialising the array directly
		
		
	}
	
	public static void sum(int[] arr){
		int sum=0;
		
		for(int x:arr)
			sum=sum+x;
		
		System.out.println("Sum of array elements is:"+sum);
		
	}

}
