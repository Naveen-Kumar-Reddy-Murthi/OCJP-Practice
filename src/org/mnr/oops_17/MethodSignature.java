package org.mnr.oops_17;

public class MethodSignature {

	public static void main(String[] args) {
		
		/*
		 * Method name and it's arguments are called as Method signature
		 * return type is not part of method signature
		 * compiler resolves method calls by method signature
		 * With in a class two methods with same signature are not allowed
		 */
		
		print(1);
		print("naveen");

	}
	
	public static void print(int i){
		System.out.println("int");
	}
	
	public static void print(String i){
		System.out.println("String");
	}
	
//	public static int print(String i){ //Duplicate method print(String) in type MethodSignature
//		return 1;
//	}
	
	

}
