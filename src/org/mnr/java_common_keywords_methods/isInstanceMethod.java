package org.mnr.java_common_keywords_methods;

public class isInstanceMethod {

	public static void main(String[] args) {
		
		/*
		 * It's a method present in java.lang.Class
		 * Used to check if an object reference is particular type or not
		 * That type can be provided at runtime
		 * This method is equivalent ot instanceof keyword
		 */
			
			Thread t = new Thread();
			try {
				System.out.println(Class.forName(args[0]).isInstance(t));
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
	}

}
