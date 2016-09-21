package org.mnr.collections_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsIntro {

	public static void main(String[] args) {
		/**
		 * Collections: needed to store heterogenius objects with autogrowable nature
		 * which was not possible through arrays 
		 * Advantages of arrays:
		 * 1. can hold both object and primitive types
		 * 
		 * Disadvantages of arrays:
		 * 1. Fixed in size
		 * 2. homogenius elements only allowed(Object array can hold heterogenius objects)
		 * 3. No builtin data structure
		 * 4. No readymade methods available. Everything has to be defined by programmer
		 * 
		 * Collections:
		 * 1. can only hold object types not primitives
		 * 2. Autogrowable in nature
		 * 3. can hold heterogenius objects
		 * 4. built on some datastructure
		 * 5. readymade methods are available
		 * 6. every collection class implements  Serializable and Clonable
		 * 
		 * 9 Main interfaces of collection framework
		 * 1. Collection
		 * 2. List
		 * 3. Set
		 * 4. SortedSet
		 * 5. NavigableSet
		 * 6. Queue
		 * 7. Map
		 * 8. SortedMap
		 * 9. NavigableMap
		 * 
		 * Collection interface is base interface for all classes and interfaces in collection
		 * framework. It contains the following methods
		 * 1.add(Object o)
		 * 2.addAll(Collection c)
		 * 3.remove(Object o)
		 * 4.removeAll(Collection c)
		 * 5.retainAll(Collection c)
		 * 6.contains(Object o)
		 * 7.containsAll(Collection c)
		 * 8.isEmpty()
		 * 9.clear()
		 * 10.size()
		 * 11. Object[] toArray()
		 * 12. Iterator iterator()
		 */
		
		Collection<String> c	=	new ArrayList<String>();
		c.add("Naveen Reddy");
		System.out.println(c);
		List<String> nameList 	=	new ArrayList<String>();
		nameList.add("Naveen Reddy");
		nameList.add("Shravan Reddy");
		nameList.add("Praveen Reddy");
		nameList.add("RajiReddy");
		nameList.add("Susheela Reddy");
		nameList.add("Bhupal Reddy");
		nameList.add("Ammamma");
		nameList.add("Laxma Reddy");
		nameList.add("Chinna Attamma");
		nameList.add("Pedda Attamma");
		nameList.add("Pedda mama");
		nameList.add("Amarendar Reddy");
		c.addAll(nameList);
		System.out.println(c);
		c.remove("Amarendar Reddy");
		System.out.println(c);
		List<String> removeList	=	new ArrayList<String>();
		removeList.add("Bhupal Reddy");
		removeList.add("Pedda Attamma");
		removeList.add("Pedda mama");
		c.removeAll(removeList);
		System.out.println(c);
		System.out.println(c.contains("Naveen Reddy"));
		List<String> containList	=	new ArrayList<String>();
		containList.add("Naveen Reddy");
		containList.add("RajiReddy");
		containList.add("Susheela Reddy");
		System.out.println(c.containsAll(containList));
		System.out.println(c.isEmpty());
		System.out.println(c.size());
		Object[] objArr	= c.toArray();
		System.out.println(Arrays.toString(objArr));
		Iterator itr=c.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		c.clear();
		System.out.println(c);
	}

}
