package org.mnr.variables_11;

public class InstanceVariables {
	
	/*
	 * x,y are instance/ object level variables
	 * Every object of this class will have seperate copy of values
	 * These need not to be instansiated, jvm will provide default values
	 * instance variables can't be accessed directly from static area.
	 */
	
	int x;
	int y;
	
	/*
	 * if instance variables are declared as final
	 * we must initialise explicitly, jvm will not initialise
	 */

//		final int z;//CE:The blank final field z may not have been initialized
	
		/*
		 * We can instantiate final instance variables in three ways
		 * During declaration itself
		 * inside constructor
		 * Inside instance 
		 */
		
	 	/*final int z=10;//valid //method-1
*/			
		/*final int z;	// valid method-2
			{
				z=30;
			}*/
	
		 final int z;	// valid method-3
		 InstanceVariables(){
			 z=99;
		 }
	
		public static void main(String[] args) {
			/*
			 * 
			 */
	
		}

}
