package com.learnings.threads.runnable;

class MyTask implements Runnable{

    @Override
    public void run() {

    }
}

public class RunMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Interest to be paid " +bank.calcInterest("Raju", 10000));
        System.out.println();
        System.out.println("Interest to be paid " +bank.calcInterest("Roni", 20000));
        System.out.println();
        System.out.println("Interest to be paid " +bank.calcInterest("Nandu", 30000));
    }
}
