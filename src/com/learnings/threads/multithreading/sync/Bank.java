package com.learnings.threads.multithreading.sync;

public class Bank {

    double calcInterest(String name, double amount){
        System.out.println("Welcome to ABC Bank " + name);
        System.out.println("Calculating interest for " + amount);
        double interest = amount * 5 * 2/100;
        try {
            //leaves the CPU and holds the lock on the object
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Interest: " + interest);
        return interest;
    }
}
