package org.mnr.interview;

public class FibonacciSeries {
	
	public static void main(String...args){
		
		FibonacciWithRecursion(10);
//		FibonacciWORecursion(10);
	}
	static long n1=0;
	static long n2=1;
	static long n3=0;
	
	public static void FibonacciWithRecursion(int count){
		
		
		if(count>0){
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
		System.out.print(" "+n3);
			FibonacciWithRecursion(count-1);
			
		}
		
	}
	
	public static void FibonacciWORecursion(int count){
		
		for(int i=0;i<=count;i++){
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
		}
	}

}
