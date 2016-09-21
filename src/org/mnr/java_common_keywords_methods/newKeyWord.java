package org.mnr.java_common_keywords_methods;

public class newKeyWord {

		public static void main(String ...args){
			
			/*
			 * new key word is used to create an object only if we know the class name
			 * We can't create an object using new if we don't know class name
			 * If the class doesn't exist at rumtime, jvm throws 
			 * NoClassDefFoundError 
			 */
			
			String name	=	new String("naveen");
			System.out.println(name);
		}
}
