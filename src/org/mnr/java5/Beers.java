package org.mnr.java5;

import java.util.Arrays;

public enum Beers {
	
	
	
	KF,CARLSBERG,TUBORG,
	ELEPHANT(200);
	
	private int price;
//	;
	//constants should be in first line if there are going to be any other things in an
	//enum class otherwise CE.  add ; to resolve CE
		
	private Beers() {
		price=50;
	System.out.println("Beers constructed");
	//this is called for each and every enum constan when this enum
	//class is loaded during class loading time
	}
	
	private Beers(int price){
		this.price=price;
	}
	
	public int getPrice(){
		return price;
	}
	public static void main(String...args){
		/**
		 * enums can have methods and main method too.
		 * Some of the methods of enum classes below
		 * enum constants have order,
		 * we can obtain the order by using ordinal method
		 * ordinals are zero based
		 * enums can have constructors
		 * enums can have normal members and methods just like another java class
		 * Every enum constant represents a java object, hence we call serveral
		 * methods on enum constants also
		 */
			
			System.out.println(Beers.CARLSBERG);
			Beers[] beers	= Beers.values();
			System.out.println(Arrays.toString(beers));
			
			for(Beers beer:beers){
				System.out.println(beer+":"+beer.ordinal()+"| price:"+beer.getPrice());
			}
		
			System.out.println(Beers.CARLSBERG.getPrice()==Beers.ELEPHANT.getPrice());
			System.out.println(Beers.CARLSBERG==Beers.KF);
			System.out.println(Beers.KF.equals(Beers.TUBORG));
	}

}
