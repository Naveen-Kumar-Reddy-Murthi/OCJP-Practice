package org.mnr.interview;

public class PrintOneToHundredWithoutLoop {
	
	public static void main(String[] args) {
		
		
		print(100);
	}
	
	public static void print(int i){
		if(i>1){
			print (i-1);
		}
		System.out.println(i);
	}
}

