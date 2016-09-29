package org.mnr.collections_24;


import java.util.RandomAccess;
import java.util.Collection;

public class CustomList<E> 
implements  RandomAccess, Cloneable, java.io.Serializable{

	
	
	private static final long serialVersionUID = 1L;
	private static final Object[] EMPTY_ELEMENTDATA ={};
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA ={};
	private static final int DEFAULT_CAPACITY=10;
	
	
	transient Object[] elementData;
	
	private int size;
	
	public CustomList(){
		this.elementData=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public CustomList(int initialCapacity){
		if(initialCapacity>0){
			this.elementData= new Object[initialCapacity];
		}
		else if(initialCapacity==0){
			this.elementData= EMPTY_ELEMENTDATA;
		}
		else{
			throw new IllegalArgumentException("Invalid Capacity");
		}
		
	}
	
	public CustomList(Collection<? extends E> c){
		
	}
	

}
