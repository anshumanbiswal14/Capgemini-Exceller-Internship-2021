package day5p1;

import java.time.format.DateTimeFormatter;

public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		/* Write code to print the flight information and fare break up*/
		System.out.println("The Flight Information is as follows:");
		System.out.println();
		System.out.println("Flight Number: " + flight.getFlightNumber());
		System.out.println("Airliner: " + flight.getAirliner());
		System.out.println("From: " + flight.getSource());
		System.out.println("Travel Date & Time: " + flight.getFlyDateTime().format(format));
		System.out.println("To: " + flight.getDestination());
		System.out.println("Arrival Date & Time: " + flight.getArrivalDateTime().format(format));
		System.out.println("Travel type (International = true, Domestic = false): " + flight.isFlyType());
		System.out.println("The Halts are: ");
		for(Halt hault : flight.getHalt()) {
			System.out.println("Airport Name: " + hault.getAirportName());
			System.out.println("Duration (In Minutes): " + hault.getDuration());
		}
		System.out.println();
		System.out.println("The Flight costing is as follows:");
		System.out.println();
		System.out.println("Base Fare: " + flight.getBaseFare());
		System.out.println("Airport Surcharge: " + flight.getAirportSurcharge());
		System.out.println("Fuel Cost: " + flight.getFuelCost());
		System.out.println("International Travel Tax: " + flight.getInternationalFlyTax());
		System.out.println("Holiday Tax: " + flight.getHolidayTax());
		System.out.println("Time Tax: " + flight.getTimeTax());
		System.out.println("Non-Friendly Country Travel Tax: " + flight.getNonFriendlyTax());
		System.out.println("--------------------------------------------------------------");
		System.out.println("Final Cost: " + flight.getFinalCost());
	}

}