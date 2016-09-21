package org.mnr.javamodifiers_12;

public class Synchronized {

	public static void main(String[] args) {
		
		/*
		 * synchronized keyword is applicable on blocks,methods 
		 * It's used if there is requirement for thread safety
		 * It's useful for dataconsistency
		 * But it slows down the performance
		 * At a time only one thread can execute a synchronized
		 * block or method
		 * synchronized and abstract combination is illegal
		 */
		/*synchronized(this){// illegal
			System.out.println();
		}*/
		

	}
	
	public synchronized void concept(){
		
		synchronized(this){
			System.out.println();
		}
	}

}
