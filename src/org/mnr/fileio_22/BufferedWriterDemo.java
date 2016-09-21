package org.mnr.fileio_22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * BufferedWriter can't directly communicate with physical file
		 * It needs FileWriter's support
		 */
		
		BufferedWriter bfWriter	=	new BufferedWriter(new FileWriter("abc.txt"));
		bfWriter.write(100);
		bfWriter.write(new char[]{'\n','b','c','d'});
		bfWriter.newLine();//inserts a new line
		bfWriter.write("Naveen Reddy");
		bfWriter.flush();
		bfWriter.close();
		/*
		 * here we don't need to close FileWriter which was supplied to BufferedWriter
		 * on bfWriter.close() method, supplied FileWriter will also be closed
		 */

	}

}
