package com.practice.capg;

public class CarClassDemo {
	
	private int modelNumber;
	private double ChasisNumber;
	private String CarName;
	private float Mileage;
	private float Price;
	private String ModeofTrans;
	private String salesman;
	
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setChasisNumber(double chasisNumber) {
		ChasisNumber = chasisNumber;
	}
	public double getChasisNumber() {
		return ChasisNumber;
	}
	public void setChasisNumber(int chasisNumber) {
		ChasisNumber = chasisNumber;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public float getMileage() {
		return Mileage;
	}
	public void setMileage(float mileage) {
		Mileage = mileage;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getModeofTrans() {
		return ModeofTrans;
	}
	public void setModeofTrans(String modeofTrans) {
		ModeofTrans = modeofTrans;
		
	}

	
	
	// adding business method here -------
	public void changePrice() {
		// TODO Auto-generated method stub
		
		this.Price = 24_00_000;
		System.out.println("price is updated !");
	
	}

	

}
