package org.mnr.interview;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in).useDelimiter("\\n");  
        int counter = 1;
        String line = "";
       for(;;)
       {
    	   line=sc.next();
    	   if(line.length()==1 )
    		   break; 
    	   else
    		 System.out.print((counter++)+" "+ line);
   	   
       }

	}

}
