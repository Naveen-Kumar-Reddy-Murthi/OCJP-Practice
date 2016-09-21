package org.mnr.garbagecollection_16;

public class GarbageCollection {

	public static void main(String[] args) {
		
		/*
		 * Garbage Collection referes to freeing the memory 
		 * Programmer isn't responsible to do it though
		 * But programmer can make objects eligible for garbage collection in two ways
		 * 1. Nullifying the objct
		 * 2. Reassigning it to different reference variable
		 * Local objects(method objects) are by default eligible for Garbage collecion once it gets executed
		 * If an object has no reference pointing to it then it is eligible for garbage collection
		 * It's not guarunteed that GC will run immediately if one object is eligible for GC
		 * Garbage Collector is a daemon thread and runs in the back ground
		 * This varies from jvm to jvm
		 */
			
//		concept();
//		callGc();
		communicateWithJVM();
		
	}
	
	public static void concept(){
		GarbageCollection gc1 =	new GarbageCollection();
		GarbageCollection gc2 =	new GarbageCollection();
		gc1=null;//now gc1 is eligible to Garbage Collection
		gc2=null;//now gc2 is eligible to Garbage Collection
		
		gc1 =	new GarbageCollection();
		gc2 = gc1;
		
		new GarbageCollection();//Eligible for garbage collection
		
	}
	public static void islandOfIsolation(){
		
		/*
		 * here one object is pointed to another in a nested loop
		 * This is called island of isolation
		 */
		
		GarbageCollection gc1 =	new GarbageCollection();
		GarbageCollection gc2 =	new GarbageCollection();
		GarbageCollection gc3 =	new GarbageCollection();
				
		gc1.gc=gc2;
		gc2.gc=gc3;
		gc3.gc=gc1;
		
		gc1=null;
		gc2=null;
		gc3=null;
		
		
	}
	GarbageCollection gc;
	
	public static void callGc(){
		/*
		 * We can send request to GC to collect memory by destroying objects which are eligible for GC
		 * Even if we call gc method and request for gcing, GC may or may not consider the request
		 * 
		 */
			System.gc();//method-1..But inernal code of this method is Runtime.getRuntime().gc();
			Runtime.getRuntime().gc();//method-2// hence it's recommanded to call gc using Runtime class than system class
				
	}
	
	public static void communicateWithJVM(){
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().maxMemory());

	}
}
