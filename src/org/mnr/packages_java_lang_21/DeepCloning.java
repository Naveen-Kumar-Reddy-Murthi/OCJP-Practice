package org.mnr.packages_java_lang_21;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * There's no default method for deep cloning.
		 * We need to implment it on our own by overriding clone method of object class
		 * Now we should implement in such way that, both base and cloned objects are
		 * independent of each other
		 */
			Cat c= new Cat(1);
			Dog d= new Dog(c,1);
			Dog d1= (Dog)d.clone();
			
			System.out.println("original object::"+d);
			System.out.println("cloned object::"+d1);
			d1.setC(new Cat(3));
			d1.setI(5);
			System.out.println("After chaning");
			System.out.println("original object::"+d);
			System.out.println("cloned object::"+d1);
		
	}

}

class Cat{
	int j;
	Cat(int j){
		this.j=j;
	}
	@Override
	public String toString() {
		return "Cat [j=" + j + "]";
	}
}

class Dog implements Cloneable{
	Cat c;
	int i;
	Dog(Cat c, int i){
		this.c=c;
		this.i=i;
	}
	
	public Cat getC() {
		return c;
	}

	public void setC(Cat c) {
		this.c = c;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Dog [c=" + c + ", i=" + i + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		Cat c1= new Cat(c.j);
		Dog d= new Dog(c1,i);
		return d;
	}
}