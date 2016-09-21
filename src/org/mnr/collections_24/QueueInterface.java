package org.mnr.collections_24;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueInterface {

	public static void main(String[] args) {
		/**
		 * It is the child interface of Collection
		 * Queue follows First in First Out algorithm
		 * Methods:
		 * 1. boolean offer(Object o)
		 * 2. Object peek()
		 * 3. Object element()
		 * 4. Object poll()
		 * 5. Object remove()
		 */
		PriorityQueueDemo();
	}
	
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void PriorityQueueDemo(){
		/**
		 * ds: Queue
		 * used to represent a group of objects prior to processing  and according to 
		 * some priority
		 * Duplicate objects are not allowed
		 * insertion order won't be preserved and it is according to some order
		 * This priority can be default or customized order
		 * null insertion is not possible 
		 */
		
//		PriorityQueue	queue	=	new PriorityQueue(10,new IntegerComparator());
//		
//		for(int i=0;i<=10;i++)
//			queue.offer(i);
//		System.out.println(queue);
//		
//		PriorityQueue	queue1	=	new PriorityQueue(10,new StringComparator());
//		
//			queue1.offer("A");
//			queue1.offer("Z");
//			queue1.offer("L");
//			queue1.offer("B");
//			System.out.println(queue1);
//			System.out.println(queue1.poll());//returns null if queue is empty
//			System.out.println(queue1.remove());//java.util.NoSuchElementException if queue is empty
//			System.out.println(queue1);
			//natural ordering example of priority queue
			Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
			Random rand = new Random();
			for(int i=0;i<7;i++){
				integerPriorityQueue.add(new Integer(rand.nextInt(100)));
			}
			System.out.println(integerPriorityQueue);
			for(int i=0;i<7;i++){
				Integer in = integerPriorityQueue.poll();
				System.out.println("Processing Integer:"+in);
			}
			
			//PriorityQueue example with Comparator
			Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
			addDataToQueue(customerPriorityQueue);
			
			pollDataFromQueue(customerPriorityQueue);
		
	}
	
	//Comparator anonymous class implementation
		public static Comparator<Customer> idComparator = new Comparator<Customer>(){
			
			@Override
			public int compare(Customer c1, Customer c2) {
	            return (int) (c1.getId() - c2.getId());
	        }
		};

		//utility method to add random data to Queue
		private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
			Random rand = new Random();
			for(int i=0; i<7; i++){
				int id = rand.nextInt(100);
				customerPriorityQueue.add(new Customer(id, "Pankaj "+id));
			}
		}
		
		//utility method to poll data from queue
		private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
			while(true){
				Customer cust = customerPriorityQueue.poll();
				if(cust == null) break;
				System.out.println("Processing Customer with ID="+cust.getId());
			}
		}
	
	public static void BlockingQueueDemo(){
		/**
		 * Blocking queue is an Interface which has following implementations
		 * ArrayBlockingQueue is backed by array  and Queue impose orders as FIFO. 
		 * Head of the queue is the oldest element in terms of time and tail of the
		 * queue is youngest element.
		 * 1. ArrayBlockingQueue
		 * 2. LinkedBlockingQueue
		 * Both are similar except for one difference
		 * While ArrayBlockingQueue is bounded(fixed size, must be provided while initialization)
		 * LinkedBlockingQueue is not bounded. It can be bounded by specifying size
		 * In terms of throughput, LinkedBlockingQueue is much efficient
		 */
		
	}

}

class IntegerComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return ((Integer) o1).compareTo((Integer)o2);
	}
}

class StringComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1	=	o1.toString();
		String s2	=	o2.toString();
		return s1.compareTo(s2);
	}
}

class Customer {
	
	private int id;
	private String name;
	
	public Customer(int i, String n){
		this.id=i;
		this.name=n;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}