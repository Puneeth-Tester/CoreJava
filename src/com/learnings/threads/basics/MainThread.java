package com.learnings.threads.basics;

public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("poppy");
        t.setPriority(Thread.MAX_PRIORITY-2);
        System.out.println(t);
        System.out.println(t.getName());
        int x=10/0;
    }

}
