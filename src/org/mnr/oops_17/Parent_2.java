package org.mnr.oops_17;

import java.io.IOException;

public  class Parent_2 {
	
	int value=777;
	
//	public abstract void m1();
	public void m2(){
		System.out.println("Parent_2 m2 method");
	}
	
	public void m3(){
		System.out.println("parent m3 method");
	}
	
	public final void m4(){
		System.out.println("Parent final method m4");
	}
	
	protected void m5(){
		System.out.println("protected parent method m5");
	}
	
	public void m6() throws IOException
	{
		System.out.println("Parent m6 method");
	}
	
	public static void m7(){
		System.out.println("Parent m7 method");
	}
	public  void m8(){}
	
	public static void m9(){
		System.out.println("parent static method m9()");
	}
	
	public void varargMethod(String ... strings){
		
		System.out.println((strings==null?"zero param":strings.length)+" parent varargMethod");
	}
	
	public void varargMethod(String strings){
		
		System.out.println("parent varargMethod- single parameter");
	}
	
	public int test(int i){
		return 1;
	}
	public String test(int i, String name){
		return null;
	}
}
