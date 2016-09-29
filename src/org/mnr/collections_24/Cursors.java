package org.mnr.collections_24;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;


public class Cursors {

	public static void main(String[] args) {
		/**
		 * There are three cusors in collection framework
		 * 1. Enumeration
		 * 2. Iterator
		 * 3. ListIterator
		 */
//		EnumerationDemo();
//		IteratorDemo();
		ListIteratorDemo();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void EnumerationDemo(){
		/**
		 * It's a legacy cursor applicable only on vector and stack
		 * Using this we can only retrieve elements but we can't do 
		 * anything else i.e., remove or add. It's a big limitation
		 * There's no built in method to remove elements while iterating
		 * over a it
		 */
		int j=0;
		  Stack stack	=	new Stack();
		  for(int i=1;i<=10;i++)
			  stack.push(i);
		  Enumeration enmur	=	stack.elements();
		  
		  while(enmur.hasMoreElements()){
//			  System.out.println(enmur.nextElement());
			  j=(int) enmur.nextElement();
			  stack.remove((Object)j);
		  }
		  
		  System.out.println(stack);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void IteratorDemo(){
		/**
		 * Iterator can be used on any collection object
		 * Limitations:we can do read and remove using this but not addition or replacement
		 * 				we can read only in forward direction but not in reverse
		 * 				It starts at the beginning only  
		 */
		
		ArrayList list	=	new ArrayList();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		Iterator iterator	=	list.iterator();
		
		while(iterator.hasNext()){
		
			Integer val	=	(Integer)iterator.next();
			if(val%2==0)
				System.out.println(val);
			else
				iterator.remove();
		
		}
	System.out.println(list);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void ListIteratorDemo(){
		/**
		 * We can use ListIterator only on List object
		 * we travese both forward and reverse direction using this
		 * ListIterator can start at any index
		 */
		
		LinkedList list	=	new LinkedList();
		for(int i=0;i<=10;i++)
			list.add(i);
		System.out.println(list);
		ListIterator itr	=	list.listIterator();
		
		while(itr.hasNext()){
			int i= (int) itr.next();
			if(i==4)
				itr.set(40);
			if(i==1)
				itr.remove();
			if(i==5)
				itr.add(55);
			if(i==8){
					System.out.println(itr.previous());
					break;
			}
		}
		
		System.out.println(list);
	}
}
