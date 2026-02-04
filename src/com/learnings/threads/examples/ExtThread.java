package com.learnings.threads.examples;

class Child extends Thread{

    public Child(String name, int priority){
        super(name);
        this.setPriority(priority);
        this.start();
    }

    // this is the CPU where the task is available
    @Override
    public void run() {
        System.out.println("Name " + Thread.currentThread().getName());
        System.out.println("Hello ");
    }
}

public class ExtThread {
    public static void main(String[] args) {
        /*Child child1 = new Child();
        child1.setName("child-1");
        child1.setPriority(8);
        child1.start();

        Child child2 = new Child();
        child2.setName("child-2");
        child2.setPriority(6);
        child2.start();

        Child child3 = new Child();
        child3.setName("child-3");
        child3.setPriority(5);
        child3.start();*/

        Child child1 = new Child("child-1", 6);
        Child child2 = new Child("child-2", 3);
        Child child3 = new Child("child-3", 9);
    }
}
