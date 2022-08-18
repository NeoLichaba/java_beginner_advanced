package com.example;

public class CountRunnable implements Runnable {

    final int count;
    final String threadName;

    // Setup Constructor to initialize variables
    public CountRunnable(int count, String name) {
        this.count = count;
        this.threadName = name;
    }

    public void run() {
        // Count with for loop to print out the thread name and each number counted
        for (int i = 1; i<= count; i++ ){
            System.out.println("Thread " + threadName + ":" + i);
        }
    }
}
