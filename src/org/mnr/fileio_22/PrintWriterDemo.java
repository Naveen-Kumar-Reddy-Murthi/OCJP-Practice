package org.mnr.fileio_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		/*
		 * It is the most efficient writer to write character data to a file
		 * Main Adv: can write any primitive data directly to file
		 * Following are the PrintWriter's constructors
		 */
		
		PrintWriter p1	=	new PrintWriter("abc.txt");
		PrintWriter p2	=	new PrintWriter(new File("abc.txt"));
		PrintWriter p3	=	new PrintWriter(new FileWriter("abc.txt",true));
		p3.write(100);
		p3.write('\n');
		p3.print(true);
		p3.write('\n');
		p3.println("naveen reddy murthi");
		p3.flush();
		p3.close();

	}

}
