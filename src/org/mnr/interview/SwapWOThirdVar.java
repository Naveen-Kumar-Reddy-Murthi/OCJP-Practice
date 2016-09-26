package org.mnr.interview;

import java.util.Scanner;

public class SwapWOThirdVar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long x=sc.nextInt();
		long y=sc.nextInt();
		System.out.println("before swapping x="+x);
		System.out.println("before swapping y="+y);
		//System.out.println((y=x));
//			x=x+y;
//			y=x-y;
//			x=x-y;
		x=x*y/(y=x);
			
		System.out.println("after swapping x="+x);
		System.out.println("after swapping y="+y);
		
		

	}

}
