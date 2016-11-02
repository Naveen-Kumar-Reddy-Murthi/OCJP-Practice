package org.mnr.interview.KelltonTech;

public class StaticBlockTest {
	int a=10;
	static
	{
		StaticBlockTest test = new StaticBlockTest();
		System.out.println(test.hashCode());
		System.out.println(test.a);
		
	}
	
	
	public static void main(String...args){
//		System.out.println(this.hashCode());
//		System.out.println(a);
	}

}
