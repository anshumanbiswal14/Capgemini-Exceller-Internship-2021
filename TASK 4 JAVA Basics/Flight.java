package day5p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Flight {

	private String flightNumber;
	private String airliner;

	private String source;
	private LocalDateTime flyDateTime;

	private String destination;
	private LocalDateTime arrivalDateTime;

	private Hault[] hault; // can be null;

	private boolean flyType; // domestic (false) or international(true)
	private int internationFlyTax;

	private int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private int finalCost;// based on Airliner calendar and other criteria's
	
	private double holiday_tax ;
	private double time_tax ;
	private double non_friendly_tax = 0.0f;
	public 	Flight(String flightNumber, 
			String airliner, 
			String source, 
			LocalDateTime flyDateTime, 
			String destination,
			LocalDateTime arrivalDateTime,  
			boolean flyType, 
			int internationFlyTax, 
			int baseFare) {
		super();
		this.flightNumber = flightNumber;
		this.airliner = airliner;
		this.source = source;
		this.flyDateTime = flyDateTime;
		this.destination = destination;
		this.arrivalDateTime = arrivalDateTime;
		
		this.flyType = flyType;
		this.internationFlyTax = internationFlyTax;
		this.baseFare = baseFare;

	}

	public Flight() {
		super();

	}

	// Holiday check
	public float checkHoliday(LocalDateTime arrivalDateTime) {
		float percentage = 0.0f;
		for (LocalDate hd : AirlinerCalendar.listOfHolidays) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String holiday = formatter.format(hd);
			long noOfDaysBetween = ChronoUnit.DAYS.between(arrivalDateTime.toLocalDate(), LocalDate.parse(holiday));
			if (noOfDaysBetween <= 10 && noOfDaysBetween >= 2) {
				percentage = 0.2f;
			} else if (noOfDaysBetween <= 1 && noOfDaysBetween >= 0) {
				percentage = 0.5f;
			}
		}
		return percentage;

	}

	// Time Check
	public float checkTime(LocalDateTime arrivalDateTime) {
		float percentage = 0.0f;
		LocalTime flight_time = arrivalDateTime.toLocalTime();

		LocalTime afternoon = LocalTime.parse("12:00");
		long hours = ChronoUnit.HOURS.between(flight_time, afternoon);
		if (hours <= 2 && hours >= -2) {
			percentage = 0.1f;
		}
		return percentage;

	}

	// country check
	public boolean checkCountry(String destination) {
		for (String c : FriendlyCountry.countries) {
			if (this.destination == c) {
				return true;
			}
		}
		return false;
	}

	public int calculateCost() {
		/*
		 * Cost of the flight will be decided by 1. arrival date. :- 1.a) If 10 to 2
		 * days prior to the AirlinerCalendar Date :- 20% extra 1.b) If 1 to 0 day prior
		 * to the AirlinerCalendar Date :- 50% extra 2. arrival time. 2.a) If flight
		 * land time is 2 hr +/- to 12:00 Noon (Any Date) :- 10% extra 3. Non free
		 * travel countries (List of FriendlyCountry.java) 3.a) If destination belongs
		 * to non free travel, friendly country :- 30% extra
		 */
		 holiday_tax = this.baseFare * checkHoliday(arrivalDateTime);
		 time_tax = this.baseFare * checkTime(arrivalDateTime);
		 non_friendly_tax = 0.0f;
		if (!checkCountry(destination)) {
			non_friendly_tax = (this.baseFare) * (0.3);
		}
		this.finalCost = (int) (this.baseFare + holiday_tax + time_tax + non_friendly_tax);
		return finalCost;
	}

	public double getHoliday_tax() {
		return holiday_tax;
	}

	public void setHoliday_tax(double holiday_tax) {
		this.holiday_tax = holiday_tax;
	}

	public double getTime_tax() {
		return time_tax;
	}

	public void setTime_tax(double time_tax) {
		this.time_tax = time_tax;
	}

	public double getNon_friendly_tax() {
		return non_friendly_tax;
	}

	public void setNon_friendly_tax(double non_friendly_tax) {
		this.non_friendly_tax = non_friendly_tax;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirliner() {
		return airliner;
	}

	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}

	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Hault[] getHault() {
		return hault;
	}

	public void setHault(Hault[] hault) {
		this.hault = hault;
	}

	public boolean isFlyType() {
		return flyType;
	}

	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}

	public int getInternationFlyTax() {
		return internationFlyTax;
	}

	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}

	public int getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}

	public int getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}

}
