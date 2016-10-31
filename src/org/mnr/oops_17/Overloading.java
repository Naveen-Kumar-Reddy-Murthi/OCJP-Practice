package org.mnr.oops_17;

public class Overloading {

	public static void main(String[] args) {
		
//		concept();
		automaticPromotionInOverloading();
//		argumentPrecedence();
//		ambiguity();
//		ambiguity2();
//		varArgOverloading();
//		overloadingBasedOnReferenceType();
	}
	
	public static void concept()
	{
		
		/*
		 * Two methods said to be overloaded if they are having 
		 *  same name but with different arguements,they are called
		 *  overloaded methods.
		 *  it reduces the complexity of programming
		 *  Ex:
		 */
		
			Math.abs(20);//int argument
			Math.abs(10.25689);//float argument
		
		/*
		 * In overloading method resolution is taken care by compiler
		 * based on reference type 
		 * Hence overloading is called compiletime/static polymorphism or early binding
		 */	
	 }
	
	 public static void automaticPromotionInOverloading(){
		 
		 /*
		  * while resolving overloaded methods, if exact method is not available
		  * then compiler automatically promotes the argument to next level and checks
		  * whether that method is available or not. This continues until highest level
		  * If still method is not available then compiler throws compiler time error
		  * Ex:refer methods after the current method
		  * 
		  */
		 
		 int param=2;
		 m1(param);
		 
		 /*
		  * in the above method call, even though m1() with short as parameter is not 
		  * available, compiler promotes param arg to byte calls the method having 
		  * byte as parameter. int is next to short in the order of primitives
		  * below is the order
		  * 
		  * byte -->  short --
		  * 				  |--->  int  -->long -->float  --> double
		  * 		  char  --
		  */
		 
	 }
	 
	 public static void m1(byte b){
		 System.out.println("byte method | param:"+b);
	 }
	 
	 public static void m1(double b){
		 System.out.println("int method| param:"+b);
	 }
	
	public static void argumentPrecedence(){
		/*
		 * while overloading, compiler gives precedence to child type
		 * argument than parent type argument
		 */
		 m2(new Object());//calls m2(Object)
		 m2("naveen");//calls m2(String) 
		 m2(null);//this calls m2(String) but not object type m2
		
	}
	
	public static void m2(Object object){
		System.out.println("Object method");
	}
	public static void m2(String string){
		System.out.println("String method");
		
	}
	
	public static void ambiguity(){
		/*
		 * There will be ambiguity error if arguments of overloading
		 * methods are of same level in hierarchy
		 * i.e., two overloaded methods argument types can't have same parent class
		 */
//			m3(null);//CE:The method m3(String) is ambiguous for the type Overloading
	}
	
		public static void m3(String string){
		System.out.println("string m3");
	}
	
		public static void m3(StringBuffer buffer){
		System.out.println("StringBuffer m3");
	}
	
	public static void ambiguity2(){
		m4(1,1.0f);
		m4(1.0f,1);
//		m4(1,1);//CE:The method m4(int, float) is ambiguous for the type Overloading
//		m4(1.0f,1.0f);//CE:The method m4(int, float) is ambiguous for the type Overloading
	}
	
		public static void m4(int i, float j){
			System.out.println("int float method");
		}
		
		public static void m4(float i, int j){
			System.out.println("float int method");
		}
		
	
	 public static void varArgOverloading(){
		 
		 /*
		  * While overloading compiler gives least preference to 
		  * var-arg method. If no other method available then only
		  * it calls var-arg method
		  */
		 
		 m5(1);
		 m5(1,1);
		 m5(1,2,2,2,2,2);
		 m5(1,10);
	 }
		public static void m5(int x){
			System.out.println("int method");
		}
		
		public static void m5(int x, int y){
			System.out.println("int int  method");
		}
		
		public static void m5(int ... x){
			System.out.println("var-arg method");
		}
	
	public static void overloadingBasedOnReferenceType(){
		/*
		 * while overloading, compiler resolves method call by
		 * based on reference type
		 * Runtime object won't play any role
		 */
		   Animal a	=	new Animal();
		   Monkey m =	new Monkey();
		   Animal a1=   new Monkey();
		   
		   m6(a);
		   m6(m);
		   m6(a1);
		
		
	}
	   public static void m6(Animal animal){
		   System.out.println("Animal version");
	   }
	   public static void m6(Monkey monkey){
		   System.out.println("Monkey version");
	   }
}

class Animal{}
class Monkey extends Animal{}

