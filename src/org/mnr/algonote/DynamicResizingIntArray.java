package org.mnr.algonote;

import java.util.Arrays;

public class DynamicResizingIntArray {
	
	private int[] data;

	
	public DynamicResizingIntArray(){
		this.data= new int[1];
	}
	
	public DynamicResizingIntArray(int size){
		this.data= new int[size];
	}
	
	public void add(int pos, int value){
		
		if(pos<0)
			throw new IllegalArgumentException("Illegal index:"+pos);
		int curSize=data.length;
		if(pos>=curSize){
			int newSize=pos+1;                 
//			if(pos>=newSize)
//				 newSize=pos*2;
			   int[] newData = new int[newSize];
			System.arraycopy(data,0, newData, 0, curSize);
			data=newData;
		}
		data[pos]=value;
//		System.out.println("add:"+this.toString());
//		curSize=data.length;
//		System.out.println("current length:"+curSize);
	}
	
	public void insert(int pos, int value) {
		
		if(pos<0)
			throw new IllegalArgumentException("Illegal index:"+pos);
		int curSize=data.length;
		
		if(pos>=curSize){
			add(pos, value);
		}
		else if(  pos<=curSize )
		{
			int[] newArr= new int[curSize+1];
			 System.arraycopy(data, 0, newArr  ,0 , pos);
//			 System.out.println("newArr1:"+Arrays.toString(newArr));
			 newArr[pos]=value;
//			 System.out.println("newArr2:"+Arrays.toString(newArr));
//			 System.out.println("data   :"+Arrays.toString(data));
			 System.arraycopy(data,
					 pos,
					 newArr,
					 pos+1,
					 curSize-pos-1);
			 System.out.println("before :"+Arrays.toString(data));
			 data=newArr;
			System.out.println("after  :"+Arrays.toString(data));
			 
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(data);
	}
	
	public int[] toArray(){
		return this.data;
	}
	
	public static void main(String[] args){
		
		DynamicResizingIntArray arr	=	new DynamicResizingIntArray(5);
		arr.add(0, 10);
		arr.add(1, 30);
//		arr.insert(1, 20);
//		arr.insert(1, 100);
		arr.insert(0, 1000);
		
	}
}
