package org.mnr.reflection_30;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * Reflection is the process of analyzing the capabilities and features 
		 * of programming constructs in java at runtime.
		 * There are predefined classes, interfaces for this purpose
		 * Reflection API is rarely used in Application development. It is 
		 * widely used in compiler design, testing tool design and debugging
		 * tools
		 */
		javaLangClass();
	}
		
	public static void javaLangClass() throws ClassNotFoundException{
		/**
		 * java.lang.Class is a meta object for all the classes in java
		 * both user defined and predefined.
		 * Object of this class contains the meta data of its type
		 * i.e., its super class, implemented interfaces, methods,
		 * constructors, access modifiers etc
		 * Object of this class can be obtained in following three ways
		 */
			
			Class c	=Class.forName("java.lang.String");//need fully qualified path
			//or
			String s	= "";
			c=s.getClass();
			//or
			c=Employee.class;
			
			System.out.println("getCanonicalName:"+c.getCanonicalName());
			System.out.println("Modifier"+Modifier.toString(c.getModifiers()));
			System.out.println("getComponentType"+c.getComponentType());
			System.out.println("getSuperclass"+c.getSuperclass());
			
			Class[] interfaces	=	c.getInterfaces();
			for(Class i: interfaces){
			System.out.println(i.getName()+"|getCanonicalName:"+i.getCanonicalName());
			System.out.println(Modifier.toString(i.getModifiers()));
			System.out.println(i.getSigners());
			
			}
			
			Constructor[] cons	=c.getDeclaredConstructors();
			for(Constructor i: cons){
			System.out.println();
			}
			System.out.println(c.getSuperclass());
			System.out.println(Arrays.toString(c.getDeclaredMethods()));
			System.out.println(Arrays.toString(c.getMethods()));		
			System.out.println(Arrays.toString(c.getDeclaredFields()));//all the variables
			System.out.println(Arrays.toString(c.getFields()));//returns only public variables in current/super classes
	}
	
}
  
 abstract class Employee extends Thread implements Serializable,Cloneable,Comparator,Comparable{
	
	private int id;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id){
		this.id=id;
	}
	public Employee(String name){
		this.name=name;
	}
	public Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}