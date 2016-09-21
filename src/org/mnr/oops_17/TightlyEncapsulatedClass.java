package org.mnr.oops_17;

public class TightlyEncapsulatedClass {
	
	/*
	 * This considers to be tightly encapsulated class
	 * Each data member is private with getters and setters
	 * incase of inheritance if parent class is not tightly encapsulated then child also is not
	 */
	
	private int id ;
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
	

}
