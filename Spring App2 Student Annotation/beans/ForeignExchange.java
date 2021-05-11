package com.capg.student.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ForeignExchange extends Address {
	
	@Value("AM-8989-67543-87667")
	private String ssn;

	
	public ForeignExchange() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ForeignExchange(String ssn) {
		super();
		this.ssn = ssn;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	@Override
	public String toString() {
		return "ForeignExchange [ssn=" + ssn + "]";
	}
}
	