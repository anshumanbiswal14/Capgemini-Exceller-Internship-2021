package com.capg.student.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class Address {
	
	@Value("CAS-11")
	private String houseNumber;
	
	@Value("CV Raman Nagar")
	private String streetName;
	
	@Value("Karnataka")
	private String stateName;
	
	@Value("India")
	private String countryName;

	
	public Address() {
		super();
		
	}


	public Address(String houseNumber, String streetName, String stateName, String countryName) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.stateName = stateName;
		this.countryName = countryName;
	}


	public String getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", streetName=" + streetName + ", stateName=" + stateName
				+ ", countryName=" + countryName + "]";
	}
	

}
