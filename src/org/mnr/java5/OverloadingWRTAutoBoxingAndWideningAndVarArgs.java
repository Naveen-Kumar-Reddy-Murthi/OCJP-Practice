package org.mnr.java5;

public class OverloadingWRTAutoBoxingAndWideningAndVarArgs {

	public static void main(String[] args) {
		int i=10;
		abVsWidening(i);
		wideningVsVarArgs(i);
		abVsVarargs(i);
//		wedeningFollowedByAutoBoxing( i);//CE: The method wedeningFollowedByAutoBoxing(Long) in the type OverloadingWRTAutoBoxingAndWideningAndVarArgs is not applicable for the arguments (int)
		autoboxing(i);//here compilter converts it to int value using intVaule method
	}
	
	public static void abVsWidening(Integer i){
		System.out.println("Auto Boxing");
	}
	public static void abVsWidening(long l){
		System.out.println("widening");
	}
	
	public static void wideningVsVarArgs(int...x){
		System.out.println("var-args");
	}
	
	public static void wideningVsVarArgs(long l){
		System.out.println("widening");
	}
	
	public static void abVsVarargs(int...x){
		System.out.println("var-args method");
	}
	
	public static void abVsVarargs(Integer i){
		System.out.println("auto boxing");
	}
	
	public static void wedeningFollowedByAutoBoxing(Long l){
		System.out.println("wedeningFollowedByAutoBoxing");
	}
	
	public static void autoboxing (Object o){
		System.out.println(o);
		System.out.println("Object version autoboxing");
	}
}
