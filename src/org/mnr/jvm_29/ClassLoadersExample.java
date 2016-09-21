package org.mnr.jvm_29;

public class ClassLoadersExample {
	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());//this is to return Bootstrap class loader
		//null because Bootstrap class loader is not java implementation
		System.out.println(ClassLoadersExample.class.getClassLoader());//this is to return App class loader
		//sun.misc.Launcher$AppClassLoader@756a7c99
		System.out.println(Student.class.getClassLoader());//this is to return App class loader
		//sun.misc.Launcher$AppClassLoader@756a7c99
	}
}
