package org.mnr.serialization_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialVersionUID {

	public static void main(String[] args) {
		/**
		 * In serialization, both sender and reciever need not to be same host.
		 * It can be two servers running remote hosts with different jvms
		 * Both sender and reciver must have corresponding .class file to
		 * serialize and deserialize respectively
		 * At the time of serialization, jvm will embed the SerialVersionUID
		 * into object.
		 * When object reaches reciever, reciever host's jvm will match the
		 * SerivalVerionUID of .class file avialable with it with the reciever's
		 * If both are same, then reciever jvm will deserialize that object
		 *  otherwise an InvalidClassException will be thrown 
		 * To avoid this issue, it is always recommanded to generate SerialVerionUID
		 * manually by programmer.
		 * Look at the following examples
		 * Sender and Reciever classes will on different remote hosts running on a 
		 * different jvms with same Dog1.class
		 * If we allow jvm to generate  serialVersionUID on two jvms it will be 
		 * different. Hence deserialization will not be possible
		 * Hence alwyas recommanded to generate serialVersionUID manually
		 */
		
	}

}

class Dog1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8908755570620533671L;
	int i=10;
	int j=20;
	@Override
	public String toString() {
		return "Dog1 [i=" + i + ", j=" + j + "]";
	}
	
}

class Sender {
	public static void main(String...args) throws IOException{
		Dog1 d1	=	new Dog1();
		FileOutputStream fop	=	new FileOutputStream("Sender.ser");
		ObjectOutputStream oop	= 	new ObjectOutputStream(fop);
		oop.writeObject(d1);
	}
}

class Reciever {
	public static void main(String...args) throws IOException, ClassNotFoundException{
		FileInputStream fis	=	new FileInputStream("Sender.ser");
		ObjectInputStream ois	=	new ObjectInputStream(fis);
		Dog1 dog1	=	(Dog1)ois.readObject();
		System.out.println(dog1);
	}
}