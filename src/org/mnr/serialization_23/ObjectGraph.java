package org.mnr.serialization_23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectGraph {

	public static void main(String[] args) throws IOException {
		/*
		 * Whenever an object gets serialized, set of other objects which are
		 * part of base object are also get serialized only if those objects
		 * are also serializable. These serializable sub objects cominely called
		 * as object graph
		 * If any one of the object from object graph is not serialzable then we
		 * will NotSerializableException. All objects inside object graph must be 
		 * serialzable inorder to avoid exception
		 */
				Zoo zoo	=	new Zoo();
				FileOutputStream fos	=	new FileOutputStream("Zoo.ser");
				ObjectOutputStream oos	=	new ObjectOutputStream(fos);
				oos.writeObject(zoo);//java.io.NotSerializableException since Tiger isn't serialziable

	}

}

class Zoo{
	Cat cat;
	Dog dog;
	Tiger tiger;
	
	Zoo(){
		this.cat=new Cat();
		this.dog=new Dog();
		this.tiger= new Tiger();
	}
}

class Tiger{
	String code="tiger";
	int id=123;
}