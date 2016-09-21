package org.mnr.declarations_7;

public class SourceWithMultipleClasses {

//public class A{//CE:The public type A must be defined in its own file
	public static void main(String[] args) {
		/*
		 * A single java source file can contain any number of classes but it's not recommanded
		 * But it can only contain one public class
		 * If any class is public inside a java source file
		 * that source file should be named after that class otherwise
		 * we will get compilation error
		 */
			System.out.println("SourceWithMultipleClasses class");
	}

}

class B// This class can't be public becuase above class is already public
{	   // If we want to make this class public then we also need to rename the source file to B.java
	   // If there are multiple classes in single source, then that number of .class file will be generated after compilation
	   // Each .class file can executed with its class name(java classname)
	public static void main(String...args)
	{
		
		System.out.println("Class B");
	}
}
