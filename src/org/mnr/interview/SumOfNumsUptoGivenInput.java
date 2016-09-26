package org.mnr.interview;

import java.util.Scanner;

public class SumOfNumsUptoGivenInput {
	public static final void main(String...s){
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		StringBuilder sb =new StringBuilder();
		int out=0;
		for(int i=0;i<=val;i++){
			sb.append(i);
			if(i<4)
			sb.append('+');
			out=out+i;
		}
		System.out.println(sb.toString()+"="+out);
	}

}
