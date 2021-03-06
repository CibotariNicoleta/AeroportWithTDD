package com.pluralsight.airport;

public class Airport {
	public static void main(String[] args) {
		Flight economyFlight  = new Flight("1", "Economy");
		Flight businessFlight  = new Flight("2", "Business");
		
		Passenger john = new Passenger("John", true);
		Passenger mike = new Passenger("John", false);
		
		businessFlight.addPassenger(john);
		businessFlight.removePassenger(john);
		businessFlight.addPassenger(mike);
		economyFlight.addPassenger(mike);
		
		
		System.out.println("Business flight passengers list:");
		for(Passenger passenger: businessFlight.getPassengerList())
			System.out.println(passenger.getName());
		
		
		System.out.println("Economy flight passengers list:");
		for(Passenger passenger: economyFlight.getPassengerList())
			System.out.println(passenger.getName());
		
	}

}
