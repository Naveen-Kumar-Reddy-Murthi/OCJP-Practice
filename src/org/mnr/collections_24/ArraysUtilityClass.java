package org.mnr.collections_24;

import java.util.Arrays;
import java.util.List;

public class ArraysUtilityClass {

	public static void main(String[] args) {
		
//		sortMethod();
//		searchMethod();
		asListMethod();
	}
	
	public static void sortMethod(){
		/**
		 * This Arrays utility will sort Object array according to both natural order
		 * and customized sorting order
		 * But primitive arrays can only be sorted using natural sorting order.
		 */
		 int intArr[] = new int[]{66,7,1,2,45,9,7,6,0,-1,22};
		 System.out.println("before sorting:"+Arrays.toString(intArr));
		 Arrays.sort(intArr);
		 System.out.println("after  sorting:"+Arrays.toString(intArr));
		 
		 String stringArr[]	=	new String[]{"Z","A","L","K","M","B"};
		 System.out.println("before sorting:"+Arrays.toString(stringArr));
		 Arrays.sort(stringArr, new MyComparator1());//custom sorting reverse alphabetical order
		 System.out.println("After  sorting:"+Arrays.toString(stringArr));
	}
	
	public static void searchMethod(){
		
		/**
		 * For primitive array sorted in natural sorting order, we should use 
		 * the following method
		 * Array should be sorted prior calling this method
		 * Same rules apply for Object array
		 */
		 int intArr[] = new int[]{66,7,1,2,45,9,7,6,0,-1,22};
		 System.out.println("before sorting:"+Arrays.toString(intArr));
		 Arrays.sort(intArr);
		 System.out.println("after  sorting:"+Arrays.toString(intArr));
		 System.out.println(Arrays.binarySearch(intArr,66));
		 
		 /**
		  * For custom sorted array
		  */
		 String stringArr[]	=	new String[]{"Z","A","L","K","M","B"};
		 System.out.println("before sorting:"+Arrays.toString(stringArr));
		 Arrays.sort(stringArr, new MyComparator1());//custom sorting reverse alphabetical order
		 System.out.println("After  sorting:"+Arrays.toString(stringArr));
		 System.out.println(Arrays.binarySearch(stringArr,"K",new MyComparator1()));
		 
	}
	
	public static void asListMethod(){
		/**
		 * There are utility methods converts array to collection
		 * Collections created from these methods can't be modified
		 * i.e., their lengths can't be changed i.e., add/remove
		 * set method works though
		 */
		String stringArr[]	=	new String[7];
		stringArr[0]="Z";
		stringArr[1]="A";
		stringArr[2]="L";
		stringArr[3]="K";
		stringArr[4]="M";
		stringArr[5]="B";
		List list	=	Arrays.asList(stringArr);
		/**
		 * here above statement just made a reference to stringArr
		 * Its just a pointer to stringArr
		 * Any changes to this array will reflect in the created list
		 */
		System.out.println(list);
//		list.add("BB");//RE:java.lang.UnsupportedOperationException
//		list.remove(1);//RE:java.lang.UnsupportedOperationException
		list.set(0, "ZZ");//works
		stringArr[6]="Naveen";
		System.out.println(list);
		
	}

}
