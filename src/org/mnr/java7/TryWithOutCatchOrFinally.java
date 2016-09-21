package org.mnr.java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithOutCatchOrFinally {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		try(BufferedReader breader	= new BufferedReader(new FileReader("C:\\Users\\Naveen Reddy\\Desktop\\magnets.txt"));){
			System.out.println("in try block");
		}
	}

}
