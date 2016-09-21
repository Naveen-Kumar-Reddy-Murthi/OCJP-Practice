package org.mnr.garbagecollection_16;

public class Finalization {
	static Finalization f;
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Garbage Collector by default calls finalize method to perform 
		 * cleanup activities before destroying the class
		 * 
		 */
		
		System.out.println("check1");
		Finalization fin	=	new Finalization();
		System.out.println(fin.hashCode());
		fin=null;
//		fin.finalize();//here exception will be thrown
		System.gc();
		System.out.println("check2");
		Thread.sleep(2000);
		System.out.println(f.hashCode()); 
		f=null;
		Runtime.getRuntime().gc();
		Thread.sleep(2000);
		System.out.println("after sleep");

	}
	
	protected void finalize(){//this is like any other method in java, can be called manually too
		//finalize methods gets called only once per object by jvm but not any more
		System.out.println("in finalize method");//this printed when statement the class is executed
		//If there is any uncaught exception in here, jvm will dodge that exception
		//but if this method is called normally by programmer, then exception is thrown and program ends abnormally
		//System.out.println(0/0);//no uncaught exception is thrown by JVM when it calls this after gcing 
		// it dodges the exception and won't execute the subsequent statements
		System.out.println("after exception");
		f=this;
		System.out.println("after assigning this to f");
		GCLimitations();
	}
	
	private static void GCLimitations(){
		
		System.out.println("Can't know when Gc runs");
		System.out.println("Order in which GC identifies eligible objects for gcing");
		System.out.println("Order in which GC destroyes the objects");
		System.out.println("Whether GC destroys all eligible objects or not");
		System.out.println("Algorithm followed by GC");
		System.out.println("GC implementaiton varies from jvm to jvm");
		System.out.println("Most of the GCs follow mark and sweep algorithm");
	}

}
