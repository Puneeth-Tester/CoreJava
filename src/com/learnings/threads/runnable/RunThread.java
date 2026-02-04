package com.learnings.threads.runnable;

class Runner implements Runnable{

    @Override
    public void run() {
        // task to be performed
        System.out.println("Name " + Thread.currentThread().getName());
        System.out.println("Hello ");
    }
}

public class RunThread {

    public static void main(String[] args) {
        // interface ref = implementation class
        Runnable runner = new Runner();
        // Thread is the worker to perform the task
        Thread t = new Thread(runner, "my-thread1");
        t.start();
        System.out.println(t);
        t = new Thread(runner);
        t.start();
        t = new Thread(() -> {
            System.out.println("using lambda");
            System.out.println("This is my task");
        }, "poppy");
        t.start();
    }
}
