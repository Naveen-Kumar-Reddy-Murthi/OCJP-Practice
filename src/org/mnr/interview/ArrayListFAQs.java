package org.mnr.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ArrayListFAQs {

	
	public static void main(String[] args) {
		
//		removeDuplicates();
//		reverse();
//		synchronizedArrayList();
//		initializeArrayListInSingleLine();
		sortArrayListInBothOrders();
	}
	
	public static void removeDuplicates(){
		ArrayList	list	=	new ArrayList();
		list.add(1);
		list.add(1);
		list.add("Naveen");
		list.add("Naveen");
		list.add("Reddy");
		list.add("Reddy");
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		
		HashSet	set	=	new HashSet(list);					//order will not be preserved
		LinkedHashSet	set1	=	new LinkedHashSet(list);//order preserved
		System.out.println(list);
		System.out.println(set1);
		System.out.println(set);
	}
	
	public static void reverse(){
		
//		ArrayList	list	=	new ArrayList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);

		List	list=	Arrays.asList(1,2,3,4,5);
			/**
			 * list created using asList method is a fixed size list
			 * It can't be moddified i.e., adding or removing elements but it supports set method though	
			 */
//				list.add(6);//UnsupportedOperationException
//				list.remove(4);//UnsupportedOperationException
				list.set(4, 7);//allowed
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void synchronizedArrayList(){
		
		ArrayList<String>	list	=	new ArrayList<String>();
		list.add("Naveen");
		list.add("Reddy");
		list.add("Murthi");
		List<String>	list1 =Collections.synchronizedList(list);
		
//		synchronized(list) { 
			Iterator i = list1.iterator(); // Must be in synchronized block otherwise 
										   // list will behave inconsistently

				System.out.println(i.next()); 
//			}
		}

	public static void initializeArrayListInSingleLine(){
		
		
		List list	=	Arrays.asList(1,"Naveen","Reddy",null,new Integer(100));
		
		System.out.println(list);
	}
	
	public static void sortArrayListInBothOrders(){
		
		ArrayList list	=	new ArrayList();
		
		list.add(11);
		list.add(1);
		list.add(4);
		list.add(10);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(8);
		list.add(8);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());//here we can pass any customer comparator in the second parameter
		System.out.println(list);
		
		
	}
		
	
	}
