package org.mnr.interview;

import java.util.concurrent.LinkedBlockingQueue;
@SuppressWarnings("rawtypes")
public class Producer implements Runnable {
    
    private LinkedBlockingQueue queue;
    private boolean running;
    
    
	public Producer(LinkedBlockingQueue queue) {
        this.queue = queue;
        running = true;
    }
    
    // We need to check if the producer thread is
    // Still running, and this method will return
    // the state (running/stopped).
    public boolean isRunning() {
        return running;
    }


	@SuppressWarnings("unchecked")
	@Override
    public void run() {
        
        // We are adding elements using put() which waits
        // until it can actually insert elements if there is
        // not space in the queue.
        for (int i = 0; i < 15; i++) {
            String element = "String" + i;

            try {
                queue.put(element);
                System.out.println("P\tAdding element: " + element);
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("P Completed.");
        running = false;
    }

}