package day2p3;

public class StockTrackingApp {

	public static void main(String[] args) {
		
		
		
		Stock InfosysIndia = new Stock();
		Stock Apple = new Stock();
		Stock TataMotors = new Stock();
		
		InfosysIndia.setStockName("InfosysIndia");
		System.out.println(InfosysIndia.getStockName()); // display the name .
		
		InfosysIndia.setStockPrice(1300);
		System.out.println(InfosysIndia.getStockPrice()); // display the price .
		
		TataMotors.setStockName("TataMotors");
		System.out.println(TataMotors.getStockName()); // display the name .
		
		TataMotors.setStockPrice(1100);
		System.out.println(TataMotors.getStockPrice()); // display the price .
		
		Apple.setStockName("Apple");
		System.out.println(Apple.getStockName()); // display the name .
		
		Apple.setStockPrice(1900);
		System.out.println(Apple.getStockPrice()); // display the price .
		
		InfosysIndia.changePrice(10,true);
		System.out.println("UPDATED STOCK PRICE !");
		System.out.println(InfosysIndia.getStockPrice()); // call price change method 
		
	
		
		
		
		// display the stock details again
	}

}