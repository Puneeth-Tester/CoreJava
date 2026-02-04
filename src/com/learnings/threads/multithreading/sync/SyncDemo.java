package com.learnings.threads.multithreading.sync;

class NewTask implements Runnable{
    String name;
    double amount;
    Bank bankObj;

    public NewTask(String name, double amount, Bank bankObj) {
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
        synchronized (bankObj){
            System.out.println("Welcome " + Thread.currentThread().getName());
            // all threads are sharing the same object
            // call the method of Bank
            double interest = bankObj.calcInterest(name, amount);
            System.out.println("Interest to be paid: " + interest);
        }
        System.out.println();
    }
}
public class SyncDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        // these are simple java objects
        NewTask runner1 = new NewTask("Puneeth", 10000, bank);
        NewTask runner2 = new NewTask("Deva", 20000, bank);
        NewTask runner3 = new NewTask("Athiran", 30000, bank);
    }
}
