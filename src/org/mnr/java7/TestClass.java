package org.mnr.java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader breader	= new BufferedReader(new FileReader("C:\\Users\\Naveen Reddy\\Desktop\\magnets.txt"));
		
		System.out.println(breader instanceof AutoCloseable);//AutoClosable introduced in java7

	}

}
