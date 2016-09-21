package org.mnr.serialization_23;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		 * In serialization, jvm serializes whole object which may not be the requirement
		 * We might want to serialize only some part of an object which is not possible 
		 * through serialization. But it is possible through Externalization
		 * Unlike serialization, Externalization is completely controlled by programmer.
		 * No intervention of jvm.
		 * Inorder to implement Externalization, we need to implement Externalizable interface
		 * which is child interface of Serializable.
		 * It has two methods
		 * 1. WriteExternal()
		 * 2. ReadExternal()
		 * During deserialization, jvm will create a seperate new object by executing
		 * public no-arg constructor on the Externalizable object.
		 * Hence every externalizable class must have a public no-arg constructor
		 */
		
			Tutorial tutorial	=	new Tutorial("Java",1998,"1.7");
			FileOutputStream fos	=	new FileOutputStream("tutorial.ser");
			ObjectOutputStream oos	=	new ObjectOutputStream(fos);
			oos.writeObject(tutorial);
			
			FileInputStream fis	=	new FileInputStream("tutorial.ser");
			ObjectInputStream ois	=	new ObjectInputStream(fis);
			Tutorial tutorial1	=	(Tutorial) ois.readObject();
			System.out.println(tutorial1);

	}

}

class Tutorial implements Externalizable{
	
	private String code;
	private int id;
	private String version;
	

	public Tutorial() {
		System.out.println("no-arg default constructor");
	}

	public Tutorial(String code, int id, String version) {
		super();
		this.code = code;
		this.id = id;
		this.version=version;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal invoked");
		out.writeObject(this.code);
		out.writeInt(this.id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("readExternal invoked");
		this.code=(String)in.readObject();
		this.id=(int)in.readInt();
		
	}

	@Override
	public String toString() {
		return "Tutorial [code=" + code + ", id=" + id + ", version=" + version
				+ "]";
	}
	
	
}