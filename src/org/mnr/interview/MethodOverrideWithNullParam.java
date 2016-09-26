package org.mnr.interview;

public class MethodOverrideWithNullParam {
	
	public static void takeNull(String param){
		
		System.out.println("String");
	}
	
	public static void takeNull(Object param){
		
		System.out.println("Object");
	}
	

	public static void main(String...args){
		takeNull(null);
	}

	//The method lookup used by javac chooses the most specific valid overload.
	//It will go to the most specific case as possible. Since null matches 
	//	every possible subclass of object and object itself, it will always go 
	//	to the most specific method possible. But if you have 2 classes that 
	//	have split paths in the inheritance tree, it will throw the compiler time exception that it is too ambiguous
	
	
}
