package org.mnr.oops_17;

import java.io.IOException;

public class Child_2 extends Parent_2 {

	int value=888;
	
//	@Override
	public void m1() {
		
		System.out.println("overriden Parent_2 m1()");
		
	}
	
//	@Override
//	public void m4(){}//CE:Cannot override the final method from Parent_2

	@Override
	public void m5(){//CE:for private modifier:Cannot reduce the visibility of the inherited method from Parent_2
		/*
		 * This method's modifier should either be higher/equal, can't be lowered.
		 * Meaning, it an only have either protected or public. No other is allowed. Doing so will result in CE
		 *  private	<  default	 <	protected  <  public 
		 */
		
		System.out.println("protected parent method m5");
	}
	
	@Override
	public void m6() //throws InterruptedException//CE:Exception InterruptedException is not compatible with throws clause in Parent_2.m6()
	{
		System.out.println("child overridden method m6");
	}
	
	
//	public  void m7(){}//CE:This instance method cannot override the static method from Parent_2
	
	public static void m7(){
		System.out.println("Child_2 m7()");
	}
	
//	public static  void m8(){} //CE:This static method cannot hide the instance method from Parent_2
	
	public static void m9(){
		System.out.println("Overridden child static method m9()");
	}
	
	@Override
	public void varargMethod(String ... strings){
		
		System.out.println((strings==null?"zero param":strings.length)+" child varargMethod");
	}
	
	public void varargMethod(String strings){
		
		System.out.println("child varargMethod- single parameter");
	}
}
