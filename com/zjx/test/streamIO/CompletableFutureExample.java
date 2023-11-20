package com.zjx.test.streamIO;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> futureResult = CompletableFuture.supplyAsync(() -> {
            // Simulate a time-consuming task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed!";
        });

        // Attach a callback to handle the result when it's available
        futureResult.thenAccept(result -> System.out.println(result));

        // Block and wait for the result (not recommended in practice)
        futureResult.get();
    }
}
