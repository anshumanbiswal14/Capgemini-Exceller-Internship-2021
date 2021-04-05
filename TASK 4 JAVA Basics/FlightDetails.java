package day5p1;

public class FlightDetails {

	public void printFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("Flight Number:\t"+flight.getFlightNumber());
		System.out.println("Airliner:\t"+flight.getAirliner());
		System.out.println("Destination:\t "+flight.getDestination());
		System.out.println("Arrival \t"+flight.getSource());
		System.out.println("Date and time \t"+flight.getArrivalDateTime());
		System.out.println("Haults:-");
		for(Hault ht:flight.getHault()) {
			System.out.println("\t\tAirport: "+ht.getAirportName());
			System.out.println("\t\tDuration:"+ht.getDuration());
		}
		System.out.println("<---------------------Total Fare------------------>");
		
		System.out.println(" Base Fare:\t\t"+flight.getBaseFare());
		System.out.println(" Airport Surge:\t\t"+(flight.getBaseFare())*.05);
		System.out.println(" Fule Charges:\t\t"+(flight.getBaseFare())*.3);
		System.out.println(" Holiday tax:\t\t"+flight.getHoliday_tax());
		System.out.println(" Surge time:\t\t"+flight.getTime_tax());
		System.out.println(" Internation Tax:\t"+flight.getNon_friendly_tax());
		System.out.println("---------------------------------------------------------");
		System.out.println(" Final Fare:\t\t"+flight.getFinalCost());
		
	}
}