package org.mnr.interview;

import java.util.concurrent.LinkedBlockingQueue;
@SuppressWarnings("rawtypes")
public class ObservingConsumer implements Runnable {
    
    private LinkedBlockingQueue queue;
    private Producer producer;
    
    public ObservingConsumer(LinkedBlockingQueue queue, Producer producer) {
        this.queue = queue;
        this.producer = producer;
    }

    @Override
    public void run() {
        
        // As long as the producer is running,
        // we want to check for elements.
        while (producer.isRunning()) {
            System.out.println("OC\tElements right now: " + queue);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("OC Completed.");
        System.out.println("Final elements in the queue: " + queue);
    }
}
