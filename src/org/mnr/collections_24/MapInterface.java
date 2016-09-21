package org.mnr.collections_24;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapInterface {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Obects to be represented as key value pair, then map interface is used
		 * In map, both key and values are objects and each key value pair is called
		 * entry
		 * Methods of Map interface:
		 * 1. put(Object key, Object value): if specified key is already there, it replaces it with new one
		 * 2. void putAll(Map map)
		 * 3. Object get(Object key)
		 * 4. Object remove(Object key)
		 * 5. Object containsKey(Object key)
		 * 6. Object containsValue(Object value)
		 * 7. boolean isEmpty()
		 * 8. int size()
		 * 9. void clear()
		 * 10. Set keySet();
		 * 11. Collection values()
		 * 12. Set entrySet();
		 */
		
		/**
		 * Entry Interface:
		 * In map, each key-value pairt is called an entry
		 * Without existence of map, there is no chance of Entry object's existence
		 * Henc Entry interface is declared insie Map interface
		 * Methods:
		 * 1. Object getKey();
		 * 2. Object getValue();
		 * 3. Object setValue(Object newValue);
		 */
			
//		hashMapDemo();
//		linkedHashMapDemo();
//		identityHashMapDemo();
//		weakHashMapDemo();
//		sortedMapInterfaceDemo();
//		treeMapDemo();
//		HashtableDemo();
//		propertiesDemo();
		NavigableMapDemo();
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void hashMapDemo(){
		/**
		 * ds: Hashtable
		 * duplicate keys are not allowed but values can be duplicated
		 * if duplicate keys are inserted then old keys will be be replaced with new keys
		 * Values can be duplicated any number of times
		 * insertion order won't be preserved and it is based on hashcode of the keys
		 * Heterogeneous objects are allowed for both key and values
		 * HashMap isn't synchronized. To get synchronized map, we can use utility class
		 * HashMap dominates Garbage Collection. Objects in HashMap won't be garbage collected
		 * if they are associated with HashMap
		 *  Collection's method 		  "public static void synchronizedMap(Map map);"
		 *  similarly for lists 		  "public static void synchronizedList(List list);"
		 *  Similarly for sets			  "public static void synchronizedSet(Set set); "
		 * null inertion is possible for key only once but for value any number of times allowed
		 * There are four constructors available for HashMap
		 * 1. HashMap map	=	new HashMap();
		 * 2. HashMap map	=	new HashMap(int initicialCapacity);
		 * 3. HashMap map	=	new HashMap(Map map)
		 * 4. HashMap map	=	new HashMap(int inicialCapacity, float fillRation);
		 */
		
		HashMap map	=	new HashMap(10);
		map.put(1, "Naveen");
		map.put(3, "Reddy");
		map.put(2, "Reddy");
		map.put(2, "Murthi");//above entry will be replace with this entry as both keys are same
		map.put(4, "Siddipet");
		map.put(null, null);
		map.put(null, null); 
		map.put(5, null);
		map.put(6, null);
//		System.out.println(map.put(7, "test"));// returns null as there's no entry in the existing map
		//put returns the value of entry previously associated with that key. 
		//If key is unique from previous entries then returns null. If key is
		//duplicate from existing, it will return value of previous entry 
//		System.out.println(map.size());
		System.out.println(map); 
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void linkedHashMapDemo(){
		/**
		 * It is same as HashMap except it preserves insertion order
		 * ds: Hashtable and LinkedList combination
		 */
		
		LinkedHashMap map	=	new LinkedHashMap();
		map.put(1, "Naveen");
		map.put(3, "Reddy");
		map.put(2, "Reddy");
		map.put(2, "Murthi");
		map.put(4, "Siddipet");
		map.put(null, null);
		map.put(null, null); 
		map.put(5, null);
		map.put(6, null);
//		System.out.println(map.put(7, "test"));
		System.out.println(map); 
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void identityHashMapDemo(){
		/**
		 * It is same as hashmap except following differences
		 * Incase of Hashmp, jvm uses equals method to identify the duplicate keys internally which is meant for content comparison
		 * Incase of IdentityHashMap, jvm uses == operator to identify the duplicate keys internally which is meant for reference comparison
		 * 
		 */
		IdentityHashMap map	=	new IdentityHashMap();
			
		Integer i1	=	new Integer(10);
		Integer i2	=	new Integer(10);
		Integer i3	=	i2;
		map.put(i1, "Naveen");//allowed
		map.put(i2, "Reddy");//allowed
		map.put(i3,"Murthi");//allowed but replaces i2 as both point to same object
		System.out.println(map);
		System.out.println("i2==i3 		  :"+(i2==i3));//true
		System.out.println("i2.equals(i3) :"+i2.equals(i3));//true
		System.out.println("i1==i2		  :"+(i1==i2));//false
		System.out.println("i1.equals(i2) :"+i1.equals(i2));//true
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void weakHashMapDemo() throws InterruptedException{
		/**
		 * Same as HashMap but GarbageCollector dominates WeakHashMap
		 * Incase of HashMap, if an object is not referred by any reference variable
		 * then also it is not eligible for garbage collection if that object is associated
		 * with HashMap
		 * But same is not applicable for WeakHashMap. GC will collect those objects
		 */
		
//		HashMap map	=	new HashMap();
//		 Sample sample	=	new Sample();
//		 map.put(sample,"Naveen");
//		 System.out.println(map);
//		 sample=null;
//		 System.gc();
//		 Thread.sleep(5000);
//		 System.out.println("after waking up");
//		 System.out.println(map);
		 
		 /**
		  * But if similar operation is performed on WeakHashMap,
		  * Gc will collect it.
		  */
		 
		 WeakHashMap map1	=	new WeakHashMap();
		 Sample sample1	=	new Sample();
		 map1.put(sample1,"Naveen");
		 System.out.println(map1);
		 sample1=null;
		 System.gc();
		 Thread.sleep(5000);
		 System.out.println("after waking up");
		 System.out.println(map1);//empty map will be printed as
		 // object will be removed from map as it was collected by GC
		
		
	}
	public static void sortedMapInterfaceDemo(){
		
		/**
		 * If we want to represent a group of entries(key, value pair) according to 
		 * some sorting order of keys then we should use this interface
		 * Methods:
		 * 1. Object firstKey();
		 * 2. Objec lastKey();
		 * 3. SortedMap headMap(Object key);
		 * 4. SortedMap tailMap(Object key);
		 * 5. SortedMap subMap(Object key);
		 * 6. Comparator comparator();
		 */
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void treeMapDemo(){
		/**
		 * ds: Treemap and redblack tree
		 * duplicate keys are not allowed but duplicate values are allowed
		 * insertion order won't be preserved and it is based on some sorting algorithm of keys
		 * Heterogeneous objects are not allowd for keys but values are allowed. otherwise ClassCastException will be thrown
		 * For empty TreeMap, only first null key is allowed. After this, if any more null keys are inserted then NPE will be thrown
		 * For non-empty TreeMap, we can't insert any entry with null as key. It will throw NPE
		 * Four constructors
		 * 1. TreeMap map	=	new TreeMap();
		 *    here keys should be homogeneous and comparable otherwise ClasCastException
		 * 2. TreeMap map	=	new TreeMap(Comparator c);   
		 *    entries inserted into TreeMap according to customized sorting order specified
		 *    by Comparator object
		 *    This case keys need not be homogeneous and comparable
		 * 3. TreeMap map	=	new TreeMap(Map map);
		 * 4. TreeMap map	=	new TreeMap(SortedMap map);
		 */
				TreeMap	map	= new TreeMap();
				map.put(9, "a");
				map.put(1, "b");
				map.put(2, "c");
				map.put(5, "d");
				map.put(4, "e");
				map.put(3, "f");
//				map.put("nave","hello");//RE:java.lang.ClassCastException
				System.out.println(map);
				
				
				TreeMap	map1	= new TreeMap(new MyComparator());
				
				map1.put(1, "a");
				map1.put("a","b");
				map1.put(2, "a");
				map1.put(3, "a");
				map1.put("b", "a");
				map1.put("c", "a");
				System.out.println("Custom Comparator map"+map1);
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void NavigableMapDemo(){
		/**
		 * It is the child interface of sorted map
		 * defines various methods for navigational purpose
		 */
		
		NavigableMap	map	= new TreeMap();
			map.put(9, "a");
			map.put(1, "b");
			map.put(2, "c");
			map.put(5, "d");
			map.put(4, "e");
			map.put(3, "f");
			
			System.out.println(map.ceilingKey(1));
			System.out.println(map.lowerKey(4));
			System.out.println(map.floorKey(5));
			System.out.println(map.higherKey(5));
			System.out.println(map.pollFirstEntry());
			System.out.println(map.pollLastEntry());
			System.out.println(map.descendingMap());
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void HashtableDemo(){
		
		/**
		 * Hashtable is base data structure for many other Collection classes
		 * Duplicate keys are not allowed but duplicate values are allowed
		 * insertion order won't be preserved and insertion order is based on hashcode of the keys
		 * heterogeneous objects are allowed for both key and values
		 * null insertion isn't possible for both key and values even in the empty Hashtable
		 * otherwise NPE is thrown
		 * Every method of Hashtable is synchronized
		 * Constructors
		 * Hashtable hashTable	=	new Hashtable();//initial capacity 11 and fill ratio .75
		 * Hashtable hashTable	=	new Hashtable(int initialCapacity)
		 * Hashtable hashTable	=	new Hashtable(int initialCapacity, float fillRatio);
		 * Hashtable hashTable	=	new Hashtable(Map map);
		 *  
		 */
				
				Hashtable table	=	new Hashtable();
				table.put(1, "Murthi");
//				table.put(null, "Naveen");//RE:java.lang.NullPointerException
//				table.put(2, null);//RE:java.lang.NullPointerException
				table.put(1,"Naveen");
				table.put(2,"Reddy");
				table.put(3,"Siddipet");
				table.put("a", 123);
				
				System.out.println(table);
				
				Hashtable table1	=	new Hashtable();
				table1.put(new Sample(2), "Naveen1");
				table1.put(new Sample(6), "Naveen2");
				table1.put(new Sample(3), "Naveen3");
				table1.put(new Sample(7), "Naveen3");
				table1.put(new Sample(1), "Naveen5");
				table1.put(new Sample(4), "Naveen7");
				table1.put(new Sample(5), "Naveen6");
		
				System.out.println(table1);
		
	}
	
	public static void propertiesDemo(){
		/**
		 * Properties is used for storing key value pairs
		 * internally uses Hashtable
		 * duplicates are not allowed
		 * null not allowed neither as key nor as value
		 */
		
			Properties props	=	new Properties();
			props.setProperty("name", "Naveen");
//			props.setProperty("name", null);
//			props.setProperty(null, "Naveen");
			System.out.println(props);
	} 
	
	
}
@SuppressWarnings({ "rawtypes" })
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1	=	o1.toString();
		String s2	=	o2.toString();
		
		return s1.compareTo(s2);
	}
	
}


class Sample{
	private int id;
	
	public Sample() {
		// TODO Auto-generated constructor stub
	}
	
	public Sample(int id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Sample [id=" + id + "]";
	}
	public void finalize(){
		System.out.println("Sample finalize called");
	}
	public int hashCode(){
		return this.id;
	}
}