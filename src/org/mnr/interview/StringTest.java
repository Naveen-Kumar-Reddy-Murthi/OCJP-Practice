package org.mnr.interview;

import java.util.Scanner;

public class StringTest {
	public static void main(String...args){
		
		Scanner scanner = new Scanner(System.in);
		String A=scanner.next();
		String B=scanner.next();
		 
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)< 0)
			System.out.println("YES");
		System.out.print(A.substring(0,1).toUpperCase()+A.substring(1));
		System.out.print(" ");
		System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
		
		
	}

}
