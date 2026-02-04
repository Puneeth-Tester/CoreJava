package com.learnings.threads.basics;

public class SleepDemo {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("Hello " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // When you call a sleep method on Thread instance,
        // it leaves the CPU but holds the object on which it is called.
    }
}
