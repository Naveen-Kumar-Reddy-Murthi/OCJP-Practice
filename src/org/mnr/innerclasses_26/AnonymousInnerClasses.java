package org.mnr.innerclasses_26;

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		/**
		 * Inner classes without any name are called
		 * anonymous inner classes   
		 * main purpose of these is for one time use
		 * There are three types of Anonymous Inner classes
//		 * 1. Anonymour Inner class extending a class
		 * 2. Anonymour Inner class implementing an interface
		 * 3. Anonymour Inner class defined inside arguments
		 * Example for 1 st type   
		 */
		Popcorn p1	=	new Popcorn();
		p1.taste();
		
		Popcorn p2	=	new Popcorn()
		//meaning of above statement is 
		// we are declaring a class that extends popcorn without name(anonymous inner class)
		//for this child class we are creating an object with parent reference
		{
			public void taste(){
				System.out.println("spicy");
			}	
		};
		p2.taste();
		
		Popcorn p3	=	new Popcorn(){//extending existing class and overriding it
			public void taste(){
				System.out.println("sweet");
			}	
		};
		p3.taste();
		
		System.out.println(p1.getClass().getName());//org.mnr.innerclasses_26.Popcorn
		System.out.println(p2.getClass().getName());//org.mnr.innerclasses_26.AnonymousInnerClasses$1
		System.out.println(p3.getClass().getName());//org.mnr.innerclasses_26.AnonymousInnerClasses$2
		
		/**
		 * Another example for anonymous inner class
		 */
		
		Thread t	=	new Thread(){
			
			public void run(){
				for(int i=1;i<=2;i++)
					System.out.println("child thread execution");
			}
		};
		
		t.start();
		for(int i=1;i<=2;i++)
			System.out.println("main method execution");
		
		System.out.println(t.getClass().getName());
		
		/**
		 * 2nd Type:Anonymous inner class that implements an interface
		 */
		
				Runnable r	=	new Runnable(){
					public void run() {
						for(int i=1;i<=2;i++){
							System.out.println("Runnable thread");
						}
					}
				};
				
				Thread t1	= 	new Thread();
				t1.start();
				System.out.println(r.getClass().getName());//org.mnr.innerclasses_26.AnonymousInnerClasses$4
		
				
		/**
		 * 3rd type: Anonymous inner class as an argument
		 */
				
				new Thread(
							 new Runnable(){
								 public void run() {
									 for(int i=1;i<=2;i++){
										 System.out.println("anonymous class as arg");
									 }
									 System.out.println(this.getClass().getName());
								 }
							 }
							
						  ).start();
				
		/**
		 * Some differences bw anonymous inner classes and normal classes
		 * 1. anon inner class can extend only one class just like normal class
		 * 2. anon inner class can implement only one interface unlike normal class which can implement any number
		 * 3. anon inner class can either extend a class or implement an interface unlike a normal class which can do both simultaenously
		 * 4. anon inner class can't have a constructor because it doesn't have a name and constructor should have same name as class		
		 */
	}
	

}

class Popcorn{
	public void taste(){
		System.out.println("salty");
	}
}
