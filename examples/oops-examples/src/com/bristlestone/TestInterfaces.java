package com.bristlestone;

interface TicketBooking {
	void bookTicket(); // public abstract void bookTicket
	void printTicket(); // public abstract void printTicket
}
class RailwayTicketBooking implements TicketBooking {
	@Override
	public void bookTicket() {
		System.out.println("bookTicket() for Trains with a offers with free meals for everyone");
	}
	@Override
	public void printTicket() {
		System.out.println("printTicket() for Trains");
	}
	
}
class FlightTicketBooking implements TicketBooking {
	@Override
	public void bookTicket() {
		System.out.println("bookTicket() for Flight with a discount of 10%, 20% based on the credit card type");
	}
	@Override
	public void printTicket() {
		System.out.println("printTicket() for Flight");
	}
	
}
public class TestInterfaces {
	// Client code
	public static void main(String[] args) {
		RailwayTicketBooking railway = new RailwayTicketBooking();
		FlightTicketBooking flight = new FlightTicketBooking();
		ticketApp(railway); // user1 wants to book & print - train
		ticketApp(flight); // user2 wants to book & print - flight
	}
	// developer1 code that calls bookTicket & printTicket
	public static void ticketApp(TicketBooking ticket) {
		ticket.bookTicket();
		ticket.printTicket();
		System.out.println("--------------------------------");
	}
}
