package org.mnr.interview;

import java.util.Arrays;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int[] arr = new int[]{0,0,1,2,3};
		arr=removeDups(arr);
		System.out.println(Arrays.toString(arr));

	}
   public static int[] removeDups(int[] arr){
	   
	   if(arr.length<2)
		   return arr;
	   
	   int[] out=null;
	   int i=1,j=0;
	   while(i<arr.length)//{0,0,1,2,3}
	   {
		   if(arr[i]==arr[j])
			   i++;
		   else
			   arr[++j]=arr[i++];
		   System.out.print(i+":");
			System.out.println(Arrays.toString(arr));
	   }
	   
	   out=Arrays.copyOf(arr,j+1);
	
	   return out;
   }
	
}
