package org.mnr.jvm_29;

public class HeapStats {

	public static void main(String[] args) {
		long mb=1024*1024;
		Runtime r	= 	Runtime.getRuntime();
		System.out.println("Max Memory"+(r.maxMemory()/mb));
		System.out.println("Total Memory:"+(r.totalMemory()/mb));
		System.out.println("Free Memory:"+(r.freeMemory()/mb));
		System.out.println("Consumed Memory:"+(r.totalMemory()-r.freeMemory())/mb);
	}
}
