package com.zjx.test.collection;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
    public static void main(String[] args) {
        // Creating a SynchronousQueue
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        // Creating producer and consumer threads
        Thread producer = new Thread(() -> {
            try {
                String data = "Hello from Producer";
                System.out.println("Producer is putting data: " + data);
                // This will block until a consumer takes the data
                synchronousQueue.put(data);
                System.out.println("Producer has put data");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                // This will block until a producer puts data
                System.out.println("Consumer is taking data: " + synchronousQueue.take());
                System.out.println("Consumer has taken data");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Starting the threads
        producer.start();
        consumer.start();
    }
}
