package org.mnr.interview;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.nextLine();
		double d=sc.nextDouble();
		sc.nextLine();
        String s=sc.nextLine();
       
       System.out.println("String: "+s);
       System.out.println("Double: "+d);
       System.out.println("Int: "+x);
	}

}
