package com.learnings.threads.multithreading.sync2;

// tasks to be performed - book tickets by calling TicketBooking class
public class Counter implements Runnable{

    String passengerName;
    int noOfTickets;
    TicketBooking booking;
    Thread t;

    public Counter(String passengerName, int noOfTickets, TicketBooking booking) {
        super();
        this.passengerName = passengerName;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        // create a thread
        t = new Thread(this, passengerName);
        t.start();
    }

    @Override
    public void run() {
        synchronized (booking) {
            System.out.println("Welcome to Online Ticket Booking");
            System.out.println("Hello " + Thread.currentThread().getName());
            double amount = booking.bookTicket(passengerName, noOfTickets);
            System.out.println("Payment: " + amount);
            System.out.println("Ticket Booked Successfully");
        }
        System.out.println();
    }
}
