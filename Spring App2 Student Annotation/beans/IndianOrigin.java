package com.capg.student.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IndianOrigin extends Address {
	
	@Value("560093")
	private int pinCode;

	public IndianOrigin() {
		super();
		
	}

	
	public IndianOrigin(String houseNumber, String streetName, String stateName, String countryName) {
		super(houseNumber, streetName, stateName, countryName);
		
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return "IndianOrigin [pinCode=" + pinCode + "]";
	}
	
	
	
	

}
