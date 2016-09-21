package org.mnr.variables_11;

public class LocalVariables {

	public static void main(String[] args) {
		
		/*
		 * Variables which are declared inside a method or block are called local variables
		 * Local variables must initialised only if they are being used. Jvm won't provide default values 
		 * Local variables must be initialised before being used
		 * Only applicable modifier for local variable is final, applying anyother will be result in CE
		 */
			
			int x;
			int y;
//			System.out.println(x);//CE:The local variable x may not have been initialized
		
			/*
			 * since x,y are not being used anywhere in the block there wil be no CE
			 * Even if local variable is final, we need not initialise if it's not being used
			 */
			
			final int z;
//			z=10;
//			 here there's no CE eventhough z is final and uninitialised.
//			if following statement is uncommented then there will be CE:The local variable z may not have been initialized
//			System.out.println(z);
			
	}

}
