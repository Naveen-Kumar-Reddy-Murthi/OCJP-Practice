package org.mnr.serialization_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * process of converting a java object into physical file/network supported form
		 * is called serialization
		 * 
		 * process of converting a file/network object into java object is called
		 * deserialization
		 * 
		 * only serializable objects can be serialized. An object can be serialized if 
		 * it's corresponding class implementes serializable interface.
		 * 
		 * serializable is a marker interface
		 */
		
			Dog dog	=	new Dog();
			dog.i=120;
			dog.j=200;
			dog.k=2200;
			dog.l=123;
			FileOutputStream fop	=	new FileOutputStream("dog.ser");
			ObjectOutputStream oop	=	new ObjectOutputStream(fop);
			oop.writeObject(dog);
			oop.close();
			
			FileInputStream fip		=	new FileInputStream("dog.ser");
			ObjectInputStream ois	=	new ObjectInputStream(fip);
			Dog dog1	=	(Dog) ois.readObject();
			System.out.println("i="+dog1.i);
			System.out.println("j="+dog1.j);
			System.out.println("transiernt k="+dog1.k);//0
			System.out.println("static l="+dog1.l);
			System.out.println("final code="+dog1.code);
			/*
			 * transient keyword restricts serialization.
			 * transient keyword is only applicable to variables not methods or classes
			 * when a variable is decalred as transietn, while serialization jvm will
			 * set its value to default value.
			 * There's no use if transient is used on static variables as they are class
			 * level variables. Same with final variables
			 * 
			 */
			
			/*
			 * any number of objects can be serialized to a single file
			 * but deserialization must be in same order otherwise classcastexception
			 */
			Dog dog2	=	new Dog();
			Cat cat		=	new Cat();
			Mouse	mouse=	new Mouse();
			
			
			fop	=	new FileOutputStream("multipleObjects.ser");
			oop	=	new ObjectOutputStream(fop);
			oop.writeObject(dog2);
			oop.writeObject(cat);
			oop.writeObject(mouse);
			
			fip		=	new FileInputStream("multipleObjects.ser");
			 ois	=	new ObjectInputStream(fip);
			 
			 Dog dog3	=	(Dog) ois.readObject();
			 Cat cat1	=	(Cat) ois.readObject();
			 Mouse	mouse1	=	(Mouse) ois.readObject();
			 System.out.println(dog3);
			 System.out.println(cat1);
			 System.out.println(mouse1);
			 /*
			  * Another proper way to read multiple objects if we don't know the order
			  */
			 System.out.println("***********");
			 System.out.println("2nd way****");
			 fip		=	new FileInputStream("multipleObjects.ser");
			 ois	=	new ObjectInputStream(fip);
			 Dog dog4=null;
			 Cat cat2=null;
			 Mouse mouse2=null;
			 for(int i=0;i<3;i++){//iteration is three times because we wrote three objects
				 Object o	=	ois.readObject();
				 if(o instanceof Dog)
					  dog4= (Dog)o;
				 if(o instanceof Cat)
					 cat2= (Cat)o;
				 if(o instanceof Mouse)
					 mouse2= (Mouse)o;
			 }
			 
			 System.out.println(dog4);
			 System.out.println(cat2);
			 System.out.println(mouse2);
			
			
	}

}

class Dog implements Serializable{
	int i=10;
	int j=20;
	transient int k=5000;
	transient static int l=8000;
	final String code	=	"dog";

	@Override
	public String toString() {
		return "Dog [i=" + i + ", j=" + j + ", code=" + code + "]";
	}
}

class Cat implements Serializable{
	int i=12;
	int j=23;
	transient int k=50045;
	transient static int l=6700;
	final String code	=	"cat";
	@Override
	public String toString() {
		return "Cat [i=" + i + ", j=" + j + ", code=" + code + "]";
	}
}

class Mouse implements Serializable{
	int i=66;
	int j=896;
	transient int k=4532;
	transient static int l=8898;
	final String code	=	"mouse";

	@Override
	public String toString() {
		return "Mouse [i=" + i + ", j=" + j + ", code=" + code + "]";
	}
}