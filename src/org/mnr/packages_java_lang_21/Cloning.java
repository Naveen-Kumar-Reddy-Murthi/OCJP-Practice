package org.mnr.packages_java_lang_21;

public class Cloning implements Cloneable {
	
	private int id;
	private String name;
	private CustomObject object;
	
	@Override
	public String toString() {
		return "Cloning [id=" + id + ", name=" + name + ", object=" + object
				+ "]";
	}
	
	public CustomObject getObject() {
		return object;
	}

	public void setObject(CustomObject object) {
		this.object = object;
	}

	Cloning(int id,String name,CustomObject object){
		this.id=id;
		this.name=name;
		this.object=object;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		concept();

	}
	 
	public static void concept() throws CloneNotSupportedException{
		/*
		 * Creating exact duplicate copy of an object is called
		 * cloning.
		 * If object had to be cloned then its corresponding class must be clonable
		 * i.e., it must implement clonable interface which is a marker interface
		 * If we try to clone non clonable object then we will get CloneNotSupportedException
		 * There are two types of clonings
		 * 1. shallow  cloning
		 *   This type of cloning only creates duplicates of primitives from base object to 
		 *   cloned objects. But object types won't be duplicated rather they are pointed
		 *   to base class object reference. Hence any changes in cloned object's references
		 *   will reflect in the base class object.
		 *   Object class's clone method does exactly this
		 * 2. deep  cloning
		 * 	 There's no deep cloning defined in java. We have to override the clone method
		 * 	 as to duplicate every object from base class to cloned object sothat cloned and
		 *   cloning objects are independent from each other.
		 */
		
		/*
		 * shallow cloning example
		 */
		
		CustomObject object	= new CustomObject(1, "Object1");
		Cloning base	=	new Cloning(1, "Naveen",object);
		Cloning cloned	=(Cloning)base.clone();
		System.out.println("cloned.getId:"+cloned.getId());
		System.out.println("cloned.getName:"+cloned.getName());
		cloned.getObject().setName("Reddy");
		
		//in the above statement, this change will reflect in parent
		//object's customObject reference also. This is called shallow cloning
		
		System.out.println("cloned.getObject().getName():"+cloned.getObject().getName());
		System.out.println("base.getObject().getName():"+base.getObject().getName());
	}

	public static void deepCloning(){
		
	}
}

class CustomObject{
	
	public CustomObject(int id,String name ) {
		this.id=id;
		this.name=name;
	}
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CustomObject [id=" + id + ", name=" + name + "]";
	}
	
}
