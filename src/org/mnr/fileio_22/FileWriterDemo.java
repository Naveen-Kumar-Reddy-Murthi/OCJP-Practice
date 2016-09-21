package org.mnr.fileio_22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * used for writing character data to a file
		 * Following are the constructors for FileWriter class
		 */
			
//		FileWriter fw1	=	new FileWriter("test.txt");//parameter file complete path
//		FileWriter fw2	=	new FileWriter("test.txt",true);//parameter file complete path, boolean param appends data if exists
		File file	=	new File("test.txt");
		System.out.println(file.toURI());
//		FileWriter fw3	=	new FileWriter(file);
		FileWriter fw4	=	new FileWriter(file,true);//boolean param appends data if exists
		
		/*
		 * if specified files doesn't exist, they will create those files
		 */
		
		fw4.write('\n');
		fw4.write("Nuclues Software Exports Ltd");
		fw4.write('\n');
//		fw4.write(System.getProperty("line.seperator"));
		fw4.write(new char[]{'\n','a','b','c','d'});
		fw4.flush();
		fw4.close();
		
		/*
		 * Writing char by char is very slow and inefficient
		 */
	}

}
