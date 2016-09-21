package org.mnr.innerclasses_26;

 class RegularInnerClass {

	public static void main(String[] args) {
		RegularInnerClass outer	=	new RegularInnerClass();
		RegularInnerClass.Inner inner	=	outer.new Inner(100);
		
		inner.m1();
		inner.m2();
		inner.showValue();
		
		/**
		 * Same code as above is used to access inner class instance from outside this
		 * class
		 * EX: Refer OtherClass
		 * Same code is used for accessing inner class content from static area of
		 * outer class
		 */

	}
	
	class Inner{
		
		private int value;
		Inner(int i){
			this.value=i;
		}
		
		public void m1(){
			System.out.println("Inner m1 method");
		}
		public void m2(){
			System.out.println("Inner m2 method");
		}
		public void showValue(){
			System.out.println("Value is:"+this.value);
		}
	}

}
