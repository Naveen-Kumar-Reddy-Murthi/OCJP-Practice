package org.mnr.interview;

import java.util.Arrays;

public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(areAnagrams("abc", "bca"))
			System.out.println("");

	}
	
	public static boolean areAnagrams(String s1,String s2){
		
		if(s1.length()!=s2.length())
		    return false;
		
		long prod1	=	0;
		long prod2	=	0;
		
		
		for(int i=0,j=0;i<s1.length()&&j<s2.length();i++,j++)
		{
			prod1=prod1+((int)(s1.charAt(i)));
			prod2=prod2+((int)(s2.charAt(j)));
		}
		System.out.println("prod1="+prod1);
		System.out.println("prod2="+prod2);
		
		if(prod1==prod2)
			return true;
		return false;
	}
	
	public static boolean areAnagrams1(String s1,String s2){
		if(s1.length()!=s2.length())
		    return false;
		
		s1=sort(s1); 
		s2=sort(s2);
		if(s1.compareTo(s2)==0)
			return true;
		
		return false;
	}
	
	public static String sort(String s1){
		
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
		
	}

}
