package com.learnings.threads.multithreading.sync2;

public class Passenger {
    public static void main(String[] args) {
        // share one ticket booking object
        TicketBooking booking = new TicketBooking(200, 20);

        // each passenger goes to separate counters
        Counter counter1 = new Counter("Raju", 2, booking);
        Counter counter2 = new Counter("Nandhu", 10, booking);
        Counter counter3 = new Counter("Ria", 5, booking);

        try {
            counter1.t.join();
            counter2.t.join();
            counter3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task completed");
    }
}
