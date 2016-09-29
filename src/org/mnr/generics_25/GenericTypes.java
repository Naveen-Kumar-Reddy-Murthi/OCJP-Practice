package org.mnr.generics_25;

import java.util.ArrayList;

public class GenericTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		boundedTypeGenerics();
	}
	
	public static void boundedTypeGenerics(){
		/**
		 * Ex:Class Test<T extends X>
		 * rules:
		 * x can either be class or interface
		 * if x is class, as type parameter, we can only pass x or its child classes
		 * If x is an interface, we either pass type or its implementation classes
		 * Generic classes which are bounded to particular type
		 * Below generic class is bounded with Integer type
		 * No other will be accepted while creating object
		 */
		Template1<Integer> template1	=	new Template1<Integer>(new Integer(1));
		template1.show();
//		Template1<String> template2	=	new Template1<String>(new Integer(1));//The constructor Template1<String>(Integer) is undefined
		//in the above line, neither String nor anyother object will be accepted. Only Integer
		Template2<Integer> template2	=	new Template2<Integer>(new Integer(10));
		Template2<Double> template3	=	new Template2<Double>(new Double(10));
		Template2<Float> template4	=	new Template2<Float>(new Float(10));
//		Template2<String> template5	=	new Template2<String>(new String("naveen"));//CE: String neither type of Number nor its child hence not supported
//		Template3<Float> template6	=	new Template3<Float>();//CEBound mismatch: The type Float is not a valid substitute for the bounded parameter <T extends Runnable> of the type Template3<T>
		Template3<Runnable> template6	=	new Template3<Runnable>();
		Template3<Thread> template7	=	new Template3<Thread>();
//		Template4<Object>	template8= new Template4<Object>();//here param type must be 
	}
	
	public static void unBoundedTypeGenerics(){
		Template<String> template1	=	new Template<String>("Naveen");
		System.out.println("get:"+template1.get());
		template1.show();
		
		Template<Integer> template2	=	new Template<Integer>(new Integer(1));
		System.out.println("get:"+template2.get());
		template2.show();
		
		Template<Double> template3	=	new Template<Double>(new Double(10.56879));
		System.out.println("get:"+template3.get());
	}

	public static void methodsAndWildCardEntries(){
		/**
		 * for this method only string arraylist can be passed. no other is allowed
		 */
		m1(new ArrayList<String>());//valid
//		m1(new ArrayList<Integer>());//not allowed. CE:
		m2(new ArrayList<Integer>());//valid
		m2(new ArrayList<Double>());//valid
		m3(new ArrayList<String>());//here String extends Object
		m3(new ArrayList<Object>());
		
		m4(new ArrayList<Integer>());
	}
	
	public static void m1(ArrayList<String> list){
		//this method takes only string arraylist. no other is allowed
	}
	public static void m2(ArrayList<?> list){	
		//this method takes any type of arraylist
	}
	
	public static <Z,X> Z m3(ArrayList<? extends X> list){
		
		Z returnValue=null;
		
		/**
		 * In place of Object there can be any object. Let's say Object as X
		 * X can either be class or Object
		 * If X is a class, then we call m3 by passing ArrayList of X type or its subclasses
		 * If X is an interface then we call m3 by passing  ArrayList of X type or its impl classes
		 * But within the method, we can't add anything to ArrayList as we don't know what X is
		 * These type of Methods are best suited for reading purposes
		 */
		
		return returnValue;
	}
	
	public static <X> void m4(ArrayList<? super X> list){
		/**
		 * In place of Double there can be any object. Let's say Double as X
		 * X can either be class or interface. 
		 * If X is class then we can call this method by passing ArrayList of either
		 * X type or its super class type but no other types are allowed
		 * If X is an interface then we can call this method by passing ArrayList of X 
		 * type or super class of impl class of X
		 * With in the method, we can add X type of objects and null to list
		 */
	}
}
class Template1<Integer>{
	 
	 private Integer value;
	 Template1(Integer i){
		 this.value=i;
	 }
	 public void show(){
		 System.out.println("Class type:"+value.getClass().getName());
	 }
}

class Template2<T extends Number>{
	 private T value;
	 Template2(T i){
		 this.value=i;
	 }
	 public void show(){
		 System.out.println("Class type:"+value.getClass().getName());
	 }
}

class Template3<T extends Runnable>{}
class Template4<T extends Number&Runnable&Cloneable>{
	/***
	 * Rules
	 * First class then interfaces other way around is not allowed
	 * here after extends any number of interfaces can be there but only one class
	 * because in java multiple inheritance is not possible
	 * Now parameter type T must be child class of Number and implement all those interfaces
	 * else compilation error
	 */
	
}