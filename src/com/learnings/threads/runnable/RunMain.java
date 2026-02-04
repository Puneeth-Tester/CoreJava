package com.learnings.threads.runnable;

class MyTask implements Runnable{

    @Override
    public void run() {
        Bank bank = new Bank();
        String name = Thread.currentThread().getName();
        double interest = bank.calcInterest(name, 10000);
        System.out.println("Interest to be paid: " + interest);
    }
}

public class RunMain {
    public static void main(String[] args) {
        Runnable task = new MyTask();
        Thread t1 = new Thread(task, "Raju");
        Thread t2 = new Thread(task, "Roni");
        Thread t3 = new Thread(task, "Nandu");
        t1.start();
        t2.start();
        t3.start();

    }
}
