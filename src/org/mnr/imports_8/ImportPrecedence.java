package org.mnr.imports_8;


import java.sql.Date;
import java.util.*;


public class ImportPrecedence {

	public static void main(String[] args) {
		
		/*
		 * While resolving the class name conflicts
		 * compiler gives precedence in the following order
		 * 1. Explicit class import
		 * 2. Class present in the current working directory/default package
		 * 3. implicit class import
		 * 
		 */
		showPrecedence();

	}
	
	public static void showPrecedence(){
		Date date = new Date(0);
		System.out.println(date.getClass().getName());
		/*
		 * here if i remove util import then org.mnr.imports8.Date is loaded
		 * org.mnr.imports8.Date renamed to org.mnr.imports8.Date1
		 * If i delete org.mnr.imports8.Date, then import java.sql.Date is loaded
		 */
		
	}
	
	public static void subPackageAvailability(){
		
		/*
		 * when implicit import is done, only classes and interfaces present in that package only be available to compiler
		 * Classes/interfaces of sub package of that package wont't be available.
		 * For this we need to do explicit/implicit import of that class or use fully qualified name
		 */
		
//				Pattern pattern	= Pattern.compile("a*b");//CE:import java.util.regex.Pattern;
				//Pattern class is available in  java.util.regex package
	}
}
