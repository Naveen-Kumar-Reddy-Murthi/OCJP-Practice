package org.mnr.collections_24;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Collection;

public class CustomList<E> 
implements List<E>, RandomAccess, Cloneable, java.io.Serializable{

	
	
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
		elementData=c.toArray();
		if((size=elementData.length)!=0){
			if(elementData.getClass()!=Object[].class){
				elementData=Arrays.copyOf(elementData, size,Object[].class);
			}	
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.elementData.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.elementData.length==0?true:false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
