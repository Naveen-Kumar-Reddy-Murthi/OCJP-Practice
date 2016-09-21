package org.mnr.misc;

import java.util.Properties;

public class SystemPropertiesDemo {

	public static void main(String[] args) {
		
		Properties props	=	System.getProperties();
		props.list(System.out);
		
		/**
		 * we can set system properties thus changing the 
		 * behaviour of compiler
		 * To set any property, we need to add the property in the following format to java options
		 * -D[propertyname]=value 
		 * we can add as many props as needed by seperating them with commas.
		 */

	}

}
