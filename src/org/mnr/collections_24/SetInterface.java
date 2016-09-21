package org.mnr.collections_24;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		/**
		 * duplicates aren't allowed 
		 * insertion order will not be preserved
		 * Set(I) doesn't contain any methods 
		 */
			
//		hashsetDemo();
//		LinkedHashsetDemo();
//		TreeSetDemo();
		NavigableSetDemo();
//		CustomSortingUsingComparator();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void hashsetDemo(){
		/**
		 * ds:hashtable
		 * duplicates aren't allowed
		 * insertion order won't be preserved and it is based on hashcode of the objects
		 * heterogeneous objects are allowed
		 * null insertion is possible but only once
		 * It has four constructors
		 * default fill ration is 0.75
		 * Hashset implements both Serializable and Clonable but not RandomAcces
		 * It is best suited for frequent searches
		 */
		
		HashSet set	=	new HashSet();
//		HashSet set	=	new HashSet(10);
//		HashSet set	=	new HashSet(Collection c);
//		HashSet set	=	new HashSet(10,15);//initial capacity and fill ratio
		
		System.out.println(set.size());
		set.add(1);
		set.add("Naveen");
		set.add(10.456f);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set instanceof Serializable);//true
		System.out.println(set instanceof Cloneable );//true
		System.out.println(set instanceof RandomAccess);//false
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void LinkedHashsetDemo(){
		
		/**
		 * It is same as HashSet except it preserves the insertion order
		 */
		LinkedHashSet set	=	new LinkedHashSet();
		System.out.println(set.size());
		set.add(1);
		set.add("Naveen");
		set.add(10.456f);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set instanceof Serializable);//true
		System.out.println(set instanceof Cloneable );//true
		System.out.println(set instanceof RandomAccess);//false
	}
	
	public static void SortedSetDemo(){
		
		/**
		 * Duplicates not allowed and sorted in some way
		 * SortedSet is an interface
		 * Methods:
		 * 1. Object first()
		 * 2. Object last()
		 * 3. SortedSet headSet(Object obj)
		 * 4. SortedSet tailSet(Object obj)
		 * 5. SortedSet subSet(Object obj1, Object obj2)
		 * 6. Comparator comparator()
		 */
		

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void NavigableSetDemo(){
		/**
		 * It is the child interface of SortedSet
		 * Methods:
		 * 1. floor(e)
		 * 2. lower(e)
		 * 3. ceiling(e)
		 * 4. higher(e)
		 * 5. pollFirst
		 * 6. pollLast()
		 * 7. descendingSet()
		 */
		
		NavigableSet set	=	new TreeSet();
		set.add(100);
		set.add(200);
		set.add(500);
		set.add(700);
		set.add(300);
		set.add(600);
		set.add(500);
		set.add(400);
		set.add(800);
//		System.out.println(set);
		System.out.println(set.floor(100));
		System.out.println(set.lower(200));
		System.out.println(set.ceiling(700));
		System.out.println(set.higher(300));
		System.out.println(set.descendingSet());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void TreeSetDemo(){
		
		/**
		 * da: balanced tree
		 * duplicates are not allowed
		 * insertion order won't be preserved
		 * heterogeneous elements are not allowed. If we insert, it will throw
		 * ClassCastException
		 * null insertion is not possible either
		 * It has four constructors
		 * TreeSet();
		 * TreeSet(Comparator c);
		 * TreeSet(SortedSet set);
		 * TreeSet(Collection c)
		 */
		
		TreeSet set	=	new TreeSet();
		set.add("d");
		set.add("z");
		set.add("c");
		set.add("a");
		set.add("b");
		set.add("b");
//		set.add(123);
		set.add(null);
//		set.add(null);
		System.out.println(set);
		
		
		/**
		 * If we want default sorting to be applied using treeset, we need to pass
		 * homogeneus elements which are Comparable
		 * An object said to be comparable if it implements Comparable interface
		 * It has one method i.e., public int compareTo(Object obj2)
		 * Jvm internally uses this method to sort the incoming elements
		 * obj1.compareTo(obj2)
		 * returns -ve	value --> if obj1 has to come before obj2
		 * returns +ve value  --> if obj2 has to come before obj1
		 * returns 0 value	  --> if both objects are equal
		 */
		
		System.out.println("a".compareTo("c"));
		System.out.println(new Integer(100).compareTo(25));
		
		/**
		 * String class and all the Wrapper classes are comparable by default
		 * But StringBuffer isn't comparable 
		 * We can use our own sorting by implementing Comparator interface on any object.
		 * It contains two methods
		 * 1. public int compare(Object obj1, Object obj2)//mandatory to implement 
		 * 		returns -ve	value --> if obj1 has to come before obj2
		 * 		returns +ve value  --> if obj2 has to come before obj1
		 * 		returns 0 value	  --> if both objects are equal		
		 * 2. public boolean equals(Object obj)//optional because already aviable from Object class
		 * while inserting elements into TreeSet jvm will call this compare method
		 * Refer below methods for the example
		 */
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void CustomSortingUsingComparator(){
		
		TreeSet set	=	new TreeSet(new CustomComparator());
		set.add(99);
		set.add(-12);
		set.add(98);
		set.add(98);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(7);
		set.add(6);
		set.add(4);
		set.add(3);
		System.out.println(set);
		
	}

}

class CustomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i= (Integer)o1;
		Integer j= (Integer)o2;
		
		if(i<j)
			return 1;
		else if(i>j)
			return -1;
		else
			return 0;
		/**
		 * or we can use compareTo method on two objects here like
		 * return i.compareTo(j); //Ascending order
		 * return j.compareTo(i); //Descending order
		 * return -i.compareTo(j); //Descending order
		 * return -j.compareTo(i); //Ascending order
		 * return -1;// reverse order of insertion
		 * return 1; //same as insertion order
		 * return 0; // only first element is inserted 
		 */
	}
	
}
