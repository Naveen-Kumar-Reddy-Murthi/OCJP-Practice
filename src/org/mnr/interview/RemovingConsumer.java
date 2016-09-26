package org.mnr.interview;

import java.util.concurrent.LinkedBlockingQueue;
@SuppressWarnings("rawtypes")
public class RemovingConsumer implements Runnable {
    private LinkedBlockingQueue queue;
    private Producer producer;
    
    public RemovingConsumer(LinkedBlockingQueue queue, Producer producer) {
        this.queue = queue;
        this.producer = producer;
    }

    @Override
    public void run() {
        
        // As long as the producer is running,
        // we remove elements from the queue.
        while (producer.isRunning()) {
            
            try {
                System.out.println("RC\tRemoving element: " + queue.take());
                
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("RC completed.");
    }
}