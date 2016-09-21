package org.mnr.operators_4;

public class ResultingType {

	public static void main(String[] args) {
	
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);//here result type is int so it must be casted to byte type otherwise CE:Type mismatch: cannot convert from int to byte
		/*
		 * following are the result types while performing any operations on primitives
		 *  byte+byte=int
		 *  byte+short=int
		 *  short+short=int
		 *  byte+long=long
		 *  long+double=double
		 *  float+long=float
		 *  char+char=int
		 *  char+double=double
		 *  char+float=float
		 */

		byte d=10;
		short s=11;
		byte by=(byte) (d+s);
		
		char ch1='A';
		char ch2='A';
		int con=ch1+ch2;
		System.out.println(con);
		
		float f2=10.56f;
		float f=f2+ch1;
		System.out.println(f);
		
	}

}
