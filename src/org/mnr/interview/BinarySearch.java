package org.mnr.interview;

public class BinarySearch {

	public static void main(String[] args) {
		binarySearch(new int[]{1,2,3,4,5,6},0);

	}
	
	public static void binarySearch(int arr[],int key)
	{
		int lowIndex=0;
		int highIndex=arr.length;
		int mid=0;
		
		while(lowIndex<=highIndex)
		{
			 mid=(lowIndex+highIndex)/2;
			 
			 if(key<arr[mid]){
				 highIndex=mid-1;
			 }
			 else if(key>arr[mid]){
				 lowIndex=mid+1;
			 }
			 else if(key==arr[mid]){
				 System.out.println(key);	
			 break;
			 }
			 else{
				 System.out.println("not found");
				 break;
			 }
		}
	}

}
