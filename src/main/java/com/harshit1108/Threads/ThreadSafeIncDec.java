package com.harshit1108.Threads;


import java.util.concurrent.atomic.AtomicInteger;

/*
 Implement a thread-safe counter class in Java that supports increment and decrement operations.
 Multiple threads should be able to increment and decrement the counter concurrently without any race conditions.

 */
public class ThreadSafeIncDec {

    /*When we increase the loop to 10000 that time the final result will not zero*/
//    private static volatile int  count = 0;


    public static void main(String[] args) {

        /*Using AtomicInteger we can implement thread safe counter class*/
        AtomicInteger counter = new AtomicInteger(0);

        Runnable incrementTask = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10000;i++){
//                    count++;
                    counter.incrementAndGet();
                }
            }
        };

        Runnable decrementTask = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10000;i++){
//                    count--;
                    counter.decrementAndGet();
                }
            }
        };

       Thread increment = new Thread(incrementTask);
       Thread decrement = new Thread(decrementTask);

       increment.start();
       decrement.start();

       try {
           increment.join();
           decrement.join();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

//        System.out.println("Final count = "+count);
        System.out.println("Final count = "+counter.get());
    }
}


