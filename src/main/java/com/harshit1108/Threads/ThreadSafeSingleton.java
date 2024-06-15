package com.harshit1108.Threads;

import java.util.ArrayList;
import java.util.List;

/*
Implement a thread-safe singleton class in Java using double-checked locking.

 */
public class ThreadSafeSingleton {
        private static  ThreadSafeSingleton instance;

        private ThreadSafeSingleton() {
            // Private constructor to prevent instantiation from outside the class.
        }

        public static ThreadSafeSingleton getInstance() {
            // Double-checked locking to ensure thread safety and avoid unnecessary synchronization.
            if (instance == null) {
//                synchronized (ThreadSafeSingleton.class) {
//                    if (instance == null) {
                        instance = new ThreadSafeSingleton();
                    }
//                }
//            }
            return instance;
        }

        // Other methods and properties of the singleton class can be added here.


    public static void main(String[] args) {
//

        int numThreads = 1000;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
                System.out.println("Thread " + Thread.currentThread().getId() + ": " + instance);
            });
           thread.start();
           threads.add(thread);
        }
//
//        for (Thread thread : threads) {
//            thread.start();
//        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

/*Thread 20: Threads.ThreadSafeSingleton@3d4c2f10
Thread 92: Threads.ThreadSafeSingleton@3d4c2f10
Thread 68: Threads.ThreadSafeSingleton@3d4c2f10
Thread 56: Threads.ThreadSafeSingleton@3d4c2f10
Thread 73: Threads.ThreadSafeSingleton@3d4c2f10
Thread 30: Threads.ThreadSafeSingleton@3d4c2f10
Thread 35: Threads.ThreadSafeSingleton@3d4c2f10
Thread 64: Threads.ThreadSafeSingleton@3d4c2f10
Thread 34: Threads.ThreadSafeSingleton@3d4c2f10*/
