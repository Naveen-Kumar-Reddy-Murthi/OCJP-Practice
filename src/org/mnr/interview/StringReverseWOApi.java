package org.mnr.interview;

import java.util.Scanner;

public class StringReverseWOApi {
public static void main(String...a){
	Scanner sc =new Scanner(System.in);
	  String input=sc.nextLine();
	  StringBuilder sb =new StringBuilder();
	  
	  for(int i=input.length()-1;i>=0;i--)
	  {
		  sb.append(input.charAt(i));
	  }
	  System.out.println(sb.toString());
		  
}
}
