package org.mnr.interview;

import java.util.Scanner;

public class FlyodTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int count=1;
		int input =sc.nextInt();
		for(int i=1;i<=input;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((count++)+" ");
			}
			System.out.println();
			
		}

	}

}
