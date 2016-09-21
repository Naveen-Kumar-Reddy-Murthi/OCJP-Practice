package org.mnr.fileio_22;

import java.io.BufferedReader;

import java.io.FileReader;

public class BufferedReaderDemo {
	
	public static void main(String...args) throws Exception{
		/*
		 * BufferedReader is used to read character data from a file
		 * Main adv: can read data line by line 
		 * BufferedReader needs the support of any Reader object
		 * It is most efficient reader to read file
		 */
		
		BufferedReader br	=	new BufferedReader(new FileReader("abc.txt"));
		String line= br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
