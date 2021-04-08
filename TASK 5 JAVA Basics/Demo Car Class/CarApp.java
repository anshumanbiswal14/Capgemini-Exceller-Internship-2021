package com.practice.capg;

public class CarApp {
	public static void main(String[] args) {
		
		CarClassDemo bmw = new CarClassDemo();
		CarClassDemo hector = new CarClassDemo();
		CarClassDemo tata = new CarClassDemo();
		CarClassDemo hyundai = new CarClassDemo();
		CarClassDemo dodge = new CarClassDemo();
		
		
		bmw.setCarName("BMW X5");
		bmw.setChasisNumber(2329865);
		bmw.setMileage(24.34f);
		bmw.setModelNumber(2020);
		bmw.setModeofTrans("Auto Transmission");
		bmw.setPrice(23_00_000);
		bmw.setSalesman("Anshuman");
		
		bmw.changePrice();
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getPrice()+"\n"+
		bmw.getCarName()+"\n"+
		bmw.getModeofTrans());
		
		
		
		
		
	}

}
