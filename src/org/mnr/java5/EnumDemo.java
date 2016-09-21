package org.mnr.java5;

public class EnumDemo {
	
	public static void main(String...args){
		concept();
	}
	
	public static void concept(){
		
		/**
		 * Enums are sued to represent a group of named constants
		 * Every enum constants are public static final by default
		 * Every enum constant represents an object of the type enum
		 * Every enum constant represents an object type of enum
		 * We can access enum directly by using enum class name
		 * Enums can be declared outside the class or inside the class
		 * but not inside methods
		 * Enums can be used in switch cases
		 */
		
		Months month	=	Months.SEPTEMBER;
		System.out.println(month);
		
		switch(month){
		case JAN:
			System.out.println("January");
			break;
		case FEB:
			System.out.println("Febuary");
			break;
		case SEPTEMBER:
			System.out.println("september");
			break;
		default:
			System.out.println("no match");
		}
		
		
		
	}
	enum Months {
		JAN,FEB,MACH,APRIL,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,DECEMBER;
	}
}
enum Months{
	JAN,FEB,MACH,APRIL,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,DECEMBER;
}


