package org.mnr.oops_17;

public class Cohesion {

	public static void main(String[] args) {
		/*
		 * For every component, a clear well defined functionality is defined
		 * then that component is said to be following high cohesion
		 * Ex:Java pojo with getters and setter and validations
		 */
		

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
		return "Cohesion [id=" + id + ", name=" + name + "]";
	}
	
	
}
