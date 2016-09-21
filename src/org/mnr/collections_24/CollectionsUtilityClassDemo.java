package org.mnr.collections_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
@SuppressWarnings({ "unchecked", "rawtypes" })
public class CollectionsUtilityClassDemo {

	public static void main(String[] args) {
				
		sortMethod();
//		binarySearchMethod();
//		reverseMethod();
//		Collections.
	}
	
	
	public static void sortMethod(){
		ArrayList<String>	list	=	new ArrayList<String>();
		list.add("Z");
		list.add("A");
		list.add("K");
		list.add("N");
//		list.add(new Integer("10"));
		System.out.println("before:"+list);
//		Collections.sort(list);
		Collections.sort(list,new MyComparator1());
		//if we use this method, any collection passed 
		//to this method should be homogeneous otherwise RE: java.lang.ClassCastException:
		System.out.println("after :"+list);
		
		Collections.sort(list,Collections.reverseOrder());//sorted in reverse order
		System.out.println(list);
	}
	
	public static void binarySearchMethod(){
		
		/**
		 * Collections.binarySearch method internally uses binary search algo
		 * Hence before calling this method on any Collection, it should be sorted
		 * otherwise we will get unpredictable results
		 * successful search returns index
		 *the index of the search key, if it is contained in the list; otherwise,
		 * (-(insertion point) - 1). The insertion point is defined as the point
		 * at which the key would be inserted into the list
		 * placee the target element in the sorted collection
		 * If the input collection is sorted according to some custom comparator
		 * then while searching we should pass that comparator object also
		 */
		
		ArrayList<String>	list	=	new ArrayList<String>();
		list.add("Z");
		list.add("A");
		list.add("K");
		list.add("N");
		Collections.sort(list);
		System.out.println("after sorting:"+list);
		System.out.println(Collections.binarySearch(list, "K"));
		System.out.println(Collections.binarySearch(list, "B"));
		Collections.sort(list, new MyComparator1());
		System.out.println("after sorting:"+list);
		System.out.println(Collections.binarySearch(list, "K",new MyComparator1()));
		
		
	}
	
	public static void reverseMethod(){
		
		ArrayList<String>	list	=	new ArrayList<String>();
		list.add("Z");
		list.add("A");
		list.add("K");
		list.add("N");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}
}

class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);//reverse alphabetical order
	}

	
	
}