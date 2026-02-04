package com.learnings.threads.multithreading.nonsync;

class TaskRunner implements Runnable{

    String name;
    double amount;
    Bank bankObj;

    public TaskRunner(String name, double amount, Bank bankObj) {
        super();
        this.name = name;
        this.amount = amount;
        this.bankObj = bankObj;
        Thread t = new Thread(this, name);
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Welcome " + Thread.currentThread().getName());
        // all threads are sharing the same object
        // call the method of Bank
        double interest = bankObj.calcInterest(name, amount);
        System.out.println("Interest to be paid: " + interest);
    }
}
public class RunDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        // these are simple java objects
        TaskRunner runner1 = new TaskRunner("Raju", 10000, bank);
        TaskRunner runner2 = new TaskRunner("Roni", 20000, bank);
        TaskRunner runner3 = new TaskRunner("Nandhu", 30000, bank);
    }
}
