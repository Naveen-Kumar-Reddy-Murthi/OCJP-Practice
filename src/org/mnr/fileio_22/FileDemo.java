package org.mnr.fileio_22;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		concept();

	}
	
	public static void concept() throws IOException{
		File file1 =	new File("abc.txt");
		/*
		 * file is an object represting a physical file named abc.txt at current directory
		 * The above line doesn't create create
		 * In java, file object represents both file and directory as filesystem in java 
		 * developed on unix file system
		 */
		
		System.out.println(file1.exists());//false
		
		file1.createNewFile();//
		
		System.out.println("after creating file. does file exists?:"+file1.exists());
		
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		System.out.println(file1.getPath());
		System.out.println(file1.toURI());
		System.out.println(file1.length());
		System.out.println("*******");
		
		File file2 =	new File("F:\\luna_Projects\\");
		
		String fileNames[]=file2.list();
		System.out.println(Arrays.toString(fileNames));
		
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());

	}

}
