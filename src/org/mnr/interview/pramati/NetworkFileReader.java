package org.mnr.interview.pramati;

import java.io.File;
import java.text.ParseException;

public class NetworkFileReader {

	public static void main(String...args) throws ParseException{
		
		
		File shared = new File("\\\\sdmafnp01\\public\\NaveenR");
		String files[] = shared.list();
//		System.out.println(Arrays.toString(files));
		for(String file: files){
			File f = new File(file);
			System.out.println();
		}
		
		
		
	} 

}
