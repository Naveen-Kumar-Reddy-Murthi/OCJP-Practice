package org.mnr.jvm_29;

public class CustomClassLoader extends ClassLoader {
		
	public Class<?> loadClass(String name) throws ClassNotFoundException {
        //custom loading mechanism
		
		return loadClass(name, false);
    }
}
