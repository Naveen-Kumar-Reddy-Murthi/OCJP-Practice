package org.mnr.arrays_2;

public class UnInitializedArrayBehaviour {

	
	int[]	arr;
	
	int[]  arr1	=	new int[3];
	
	static int[]	arr2;
	
	static int[]	arr3	=	new int[3];
	
	public static void main(String[] args) {
		
		
		
		UnInitializedArrayBehaviour obj	=	new UnInitializedArrayBehaviour();
//		System.out.println(obj.arr);//null
//		System.out.println(obj.arr[0]);//NPE
		
//		System.out.println(obj.arr1);//hashcode
//		System.out.println(obj.arr1[0]);//default vaule i.e., zero

//		System.out.println(UnInitializedArrayBehaviour.arr2);	//null
//		System.out.println(UnInitializedArrayBehaviour.arr2[4]);//NPE
		
//		System.out.println(UnInitializedArrayBehaviour.arr3);	//hashcode
//		System.out.println(UnInitializedArrayBehaviour.arr3[2]);//default vaule i.e., zero
		
//		int[] arr4;
		
//		System.out.println(arr4);//CE local variable must be initialised
//		System.out.println(arr4[2]);
		
		int[]	arr5	=	new int[5];
		//here even though array is local variable, it will be initialised with default values
		
		System.out.println(arr5);
		System.out.println(arr5[2]);
		
		
	}

}
