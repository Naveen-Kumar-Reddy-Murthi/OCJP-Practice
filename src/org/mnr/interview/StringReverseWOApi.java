package org.mnr.interview;

import java.util.Scanner;

public class StringReverseWOApi {
public static void main(String...a){
	Scanner sc =new Scanner(System.in);
	  String input=sc.nextLine();
	  StringBuilder sb =new StringBuilder();
	  int length=input.length();
	  while(length>=0){
		  if(length-1>=0)
		  sb.append(input.charAt(length-1));
		  length--;
	  }
	  System.out.println("output::"+sb.toString());
}
}
