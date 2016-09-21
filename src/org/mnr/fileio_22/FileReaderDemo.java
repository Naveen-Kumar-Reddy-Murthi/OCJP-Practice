package org.mnr.fileio_22;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * FileReader is used to read character data from file
		 *
		 */
		
		
		
//		FileReader fr	=	new FileReader("test.txt");
		
		File file	=	new File("test.txt");
		FileReader fr	=	new FileReader(file);
		
		/*
		 * FileReader reads character by character in unicode form
		 * We need to cast it to char before printing or using
		 */
		
//		int i=fr.read();
//		while(i!=-1){
//			System.out.println((char)i);
//			i=fr.read();
//		}
		
		/*
		 * We can read entire file data into a char array like following
		 */
		
		char data[]=new char[(int) (file.length()-1)];
		fr.read(data);
		fr.close();
		
		System.out.println("char array data:");
		System.out.println(new String(data));
		
		/*
		 * disdvantages: reading char by char isn't efficient and its very slow
		 */
		
	}

}
