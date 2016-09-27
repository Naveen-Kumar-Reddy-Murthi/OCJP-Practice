package org.mnr.collections_24;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListInterface {

	public static void main(String[] args) throws Exception {
		/*
		 * It allows duplicates and preserves insertion order
		 * Methods:
		 * 1. void add(int index,Object o)
		 * 2. boolean addAll(int index,Collection c)
		 * 3. Object get(int index)
		 * 4. Object remove(int index)
		 * 5. Object set(int index, Object newObj)
		 * 6. int indexOf(Object o)
		 * 7. int lastIndexOf(Objec o)
		 * 8. ListIterator listIterator();
		 */
			
//		ArrayListDemo();
//		LinkedListDemo();
//		VectorDemo();
//		StackDemo();
		copyOnWriteArrayListDemo();
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void ArrayListDemo() throws Exception{
		/**
		 * ds: growable array
		 * duplicates are allowed
		 * insertion order is preserved
		 * heterogenius elements are allowed
		 * null insertion is possible
		 * default size:10
		 * If size reaches capacity, new capacity =(currentcapacity*3/2)+1. But this varies from jvm to jvm implementation
		 * it implements RandomAccess interface(MI), Serializable and Clonable
		 * ArrayList best suited for frequent data retrieval and data insertion
		 * needs several shifts
		 * There's no method to know the current capacity but this can be achieved
		 * by using reflection api. Ex: refer getCapacity method in this class
		 */
		
		  
		ArrayList list	=	new ArrayList();
		System.out.println(getCapacity(list));
		list.add(1);
		System.out.println(getCapacity(list));
		list.add("Naveen");
		list.add(null);
		list.add(new Object());
		System.out.println(list);
		list.add(123);
		list.add("Srikanth");
		list.add(2);//here autoboxing is done
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println("size:"+list.size());
		System.out.println("capacity:"+getCapacity(list));
		list.add(1);
		list.remove(6);
		System.out.println(list);
		list.add(4,"@");
		System.out.println(list.set(5, 2));
		System.out.println(list);
		
		System.out.println(list instanceof Serializable);
		System.out.println(list instanceof Cloneable );
		System.out.println(list instanceof RandomAccess);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void LinkedListDemo(){
		
		/**
		 * ds: Double Linked list
		 * duplicates are allowd
		 * insertion order will not be preserved
		 * heterogeneous objects are allowed
		 * null insertion is possible
		 * It has no initial capacity as elements are attched to one another. There's no poin in allocating
		 * memory without having an element
		 * It implements both Serializable and Clonable but not RandomAccess
		 * It can also be used to implement stacks and queues
		 * For this it has methods like, addFirst, addLast, getFirst, getLast, removeFirst, removeLast
		 * It is best suited for frequent insertion or deletion in the middle of the list
		 */
		
		 LinkedList list	=	new LinkedList();
		 list.add("durga");
		 list.addFirst("Naveen");
		 list.add(null);
		 list.add(null);
		 System.out.println(list);
		 list.addFirst("Naveen");
		 list.addLast("Reddy");
		 System.out.println(list);
		 System.out.println(list.getFirst());
		 System.out.println(list.getLast());
		 list.addLast("waste");
		 list.addFirst("waste");
		 System.out.println(list);
		 list.removeFirst();
		 list.removeLast();
		 System.out.println(list);
		 System.out.println(list instanceof Serializable);
		 System.out.println(list instanceof Cloneable );
		 System.out.println(list instanceof RandomAccess);
		 
		 
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void VectorDemo(){
		/**
		 * Difference between ArrayList and Vector is synchronization
		 * All Vector class methods are synchronized
		 * ds: growable array
		 * duplicates are allowed
		 * insertion order will be preserved
		 * heterogeneous objects are allowed
		 * null insertion is possible
		 * It implements Serializable, Clonable and RandomAccess interfaces
		 * Best suited for frequent retrieval operations but worst for insertion and deletion in the middle
		 * initial capacity is 10. On reaching max capacity, it's capacity is doubled
		 * Apart from regular constructors, Vector has an addtional constructor with 
		 * initial and incremental capacity as parameters
		 * Vector vector = new Vector(5,5)
		 */
		
		Vector vector	=	new Vector(5,5);
		System.out.println("capacity:"+vector.capacity());//5
			   vector.add(1);
			   vector.addElement("Naveen");
			   vector.add(145);
			   vector.add(145);
			   vector.add(145);
			   System.out.println(vector);
			   vector.add(new Object());
			   System.out.println(vector);
			   System.out.println("capacity:"+vector.capacity());
			   
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		Enumeration<Object> enumr	=	vector.elements();
		while(enumr.hasMoreElements())
			System.out.println(enumr.nextElement());
		
		System.out.println(vector instanceof Serializable);
		System.out.println(vector instanceof Cloneable );
		System.out.println(vector instanceof RandomAccess);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void StackDemo(){
		/**
		 * Stack is the child class Vector
		 * ds: First in Last out 
		 * initial capacity is 10. On reaching max capacity, it's capacity will be doubled
		 * It has only one constructor without any parameter
		 * duplicates, heterogeneous and null insertions are allowed
		 */
		
		Stack stack	=	new Stack();
		System.out.println(stack.empty());
		System.out.println(stack.capacity());
		stack.push(1);
		stack.push("Naveen");
		stack.push(123);
		stack.push("Reddy");
		stack.push("Murthi");
		stack.push("Nucleus");
		stack.push(new Object());
		stack.push(null);
		stack.push(null);
		stack.push(1);
		stack.push(11);
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search("Naveen"));
		System.out.println(stack.search("Matt Daemon"));
		
		System.out.println(stack instanceof Serializable);
		System.out.println(stack instanceof Cloneable );
		System.out.println(stack instanceof RandomAccess);
		
	}
	
	public static void copyOnWriteArrayListDemo(){
		/** A thread-safe variant of {@link java.util.ArrayList} in which all mutative
		 * operations (<tt>add</tt>, <tt>set</tt>, and so on) are implemented by
		 * making a fresh copy of the underlying array.
		 *
		 * <p> This is ordinarily too costly, but may be <em>more</em> efficient
		 * than alternatives when traversal operations vastly outnumber
		 * mutations, and is useful when you cannot or don't want to
		 * synchronize traversals, yet need to preclude interference among
		 * concurrent threads.  The "snapshot" style iterator method uses a
		 * reference to the state of the array at the point that the iterator
		 * was created. This array never changes during the lifetime of the
		 * iterator, so interference is impossible and the iterator is
		 * guaranteed not to throw <tt>ConcurrentModificationException</tt>.
		 * The iterator will not reflect additions, removals, or changes to
		 * the list since the iterator was created.  Element-changing
		 * operations on iterators themselves (<tt>remove</tt>, <tt>set</tt>, and
		 * <tt>add</tt>) are not supported. These methods throw
		 * <tt>UnsupportedOperationException</tt>.
		 *
		 * <p>All elements are permitted, including <tt>null</tt>.
		 */
		
		CopyOnWriteArrayList<Object>	list	=	new CopyOnWriteArrayList<Object>();
				
//				list.add(null);
				list.add("Reddy");
				list.add("Naveen");
				list.add("Naveen");
				list.add("Murthi");
				list.add("Kumar");
				list.add("Siddipet");
				
				list.remove(1);
				
				ListIterator itr	=	list.listIterator();//doesn't support any modification to the CopyOnWriteArrayList
//				Iterator itr1	=	list.iterator();////doesn't support any modification to the CopyOnWriteArrayList
				
				while(itr.hasNext()){
					String val	=	 (String) itr.next();
					if(val.equals("Naveen"))
						itr.remove();//RE:java.lang.UnsupportedOperationException
				}
				
	}
	
	static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}
