package org.mnr.collections_24;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomSortingUsingTreeSetAndComparator {

	public static void main(String[] args) {
		
//		reverseAlphabetical();
//		stringBufferalphabetical();
//		increasingLengthOrder();
		employeeSorting();

	}
	
	public static void reverseAlphabetical(){
		TreeSet<String> 	set	=	new TreeSet<String>(new ReverseAphabetical());
		set.add("naveen");
		set.add("naveem");
		set.add("reddy");
		set.add("murthi");
		set.add("d");
		set.add("e");
		set.add("f");
		System.out.println(set);
	}

	public static void stringBufferalphabetical(){
		
		TreeSet<StringBuffer> 	set	=	new TreeSet<StringBuffer>(new Aphabetical());
		set.add(new StringBuffer("naveen"));
		set.add(new StringBuffer("naveem"));
		set.add(new StringBuffer("reddy"));
		set.add(new StringBuffer("murthi"));
		set.add(new StringBuffer("d"));
		set.add(new StringBuffer("e"));
		set.add(new StringBuffer("f"));
		System.out.println(set);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void increasingLengthOrder(){
		TreeSet 	set	=	new TreeSet(new Custom());
		
		/**
		 * If we use Comparator for TreeSet, input elements need not to be 
		 * homogeneus and need not to be comparable
		 */
		
		set.add("naveen");
		set.add(new StringBuffer("naveem"));
		set.add("123");
		set.add("ab");
		set.add("abc");
		set.add("abcd");
		set.add("reddy");
		set.add(new StringBuffer("murthi"));
		set.add("d");
		set.add("e");
		set.add("f");
		set.add(new StringBuffer("Hello"));
		System.out.println(set);
		
	}
	
	public static void employeeSorting(){
		Employee e	=	new Employee(1,"a");
		Employee e1	=	new Employee(2,"b");
		Employee e2	=	new Employee(3,"c");
		Employee e3	=	new Employee(4,"d");
		Employee e4	=	new Employee(5,"e");
		Employee e5	=	new Employee(6,"f");
		Employee e6	=	new Employee(7,"g");
		
		TreeSet<Employee> set	=	new TreeSet<Employee>();
		set.add(e6);
		set.add(e3);
		set.add(e);
		set.add(e2);
		set.add(e1);
		set.add(e5);
		set.add(e4);
		System.out.println("Ascending order:"+set);
		
		TreeSet<Employee> set1	=	new TreeSet<Employee>(new CustomEmployeeComparator());
		
		
		set1.add(e);
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);
		set1.add(e6);
		
		System.out.println("Descending order:"+set1);
	}
}

class ReverseAphabetical implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1); //reverse aphabetical order
//		return -s1.compareTo(s2);
	}
}

class Aphabetical implements Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		String s1=sb1.toString();
		String s2=sb2.toString();
		return s1.compareTo(s2);
	}
}

class Custom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1	=	o1.toString();
		String s2	=	o2.toString();
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		else 
		 return s1.compareTo(s2);
		
	}
	
}

class Employee implements Comparable{
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Object o1) {//this enables default sorting while inserting Employee
		int id1=this.id;			 //objects into a TreeSet
		Employee e	= (Employee) o1;
		int id2=e.id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return 1;
		else
			return 0;
	}
	
}

class CustomEmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
					 //objects into a TreeSet
		Employee e1	= (Employee) o1;
		Employee e2	= (Employee) o2;
//		int id1=e1.getId();
//		int id2=e2.getId();
//		if(id1<id2)
//			return -1;
//		else if(id1>id2)
//			return 1;
//		else
			return e2.compareTo(e1);
	}
	
}