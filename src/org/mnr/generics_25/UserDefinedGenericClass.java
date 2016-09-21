package org.mnr.generics_25;

public class UserDefinedGenericClass {

	public static void main(String[] args) {
		
		Template<String> template1	=	new Template<String>("Naveen");
		System.out.println("get:"+template1.get());
		template1.show();
		
		Template<Integer> template2	=	new Template<Integer>(new Integer(1));
		System.out.println("get:"+template2.get());
		template2.show();
		
		Template<Double> template3	=	new Template<Double>(new Double(10.56879));
		System.out.println("get:"+template3.get());
		template3.show();

	}

}
class Template<T>{
	
	T object;
	Template(T object){
		this.object=object;
	}
	public void show(){
		System.out.println("type of object is:"+object.getClass().getName());
	}
	public T get(){
		return this.object;
	}
}