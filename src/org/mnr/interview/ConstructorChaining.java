package org.mnr.interview;

public class ConstructorChaining {
	
	public ConstructorChaining(String param){
		
	}
	
//public ConstructorChaining(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Child extends ConstructorChaining{

	public Child(String param) {
		super(param);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * When extending a class,
	 *  Either super class must have a no-arg constructor if it's child class has only parameterized constructor(s)
	 *                             or
	 *  Child class must call  super class's parameterzied constructor like on line 22
	 */
	
	
}