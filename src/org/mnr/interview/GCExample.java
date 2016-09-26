package org.mnr.interview;

import java.util.ArrayList;
import java.util.List;

public class GCExample {

	public static void main(String[] args) 
	{
		Runtime rt =Runtime.getRuntime();
		double initial=rt.freeMemory()/(1024*1024);
//		System.out.println("Memory initally="+rt.freeMemory()+" bytes");
		System.out.println("Memory initally="+initial+" mb");
		
		List<Integer> arrList = new ArrayList<Integer>();
		System.out.println("Initial capacity:"+arrList.size());
		for(int i=0;i<1000000;i++)
			arrList.add(i);
		
		System.out.println("size:"+arrList.size());
		
		arrList.clear();;
		System.out.println("size after destory:"+arrList.size());
         
		rt.gc();
		double latest=rt.freeMemory()/(1024*1024);
		System.out.println("Memory after gc="+latest+" mb");
		System.out.println("freed memory is:"+(latest-initial)+" mb");
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize called");
	}

}
