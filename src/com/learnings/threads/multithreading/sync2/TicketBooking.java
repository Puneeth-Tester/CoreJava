package com.learnings.threads.multithreading.sync2;

public class TicketBooking {

    private double costPerTicket;
    private int availableTickets;

    public TicketBooking(double costPerTicket, int availableTickets) {
        super();
        this.costPerTicket = costPerTicket;
        this.availableTickets = availableTickets;
    }

    public double bookTicket(String passengerName, int noOfTickets){
        System.out.println("Booking done for: " + passengerName);
        System.out.println("Tickets to be Booked: " + noOfTickets);
        if(noOfTickets>availableTickets)
            throw new RuntimeException("Tickets are not available");
        // connect to db
        // check no. of tickets
        // check category
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double amountToBePaid = costPerTicket * noOfTickets;
        availableTickets = availableTickets - noOfTickets;
        System.out.println("Total amount to be paid: " + amountToBePaid);
        return amountToBePaid;
    }
}
