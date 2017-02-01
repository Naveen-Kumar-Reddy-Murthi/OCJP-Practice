package org.mnr.interview;

public class OverridingTest {
	
	public void sum(int a ,int b){
		System.out.println("primitive");
	}
	
	public void sum(Integer a, Integer b){
		System.out.println("wrapper");
	}
	
	public static void main(String...args){
		OverridingTest test = new OverridingTest();
		
		test.print(10);
		
	}
	
	public void print(int i){
		
		if(i>0){
			print (i-1);
		}
		System.out.println(i);
		
	}

}
