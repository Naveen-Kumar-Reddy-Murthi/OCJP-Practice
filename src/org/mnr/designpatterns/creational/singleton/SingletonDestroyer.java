package org.mnr.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroyer {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, ClassNotFoundException, IOException {
//		breakSingletonWithReflection();
//		breakSingletonWithSerialization();
		singletonUsingEnum();
		
	}
	
	public static void breakSingletonWithReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		SingletonBillPugh instance = SingletonBillPugh.getInstance();
		SingletonBillPugh instance1 = null;
		
		Constructor[] constructors= instance.getClass().getDeclaredConstructors();		
		for(Constructor constructor:constructors)
		{
			constructor.setAccessible(true);
			instance1 = (SingletonBillPugh) constructor.newInstance();
			break;
		}
		
		System.out.println(instance.hashCode());//10039797
		System.out.println(instance1.hashCode());//27189676
		
		/**
		 * To resolve restrict this hack, we need to use Enum Based singleton
		 */
		
	}

	public static void breakSingletonWithSerialization() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		SingletonBillPugh instance = SingletonBillPugh.getInstance();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		
		out.writeObject(instance);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		
		SingletonBillPugh instance1 = (SingletonBillPugh) in.readObject();
		
		
		System.out.println(instance.hashCode());//6609937
		System.out.println(instance1.hashCode());//28057572
		
		/**
		 * To resolve this hack add protected Object readResolve() method and call getInstance from it.
		 * After adding the said, method hashcode of objects generated from both objects will be same
		 * This implies that both objects are same
		 */
	}
	
	public static void singletonUsingEnum(){
		
		SingletonEnum.INSTANCE.DoSomething();
	}
	
}
