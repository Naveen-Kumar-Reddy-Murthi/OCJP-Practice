package org.mnr.collections_24;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * BlockingQueue is a unique collection type which not only store elements but also
 * supports flow control by introducing blocking if either BlockingQueue is full or
 * empty. take() method of BlockingQueue will block if Queue is empty and put() method
 * of BlockingQueue will block if Queue is full.
 */
public class BlockingQueueProducerConsumerExample {

	public static void main(String[] args) {
		BlockingQueue<Message> queue	= new	LinkedBlockingQueue<Message>(10);
		Producer producer 	=	new Producer(queue);
		Consumer consumer	=	new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("Producer-Consumer service has been started");
	}

}

class Message{
	private String message;
	Message(String message){
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
}

class Producer implements Runnable{

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue){
		this.queue=queue;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			Message message	=	new Message("Message-"+i);
			try {
				Thread.sleep(i);
				queue.put(message);
				System.out.println("Produced:"+message.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		Message message	=	new Message("exit");
		try {
			queue.put(message);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}

class Consumer implements Runnable{
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue){
		this.queue=queue;
	}

	@Override
	public void run() {
		Message message;
		try {
			while((message=queue.take()).getMessage()!="exit"){
				Thread.sleep(10);
				System.out.println("Consumed:"+message.getMessage());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}