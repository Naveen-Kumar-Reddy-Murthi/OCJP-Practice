package org.mnr.imports_8;

import java.util.ArrayList;
import java.awt.*;
import java.rmi.StubNotFoundException;

public class Imports {

	public static void main(String[] args) {
		
		concept();

	}
	
	public static void concept(){
		
//		ArrayList arrList	=	new ArrayList();//CE:ArrayList cannot be resolved to a type, we need to import ArrayList into this class to resolve this error
		/*
		 * Import is compile time activity
		 * compile time is directly proportional to no of imports
		 * However no effect on runtime
		 * Java uses dynamic include/load on demand/load on fly technique in importing dependent classes
		 * 
		 * Two ways of doing this
		 * 1. Specifying fully qualified name
		 *    in this case import is not required
		 */
//		java.util.ArrayList arrList =	new java.util.ArrayList();
		
		/*
		 * 2. import that specific class and use short name to create the object
		 * 	  no need to specify fully qualified name
		 */
	//<-Shortname ->
		ArrayList 	 arrList		=	new ArrayList();
	}
	
	public static void explicitImport(){
		/*
		 * importing specific class from a package instead of whole package
		 * improves the readability
		 */
		StubNotFoundException exception	=	new StubNotFoundException("");
		
		
	}
	
	public static void implicitImport(){
		
		/*
		 * importing whole package in which class we need is residing
		 * poor coding standard, reduces the readability
		 */
		List	list	= new List();//awt list comes from java.awt.* package
	}

}
