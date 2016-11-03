package org.mnr.interview.threads;

public class T2_ExecutingThreadsInOrder {

	public static void main(String[] args) throws InterruptedException {
		
		
		class Thread1 extends Thread{
			private String name;
			Thread1(String name){
					this.name=name;
			}
			@Override
			public void run() {
				for(int i=0;i<=10;i++){
					
					System.out.println(this.name+"||"+i);
				}
			}
			
		}
			
			Thread1 t1 = new Thread1("T1");
			Thread1 t2 = new Thread1("T2");
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			System.out.println("end of main method");
		
	}

}
