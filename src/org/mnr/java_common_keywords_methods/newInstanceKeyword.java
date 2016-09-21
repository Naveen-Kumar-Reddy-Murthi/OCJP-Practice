package org.mnr.java_common_keywords_methods;

public class newInstanceKeyword {
	
	public static void main(String...args){
		
		/*
		 * newInstance is a method present in java.lang.Class
		 * newInstance does same as new keyword
		 * but we can create object using this without knowing class name
		 * newInstance only call default constructor but not anyother constructor
		 * So to use newInstance keyword, we must have default constructor in the class of whose object we are going to create
		 * otherwise we will get RE:java.lang.InstantiationException:
		 * to test this create a class with parameterised constructor but no default constructor
		 * and try creating object using newInstance keyword 
		 */
		
		try {
			Object obj	= Class.forName(args[0]).newInstance();//command line first argument passed as String 
			/*
			 * if the specified class is not available at run time
			 * jvm will throw ClassNotFoundException
			 * unike using new keyword jvm throws NoClassDefFoundException
			 */
			
			System.out.println(obj instanceof String);
		} catch (InstantiationException e) {
		
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
