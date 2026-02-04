package com.learnings.threads.examples;

public class DemoEx {
    public static void main(String[] args) {
        Thread t = new Thread("mythread-1");
        Thread t1 = new Thread();
        t1.setName("mythread-2");
        t.setPriority(10);
        Thread t2 = new Thread();
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        t.start();
        t1.start();
        t2.start();
    }
}
