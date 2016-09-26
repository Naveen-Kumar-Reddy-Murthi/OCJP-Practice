package org.mnr.java_common_keywords_methods;

import java.util.Scanner;

public class isInstanceMethod {

	public static void main(String[] args) {
		
		/*
		 * It's a method present in java.lang.Class
		 * Used to check if an object reference is particular type or not
		 * That type can be provided at runtime
		 * This method is equivalent ot instanceof keyword
		 */
			
			Scanner sc	=	new Scanner(System.in);
		
			Thread t = new Thread();
			try {
				System.out.println(Class.forName(sc.next()).isInstance(t));
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
	}

}
